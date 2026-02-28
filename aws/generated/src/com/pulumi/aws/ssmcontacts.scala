package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ssmcontacts:
  /**
   * Resource for managing an AWS SSM Contacts Contact Channel.
   *  
   *  &gt; **NOTE:** The contact channel needs to be activated in the AWS Systems Manager console, otherwise it can&#39;t be used to engage the contact. See the [Contacts section of the Incident Manager User Guide](https://docs.aws.amazon.com/incident-manager/latest/userguide/contacts.html) for more information.
   */
  def ContactChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssmcontacts.ContactChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmcontacts.ContactChannelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ssmcontacts.ContactChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS SSM Contact.
   *  
   *  &gt; **NOTE:** A contact implicitly depends on a replication set. If you configured your replication set in Pulumi, we recommend you add it to the `dependsOn` argument for the Contact Resource.
   */
  def Contact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssmcontacts.ContactArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmcontacts.ContactArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssmcontacts.Contact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssmcontacts.PlanArgs.Builder)
    /**
     * @param stages One or more configuration blocks for specifying a list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods. See Stage below for more details.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder]*):
        com.pulumi.aws.ssmcontacts.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmcontacts.ContactChannelArgs.Builder)
    /**
     * @param deliveryAddress Block that contains contact engagement details. See details below.
     * @return builder
     */
    def deliveryAddress(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.Builder]):
        com.pulumi.aws.ssmcontacts.ContactChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.builder
      builder.deliveryAddress(args(argsBuilder).build)

  /** Resource for managing an AWS SSM Contact Plan. */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssmcontacts.PlanArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssmcontacts.PlanArgs.builder
    
    com.pulumi.aws.ssmcontacts.Plan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SsmcontactsFunctions = com.pulumi.aws.ssmcontacts.SsmcontactsFunctions
  object SsmcontactsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.*
  extension (self: SsmcontactsFunctions.type)
    /** Data source for managing an AWS SSM Contact. */
    def getContact(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmcontacts.outputs.GetContactResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContact(args(argsBuilder).build)

    /** Data source for managing an AWS SSM Contact. */
    def getContactPlain(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmcontacts.outputs.GetContactResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactPlainArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContactPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SSM Contacts Contact Channel. */
    def getContactChannel(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactChannelArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmcontacts.outputs.GetContactChannelResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactChannelArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContactChannel(args(argsBuilder).build)

    /** Data source for managing an AWS SSM Contacts Contact Channel. */
    def getContactChannelPlain(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactChannelPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmcontacts.outputs.GetContactChannelResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactChannelPlainArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContactChannelPlain(args(argsBuilder).build)

    /** Data source for managing a Plan of an AWS SSM Contact. */
    def getPlan(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetPlanArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmcontacts.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetPlanArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getPlan(args(argsBuilder).build)

    /** Data source for managing a Plan of an AWS SSM Contact. */
    def getPlanPlain(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetPlanPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmcontacts.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetPlanPlainArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getPlanPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder)
    /**
     * @param targets One or more configuration blocks for specifying the contacts or contact methods that the escalation plan or engagement plan is engaging. See Target below for more details.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder]*):
        com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder)
    /**
     * @param channelTargetInfo A configuration block for specifying information about the contact channel that Incident Manager engages. See Channel Target Info for more details.
     * @return builder
     */
    def channelTargetInfo(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetChannelTargetInfoArgs.Builder]):
        com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetChannelTargetInfoArgs.builder
      builder.channelTargetInfo(args(argsBuilder).build)

    /**
     * @param contactTargetInfo A configuration block for specifying information about the contact that Incident Manager engages. See Contact Target Info for more details.
     * @return builder
     */
    def contactTargetInfo(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetContactTargetInfoArgs.Builder]):
        com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetContactTargetInfoArgs.builder
      builder.contactTargetInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.PlanState.Builder)
    /**
     * @param stages One or more configuration blocks for specifying a list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods. See Stage below for more details.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.Builder]*):
        com.pulumi.aws.ssmcontacts.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.ssmcontacts.inputs.PlanStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmcontacts.inputs.ContactChannelState.Builder)
    /**
     * @param deliveryAddress Block that contains contact engagement details. See details below.
     * @return builder
     */
    def deliveryAddress(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.Builder]):
        com.pulumi.aws.ssmcontacts.inputs.ContactChannelState.Builder =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs.builder
      builder.deliveryAddress(args(argsBuilder).build)
