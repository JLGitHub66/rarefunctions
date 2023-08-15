package io.shiftleft.joern

import java.io.File
import java.nio.file.Paths
import java.util

import gremlin.scala._
import io.circe.generic.semiauto._
import io.circe.syntax._
import io.circe.{Encoder, Json}
import org.apache.tinkerpop.gremlin.structure.{Edge, VertexProperty}
import io.shiftleft.codepropertygraph.generated.{EdgeTypes, NodeKeys, NodeTypes, nodes}
import io.shiftleft.Implicits.JavaIteratorDeco
import io.shiftleft.joern.SensitiveClue.vertexToStr
import io.shiftleft.joern.getpdg.toDot

import scala.collection.mutable.Map
import scala.util.control.Breaks._
import scala.collection.mutable.ArrayBuffer
import scala.xml._
import io.shiftleft.semanticcpg.utils.{ExpandTo, MemberAccess}
import io.shiftleft.semanticcpg.language._
import io.shiftleft.semanticcpg.language.types.expressions.generalizations.CfgNode
import org.apache.tinkerpop.gremlin.structure.Direction

import scala.jdk.CollectionConverters._

//final case class CfgForFuncsFunction(function: String, id: String, CFG: List[nodes.CfgNode])

object PRG {
/*
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
        ("edges",
          Json.fromValues((node.inE("CFG").l ++ node.outE("CFG").l).map(_.asJson))),
        ("properties", Json.fromValues(node.properties().asScala.toList.map { p: VertexProperty[_] =>
          Json.obj(
            ("key", Json.fromString(p.key())),
            ("value", Json.fromString(p.value().toString))
          )
        }))
      )
*/
  private def getFiles(inputs:File*) : Seq[File] = {
    inputs.filter(_.isFile) ++
      inputs.filter(_.isDirectory).flatMap(dir => getFiles(dir.listFiles(): _*))
  }

  class PRG_edge(){
    var _type: Int = 0
    var from: PRG_vertex = new PRG_vertex()
    var to: PRG_vertex = new PRG_vertex()
    var fromop: Int = 0
    var toop: Int = 0
    var label: String = ""
  }

  class PRG_vertex(){
    var id : Int = 0
    var _type: Int = 0
    var label: String = ""
    var stmt: nodes.CfgNode = new nodes.CfgNode {
      override def valueMap: util.Map[String, AnyRef] = ???

      override def order: Integer = ???

      override def label: String = ???

      override def productElementLabel(n: Int): String = ???

      override def productArity: Int = ???

      override def productElement(n: Int): Any = ???

      override def lineNumber: Option[Integer] = ???

      override def canEqual(that: Any): Boolean = ???

      override def addEdge(label: Label, inVertex: Vertex, keyValues: Any*): Edge = ???

      override def property[V](cardinality: VertexProperty.Cardinality, key: Label, value: V, keyValues: Any*): VertexProperty[V] = ???

      override def edges(direction: Direction, edgeLabels: Label*): util.Iterator[Edge] = ???

      override def vertices(direction: Direction, edgeLabels: Label*): util.Iterator[Vertex] = ???

      override def properties[V](propertyKeys: Label*): util.Iterator[VertexProperty[V]] = ???

      override def columnNumber: Option[Integer] = ???

      override def id(): AnyRef = ???

      override def graph(): Graph = ???

      override def remove(): Unit = ???
    }
    var defs : Map[String, String]= Map()
    var uses : Map[String, String]= Map()
    var usesindex : Map[String, Int]= Map()
    var in_edges : ArrayBuffer[PRG_edge]= new ArrayBuffer()
    var out_edges : ArrayBuffer[PRG_edge]= new ArrayBuffer()
    var negated : Int = 0
    var split : Int = 0
    var code : String = ""
    var special: Int = 0

  }

  class PRG(){
    var num_stmts : Int = 0
    var num_vertexes : Int = 0
    var alldefs : ArrayBuffer[String]= new ArrayBuffer()
    var tmpdefs : ArrayBuffer[String]= new ArrayBuffer()
    var defs : ArrayBuffer[ArrayBuffer[String]]= new ArrayBuffer()
    var uses : ArrayBuffer[ArrayBuffer[String]]= new ArrayBuffer()
    var uses_computed : ArrayBuffer[Int] = new ArrayBuffer()
    var vertexes : ArrayBuffer[PRG_vertex] = new ArrayBuffer()
    var edges : ArrayBuffer[PRG_edge]= new ArrayBuffer()

  }

  var edgetype: Map[String, Int] = Map("definetouse" -> 0, "usetouse" -> 1, "condtrue" -> 2, "condfalse" -> 3)

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

