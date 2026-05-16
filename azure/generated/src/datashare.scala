package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object datashare:
  /**
   * Manages a Data Share Data Lake Gen2 Dataset.
   * 
   *  ## Import
   * 
   *  Data Share Data Lake Gen2 Datasets can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:datashare/datasetDataLakeGen2:DatasetDataLakeGen2 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
   *  ```
   */
  def DatasetDataLakeGen2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetDataLakeGen2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetDataLakeGen2Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetDataLakeGen2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datashare.AccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datashare.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.datashare.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.datashare.AccountArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.datashare.DatasetBlobStorageArgs.Builder)
    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.Builder]):
        com.pulumi.azure.datashare.DatasetBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)

  object DatashareFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Data Share Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.datashare.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetAccountArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getAccountPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Blob Storage Dataset. */
    inline def getDatasetBlobStorage(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetBlobStorageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetBlobStorageResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetBlobStorageArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetBlobStorage(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Blob Storage Dataset. */
    inline def getDatasetBlobStoragePlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetBlobStoragePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetBlobStorageResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetBlobStoragePlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetBlobStoragePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Data Lake Gen2 Dataset. */
    inline def getDatasetDataLakeGen2(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2Args.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetDataLakeGen2Result] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2Args.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetDataLakeGen2(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Data Lake Gen2 Dataset. */
    inline def getDatasetDataLakeGen2Plain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2PlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetDataLakeGen2Result] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2PlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetDataLakeGen2Plain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Kusto Cluster Dataset. */
    inline def getDatasetKustoCluster(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetKustoClusterResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Kusto Cluster Dataset. */
    inline def getDatasetKustoClusterPlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetKustoClusterResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterPlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoClusterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Kusto Database Dataset. */
    inline def getDatasetKustoDatabase(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetDatasetKustoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabaseArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share Kusto Database Dataset. */
    inline def getDatasetKustoDatabasePlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetDatasetKustoDatabaseResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabasePlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getDatasetKustoDatabasePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share. */
    inline def getShare(args: Endofunction[com.pulumi.azure.datashare.inputs.GetShareArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.datashare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetShareArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getShare(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Share. */
    inline def getSharePlain(args: Endofunction[com.pulumi.azure.datashare.inputs.GetSharePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.datashare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.datashare.inputs.GetSharePlainArgs.builder
      com.pulumi.azure.datashare.DatashareFunctions.getSharePlain(args(argsBuilder).build)

  /**
   * Manages a Data Share Blob Storage Dataset.
   * 
   *  ## Import
   * 
   *  Data Share Blob Storage Datasets can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:datashare/datasetBlobStorage:DatasetBlobStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
   *  ```
   */
  def DatasetBlobStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetBlobStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetBlobStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetBlobStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Share Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datashare.AccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.AccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.datashare.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Share Kusto Database Dataset. */
  def DatasetKustoDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetKustoDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetKustoDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetKustoDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Share Kusto Cluster Dataset. */
  def DatasetKustoCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datashare.DatasetKustoClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.DatasetKustoClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.DatasetKustoCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datashare.ShareArgs.Builder)
    /**
     * @param snapshotSchedule A `snapshotSchedule` block as defined below.
     * @return builder
     */
    def snapshotSchedule(args: Endofunction[com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.Builder]):
        com.pulumi.azure.datashare.ShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.builder
      builder.snapshotSchedule(args(argsBuilder).build)

  /** Manages a Data Share. */
  def Share(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datashare.ShareArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datashare.ShareArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datashare.Share(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datashare.inputs.AccountState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datashare.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.datashare.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.datashare.inputs.AccountState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.datashare.inputs.ShareState.Builder)
    /**
     * @param snapshotSchedule A `snapshotSchedule` block as defined below.
     * @return builder
     */
    def snapshotSchedule(args: Endofunction[com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.Builder]):
        com.pulumi.azure.datashare.inputs.ShareState.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.builder
      builder.snapshotSchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datashare.inputs.DatasetBlobStorageState.Builder)
    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.Builder]):
        com.pulumi.azure.datashare.inputs.DatasetBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)
