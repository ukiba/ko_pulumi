package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object apprunner:
  object ApprunnerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get the HostedZoneId of an AWS App Runner service deployed
     * in a given region for the purpose of using it in an AWS Route53 Alias record.
     */
    inline def getHostedZoneId(args: Endofunction[com.pulumi.aws.apprunner.inputs.GetHostedZoneIdArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.apprunner.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.GetHostedZoneIdArgs.builder
      com.pulumi.aws.apprunner.ApprunnerFunctions.getHostedZoneId(args(argsBuilder).build)

    /**
     * Use this data source to get the HostedZoneId of an AWS App Runner service deployed
     * in a given region for the purpose of using it in an AWS Route53 Alias record.
     */
    inline def getHostedZoneIdPlain(args: Endofunction[com.pulumi.aws.apprunner.inputs.GetHostedZoneIdPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apprunner.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.GetHostedZoneIdPlainArgs.builder
      com.pulumi.aws.apprunner.ApprunnerFunctions.getHostedZoneIdPlain(args(argsBuilder).build)

  /** Manages an App Runner AutoScaling Configuration Version. */
  def AutoScalingConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Runner Connection.
   * 
   * &gt; **NOTE:** After creation, you must complete the authentication handshake using the App Runner console.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Runner Custom Domain association.
   * 
   * &gt; **NOTE:** After creation, you must use the information in the `certificateValidationRecords` attribute to add CNAME records to your DNS. For each mapped domain name, add a mapping to the target App Runner subdomain (found in the `dnsTarget` attribute) and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).
   */
  def CustomDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.CustomDomainAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apprunner.CustomDomainAssociationArgs.builder
    com.pulumi.aws.apprunner.CustomDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages the default App Runner auto scaling configuration.
   * When creating or updating this resource the existing default auto scaling configuration will be set to non-default automatically.
   * When creating or updating this resource the configuration is automatically assigned as the default to the new services you create in the future. The new default designation doesn&#39;t affect the associations that were previously set for existing services.
   * Each account can have only one default auto scaling configuration per Region.
   */
  def DefaultAutoScalingConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersionArgs.builder
    com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Runner Deployment Operation. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.DeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.apprunner.DeploymentArgs.builder
    com.pulumi.aws.apprunner.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.apprunner.DeploymentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.apprunner.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an App Runner Observability Configuration. */
  def ObservabilityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder)
    /**
     * @param traceConfiguration Configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See `traceConfiguration` Block below for more details.
     * @return builder
     */
    def traceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.builder
      builder.traceConfiguration(args(argsBuilder).build)

  /** Manages an App Runner Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.apprunner.ServiceArgs.Builder)
    /**
     * @param encryptionConfiguration Custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param healthCheckConfiguration Settings of the health check that AWS App Runner performs to monitor the health of your service. See `healthCheckConfiguration` below.
     * @return builder
     */
    def healthCheckConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.builder
      builder.healthCheckConfiguration(args(argsBuilder).build)

    /**
     * @param instanceConfiguration Runtime configuration of instances (scaling units) of the App Runner service. See `instanceConfiguration` below.
     * @return builder
     */
    def instanceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web application that the App Runner service runs. See `networkConfiguration` below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param observabilityConfiguration Observability configuration of your service. See `observabilityConfiguration` below.
     * @return builder
     */
    def observabilityConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.builder
      builder.observabilityConfiguration(args(argsBuilder).build)

    /**
     * @param sourceConfiguration Source to deploy to the App Runner service. Can be a code or an image repository. See `sourceConfiguration` below.
     * @return builder
     */
    def sourceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  /** Manages an App Runner VPC Connector. */
  def VpcConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.VpcConnectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Runner VPC Ingress Connection. */
  def VpcIngressConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder)
    /**
     * @param ingressVpcConfiguration Specifications for the customer\u2019s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See `ingressVpcConfiguration` Block below for more details.
     * @return builder
     */
    def ingressVpcConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.builder
      builder.ingressVpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.CustomDomainAssociationState.Builder)
    /**
     * @param certificateValidationRecords Set of certificate CNAME records used for this domain name. See `certificateValidationRecords` Block below for more details.
     * @return builder
     */
    def certificateValidationRecords(args: Endofunction[com.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordArgs.Builder]*):
        com.pulumi.aws.apprunner.inputs.CustomDomainAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordArgs.builder
      builder.certificateValidationRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apprunner.inputs.DeploymentState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationState.Builder)
    /**
     * @param traceConfiguration Configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See `traceConfiguration` Block below for more details.
     * @return builder
     */
    def traceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.builder
      builder.traceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder)
    /**
     * @param egressConfiguration Network configuration settings for outbound message traffic. See `egressConfiguration` below.
     * @return builder
     */
    def egressConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationEgressConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationEgressConfigurationArgs.builder
      builder.egressConfiguration(args(argsBuilder).build)

    /**
     * @param ingressConfiguration Network configuration settings for inbound network traffic. See `ingressConfiguration` below.
     * @return builder
     */
    def ingressConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationIngressConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationIngressConfigurationArgs.builder
      builder.ingressConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder)
    /**
     * @param authenticationConfiguration Configuration for resources needed to authenticate access to some source repositories. See `authenticationConfiguration` below.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param codeRepository Description of a source code repository. See `codeRepository` below.
     * @return builder
     */
    def codeRepository(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.builder
      builder.codeRepository(args(argsBuilder).build)

    /**
     * @param imageRepository Description of a source image repository. See `imageRepository` below.
     * @return builder
     */
    def imageRepository(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.builder
      builder.imageRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder)
    /**
     * @param codeConfiguration Configuration for building and running the service from a source code repository. See `codeConfiguration` below.
     * @return builder
     */
    def codeConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.builder
      builder.codeConfiguration(args(argsBuilder).build)

    /**
     * @param sourceCodeVersion Version that should be used within the source code repository. See `sourceCodeVersion` below.
     * @return builder
     */
    def sourceCodeVersion(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs.builder
      builder.sourceCodeVersion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder)
    /**
     * @param codeConfigurationValues Basic configuration for building and running the App Runner service. Use this parameter to quickly launch an App Runner service without providing an apprunner.yaml file in the source code repository (or ignoring the file if it exists). See `codeConfigurationValues` below.
     * @return builder
     */
    def codeConfigurationValues(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs.builder
      builder.codeConfigurationValues(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder)
    /**
     * @param imageConfiguration Configuration for running the identified image. See `imageConfiguration` below.
     * @return builder
     */
    def imageConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs.builder
      builder.imageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceState.Builder)
    /**
     * @param encryptionConfiguration Custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See `encryptionConfiguration` below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param healthCheckConfiguration Settings of the health check that AWS App Runner performs to monitor the health of your service. See `healthCheckConfiguration` below.
     * @return builder
     */
    def healthCheckConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.builder
      builder.healthCheckConfiguration(args(argsBuilder).build)

    /**
     * @param instanceConfiguration Runtime configuration of instances (scaling units) of the App Runner service. See `instanceConfiguration` below.
     * @return builder
     */
    def instanceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web application that the App Runner service runs. See `networkConfiguration` below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param observabilityConfiguration Observability configuration of your service. See `observabilityConfiguration` below.
     * @return builder
     */
    def observabilityConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.builder
      builder.observabilityConfiguration(args(argsBuilder).build)

    /**
     * @param sourceConfiguration Source to deploy to the App Runner service. Can be a code or an image repository. See `sourceConfiguration` below.
     * @return builder
     */
    def sourceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.VpcIngressConnectionState.Builder)
    /**
     * @param ingressVpcConfiguration Specifications for the customer\u2019s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See `ingressVpcConfiguration` Block below for more details.
     * @return builder
     */
    def ingressVpcConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.VpcIngressConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.builder
      builder.ingressVpcConfiguration(args(argsBuilder).build)
