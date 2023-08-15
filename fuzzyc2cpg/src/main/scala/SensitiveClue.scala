package io.shiftleft.joern

import java.io.File
import java.nio.file.Paths

import gremlin.scala._
import io.shiftleft.codepropertygraph.generated.{EdgeTypes, NodeKeys, NodeTypes, nodes}
import io.shiftleft.fuzzyc2cpg.FuzzyC2Cpg
import io.shiftleft.Implicits.JavaIteratorDeco

import scala.collection.mutable.Map
import scala.util.control.Breaks._
import scala.collection.mutable.ArrayBuffer
import scala.xml._
import io.shiftleft.semanticcpg.utils.{ExpandTo, MemberAccess}
import io.shiftleft.semanticcpg.language._
import org.apache.tinkerpop.gremlin.structure.Direction

object SensitiveClue {
  private def methodFast(dataFlowObject: Vertex): nodes.Method = {
    val method =
      dataFlowObject.label match {
        case NodeTypes.METHOD_RETURN =>
          ExpandTo.methodReturnToMethod(dataFlowObject)
        case NodeTypes.METHOD_PARAMETER_IN =>
          ExpandTo.parameterInToMethod(dataFlowObject)
        case NodeTypes.METHOD_PARAMETER_OUT =>
          ExpandTo.parameterInToMethod(dataFlowObject)
        case NodeTypes.LITERAL | NodeTypes.CALL | NodeTypes.IDENTIFIER | NodeTypes.RETURN | NodeTypes.UNKNOWN =>
          ExpandTo.expressionToMethod(dataFlowObject)
      }
    method.asInstanceOf[nodes.Method]
  }

  private def getFiles(inputs:File*) : Seq[File] = {
    inputs.filter(_.isFile) ++
      inputs.filter(_.isDirectory).flatMap(dir => getFiles(dir.listFiles(): _*))
  }

  private def generateCPG(input:String, output:String) = {
    val inputFilename = Set(input)
    val fuzzyc2Cpg = new FuzzyC2Cpg(output)
    fuzzyc2Cpg.runAndOutput(inputFilename, Set(".java"))
    //Cpg2Scpg.run(output, true, "joern-cli/src/main/resources/default.semantics")
  }

  private def isOperationAndAssignment(vertex: Vertex): Boolean = {
    if (!vertex.isInstanceOf[nodes.Call]) {
      return false
    }

    val name = vertex.value2(NodeKeys.NAME)
    if(name.contains("<operator>") || name.contains("<operators>")){
      true
    }
    else false
  }

  private def isIndirectAccess(vertex: Vertex): Boolean = {
    if (!vertex.isInstanceOf[nodes.Call]) {
      return false
    }

    val callName = vertex.value2(NodeKeys.NAME)
    MemberAccess.isGenericMemberAccessName(callName)
  }

  private class sensitive_clue(paramscount : Int, funcname : String){
    var name : String = funcname
    var called_times : Int = 0
    var params_count : Int = paramscount
    var params : ArrayBuffer[Int] = new ArrayBuffer[Int]()
    var const_params : ArrayBuffer[Int] = new ArrayBuffer[Int]()
    var isVariadic = 0

  }

  private def findparam(node: Vertex, vlist : List[Vertex]): List[Vertex] ={ //for call statement
    var vllist = vlist
    var callname = node.out(EdgeTypes.ARGUMENT).l()
    for(callpart <- callname) {
      //System.out.println(callpart.label + ": " + callpart.value2(NodeKeys.CODE))
      if (callpart.label == NodeTypes.IDENTIFIER) {
        /*
                System.out.print("\t")
                System.out.print("name: " + callpart.value2(NodeKeys.NAME) + "   ")
                System.out.println("type: " + callpart.value2(NodeKeys.TYPE_FULL_NAME))*/
        if(vllist.exists(v => v.value2(NodeKeys.NAME) == callpart.value2(NodeKeys.NAME)) == false){
          vllist = vllist :+ callpart
        }
      }
      if(callpart.label == NodeTypes.CALL){
        vllist = findparam(callpart, vllist)
      }
    }
    vllist
  }

  private def involvedVariable(m : Map[Vertex, List[Vertex]], slist: List[Vertex], stmt: Vertex): (Map[Vertex, List[Vertex]], List[Vertex]) = {
    var sllist = slist
    var newm = m
    var vlist = findparam(stmt, List[Vertex]())
    for(v <- vlist){
      //System.out.println("findparam: " + v.value2(NodeKeys.NAME))
    }
    for(param <- m.keySet){
      for(v <- vlist){
        if(newm(param).exists(node => node.value2(NodeKeys.NAME) == v.value2(NodeKeys.NAME)) == true){
          for(vv <- vlist){
            if(newm(param).exists(node => node.value2(NodeKeys.NAME) == vv.value2(NodeKeys.NAME)) == false){
              newm(param) = newm(param) :+ vv
            }
          }
        }
      }
    }
    var involve = stmt.in(EdgeTypes.REACHING_DEF).l
    if(involve.isEmpty == false){
      //System.out.println("node: " + stmt.value2(NodeKeys.CODE) + "REACHING DEF->")
      for(node <- involve){
        if(sllist.exists(n => n.value2(NodeKeys.CODE) == node.value2(NodeKeys.CODE)) == false){
          //System.out.println(node.value2(NodeKeys.CODE))
          sllist = sllist :+ node
          var res = involvedVariable(newm, sllist, node)
          newm = res._1
          sllist = res._2
        }
      }
    }
    (newm, sllist)
  }



