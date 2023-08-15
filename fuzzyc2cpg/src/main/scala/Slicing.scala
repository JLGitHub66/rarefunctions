import java.io.File

import gremlin.scala._

import scala.io.Source
import io.shiftleft.dataflowengine.language._
import io.shiftleft.codepropertygraph.generated.{EdgeKeys, EdgeTypes, NodeKeys, NodeTypes, nodes}
import io.shiftleft.semanticcpg.language._
import io.shiftleft.Implicits.JavaIteratorDeco

import scala.collection.mutable.ArrayBuffer
import scala.xml._
import java.io.{ByteArrayOutputStream, PrintStream}
import java.nio.charset.StandardCharsets

import dnl.utils.text.table.TextTable
import io.shiftleft.joern.CpgLoader

import scala.collection.mutable.Map
import io.shiftleft.semanticcpg.language.nodemethods.CfgNodeMethods
import io.shiftleft.semanticcpg.utils.{ExpandTo, MemberAccess}
import org.apache.tinkerpop.gremlin.structure.Direction

import scala.collection.JavaConverters._
import scala.util.control.Breaks._

object Slicing {
  private class sensitive_clue(paramscount : Int, funcname : String){
    var name : String = funcname
    var params_count : Int = paramscount
    var params : ArrayBuffer[Int] = new ArrayBuffer[Int]()
    var slicing_num = 0
  }

  private class slicing{
    var rows : List[String] = List[String]()
    var norm_rows : List[String] = List[String]()
    var stmts : List[Vertex] = List[Vertex]()
    var method : String = ""
  }

  private class method(methodname: String, startLine: Int, endLine: Int, gp: Int ){
    var name : String = methodname
    var sLine : Int = startLine
    var eLine : Int = endLine
    var gap : Int = gp
  }



  private def findunk1(nodes: List[Vertex], nodeset : Set[Vertex]): Boolean ={
    var newnodeset = nodeset
    for(node <- nodes){
      breakable{
        if(newnodeset.exists(s => s == node) == true){
          break
        }
        newnodeset = nodeset + node
        if(node.label == NodeTypes.UNKNOWN){
          return true
        }
        var flag = findunk1(node.in(EdgeTypes.CFG).l, newnodeset)
        return flag
      }
    }
    false
  }

  private def is_valid_character(c : Char): Int =
  {
    if(c == ' ' || c == '\n' || c == '\r' || c == '\t'
      || c == '(' || c == ')' || c == ';')
      return 0;
    return 1;
  }


  private def hashpjw(key : String) : Int =
  {
    if(key == "")
      return 0
    var value = 0
    var i = 0
    while(i != key.length)
    {
      var tmp = 0
      if(is_valid_character(key(i)) == 1)
      {
        value = (value << 4) + key(i)
        if((tmp = (value & 0xf0000000)) != 0)
        {
          value = value ^ (tmp >> 24)
          value = value ^ tmp
        }
      }
      i += 1
    }
    value = value & Integer.MAX_VALUE
    value = value % 4999999
    return value
  }


