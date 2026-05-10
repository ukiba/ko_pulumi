package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object workloadssap:
  /**
   * Manages an SAP Single Node Virtual Instance with new SAP System.
   * 
   *  &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the Resource Provider with Azure CLI `az provider register --namespace &#34;Microsoft.Workloads&#34;`. The Resource Provider can take a while to register, you can check the status by running `az provider show --namespace &#34;Microsoft.Workloads&#34; --query &#34;registrationState&#34;`. Once this outputs &#34;Registered&#34; the Resource Provider is available for use.
   */
  def SingleNodeVirtualInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.workloadssap.SingleNodeVirtualInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceIdentityArgs.Builder]):
        com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param threeTierConfiguration A `threeTierConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def threeTierConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.builder
      builder.threeTierConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an SAP Three Tier Virtual Instance with a new SAP System.
   * 
   *  &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the Resource Provider with Azure CLI `az provider register --namespace &#34;Microsoft.Workloads&#34;`. The Resource Provider can take a while to register, you can check the status by running `az provider show --namespace &#34;Microsoft.Workloads&#34; --query &#34;registrationState&#34;`. Once this outputs &#34;Registered&#34; the Resource Provider is available for use.
   */
  def ThreeTierVirtualInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.workloadssap.ThreeTierVirtualInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.workloadssap.ThreeTierVirtualInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceIdentityArgs.Builder]):
        com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param singleServerConfiguration A `singleServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def singleServerConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.builder
      builder.singleServerConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.workloadssap.SingleNodeVirtualInstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an SAP Discovery Virtual Instance.
   * 
   *  &gt; **Note:** Before using this resource, it&#39;s required to submit the request of registering the Resource Provider with Azure CLI `az provider register --namespace &#34;Microsoft.Workloads&#34;`. The Resource Provider can take a while to register, you can check the status by running `az provider show --namespace &#34;Microsoft.Workloads&#34; --query &#34;registrationState&#34;`. Once this outputs &#34;Registered&#34; the Resource Provider is available for use.
   */
  def DiscoveryVirtualInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.workloadssap.DiscoveryVirtualInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.workloadssap.DiscoveryVirtualInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.workloadssap.DiscoveryVirtualInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.workloadssap.DiscoveryVirtualInstanceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.workloadssap.inputs.DiscoveryVirtualInstanceIdentityArgs.Builder]):
        com.pulumi.azure.workloadssap.DiscoveryVirtualInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.DiscoveryVirtualInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.workloadssap.DiscoveryVirtualInstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.Builder)
    /**
     * @param diskVolumeConfigurations One or more `diskVolumeConfiguration` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def diskVolumeConfigurations(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs.builder
      builder.diskVolumeConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualMachineConfiguration A `virtualMachineConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachineConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationArgs.builder
      builder.virtualMachineConfiguration(args(argsBuilder).build)

    /**
     * @param virtualMachineResourceNames A `virtualMachineResourceNames` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachineResourceNames(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineResourceNamesArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineResourceNamesArgs.builder
      builder.virtualMachineResourceNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationArgs.Builder)
    /**
     * @param virtualMachineConfiguration A `virtualMachineConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachineConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationArgs.builder
      builder.virtualMachineConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationArgs.Builder)
    /**
     * @param image An `image` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationImageArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationImageArgs.builder
      builder.image(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationOsProfileArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationArgs.Builder)
    /**
     * @param virtualMachineConfiguration A `virtualMachineConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachineConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationArgs.builder
      builder.virtualMachineConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationArgs.Builder)
    /**
     * @param diskVolumeConfigurations One or more `diskVolumeConfiguration` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def diskVolumeConfigurations(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationDiskVolumeConfigurationArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationDiskVolumeConfigurationArgs.builder
      builder.diskVolumeConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualMachineConfiguration A `virtualMachineConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachineConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationArgs.builder
      builder.virtualMachineConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceIdentityArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param threeTierConfiguration A `threeTierConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def threeTierConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.builder
      builder.threeTierConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerVirtualMachineArgs.Builder)
    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerVirtualMachineDataDiskArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerVirtualMachineDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs.Builder)
    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineDataDiskArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachineArgs.Builder)
    /**
     * @param dataDisks One or more `dataDisk` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachineDataDiskArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachineDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationArgs.Builder)
    /**
     * @param image An `image` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationImageArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationImageArgs.builder
      builder.image(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationOsProfileArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerArgs.Builder)
    /**
     * @param virtualMachines One or more `virtualMachine` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachines(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerVirtualMachineArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerVirtualMachineArgs.builder
      builder.virtualMachines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineResourceNamesArgs.Builder)
    /**
     * @param dataDisks (Optional) One or more `dataDisk` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineResourceNamesDataDiskArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineResourceNamesArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineResourceNamesDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationArgs.Builder)
    /**
     * @param image An `image` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationImageArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationImageArgs.builder
      builder.image(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationOsProfileArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationVirtualMachineConfigurationOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs.Builder)
    /**
     * @param loadBalancer A `loadBalancer` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param virtualMachines One or more `virtualMachine` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachines(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs.builder
      builder.virtualMachines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder)
    /**
     * @param applicationServerConfiguration An `applicationServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def applicationServerConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationApplicationServerConfigurationArgs.builder
      builder.applicationServerConfiguration(args(argsBuilder).build)

    /**
     * @param centralServerConfiguration A `centralServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def centralServerConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationArgs.builder
      builder.centralServerConfiguration(args(argsBuilder).build)

    /**
     * @param databaseServerConfiguration A `databaseServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def databaseServerConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationArgs.builder
      builder.databaseServerConfiguration(args(argsBuilder).build)

    /**
     * @param resourceNames A `resourceNames` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def resourceNames(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesArgs.builder
      builder.resourceNames(args(argsBuilder).build)

    /**
     * @param transportCreateAndMount A `transportCreateAndMount` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** The file share configuration uses `skip` by default when `transportCreateAndMount` isn&#39;t set.
     * 
     *  &gt; **Note:** Due to [a bug in the Azure API](https://github.com/Azure/azure-rest-api-specs/issues/25209) where the Storage File Share Id is not defined correctly, it is not currently possible to support using Transport Mount.
     * @return builder
     */
    def transportCreateAndMount(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationTransportCreateAndMountArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationTransportCreateAndMountArgs.builder
      builder.transportCreateAndMount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerArgs.Builder)
    /**
     * @param loadBalancer A `loadBalancer` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancerArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param virtualMachines One or more `virtualMachine` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def virtualMachines(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachineArgs.Builder]*):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachineArgs.builder
      builder.virtualMachines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.workloadssap.inputs.DiscoveryVirtualInstanceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.workloadssap.inputs.DiscoveryVirtualInstanceIdentityArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.DiscoveryVirtualInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.DiscoveryVirtualInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.workloadssap.inputs.DiscoveryVirtualInstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceIdentityArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param singleServerConfiguration A `singleServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def singleServerConfiguration(args: Endofunction[com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs.builder
      builder.singleServerConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesArgs.Builder)
    /**
     * @param applicationServer An `applicationServer` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def applicationServer(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerArgs.builder
      builder.applicationServer(args(argsBuilder).build)

    /**
     * @param centralServer A `centralServer` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def centralServer(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerArgs.builder
      builder.centralServer(args(argsBuilder).build)

    /**
     * @param databaseServer A `databaseServer` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def databaseServer(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs.builder
      builder.databaseServer(args(argsBuilder).build)

    /**
     * @param sharedStorage A `sharedStorage` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def sharedStorage(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesSharedStorageArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesSharedStorageArgs.builder
      builder.sharedStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationArgs.Builder)
    /**
     * @param image An `image` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs.builder
      builder.image(args(argsBuilder).build)

    /**
     * @param osProfile An `osProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def osProfile(args: Endofunction[com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationOsProfileArgs.Builder]):
        com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationOsProfileArgs.builder
      builder.osProfile(args(argsBuilder).build)
