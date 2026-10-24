package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object dynamodb:
  /** Provides a DynamoDB contributor insights resource */
  def ContributorInsights(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.ContributorInsightsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dynamodb.ContributorInsightsArgs.builder
    com.pulumi.aws.dynamodb.ContributorInsights(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DynamodbFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for listing AWS DynamoDB backups. */
    inline def getBackups(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetBackupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dynamodb.outputs.GetBackupsResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetBackupsArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getBackups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for listing AWS DynamoDB backups. */
    inline def getBackupsPlain(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetBackupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dynamodb.outputs.GetBackupsResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetBackupsPlainArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getBackupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a DynamoDB table. */
    inline def getTable(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dynamodb.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTable(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a DynamoDB table. */
    inline def getTablePlain(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTablePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dynamodb.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTablePlainArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTablePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for retrieving a value from an AWS DynamoDB table. */
    inline def getTableItem(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableItemArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dynamodb.outputs.GetTableItemResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableItemArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTableItem(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for retrieving a value from an AWS DynamoDB table. */
    inline def getTableItemPlain(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTableItemPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dynamodb.outputs.GetTableItemResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTableItemPlainArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTableItemPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Returns a list of all AWS DynamoDB table names in a region. */
    inline def getTables(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTablesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dynamodb.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTablesArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTables(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Returns a list of all AWS DynamoDB table names in a region. */
    inline def getTablesPlain(args: Endofunction[com.pulumi.aws.dynamodb.inputs.GetTablesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dynamodb.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.aws.dynamodb.inputs.GetTablesPlainArgs.builder
      com.pulumi.aws.dynamodb.DynamodbFunctions.getTablesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** &gt; **WARNING:** Do not combine `aws.dynamodb.GlobalSecondaryIndex` resources in conjunction with `globalSecondaryIndex` on `aws.dynamodb.Table`. Doing so may cause conflicts, perpertual differences, and Global Secondary Indexes being overwritten. */
  def GlobalSecondaryIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dynamodb.GlobalSecondaryIndexArgs.builder
    com.pulumi.aws.dynamodb.GlobalSecondaryIndex(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages [DynamoDB Global Tables V1 (version 2017.11.29)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V1.html). These are layered on top of existing DynamoDB Tables.
   * 
   * &gt; **NOTE:** To instead manage [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html), use the `aws.dynamodb.Table` resource `replica` configuration block.
   * 
   * &gt; Note: There are many restrictions before you can properly create DynamoDB Global Tables in multiple regions. See the [AWS DynamoDB Global Table Requirements](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables_reqs_bestpractices.html) for more information.
   */
  def GlobalTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.GlobalTableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dynamodb.GlobalTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.dynamodb.GlobalTable(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Enables a [Kinesis streaming destination](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/kds.html) for data replication of a DynamoDB table. */
  def KinesisStreamingDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.KinesisStreamingDestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dynamodb.KinesisStreamingDestinationArgs.builder
    com.pulumi.aws.dynamodb.KinesisStreamingDestination(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DynamoDB Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.ResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dynamodb.ResourcePolicyArgs.builder
    com.pulumi.aws.dynamodb.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a DynamoDB table resource.
   * 
   * &gt; **Note:** We recommend using `lifecycle` `ignoreChanges` for `readCapacity` and/or `writeCapacity` if there&#39;s Auto Scaling policy attached to the table.
   * 
   * &gt; **Note:** When using aws.dynamodb.TableReplica with this resource, use `lifecycle` `ignoreChanges` for `replica`, _e.g._, `lifecycle { ignoreChanges = [replica] }`.
   * 
   * &gt; **Note:** If Auto Scaling creates drift for your `globalSecondaryIndex` blocks and/or more granular `lifecycle` management for GSIs, we recommend using the new **experimental** resource `aws.dynamodb.GlobalSecondaryIndex`.
   * 
   * &gt; **Note:** Only define attributes on the table object that are going to be used as a hash key or range key for the table itself, or for LSI/GSI keys. Adding attributes not used in these scenarios causes an infinite plan loop. When using `aws.dynamodb.GlobalSecondaryIndex`, you do not need to define attributes for externally managed GSIs in the `aws.dynamodb.Table` resource.
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dynamodb.TableArgs.builder
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
    com.pulumi.aws.dynamodb.Table(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS DynamoDB Table Export. Terraform will wait until the Table export reaches a status of `COMPLETED` or `FAILED`.
   * 
   * See the [AWS Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/S3DataExport.HowItWorks.html) for more information on how this process works.
   * 
   * &gt; **TIP:** Point-in-time Recovery must be enabled on the target DynamoDB Table.
   * 
   * &gt; **NOTE:** Once a AWS DynamoDB Table Export has been created it is immutable. The AWS API does not delete this resource. When you run destroy the provider will remove the resource from the Terraform state, no exported data will be deleted.
   */
  def TableExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableExportArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dynamodb.TableExportArgs.builder
    com.pulumi.aws.dynamodb.TableExport(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a DynamoDB table item resource
   * 
   * &gt; **Note:** This resource is not meant to be used for managing large amounts of data in your table, it is not designed to scale.
   *   You should perform **regular backups** of all data in the table, see [AWS docs for more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/BackupRestore.html).
   */
  def TableItem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableItemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dynamodb.TableItemArgs.builder
    com.pulumi.aws.dynamodb.TableItem(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a DynamoDB table replica resource for [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html).
   * 
   * &gt; **Note:** Use `lifecycle` `ignoreChanges` for `replica` in the associated aws.dynamodb.Table configuration.
   * 
   * &gt; **Note:** Do not use the `replica` configuration block of aws.dynamodb.Table together with this resource as the two configuration options are mutually exclusive.
   */
  def TableReplica(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TableReplicaArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dynamodb.TableReplicaArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.dynamodb.TableReplica(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an individual DynamoDB resource tag. This resource should only be used in cases where DynamoDB resources are created outside the provider (e.g., Table replicas in other regions).
   * 
   * &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.dynamodb.Table` and `aws.dynamodb.Tag` to manage tags of the same DynamoDB Table in the same region will cause a perpetual difference where the `aws.dynamodb.Table` resource will try to remove the tag being added by the `aws.dynamodb.Tag` resource.
   * 
   * &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dynamodb.TagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dynamodb.TagArgs.builder
    com.pulumi.aws.dynamodb.Tag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
