package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object timestreamwrite:
  /** Provides a Timestream database resource. */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreamwrite.DatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreamwrite.DatabaseArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.timestreamwrite.Database(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Timestream table resource. */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreamwrite.TableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreamwrite.TableArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.timestreamwrite.Table(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object TimestreamwriteFunctions:
    /** Data source for managing an AWS Timestream Write Database. */
    inline def getDatabase(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.timestreamwrite.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetDatabaseArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Timestream Write Database. */
    inline def getDatabasePlain(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.timestreamwrite.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetDatabasePlainArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Timestream Write Table. */
    inline def getTable(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetTableArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.timestreamwrite.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetTableArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getTable(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Timestream Write Table. */
    inline def getTablePlain(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetTablePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.timestreamwrite.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetTablePlainArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getTablePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
