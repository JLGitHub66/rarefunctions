package io.shiftleft.joern

import java.io.File

import gremlin.scala._
import io.circe.generic.semiauto._
import io.circe.syntax._
import io.circe.{Encoder, Json}
import org.apache.tinkerpop.gremlin.structure.{Edge, VertexProperty}
import io.shiftleft.codepropertygraph.generated.{EdgeTypes, NodeKeys, NodeTypes, nodes}

import scala.util.control.Breaks._
import io.shiftleft.dataflowengine.language._
import io.shiftleft.joern.console.Console.cpg
import io.shiftleft.semanticcpg.language._
import io.shiftleft.semanticcpg.language.types.expressions.Call
import io.shiftleft.semanticcpg.language.types.structure.Local
import io.shiftleft.semanticcpg.utils.MemberAccess
import io.shiftleft.semanticcpg.language.types.expressions.generalizations.CfgNode
import java.io.{PrintWriter, File => JFile}

import io.shiftleft.joern.SensitiveClue.vertexToStr

import scala.jdk.CollectionConverters._

final case class PdgForFuncsFunction(function: String, id: String, PDG: List[nodes.CfgNode])


object getpdg {

  implicit val encodeFuncFunction: Encoder[PdgForFuncsFunction] = deriveEncoder

  implicit val encodeEdge: Encoder[Edge] =
    (edge: Edge) =>
      Json.obj(
        ("id", Json.fromString(edge.toString)),
        ("in", Json.fromString(edge.inVertex().toString)),
        ("out", Json.fromString(edge.outVertex().toString))
      )

  implicit val encodeVertex: Encoder[nodes.CfgNode] =
    (node: nodes.CfgNode) =>
      Json.obj(
        ("id", Json.fromString(node.toString)),
        ("edges",
          Json.fromValues((node.inE("CFG", "REACHING_DEF", "CDG").l ++ node.outE("CFG", "REACHING_DEF", "CDG").l).map(_.asJson))),
        ("properties", Json.fromValues(node.properties().asScala.toList.map { p: VertexProperty[_] =>
          Json.obj(
            ("key", Json.fromString(p.key())),
            ("value", Json.fromString(p.value().toString))
          )
        }))
      )



  private def getFiles(inputs:File*) : Seq[File] = {
    inputs.filter(_.isFile) ++
      inputs.filter(_.isDirectory).flatMap(dir => getFiles(dir.listFiles(): _*))
  }

/*
  def main(args: Array[String]): Unit ={
    val path = "D:\\cpgforjavatest"
    val sourcedir = getFiles(new File(path))
    val cpgSet = sourcedir.filter(_.getAbsolutePath.endsWith("zip"))
    var cur_num = 1
    var filenumber = cpgSet.toList.length
    var filename = ""
    for(cpgfile <- cpgSet){
      val cpg = CpgLoader.load(cpgfile.getAbsolutePath)
      breakable {
        if (cpg.file.name.l.isEmpty) {

          break
        }
        else{
          System.out.println("*******" + cpg.file.name.l.head.toString + "*******")
          val methods = cpg.scalaGraph.V.hasLabel(NodeTypes.METHOD).l
          for(method <- methods){
            System.out.println(method.value2(NodeKeys.NAME))
          }
        }
      }
    }

  }
*/
  private def isOperationAndAssignment(vertex: Vertex): Boolean = {
    /*if (!vertex.isInstanceOf[nodes.Call]) {
      return false
    }*/

    val name = vertex.value2(NodeKeys.NAME)
    if(name.contains("<operator>") || name.contains("<operators>")){
      true
    }
    else false
  }

  def toDot(graph: ScalaGraph): Unit = {
    val buf = new StringBuffer()

    buf.append("digraph g {\n node[shape=plaintext];\n")

    graph.E.hasLabel(EdgeTypes.CONDITION).l.foreach { e =>
      val inV = vertexToStr(e.inVertex).replace("\"", "\'")
      val outV = vertexToStr(e.outVertex).replace("\"", "\'")
      buf.append(s""" "$outV" -> "$inV";\n """)
    }
    buf.append { "}" }
    System.out.println(buf.toString)
  }


