package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object dsql:
  /** Resource for managing an Amazon Aurora DSQL Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.dsql.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dsql.ClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.dsql.Cluster(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.dsql.ClusterArgs.Builder)
    /**
     * @param multiRegionProperties Multi-region properties of the DSQL Cluster.
     * @return builder
     */
    def multiRegionProperties(args: Endofunction[com.pulumi.aws.dsql.inputs.ClusterMultiRegionPropertiesArgs.Builder]):
        com.pulumi.aws.dsql.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.dsql.inputs.ClusterMultiRegionPropertiesArgs.builder
      builder.multiRegionProperties(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.dsql.inputs.ClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.dsql.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.dsql.inputs.ClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an Amazon Aurora DSQL Cluster Peering. */
  def ClusterPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.dsql.ClusterPeeringArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dsql.ClusterPeeringArgs.builder
    com.pulumi.aws.dsql.ClusterPeering(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.dsql.ClusterPeeringArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.dsql.inputs.ClusterPeeringTimeoutsArgs.Builder]):
        com.pulumi.aws.dsql.ClusterPeeringArgs.Builder =
      val argsBuilder = com.pulumi.aws.dsql.inputs.ClusterPeeringTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dsql.inputs.ClusterPeeringState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.dsql.inputs.ClusterPeeringTimeoutsArgs.Builder]):
        com.pulumi.aws.dsql.inputs.ClusterPeeringState.Builder =
      val argsBuilder = com.pulumi.aws.dsql.inputs.ClusterPeeringTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dsql.inputs.ClusterState.Builder)
    /**
     * @param encryptionDetails Encryption configuration details for the DSQL Cluster.
     * @return builder
     */
    def encryptionDetails(args: Endofunction[com.pulumi.aws.dsql.inputs.ClusterEncryptionDetailArgs.Builder]*):
        com.pulumi.aws.dsql.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.dsql.inputs.ClusterEncryptionDetailArgs.builder
      builder.encryptionDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param multiRegionProperties Multi-region properties of the DSQL Cluster.
     * @return builder
     */
    def multiRegionProperties(args: Endofunction[com.pulumi.aws.dsql.inputs.ClusterMultiRegionPropertiesArgs.Builder]):
        com.pulumi.aws.dsql.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.dsql.inputs.ClusterMultiRegionPropertiesArgs.builder
      builder.multiRegionProperties(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.dsql.inputs.ClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.dsql.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.dsql.inputs.ClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
