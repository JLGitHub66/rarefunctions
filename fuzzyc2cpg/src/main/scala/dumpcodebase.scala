package io.shiftleft.joern

import java.io.{File, PrintWriter}
import java.nio.file.Paths

import gremlin.scala._
import io.circe.generic.semiauto._
import io.circe.syntax._
import io.circe.{Encoder, Json}
import org.apache.tinkerpop.gremlin.structure.{Edge, VertexProperty}
import io.shiftleft.codepropertygraph.generated.{EdgeTypes, NodeKeys, NodeTypes, nodes}
import io.shiftleft.Implicits.JavaIteratorDeco
import io.shiftleft.joern.PRG.{computePRG, isIndirectAccess, isOperationAndAssignment}
import io.shiftleft.joern.SensitiveClue.vertexToStr
import io.shiftleft.joern.getpdg.toDot

import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._
import scala.xml._
import io.shiftleft.semanticcpg.utils.{ExpandTo, MemberAccess}
import io.shiftleft.semanticcpg.language._
import io.shiftleft.semanticcpg.language.types.expressions.generalizations.CfgNode
import org.apache.tinkerpop.gremlin.structure.Direction

import scala.jdk.CollectionConverters._



object dumpcodebase {
    private def getFiles(inputs:File*) : Seq[File] = {
      inputs.filter(_.isFile) ++
        inputs.filter(_.isDirectory).flatMap(dir => getFiles(dir.listFiles(): _*))
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
        System.out.println("findparam: " + v.value2(NodeKeys.NAME))
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

    def toDot(graph: ScalaGraph): Unit = {
      val buf = new StringBuffer()

      buf.append("digraph g {\n node[shape=plaintext];\n")

      graph.E.hasLabel(EdgeTypes.CDG).l.foreach { e =>
        val inV = vertexToStr(e.inVertex).replace("\"", "\'")
        val outV = vertexToStr(e.outVertex).replace("\"", "\'")
        buf.append(s""" "$outV" -> "$inV";\n """)
      }
      buf.append { "}" }
      System.out.println(buf.toString)
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
                System.out.println("************findVerified*************")
                System.out.println("Var: " + variable.value2(NodeKeys.CODE) + " VerifyCode: " + condition.value2(NodeKeys.CODE))
                System.out.println("*************************************")
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


  def getStmtSig(node: nodes.CfgNode, gs: NodeBuffer, num : Int) : (NodeBuffer, Int) = {
    var _num = num
    var _gs = gs
    if(node.label == NodeTypes.CALL && node.value2(NodeKeys.NAME).contains("<operator>") == false &&
      node.value2(NodeKeys.NAME).contains("<operators>") == false){
      _gs += <gs t={"1"} op={node.value2(NodeKeys.NAME)} ops={node.out(EdgeTypes.ARGUMENT).l.length.toString} l={node.value2(NodeKeys.LINE_NUMBER).toString}></gs>
      _num = _num + 1
      for(succs <- node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l){
        var res = getStmtSig(succs, _gs, _num)
        _gs = res._1
        _num = res._2

      }
    }
    else{
      for(succs <- node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l){
        var res = getStmtSig(succs, _gs, _num)
        _gs = res._1
        _num = res._2
      }
    }
    (_gs, _num)
  }

  def getline(writer: PrintWriter, parts: List[nodes.CfgNode], cfgNodes: ArrayBuffer[nodes.CfgNode], line:Int): ArrayBuffer[nodes.CfgNode] = {
    var cnodes = cfgNodes
    for(part <- parts){
      cfgNodes.append(part)
      writer.write(part + "\t" + part.value2(NodeKeys.CODE) + "\t" + line + '\n')
      var pparts = part.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
      cnodes = getline(writer, pparts, cnodes, line)

    }
    cnodes
  }

  def main(args: Array[String]): Unit = {
    //val path = "D:\\cpgtest"
   // val cpgname = args(0)
    val cpgname = "D:\\cpgtest\\p_1.bin.zip"
    var edgetype: Map[String, Int] = Map("definetouse" -> 0, "usetouse" -> 1, "condtrue" -> 2, "condfalse" -> 3)
    var filename = ""
    var outputFilename = ""
    val cpg = CpgLoader.load(cpgname)
    var methodname = List[String]()
    var callname = List[String]()
    var methodcfg = List[String]()
    breakable {
      if (cpg.file.name.l.isEmpty) {
        break
      }
      else {
        filename = cpg.file.name.l.head
        //outputFilename = filename + ".line.txt"
        outputFilename = "D:\\cpgtest\\line.txt"
        //toDot(cpg.scalaGraph)
        var f = new File(outputFilename)
        /*
        if (!f.exists()) {
          f.createNewFile()
        }
        else {
          break
        }*/
        val writer = new PrintWriter(f)
        val allmethods = cpg.scalaGraph.V.hasLabel(NodeTypes.METHOD).l
        val allcall = cpg.scalaGraph.V.hasLabel(NodeTypes.CALL).l
        for (method <- allmethods) {
          if (!isOperationAndAssignment(method) && !isIndirectAccess(method)) {
            if (method.value2(NodeKeys.NAME).contains("->") == false) {
              methodname = methodname :+ method.value2(NodeKeys.NAME)
            }
          }
        }
        for (call <- allcall) {
          if (!isOperationAndAssignment(call) && !isIndirectAccess(call)) {
            if (call.value2(NodeKeys.NAME).contains("->") == false) {
              callname = callname :+ call.value2(NodeKeys.NAME)
            }
          }
        }
        var methods = methodname.diff(callname)
        methodname.foreach {
          m =>
            if (callname.contains(m) && methodname.contains(m)) {
              methods = methods :+ m
            }
        }
        //System.out.println(methods.length)

        var passed_method = new ArrayBuffer[Vertex]()
        methods.foreach { m =>
          if (m.contains("*") == false && m.contains("]") == false) {
            if (cpg.method.name(m).l.isEmpty == false) {
              for (method <- cpg.method.name(m).l) {
                breakable {
                  if (passed_method.contains(method) == true) {
                    break
                  }
                  else {
                    if (method.label == NodeTypes.METHOD) {
                      val methodName = method.value2(NodeKeys.NAME)
                      val methodId = method.toString
                      var cfgNodes = new CfgNode(
                        method.out(EdgeTypes.CONTAINS).filterOnEnd(_.isInstanceOf[nodes.CfgNode]).cast[nodes.CfgNode]
                      ).l
                      if (cfgNodes.size > 1) {
                        passed_method.append(method)
                        methodcfg = methodcfg :+ m
                      }
                    }
                  }
                }
              }
            }
          }
        }
        val numMethods = passed_method.size
        System.out.println(numMethods)

        var id = 0
        for (method <- passed_method) {
          breakable {
            if (method.label == NodeTypes.METHOD) {
              val methodName = method.value2(NodeKeys.NAME)
              val methodId = method.toString
              var _cfgNodes = new CfgNode(
                method.out(EdgeTypes.CONTAINS).filterOnEnd(_.isInstanceOf[nodes.CfgNode]).cast[nodes.CfgNode]
              ).l.toArray
              var cfgNodes = new ArrayBuffer[nodes.CfgNode]()
              if (_cfgNodes.size > 1) {
                writer.write("Function: " + methodName + '\n')
                for (node <- _cfgNodes) {
                  if(isIndirectAccess(node)){
                    System.out.println(node.value2(NodeKeys.CODE))
                    var parts = node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
                    for(part <- parts){
                        System.out.println('\t' + part.value2(NodeKeys.CODE) + ' ' + part.value2(NodeKeys.TYPE_FULL_NAME))

                    }
                  }
                  if (node.value2(NodeKeys.CODE) != "") {
                    if (cfgNodes.contains(node) == false) {
                      cfgNodes.append(node)
                      writer.write(node + "\t" + node.value2(NodeKeys.CODE) + "\t" + node.value2(NodeKeys.LINE_NUMBER)+ '\n')
                      if (node.label == NodeTypes.CALL || node.label == NodeTypes.RETURN) {
                        var parts = node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
                        cfgNodes = getline(writer, parts, cfgNodes, node.value2(NodeKeys.LINE_NUMBER))
                      }
                    }
                  }
                }

                /*
                for (node <- cfgNodes) {
                  System.out.println(node.value2(NodeKeys.CODE) + " line: " + node.value2(NodeKeys.LINE_NUMBER))
                }*/

              }
            }
          }

        }
        writer.close()
      }
    }

  }

  /*

  def main(args: Array[String]): Unit ={
      val cpgname = args(0)
    //var sc_dir = args(1)
      val cb_var_type : Map[String, Int] = Map("VTYPE_CONSTANT_INT" -> 0,
        "VTYPE_CONSTANT_REAL" -> 1,
        "VTYPE_CONSTANT_STR" -> 2,
        "VTYPE_PARM_DECL" -> 3,
        "VTYPE_VAR_DECL" -> 4,
        "VTYPE_RESULT_DECL" -> 5,
        "VTYPE_FIELD_DECL" -> 6,
        "VTYPE_FUNCTION_DECL" -> 7,
        "VTYPE_COMPONENT_REF" -> 8,
        "VTYPE_ARRAY_REF" -> 9,
        "VTYPE_ADDR_EXPR" -> 10,
        "VTYPE_MEM_REF" -> 11,
        "VTYPE_UNKNOWN" -> 12)
      val cb_operator : Map[String, Int] = Map("OP_EQ_EXPR" -> 0,
        "OP_NE_EXPR" -> 1,
        "OP_LT_EXPR" -> 2,
        "OP_LE_EXPR" -> 3,
        "OP_GT_EXPR" -> 4,
        "OP_GE_EXPR" -> 5,
        "OP_MULT_EXPR" -> 6,
        "OP_PLUS_EXPR" -> 7,
        "OP_PPLUS_EXPR" -> 8,
        "OP_MINUS_EXPR" -> 9,
        "OP_TRUNC_DIV_EXPR" -> 10,
        "OP_CEIL_DIV_EXPR" -> 11,
        "OP_FLOOR_DIV_EXPR" -> 12,
        "OP_ROUND_DIV_EXPR" -> 13,
        "OP_TRUNC_MOD_EXPR" -> 14,
        "OP_CEIL_MOD_EXPR" -> 15,
        "OP_FLOOR_MOD_EXPR" -> 16,
        "OP_ROUND_MOD_EXPR" -> 17,
        "OP_RDIV_EXPR" -> 18,
        "OP_EXACT_DIV_EXPR" -> 19,
        "OP_LSHIFT_EXPR" -> 20,
        "OP_RSHIFT_EXPR" -> 21,
        "OP_LROTATE_EXPR" -> 22,
        "OP_RROTATE_EXPR" -> 23,
        "OP_BIT_IOR_EXPR" -> 24,
        "OP_BIT_XOR_EXPR" -> 25,
        "OP_BIT_AND_EXPR" -> 26,
        "OP_TRUTH_ANDIF_EXPR" -> 27,
        "OP_TRUTH_ORIF_EXPR" -> 28,
        "OP_TRUTH_AND_EXPR" -> 29,
        "OP_TRUTH_OR_EXPR" -> 30,
        "OP_TRUTH_XOR_EXPR" -> 31,
        "OP_NEGATE_EXPR" -> 32,
        "OP_BIT_NOT_EXPR" -> 33,
        "OP_TRUTH_NOT_EXPR" -> 34,
        "OP_UNKNOWN" -> 35)
      var edgetype: Map[String, Int] = Map("false" -> 0 ,"true" -> 1, "always" -> 2)
      //val sourcedir = getFiles(new File(path))
      //val cpgSet = sourcedir.filter(_.getAbsolutePath.endsWith("zip"))
      //var cur_num = 1
      //var filenumber = cpgSet.toList.length
      var filename = ""
      var outputFilename = ""
      //for(cpgfile <- cpgSet){
        val cpg = CpgLoader.load(cpgname)
        var methodname = List[String]()
        var callname = List[String]()
        var methodcfg = List[String]()
        breakable{
          if(cpg.file.name.l.isEmpty){
            break
          }
          else{
            filename = cpg.file.name.l.head
            outputFilename = filename + ".cb.xml"
            //System.out.println(outputFilename)
            var f = new File(outputFilename)
            if(!f.exists()){
              f.createNewFile()
            }
            else{
              break
            }
            //toDot(cpg.scalaGraph)
            val allmethods = cpg.scalaGraph.V.hasLabel(NodeTypes.METHOD).l
            val allcall = cpg.scalaGraph.V.hasLabel(NodeTypes.CALL).l
            for(method <- allmethods){
              if(!isOperationAndAssignment(method) && !isIndirectAccess(method)){
                if(method.value2(NodeKeys.NAME).contains("->") == false) {
                  methodname = methodname :+ method.value2(NodeKeys.NAME)
                }
              }
            }
            for(call <- allcall){
              if(!isOperationAndAssignment(call) && !isIndirectAccess(call)){
                if(call.value2(NodeKeys.NAME).contains("->") == false) {
                  callname = callname :+ call.value2(NodeKeys.NAME)
                }
              }
            }
            var methods = methodname.diff(callname)
            methodname.foreach{
              m =>
                if(callname.contains(m) && methodname.contains(m)){
                  methods = methods :+ m
                }
            }

            //System.out.println(methods.length)
            var passed_method = new ArrayBuffer[Vertex]()
            methods.foreach { m =>
              if (m.contains("*") == false && m.contains("]") == false){
                if (cpg.method.name(m).l.isEmpty == false) {
                  for (method <- cpg.method.name(m).l) {
                    breakable {
                    if (passed_method.contains(method) == true) {
                      break
                    }
                    else {
                      if (method.label == NodeTypes.METHOD) {
                        val methodName = method.value2(NodeKeys.NAME)
                        val methodId = method.toString
                        var cfgNodes = new CfgNode(
                          method.out(EdgeTypes.CONTAINS).filterOnEnd(_.isInstanceOf[nodes.CfgNode]).cast[nodes.CfgNode]
                        ).l
                        if (cfgNodes.size > 1) {
                          passed_method.append(method)
                          methodcfg = methodcfg :+ m
                        }
                      }
                    }
                  }
                  }
                }
            }
            }
            val numMethods = passed_method.size
            System.out.println(numMethods)

            var functions = <functions num ={numMethods.toString}></functions>
            var id = 0
              for (method <- passed_method) {
                breakable {
                  if (method.label == NodeTypes.METHOD) {
                    val methodName = method.value2(NodeKeys.NAME)
                    val methodId = method.toString
                    var _cfgNodes = new CfgNode(
                      method.out(EdgeTypes.CONTAINS).filterOnEnd(_.isInstanceOf[nodes.CfgNode]).cast[nodes.CfgNode]
                    ).l.toArray
                    var cfgNodes = new ArrayBuffer[nodes.CfgNode]()
                    if (_cfgNodes.size > 1) {
                      var stmt = List[nodes.CfgNode]()
                      //System.out.println("------------------------")
                      System.out.println(id + "----Function: " + methodName)
                      for (node <- _cfgNodes) {
                        //System.out.println(node.value2(NodeKeys.CODE) + " line: " + node.value2(NodeKeys.LINE_NUMBER))
                        if (node.label == NodeTypes.CALL || node.label == NodeTypes.RETURN) {
                          stmt = List.concat(stmt, node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l)
                        }
                      }
                      _cfgNodes = _cfgNodes.diff(stmt)
                      for (node <- _cfgNodes) {
                        if (node.value2(NodeKeys.CODE) != "") {
                          cfgNodes.append(node)
                        }
                      }
                      cfgNodes = cfgNodes.sortBy(s => s.value2(NodeKeys.LINE_NUMBER))
                      if (cfgNodes.length == 0) {
                        break
                      }
                      var i = 1
                      var bb_i = 2
                      var sLine = 0
                      var eLine = 0
                      for (node <- cfgNodes) {
                        if (i == 1) {
                          sLine = node.value2(NodeKeys.LINE_NUMBER)
                        }
                        if (i == cfgNodes.length) {
                          eLine = node.value2(NodeKeys.LINE_NUMBER)
                        }
                        i += 1

                      }

                      var function = <function name={methodName} id={id.toString} sourcepath={filename} sLine={sLine.toString} eLine={eLine.toString} n={cfgNodes.length.toString}></function>
                      var bb_num = cfgNodes.length + 2
                      var bbs = <bbs n={bb_num.toString}></bbs>
                      var bb = new NodeBuffer
                      bb += <bb id={"0"} n={"0"}></bb>
                      bb += <bb id={"1"} n={"0"}></bb>
                      for (node <- cfgNodes) {
                        var num = 0
                        var gs = new NodeBuffer
                        if (node.label == NodeTypes.CALL || node.label == NodeTypes.RETURN) {
                          var res = getStmtSig(node, gs, num)
                          gs = res._1
                          num = res._2
                        }
                        if (num == 0) {
                          num = 1
                          gs += <gs t={"0"} op={"35"} ops={node.out(EdgeTypes.ARGUMENT).l.length.toString} l={node.value2(NodeKeys.LINE_NUMBER).toString}></gs>
                        }
                        var _bb = <bb id={bb_i.toString} n={num.toString}></bb>
                        bb += _bb.copy(child = _bb.child ++ gs)
                        bb_i += 1
                      }
                      bbs = bbs.copy(child = bbs.child ++ bb)
                      function = function.copy(child = function.child ++ bbs)
                      var edges = <edges></edges>
                      var edge = new NodeBuffer
                      edge += <e s={"0"} d={"2"} t={"2"}></e>
                      for (node <- cfgNodes) {
                        System.out.println(node.value2(NodeKeys.CODE) + "line: " + node.value2(NodeKeys.LINE_NUMBER))
                        var index = 0
                        var tmp = 0
                        if (node.out(EdgeTypes.CFG).l.length != 1) {
                          for (succ <- node.out(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
                            var _succ = succ
                            val s = cfgNodes.indexOf(node) + 2
                            breakable {
                              while (cfgNodes.contains(_succ) == false) {
                                //System.out.println("tmp: " + tmp   + "currentnode: " + node.value2(NodeKeys.CODE))
                                //tmp += 1
                                //System.out.println(_succ.value2(NodeKeys.CODE) + "  line: " + _succ.value2(NodeKeys.LINE_NUMBER))
                                if (_succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                                  _succ = _succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                                }
                                else {
                                  if (index == 0) {
                                    edge += <e s={s.toString} d={"1"} t={"1"}></e>
                                  }
                                  else {
                                    edge += <e s={s.toString} d={"1"} t={"0"}></e>
                                  }
                                  break
                                }
                              }

                              var e = cfgNodes.indexOf(_succ) + 2
                              if (index == 0) {
                                edge += <e s={s.toString} d={e.toString} t={"1"}></e>
                              }
                              else {
                                edge += <e s={s.toString} d={e.toString} t={"0"}></e>
                              }
                            }
                            index += 1
                          }
                        }
                        else {
                          var _succ = node
                          var n_tmp = 0
                          val s = cfgNodes.indexOf(node) + 2
                          if (_succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                            _succ = _succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                            breakable {
                              while (cfgNodes.contains(_succ) == false) {
                                //System.out.println("n_tmp: " + n_tmp + "currentnode: " + node.value2(NodeKeys.CODE))
                                //n_tmp += 1
                                //System.out.println(_succ.value2(NodeKeys.CODE) + "  line: " + _succ.value2(NodeKeys.LINE_NUMBER))
                                if (_succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                                  _succ = _succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                                }
                                else {
                                  edge += <e s={s.toString} d={"1"} t={"2"}></e>
                                  break
                                }
                              }
                              var e = cfgNodes.indexOf(_succ) + 2
                              edge += <e s={s.toString} d={e.toString} t={"2"}></e>
                            }
                          }
                          else {
                            edge += <e s={s.toString} d={"1"} t={"2"}></e>
                          }
                        }
                      }
                      edges = edges.copy(child = edges.child ++ edge)
                      function = function.copy(child = function.child ++ edges)
                      functions = functions.copy(child = functions.child ++ function)
                      id += 1
                      //System.out.println("------------------------")
                    }
                  }

              }
              }



            /*var dirname = outputFilename.split("/")
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
            }*/
            XML.save(outputFilename, functions)

          }
        }

      //}

    }

*/
}

