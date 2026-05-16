package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object workbench:
  extension (builder: com.pulumi.gcp.workbench.InstanceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workbench.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workbench.InstanceArgs.Builder)
    /**
     * @param gceSetup The definition of how to configure a VM instance outside of Resources and Identity.
     *  Structure is documented below.
     * @return builder
     */
    def gceSetup(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder]):
        com.pulumi.gcp.workbench.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.builder
      builder.gceSetup(args(argsBuilder).build)

  object WorkbenchFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for instance */
    inline def getInstanceIamPolicy(args: Endofunction[com.pulumi.gcp.workbench.inputs.GetInstanceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.workbench.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.GetInstanceIamPolicyArgs.builder
      com.pulumi.gcp.workbench.WorkbenchFunctions.getInstanceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for instance */
    inline def getInstanceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.workbench.inputs.GetInstanceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.workbench.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.GetInstanceIamPolicyPlainArgs.builder
      com.pulumi.gcp.workbench.WorkbenchFunctions.getInstanceIamPolicyPlain(args(argsBuilder).build)

  def InstanceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workbench.InstanceIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.workbench.InstanceIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.workbench.InstanceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Workbench instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/workbench/reference/rest/v2/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs/workbench/instances/introduction)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workbench.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.workbench.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.workbench.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.workbench.InstanceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workbench.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  def InstanceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workbench.InstanceIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.workbench.InstanceIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.workbench.InstanceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def InstanceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workbench.InstanceIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.workbench.InstanceIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.workbench.InstanceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.workbench.inputs.InstanceGceSetupNetworkInterfaceArgs.Builder)
    /**
     * @param accessConfigs Optional. An array of configurations for this interface. Currently, only one access
     *  config, ONE_TO_ONE_NAT, is supported. If no accessConfigs specified, the
     *  instance will have an external internet access through an ephemeral
     *  external IP address.
     *  Structure is documented below.
     * @return builder
     */
    def accessConfigs(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupNetworkInterfaceAccessConfigArgs.Builder]*):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupNetworkInterfaceAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder)
    /**
     * @param acceleratorConfigs The hardware accelerators used on this instance. If you use accelerators, make sure that your configuration has
     *  [enough vCPUs and memory to support the `machineType` you have selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
     *  Currently supports only one accelerator configuration.
     *  Structure is documented below.
     * @return builder
     */
    def acceleratorConfigs(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupAcceleratorConfigArgs.Builder]*):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupAcceleratorConfigArgs.builder
      builder.acceleratorConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDisk The definition of a boot disk.
     *  Structure is documented below.
     * @return builder
     */
    def bootDisk(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupBootDiskArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Confidential instance configuration.
     *  Structure is documented below.
     * @return builder
     */
    def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param containerImage Use a container image to start the workbench instance.
     *  Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupContainerImageArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param dataDisks Data disks attached to the VM instance. Currently supports only one data disk.
     *  Structure is documented below.
     * @return builder
     */
    def dataDisks(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupDataDisksArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupDataDisksArgs.builder
      builder.dataDisks(args(argsBuilder).build)

    /**
     * @param networkInterfaces The network interfaces for the VM. Supports only one interface.
     *  Structure is documented below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param reservationAffinity Reservations that this instance can consume from.
     *  Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupReservationAffinityArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param serviceAccounts The service account that serves as an identity for the VM instance. Currently supports only one service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccounts(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupServiceAccountArgs.Builder]*):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupServiceAccountArgs.builder
      builder.serviceAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param shieldedInstanceConfig A set of Shielded Instance options. See [Images using supported Shielded
     *  VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     *  Not all combinations are valid.
     *  Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param vmImage Definition of a custom Compute Engine virtual machine image for starting
     *  a workbench instance with the environment installed directly on the VM.
     *  Structure is documented below.
     * @return builder
     */
    def vmImage(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupVmImageArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupVmImageArgs.builder
      builder.vmImage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workbench.inputs.InstanceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workbench.inputs.InstanceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workbench.inputs.InstanceState.Builder)
    /**
     * @param gceSetup The definition of how to configure a VM instance outside of Resources and Identity.
     *  Structure is documented below.
     * @return builder
     */
    def gceSetup(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.Builder]):
        com.pulumi.gcp.workbench.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs.builder
      builder.gceSetup(args(argsBuilder).build)

    /**
     * @param healthInfos &#39;Output only. Additional information about instance health. Example:
     *  healthInfo&#34;: { &#34;dockerProxyAgentStatus&#34;: &#34;1&#34;, &#34;dockerStatus&#34;: &#34;1&#34;, &#34;jupyterlabApiStatus&#34;:
     *  &#34;-1&#34;, &#34;jupyterlabStatus&#34;: &#34;-1&#34;, &#34;updated&#34;: &#34;2020-10-18 09:40:03.573409&#34; }&#39;
     * @return builder
     */
    def healthInfos(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceHealthInfoArgs.Builder]*):
        com.pulumi.gcp.workbench.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceHealthInfoArgs.builder
      builder.healthInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param upgradeHistories Output only. The upgrade history of this instance.
     *  Structure is documented below.
     * @return builder
     */
    def upgradeHistories(args: Endofunction[com.pulumi.gcp.workbench.inputs.InstanceUpgradeHistoryArgs.Builder]*):
        com.pulumi.gcp.workbench.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.workbench.inputs.InstanceUpgradeHistoryArgs.builder
      builder.upgradeHistories(args.map(_(argsBuilder).build)*)
