package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object finspace:
  /** Resource for managing an AWS FinSpace Kx Dataview. */
  def KxDataview(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.finspace.KxDataviewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.finspace.KxDataviewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.finspace.KxDataview(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS FinSpace Kx User. */
  def KxUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.finspace.KxUserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.finspace.KxUserArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.finspace.KxUser(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.finspace.KxEnvironmentArgs.Builder)
    /**
     * @param customDnsConfigurations List of DNS server name and server IP. This is used to set up Route-53 outbound resolvers. Defined below.
     * @return builder
     */
    def customDnsConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxEnvironmentCustomDnsConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.KxEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxEnvironmentCustomDnsConfigurationArgs.builder
      builder.customDnsConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param transitGatewayConfiguration Transit gateway and network configuration that is used to connect the KX environment to an internal network. Defined below.
     * @return builder
     */
    def transitGatewayConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.KxEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationArgs.builder
      builder.transitGatewayConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.finspace.KxVolumeArgs.Builder)
    /**
     * @param nas1Configurations Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volumeType` is `NAS_1`. See `nas1Configuration` Argument Reference below.
     * @return builder
     */
    def nas1Configurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxVolumeNas1ConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.KxVolumeArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxVolumeNas1ConfigurationArgs.builder
      builder.nas1Configurations(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS FinSpace Kx Environment. */
  def KxEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.finspace.KxEnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.finspace.KxEnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.finspace.KxEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.finspace.KxDataviewArgs.Builder)
    /**
     * @param segmentConfigurations The configuration that contains the database path of the data that you want to place on each selected volume. Each segment must have a unique database path for each volume. If you do not explicitly specify any database path for a volume, they are accessible from the cluster through the default S3/object store segment. See segmentConfigurations below.
     * @return builder
     */
    def segmentConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxDataviewSegmentConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.KxDataviewArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxDataviewSegmentConfigurationArgs.builder
      builder.segmentConfigurations(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS FinSpace Kx Database. */
  def KxDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.finspace.KxDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.finspace.KxDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.finspace.KxDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS FinSpace Kx Scaling Group. */
  def KxScalingGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.finspace.KxScalingGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.finspace.KxScalingGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.finspace.KxScalingGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.finspace.KxClusterArgs.Builder)
    /**
     * @param autoScalingConfiguration Configuration based on which FinSpace will scale in or scale out nodes in your cluster. See auto_scaling_configuration.
     * @return builder
     */
    def autoScalingConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterAutoScalingConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterAutoScalingConfigurationArgs.builder
      builder.autoScalingConfiguration(args(argsBuilder).build)

    /**
     * @param cacheStorageConfigurations Configurations for a read only cache storage associated with a cluster. This cache will be stored as an FSx Lustre that reads from the S3 store. See cache_storage_configuration.
     * @return builder
     */
    def cacheStorageConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterCacheStorageConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterCacheStorageConfigurationArgs.builder
      builder.cacheStorageConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param capacityConfiguration Structure for the metadata of a cluster. Includes information like the CPUs needed, memory of instances, and number of instances. See capacity_configuration.
     * @return builder
     */
    def capacityConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterCapacityConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterCapacityConfigurationArgs.builder
      builder.capacityConfiguration(args(argsBuilder).build)

    /**
     * @param code Details of the custom code that you want to use inside a cluster when analyzing data. Consists of the S3 source bucket, location, object version, and the relative path from where the custom code is loaded into the cluster. See code.
     * @return builder
     */
    def code(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterCodeArgs.Builder]):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterCodeArgs.builder
      builder.code(args(argsBuilder).build)

    /**
     * @param databases KX database that will be available for querying. Defined below.
     * @return builder
     */
    def databases(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterDatabaseArgs.Builder]*):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterDatabaseArgs.builder
      builder.databases(args.map(_(argsBuilder).build)*)

    /**
     * @param savedownStorageConfiguration Size and type of the temporary storage that is used to hold data during the savedown process. This parameter is required when you choose `type` as RDB. All the data written to this storage space is lost when the cluster node is restarted. See savedown_storage_configuration.
     * @return builder
     */
    def savedownStorageConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterSavedownStorageConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterSavedownStorageConfigurationArgs.builder
      builder.savedownStorageConfiguration(args(argsBuilder).build)

    /**
     * @param scalingGroupConfiguration The structure that stores the configuration details of a scaling group.
     * @return builder
     */
    def scalingGroupConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterScalingGroupConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterScalingGroupConfigurationArgs.builder
      builder.scalingGroupConfiguration(args(argsBuilder).build)

    /**
     * @param tickerplantLogConfigurations A configuration to store Tickerplant logs. It consists of a list of volumes that will be mounted to your cluster. For the cluster type Tickerplant , the location of the TP volume on the cluster will be available by using the global variable .aws.tp_log_path.
     * @return builder
     */
    def tickerplantLogConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterTickerplantLogConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterTickerplantLogConfigurationArgs.builder
      builder.tickerplantLogConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcConfiguration Configuration details about the network where the Privatelink endpoint of the cluster resides. See vpc_configuration.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterVpcConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.KxClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  /** Resource for managing an AWS FinSpace Kx Volume. */
  def KxVolume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.finspace.KxVolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.finspace.KxVolumeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.finspace.KxVolume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS FinSpace Kx Cluster. */
  def KxCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.finspace.KxClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.finspace.KxClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.finspace.KxCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationArgs.Builder)
    /**
     * @param icmpTypeCode Defines the ICMP protocol that consists of the ICMP type and code. Defined below.
     * @return builder
     */
    def icmpTypeCode(args: Endofunction[com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCodeArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCodeArgs.builder
      builder.icmpTypeCode(args(argsBuilder).build)

    /**
     * @param portRange Range of ports the rule applies to. Defined below.
     * @return builder
     */
    def portRange(args: Endofunction[com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationPortRangeArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationPortRangeArgs.builder
      builder.portRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.finspace.inputs.KxClusterState.Builder)
    /**
     * @param autoScalingConfiguration Configuration based on which FinSpace will scale in or scale out nodes in your cluster. See auto_scaling_configuration.
     * @return builder
     */
    def autoScalingConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterAutoScalingConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterAutoScalingConfigurationArgs.builder
      builder.autoScalingConfiguration(args(argsBuilder).build)

    /**
     * @param cacheStorageConfigurations Configurations for a read only cache storage associated with a cluster. This cache will be stored as an FSx Lustre that reads from the S3 store. See cache_storage_configuration.
     * @return builder
     */
    def cacheStorageConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterCacheStorageConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterCacheStorageConfigurationArgs.builder
      builder.cacheStorageConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param capacityConfiguration Structure for the metadata of a cluster. Includes information like the CPUs needed, memory of instances, and number of instances. See capacity_configuration.
     * @return builder
     */
    def capacityConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterCapacityConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterCapacityConfigurationArgs.builder
      builder.capacityConfiguration(args(argsBuilder).build)

    /**
     * @param code Details of the custom code that you want to use inside a cluster when analyzing data. Consists of the S3 source bucket, location, object version, and the relative path from where the custom code is loaded into the cluster. See code.
     * @return builder
     */
    def code(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterCodeArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterCodeArgs.builder
      builder.code(args(argsBuilder).build)

    /**
     * @param databases KX database that will be available for querying. Defined below.
     * @return builder
     */
    def databases(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterDatabaseArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterDatabaseArgs.builder
      builder.databases(args.map(_(argsBuilder).build)*)

    /**
     * @param savedownStorageConfiguration Size and type of the temporary storage that is used to hold data during the savedown process. This parameter is required when you choose `type` as RDB. All the data written to this storage space is lost when the cluster node is restarted. See savedown_storage_configuration.
     * @return builder
     */
    def savedownStorageConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterSavedownStorageConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterSavedownStorageConfigurationArgs.builder
      builder.savedownStorageConfiguration(args(argsBuilder).build)

    /**
     * @param scalingGroupConfiguration The structure that stores the configuration details of a scaling group.
     * @return builder
     */
    def scalingGroupConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterScalingGroupConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterScalingGroupConfigurationArgs.builder
      builder.scalingGroupConfiguration(args(argsBuilder).build)

    /**
     * @param tickerplantLogConfigurations A configuration to store Tickerplant logs. It consists of a list of volumes that will be mounted to your cluster. For the cluster type Tickerplant , the location of the TP volume on the cluster will be available by using the global variable .aws.tp_log_path.
     * @return builder
     */
    def tickerplantLogConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterTickerplantLogConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterTickerplantLogConfigurationArgs.builder
      builder.tickerplantLogConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcConfiguration Configuration details about the network where the Privatelink endpoint of the cluster resides. See vpc_configuration.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterVpcConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxClusterState.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.finspace.inputs.KxClusterDatabaseArgs.Builder)
    /**
     * @param cacheConfigurations Configuration details for the disk cache to increase performance reading from a KX database mounted to the cluster. See cache_configurations.
     * @return builder
     */
    def cacheConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxClusterDatabaseCacheConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxClusterDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxClusterDatabaseCacheConfigurationArgs.builder
      builder.cacheConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationArgs.Builder)
    /**
     * @param attachmentNetworkAclConfigurations Rules that define how you manage outbound traffic from kdb network to your internal network. Defined below.
     * @return builder
     */
    def attachmentNetworkAclConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationArgs.builder
      builder.attachmentNetworkAclConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.finspace.inputs.KxVolumeState.Builder)
    def attachedClusters(args: Endofunction[com.pulumi.aws.finspace.inputs.KxVolumeAttachedClusterArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxVolumeState.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxVolumeAttachedClusterArgs.builder
      builder.attachedClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param nas1Configurations Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volumeType` is `NAS_1`. See `nas1Configuration` Argument Reference below.
     * @return builder
     */
    def nas1Configurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxVolumeNas1ConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxVolumeState.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxVolumeNas1ConfigurationArgs.builder
      builder.nas1Configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.finspace.inputs.KxEnvironmentState.Builder)
    /**
     * @param customDnsConfigurations List of DNS server name and server IP. This is used to set up Route-53 outbound resolvers. Defined below.
     * @return builder
     */
    def customDnsConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxEnvironmentCustomDnsConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxEnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxEnvironmentCustomDnsConfigurationArgs.builder
      builder.customDnsConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param transitGatewayConfiguration Transit gateway and network configuration that is used to connect the KX environment to an internal network. Defined below.
     * @return builder
     */
    def transitGatewayConfiguration(args: Endofunction[com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationArgs.Builder]):
        com.pulumi.aws.finspace.inputs.KxEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.finspace.inputs.KxEnvironmentTransitGatewayConfigurationArgs.builder
      builder.transitGatewayConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.finspace.inputs.KxDataviewState.Builder)
    /**
     * @param segmentConfigurations The configuration that contains the database path of the data that you want to place on each selected volume. Each segment must have a unique database path for each volume. If you do not explicitly specify any database path for a volume, they are accessible from the cluster through the default S3/object store segment. See segmentConfigurations below.
     * @return builder
     */
    def segmentConfigurations(args: Endofunction[com.pulumi.aws.finspace.inputs.KxDataviewSegmentConfigurationArgs.Builder]*):
        com.pulumi.aws.finspace.inputs.KxDataviewState.Builder =
      def argsBuilder = com.pulumi.aws.finspace.inputs.KxDataviewSegmentConfigurationArgs.builder
      builder.segmentConfigurations(args.map(_(argsBuilder).build)*)
