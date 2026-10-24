package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object glue:
  /** Manages an AWS Glue Catalog. */
  def Catalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.CatalogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.CatalogArgs.builder
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
    com.pulumi.aws.glue.Catalog(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Catalog Database Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality */
  def CatalogDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.CatalogDatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.CatalogDatabaseArgs.builder
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
    com.pulumi.aws.glue.CatalogDatabase(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Catalog Table Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality. */
  def CatalogTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.CatalogTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.CatalogTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.glue.CatalogTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Glue Catalog Table Optimizer. */
  def CatalogTableOptimizer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.CatalogTableOptimizerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.glue.CatalogTableOptimizerArgs.builder
    com.pulumi.aws.glue.CatalogTableOptimizer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Glue Classifier resource.
   * 
   * &gt; **NOTE:** It is only valid to create one type of classifier (CSV, grok, JSON, or XML). Changing classifier types will recreate the classifier.
   */
  def Classifier(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.ClassifierArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.ClassifierArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.glue.Classifier(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an AWS Glue Connection. */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.ConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.ConnectionArgs.builder
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
    com.pulumi.aws.glue.Connection(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Glue Crawler. More information can be found in the [AWS Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) */
  def Crawler(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.CrawlerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.CrawlerArgs.builder
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
    com.pulumi.aws.glue.Crawler(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Data Catalog Encryption Settings resource. */
  def DataCatalogEncryptionSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs.builder
    com.pulumi.aws.glue.DataCatalogEncryptionSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Data Quality Ruleset Resource. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/glue-data-quality.html) for a full explanation of the Glue Data Quality Ruleset functionality */
  def DataQualityRuleset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.DataQualityRulesetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.DataQualityRulesetArgs.builder
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
    com.pulumi.aws.glue.DataQualityRuleset(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Development Endpoint resource. */
  def DevEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.DevEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.DevEndpointArgs.builder
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
    com.pulumi.aws.glue.DevEndpoint(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object GlueFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an AWS Glue Catalog. */
    inline def getCatalog(args: Endofunction[com.pulumi.aws.glue.inputs.GetCatalogArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetCatalogResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetCatalogArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getCatalog(args(argsBuilder).build)

    /** Provides details about an AWS Glue Catalog. */
    inline def getCatalogPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetCatalogPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetCatalogResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetCatalogPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getCatalogPlain(args(argsBuilder).build)

    /** This data source can be used to fetch information about an AWS Glue Data Catalog Table. */
    inline def getCatalogTable(args: Endofunction[com.pulumi.aws.glue.inputs.GetCatalogTableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetCatalogTableResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetCatalogTableArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getCatalogTable(args(argsBuilder).build)

    /** This data source can be used to fetch information about an AWS Glue Data Catalog Table. */
    inline def getCatalogTablePlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetCatalogTablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetCatalogTableResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetCatalogTablePlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getCatalogTablePlain(args(argsBuilder).build)

    /** Provides details about an AWS Glue Connection. */
    inline def getConnection(args: Endofunction[com.pulumi.aws.glue.inputs.GetConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetConnectionArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getConnection(args(argsBuilder).build)

    /** Provides details about an AWS Glue Connection. */
    inline def getConnectionPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getConnectionPlain(args(argsBuilder).build)

    /** This data source can be used to fetch information about AWS Glue Data Catalog Encryption Settings. */
    inline def getDataCatalogEncryptionSettings(args: Endofunction[com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getDataCatalogEncryptionSettings(args(argsBuilder).build)

    /** This data source can be used to fetch information about AWS Glue Data Catalog Encryption Settings. */
    inline def getDataCatalogEncryptionSettingsPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getDataCatalogEncryptionSettingsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Glue Registry. */
    inline def getRegistry(args: Endofunction[com.pulumi.aws.glue.inputs.GetRegistryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetRegistryArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getRegistry(args(argsBuilder).build)

    /** Data source for managing an AWS Glue Registry. */
    inline def getRegistryPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetRegistryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetRegistryPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getRegistryPlain(args(argsBuilder).build)

    /** Use this data source to generate a Glue script from a Directed Acyclic Graph (DAG). */
    inline def getScript(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.glue.outputs.GetScriptResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetScriptArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getScript(args(argsBuilder).build)

    /** Use this data source to generate a Glue script from a Directed Acyclic Graph (DAG). */
    inline def getScriptPlain(args: Endofunction[com.pulumi.aws.glue.inputs.GetScriptPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.glue.outputs.GetScriptResult] =
      val argsBuilder = com.pulumi.aws.glue.inputs.GetScriptPlainArgs.builder
      com.pulumi.aws.glue.GlueFunctions.getScriptPlain(args(argsBuilder).build)

  /**
   * Provides a Glue Job resource.
   * 
   * &gt; Glue functionality, such as monitoring and logging of jobs, is typically managed with the `defaultArguments` argument. See the [Special Parameters Used by AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html) topic in the Glue developer guide for additional information.
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.JobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.JobArgs.builder
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
    com.pulumi.aws.glue.Job(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue ML Transform resource. */
  def MLTransform(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.MLTransformArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.MLTransformArgs.builder
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
    com.pulumi.aws.glue.MLTransform(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Partition Resource. */
  def Partition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.PartitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.glue.PartitionArgs.builder
    com.pulumi.aws.glue.Partition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def PartitionIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.PartitionIndexArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.glue.PartitionIndexArgs.builder
    com.pulumi.aws.glue.PartitionIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Registry resource. */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.RegistryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.RegistryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.glue.Registry(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue resource policy. Only one can exist per region. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.ResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.glue.ResourcePolicyArgs.builder
    com.pulumi.aws.glue.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue Schema resource. */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.SchemaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.SchemaArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.glue.Schema(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Glue Security Configuration. */
  def SecurityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.SecurityConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.SecurityConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.glue.SecurityConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Glue Trigger resource. */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.TriggerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.TriggerArgs.builder
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
    com.pulumi.aws.glue.Trigger(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Glue User Defined Function Resource. */
  def UserDefinedFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.UserDefinedFunctionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.UserDefinedFunctionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.glue.UserDefinedFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Glue Workflow resource.
   * The workflow graph (DAG) can be build using the `aws.glue.Trigger` resource.
   * See the example below for creating a graph with four nodes (two triggers and two jobs).
   */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.glue.WorkflowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.glue.WorkflowArgs.builder
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
    com.pulumi.aws.glue.Workflow(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
