package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object amp:
  /** Manages an Amazon Managed Service for Prometheus (AMP) Alert Manager Definition */
  def AlertManagerDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.AlertManagerDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.amp.AlertManagerDefinitionArgs.builder
    com.pulumi.aws.amp.AlertManagerDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object AmpFunctions:
    /** Returns the default scraper configuration used when Amazon EKS creates a scraper for you. */
    inline def getDefaultScraperConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.amp.outputs.GetDefaultScraperConfigurationResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getDefaultScraperConfiguration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Returns the default scraper configuration used when Amazon EKS creates a scraper for you. */
    inline def getDefaultScraperConfigurationPlain(args: Endofunction[com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.amp.outputs.GetDefaultScraperConfigurationResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetDefaultScraperConfigurationPlainArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getDefaultScraperConfigurationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides an Amazon Managed Prometheus workspace data source. */
    inline def getWorkspace(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.amp.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspaceArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides an Amazon Managed Prometheus workspace data source. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.amp.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides the aliases, ARNs, and workspace IDs of Amazon Prometheus workspaces. */
    inline def getWorkspaces(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspacesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.amp.outputs.GetWorkspacesResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspacesArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspaces(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides the aliases, ARNs, and workspace IDs of Amazon Prometheus workspaces. */
    inline def getWorkspacesPlain(args: Endofunction[com.pulumi.aws.amp.inputs.GetWorkspacesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.amp.outputs.GetWorkspacesResult] =
      val argsBuilder = com.pulumi.aws.amp.inputs.GetWorkspacesPlainArgs.builder
      com.pulumi.aws.amp.AmpFunctions.getWorkspacesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an AWS AMP (Managed Prometheus) Anomaly Detector. */
  def AnomalyDetector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.AnomalyDetectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amp.AnomalyDetectorArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.amp.AnomalyDetector(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Query Logging Configuration. */
  def QueryLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.amp.QueryLoggingConfigurationArgs.builder
    com.pulumi.aws.amp.QueryLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon Managed Service for Prometheus (AMP) Resource Policy.
   * 
   * Resource-based policies allow you to grant permissions to other AWS accounts or services to access your Prometheus workspace. This enables cross-account access and fine-grained permissions for workspace sharing.
   * 
   * The following actions are supported in resource policies for Prometheus workspaces: `aps:RemoteWrite`, `aps:QueryMetrics`, `aps:GetSeries`, `aps:GetLabels`, `aps:GetMetricMetadata`.
   * 
   * &gt; **Note:** Only Prometheus-compatible APIs can be used for workspace sharing. Non-Prometheus-compatible APIs added to the policy will be ignored. If your workspace uses customer-managed KMS keys for encryption, you must grant the principals in your resource-based policy access to those KMS keys through KMS grants. The resource ARN in the policy document must match the workspace ARN that the policy is being attached to.
   */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.ResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.amp.ResourcePolicyArgs.builder
    com.pulumi.aws.amp.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Rule Group Namespace */
  def RuleGroupNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.RuleGroupNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amp.RuleGroupNamespaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.amp.RuleGroupNamespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **Note:** If you change a Scraper&#39;s source (EKS cluster or VPC configuration), Terraform
   * will delete the current Scraper and create a new one.
   * 
   * Provides an Amazon Managed Service for Prometheus fully managed collector
   * (scraper).
   * 
   * Read more in the [Amazon Managed Service for Prometheus user guide](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-collector.html).
   */
  def Scraper(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.ScraperArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amp.ScraperArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.amp.Scraper(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Scraper Logging Configuration. */
  def ScraperLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.ScraperLoggingConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.amp.ScraperLoggingConfigurationArgs.builder
    com.pulumi.aws.amp.ScraperLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon Managed Service for Prometheus (AMP) Workspace. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.WorkspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amp.WorkspaceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.amp.Workspace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Managed Service for Prometheus Workspace Configuration. */
  def WorkspaceConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.amp.WorkspaceConfigurationArgs.builder
    com.pulumi.aws.amp.WorkspaceConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