  private def findparam(params: List[nodes.CfgNode], node:PRG_vertex, index:Int): PRG_vertex ={ //for call statement
    var newnode = node
    var iindex = 1
    for(param <- params) {
      //System.out.println(callpart.label + ": " + callpart.value2(NodeKeys.CODE))
      if (param.label == NodeTypes.LITERAL) {
        /*
                System.out.print("\t")
                System.out.print("name: " + callpart.value2(NodeKeys.NAME) + "   ")
                System.out.println("type: " + callpart.value2(NodeKeys.TYPE_FULL_NAME))*/
        if(index == 0){
          newnode.usesindex(param.value2(NodeKeys.CODE)) = iindex
        }
        else{
          newnode.usesindex(param.value2(NodeKeys.CODE)) = index
        }
      }
      if (param.label == NodeTypes.IDENTIFIER) {
        /*
                System.out.print("\t")
                System.out.print("name: " + callpart.value2(NodeKeys.NAME) + "   ")
                System.out.println("type: " + callpart.value2(NodeKeys.TYPE_FULL_NAME))*/
        if(index == 0){
          newnode.usesindex(param.value2(NodeKeys.CODE)) = iindex
        }
        else{
          newnode.usesindex(param.value2(NodeKeys.CODE)) = index
        }
      }
      if(param.label == NodeTypes.CALL){
        if(isIndirectAccess(param)){
          if(index == 0){
            newnode.usesindex(param.value2(NodeKeys.CODE)) = iindex
          }
          else{
            newnode.usesindex(param.value2(NodeKeys.CODE)) = index
          }
        }
        else{
          if(index == 0){
            newnode = findparam(param.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l, newnode, iindex)
          }
          else{
            newnode = findparam(param.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l, newnode, index)
          }

        }
      }
      iindex += 1
    }
    newnode
  }
/*
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
*/
  def toDot(graph: ScalaGraph): Unit = {
    val buf = new StringBuffer()

    buf.append("digraph g {\n node[shape=plaintext];\n")

    graph.E.hasLabel(EdgeTypes.REACHING_DEF).l.foreach { e =>
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


  var vertextype: Map[String, Int] = Map("OTHER" -> 0,
    "FUNCALL" -> 1,
    "COND" -> 2,
    "LOOP_COND" -> 3,
    "CONST_ASSIGN" -> 4,
    "MEMORY_REF" -> 5,
    "CONST_INT" -> 6,
    "CONST_STR" -> 7,
    "OFFSET" -> 8,
    "RETURN" -> 9)

  var num2vertextype: List[String] = List("OTHER","FUNCALL","COND","LOOP_COND","CONST_ASSIGN","MEMORY_REF","CONST_INT",
  "CONST_STR","OFFSET","RETURN")


  def handleCondition(node: nodes.CfgNode, p: PRG): PRG = {
    var p1 = p
    var cparts = node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
    for(cpart <- cparts){
      if(cpart.value2(NodeKeys.CODE).contains("&&") || cpart.value2(NodeKeys.CODE).contains("||")){
        p1 = handleCondition(cpart, p1)
      }
      else{
        var rnode = new PRG_vertex()
        //System.out.println(cpart)
        if(cpart.label != NodeTypes.LITERAL && cpart.label != NodeTypes.BLOCK && cpart.label != NodeTypes.UNKNOWN) {
          if(cpart.value2(NodeKeys.NAME) != "<operator>.minus") {
            rnode.id = p1.num_vertexes
            p1.num_vertexes += 1
            rnode._type = vertextype("COND")
            rnode.stmt = cpart
            rnode.split = 1
            rnode.code = "if(" + cpart.value2(NodeKeys.CODE) + ")"
            p1.vertexes.append(rnode)
          }
        }
      }
    }
    p1
  }

  def create_prg_vertex_for_statement(node: nodes.CfgNode, prg: PRG):PRG ={
    var p = prg
    //System.out.println("currentnode: " + node.value2(NodeKeys.CODE))
    if(node.label == NodeTypes.RETURN){
      var rnode = new PRG_vertex()
      rnode.id = p.num_vertexes
      p.num_vertexes += 1
      rnode._type = vertextype("RETURN")
      rnode.stmt = node
      rnode.code = node.value2(NodeKeys.CODE)
      p.vertexes.append(rnode)
      var parts = node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
      for(part <- parts){
        if(part.label == NodeTypes.CALL && part.value2(NodeKeys.NAME).contains("<operator>") == false &&
          part.value2(NodeKeys.NAME).contains("<operators>") == false) {
          p = create_prg_vertex_for_statement(part, p)
        }
      }

    }
    if(node.label == NodeTypes.CALL){
      var rnode = new PRG_vertex()
      if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
        node.value2(NodeKeys.NAME).contains("<operators>") == false){
        rnode.id = p.num_vertexes
        p.num_vertexes += 1
        rnode._type = vertextype("FUNCALL")
        rnode.stmt = node
        rnode.label = node.value2(NodeKeys.NAME)
        rnode.code = node.value2(NodeKeys.CODE)
        p.vertexes.append(rnode)
        var parts = node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
        for(part <- parts){
            p = create_prg_vertex_for_statement(part, p)
        }
      }
      else{
        if(node.value2(NodeKeys.NAME) == "<operator>.assignment"){
          var parts = node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
          for(part <- parts){
            /*if(part.label == NodeTypes.LITERAL){
              rnode.id = p.num_vertexes
              p.num_vertexes += 1
              rnode._type = vertextype("CONST_ASSIGN")
              rnode.stmt = node
              rnode.code = node.value2(NodeKeys.CODE)
              p.vertexes.append(rnode)
              return p
            }*/
            if(part.label == NodeTypes.CALL){
              if(part.value2(NodeKeys.NAME).contains("<operator>") == false &&
                part.value2(NodeKeys.NAME).contains("<operators>") == false) {
                rnode.id = p.num_vertexes
                p.num_vertexes += 1
                rnode._type = vertextype("FUNCALL")
                rnode.stmt = node
                rnode.label = part.value2(NodeKeys.NAME)
                rnode.code = node.value2(NodeKeys.CODE)
                p.vertexes.append(rnode)
                for(ppart <- part.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l){
                    p = create_prg_vertex_for_statement(ppart, p)
                }
                return p
              }
            }
          }
          rnode.id = p.num_vertexes
          p.num_vertexes += 1
          rnode._type = vertextype("OTHER")
          rnode.stmt = node
          rnode.code = node.value2(NodeKeys.CODE)
          p.vertexes.append(rnode)
        }
        for(node1 <- node.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l){
          p = create_prg_vertex_for_statement(node1, p)
        }
      }
    }
    if(node.in(EdgeTypes.CONDITION).l.isEmpty == false){
      var rnode = new PRG_vertex()
      //System.out.println("******" + node.value2(NodeKeys.CODE) + "*****")
      var condition = node.in(EdgeTypes.CONDITION).cast[nodes.CfgNode].l.head
      if(node.value2(NodeKeys.CODE).contains("&&") || node.value2(NodeKeys.CODE).contains("||")){
        p = handleCondition(node, p)
        return p
      }
      if(node.label != NodeTypes.LITERAL){
        if(node.value2(NodeKeys.NAME) != "<operator>.minus"){
          rnode.id = p.num_vertexes
          p.num_vertexes += 1
          rnode._type = vertextype("COND")
          rnode.stmt = node
          rnode.code = condition.value2(NodeKeys.CODE)
          p.vertexes.append(rnode)
        }
      }
      else{
        rnode.id = p.num_vertexes
        p.num_vertexes += 1
        rnode._type = vertextype("COND")
        rnode.stmt = node
        rnode.code = condition.value2(NodeKeys.CODE)
        p.vertexes.append(rnode)
      }
    }
    p
  }


  def isMemRef(parts: List[nodes.CfgNode]): Boolean = {
    var r = false
    for(part <- parts){
      //System.out.println("-----" + part.value2(NodeKeys.CODE))
      if(isIndirectAccess(part)){
        return true
      }
      if(part.label == NodeTypes.CALL){
        r = isMemRef(part.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l)
      }
    }
    return r
  }

  def handlestmt(suc: nodes.CfgNode, node: PRG_vertex, prg: PRG, cfgNodes: ArrayBuffer[nodes.CfgNode], first:Boolean, handle : Int, layer : Int): PRG = {
    /*if(layer >= 500){
      return prg
    }*/
    var p = prg
    var flag = 0
    var newnode = node
    if(handle == 0){
      for (_suc <-suc.out(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
        var _succ = _suc
        //System.out.println(_succ.value2(NodeKeys.CODE) + "  " + _succ.value2(NodeKeys.LINE_NUMBER) + "layer: " + layer)
        for (vertex <- p.vertexes) {
          if (_succ == vertex.stmt) {
            flag = 1
            p = handlestmt(_succ, vertex, p, cfgNodes, false, 1, layer + 1)
          }
        }
        if(flag == 0){
          p = handlestmt(_succ, new PRG_vertex, p, cfgNodes, false, 0, layer + 1)
        }
        flag = 0
      }
      return p
    }
    //System.out.println("code : " + newnode.code)
    if(p.uses_computed(newnode.id) == 0) {
      if (newnode._type == vertextype("OTHER")) {
        var parts = newnode.stmt.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
        var ismemref = isMemRef(parts)
        if (ismemref) {
          newnode.label = "[memory]"
          newnode.special = 1
        }
        //System.out.println(newnode.code)
        var ret = parts.head
        var rhl : nodes.CfgNode = new nodes.CfgNode {
          override def lineNumber: Option[Integer] = ???

          override def valueMap: util.Map[String, AnyRef] = ???

          override def columnNumber: Option[Integer] = ???

          override def label: String = ???

          override def productElementLabel(n: Int): String = ???

          override def productArity: Int = ???

          override def productElement(n: Int): Any = ???

          override def canEqual(that: Any): Boolean = ???

          override def order: Integer = ???

          override def addEdge(label: Label, inVertex: Vertex, keyValues: Any*): Edge = ???

          override def property[V](cardinality: VertexProperty.Cardinality, key: Label, value: V, keyValues: Any*): VertexProperty[V] = ???

          override def edges(direction: Direction, edgeLabels: Label*): util.Iterator[Edge] = ???

          override def vertices(direction: Direction, edgeLabels: Label*): util.Iterator[Vertex] = ???

          override def properties[V](propertyKeys: Label*): util.Iterator[VertexProperty[V]] = ???

          override def id(): AnyRef = ???

          override def graph(): Graph = ???

          override def remove(): Unit = ???
        }
        if(parts.tail.isEmpty == false){
          rhl = parts.tail.head

        }
        if (ret.label == NodeTypes.IDENTIFIER) {
          if (ret.value2(NodeKeys.TYPE_FULL_NAME).contains('*')) {
            newnode.defs(ret.value2(NodeKeys.CODE)) = "PTR"
          }
          else {
            newnode.defs(ret.value2(NodeKeys.CODE)) = "NPTR"
          }
        }
        else {
          newnode.defs(ret.value2(NodeKeys.CODE)) = "NPTR"
        }
        newnode = findparam(newnode.stmt.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l, newnode, 0)
        if (!first) {
          for (prev <- newnode.stmt.in(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
            var _prev = prev
            breakable {
              while (cfgNodes.contains(_prev) == false) {
                if (_prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                  _prev = _prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                }
                else break
              }
            }
            breakable {
              for (vertex <- p.vertexes) {
                if (_prev == vertex.stmt) {
                  for (key <- vertex.defs.keys) {
                    if (newnode.defs.contains(key) == false) {
                      newnode.defs(key) = vertex.defs(key)
                    }
                  }
                  break
                }
              }
            }
          }
        }
        if(parts.tail.isEmpty == false) {
          if (isIndirectAccess(rhl) || rhl.label == NodeTypes.IDENTIFIER) {
            if (newnode.defs.contains(rhl.value2(NodeKeys.CODE))) {
              if (newnode.defs(rhl.value2(NodeKeys.CODE)) == "FUN-RET") {
                newnode.defs(ret.value2(NodeKeys.CODE)) = "FUN-RET"
              }

            }
          }
        }
        /*
      else{
        newnode = findparam(rhl.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l, newnode, 0)
      }*/

      }
      if (newnode._type == vertextype("COND")) {
        var cond = newnode.stmt
        newnode = findparam(cond.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l, newnode, 0)
        if (!first) {
          for (prev <- cond.in(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
            var _prev = prev
            breakable {
              while (cfgNodes.contains(_prev) == false) {
                if (_prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                  _prev = _prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                }
                else break
              }
            }
            breakable {
              for (vertex <- p.vertexes) {
                if (_prev == vertex.stmt) {
                  for (key <- vertex.defs.keys) {
                    if (newnode.defs.contains(key) == false) {
                      newnode.defs(key) = vertex.defs(key)
                    }
                  }
                  break
                }
              }
            }
          }
        }
        if(cond.label == NodeTypes.LITERAL){
          newnode.label == cond.value2(NodeKeys.CODE)
        }
        else if (isIndirectAccess(cond) || cond.label == NodeTypes.IDENTIFIER) {
          if (newnode.defs.contains(cond.value2(NodeKeys.CODE))) {
            newnode.label = newnode.defs(cond.value2(NodeKeys.CODE)) + "==0"
          }
          else {
            var t = ""
            if (cond.value2(NodeKeys.TYPE_FULL_NAME).contains("*")) {
              t = "PTR"
            }
            else {
              t = "NPTR"
            }
            newnode.label = t + "==0"
          }
        }
        else if (cond.value2(NodeKeys.NAME) == "<operator>.logicalNot" || cond.value2(NodeKeys.NAME).contains("assignment")) {
          var parts = cond.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
          var s = parts.head
          if (isIndirectAccess(s) || s.label == NodeTypes.IDENTIFIER) {
            if (newnode.defs.contains(s.value2(NodeKeys.CODE))) {
              newnode.label = newnode.defs(s.value2(NodeKeys.CODE)) + "==0"
            }
            else {
              var t = ""
              if (s.value2(NodeKeys.TYPE_FULL_NAME).contains("*")) {
                t = "PTR"
              }
              else {
                t = "NPTR"
              }
              newnode.label = t + "==0"
            }
          }

        }
        else if (cond.label == NodeTypes.CALL && cond.value2(NodeKeys.NAME).contains("<operator>") == false &&
          cond.value2(NodeKeys.NAME).contains("<operators>") == false) {
          newnode.label == "NPTR==0"
        }
        else if (cond.value2(NodeKeys.NAME) != "<operator>.logicalNot") {
          //System.out.println(cond.value2(NodeKeys.NAME))
          //System.out.println(cond.value2(NodeKeys.CODE))
          //System.out.println(cond.label)
          var parts = cond.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
          var l = parts.head

          if (parts.tail.isEmpty == true) {
            newnode.label == "NPTR==0"
          }
          else {
          var r = parts.tail.head
          /*
          System.out.println("l: " + l.value2(NodeKeys.CODE) + " " + l.label)
          System.out.println("r: " + r.value2(NodeKeys.CODE) + " " + r.label)*/
          if (l.label == NodeTypes.LITERAL || r.label == NodeTypes.LITERAL) {
            if (l.label == NodeTypes.LITERAL) {
              var num: Int = 0
              if (l.value2(NodeKeys.CODE).contains("0x") || l.value2(NodeKeys.CODE).contains("\'") || l.value2(NodeKeys.CODE).contains('"') || l.value2(NodeKeys.CODE).contains("U") || l.value2(NodeKeys.CODE).contains("u") ||
                l.value2(NodeKeys.CODE).contains("L") || l.value2(NodeKeys.CODE).contains("l") || l.value2(NodeKeys.CODE).contains("B") || l.value2(NodeKeys.CODE).contains("b") ||
                l.value2(NodeKeys.CODE).contains("H") || l.value2(NodeKeys.CODE).contains("h") || l.value2(NodeKeys.CODE).contains(".")|| l.value2(NodeKeys.CODE).contains("0X"))
                num = 1
              else
                num = l.value2(NodeKeys.CODE).toInt
              if (isIndirectAccess(r) || r.label == NodeTypes.IDENTIFIER) {
                if (newnode.defs.contains(r.value2(NodeKeys.CODE))) {
                  if (cond.value2(NodeKeys.NAME) == "<operator>.equals"
                    || cond.value2(NodeKeys.NAME) == "<operator>.notEquals") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "==" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "==PINT"
                      }
                      else {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "==NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<PINT"
                      }
                      else {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<NINT"
                      }
                      else {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<PINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<=PINT"
                      }
                      else {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<=NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<=NINT"
                      }
                      else {
                        newnode.label = newnode.defs(r.value2(NodeKeys.CODE)) + "<=PINT"
                      }
                    }
                  }
                }
                else {
                  var t = ""
                  if (r.value2(NodeKeys.TYPE_FULL_NAME).contains("*")) {
                    t = "PTR"
                  }
                  else {
                    t = "NPTR"
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.equals"
                    || cond.value2(NodeKeys.NAME) == "<operator>.notEquals") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = t + "==" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "==PINT"
                      }
                      else {
                        newnode.label = t + "==NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = t + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<PINT"
                      }
                      else {
                        newnode.label = t + "<NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = t + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<NINT"
                      }
                      else {
                        newnode.label = t + "<PINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = t + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<=PINT"
                      }
                      else {
                        newnode.label = t + "<=NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = t + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<=NINT"
                      }
                      else {
                        newnode.label = t + "<=PINT"
                      }
                    }
                  }
                }
              }
              else {
                var t = "NPTR"
                if (cond.value2(NodeKeys.NAME) == "<operator>.equals"
                  || cond.value2(NodeKeys.NAME) == "<operator>.notEquals") {
                  if (num == 0 || num == 1 || num == -1) {
                    newnode.label = t + "==" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "==PINT"
                    }
                    else {
                      newnode.label = t + "==NINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.greaterThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    newnode.label = t + "<" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<PINT"
                    }
                    else {
                      newnode.label = t + "<NINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.lessThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    num = 0 - num
                    newnode.label = t + "<" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<NINT"
                    }
                    else {
                      newnode.label = t + "<PINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.greaterEqualsThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    newnode.label = t + "<=" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<=PINT"
                    }
                    else {
                      newnode.label = t + "<=NINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.lessEqualsThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    num = 0 - num
                    newnode.label = t + "<=" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<=NINT"
                    }
                    else {
                      newnode.label = t + "<=PINT"
                    }
                  }
                }
              }
            }
            else {
              var num: Int = 0
              if (r.value2(NodeKeys.CODE).contains("0x") || r.value2(NodeKeys.CODE).contains("\'") || r.value2(NodeKeys.CODE).contains('"') || r.value2(NodeKeys.CODE).contains("U") || r.value2(NodeKeys.CODE).contains("u") ||
                r.value2(NodeKeys.CODE).contains("L") || r.value2(NodeKeys.CODE).contains("l") || r.value2(NodeKeys.CODE).contains("B") || r.value2(NodeKeys.CODE).contains("b") ||
                r.value2(NodeKeys.CODE).contains("H") || r.value2(NodeKeys.CODE).contains("h") || r.value2(NodeKeys.CODE).contains(".")|| r.value2(NodeKeys.CODE).contains("0X"))
                num = 1
              else{
                //System.out.println(r.value2(NodeKeys.CODE))
                //System.out.println(r.value2(NodeKeys.CODE).contains('"'))
                if(r.value2(NodeKeys.CODE).toLong > Int.MaxValue){
                  num = 1
                }
                else
                  num =  r.value2(NodeKeys.CODE).toInt
              }

              if (isIndirectAccess(l) || l.label == NodeTypes.IDENTIFIER) {
                if (newnode.defs.contains(l.value2(NodeKeys.CODE))) {
                  if (cond.value2(NodeKeys.NAME) == "<operator>.equals"
                    || cond.value2(NodeKeys.NAME) == "<operator>.notEquals") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "==" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "==PINT"
                      }
                      else {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "==NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<NINT"
                      }
                      else {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<PINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<PINT"
                      }
                      else {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<=NINT"
                      }
                      else {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<=PINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<=PINT"
                      }
                      else {
                        newnode.label = newnode.defs(l.value2(NodeKeys.CODE)) + "<=NINT"
                      }
                    }
                  }
                }
                else {
                  var t = ""
                  if (r.value2(NodeKeys.TYPE_FULL_NAME).contains("*")) {
                    t = "PTR"
                  }
                  else {
                    t = "NPTR"
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.equals"
                    || cond.value2(NodeKeys.NAME) == "<operator>.notEquals") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = t + "==" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "==PINT"
                      }
                      else {
                        newnode.label = t + "==NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = t + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<NINT"
                      }
                      else {
                        newnode.label = t + "<PINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = t + "<" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<PINT"
                      }
                      else {
                        newnode.label = t + "<NINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.greaterEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      num = 0 - num
                      newnode.label = t + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<=NINT"
                      }
                      else {
                        newnode.label = t + "<=PINT"
                      }
                    }
                  }
                  if (cond.value2(NodeKeys.NAME) == "<operator>.lessEqualsThan") {
                    if (num == 0 || num == 1 || num == -1) {
                      newnode.label = t + "<=" + num
                    }
                    else {
                      if (num > 0) {
                        newnode.label = t + "<=PINT"
                      }
                      else {
                        newnode.label = t + "<=NINT"
                      }
                    }
                  }
                }
              }
              else {
                var t = "NPTR"
                if (cond.value2(NodeKeys.NAME) == "<operator>.equals"
                  || cond.value2(NodeKeys.NAME) == "<operator>.notEquals") {
                  if (num == 0 || num == 1 || num == -1) {
                    newnode.label = t + "==" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "==PINT"
                    }
                    else {
                      newnode.label = t + "==NINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.greaterThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    num = 0 - num
                    newnode.label = t + "<" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<NINT"
                    }
                    else {
                      newnode.label = t + "<PINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.lessThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    newnode.label = t + "<" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<PINT"
                    }
                    else {
                      newnode.label = t + "<NINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.greaterEqualsThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    num = 0 - num
                    newnode.label = t + "<=" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<=NINT"
                    }
                    else {
                      newnode.label = t + "<=PINT"
                    }
                  }
                }
                if (cond.value2(NodeKeys.NAME) == "<operator>.lessEqualsThan") {
                  if (num == 0 || num == 1 || num == -1) {
                    newnode.label = t + "<=" + num
                  }
                  else {
                    if (num > 0) {
                      newnode.label = t + "<=PINT"
                    }
                    else {
                      newnode.label = t + "<=NINT"
                    }
                  }
                }
              }
            }
          }
          else {
            newnode.label = "NPTR==0"
          }
        }
      }
      }
      if (newnode._type == vertextype("FUNCALL")) {
        var parts = newnode.stmt.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
        if (newnode.stmt.value2(NodeKeys.NAME) == "<operator>.assignment") {
          var ret = parts.head
          var rhl = parts.tail.head
          newnode.defs(ret.value2(NodeKeys.CODE)) = "FUN-RET"
          newnode = findparam(rhl.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l, newnode, 0)
          if (!first) {
            for (prev <- newnode.stmt.in(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
              var _prev = prev
              breakable {
                while (cfgNodes.contains(_prev) == false) {
                  if (_prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                    _prev = _prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                  }
                  else break
                }
              }
              breakable {
                for (vertex <- p.vertexes) {
                  if (_prev == vertex.stmt) {
                    for (key <- vertex.defs.keys) {
                      if (newnode.defs.contains(key) == false) {
                        newnode.defs(key) = vertex.defs(key)
                      }
                    }
                    break
                  }
                }
              }
            }
          }
        }
        else {
          //System.out.println(newnode.stmt.value2(NodeKeys.NAME))
          newnode = findparam(parts, newnode, 0)
          //System.out.println(newnode.usesindex.toList.length)
          if (!first) {
            for (prev <- newnode.stmt.in(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
              var _prev = prev
              breakable {
                while (cfgNodes.contains(_prev) == false) {
                  if (_prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                    _prev = _prev.in(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                  }
                  else break
                }
              }
              breakable {
                for (vertex <- prg.vertexes) {
                  if (_prev == vertex.stmt) {
                    for (key <- vertex.defs.keys) {
                      if (newnode.defs.contains(key) == false) {
                        newnode.defs(key) = vertex.defs(key)
                      }
                    }
                    break
                  }
                }
              }
            }
          }
        }
      }
      if (newnode._type == vertextype("RETURN")) {
        newnode.label = "return"
      }
      p.uses_computed(newnode.id) = 1
      p.vertexes(newnode.id) = newnode
      /*
      if (newnode._type == vertextype("COND")){
        var cond = newnode.stmt
        //System.out.println(cond.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.length)
        //System.out.println(cond.value2(NodeKeys.CODE) + "&&&")
        for (succ <- cond.out(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
          System.out.println(succ.value2(NodeKeys.CODE))
          var _succ = succ
          breakable {
            while (cfgNodes.contains(_succ) == false) {
              if (_succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
                _succ = _succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.head
                System.out.println('\t' + "_succ" + _succ.value2(NodeKeys.CODE))
              }
              else {
                break
              }
            }
          }
          //p = handlestmt(_succ, p, cfgNodes, false)

          breakable {
            for (vertex <- p.vertexes) {
                if (_succ == vertex.stmt) {
                  p = handlestmt(vertex, p, cfgNodes, false)
                  break
                }
            }
          }
        }
    }*/
        //System.out.println(newnode.stmt.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.length)
        for (succ <- newnode.stmt.out(EdgeTypes.CFG).cast[nodes.CfgNode].l) {
          var _succ = succ
          //System.out.println("---" + _succ.value2(NodeKeys.CODE))
          for (vertex <- p.vertexes) {
            if (_succ == vertex.stmt) {
              flag = 1
              p = handlestmt(_succ, vertex, p, cfgNodes, false, 1, layer + 1)
            }
          }
          if(flag == 0){
            p = handlestmt(_succ, new PRG_vertex, p, cfgNodes, false, 0, layer + 1)
          }
          flag = 0
          /*
          while (_succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
            System.out.println(_succ.value2(NodeKeys.CODE))
            for(__succ <- _succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l){
              for (vertex <- p.vertexes) {
                if (__succ == vertex.stmt) {
                  p = handlestmt(vertex, p, cfgNodes, false, 1)
                }
              }
            }
          }*/
        }
    }
    p
  }

  def finduse2use(vertex: PRG_vertex, params: ArrayBuffer[String], succs: List[nodes.CfgNode], walkednodes: ArrayBuffer[nodes.CfgNode], prg : PRG): (PRG, ArrayBuffer[nodes.CfgNode])={
    var flag = 0
    var walkednode = walkednodes
    var p = prg
    breakable {
      for (succ <- succs) {
        //System.out.println("walkednodes length: " + walkednode.length)
        if (walkednode.contains(succ) == false){
          walkednode.append(succ)
        }
        else break
        var _succ = succ
        flag = 0
        while (flag == 0) {
          //System.out.println(_succ.value2(NodeKeys.CODE) + " line: " + _succ.value2(NodeKeys.LINE_NUMBER))
          for (v <- p.vertexes) {
            if (_succ == v.stmt) {
              if (v._type == vertextype("FUNCALL")) {
                for(param <- params){
                  if(v.usesindex.contains(param)){
                    var e = new PRG_edge
                    e._type = edgetype("usetouse")
                    if(vertex.id <= v.id){
                      e.from = vertex
                      e.to = v
                      e.fromop = vertex.usesindex(param)
                      e.toop = v.usesindex(param)
                      e.label = "DS_" + e.fromop + "_" + vertex.label + "-0_" + e.toop
                      p.edges.append(e)
                    }
                    else{
                      e.from = v
                      e.to = vertex
                      e.fromop = v.usesindex(param)
                      e.toop = vertex.usesindex(param)
                      e.label = "DS_" + e.fromop + "_" + vertex.label + "-0_" + e.toop
                      p.edges.append(e)
                    }
                  }
                }
              }

            }
          }
          if (flag == 0) {
            if (_succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l.isEmpty == false) {
              var res = finduse2use(vertex, params, _succ.out(EdgeTypes.CFG).cast[nodes.CfgNode].l, walkednode, p)
              p = res._1
              flag = 1
            }
            else flag = 1
            //System.out.println("findusestmt: " + _succ.value2(NodeKeys.CODE) + _succ.value2(NodeKeys.LINE_NUMBER))
          }
        }
      }
    }
    (p, walkednode)
  }

  def computePRG(cfgNodes: ArrayBuffer[nodes.CfgNode]) : PRG = {
    var prg = new PRG()
    var newcfgNodes : ArrayBuffer[nodes.CfgNode] = new ArrayBuffer[nodes.CfgNode]()
    prg.num_stmts = cfgNodes.length
    for(node <- cfgNodes){
      prg = create_prg_vertex_for_statement(node, prg)
    }
    if(prg.num_vertexes == 0)
      return prg
    var i = 0
    while(i < prg.num_vertexes){
      prg.uses_computed.append(0)
      newcfgNodes.append(prg.vertexes(i).stmt)
      i += 1
    }
    //tranverse CFG calculate var info
    var suc = new nodes.CfgNode {
      override def valueMap: util.Map[String, AnyRef] = ???

      override def label: String = ???

      override def productElementLabel(n: Int): String = ???

      override def lineNumber: Option[Integer] = ???

      override def columnNumber: Option[Integer] = ???

      override def addEdge(label: Label, inVertex: Vertex, keyValues: Any*): Edge = ???

      override def property[V](cardinality: VertexProperty.Cardinality, key: Label, value: V, keyValues: Any*): VertexProperty[V] = ???

      override def edges(direction: Direction, edgeLabels: Label*): util.Iterator[Edge] = ???

      override def vertices(direction: Direction, edgeLabels: Label*): util.Iterator[Vertex] = ???

      override def properties[V](propertyKeys: Label*): util.Iterator[VertexProperty[V]] = ???

      override def id(): AnyRef = ???

      override def graph(): Graph = ???

      override def remove(): Unit = ???

      override def productArity: Int = ???

      override def productElement(n: Int): Any = ???

      override def order: Integer = ???

      override def canEqual(that: Any): Boolean = ???
    }

    prg = handlestmt(suc, prg.vertexes(0), prg, newcfgNodes, true, 1, 1)

    for(vertex <- prg.vertexes){
      if(vertex._type == vertextype("FUNCALL")){
        //System.out.println(vertex.stmt.value2(NodeKeys.CODE))
        if (vertex.stmt.value2(NodeKeys.NAME) == "<operator>.assignment") {
          //System.out.println("------------" )
          //System.out.println(vertex.stmt.value2(NodeKeys.CODE) + vertex.stmt.value2(NodeKeys.LINE_NUMBER))
          var parts = vertex.stmt.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
          var ret = parts.head.value2(NodeKeys.CODE)
          var succs = vertex.stmt.out(EdgeTypes.REACHING_DEF).cast[nodes.CfgNode].l
          var flag = 0
          var ustmt = new ArrayBuffer[PRG_vertex]()
          for(succ <- succs){
            var _succ = succ
            flag = 0
            //System.out.println("usestmt: " + _succ.value2(NodeKeys.CODE) + _succ.value2(NodeKeys.LINE_NUMBER))
            while(flag == 0) {
              for (v <- prg.vertexes) {
                if (_succ == v.stmt) {
                  if(v._type == vertextype("FUNCALL")){
                    ustmt.append(v)
                  }
                  flag = 1
                  if (v.usesindex.contains(ret)) {
                    if (v._type == vertextype("COND")) {
                      var e = new PRG_edge
                      e._type = edgetype("definetouse")
                      e.from = vertex
                      e.to = v
                      e.fromop = 0
                      e.toop = 0
                      e.label = "DF_" + vertex.label + "-0_0"
                      prg.edges.append(e)
                    }
                    else {
                      var e = new PRG_edge
                      e._type = edgetype("definetouse")
                      e.from = vertex
                      e.to = v
                      e.fromop = 0
                      e.toop = v.usesindex(ret)
                      e.label = "DF_" + vertex.label + "-0_" + e.toop
                      prg.edges.append(e)
                    }
                  }
                  else {
                      var e = new PRG_edge
                      e._type = edgetype("definetouse")
                      e.from = vertex
                      e.to = v
                      e.fromop = 0
                      e.toop = 0
                      e.label = "DF_" + vertex.label + "-0_0"
                      prg.edges.append(e)
                  }
                }
              }
              if(flag == 0){
                if(_succ.in(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l.isEmpty == false){
                  _succ = _succ.in(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l.head
                }
                else flag = 1
                //System.out.println("findusestmt: " + _succ.value2(NodeKeys.CODE) + _succ.value2(NodeKeys.LINE_NUMBER))
              }
            }
          }
          for(i <- 0 until ustmt.length){
           for(j <- i until ustmt.length){
             var e = new PRG_edge
             e._type = edgetype("usetouse")
             if(ustmt(i).id <= ustmt(j).id){
               e.from = ustmt(i)
               e.to = ustmt(j)
               if(ustmt(i).usesindex.contains(ret) && ustmt(j).usesindex.contains(ret)){
                 e.fromop = ustmt(i).usesindex(ret)
                 e.toop = ustmt(j).usesindex(ret)
                 e.label = "DS_" + e.fromop + "_" + vertex.label + "-0_" + e.toop
                 prg.edges.append(e)
               }
             }
             else{
               e.from = ustmt(j)
               e.to = ustmt(i)
               if(ustmt(j).usesindex.contains(ret) && ustmt(i).usesindex.contains(ret)){
                 e.fromop = ustmt(j).usesindex(ret)
                 e.toop = ustmt(i).usesindex(ret)
                 e.label = "DS_" + e.fromop + "_" + vertex.label + "-0_" + e.toop
                 prg.edges.append(e)
               }
             }

           }
          }
          var parts1 = new ArrayBuffer[String]()
          //System.out.println(vertex.stmt.value2(NodeKeys.CODE))
          for(key <- vertex.usesindex.keys){
            //System.out.println("params: " + key)
            parts1.append(key)
          }
          var succs1 = vertex.stmt.out(EdgeTypes.CFG).cast[nodes.CfgNode].l
          var walkednodes = new ArrayBuffer[nodes.CfgNode]()
          var res = finduse2use(vertex, parts1, succs1, walkednodes, prg)
          prg = res._1
        }

        else{
          var parts = new ArrayBuffer[String]()
          for(key <- vertex.usesindex.keys){
            parts.append(key)
          }
          var succs = vertex.stmt.out(EdgeTypes.CFG).cast[nodes.CfgNode].l
          var walkednodes = new ArrayBuffer[nodes.CfgNode]()
          var res = finduse2use(vertex, parts, succs, walkednodes, prg)
          prg = res._1

        }

      }
    }
    //System.out.println("222222222")

    val a1 = prg.edges.clone()
    val a2 = prg.edges.clone()
    //System.out.println(a1.length)
    if(a1.length <= 4000){
      for(e1 <- a1){
        for(e2 <- a2){
          if(e1.from.id == e2.from.id && e1.to.id != e2.to.id ){
            var e = new PRG_edge
            e._type = edgetype("usetouse")
            if(e1.to.id <= e2.to.id){
              e.from.id= e1.to.id
              e.to.id = e2.to.id
              e.fromop = e1.fromop
              e.toop = e2.toop
            }
            else{
              e.from.id= e2.to.id
              e.to.id = e1.to.id
              e.fromop = e2.fromop
              e.toop = e1.toop
            }
            if(e1.label.contains("DS")){
              e.label = e1.label
              prg.edges.append(e)
            }
            else if(e2.label.contains("DS")){
              e.label = e2.label
              prg.edges.append(e)
            }

          }
        }
      }
    }
    return prg

  }


  def main(args: Array[String]): Unit = {
    val path = args(0)
    val dir = args(1)
    var sc_dir = args(2)
    val sourcedir = getFiles(new File(path))
    val cpgSet = sourcedir.filter(_.getAbsolutePath.endsWith("zip"))
    for (cpgfile <- cpgSet) {
      val cpgname = cpgfile.getAbsolutePath
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
          //outputFilename = filename + ".prg.xml"
          outputFilename = cpgname.replace(dir, sc_dir + "/scs/NAR/ResultFiles")
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
          outputFilename += ".prg.xml"
          f = new File(outputFilename)
          if(!f.exists()){
            f.createNewFile()
          }
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
          var functions = <functions num={numMethods.toString}></functions>
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
                  System.out.println(id + "----Function: " + methodName)
                  for (node <- _cfgNodes) {
                    //System.out.println(node.value2(NodeKeys.CODE) + " line: " + node.value2(NodeKeys.LINE_NUMBER))
                    //System.out.println(node.out(EdgeTypes.CFG).l.length)
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
                  /*
                    for (node <- cfgNodes) {
                      System.out.println(node.value2(NodeKeys.CODE) + " line: " + node.value2(NodeKeys.LINE_NUMBER))
                    }*/
                  for (ast <- method.out(EdgeTypes.AST).l) {
                    if (ast.label == "METHOD_RETURN") {
                      System.out.println("rettype:" + ast.value2(NodeKeys.TYPE_FULL_NAME))
                    }
                  }


                  var i = 1
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
                  var function = <function name={methodName} id={id.toString} sourcepath={filename} sLine={sLine.toString} eLine={eLine.toString}></function>
                  var prg = computePRG(cfgNodes)
                 // System.out.println(methodName + " " + prg.num_vertexes + " " + prg.num_stmts)
                  //for (vertex <- prg.vertexes) {
                  //  System.out.println(vertex.code + " " + vertex.label + " " + vertex._type)
                    /*for(key <- vertex.usesindex.keys){
                        System.out.println('\t' + key + ": " + vertex.usesindex(key))
                      }*/
                    /*for(defStmt <- vertex.stmt.in(EdgeTypes.REACHING_DEF).l){
                        System.out.println('\t' + defStmt.value2(NodeKeys.CODE))
                      }*/
                 // }
                  //System.out.println(prg.edges.length)
                 // for (edge <- prg.edges) {
                 //   System.out.println("from: " + edge.from.stmt.value2(NodeKeys.CODE) + " " + edge.fromop + " to:" + edge.to.stmt.value2(NodeKeys.CODE) + " " + edge.toop + " label:" + edge.label)
                 // }
                  //System.out.println("111111111111111111")
                  var vertexes = <Vertexes num={prg.vertexes.length.toString}></Vertexes>
                  for (v <- prg.vertexes) {
                    var ops = 0
                    if(v._type == vertextype("FUNCALL")){
                      var parts = v.stmt.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l
                      if (v.stmt.value2(NodeKeys.NAME) == "<operator>.assignment") {
                        var ret = parts.head
                        var rhl = parts.tail.head
                        ops = rhl.out(EdgeTypes.ARGUMENT).cast[nodes.CfgNode].l.length + 1
                      }
                      else{
                        ops = parts.length + 1
                      }
                    }
                    else ops = 1
                    var vertex = <V id={v.id.toString} t={v._type.toString} s={v.special.toString} ops={ops.toString}></V>
                    var l = <L>{v.label}</L>
                    var s = <S l={v.stmt.value2(NodeKeys.LINE_NUMBER).toString}>{v.code}</S>
                    vertex = vertex.copy(child = vertex.child ++ l)
                    vertex = vertex.copy(child = vertex.child ++ s)
                    vertexes = vertexes.copy(child = vertexes.child ++ vertex)
                  }
                  function = function.copy(child = function.child ++ vertexes)
                  var edges = <Edges num={prg.edges.length.toString}></Edges>
                  var edge = new NodeBuffer
                  for (e <- prg.edges) {
                    if(e.label.contains("DF")){
                      edge += <E F={e.from.id.toString} T={e.to.id.toString} t="0" OF={e.fromop.toString} OT={e.toop.toString}>{e.label}</E>
                    }
                    else edge += <E F={e.from.id.toString} T={e.to.id.toString} t="1" OF={e.fromop.toString} OT={e.toop.toString}>{e.label}</E>
                  }
                  edges = edges.copy(child = edges.child ++ edge)
                  function = function.copy(child = function.child ++ edges)
                  functions = functions.copy(child = functions.child ++ function)
                  id += 1
                }
              }
            }

          }
          XML.save(outputFilename, functions)
        }

      }
    }


  }

}
