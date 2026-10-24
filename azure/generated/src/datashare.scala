package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object datashare:
  /** Manages a Data Share Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.datashare.AccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.AccountArgs.builder
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
    com.pulumi.azure.datashare.Account(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Data Share Blob Storage Dataset.
   * 
   * ## Import
   * 
   * Data Share Blob Storage Datasets can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:datashare/datasetBlobStorage:DatasetBlobStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
   * ```
   */
  def DatasetBlobStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetBlobStorageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetBlobStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetBlobStorage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Data Share Data Lake Gen2 Dataset.
   * 
   * ## Import
   * 
   * Data Share Data Lake Gen2 Datasets can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:datashare/datasetDataLakeGen2:DatasetDataLakeGen2 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
   * ```
   */
  def DatasetDataLakeGen2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetDataLakeGen2Args.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetDataLakeGen2Args.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetDataLakeGen2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Data Share Kusto Cluster Dataset. */
  def DatasetKustoCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetKustoClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetKustoClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetKustoCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Data Share Kusto Database Dataset. */
  def DatasetKustoDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetKustoDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetKustoDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetKustoDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DatashareFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Data Share Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.datashare.inputs.GetAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetAccountArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Data Share Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Data Share Blob Storage Dataset. */
    inline def getDatasetBlobStorage(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetBlobStorageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetBlobStorageResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetBlobStorageArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetBlobStorage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Data Share Blob Storage Dataset. */
    inline def getDatasetBlobStoragePlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetBlobStoragePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetBlobStorageResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetBlobStoragePlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetBlobStoragePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Data Share Data Lake Gen2 Dataset. */
    inline def getDatasetDataLakeGen2(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2Args.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetDataLakeGen2Result] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2Args.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetDataLakeGen2(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Data Share Data Lake Gen2 Dataset. */
    inline def getDatasetDataLakeGen2Plain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2PlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetDataLakeGen2Result] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2PlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetDataLakeGen2Plain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Data Share Kusto Cluster Dataset. */
    inline def getDatasetKustoCluster(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetKustoClusterResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Data Share Kusto Cluster Dataset. */
    inline def getDatasetKustoClusterPlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetKustoClusterResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterPlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Data Share Kusto Database Dataset. */
    inline def getDatasetKustoDatabase(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetKustoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabaseArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Data Share Kusto Database Dataset. */
    inline def getDatasetKustoDatabasePlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetKustoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabasePlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Data Share. */
    inline def getShare(args: Endofunction[com.pulumi.azure.datashare.inputs.GetShareArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetShareArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getShare(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Data Share. */
    inline def getSharePlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetSharePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetSharePlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getSharePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Data Share. */
  def Share(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.datashare.ShareArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.ShareArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.Share(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
