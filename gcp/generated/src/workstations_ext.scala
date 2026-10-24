package jp.ukiba.ko_pulumi
package gcp

object workstations_ext:
  extension (builder: com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder)
    /**
     * @param domainConfig Configuration options for a custom domain.
     * Structure is documented below.
     * @return builder
     */
    def domainConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.builder
      builder.domainConfig(args(argsBuilder).build)

    /**
     * @param privateClusterConfig Configuration for private cluster.
     * Structure is documented below.
     * @return builder
     */
    def privateClusterConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.builder
      builder.privateClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder)
    /**
     * @param allowedPorts A list of port ranges specifying single ports or ranges of ports that are externally accessible in the workstation. Allowed ports must be one of 22, 80, or within range 1024-65535. If not specified defaults to ports 22, 80, and ports 1024-65535.
     * Structure is documented below.
     * @return builder
     */
    def allowedPorts(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.builder
      builder.allowedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param container Container that will be run for each workstation using this configuration when that workstation is started.
     * Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param encryptionKey Encrypts resources of this workstation configuration using a customer-managed encryption key.
     * If specified, the boot disk of the Compute Engine instance and the persistent disk are encrypted using this encryption key. If this field is not set, the disks are encrypted using a generated key. Customer-managed encryption keys do not protect disk metadata.
     * If the customer-managed encryption key is rotated, when the workstation instance is stopped, the system attempts to recreate the persistent disk with the new version of the key. Be sure to keep older versions of the key until the persistent disk is recreated. Otherwise, data on the persistent disk will be lost.
     * If the encryption key is revoked, the workstation session will automatically be stopped within 7 hours.
     * Structure is documented below.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param ephemeralDirectories Ephemeral directories which won&#39;t persist across workstation sessions.
     * Structure is documented below.
     * @return builder
     */
    def ephemeralDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.builder
      builder.ephemeralDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param host Runtime host for a workstation.
     * Structure is documented below.
     * @return builder
     */
    def host(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.builder
      builder.host(args(argsBuilder).build)

    /**
     * @param persistentDirectories Directories to persist across workstation sessions.
     * Structure is documented below.
     * @return builder
     */
    def persistentDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.builder
      builder.persistentDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessChecks Readiness checks to be performed on a workstation.
     * Structure is documented below.
     * @return builder
     */
    def readinessChecks(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.builder
      builder.readinessChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder)
    /**
     * @param conditions Status conditions describing the current resource state.
     * Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterConditionArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param domainConfig Configuration options for a custom domain.
     * Structure is documented below.
     * @return builder
     */
    def domainConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.builder
      builder.domainConfig(args(argsBuilder).build)

    /**
     * @param privateClusterConfig Configuration for private cluster.
     * Structure is documented below.
     * @return builder
     */
    def privateClusterConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.builder
      builder.privateClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder)
    /**
     * @param gcePd An EphemeralDirectory backed by a Compute Engine persistent disk.
     * Structure is documented below.
     * @return builder
     */
    def gcePd(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryGcePdArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryGcePdArgs.builder
      builder.gcePd(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder)
    /**
     * @param gceInstance A runtime using a Compute Engine instance.
     * Structure is documented below.
     * @return builder
     */
    def gceInstance(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.builder
      builder.gceInstance(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder)
    /**
     * @param accelerators An accelerator card attached to the instance.
     * Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceAcceleratorArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param boostConfigs A list of the boost configurations that workstations created using this workstation configuration are allowed to use.
     * Structure is documented below.
     * @return builder
     */
    def boostConfigs(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.builder
      builder.boostConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param confidentialInstanceConfig A set of Compute Engine Confidential VM instance options.
     * Structure is documented below.
     * @return builder
     */
    def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig A set of Compute Engine Shielded instance options.
     * Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.Builder)
    /**
     * @param accelerators An accelerator card attached to the boost instance.
     * Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder)
    /**
     * @param gceHd A directory to persist across workstation sessions, backed by a Compute Engine Hyperdisk Balanced High Availability disk.
     * Structure is documented below.
     * @return builder
     */
    def gceHd(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryGceHdArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryGceHdArgs.builder
      builder.gceHd(args(argsBuilder).build)

    /**
     * @param gcePd A directory to persist across workstation sessions, backed by a Compute Engine regional persistent disk. Can only be updated if not empty during creation.
     * Structure is documented below.
     * @return builder
     */
    def gcePd(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryGcePdArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryGcePdArgs.builder
      builder.gcePd(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder)
    /**
     * @param allowedPorts A list of port ranges specifying single ports or ranges of ports that are externally accessible in the workstation. Allowed ports must be one of 22, 80, or within range 1024-65535. If not specified defaults to ports 22, 80, and ports 1024-65535.
     * Structure is documented below.
     * @return builder
     */
    def allowedPorts(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.builder
      builder.allowedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Status conditions describing the current resource state.
     * Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigConditionArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param container Container that will be run for each workstation using this configuration when that workstation is started.
     * Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param encryptionKey Encrypts resources of this workstation configuration using a customer-managed encryption key.
     * If specified, the boot disk of the Compute Engine instance and the persistent disk are encrypted using this encryption key. If this field is not set, the disks are encrypted using a generated key. Customer-managed encryption keys do not protect disk metadata.
     * If the customer-managed encryption key is rotated, when the workstation instance is stopped, the system attempts to recreate the persistent disk with the new version of the key. Be sure to keep older versions of the key until the persistent disk is recreated. Otherwise, data on the persistent disk will be lost.
     * If the encryption key is revoked, the workstation session will automatically be stopped within 7 hours.
     * Structure is documented below.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param ephemeralDirectories Ephemeral directories which won&#39;t persist across workstation sessions.
     * Structure is documented below.
     * @return builder
     */
    def ephemeralDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.builder
      builder.ephemeralDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param host Runtime host for a workstation.
     * Structure is documented below.
     * @return builder
     */
    def host(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.builder
      builder.host(args(argsBuilder).build)

    /**
     * @param persistentDirectories Directories to persist across workstation sessions.
     * Structure is documented below.
     * @return builder
     */
    def persistentDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.builder
      builder.persistentDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessChecks Readiness checks to be performed on a workstation.
     * Structure is documented below.
     * @return builder
     */
    def readinessChecks(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.builder
      builder.readinessChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
