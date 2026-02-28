package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object amp:
  extension (builder: com.pulumi.aws.amp.ResourcePolicyArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.ResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Alert Manager Definition */
  def AlertManagerDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.AlertManagerDefinitionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.amp.AlertManagerDefinitionArgs.builder
    
    com.pulumi.aws.amp.AlertManagerDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.amp.WorkspaceArgs.Builder)
    /**
     * @param loggingConfiguration Logging configuration for the workspace. See Logging Configuration below for details.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.amp.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

  type AmpFunctions = com.pulumi.aws.amp.AmpFunctions
  object AmpFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.amp.AmpFunctions.*
  extension (self: AmpFunctions.type)
    /** Returns the default scraper configuration used when Amazon EKS creates a scraper for you. */
    def getDefaultScraperConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.amp.outputs.GetDefaultScraperConfigurationResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getDefaultScraperConfiguration(args(argsBuilder).build)

    /** Returns the default scraper configuration used when Amazon EKS creates a scraper for you. */
    def getDefaultScraperConfigurationPlain(args: Endofunction[com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.amp.outputs.GetDefaultScraperConfigurationResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationPlainArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getDefaultScraperConfigurationPlain(args(argsBuilder).build)

    /** Provides an Amazon Managed Prometheus workspace data source. */
    def getWorkspace(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspaceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.amp.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspaceArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspace(args(argsBuilder).build)

    /** Provides an Amazon Managed Prometheus workspace data source. */
    def getWorkspacePlain(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspacePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.amp.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspacePlain(args(argsBuilder).build)

    /** Provides the aliases, ARNs, and workspace IDs of Amazon Prometheus workspaces. */
    def getWorkspaces(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspacesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.amp.outputs.GetWorkspacesResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspacesArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspaces(args(argsBuilder).build)

    /** Provides the aliases, ARNs, and workspace IDs of Amazon Prometheus workspaces. */
    def getWorkspacesPlain(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspacesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.amp.outputs.GetWorkspacesResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspacesPlainArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspacesPlain(args(argsBuilder).build)

  /**
   * Manages an Amazon Managed Service for Prometheus (AMP) Resource Policy.
   *  
   *  Resource-based policies allow you to grant permissions to other AWS accounts or services to access your Prometheus workspace. This enables cross-account access and fine-grained permissions for workspace sharing.
   */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.amp.ResourcePolicyArgs.builder
    
    com.pulumi.aws.amp.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ## Import
   *  
   *  Using `pulumi import`, import the Managed Scraper using its identifier.
   *  For example:
   *  
   *  ```sh
   *  $ pulumi import aws:amp/scraper:Scraper example s-0123abc-0000-0123-a000-000000000000
   *  ```
   */
  def Scraper(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.ScraperArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amp.ScraperArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.amp.Scraper(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder)
    /**
     * @param limitsPerLabelSets Configuration block for setting limits on metrics with specific label sets. Detailed below.
     * @return builder
     */
    def limitsPerLabelSets(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder]*):
        com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.builder
      builder.limitsPerLabelSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Query Logging Configuration. */
  def QueryLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.amp.QueryLoggingConfigurationArgs.builder
    
    com.pulumi.aws.amp.QueryLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Rule Group Namespace */
  def RuleGroupNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.RuleGroupNamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amp.RuleGroupNamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.amp.RuleGroupNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder)
    /**
     * @param destinations Configuration block for the logging destinations. See `destinations`.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder]*):
        com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.ScraperArgs.Builder)
    /**
     * @param destination Configuration block for the managed scraper to send metrics to. See `destination`.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param roleConfiguration Configuration block to enable writing to an Amazon Managed Service for Prometheus workspace in a different account. See `roleConfiguration` below.
     * @return builder
     */
    def roleConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.builder
      builder.roleConfiguration(args(argsBuilder).build)

    /**
     * @param source Configuration block to specify where the managed scraper will collect metrics from. See `source`.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Workspace. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amp.WorkspaceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.amp.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Managed Service for Prometheus Workspace Configuration. */
  def WorkspaceConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.amp.WorkspaceConfigurationArgs.builder
    
    com.pulumi.aws.amp.WorkspaceConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder)
    /**
     * @param limits Configuration block for the limits to apply to the specified label set. Detailed below.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetLimitsArgs.Builder]):
        com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperState.Builder)
    /**
     * @param destination Configuration block for the managed scraper to send metrics to. See `destination`.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param roleConfiguration Configuration block to enable writing to an Amazon Managed Service for Prometheus workspace in a different account. See `roleConfiguration` below.
     * @return builder
     */
    def roleConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.builder
      builder.roleConfiguration(args(argsBuilder).build)

    /**
     * @param source Configuration block to specify where the managed scraper will collect metrics from. See `source`.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder)
    /**
     * @param cloudwatchLogs Configuration block for CloudWatch Logs destination. See `cloudwatchLogs`.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param filters A list of filter configurations that specify which logs should be sent to the destination. See `filters`.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationFiltersArgs.Builder]):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.WorkspaceState.Builder)
    /**
     * @param loggingConfiguration Logging configuration for the workspace. See Logging Configuration below for details.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.amp.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.QueryLoggingConfigurationState.Builder)
    /**
     * @param destinations Configuration block for the logging destinations. See `destinations`.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder]*):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.WorkspaceConfigurationState.Builder)
    /**
     * @param limitsPerLabelSets Configuration block for setting limits on metrics with specific label sets. Detailed below.
     * @return builder
     */
    def limitsPerLabelSets(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder]*):
        com.pulumi.aws.amp.inputs.WorkspaceConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.builder
      builder.limitsPerLabelSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.WorkspaceConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder)
    /**
     * @param eks Configuration block for an EKS cluster source. See `eks`.
     * @return builder
     */
    def eks(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperSourceEksArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperSourceEksArgs.builder
      builder.eks(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ResourcePolicyState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.ResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder)
    /**
     * @param amp Configuration block for an Amazon Managed Prometheus workspace destination. See `amp`.
     * @return builder
     */
    def amp(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperDestinationAmpArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperDestinationAmpArgs.builder
      builder.amp(args(argsBuilder).build)
