package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mskconnect:
  /** Provides an Amazon MSK Connect Connector resource. */
  def Connector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mskconnect.ConnectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mskconnect.ConnectorArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.mskconnect.Connector(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an Amazon MSK Connect Custom Plugin Resource. */
  def CustomPlugin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mskconnect.CustomPluginArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mskconnect.CustomPluginArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.mskconnect.CustomPlugin(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object MskconnectFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information on an Amazon MSK Connect Connector. */
    inline def getConnector(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetConnectorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.mskconnect.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetConnectorArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getConnector(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect Connector. */
    inline def getConnectorPlain(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mskconnect.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetConnectorPlainArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getConnectorPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect custom plugin. */
    inline def getCustomPlugin(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetCustomPluginArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.mskconnect.outputs.GetCustomPluginResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetCustomPluginArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getCustomPlugin(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect custom plugin. */
    inline def getCustomPluginPlain(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetCustomPluginPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mskconnect.outputs.GetCustomPluginResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetCustomPluginPlainArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getCustomPluginPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect Worker Configuration. */
    inline def getWorkerConfiguration(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.mskconnect.outputs.GetWorkerConfigurationResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getWorkerConfiguration(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect Worker Configuration. */
    inline def getWorkerConfigurationPlain(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mskconnect.outputs.GetWorkerConfigurationResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationPlainArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getWorkerConfigurationPlain(args(argsBuilder).build)

  /** Provides an Amazon MSK Connect Worker Configuration Resource. */
  def WorkerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mskconnect.WorkerConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mskconnect.WorkerConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.mskconnect.WorkerConfiguration(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
