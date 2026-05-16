package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object elasticsan:
  extension (builder: com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * 
     *  &gt; **Note:** The `encryption` block can only be set when `encryptionType` is set to `EncryptionAtRestWithCustomerManagedKey`.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.Builder]):
        com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.Builder]):
        com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRules One or more `networkRule` blocks as defined below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.Builder]*):
        com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

  /** Manages an Elastic SAN resource. */
  def ElasticSan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.elasticsan.ElasticSanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticsan.ElasticSanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.elasticsan.ElasticSan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.elasticsan.VolumeArgs.Builder)
    /**
     * @param createSource A `createSource` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def createSource(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.Builder]):
        com.pulumi.azure.elasticsan.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.builder
      builder.createSource(args(argsBuilder).build)

  object ElasticsanFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Elastic SAN. */
    inline def get(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticsan.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.get(args(argsBuilder).build)

    /** Use this data source to access information about an existing Elastic SAN. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticsan.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetPlainArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Group. */
    inline def getVolumeGroup(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticsan.outputs.GetVolumeGroupResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Group. */
    inline def getVolumeGroupPlain(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticsan.outputs.GetVolumeGroupResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeGroupPlainArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Snapshot. */
    inline def getVolumeSnapshot(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticsan.outputs.GetVolumeSnapshotResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeSnapshot(args(argsBuilder).build)

    /** Use this data source to access information about an existing Elastic SAN Volume Snapshot. */
    inline def getVolumeSnapshotPlain(args: Endofunction[com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticsan.outputs.GetVolumeSnapshotResult] =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotPlainArgs.builder
      com.pulumi.azure.elasticsan.ElasticsanFunctions.getVolumeSnapshotPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.elasticsan.ElasticSanArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.Builder]):
        com.pulumi.azure.elasticsan.ElasticSanArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.elasticsan.ElasticSanArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Elastic SAN Volume Group resource. */
  def VolumeGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticsan.VolumeGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.elasticsan.VolumeGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Elastic SAN Volume resource. */
  def Volume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.elasticsan.VolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticsan.VolumeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.elasticsan.Volume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.elasticsan.inputs.ElasticSanState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.ElasticSanState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.builder
      builder.sku(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.elasticsan.inputs.ElasticSanState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.elasticsan.inputs.VolumeState.Builder)
    /**
     * @param createSource A `createSource` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def createSource(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.builder
      builder.createSource(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * 
     *  &gt; **Note:** The `encryption` block can only be set when `encryptionType` is set to `EncryptionAtRestWithCustomerManagedKey`.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRules One or more `networkRule` blocks as defined below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.Builder]*):
        com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder =
      def argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)
