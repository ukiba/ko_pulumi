package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object observabilityadmin:
  /**
   * Manages an AWS CloudWatch Observability Admin Centralization Rule For Organization.
   * 
   * Centralization rules enable you to centralize log data from multiple AWS accounts and regions within your organization to a single destination account and region. This helps with log management, compliance, and cost optimization by consolidating logs in a central location.
   * 
   * This requires an AWS account within an organization with at least [delegated administrator permissions](https://docs.aws.amazon.com/organizations/latest/APIReference/API_RegisterDelegatedAdministrator.html).
   */
  def CentralizationRuleForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganization(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CloudWatch Observability Admin S3 Table Integration. This integration enables CloudWatch to duplicate telemetry data to Amazon S3 Tables, making it available for analysis by tools such as Amazon Athena and Amazon Redshift.
   * 
   * For more information, see the [CloudWatch Logs S3 Tables integration documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/s3-tables-integration.html).
   */
  def S3TableIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.S3TableIntegration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Enrichment.
   * 
   * Telemetry enrichment enables resource tags for telemetry data in your account, enhancing telemetry with additional resource metadata from AWS Resource Explorer to provide richer context for monitoring and observability.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** Only one telemetry enrichment can exist per account per region. Creating this resource enables the feature; destroying it disables the feature.
   */
  def TelemetryEnrichment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.builder
    com.pulumi.aws.observabilityadmin.TelemetryEnrichment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Evaluation.
   * 
   * Telemetry evaluation begins onboarding the caller AWS account to the telemetry config feature, enabling CloudWatch to evaluate and discover the state of telemetry configuration for your AWS resources.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** Only one telemetry evaluation can exist per account per region. Creating this resource enables the feature; destroying it disables the feature.
   * 
   * &gt; **NOTE:** Do not use this resource in an account where telemetry evaluation is centrally managed by an AWS Organization via `aws.observabilityadmin.TelemetryEvaluationForOrganization`. In that case, the per-account `StartTelemetryEvaluation` API silently returns success without changing per-account state, and `GetTelemetryEvaluationStatus` reports the org-derived `RUNNING` status \u2014 so `pulumi up` appears to succeed. However, the matching `StopTelemetryEvaluation` call is rejected with `ValidationException: Telemetry evaluation is managed by the caller&#39;s organization`, so a later `terraform destroy` will fail and leave the resource in state. Use the organization variant from the management account instead.
   */
  def TelemetryEvaluation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.builder
    com.pulumi.aws.observabilityadmin.TelemetryEvaluation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Evaluation For Organization.
   * 
   * Telemetry evaluation for organization begins onboarding the organization and all member accounts to the telemetry config feature, enabling CloudWatch to evaluate and discover the state of telemetry configuration for AWS resources across the organization.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** This resource can only be used from the management account or a delegated admin account of an AWS Organization. Only one telemetry evaluation for organization can exist per organization. Creating this resource enables the feature; destroying it disables the feature.
   */
  def TelemetryEvaluationForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.builder
    com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Pipeline.
   * 
   * Telemetry pipelines allow you to collect, transform, and route telemetry data from AWS services. Each pipeline defines a source, optional processors, and one or more sinks for the telemetry data.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin Telemetry Pipelines documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** Only one telemetry pipeline per data source type is allowed per account. For example, you can have one pipeline for `amazon_api_gateway/access` and another for `amazon_vpc/flow`, but not two pipelines for the same data source type.
   */
  def TelemetryPipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.builder
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
    com.pulumi.aws.observabilityadmin.TelemetryPipeline(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Rule.
   * 
   * A telemetry rule defines how telemetry data (logs, metrics, or traces) should be collected for AWS resources within an AWS account. The rule can target one or more Regions and optionally configure a destination (such as CloudWatch Logs or S3) along with source-specific parameters for VPC flow logs, WAF logs, CloudTrail events, ELB access logs, and more.
   * 
   * &gt; **NOTE:** Before using this resource, telemetry evaluation must be enabled for your AWS account. Use the `aws.observabilityadmin.TelemetryEvaluation` resource to enable it.
   */
  def TelemetryRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.TelemetryRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Rule for an AWS Organization.
   * 
   * An organization-wide telemetry rule defines how telemetry data (logs, metrics, or traces) should be collected for AWS resources across the accounts in your organization. The rule can target one or more Regions and configure a destination (such as CloudWatch Logs or S3) along with source-specific parameters for VPC flow logs, WAF logs, CloudTrail events, ELB access logs, and more.
   * 
   * &gt; **NOTE:** Before using this resource, telemetry evaluation for organization must be enabled. Use the `aws.observabilityadmin.TelemetryEvaluationForOrganization` resource to enable it.
   * 
   * &gt; **NOTE:** This resource can only be used from the organization management account.
   */
  def TelemetryRuleForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganization(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
