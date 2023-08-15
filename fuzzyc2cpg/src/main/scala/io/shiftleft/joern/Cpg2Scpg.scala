package io.shiftleft.joern

import io.shiftleft.SerializedCpg
import io.shiftleft.dataflowengine.layers.dataflows.DataFlowRunner
import io.shiftleft.dataflowengine.semanticsloader.SemanticsLoader
import io.shiftleft.semanticcpg.layers.EnhancementRunner
import org.slf4j.LoggerFactory

object Cpg2Scpg extends App {

  val DEFAULT_CPG_IN_FILE = "cpg.bin.zip"

  private val logger = LoggerFactory.getLogger(getClass)

  parseConfig.foreach { config =>
    try {
      run(config.inputPath, config.dataFlow, config.semanticsFile)
    } catch {
      case exception: Exception =>
        logger.error("Failed to generate CPG.", exception)
        System.exit(1)
    }
    System.exit(0)
  }

  case class Config(inputPath: String, dataFlow: Boolean, semanticsFile: String)
  def parseConfig: Option[Config] =
    new scopt.OptionParser[Config](getClass.getSimpleName) {
      arg[String]("<cpg>")
        .text("CPG to enhance")
        .action((x, c) => c.copy(inputPath = x))
      opt[Unit]("nodataflow")
        .text("do not perform data flow analysis")
        .action((x, c) => c.copy(dataFlow = false))
      opt[String]("semanticsfile")
        .text("data flow semantics file")
        .action((x, c) => c.copy(semanticsFile = x))

    }.parse(args, Config(DEFAULT_CPG_IN_FILE, true, CpgLoader.defaultSemanticsFile))

  /**
    * Load the CPG at `cpgFilename` and add enhancements,
    * turning the CPG into an SCPG.
    * @param cpgFilename the filename of the cpg
    * */
  def run(cpgFilename: String, dataFlow: Boolean, semanticsFilename: String): Unit = {
    val cpg = CpgLoader.loadWithoutSemantics(cpgFilename)
    val serializedCpg = new SerializedCpg(cpgFilename)
    new EnhancementRunner().run(cpg, serializedCpg)
    if (dataFlow) {
      val semantics = new SemanticsLoader(semanticsFilename).load()
      new DataFlowRunner(semantics).run(cpg, serializedCpg)
    }
    serializedCpg.close
  }

}
