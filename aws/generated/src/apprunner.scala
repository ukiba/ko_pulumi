package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object apprunner:
  object ApprunnerFunctions:
    /**
     * Use this data source to get the HostedZoneId of an AWS App Runner service deployed
     * in a given region for the purpose of using it in an AWS Route53 Alias record.
     */
    inline def getHostedZoneId(args: Endofunction[com.pulumi.aws.apprunner.inputs.GetHostedZoneIdArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apprunner.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.GetHostedZoneIdArgs.builder
      com.pulumi.aws.apprunner.ApprunnerFunctions.getHostedZoneId(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get the HostedZoneId of an AWS App Runner service deployed
     * in a given region for the purpose of using it in an AWS Route53 Alias record.
     */
    inline def getHostedZoneIdPlain(args: Endofunction[com.pulumi.aws.apprunner.inputs.GetHostedZoneIdPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apprunner.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.GetHostedZoneIdPlainArgs.builder
      com.pulumi.aws.apprunner.ApprunnerFunctions.getHostedZoneIdPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an App Runner AutoScaling Configuration Version. */
  def AutoScalingConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.apprunner.AutoScalingConfigurationVersion(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an App Runner Connection.
   * 
   * &gt; **NOTE:** After creation, you must complete the authentication handshake using the App Runner console.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.ConnectionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.apprunner.Connection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an App Runner Custom Domain association.
   * 
   * &gt; **NOTE:** After creation, you must use the information in the `certificateValidationRecords` attribute to add CNAME records to your DNS. For each mapped domain name, add a mapping to the target App Runner subdomain (found in the `dnsTarget` attribute) and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).
   */
  def CustomDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.CustomDomainAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apprunner.CustomDomainAssociationArgs.builder
    com.pulumi.aws.apprunner.CustomDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the default App Runner auto scaling configuration.
   * When creating or updating this resource the existing default auto scaling configuration will be set to non-default automatically.
   * When creating or updating this resource the configuration is automatically assigned as the default to the new services you create in the future. The new default designation doesn&#39;t affect the associations that were previously set for existing services.
   * Each account can have only one default auto scaling configuration per Region.
   */
  def DefaultAutoScalingConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersionArgs.builder
    com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an App Runner Deployment Operation. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.DeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apprunner.DeploymentArgs.builder
    com.pulumi.aws.apprunner.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an App Runner Observability Configuration. */
  def ObservabilityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.apprunner.ObservabilityConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an App Runner Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.ServiceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.apprunner.Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an App Runner VPC Connector. */
  def VpcConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.VpcConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.VpcConnectorArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.apprunner.VpcConnector(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an App Runner VPC Ingress Connection. */
  def VpcIngressConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.VpcIngressConnectionArgs.builder
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
    com.pulumi.aws.apprunner.VpcIngressConnection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
