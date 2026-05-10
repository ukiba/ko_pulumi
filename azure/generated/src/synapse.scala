package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object synapse:
  /** Manages a Synapse Azure Integration Runtime. */
  def IntegrationRuntimeAzure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.IntegrationRuntimeAzureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.IntegrationRuntimeAzureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.IntegrationRuntimeAzure(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Synapse Workspace keys
   * 
   *  &gt; **Note:** Keys that are actively protecting a workspace cannot be deleted. When the keys resource is deleted, if the key is inactive it will be deleted, if it is active it will not be deleted.
   */
  def WorkspaceKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.WorkspaceKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.WorkspaceKeyArgs.builder
    com.pulumi.azure.synapse.WorkspaceKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Allows you to Manages a Synapse Firewall Rule. */
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.FirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.FirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse Workspace Extended Auditing Policy. */
  def WorkspaceExtendedAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.WorkspaceExtendedAuditingPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.WorkspaceExtendedAuditingPolicyArgs.builder
    com.pulumi.azure.synapse.WorkspaceExtendedAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse SQL Pool Workload Group. */
  def SqlPoolWorkloadGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SqlPoolWorkloadGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.SqlPoolWorkloadGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.SqlPoolWorkloadGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse SQL Pool Extended Auditing Policy. */
  def SqlPoolExtendedAuditingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SqlPoolExtendedAuditingPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.SqlPoolExtendedAuditingPolicyArgs.builder
    com.pulumi.azure.synapse.SqlPoolExtendedAuditingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Active Directory SQL Administrator setting for a Synapse Workspace */
  def WorkspaceSqlAadAdmin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.WorkspaceSqlAadAdminArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.WorkspaceSqlAadAdminArgs.builder
    com.pulumi.azure.synapse.WorkspaceSqlAadAdmin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentBaselineArgs.Builder)
    /**
     * @param baselines One or more `baseline` blocks as defined below.
     * @return builder
     */
    def baselines(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.Builder]*):
        com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentBaselineArgs.Builder =
      def argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.builder
      builder.baselines(args.map(_(argsBuilder).build)*)

  /** Manages a Security Alert Policy for a Synapse SQL Pool. */
  def SqlPoolSecurityAlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SqlPoolSecurityAlertPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.SqlPoolSecurityAlertPolicyArgs.builder
    com.pulumi.azure.synapse.SqlPoolSecurityAlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse Private Link Hub. */
  def PrivateLinkHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.PrivateLinkHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.PrivateLinkHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.synapse.PrivateLinkHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse Spark Pool. */
  def SparkPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SparkPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.SparkPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.synapse.SparkPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.synapse.WorkspaceArgs.Builder)
    /**
     * @param azureDevopsRepo An `azureDevopsRepo` block as defined below.
     * @return builder
     */
    def azureDevopsRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.builder
      builder.azureDevopsRepo(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param githubRepo A `githubRepo` block as defined below.
     * @return builder
     */
    def githubRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.builder
      builder.githubRepo(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages the Vulnerability Assessment for a Synapse SQL Pool. */
  def SqlPoolVulnerabilityAssessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentArgs.builder
    com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse SQL Pool. */
  def SqlPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SqlPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.SqlPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.synapse.SqlPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Vulnerability Assessment for a Synapse Workspace. */
  def WorkspaceVulnerabilityAssessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.WorkspaceVulnerabilityAssessmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.WorkspaceVulnerabilityAssessmentArgs.builder
    com.pulumi.azure.synapse.WorkspaceVulnerabilityAssessment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.synapse.LinkedServiceArgs.Builder)
    /**
     * @param integrationRuntime A `integrationRuntime` block as defined below.
     * @return builder
     */
    def integrationRuntime(args: Endofunction[com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.synapse.LinkedServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  /** Manages a Synapse Role Assignment. */
  def RoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.RoleAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.RoleAssignmentArgs.builder
    com.pulumi.azure.synapse.RoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.synapse.SqlPoolArgs.Builder)
    /**
     * @param restore A `restore` block as defined below. Only applicable when `createMode` is set to `PointInTimeRestore`. Changing this forces a new Synapse SQL Pool to be created.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.Builder]):
        com.pulumi.azure.synapse.SqlPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.synapse.SqlPoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Security Alert Policy for a Synapse Workspace. */
  def WorkspaceSecurityAlertPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.WorkspaceSecurityAlertPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.WorkspaceSecurityAlertPolicyArgs.builder
    com.pulumi.azure.synapse.WorkspaceSecurityAlertPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse Linked Service. */
  def LinkedService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.LinkedServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.LinkedServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.LinkedService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse Managed Private Endpoint. */
  def ManagedPrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.ManagedPrivateEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.ManagedPrivateEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.ManagedPrivateEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.synapse.WorkspaceVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.SparkPoolArgs.Builder)
    /**
     * @param autoPause An `autoPause` block as defined below.
     * @return builder
     */
    def autoPause(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.builder
      builder.autoPause(args(argsBuilder).build)

    /**
     * @param autoScale An `autoScale` block as defined below. Exactly one of `nodeCount` or `autoScale` must be specified.
     * @return builder
     */
    def autoScale(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.builder
      builder.autoScale(args(argsBuilder).build)

    def libraryRequirement(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.builder
      builder.libraryRequirement(args(argsBuilder).build)

    def sparkConfig(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.builder
      builder.sparkConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Synapse SQL Pool Workload Classifier. */
  def SqlPoolWorkloadClassifier(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SqlPoolWorkloadClassifierArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.SqlPoolWorkloadClassifierArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.SqlPoolWorkloadClassifier(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  /** Manages an Azure Active Directory Administrator setting for a Synapse Workspace */
  def WorkspaceAadAdmin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.WorkspaceAadAdminArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.synapse.WorkspaceAadAdminArgs.builder
    com.pulumi.azure.synapse.WorkspaceAadAdmin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse Workspace. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.synapse.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse Self-hosted Integration Runtime. */
  def IntegrationRuntimeSelfHosted(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.IntegrationRuntimeSelfHostedArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.IntegrationRuntimeSelfHostedArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.IntegrationRuntimeSelfHosted(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Synapse SQL Pool Vulnerability Assessment Rule Baseline. */
  def SqlPoolVulnerabilityAssessmentBaseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentBaselineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentBaselineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentBaseline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.SparkPoolState.Builder)
    /**
     * @param autoPause An `autoPause` block as defined below.
     * @return builder
     */
    def autoPause(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.builder
      builder.autoPause(args(argsBuilder).build)

    /**
     * @param autoScale An `autoScale` block as defined below. Exactly one of `nodeCount` or `autoScale` must be specified.
     * @return builder
     */
    def autoScale(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.builder
      builder.autoScale(args(argsBuilder).build)

    def libraryRequirement(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.builder
      builder.libraryRequirement(args(argsBuilder).build)

    def sparkConfig(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.builder
      builder.sparkConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.synapse.inputs.WorkspaceState.Builder)
    /**
     * @param azureDevopsRepo An `azureDevopsRepo` block as defined below.
     * @return builder
     */
    def azureDevopsRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.builder
      builder.azureDevopsRepo(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param githubRepo A `githubRepo` block as defined below.
     * @return builder
     */
    def githubRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.builder
      builder.githubRepo(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.LinkedServiceState.Builder)
    /**
     * @param integrationRuntime A `integrationRuntime` block as defined below.
     * @return builder
     */
    def integrationRuntime(args: Endofunction[com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.synapse.inputs.LinkedServiceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.SqlPoolState.Builder)
    /**
     * @param restore A `restore` block as defined below. Only applicable when `createMode` is set to `PointInTimeRestore`. Changing this forces a new Synapse SQL Pool to be created.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SqlPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.synapse.inputs.SqlPoolState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineState.Builder)
    /**
     * @param baselines One or more `baseline` blocks as defined below.
     * @return builder
     */
    def baselines(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.Builder]*):
        com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineState.Builder =
      def argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.builder
      builder.baselines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  type SynapseFunctions = com.pulumi.azure.synapse.SynapseFunctions
  object SynapseFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.synapse.SynapseFunctions.*
  extension (self: SynapseFunctions.type)
    /** Use this data source to access information about an existing Synapse Workspace. */
    def getWorkspace(args: Endofunction[com.pulumi.azure.synapse.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.synapse.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.synapse.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.synapse.SynapseFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Synapse Workspace. */
    def getWorkspacePlain(args: Endofunction[com.pulumi.azure.synapse.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.synapse.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.synapse.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.synapse.SynapseFunctions.getWorkspacePlain(args(argsBuilder).build)
