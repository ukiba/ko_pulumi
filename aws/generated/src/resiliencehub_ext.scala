package jp.ukiba.ko_pulumi
package aws

object resiliencehub_ext:
  extension (builder: com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder)
    /**
     * @param policy The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds. See `policy`.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder]):
        com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.builder
      builder.policy(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.V2InputSourceArgs.Builder)
    /**
     * @param resourceConfiguration Resource configuration for an input source. See `resourceConfiguration` Block below.
     * @return builder
     */
    def resourceConfiguration(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2InputSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.builder
      builder.resourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder)
    /**
     * @param availabilitySlo Availability SLO configuration. See `availabilitySlo` Block below.
     * @return builder
     */
    def availabilitySlo(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.builder
      builder.availabilitySlo(args(argsBuilder).build)

    /**
     * @param dataRecovery Data recovery configuration. See `dataRecovery` Block below.
     * @return builder
     */
    def dataRecovery(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.builder
      builder.dataRecovery(args(argsBuilder).build)

    /**
     * @param multiAz Multi-AZ disaster recovery configuration. See `multiAz` Block below.
     * @return builder
     */
    def multiAz(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.builder
      builder.multiAz(args(argsBuilder).build)

    /**
     * @param multiRegion Multi-region disaster recovery configuration. See `multiRegion` Block below.
     * @return builder
     */
    def multiRegion(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.builder
      builder.multiRegion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder)
    /**
     * @param associatedSystems Systems to associate with the service. See `associatedSystem` Block below.
     * @return builder
     */
    def associatedSystems(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.Builder]*):
        com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.builder
      builder.associatedSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param permissionModel Permission model for resource discovery. See `permissionModel` Block below.
     * @return builder
     */
    def permissionModel(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.builder
      builder.permissionModel(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder)
    /**
     * @param az Specifies Availability Zone failure policy. See `policy.az`
     * @return builder
     */
    def az(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyAzArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyAzArgs.builder
      builder.az(args(argsBuilder).build)

    /**
     * @param hardware Specifies Infrastructure failure policy. See `policy.hardware`
     * @return builder
     */
    def hardware(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyHardwareArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyHardwareArgs.builder
      builder.hardware(args(argsBuilder).build)

    /**
     * @param region Specifies Region failure policy. `policy.region`
     * @return builder
     */
    def region(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyRegionArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyRegionArgs.builder
      builder.region(args(argsBuilder).build)

    /**
     * @param software Specifies Application failure policy. See `policy.software`
     * 
     * The following arguments are optional:
     * @return builder
     */
    def software(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicySoftwareArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicySoftwareArgs.builder
      builder.software(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyState.Builder)
    /**
     * @param policy The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds. See `policy`.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.builder
      builder.policy(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder)
    /**
     * @param eks EKS configuration. See `eks` Block below.
     * @return builder
     */
    def eks(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksArgs.builder
      builder.eks(args(argsBuilder).build)

    /**
     * @param resourceTags Resource tags used for discovery. See `resourceTag` Block below.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationResourceTagArgs.Builder]*):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksArgs.Builder)
    /**
     * @param labelSelector Kubernetes label selector that narrows discovery to the objects whose labels match. When omitted, all supported objects in the selected namespaces are discovered. See `labelSelector` Block below.
     * @return builder
     */
    def labelSelector(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksLabelSelectorArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksLabelSelectorArgs.builder
      builder.labelSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksLabelSelectorArgs.Builder)
    /**
     * @param matchExpressions Label requirements that an object must satisfy. Every requirement must match. See `matchExpressions` Block below.
     * @return builder
     */
    def matchExpressions(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksLabelSelectorMatchExpressionArgs.Builder]*):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksLabelSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksLabelSelectorMatchExpressionArgs.builder
      builder.matchExpressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2InputSourceState.Builder)
    /**
     * @param resourceConfiguration Resource configuration for an input source. See `resourceConfiguration` Block below.
     * @return builder
     */
    def resourceConfiguration(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.builder
      builder.resourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder)
    /**
     * @param availabilitySlo Availability SLO configuration. See `availabilitySlo` Block below.
     * @return builder
     */
    def availabilitySlo(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.builder
      builder.availabilitySlo(args(argsBuilder).build)

    /**
     * @param dataRecovery Data recovery configuration. See `dataRecovery` Block below.
     * @return builder
     */
    def dataRecovery(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.builder
      builder.dataRecovery(args(argsBuilder).build)

    /**
     * @param multiAz Multi-AZ disaster recovery configuration. See `multiAz` Block below.
     * @return builder
     */
    def multiAz(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.builder
      builder.multiAz(args(argsBuilder).build)

    /**
     * @param multiRegion Multi-region disaster recovery configuration. See `multiRegion` Block below.
     * @return builder
     */
    def multiRegion(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.builder
      builder.multiRegion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder)
    /**
     * @param crossAccountRoles Cross-account IAM role. See `crossAccountRole` Block below.
     * @return builder
     */
    def crossAccountRoles(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelCrossAccountRoleArgs.Builder]*):
        com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelCrossAccountRoleArgs.builder
      builder.crossAccountRoles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2ServiceState.Builder)
    /**
     * @param associatedSystems Systems to associate with the service. See `associatedSystem` Block below.
     * @return builder
     */
    def associatedSystems(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.Builder]*):
        com.pulumi.aws.resiliencehub.inputs.V2ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.builder
      builder.associatedSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param permissionModel Permission model for resource discovery. See `permissionModel` Block below.
     * @return builder
     */
    def permissionModel(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.builder
      builder.permissionModel(args(argsBuilder).build)
