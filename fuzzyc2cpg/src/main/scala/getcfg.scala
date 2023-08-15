package io.shiftleft.joern

import java.io.{File, PrintWriter}

import gremlin.scala._
import io.circe.generic.semiauto._
import io.circe.syntax._
import io.circe.{Encoder, Json}
import io.shiftleft.codepropertygraph.generated.{EdgeTypes, NodeKeys, NodeTypes, nodes}
import io.shiftleft.semanticcpg.language._
import io.shiftleft.semanticcpg.language.types.expressions.generalizations.CfgNode
import io.shiftleft.semanticcpg.utils.MemberAccess
import org.apache.tinkerpop.gremlin.structure.{Edge, VertexProperty}

import scala.jdk.CollectionConverters._
import scala.util.control.Breaks._

final case class CfgForFuncsFunction(function: String, id: String, CFG: List[nodes.CfgNode])

object getcfg {

  implicit val encodeFuncFunction: Encoder[CfgForFuncsFunction] = deriveEncoder

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
        ("edges", Json.fromValues((node.inE("CFG").l ++ node.outE("CFG").l).map(_.asJson))),
        ("properties", Json.fromValues(node.properties().asScala.toList.map { p: VertexProperty[_] =>
          Json.obj(
            ("key", Json.fromString(p.key())),
            ("value", Json.fromString(p.value().toString))
          )
        }))
    )

  private def getFiles(inputs: File*): Seq[File] = {
    inputs.filter(_.isFile) ++
      inputs.filter(_.isDirectory).flatMap(dir => getFiles(dir.listFiles(): _*))
  }

  /*
  def main(args: Array[String]): Unit ={
    val path = "D:\\cpgtest"
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

  }*/

  private def isOperationAndAssignment(vertex: Vertex): Boolean = {
    /*if (!vertex.isInstanceOf[nodes.Call]) {
      return false
    }*/

    val name = vertex.value2(NodeKeys.NAME)
    if (name.contains("<operator>") || name.contains("<operators>")) {
      true
    } else false
  }

  private def isIndirectAccess(vertex: Vertex): Boolean = {
    /*if (!vertex.isInstanceOf[nodes.Call]) {
      return false
    }*/

    val callName = vertex.value2(NodeKeys.NAME)
    MemberAccess.isGenericMemberAccessName(callName)
  }

  def main(args: Array[String]): Unit = {
    //val path = args(0)
    val path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test" /////////////////////////////////path/////////////////////////////////
    val sourcedir = getFiles(new File(path))
    val cpgSet = sourcedir.filter(_.getAbsolutePath.endsWith("zip"))
    var filenumber = cpgSet.toList.length
    var filename = ""
    var filenum = 0
    for (cpgfile <- cpgSet) {
      var methodname = List[String]()
      var callname = List[String]()
      var methodcfg = List[String]()
      val cpg = CpgLoader.load(cpgfile.getAbsolutePath)
      breakable {
        if (cpg.file.name.l.isEmpty) {
          break
        } else {
          val name = cpg.file.name.l.head.toString
          val idx = name.lastIndexOf('.')
          val fcfg = new File(name.substring(0, idx) + "_cfg.json")
          if (fcfg.exists && fcfg.lastModified() >= cpgfile.lastModified()) {
            break
          }
          val allmethods = cpg.scalaGraph.V.hasLabel(NodeTypes.METHOD).l
          println(allmethods)
          val allcall = cpg.scalaGraph.V.hasLabel(NodeTypes.CALL).l
          println(allcall)
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
          methodname.foreach { m =>
            if (callname.contains(m) && methodname.contains(m)) {
              methods = methods :+ m
            }
          }
          methods.foreach { m =>
            if (m.contains("]") == false && m.contains("*") == false) {
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
          }
          val numMethods = methodcfg.size
          filenum += 1
          var current = 1
          val writer = new PrintWriter(fcfg)
          writer.write("{")
          writer.write(""""functions": [""")
          methodcfg.foreach { m =>
            if (cpg.method.name(m).l.isEmpty == false) {
              val method = cpg.method.name(m).l.head
              val methodName = method.value2(NodeKeys.NAME)
              val methodId = method.toString
              val cfgNodes = new CfgNode(
                method.out(EdgeTypes.CONTAINS).filterOnEnd(_.isInstanceOf[nodes.CfgNode]).cast[nodes.CfgNode]
              ).l
              if (cfgNodes.size != 1) {
                System.out.println(s"($current / $numMethods) Writing CFG for '$methodName'.")
                current += 1
                writer.write(CfgForFuncsFunction(methodName, methodId, cfgNodes).asJson.toString)
                writer.write(",")
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