  private def paramIsVerified(variable: Vertex, node: Vertex, flag : Boolean): Boolean ={
    var f = flag
    if(node.label == NodeTypes.IDENTIFIER){
      if(node.value2(NodeKeys.CODE) == variable.value2(NodeKeys.CODE)){
        f = true
        return f
      }
    }
    if(node.label == NodeTypes.CALL){
      var callname = node.out(EdgeTypes.ARGUMENT).l
      for(callpart <- callname) {
        //System.out.println(callpart.value2(NodeKeys.CODE))
        if(callpart.value2(NodeKeys.CODE) == variable.value2(NodeKeys.CODE)){
          f = true
          return f
        }
        if(callpart.label == NodeTypes.CALL){
          f = paramIsVerified(variable, callpart, f)
        }
      }
    }
    f
  }


  private def isVerified(variable: Vertex, node: Vertex, nodeset : Set[Vertex], layer: Int): (Boolean, Set[Vertex]) ={
    var result = false
    var prevs = node.in(EdgeTypes.CFG).l
    var newnodeset = nodeset
    if(layer >= 700){
      return (result, newnodeset)
    }
    for(prev <- prevs){
      if(prev.label == NodeTypes.IDENTIFIER || prev.label == NodeTypes.CALL || prev.label == NodeTypes.LITERAL){
        //System.out.println(prev.value2(NodeKeys.CODE))
        //System.out.println(newnodeset)
        if(newnodeset.exists(s => s == prev) == false){
          newnodeset = newnodeset + prev
          if(prev.in(EdgeTypes.CONDITION).l.isEmpty == false){
            var condition = prev.in(EdgeTypes.CONDITION).l.head
            //System.out.println(condition.value2(NodeKeys.CODE))
            if(paramIsVerified(variable, prev, false) == true){
              //System.out.println("************findVerified*************")
              //System.out.println("Var: " + variable.value2(NodeKeys.CODE) + " VerifyCode: " + condition.value2(NodeKeys.CODE))
              //System.out.println("*************************************")
              result = true
              return (result, newnodeset)
            }
          }
          var res = isVerified(variable, prev, newnodeset, layer + 1)
          newnodeset = res._2
          return res
        }
        else{
          return (result, newnodeset)
        }
      }
    }
    (result, newnodeset)
  }


  def vertexToStr(vertex: Vertex): String = {
    try {
      val methodVertex = ExpandTo.expressionToMethod(vertex)
      val fileName = ExpandTo.methodToFile(methodVertex) match {
        case Some(objFile) => objFile.value2(NodeKeys.NAME)
        case None          => "NA"
      }

      s"${Paths.get(fileName).getFileName.toString}: ${vertex.value2(NodeKeys.LINE_NUMBER).toString} ${vertex.value2(NodeKeys.CODE)}"
    } catch { case _: Exception => "" }
  }

  def toDot(graph: ScalaGraph): String = {
    val buf = new StringBuffer()

    buf.append("digraph g {\n node[shape=plaintext];\n")

    graph.E.hasLabel(EdgeTypes.REACHING_DEF).l.foreach { e =>
      val inV = vertexToStr(e.inVertex).replace("\"", "\'")
      val outV = vertexToStr(e.outVertex).replace("\"", "\'")
      buf.append(s""" "$outV" -> "$inV";\n """)
    }
    buf.append { "}" }
    buf.toString
  }

