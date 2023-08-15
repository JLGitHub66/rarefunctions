package io.shiftleft.joern

import io.shiftleft.fuzzyc2cpg.FuzzyC2Cpg

import java.io.File
import scala.util.control.Breaks.{break, breakable}

object gencpg {

  private def getFiles(inputs: File*): Seq[File] = {
    inputs.filter(_.isFile) ++
      inputs.filter(_.isDirectory).flatMap(dir => getFiles(dir.listFiles(): _*))
  }

  private def generateCPG(input: String, output: String) = {
    val inputFilename = Set(input)
    val fuzzyc2Cpg = new FuzzyC2Cpg(output)
    fuzzyc2Cpg.runAndOutput(inputFilename, Set(".cc", ".cpp", ".cxx", ".c", ".java"))
    Cpg2Scpg.run(output, true, "default.semantics")
  }

  def main(args: Array[String]): Unit = {
    //val path = args(0)
    val path = "/Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/TestExample/test" /////////////////////////////////path/////////////////////////////////
    println("path = " + path)
    val sourcedir = getFiles(new File(path))
    val fileSet = sourcedir.filter(_.getAbsolutePath.endsWith(".cc")) ++
      sourcedir.filter(_.getAbsolutePath.endsWith(".cpp")) ++
      sourcedir.filter(_.getAbsolutePath.endsWith(".cxx")) ++
      sourcedir.filter(_.getAbsolutePath.endsWith(".c")) ++
      sourcedir.filter(_.getAbsolutePath.endsWith(".java"))
    var filename = List[String]()
    for (file <- fileSet) {
      filename = filename :+ file.getAbsolutePath
    }
    println(filename)
    for (name <- filename) {
      println("!!!!!!!!!!!!start gencfg .bin.zip: " + name)
      val idx = name.lastIndexOf('.')
      val outputFilename = name.substring(0, idx) + ".bin.zip"
      val fzip = new File(outputFilename)
      val fsrc = new File(name)
      breakable {
        if (fzip.exists() && fzip.lastModified() >= fsrc.lastModified()) {
          System.out.println(name + " skip")
          break
        } else {
          try{
            generateCPG(name, outputFilename)
          } catch {
            case e: ArithmeticException => println(e)
            case ex: Throwable =>println("!!!!!!!!!!!!found a unknown exception: "+ ex)
            //由于会产生NoSuchElementException的报错，所以在这里添加对错误的处理，输出到日志记录中，并越过异常，继续处理。2022.5.9 mark
            //catch处理程序有两种情况。 第一种情况将只处理算术类型异常。
            // 第二种情况有Throwable类，它是异常层次结构中的超类。第二种情况可以处理任何类型的异常在程序代码中。有时当不知道异常的类型时，可以使用超类 - Throwable类。
            //https://blog.csdn.net/love284969214/article/details/82731774
            //在这里后来分析，存在问题的可能是不是由于代码中压根就没法产生所需要的cfg？比如压根就没有正常的函数定义？  mark 2022.5.9
          }
        }
      }
    }

  }

}
