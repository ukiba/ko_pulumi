package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object apprunner:
  extension (builder: com.pulumi.aws.apprunner.ServiceArgs.Builder)
    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param healthCheckConfiguration Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
     * @return builder
     */
    def healthCheckConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.builder
      builder.healthCheckConfiguration(args(argsBuilder).build)

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
     * @return builder
     */
    def instanceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param observabilityConfiguration The observability configuration of your service. See Observability Configuration below for more details.
     * @return builder
     */
    def observabilityConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.builder
      builder.observabilityConfiguration(args(argsBuilder).build)

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def sourceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  /** Manages an App Runner VPC Connector. */
  def VpcConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.VpcConnectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.VpcConnectorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apprunner.VpcConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an App Runner Custom Domain association.
   *  
   *  &gt; **NOTE:** After creation, you must use the information in the `certificateValidationRecords` attribute to add CNAME records to your Domain Name System (DNS). For each mapped domain name, add a mapping to the target App Runner subdomain (found in the `dnsTarget` attribute) and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).
   */
  def CustomDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.CustomDomainAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apprunner.CustomDomainAssociationArgs.builder
    
    com.pulumi.aws.apprunner.CustomDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder)
    /**
     * @param traceConfiguration Configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
     * @return builder
     */
    def traceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.builder
      builder.traceConfiguration(args(argsBuilder).build)

  /** Manages an App Runner Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.ServiceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apprunner.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an App Runner Connection.
   *  
   *  &gt; **NOTE:** After creation, you must complete the authentication handshake using the App Runner console.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.ConnectionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apprunner.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an App Runner Observability Configuration. */
  def ObservabilityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apprunner.ObservabilityConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apprunner.DeploymentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.apprunner.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type ApprunnerFunctions = com.pulumi.aws.apprunner.ApprunnerFunctions
  object ApprunnerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.apprunner.ApprunnerFunctions.*
  extension (self: ApprunnerFunctions.type)
    /**
     * Use this data source to get the HostedZoneId of an AWS App Runner service deployed
     *  in a given region for the purpose of using it in an AWS Route53 Alias record.
     */
    def getHostedZoneId(args: Endofunction[com.pulumi.aws.apprunner.inputs.GetHostedZoneIdArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apprunner.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.GetHostedZoneIdArgs.builder
      com.pulumi.aws.apprunner.ApprunnerFunctions.getHostedZoneId(args(argsBuilder).build)

    /**
     * Use this data source to get the HostedZoneId of an AWS App Runner service deployed
     *  in a given region for the purpose of using it in an AWS Route53 Alias record.
     */
    def getHostedZoneIdPlain(args: Endofunction[com.pulumi.aws.apprunner.inputs.GetHostedZoneIdPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apprunner.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.GetHostedZoneIdPlainArgs.builder
      com.pulumi.aws.apprunner.ApprunnerFunctions.getHostedZoneIdPlain(args(argsBuilder).build)

  /** Manages an App Runner Deployment Operation. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.DeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apprunner.DeploymentArgs.builder
    
    com.pulumi.aws.apprunner.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the default App Runner auto scaling configuration.
   *  When creating or updating this resource the existing default auto scaling configuration will be set to non-default automatically.
   *  When creating or updating this resource the configuration is automatically assigned as the default to the new services you create in the future. The new default designation doesn&#39;t affect the associations that were previously set for existing services.
   *  Each account can have only one default auto scaling configuration per Region.
   */
  def DefaultAutoScalingConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersionArgs.builder
    
    com.pulumi.aws.apprunner.DefaultAutoScalingConfigurationVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an App Runner AutoScaling Configuration Version. */
  def AutoScalingConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apprunner.AutoScalingConfigurationVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an App Runner VPC Ingress Connection. */
  def VpcIngressConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apprunner.VpcIngressConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apprunner.VpcIngressConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder)
    /**
     * @param egressConfiguration Network configuration settings for outbound message traffic. See Egress Configuration below for more details.
     * @return builder
     */
    def egressConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationEgressConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationEgressConfigurationArgs.builder
      builder.egressConfiguration(args(argsBuilder).build)

    /**
     * @param ingressConfiguration Network configuration settings for inbound network traffic. See Ingress Configuration below for more details.
     * @return builder
     */
    def ingressConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationIngressConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationIngressConfigurationArgs.builder
      builder.ingressConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder)
    /**
     * @param imageConfiguration Configuration for running the identified image. See Image Configuration below for more details.
     * @return builder
     */
    def imageConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs.builder
      builder.imageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder)
    /**
     * @param codeConfigurationValues Basic configuration for building and running the App Runner service. Use this parameter to quickly launch an App Runner service without providing an apprunner.yaml file in the source code repository (or ignoring the file if it exists). See Code Configuration Values below for more details.
     * @return builder
     */
    def codeConfigurationValues(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs.builder
      builder.codeConfigurationValues(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder)
    /**
     * @param authenticationConfiguration Describes resources needed to authenticate access to some source repositories. See Authentication Configuration below for more details.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param codeRepository Description of a source code repository. See Code Repository below for more details.
     * @return builder
     */
    def codeRepository(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.builder
      builder.codeRepository(args(argsBuilder).build)

    /**
     * @param imageRepository Description of a source image repository. See Image Repository below for more details.
     * @return builder
     */
    def imageRepository(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.builder
      builder.imageRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder)
    /**
     * @param codeConfiguration Configuration for building and running the service from a source code repository. See Code Configuration below for more details.
     * @return builder
     */
    def codeConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.builder
      builder.codeConfiguration(args(argsBuilder).build)

    /**
     * @param sourceCodeVersion Version that should be used within the source code repository. See Source Code Version below for more details.
     * @return builder
     */
    def sourceCodeVersion(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs.builder
      builder.sourceCodeVersion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationState.Builder)
    /**
     * @param traceConfiguration Configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
     * @return builder
     */
    def traceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.builder
      builder.traceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceState.Builder)
    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param healthCheckConfiguration Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
     * @return builder
     */
    def healthCheckConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.builder
      builder.healthCheckConfiguration(args(argsBuilder).build)

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
     * @return builder
     */
    def instanceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param observabilityConfiguration The observability configuration of your service. See Observability Configuration below for more details.
     * @return builder
     */
    def observabilityConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.builder
      builder.observabilityConfiguration(args(argsBuilder).build)

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def sourceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.CustomDomainAssociationState.Builder)
    /**
     * @param certificateValidationRecords A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
     * @return builder
     */
    def certificateValidationRecords(args: Endofunction[com.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordArgs.Builder]*):
        com.pulumi.aws.apprunner.inputs.CustomDomainAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordArgs.builder
      builder.certificateValidationRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apprunner.inputs.VpcIngressConnectionState.Builder)
    /**
     * @param ingressVpcConfiguration Specifications for the customer\u2019s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See Ingress VPC Configuration below for more details.
     * @return builder
     */
    def ingressVpcConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.VpcIngressConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.builder
      builder.ingressVpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.DeploymentState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder)
    /**
     * @param ingressVpcConfiguration Specifications for the customer\u2019s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See Ingress VPC Configuration below for more details.
     * @return builder
     */
    def ingressVpcConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.builder
      builder.ingressVpcConfiguration(args(argsBuilder).build)