  def main(args: Array[String]): Unit ={
    val path = args(0)
    var sc_dir = args(1)
    val sourcedir = getFiles(new File(path))
    var sensitive_clue_set = Set[sensitive_clue]()
    val cpgSet = sourcedir.filter(_.getAbsolutePath.endsWith("zip"))
    var cur_num = 1
    var filenumber = cpgSet.toList.length
    var filename = ""
    for(cpgfile <- cpgSet){
      sensitive_clue_set = Set[sensitive_clue]()
      val cpg = CpgLoader.load(cpgfile.getAbsolutePath)
      breakable{
        if(cpg.file.name.l.isEmpty){
          break
        }
        else{
          filename = cpg.file.name.l.head
          //System.out.println("*****************")
          //System.out.println(filename)
          //System.out.println("Function:")
          val methods = cpg.scalaGraph.V.hasLabel(NodeTypes.CALL).l
          for(method <- methods){
            if(!isOperationAndAssignment(method) && !isIndirectAccess(method)) {
              if(method.value2(NodeKeys.NAME).contains("->") == false){
                var parameters = method.out(EdgeTypes.ARGUMENT).l
                var paramcount = parameters.length
                var sc = new sensitive_clue(paramcount, method.value2(NodeKeys.NAME))
                //System.out.println("paramcount: " + sc.params_count)
                var flag = 0
                breakable{
                  for(c_sc <- sensitive_clue_set){
                    if(c_sc.name == method.value2(NodeKeys.NAME)){
                      if(c_sc.params_count != paramcount) {
                        c_sc.isVariadic = 1
                      }
                      sc = c_sc
                      flag = 1
                      break
                    }
                  }
                }
                breakable{
                  if(sc.isVariadic == 1){
                    break
                  }
                  else{
                    if(flag == 0){
                      for(i <- 0 until sc.params_count){
                        sc.const_params += 0
                        sc.params += 0
                      }
                      sensitive_clue_set += sc
                    }
                    //System.out.println(sc.params.length)
                    sc.called_times += 1
                    //System.out.println(method.value2(NodeKeys.CODE))
                    var i = 0
                    //System.out.println("paramcount: " + paramcount)
                    var defStmts = method.in(EdgeTypes.REACHING_DEF).l
                    var slist = List[Vertex]()
                    var invMap : Map[Vertex, List[Vertex]] = Map()
                    for(parameter <- parameters){
                      if(parameter.label == NodeTypes.IDENTIFIER) {
                        invMap(parameter) = List()
                        invMap(parameter) = invMap(parameter) :+ parameter
                      }
                      if(parameter.label == NodeTypes.CALL){
                        invMap(parameter) = findparam(parameter, List[Vertex]())
                      }
                    }
                    slist = slist :+ method
                    for(defStmt <- defStmts){
                      if(slist.exists(s => s.value2(NodeKeys.CODE) == defStmt.value2(NodeKeys.CODE)) == false){
                        slist = slist :+ defStmt
                        var res = involvedVariable(invMap, slist, defStmt)
                        invMap = res._1
                        slist = res._2
                      }
                    }
                    for(parameter <- parameters){
                      var label = parameter.label()
                      if(label == NodeTypes.IDENTIFIER || label == NodeTypes.CALL) {
                        /*
                        System.out.print("\t")
                        System.out.print("name: " + parameter.value2(NodeKeys.NAME) + "   ")
                        System.out.println("type: " + parameter.value2(NodeKeys.TYPE_FULL_NAME))*/
                        var nodeset : Set[Vertex] = Set()
                        breakable{
                          for(iv <- invMap(parameter)){
                            var res = isVerified(iv, method, nodeset, 0)
                            if(res._1 == true) {
                              sc.params(i) += 1
                              break
                            }
                          }
                        }
                      }
                      if(label == NodeTypes.LITERAL) {
                        /*
                        System.out.print("\t")
                        System.out.print("name: " + parameter.value2(NodeKeys.CODE) + "   ")
                        System.out.println("type: Constant")*/
                        //System.out.println("************findConstant*************")
                        //System.out.println("Value: " + parameter.value2(NodeKeys.CODE))
                        //System.out.println("*************************************")
                        sc.const_params(i) += 1
                      }
                      i += 1
                    }
                  }
                }
              }
            }
          }
          //System.out.println("------------------")
          var funcnumber = sensitive_clue_set.toList.length.toString
          var functions = <functions number ={funcnumber} sourceFile = {filename} inputFile = {filename}></functions>
          for(sc <- sensitive_clue_set){
            if(sc.isVariadic != 1){
              var function = <function name={sc.name} RealCalledTimes={sc.called_times.toString} ParamsCount={sc.params_count.toString}></function>
              var VerifiedParams = <VerifiedParams></VerifiedParams>
              var VerifiedParam = new NodeBuffer
              for(i <- 0 until sc.params_count){
                if(sc.params(i) != 0 || sc.const_params(i) != 0){
                  VerifiedParam += <VerifiedParam index={i.toString} VerifiedTimes={sc.params(i).toString} ConstTimes={sc.const_params(i).toString}></VerifiedParam>
                }
              }
              VerifiedParams = VerifiedParams.copy(child = VerifiedParams.child ++ VerifiedParam)
              function = function.copy(child = function.child ++ VerifiedParams)
              functions = functions.copy(child = functions.child ++ function)
              /*
              System.out.println(sc.name + "  called times: " + sc.called_times)
              for(i <- 0 until sc.params_count){
                System.out.println("\tindex: " + i + " verified: " + sc.params(i) + " const: " + sc.const_params(i))
              }*/
            }
          }

          var outputFilename = filename.replace(path, sc_dir + "/SCFiles")
          var dirname = outputFilename.split("/")
          var sb = new StringBuffer
          var i = 0
          while(i < dirname.length - 1){
            sb.append("/" + dirname(i))
            i += 1
          }
          var s = sb.toString
          var f = new File(s)
          if(!f.exists()){
            f.mkdirs()
          }
          outputFilename += ".sc.xml"
          f = new File(outputFilename)
          if(!f.exists()){
            f.createNewFile()
          }
          XML.save(outputFilename, functions)
          System.out.println("[ " + cur_num + "/" + filenumber + " ]: " + outputFilename)
          cur_num += 1
          //System.out.println("*****************")

        }
      }

    }

  }
}