  def getNormStmt(trackingPoint : Vertex, result: String): String ={
    var normStmt = result
    //System.out.println(trackingPoint.label  + " " + trackingPoint.value2(NodeKeys.CODE))
    val normNodes = trackingPoint.out(EdgeTypes.ARGUMENT).l

    var times = 0
    //System.out.println(trackingPoint.label)
    //System.out.println(normNodes.length)
    if(trackingPoint.label == NodeTypes.METHOD_PARAMETER_IN){
      normStmt += "(" + trackingPoint.value2(NodeKeys.TYPE_FULL_NAME) + ")"
      return normStmt
    }
    if(trackingPoint.label == NodeTypes.IDENTIFIER){
      normStmt += "(" + trackingPoint.value2(NodeKeys.TYPE_FULL_NAME) + ")"
      return normStmt
    }
    if(trackingPoint.label == NodeTypes.LITERAL){
      normStmt += trackingPoint.value2(NodeKeys.CODE)
      return normStmt
    }
    if(trackingPoint.label == NodeTypes.CONTROL_STRUCTURE){
      if(trackingPoint.value2(NodeKeys.CODE).contains("if") == true){
        //System.out.println(trackingPoint.out(EdgeTypes.CONDITION).l.head.value2(NodeKeys.CODE))
        normStmt += "if("
        normStmt = getNormStmt(trackingPoint.out(EdgeTypes.CONDITION).l.head, normStmt)
        normStmt += ")"
        return normStmt
      }
      if(trackingPoint.value2(NodeKeys.CODE).contains("while") == true){
        //System.out.println(trackingPoint.out(EdgeTypes.CONDITION).l.head.value2(NodeKeys.CODE))
        normStmt += "while("
        normStmt = getNormStmt(trackingPoint.out(EdgeTypes.CONDITION).l.head, normStmt)
        normStmt += ")"
        return normStmt
      }
      if(trackingPoint.value2(NodeKeys.CODE).contains("for") == true){
        normStmt += "if("
        normStmt = getNormStmt(trackingPoint.out(EdgeTypes.CONDITION).l.head, normStmt)
        normStmt += ")"
        return normStmt
      }
      if(trackingPoint.value2(NodeKeys.CODE).contains("do") == true){
        normStmt = trackingPoint.value2(NodeKeys.CODE)
        return normStmt
      }
      if(trackingPoint.value2(NodeKeys.CODE).contains("switch") == true){
        normStmt += "switch("
        normStmt = getNormStmt(trackingPoint.out(EdgeTypes.CONDITION).l.head, normStmt)
        normStmt += ")"
        return normStmt
      }
    }
    //if(trackingPoint.label == NodeTypes.BLOCK){
    //  System.out.println(trackingPoint.value2(NodeKeys.CODE))
    //}
    if(trackingPoint.value2(NodeKeys.NAME).contains("<operator>") == false &&
      trackingPoint.value2(NodeKeys.NAME).contains("<operators>") == false){
      normStmt += trackingPoint.value2(NodeKeys.NAME) + "("
      var i = 1

      for(node <- normNodes){
        if(node.label == NodeTypes.IDENTIFIER) {
          if(i != normNodes.length){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + "), "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }

        }
        if(node.label == NodeTypes.CALL){
          if(i != normNodes.length){
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
              normStmt += ", "
            }
            else{
              normStmt += "(ANY), "
            }
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "(ANY)"
            }
          }
        }
        if(node.label == NodeTypes.LITERAL){
          if(i != normNodes.length){
            normStmt += node.value2(NodeKeys.CODE) + ", "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
        i += 1
      }
      normStmt += ")"
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.addition"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") + "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " + "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " + "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.subtraction"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") - "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " - "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " - "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.multiplication"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") * "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " * "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " * "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.division"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") / "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " / "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " / "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.modulo"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") % "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " % "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " % "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.shiftLeft"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") << "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " << "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " << "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME).contains("ShiftRight") == true){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") >> "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " >> "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " >> "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.not"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "~(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt += "~"
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += "~" + node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.logicalNot"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "!(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt += "!"
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += "!" + node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.and"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") & "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " & "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " & "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.logicalAnd"){
      for(node <- normNodes){
        //System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") && "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " && "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " && "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.or"){
      for(node <- normNodes){
        // System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") | "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " | "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " | "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.logicalOr"){
      for(node <- normNodes){
        // System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") || "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " || "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " || "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.xor"){
      for(node <- normNodes){
        // System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") ^ "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " ^ "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " ^ "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.assignment"){
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") = "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " = "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.minus"){
      for(node <- normNodes){
        // System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "-(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt += "-"
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += "-" + node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.plus"){
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "+(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt += "+"
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += "+" + node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.preIncrement"){
      for(node <- normNodes){
        // System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "++(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt += "++"
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += "++" + node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.preDecrement"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "--(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt += "--"
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += "--" + node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.postIncrement"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")++"
        }
        if(node.label == NodeTypes.CALL){
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
          normStmt += "++"
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE) + "++"
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.postDecrement"){
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")--"
        }
        if(node.label == NodeTypes.CALL){
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
          normStmt += "--"
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE) + "--"
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.equals"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") == "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " == "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " == "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.notEquals"){
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") != "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " != "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " != "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.greaterThan"){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") > "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " > "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " > "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.lessThan"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") < "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " < "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " < "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.greaterEqualsThan"){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") >= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " >= "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " >= "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.lessEqualsThan"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") <= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " <= "
          }
          else{
            if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
              node.value2(NodeKeys.NAME).contains("<operators>") == false){
              normStmt = getNormStmt(node, normStmt)
            }
            else{
              normStmt += "("
              normStmt = getNormStmt(node, normStmt)
              normStmt += ")"
            }
          }

        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " <= "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.indirectMemberAccess"){
      for(node <- normNodes){
        //     System.out.println(node.label)
        //System.out.println(node.value2(NodeKeys.NAME))
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")->"
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += "->"
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)
        }
      }
      return normStmt

    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.memberAccess"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + "). "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += "."
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)
        }
      }
      return normStmt

    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.computedMemberAccess"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")["
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")]"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += "["
          }
          else{
            normStmt = getNormStmt(node, normStmt)
            normStmt += "]"
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE) + "]"
        }
      }
      return normStmt

    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.indirection"){
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "*(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt += "*"
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += "*" + node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.conditional"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") ? "
          }
          else if(times == 2){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") : "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " ? "
          }
          else if(times == 2){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " : "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }
        }
        if(node.label == NodeTypes.LITERAL){
          times += 1
          if(times == 1){
            normStmt += node.value2(NodeKeys.CODE) + " ? "
          }
          else if(times == 2){
            normStmt += node.value2(NodeKeys.CODE) + " : "
          }
          else{
            normStmt += node.value2(NodeKeys.CODE)
          }

        }
      }
      return normStmt

    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.cast"){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.UNKNOWN){
          normStmt += "(" + node.value2(NodeKeys.CODE) + ")"
        }
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)
        }

      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.addressOf"){
      normStmt += "&"
      for(node <- normNodes){
        // System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
        }
        if(node.label == NodeTypes.CALL){
          if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
            node.value2(NodeKeys.NAME).contains("<operators>") == false){
            normStmt = getNormStmt(node, normStmt)
          }
          else{
            normStmt += "("
            normStmt = getNormStmt(node, normStmt)
            normStmt += ")"
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.sizeOf"){
      normStmt += "sizeof("
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          normStmt += ")"
        }
        if(node.label == NodeTypes.CALL){
          normStmt = getNormStmt(node, normStmt)
          normStmt += ")"
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)
          normStmt += ")"
        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.assignmentPlus"){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") += "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " += "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.assignmentMinus"){
      for(node <- normNodes){
        //   System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") -= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " -= "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.assignmentMultiplication"){
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") *= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " *= "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operator>.assignmentDivision"){
      for(node <- normNodes){
        //  System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") /= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " /= "
          }
          else {
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operators>.assignmentModulo"){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") %= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " %= "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operators>.assignmentShiftLeft"){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") <<= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " <<= "
          }
          else {
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME).contains("ShiftRight") == true&&
      trackingPoint.value2(NodeKeys.NAME).contains("<operators>") == true){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") >>= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " >>= "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operators>.assignmentAnd"){
      for(node <- normNodes){
        //     System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") &= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " &= "
          }
          else {
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operators>.assignmentOr"){
      for(node <- normNodes){
        //    System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") |= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " |= "
          }
          else {
            normStmt = getNormStmt(node, normStmt)
          }
        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    if(trackingPoint.value2(NodeKeys.NAME) == "<operators>.assignmentXor"){
      for(node <- normNodes){
        //     System.out.println(node.label)
        if(node.label == NodeTypes.IDENTIFIER){
          times += 1
          if(times == 1){
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ") ^= "
          }
          else{
            normStmt += "(" + node.value2(NodeKeys.TYPE_FULL_NAME) + ")"
          }
        }
        if(node.label == NodeTypes.CALL){
          times += 1
          if(times == 1){
            normStmt = getNormStmt(node, normStmt)
            normStmt += " ^= "
          }
          else{
            normStmt = getNormStmt(node, normStmt)
          }

        }
        if(node.label == NodeTypes.LITERAL){
          normStmt += node.value2(NodeKeys.CODE)

        }
      }
      return normStmt
    }
    normStmt
  }

  def gethash(node: Vertex): Int = {
    var hash = 0

    if(node.label == NodeTypes.CALL){
      if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
        node.value2(NodeKeys.NAME).contains("<operators>") == false){
        hash = hashpjw(node.value2(NodeKeys.NAME))
        //System.out.println(node.value2(NodeKeys.NAME))
        //System.out.println(hash)
        return hash
      }
      else{
        var nodes = node.out(EdgeTypes.ARGUMENT).l
        for(part <- nodes){
          hash = gethash(part)
        }
      }
    }
    hash
  }

  private def dumpSlice(slicingSet: List[slicing], filename: String, res_dir: String, methodlistMap: Map[String, method], src_dir: String):Unit = {
    var outputFilename = filename.replace(src_dir, res_dir)
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
    outputFilename += ".ps.xml"
    f = new File(outputFilename)
    if(!f.exists()){
      f.createNewFile()
    }
    var num = 0
    var functions = <functions num={slicingSet.length.toString}></functions>
    for(slice <- slicingSet){
      var function = <function name={slice.method} id={num.toString} sourcepath={filename} sLine={methodlistMap(slice.method).sLine.toString} eLine={methodlistMap(slice.method).eLine.toString} stmts_count={slice.rows.length.toString}></function>
      for(i <- 0 until slice.rows.length){
        val row = slice.rows(i).split("\t")
        val norm_row = slice.norm_rows(i).split("\t")
        val statement = row(0)
        val norm_statement = norm_row(0)
        val line = row(1)
        val col = row(2)
        var hash = gethash(slice.stmts(i))
        if(hash == 0 || slice.stmts(i).label == NodeTypes.CONTROL_STRUCTURE){
          hash = hashpjw(norm_statement)
        }
        var stmt = <stmt HashValue={hash.toString} StmType="2"></stmt>
        if(slice.stmts(i).label == NodeTypes.CONTROL_STRUCTURE){
          stmt = <stmt HashValue={hash.toString} StmType="1"></stmt>
        }
        val sourcecode = <sourcecode>{norm_statement}</sourcecode>
        val code = <code>{statement}</code>
        val location = <location line={line} row={col}></location>
        stmt = stmt.copy(child = stmt.child ++ sourcecode)
        stmt = stmt.copy(child = stmt.child ++ code)
        stmt = stmt.copy(child = stmt.child ++ location)
        function = function.copy(child = function.child ++ stmt)
      }
      functions = functions.copy(child = functions.child ++ function)
      num += 1
    }
    XML.save(outputFilename, functions)
  }


  def getVariable(stmt: Vertex, idenlist: List[String]): List[String] = {
    var ilist = idenlist
    var nodes = stmt.out(EdgeTypes.ARGUMENT).l
    for(node <- nodes){
      if(node.label == NodeTypes.IDENTIFIER) {
        if (ilist.exists(name => name == node.value2(NodeKeys.NAME)) == false) {
          ilist = ilist :+ node.value2(NodeKeys.NAME)
        }
      }
      if(node.label == NodeTypes.CALL){
        ilist = getVariable(node, ilist)
      }
    }
    ilist
  }

  def findVariable(cfgNode: Vertex, idenlist: List[String]) : Boolean= {
    var result = false
    var nodes = cfgNode.out(EdgeTypes.ARGUMENT).l
    for(node <- nodes){
      if(node.label == NodeTypes.IDENTIFIER) {
        if (idenlist.exists(name => name == node.value2(NodeKeys.NAME)) == true) {
          result = true
          return result
        }
      }
      if(node.label == NodeTypes.CALL){
        result = findVariable(node, idenlist)
      }
    }
    result
  }

  private def indirectAccess(vertex: Vertex): Boolean = {
    if (!vertex.isInstanceOf[nodes.Call]) {
      return false
    }

    val callName = vertex.value2(NodeKeys.NAME)
    MemberAccess.isGenericMemberAccessName(callName)
  }

  private class ReachableByContainer(val reachedSource: Vertex, val path: List[Vertex]) {
    override def clone(): ReachableByContainer = {
      new ReachableByContainer(reachedSource, path)
    }
  }

  private def getTrackingPoint(vertex: Vertex): Option[nodes.TrackingPoint] = {
    vertex match {
      case identifier: nodes.Identifier =>
        getTrackingPoint(identifier.vertices(Direction.IN, EdgeTypes.ARGUMENT).nextChecked)
      case call: nodes.Call                       => Some(call)
      case ret: nodes.Return                      => Some(ret)
      case methodReturn: nodes.MethodReturn       => Some(methodReturn)
      case methodParamIn: nodes.MethodParameterIn => Some(methodParamIn)
      case literal: nodes.Literal                 => getTrackingPoint(literal.vertices(Direction.IN, EdgeTypes.ARGUMENT).nextChecked)
      case _                                      => None
    }
  }

  private def traverseDDGBack(p: List[Vertex], res : List[Vertex], layer: Int): List[Vertex] = {
    //System.out.println("layer: " + layer)
    var path = p
    val node = path.head
    val ddgPredecessors = node.vertices(Direction.IN, EdgeTypes.REACHING_DEF).asScala

    ddgPredecessors.foreach { pred =>
      //System.out.println("pred: " + pred.value2(NodeKeys.CODE))
      getTrackingPoint(pred) match {
        case Some(predTrackingPoint) =>
          if (!path.contains(predTrackingPoint)) {
            if (indirectAccess(node)) {
              path  = traverseDDGBack(predTrackingPoint :: path.tail, path, layer + 1)
            } else {
              path = traverseDDGBack(predTrackingPoint :: node :: path.tail, path, layer + 1)
            }
          }
        case None =>
      }
    }
    path
  }

  private def findCall(v : Vertex, res: List[Vertex]): List[Vertex] ={
    var r = res
    var nodes = v.out(EdgeTypes.ARGUMENT).l
    for(node <- nodes){
      if(node.label == NodeTypes.CALL){
        if(node.value2(NodeKeys.NAME).contains("<operator>") == false &&
          node.value2(NodeKeys.NAME).contains("<operators>") == false) {
          r = r :+ node
          r = findCall(node, r)
        }
        else{
          r = findCall(node, r)
        }
      }
    }
    r
  }

  private def handleslice(p: List[Vertex], gap: Int, method : nodes.Method, sink: Vertex): slicing = {
    var path = p.filter(s => s.label != NodeTypes.UNKNOWN)
    path = path.filter(s => s.value2(NodeKeys.LINE_NUMBER) <= sink.value2(NodeKeys.LINE_NUMBER))
    var slice_stmts = List[Vertex]()
    val baos = new ByteArrayOutputStream()
    val baos_norm = new ByteArrayOutputStream()
    val ps = new PrintStream(baos, true, "utf-8")
    val ps_norm = new PrintStream(baos_norm, true, "utf-8")
    var rows = List[String]()
    var orig_rows = List[String]()
    var norm_rows = List[String]()
    var line_number = List[Int]()
    var column_number = List[Int]()
    path = path.sortBy(s => s.value2(NodeKeys.LINE_NUMBER))
    var cur_line = path.head.value2(NodeKeys.LINE_NUMBER).toInt + gap
    for(i <- 0 until path.length ){
      val lineNumber = path(i).value2(NodeKeys.LINE_NUMBER).toInt + gap
      line_number = line_number :+ lineNumber
      val columnNumber = path(i).value2(NodeKeys.COLUMN_NUMBER).toInt
      column_number = column_number :+ columnNumber
      val trackedSymbol = path(i).value2(NodeKeys.CODE)
      orig_rows = orig_rows :+ s"$trackedSymbol\t${lineNumber.toString}\t${columnNumber.toString}\t" +
        s"${method.name}"
      if (cur_line < lineNumber) {
        cur_line = lineNumber
        rows = rows :+ orig_rows(i - 1)
        //System.out.println(path(i - 1).value2(NodeKeys.NAME))
        slice_stmts = slice_stmts :+ path(i-1)
        norm_rows = norm_rows :+ s"${getNormStmt(path(i-1), "")}\t${line_number(i-1).toString}\t${column_number(i-1).toString}\t${method.name}"
      }
      if (i == path.length - 1) {
        rows = rows :+ orig_rows(i)
        //System.out.println(path(i).value2(NodeKeys.NAME))
        slice_stmts = slice_stmts :+ path(i)
        norm_rows = norm_rows :+ s"${getNormStmt(path(i), "")}\t${line_number(i).toString}\t${column_number(i).toString}\t${method.name}"
      }
    }
    /*
    var idenlist = List[String]()
    for(stmt <- slice_stmts){
      idenlist = getVariable(stmt, idenlist)
    }*/
    var maxline = rows(rows.length - 1).split("\t")(1).toInt
    for(stmt <- slice_stmts){
      var ctrlStmts = stmt.in(EdgeTypes.CDG).l
      for (stmt <- ctrlStmts) {
        if(stmt.in(EdgeTypes.CONDITION).l.isEmpty == false) {
          var condition = stmt.in(EdgeTypes.CONDITION).l.head
          var callstmts = List[Vertex]()
          if(stmt.label == NodeTypes.CALL){
            if (stmt.value2(NodeKeys.NAME).contains("<operator>") == false &&
              stmt.value2(NodeKeys.NAME).contains("<operators>") == false){
              callstmts = callstmts :+ stmt
            }
          }
          callstmts = findCall(stmt, callstmts)
          var l = condition.value2(NodeKeys.LINE_NUMBER).toInt + gap
          var c = condition.value2(NodeKeys.COLUMN_NUMBER).toInt
          if(l <= maxline) {
            if (slice_stmts.exists(stmt => stmt == condition) == false) {
              slice_stmts = slice_stmts :+ condition
              rows = rows :+ s"${condition.value2(NodeKeys.CODE)}\t${l.toString}\t${c.toString}\t${method.name}"
              norm_rows = norm_rows :+ s"${getNormStmt(condition, "")}\t${l.toString}\t${c.toString}\t${method.name}"
            }
            for(cstmt <- callstmts){
              if (slice_stmts.exists(stmt => stmt == cstmt) == false) {
                slice_stmts = slice_stmts :+ cstmt
                rows = rows :+ s"${cstmt.value2(NodeKeys.CODE)}\t${l.toString}\t${c.toString}\t${method.name}"
                norm_rows = norm_rows :+ s"${getNormStmt(cstmt, "")}\t${l.toString}\t${c.toString}\t${method.name}"
              }
            }
          }
        }
      }
    }
    slice_stmts = slice_stmts.sortBy(s => s.value2(NodeKeys.LINE_NUMBER))
    rows = rows.sortBy(r => r.split("\t")(1).toInt)
    norm_rows = norm_rows.sortBy(nr => nr.split("\t")(1).toInt)
    val columnNames = List("tracked", "lineNumber", "columnNumber", "method").toArray
    val data = rows.map(_.split("\t").toArray).toArray.asInstanceOf[Array[Array[Object]]]
    val data_norm = norm_rows.map(_.split("\t").toArray).toArray.asInstanceOf[Array[Array[Object]]]
    new TextTable(columnNames, data).printTable(ps, 1)
    new TextTable(columnNames, data_norm).printTable(ps_norm, 1)
    val content = new String(baos.toByteArray(), StandardCharsets.UTF_8)
    val content_norm = new String(baos_norm.toByteArray(), StandardCharsets.UTF_8)
    //System.out.println(content.toString)
    //System.out.println(content_norm.toString)
    var slice = new slicing()
    slice.rows = rows
    slice.stmts = slice_stmts
    slice.norm_rows = norm_rows
    slice.method = method.name
    ps.close()
    ps_norm.close()
    slice
  }

  private def involvedStmt(slist: List[Vertex], stmt: Vertex): List[Vertex] = {
    var sllist = slist
    var involve = stmt.in(EdgeTypes.REACHING_DEF).l
    if(involve.isEmpty == false){
      //System.out.println("node: " + stmt.value2(NodeKeys.CODE) + "REACHING DEF->")
      for(node <- involve){
        if(sllist.exists(n => n.value2(NodeKeys.CODE) == node.value2(NodeKeys.CODE)) == false){
          //System.out.println(node.value2(NodeKeys.CODE))
          sllist = sllist :+ node
          sllist = involvedStmt(sllist, node)
        }
      }
    }
    sllist
  }

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

  private def doSlicing(src_dir : String, filedir: String, funcname: String, filename : String): Unit ={
    val file_name = "sc.txt"
    val filepath = filedir + funcname + "/" + file_name
    val res_dir = filedir + funcname + "/ResultFiles"
    var slicing_set = List[slicing]()
    var f = new File(res_dir)
    if(!f.exists()){
      f.mkdirs()
    }
    var f1 = new File(filepath)
    if(!f1.exists()){
      return
    }
    val src = Source.fromFile(filepath, "UTF-8")
    val lines = src.getLines().toArray
    //System.out.println("sink :" + funcname)
    val params_count = lines(1).toInt
    var sc = new sensitive_clue(params_count, funcname)
    for(i <- 0 until params_count){
      sc.params += lines(i + 2).toInt
    }
    //System.out.println(sc.params)
    var cpgname = filename.replace(".java", ".bin.zip")
    val cpg = CpgLoader.load(cpgname)
    //val source = cpg.identifier

    var sinks = cpg.call.name(funcname).l
    var methodname = ""
    var methodlistMap : Map[String, method] = Map()
    var nodelistMap : Map[String, List[Vertex] ] = Map()
    var maxlength = 0
    for(sink <- sinks) {
      //System.out.println(sink.value2(NodeKeys.CODE))
      if(sink.in(EdgeTypes.CONTAINS).l.isEmpty == false){
        var method = methodFast(sink)
        methodname = method.name
        //System.out.println("current method: " + methodname)
        //System.out.println(nodelistMap.contains(methodname))
        if(nodelistMap.contains(methodname) == false){
          var path = List[Vertex]()
          var input = List[Vertex]()
          input = input :+ sink
          //System.out.println("slice start!")
          path = traverseDDGBack(input, path, 1)
          //System.out.println("slice done!")
          //var paths = pathReachables.map(_.path)
          /*
          var defStmts = sink.in(EdgeTypes.REACHING_DEF).l
          var slist = List[Vertex]()
          slist = slist :+ sink
          for(defStmt <- defStmts){
            if(slist.exists(s => s.value2(NodeKeys.CODE) == defStmt.value2(NodeKeys.CODE)) == false){
              slist = slist :+ defStmt
              slist = involvedStmt(slist, defStmt)

            }
          }*/
          //for (i <- 0 until paths.length) {
          //var length = paths(i).length
          if (methodlistMap.contains(methodname) == false) {
            var astnodes = method.out(EdgeTypes.CONTAINS).l
            var eLine = 0
            var little = 99999999
            for (node <- astnodes) {
              if (node.label != NodeTypes.TYPE_DECL && node.label != NodeTypes.UNKNOWN) {
                if (node.value2(NodeKeys.LINE_NUMBER) > eLine) {
                  eLine = node.value2(NodeKeys.LINE_NUMBER)
                }
                if (node.value2(NodeKeys.LINE_NUMBER) < little) {
                  little = node.value2(NodeKeys.LINE_NUMBER)

                }
              }
            }
            //System.out.println("little: " + little)
            val sLine = method.lineNumber.getOrElse("N/A").toString.toInt
            //System.out.println("sLine: " + sLine)
            val gap = little - sLine
            eLine += gap + 1
            //System.out.println("eLine: " + eLine)
            var m = new method(methodname, sLine, eLine, gap)
            methodlistMap(methodname) = m
          }
          /*
            if (nodelistMap.contains(methodname)) {
              maxlength = nodelistMap(methodname).length
            }
            else {
              maxlength = 0
            }
            if (length >= maxlength) {
              nodelistMap(methodname) = paths(i)
              //System.out.println("nodelistMap add: " + methodname)
            }
         }
         System.out.println("path number: " + paths.length)*/
          var slice = handleslice(path, methodlistMap(methodname).gap, method, sink)
          slicing_set = slicing_set :+ slice
        }
      }
    }
    //System.out.println("dump start!")
    dumpSlice(slicing_set, filename, res_dir, methodlistMap, src_dir)
    //System.out.println("dump done!")
  }


  def main(args: Array[String]): Unit ={
    val src_dir = args(0)
    val sc_dir = args(1)
    val filepath = sc_dir + "/scs/SlicingList.txt"
    val filedir = sc_dir + "/scs/"
    val source = Source.fromFile(filepath, "UTF-8")
    val lines = source.getLines().toArray
    val filenum = lines(0)
    var i = 1
    var cur_num = 1
    while(i < lines.length)
    {
      var filename = lines(i)
      System.out.println("[" + cur_num + "/" + filenum + "]:" + filename)
      i += 1

      var funcnum = lines(i).toInt
      for(j <- 1 until funcnum + 1){
        i += 1
        if(lines(i).contains("*") == false && lines(i).contains("(")== false && lines(i).contains(")")== false && lines(i).contains("\n")==false
        && lines(i).contains("\"") == false&& lines(i).contains("\\") == false&& lines(i).contains("/") == false&& lines(i).contains(":") == false
          && lines(i).contains("?") == false&& lines(i).contains("<") == false&& lines(i).contains(">") == false&& lines(i).contains("|") == false){
          doSlicing(src_dir, filedir, lines(i), filename)
        }
        //System.out.println(lines(i))
      }
      i += 1
      cur_num += 1
    }



  }

}
