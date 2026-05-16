package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object avs:
  /** Manages an Azure VMware Solution Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.avs.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.avs.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object AvsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Azure VMware Solution Private Cloud. */
    inline def getPrivateCloud(args: Endofunction[com.pulumi.azure.avs.inputs.GetPrivateCloudArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.avs.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.azure.avs.inputs.GetPrivateCloudArgs.builder
      com.pulumi.azure.avs.AvsFunctions.getPrivateCloud(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure VMware Solution Private Cloud. */
    inline def getPrivateCloudPlain(args: Endofunction[com.pulumi.azure.avs.inputs.GetPrivateCloudPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.avs.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.azure.avs.inputs.GetPrivateCloudPlainArgs.builder
      com.pulumi.azure.avs.AvsFunctions.getPrivateCloudPlain(args(argsBuilder).build)

  /** Manages an Azure VMware Solution Private Cloud. */
  def PrivateCloud(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.avs.PrivateCloudArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.PrivateCloudArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.avs.PrivateCloud(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure VMware Solution Private Cloud Netapp File Attachment. */
  def NetappVolumeAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.avs.NetappVolumeAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.NetappVolumeAttachmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.avs.NetappVolumeAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure VMware Solution ExpressRoute Circuit Authorization. */
  def ExpressRouteAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.avs.ExpressRouteAuthorizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.avs.ExpressRouteAuthorizationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.avs.ExpressRouteAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.avs.PrivateCloudArgs.Builder)
    /**
     * @param managementCluster A `managementCluster` block as defined below.
     *  &gt; **Note:** `internetConnectionEnabled` and `management_cluster[0].size` cannot be updated at the same time.
     * @return builder
     */
    def managementCluster(args: Endofunction[com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.azure.avs.PrivateCloudArgs.Builder =
      val argsBuilder = com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.avs.PrivateCloudArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.avs.inputs.PrivateCloudState.Builder)
    /**
     * @param circuits A `circuit` block as defined below.
     * @return builder
     */
    def circuits(args: Endofunction[com.pulumi.azure.avs.inputs.PrivateCloudCircuitArgs.Builder]*):
        com.pulumi.azure.avs.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.azure.avs.inputs.PrivateCloudCircuitArgs.builder
      builder.circuits(args.map(_(argsBuilder).build)*)

    /**
     * @param managementCluster A `managementCluster` block as defined below.
     *  &gt; **Note:** `internetConnectionEnabled` and `management_cluster[0].size` cannot be updated at the same time.
     * @return builder
     */
    def managementCluster(args: Endofunction[com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.azure.avs.inputs.PrivateCloudState.Builder =
      val argsBuilder = com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.avs.inputs.PrivateCloudState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
