package jp.ukiba.ko_pulumi
package aws

object apprunner_ext:
  extension (builder: com.pulumi.aws.apprunner.DeploymentArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.apprunner.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder)
    /**
     * @param traceConfiguration Configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See `traceConfiguration` Block below for more details.
     * @return builder
     */
    inline def traceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ObservabilityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.builder
      builder.traceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.ServiceArgs.Builder)
    /**
     * @param encryptionConfiguration Custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See `encryptionConfiguration` below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param healthCheckConfiguration Settings of the health check that AWS App Runner performs to monitor the health of your service. See `healthCheckConfiguration` below.
     * @return builder
     */
    inline def healthCheckConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.builder
      builder.healthCheckConfiguration(args(argsBuilder).build)

    /**
     * @param instanceConfiguration Runtime configuration of instances (scaling units) of the App Runner service. See `instanceConfiguration` below.
     * @return builder
     */
    inline def instanceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web application that the App Runner service runs. See `networkConfiguration` below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param observabilityConfiguration Observability configuration of your service. See `observabilityConfiguration` below.
     * @return builder
     */
    inline def observabilityConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.builder
      builder.observabilityConfiguration(args(argsBuilder).build)

    /**
     * @param sourceConfiguration Source to deploy to the App Runner service. Can be a code or an image repository. See `sourceConfiguration` below.
     * @return builder
     */
    inline def sourceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder)
    /**
     * @param ingressVpcConfiguration Specifications for the customer\u2019s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See `ingressVpcConfiguration` Block below for more details.
     * @return builder
     */
    inline def ingressVpcConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.VpcIngressConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.builder
      builder.ingressVpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.CustomDomainAssociationState.Builder)
    /**
     * @param certificateValidationRecords Set of certificate CNAME records used for this domain name. See `certificateValidationRecords` Block below for more details.
     * @return builder
     */
    inline def certificateValidationRecords(args: Endofunction[com.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordArgs.Builder]*):
        com.pulumi.aws.apprunner.inputs.CustomDomainAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordArgs.builder
      builder.certificateValidationRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apprunner.inputs.DeploymentState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationState.Builder)
    /**
     * @param traceConfiguration Configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See `traceConfiguration` Block below for more details.
     * @return builder
     */
    inline def traceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs.builder
      builder.traceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder)
    /**
     * @param egressConfiguration Network configuration settings for outbound message traffic. See `egressConfiguration` below.
     * @return builder
     */
    inline def egressConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationEgressConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationEgressConfigurationArgs.builder
      builder.egressConfiguration(args(argsBuilder).build)

    /**
     * @param ingressConfiguration Network configuration settings for inbound network traffic. See `ingressConfiguration` below.
     * @return builder
     */
    inline def ingressConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationIngressConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationIngressConfigurationArgs.builder
      builder.ingressConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder)
    /**
     * @param authenticationConfiguration Configuration for resources needed to authenticate access to some source repositories. See `authenticationConfiguration` below.
     * @return builder
     */
    inline def authenticationConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param codeRepository Description of a source code repository. See `codeRepository` below.
     * @return builder
     */
    inline def codeRepository(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.builder
      builder.codeRepository(args(argsBuilder).build)

    /**
     * @param imageRepository Description of a source image repository. See `imageRepository` below.
     * @return builder
     */
    inline def imageRepository(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.builder
      builder.imageRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder)
    /**
     * @param codeConfiguration Configuration for building and running the service from a source code repository. See `codeConfiguration` below.
     * @return builder
     */
    inline def codeConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.builder
      builder.codeConfiguration(args(argsBuilder).build)

    /**
     * @param sourceCodeVersion Version that should be used within the source code repository. See `sourceCodeVersion` below.
     * @return builder
     */
    inline def sourceCodeVersion(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs.builder
      builder.sourceCodeVersion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder)
    /**
     * @param codeConfigurationValues Basic configuration for building and running the App Runner service. Use this parameter to quickly launch an App Runner service without providing an apprunner.yaml file in the source code repository (or ignoring the file if it exists). See `codeConfigurationValues` below.
     * @return builder
     */
    inline def codeConfigurationValues(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs.builder
      builder.codeConfigurationValues(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder)
    /**
     * @param imageConfiguration Configuration for running the identified image. See `imageConfiguration` below.
     * @return builder
     */
    inline def imageConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs.builder
      builder.imageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.ServiceState.Builder)
    /**
     * @param encryptionConfiguration Custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See `encryptionConfiguration` below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param healthCheckConfiguration Settings of the health check that AWS App Runner performs to monitor the health of your service. See `healthCheckConfiguration` below.
     * @return builder
     */
    inline def healthCheckConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationArgs.builder
      builder.healthCheckConfiguration(args(argsBuilder).build)

    /**
     * @param instanceConfiguration Runtime configuration of instances (scaling units) of the App Runner service. See `instanceConfiguration` below.
     * @return builder
     */
    inline def instanceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web application that the App Runner service runs. See `networkConfiguration` below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param observabilityConfiguration Observability configuration of your service. See `observabilityConfiguration` below.
     * @return builder
     */
    inline def observabilityConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceObservabilityConfigurationArgs.builder
      builder.observabilityConfiguration(args(argsBuilder).build)

    /**
     * @param sourceConfiguration Source to deploy to the App Runner service. Can be a code or an image repository. See `sourceConfiguration` below.
     * @return builder
     */
    inline def sourceConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apprunner.inputs.VpcIngressConnectionState.Builder)
    /**
     * @param ingressVpcConfiguration Specifications for the customer\u2019s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See `ingressVpcConfiguration` Block below for more details.
     * @return builder
     */
    inline def ingressVpcConfiguration(args: Endofunction[com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.Builder]):
        com.pulumi.aws.apprunner.inputs.VpcIngressConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs.builder
      builder.ingressVpcConfiguration(args(argsBuilder).build)