  private def isIndirectAccess(vertex: Vertex): Boolean = {
    /*if (!vertex.isInstanceOf[nodes.Call]) {
      return false
    }*/

    val callName = vertex.value2(NodeKeys.NAME)
    MemberAccess.isGenericMemberAccessName(callName)
  }


  def main(args: Array[String]): Unit ={
    //val path = args(0)
    val path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test" /////////////////////////////////path/////////////////////////////////
    //val path = "D:\\cpgtest"
    val sourcedir = getFiles(new File(path))
    val cpgSet = sourcedir.filter(_.getAbsolutePath.endsWith("zip"))
    var filenumber = cpgSet.toList.length
    var filename = ""
    var filenum = 0
    for(cpgfile <- cpgSet){
      var methodname = List[String]()
      var callname = List[String]()
      var methodcfg = List[String]()
      val cpg = CpgLoader.load(cpgfile.getAbsolutePath)
      breakable {
        if (cpg.file.name.l.isEmpty) {
          break
        }
        else{
          val name = cpg.file.name.l.head.toString
          //toDot(cpg.scalaGraph)
          val allmethods = cpg.scalaGraph.V.hasLabel(NodeTypes.METHOD).l

          val allcall = cpg.scalaGraph.V.hasLabel(NodeTypes.CALL).l
          /*for(call <- allcall){
            if(call.in(EdgeTypes.CONDITION).l.isEmpty == false){
              System.out.println(call.in(EdgeTypes.CONDITION).l.head.value2(NodeKeys.CODE))
            }
          }*/
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

          methods.foreach { m =>
            if (cpg.method.name(m).l.isEmpty == false) {
              val method = cpg.method.name(m).l.head
              val methodName = method.value2(NodeKeys.NAME)
              val methodId = method.toString
              val cfgNodes = new CfgNode(
                method.out(EdgeTypes.CONTAINS).filterOnEnd(_.isInstanceOf[nodes.CfgNode]).cast[nodes.CfgNode]
              ).l
              if (cfgNodes.size != 1) {
                methodcfg = methodcfg :+ m
              }
            }
          }
          val numMethods = methodcfg.size
          System.out.println(numMethods)
          filenum += 1
          var current = 1
          val writer = new PrintWriter(new JFile(name.substring(0, name.length - 2) + "_pdg.json"))
          //val writer = new PrintWriter("D://cpgtest//1_pdg.json")
          writer.write("{")
          writer.write(""""functions": [""")
          methodcfg.foreach { m =>
            if (cpg.method.name(m).l.isEmpty == false) {
              breakable {
                val method = cpg.method.name(m).l.head
                val methodName = method.value2(NodeKeys.NAME)
                //System.out.println(methodName)

                val methodId = method.toString
                val cfgNodes = new CfgNode(
                  method.out(EdgeTypes.CONTAINS).filterOnEnd(_.isInstanceOf[nodes.CfgNode]).cast[nodes.CfgNode]
                ).l
                /*
                val local = new NodeSteps(
                  method
                    .out(EdgeTypes.CONTAINS)
                    .hasLabel(NodeTypes.BLOCK)
                    .out(EdgeTypes.AST)
                    .hasLabel(NodeTypes.LOCAL)
                    .cast[nodes.Local])
                //val sink = cpg.identifier
                val sink = local.referencingIdentifiers.dedup
                //val s = sink
                //System.out.println(s.l)
                //val sink = local.referencingIdentifiers.dedup
                val source = new NodeSteps(method.out(EdgeTypes.CONTAINS).hasLabel(NodeTypes.CALL).cast[nodes.Call]).dedup

              val dependencies = sink
                .reachableBy(source).dedup
                .l
                .map(_.cfgNode)
                .filter(_.toString != methodId)*/
              System.out.println(s"($current / $numMethods) Writing PDG for '$methodName'.")

              writer.write(PdgForFuncsFunction(methodName, methodId, cfgNodes).asJson.toString)
              if (current< numMethods) writer.write(",");
              current += 1
              }
            }
          }
          writer.write("]")
          writer.write("}")
          writer.close()
        }
      }
    }
  }


}
