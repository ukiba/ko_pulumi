package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ssm:
  extension (builder: com.pulumi.aws.ssm.DocumentArgs.Builder)
    /**
     * @param attachmentsSources One or more configuration blocks describing attachments sources to a version of a document. See `attachmentsSource` block below for details.
     * @return builder
     */
    def attachmentsSources(args: Endofunction[com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.Builder]*):
        com.pulumi.aws.ssm.DocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.builder
      builder.attachmentsSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.PatchBaselineArgs.Builder)
    /**
     * @param approvalRules Set of rules used to include patches in the baseline. Up to 10 approval rules can be specified. See `approvalRule` below.
     * @return builder
     */
    def approvalRules(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder]*):
        com.pulumi.aws.ssm.PatchBaselineArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.builder
      builder.approvalRules(args.map(_(argsBuilder).build)*)

    /**
     * @param globalFilters Set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT`, `CLASSIFICATION`, `MSRC_SEVERITY`, and `PATCH_ID`.
     * @return builder
     */
    def globalFilters(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.Builder]*):
        com.pulumi.aws.ssm.PatchBaselineArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.builder
      builder.globalFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Configuration block with alternate sources for patches. Applies to Linux instances only. See `source` below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.Builder]*):
        com.pulumi.aws.ssm.PatchBaselineArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  /** Provides an SSM Maintenance Window Task resource */
  def MaintenanceWindowTask(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ssm.MaintenanceWindowTask(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for registering an AWS Systems Manager Default Patch Baseline. */
  def DefaultPatchBaseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.DefaultPatchBaselineArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssm.DefaultPatchBaselineArgs.builder
    
    com.pulumi.aws.ssm.DefaultPatchBaseline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SSM Maintenance Window resource */
  def MaintenanceWindow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.MaintenanceWindowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.MaintenanceWindowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.MaintenanceWindow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an SSM Parameter resource.
   *  
   *  &gt; **Note:** The `overwrite` argument makes it possible to overwrite an existing SSM Parameter created outside of IAC.
   */
  def Parameter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ParameterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ParameterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.Parameter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Terraform resource for managing a Contacts Rotation in AWS Systems Manager Incident Manager.
   *  
   *  &gt; **NOTE:** A rotation implicitly depends on a replication set. If you configured your replication set in Terraform, we recommend you add it to the `dependsOn` argument for the Terraform Contact Resource.
   */
  def ContactsRotation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ContactsRotationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ContactsRotationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.ContactsRotation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder)
    /**
     * @param targets The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.Builder]*):
        com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

    /**
     * @param taskInvocationParameters Configuration block with parameters for task execution.
     * @return builder
     */
    def taskInvocationParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder]):
        com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.builder
      builder.taskInvocationParameters(args(argsBuilder).build)

  type SsmFunctions = com.pulumi.aws.ssm.SsmFunctions
  object SsmFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ssm.SsmFunctions.*
  extension (self: SsmFunctions.type)
    /** Provides a Terraform data source for managing a Contacts Rotation in AWS Systems Manager Incident Manager */
    def getContactsRotation(args: Endofunction[com.pulumi.aws.ssm.inputs.GetContactsRotationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetContactsRotationResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetContactsRotationArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getContactsRotation(args(argsBuilder).build)

    /** Provides a Terraform data source for managing a Contacts Rotation in AWS Systems Manager Incident Manager */
    def getContactsRotationPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetContactsRotationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetContactsRotationResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetContactsRotationPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getContactsRotationPlain(args(argsBuilder).build)

    /** Gets the contents of the specified Systems Manager document. */
    def getDocument(args: Endofunction[com.pulumi.aws.ssm.inputs.GetDocumentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetDocumentArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getDocument(args(argsBuilder).build)

    /** Gets the contents of the specified Systems Manager document. */
    def getDocumentPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetDocumentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetDocumentPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getDocumentPlain(args(argsBuilder).build)

    /** Use this data source to get the instance IDs of SSM managed instances. */
    def getInstances(args: Endofunction[com.pulumi.aws.ssm.inputs.GetInstancesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetInstancesArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getInstances(args(argsBuilder).build)

    /** Use this data source to get the instance IDs of SSM managed instances. */
    def getInstancesPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetInstancesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetInstancesPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getInstancesPlain(args(argsBuilder).build)

    /** Use this data source to get the window IDs of SSM maintenance windows. */
    def getMaintenanceWindows(args: Endofunction[com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetMaintenanceWindowsResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getMaintenanceWindows(args(argsBuilder).build)

    /** Use this data source to get the window IDs of SSM maintenance windows. */
    def getMaintenanceWindowsPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetMaintenanceWindowsResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getMaintenanceWindowsPlain(args(argsBuilder).build)

    /** Provides an SSM Parameter data source. */
    def getParameter(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParameterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetParameterResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParameterArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParameter(args(argsBuilder).build)

    /** Provides an SSM Parameter data source. */
    def getParameterPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParameterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetParameterResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParameterPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParameterPlain(args(argsBuilder).build)

    /** Use this data source to get information about one or more System Manager parameters in a specific hierarchy. */
    def getParametersByPath(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParametersByPathArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetParametersByPathResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParametersByPathArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParametersByPath(args(argsBuilder).build)

    /** Use this data source to get information about one or more System Manager parameters in a specific hierarchy. */
    def getParametersByPathPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParametersByPathPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetParametersByPathResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParametersByPathPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParametersByPathPlain(args(argsBuilder).build)

    /** Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided. */
    def getPatchBaseline(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselineArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetPatchBaselineResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselineArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaseline(args(argsBuilder).build)

    /** Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided. */
    def getPatchBaselinePlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetPatchBaselineResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinePlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaselinePlain(args(argsBuilder).build)

    /** Data source for retrieving AWS SSM (Systems Manager) Patch Baselines. */
    def getPatchBaselines(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetPatchBaselinesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaselines(args(argsBuilder).build)

    /** Data source for retrieving AWS SSM (Systems Manager) Patch Baselines. */
    def getPatchBaselinesPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetPatchBaselinesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinesPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaselinesPlain(args(argsBuilder).build)

  /**
   * Provides an SSM Document resource
   *  
   *  &gt; **NOTE on updating SSM documents:** Only documents with a schema version of 2.0
   *  or greater can update their content once created, see [SSM Schema Features](http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html#document-schemas-features). To update a document with an older schema version you must recreate the resource. Not all document types support a schema version of 2.0 or greater. Refer to [SSM document schema features and examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html) for information about which schema versions are supported for the respective `documentType`.
   */
  def Document(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.DocumentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.DocumentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.Document(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SSM resource data sync. */
  def ResourceDataSync(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ResourceDataSyncArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ResourceDataSyncArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ssm.ResourceDataSync(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssm.ContactsRotationArgs.Builder)
    /**
     * @param recurrence Information about when an on-call rotation is in effect and how long the rotation period lasts. Exactly one of either `dailySettings`, `monthlySettings`, or `weeklySettings` must be populated. See Recurrence for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder]):
        com.pulumi.aws.ssm.ContactsRotationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.Builder)
    /**
     * @param targets The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     *  (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.Builder]*):
        com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.ResourceDataSyncArgs.Builder)
    /**
     * @param s3Destination Amazon S3 configuration details for the sync.
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.Builder]):
        com.pulumi.aws.ssm.ResourceDataSyncArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  /** Provides an SSM Maintenance Window Target resource */
  def MaintenanceWindowTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ssm.MaintenanceWindowTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Associates an SSM Document to an instance or EC2 tag. */
  def Association(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.AssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.AssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.Association(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** This setting defines how a user interacts with or uses a service or a feature of a service. */
  def ServiceSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ServiceSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssm.ServiceSettingArgs.builder
    
    com.pulumi.aws.ssm.ServiceSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder)
    /**
     * @param configurationDefinition Definition of the Quick Setup configuration that the configuration manager deploys. See `configurationDefinition` below.
     * @return builder
     */
    def configurationDefinition(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.builder
      builder.configurationDefinition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.Builder]):
        com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.AssociationArgs.Builder)
    /**
     * @param outputLocation An output location block. Output Location is documented below.
     * @return builder
     */
    def outputLocation(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.Builder]):
        com.pulumi.aws.ssm.AssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.builder
      builder.outputLocation(args(argsBuilder).build)

    /**
     * @param targets A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationTargetArgs.Builder]*):
        com.pulumi.aws.ssm.AssociationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.AssociationTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS SSM Quick Setup Configuration Manager. */
  def QuicksetupConfigurationManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.QuicksetupConfigurationManager(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an SSM Patch Baseline resource.
   *  
   *  &gt; **NOTE on Patch Baselines:** The `approvedPatches` and `approvalRule` are
   *  both marked as optional fields, but the Patch Baseline requires that at least one
   *  of them is specified.
   */
  def PatchBaseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.PatchBaselineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.PatchBaselineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.PatchBaseline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Registers an on-premises server or virtual machine with Amazon EC2 so that it can be managed using Run Command. */
  def Activation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ActivationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ActivationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssm.Activation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SSM Patch Group resource */
  def PatchGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.PatchGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssm.PatchGroupArgs.builder
    
    com.pulumi.aws.ssm.PatchGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.Builder)
    /**
     * @param filters Key-value pairs used to filter the results. See `filter` below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinesFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.Builder)
    /**
     * @param coverageTimes (Required) Information about when an on-call shift begins and ends. See Coverage Times for more details.
     * @return builder
     */
    def coverageTimes(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.builder
      builder.coverageTimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.DocumentState.Builder)
    /**
     * @param attachmentsSources One or more configuration blocks describing attachments sources to a version of a document. See `attachmentsSource` block below for details.
     * @return builder
     */
    def attachmentsSources(args: Endofunction[com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.DocumentState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.builder
      builder.attachmentsSources(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters One or more configuration blocks describing the parameters for the document. See `parameter` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.ssm.inputs.DocumentParameterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.DocumentState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.DocumentParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.Builder)
    /**
     * @param parameters The parameters for the RUN_COMMAND task execution. Documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.Builder)
    /**
     * @param handOffTime (Required) The hand off time. See Hand Off Time for more details.
     * @return builder
     */
    def handOffTime(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingHandOffTimeArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingHandOffTimeArgs.builder
      builder.handOffTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.GetInstancesArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetInstancesFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.GetInstancesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetInstancesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder)
    /**
     * @param cloudwatchConfig Configuration options for sending command output to CloudWatch Logs. Documented below.
     * @return builder
     */
    def cloudwatchConfig(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs.builder
      builder.cloudwatchConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param parameters The parameters for the RUN_COMMAND task execution. Documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationState.Builder)
    /**
     * @param recurrence Information about when an on-call rotation is in effect and how long the rotation period lasts. Exactly one of either `dailySettings`, `monthlySettings`, or `weeklySettings` must be populated. See Recurrence for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder)
    /**
     * @param configurationDefinition Definition of the Quick Setup configuration that the configuration manager deploys. See `configurationDefinition` below.
     * @return builder
     */
    def configurationDefinition(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.builder
      builder.configurationDefinition(args(argsBuilder).build)

    /**
     * @param statusSummaries A summary of the state of the configuration manager. This includes deployment statuses, association statuses, drift statuses, health checks, and more. See `statusSummaries` below.
     * @return builder
     */
    def statusSummaries(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerStatusSummaryArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerStatusSummaryArgs.builder
      builder.statusSummaries(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.Builder]):
        com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskState.Builder)
    /**
     * @param targets The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

    /**
     * @param taskInvocationParameters Configuration block with parameters for task execution.
     * @return builder
     */
    def taskInvocationParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.builder
      builder.taskInvocationParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder)
    def dailySettings(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceDailySettingArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceDailySettingArgs.builder
      builder.dailySettings(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlySettings (Optional) Information about on-call rotations that recur monthly. See Monthly Settings for more details.
     * @return builder
     */
    def monthlySettings(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.builder
      builder.monthlySettings(args.map(_(argsBuilder).build)*)

    /**
     * @param shiftCoverages (Optional) Information about the days of the week that the on-call rotation coverage includes. See Shift Coverages for more details.
     * @return builder
     */
    def shiftCoverages(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.builder
      builder.shiftCoverages(args.map(_(argsBuilder).build)*)

    /**
     * @param weeklySettings (Optional) Information about on-call rotations that recur weekly. See Weekly Settings for more details.
     * @return builder
     */
    def weeklySettings(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.builder
      builder.weeklySettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.AssociationState.Builder)
    /**
     * @param outputLocation An output location block. Output Location is documented below.
     * @return builder
     */
    def outputLocation(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.Builder]):
        com.pulumi.aws.ssm.inputs.AssociationState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.builder
      builder.outputLocation(args(argsBuilder).build)

    /**
     * @param targets A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationTargetArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.AssociationState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.AssociationTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder)
    /**
     * @param automationParameters The parameters for an AUTOMATION task type. Documented below.
     * @return builder
     */
    def automationParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.builder
      builder.automationParameters(args(argsBuilder).build)

    /**
     * @param lambdaParameters The parameters for a LAMBDA task type. Documented below.
     * @return builder
     */
    def lambdaParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs.builder
      builder.lambdaParameters(args(argsBuilder).build)

    /**
     * @param runCommandParameters The parameters for a RUN_COMMAND task type. Documented below.
     * @return builder
     */
    def runCommandParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.builder
      builder.runCommandParameters(args(argsBuilder).build)

    /**
     * @param stepFunctionsParameters The parameters for a STEP_FUNCTIONS task type. Documented below.
     * @return builder
     */
    def stepFunctionsParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs.builder
      builder.stepFunctionsParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder)
    /**
     * @param end (Required) The end time of the on-call shift. See Hand Off Time for more details.
     * @return builder
     */
    def end(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeEndArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeEndArgs.builder
      builder.end(args(argsBuilder).build)

    /**
     * @param start (Required) The start time of the on-call shift. See Hand Off Time for more details.
     * @return builder
     */
    def start(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeStartArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeStartArgs.builder
      builder.start(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetState.Builder)
    /**
     * @param targets The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     *  (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.ResourceDataSyncState.Builder)
    /**
     * @param s3Destination Amazon S3 configuration details for the sync.
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ResourceDataSyncState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.Builder)
    /**
     * @param handOffTime (Required) The hand off time. See Hand Off Time for more details.
     * @return builder
     */
    def handOffTime(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingHandOffTimeArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingHandOffTimeArgs.builder
      builder.handOffTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder)
    /**
     * @param patchFilters Patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid combinations of these Keys and the `operatingSystem` value can be found in the [SSM DescribePatchProperties API Reference](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html). Valid Values are exact values for the patch property given as the key, or a wildcard `*`, which matches all values. `PATCH_SET` defaults to `OS` if unspecified
     * @return builder
     */
    def patchFilters(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRulePatchFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRulePatchFilterArgs.builder
      builder.patchFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder)
    /**
     * @param approvalRules Set of rules used to include patches in the baseline. Up to 10 approval rules can be specified. See `approvalRule` below.
     * @return builder
     */
    def approvalRules(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.builder
      builder.approvalRules(args.map(_(argsBuilder).build)*)

    /**
     * @param globalFilters Set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT`, `CLASSIFICATION`, `MSRC_SEVERITY`, and `PATCH_ID`.
     * @return builder
     */
    def globalFilters(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.builder
      builder.globalFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Configuration block with alternate sources for patches. Applies to Linux instances only. See `source` below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)
