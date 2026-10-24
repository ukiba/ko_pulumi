package jp.ukiba.ko_pulumi
package aws

object ssmcontacts_ext:
  extension (builder: com.pulumi.aws.ssmcontacts.ContactChannelArgs.Builder)
    /**
     * @param deliveryAddress Block that contains contact engagement details. See details below.
     * @return builder
     */
    inline def deliveryAddress(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.Builder]):
        com.pulumi.aws.ssmcontacts.ContactChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.builder
      builder.deliveryAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssmcontacts.PlanArgs.Builder)
    /**
     * @param stages One or more configuration blocks for specifying a list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods. See Stage below for more details.
     * @return builder
     */
    inline def stages(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder]*):
        com.pulumi.aws.ssmcontacts.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.ContactChannelState.Builder)
    /**
     * @param deliveryAddress Block that contains contact engagement details. See details below.
     * @return builder
     */
    inline def deliveryAddress(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.Builder]):
        com.pulumi.aws.ssmcontacts.inputs.ContactChannelState.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.builder
      builder.deliveryAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder)
    /**
     * @param targets One or more configuration blocks for specifying the contacts or contact methods that the escalation plan or engagement plan is engaging. See Target below for more details.
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder]*):
        com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder)
    /**
     * @param channelTargetInfo A configuration block for specifying information about the contact channel that Incident Manager engages. See Channel Target Info for more details.
     * @return builder
     */
    inline def channelTargetInfo(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetChannelTargetInfoArgs.Builder]):
        com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetChannelTargetInfoArgs.builder
      builder.channelTargetInfo(args(argsBuilder).build)

    /**
     * @param contactTargetInfo A configuration block for specifying information about the contact that Incident Manager engages. See Contact Target Info for more details.
     * @return builder
     */
    inline def contactTargetInfo(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetContactTargetInfoArgs.Builder]):
        com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetContactTargetInfoArgs.builder
      builder.contactTargetInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.PlanState.Builder)
    /**
     * @param stages One or more configuration blocks for specifying a list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods. See Stage below for more details.
     * @return builder
     */
    inline def stages(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder]*):
        com.pulumi.aws.ssmcontacts.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)
