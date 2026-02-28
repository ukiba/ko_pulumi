package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object sagemaker:
  extension (builder: com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder)
    /**
     * @param asyncInferenceConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    def asyncInferenceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.builder
      builder.asyncInferenceConfig(args(argsBuilder).build)

    /**
     * @param dataCaptureConfig Parameters to capture input/output of SageMaker AI models endpoints. Fields are documented below.
     * @return builder
     */
    def dataCaptureConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.builder
      builder.dataCaptureConfig(args(argsBuilder).build)

    /**
     * @param productionVariants List each model that you want to host at this endpoint. See below.
     * @return builder
     */
    def productionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.builder
      builder.productionVariants(args.map(_(argsBuilder).build)*)

    /**
     * @param shadowProductionVariants Models that you want to host at this endpoint in shadow mode with production traffic replicated from the model specified on `oroductionVariants`. If you use this field, you can only specify one variant for `productionVariants` and one variant for `shadowProductionVariants`. See below (same arguments as `productionVariants`).
     * @return builder
     */
    def shadowProductionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.builder
      builder.shadowProductionVariants(args.map(_(argsBuilder).build)*)

  /** Provides a SageMaker AI Code Repository resource. */
  def CodeRepository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.CodeRepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.CodeRepositoryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.CodeRepository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Pipeline resource. */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.PipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.PipelineArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.ModelArgs.Builder)
    /**
     * @param containers Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder]*):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container endpoint are called. See Inference Execution Config.
     * @return builder
     */
    def inferenceExecutionConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.builder
      builder.inferenceExecutionConfig(args(argsBuilder).build)

    /**
     * @param primaryContainer The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * @return builder
     */
    def primaryContainer(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    /**
     * @param vpcConfig Specifies the VPC that you want your model to connect to. This configuration is used in hosting services and in batch transform. See VPC Config.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.DeviceFleetArgs.Builder)
    /**
     * @param outputConfig Specifies details about the repository. see Output Config details below.
     * @return builder
     */
    def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DeviceFleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  /** Provides a SageMaker AI Image resource. */
  def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ImageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ImageArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Image(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.UserProfileArgs.Builder)
    /**
     * @param userSettings The user settings. See User Settings below.
     * @return builder
     */
    def userSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.UserProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.builder
      builder.userSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.WorkforceArgs.Builder)
    /**
     * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidcConfig`. see Cognito Config details below.
     * @return builder
     */
    def cognitoConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.builder
      builder.cognitoConfig(args(argsBuilder).build)

    /**
     * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognitoConfig`. see OIDC Config details below.
     * @return builder
     */
    def oidcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.builder
      builder.oidcConfig(args(argsBuilder).build)

    /**
     * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
     * @return builder
     */
    def sourceIpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.builder
      builder.sourceIpConfig(args(argsBuilder).build)

    /**
     * @param workforceVpcConfig configure a workforce using VPC. see Workforce VPC Config details below.
     * @return builder
     */
    def workforceVpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.builder
      builder.workforceVpcConfig(args(argsBuilder).build)

  /** Provides a SageMaker AI Hub resource. */
  def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.HubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.HubArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Hub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder)
    /**
     * @param codeEditorAppImageConfig The CodeEditorAppImageConfig. See Code Editor App Image Config details below.
     * @return builder
     */
    def codeEditorAppImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.builder
      builder.codeEditorAppImageConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabImageConfig The JupyterLabAppImageConfig. See Jupyter Lab Image Config details below.
     * @return builder
     */
    def jupyterLabImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.builder
      builder.jupyterLabImageConfig(args(argsBuilder).build)

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker AI image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * @return builder
     */
    def kernelGatewayImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.builder
      builder.kernelGatewayImageConfig(args(argsBuilder).build)

  /** Provides a SageMaker AI Flow Definition resource. */
  def FlowDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.FlowDefinitionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.FlowDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.ProjectArgs.Builder)
    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * @return builder
     */
    def serviceCatalogProvisioningDetails(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder]):
        com.pulumi.aws.sagemaker.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.builder
      builder.serviceCatalogProvisioningDetails(args(argsBuilder).build)

  /** Provides a SageMaker AI Workforce resource. */
  def Workforce(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.WorkforceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sagemaker.WorkforceArgs.builder
    
    com.pulumi.aws.sagemaker.Workforce(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI MLFlow Tracking Server resource. */
  def MlflowTrackingServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.MlflowTrackingServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.MlflowTrackingServerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.MlflowTrackingServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Model Package Group Policy resource. */
  def ModelPackageGroupPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelPackageGroupPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sagemaker.ModelPackageGroupPolicyArgs.builder
    
    com.pulumi.aws.sagemaker.ModelPackageGroupPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Studio Lifecycle Config resource. */
  def StudioLifecycleConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.StudioLifecycleConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.StudioLifecycleConfigArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.StudioLifecycleConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.NotebookInstanceArgs.Builder)
    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the notebook instance. Conflicts with `instanceMetadataServiceConfiguration`. see details below.
     * @return builder
     */
    def instanceMetadataServiceConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.NotebookInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.builder
      builder.instanceMetadataServiceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.DomainArgs.Builder)
    /**
     * @param defaultSpaceSettings The default space settings. See `defaultSpaceSettings` Block below.
     * @return builder
     */
    def defaultSpaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.builder
      builder.defaultSpaceSettings(args(argsBuilder).build)

    /**
     * @param defaultUserSettings The default user settings. See `defaultUserSettings` Block below.
     * @return builder
     */
    def defaultUserSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.builder
      builder.defaultUserSettings(args(argsBuilder).build)

    /**
     * @param domainSettings The domain settings. See `domainSettings` Block below.
     * @return builder
     */
    def domainSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.builder
      builder.domainSettings(args(argsBuilder).build)

    /**
     * @param retentionPolicy The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See `retentionPolicy` Block below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.MonitoringScheduleArgs.Builder)
    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
     * @return builder
     */
    def monitoringScheduleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.MonitoringScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.builder
      builder.monitoringScheduleConfig(args(argsBuilder).build)

  /** Provides a SageMaker AI Feature Group resource. */
  def FeatureGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.FeatureGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.FeatureGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Device Fleet resource. */
  def DeviceFleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DeviceFleetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.DeviceFleetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.DeviceFleet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Image Version resource. */
  def ImageVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ImageVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sagemaker.ImageVersionArgs.builder
    
    com.pulumi.aws.sagemaker.ImageVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI User Profile resource. */
  def UserProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.UserProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.UserProfileArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.UserProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.HubArgs.Builder)
    /**
     * @param s3StorageConfig The Amazon S3 storage configuration for the hub. See S3 Storage Config details below.
     * @return builder
     */
    def s3StorageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.HubArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.builder
      builder.s3StorageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder)
    /**
     * @param featureDefinitions A list of Feature names and types. See Feature Definition Below.
     * @return builder
     */
    def featureDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.builder
      builder.featureDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param offlineStoreConfig The Offline Feature Store Configuration. See Offline Store Config Below.
     * @return builder
     */
    def offlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.builder
      builder.offlineStoreConfig(args(argsBuilder).build)

    /**
     * @param onlineStoreConfig The Online Feature Store Configuration. See Online Store Config Below.
     * @return builder
     */
    def onlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.builder
      builder.onlineStoreConfig(args(argsBuilder).build)

    def throughputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.builder
      builder.throughputConfig(args(argsBuilder).build)

  /** Provides a SageMaker AI monitoring schedule resource. */
  def MonitoringSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.MonitoringScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.MonitoringScheduleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.MonitoringSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Workteam resource. */
  def Workteam(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.WorkteamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.WorkteamArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Workteam(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.CodeRepositoryArgs.Builder)
    /**
     * @param gitConfig Specifies details about the repository. see Git Config details below.
     * @return builder
     */
    def gitConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.CodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.builder
      builder.gitConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.SpaceArgs.Builder)
    /**
     * @param ownershipSettings A collection of ownership settings. Required if `spaceSharingSettings` is set. See `ownershipSettings` Block below.
     * @return builder
     */
    def ownershipSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.builder
      builder.ownershipSettings(args(argsBuilder).build)

    /**
     * @param spaceSettings A collection of space settings. See `spaceSettings` Block below.
     * @return builder
     */
    def spaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.builder
      builder.spaceSettings(args(argsBuilder).build)

    /**
     * @param spaceSharingSettings A collection of space sharing settings. Required if `ownershipSettings` is set. See `spaceSharingSettings` Block below.
     * @return builder
     */
    def spaceSharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.builder
      builder.spaceSharingSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.AppArgs.Builder)
    /**
     * @param resourceSpec The instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance.See Resource Spec below.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  /** Provides a SageMaker AI Device resource. */
  def Device(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DeviceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sagemaker.DeviceArgs.builder
    
    com.pulumi.aws.sagemaker.Device(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Endpoint resource. */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.EndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder)
    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. Fields are documented below.
     * @return builder
     */
    def dataQualityAppSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.builder
      builder.dataQualityAppSpecification(args(argsBuilder).build)

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring job. Fields are documented below.
     * @return builder
     */
    def dataQualityBaselineConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.builder
      builder.dataQualityBaselineConfig(args(argsBuilder).build)

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. Fields are documented below.
     * @return builder
     */
    def dataQualityJobInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.builder
      builder.dataQualityJobInput(args(argsBuilder).build)

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. Fields are documented below.
     * @return builder
     */
    def dataQualityJobOutputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.builder
      builder.dataQualityJobOutputConfig(args(argsBuilder).build)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. Fields are documented below.
     * @return builder
     */
    def jobResources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.builder
      builder.jobResources(args(argsBuilder).build)

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job. Fields are documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before stopping. Fields are documented below.
     * @return builder
     */
    def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

  /** Provides a SageMaker AI App Image Config resource. */
  def AppImageConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.AppImageConfigArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.AppImageConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.HumanTaskUIArgs.Builder)
    /**
     * @param uiTemplate The Liquid template for the worker user interface. See UI Template below.
     * @return builder
     */
    def uiTemplate(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.Builder]):
        com.pulumi.aws.sagemaker.HumanTaskUIArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.builder
      builder.uiTemplate(args(argsBuilder).build)

  type SagemakerFunctions = com.pulumi.aws.sagemaker.SagemakerFunctions
  object SagemakerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.sagemaker.SagemakerFunctions.*
  extension (self: SagemakerFunctions.type)
    /**
     * Get information about prebuilt Amazon SageMaker AI  Docker images.
     *  
     *  &gt; **NOTE:** The AWS provider creates a validly constructed `registryPath` but does not verify that the `registryPath` corresponds to an existing image. For example, using a `registryPath` containing an `imageTag` that does not correspond to a Docker image in the ECR repository, will result in an error.
     */
    def getPrebuiltEcrImage(args: Endofunction[com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImageArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sagemaker.outputs.GetPrebuiltEcrImageResult] =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImageArgs.builder
      com.pulumi.aws.sagemaker.SagemakerFunctions.getPrebuiltEcrImage(args(argsBuilder).build)

    /**
     * Get information about prebuilt Amazon SageMaker AI  Docker images.
     *  
     *  &gt; **NOTE:** The AWS provider creates a validly constructed `registryPath` but does not verify that the `registryPath` corresponds to an existing image. For example, using a `registryPath` containing an `imageTag` that does not correspond to a Docker image in the ECR repository, will result in an error.
     */
    def getPrebuiltEcrImagePlain(args: Endofunction[com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImagePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sagemaker.outputs.GetPrebuiltEcrImageResult] =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImagePlainArgs.builder
      com.pulumi.aws.sagemaker.SagemakerFunctions.getPrebuiltEcrImagePlain(args(argsBuilder).build)

  /** Provides a SageMaker AI data quality job definition resource. */
  def DataQualityJobDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.DataQualityJobDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a SageMaker AI Project resource.
   *  
   *   &gt; Note: If you are trying to use SageMaker AI projects with SageMaker AI studio you will need to add a tag with the key `sagemaker:studio-visibility` with value `true`. For more on requirements to use projects and permission needed see [AWS Docs](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-projects-templates-custom.html).
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ProjectArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI App resource. */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.AppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.AppArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.App(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Notebook Instance resource. */
  def NotebookInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.NotebookInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.NotebookInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.NotebookInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.DeviceArgs.Builder)
    /**
     * @param device The device to register with SageMaker AI Edge Manager. See Device details below.
     * @return builder
     */
    def device(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.Builder]):
        com.pulumi.aws.sagemaker.DeviceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.builder
      builder.device(args(argsBuilder).build)

  /** Provides a SageMaker AI endpoint configuration resource. */
  def EndpointConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.EndpointConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.EndpointConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a lifecycle configuration for SageMaker AI Notebook Instances. */
  def NotebookInstanceLifecycleConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.NotebookInstanceLifecycleConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.NotebookInstanceLifecycleConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.NotebookInstanceLifecycleConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI Space resource. */
  def Space(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.SpaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.SpaceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Space(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder)
    /**
     * @param humanLoopActivationConfig An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * @return builder
     */
    def humanLoopActivationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.builder
      builder.humanLoopActivationConfig(args(argsBuilder).build)

    /**
     * @param humanLoopConfig An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * @return builder
     */
    def humanLoopConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.builder
      builder.humanLoopConfig(args(argsBuilder).build)

    /**
     * @param humanLoopRequestSource Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * @return builder
     */
    def humanLoopRequestSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.builder
      builder.humanLoopRequestSource(args(argsBuilder).build)

    /**
     * @param outputConfig An object containing information about where the human review results will be uploaded. See Output Config details below.
     * @return builder
     */
    def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  /** Provides a SageMaker AI Model Package Group resource. */
  def ModelPackageGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelPackageGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ModelPackageGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.ModelPackageGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SageMaker AI model resource. */
  def Model(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ModelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Model(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.EndpointArgs.Builder)
    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * @return builder
     */
    def deploymentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.builder
      builder.deploymentConfig(args(argsBuilder).build)

  /** Manages status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker AI projects. */
  def ServicecatalogPortfolioStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ServicecatalogPortfolioStatusArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sagemaker.ServicecatalogPortfolioStatusArgs.builder
    
    com.pulumi.aws.sagemaker.ServicecatalogPortfolioStatus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.PipelineArgs.Builder)
    /**
     * @param parallelismConfiguration This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
     * @return builder
     */
    def parallelismConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.builder
      builder.parallelismConfiguration(args(argsBuilder).build)

    /**
     * @param pipelineDefinitionS3Location The location of the pipeline definition stored in Amazon S3. If specified, SageMaker AI will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
     * @return builder
     */
    def pipelineDefinitionS3Location(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.Builder]):
        com.pulumi.aws.sagemaker.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.builder
      builder.pipelineDefinitionS3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

    /**
     * @param emrSettings The configuration parameters that specify the IAM roles assumed by the execution role of SageMaker AI (assumable roles) and the cluster instances or job execution environments (execution roles or runtime roles) to manage and access resources required for running Amazon EMR clusters or Amazon EMR Serverless applications. see `emrSettings` Block below.
     * @return builder
     */
    def emrSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsEmrSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsEmrSettingsArgs.builder
      builder.emrSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainState.Builder)
    /**
     * @param defaultSpaceSettings The default space settings. See `defaultSpaceSettings` Block below.
     * @return builder
     */
    def defaultSpaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.builder
      builder.defaultSpaceSettings(args(argsBuilder).build)

    /**
     * @param defaultUserSettings The default user settings. See `defaultUserSettings` Block below.
     * @return builder
     */
    def defaultUserSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.builder
      builder.defaultUserSettings(args(argsBuilder).build)

    /**
     * @param domainSettings The domain settings. See `domainSettings` Block below.
     * @return builder
     */
    def domainSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.builder
      builder.domainSettings(args(argsBuilder).build)

    /**
     * @param retentionPolicy The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See `retentionPolicy` Block below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder)
    /**
     * @param coreDumpConfig Core dump configuration from the model container when the process crashes. Fields are documented below.
     * @return builder
     */
    def coreDumpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantCoreDumpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantCoreDumpConfigArgs.builder
      builder.coreDumpConfig(args(argsBuilder).build)

    /**
     * @param managedInstanceScaling Control the range in the number of instances that the endpoint provisions as it scales up or down to accommodate traffic.
     * @return builder
     */
    def managedInstanceScaling(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantManagedInstanceScalingArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantManagedInstanceScalingArgs.builder
      builder.managedInstanceScaling(args(argsBuilder).build)

    /**
     * @param routingConfigs How the endpoint routes incoming traffic. See routingConfig below.
     * @return builder
     */
    def routingConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantRoutingConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantRoutingConfigArgs.builder
      builder.routingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serverlessConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    def serverlessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantServerlessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantServerlessConfigArgs.builder
      builder.serverlessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.Builder)
    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param defaultEbsStorageSettings The default EBS storage settings for a private space. See `defaultEbsStorageSettings` Block below.
     * @return builder
     */
    def defaultEbsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.builder
      builder.defaultEbsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder)
    /**
     * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant&#39;s total instance count. See Maximum Batch Size.
     * @return builder
     */
    def maximumBatchSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyMaximumBatchSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyMaximumBatchSizeArgs.builder
      builder.maximumBatchSize(args(argsBuilder).build)

    /**
     * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is absent, the default value will be set to 100% of total capacity which means to bring up the whole capacity of the old fleet at once during rollback. See Rollback Maximum Batch Size.
     * @return builder
     */
    def rollbackMaximumBatchSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyRollbackMaximumBatchSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyRollbackMaximumBatchSizeArgs.builder
      builder.rollbackMaximumBatchSize(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder)
    /**
     * @param asyncInferenceConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    def asyncInferenceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.builder
      builder.asyncInferenceConfig(args(argsBuilder).build)

    /**
     * @param dataCaptureConfig Parameters to capture input/output of SageMaker AI models endpoints. Fields are documented below.
     * @return builder
     */
    def dataCaptureConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.builder
      builder.dataCaptureConfig(args(argsBuilder).build)

    /**
     * @param productionVariants List each model that you want to host at this endpoint. See below.
     * @return builder
     */
    def productionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.builder
      builder.productionVariants(args.map(_(argsBuilder).build)*)

    /**
     * @param shadowProductionVariants Models that you want to host at this endpoint in shadow mode with production traffic replicated from the model specified on `oroductionVariants`. If you use this field, you can only specify one variant for `productionVariants` and one variant for `shadowProductionVariants`. See below (same arguments as `productionVariants`).
     * @return builder
     */
    def shadowProductionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.builder
      builder.shadowProductionVariants(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.Builder)
    /**
     * @param repositoryAuthConfig Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified Vpc as the value for the RepositoryAccessMode field, and the private Docker registry where the model image is hosted requires authentication. see Repository Auth Config.
     * @return builder
     */
    def repositoryAuthConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigRepositoryAuthConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigRepositoryAuthConfigArgs.builder
      builder.repositoryAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder)
    /**
     * @param canarySize Batch size for the first step to turn on traffic on the new endpoint fleet. Value must be less than or equal to 50% of the variant&#39;s total instance count. See Canary Size.
     * @return builder
     */
    def canarySize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs.builder
      builder.canarySize(args(argsBuilder).build)

    /**
     * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint fleet. Value must be 10-50% of the variant&#39;s total instance count. See Linear Step Size.
     * @return builder
     */
    def linearStepSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs.builder
      builder.linearStepSize(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder)
    /**
     * @param csv The CSV dataset used in the monitoring job. Fields are documented below.
     * @return builder
     */
    def csv(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatCsvArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatCsvArgs.builder
      builder.csv(args(argsBuilder).build)

    /**
     * @param json The JSON dataset used in the monitoring job. Fields are documented below.
     * @return builder
     */
    def json(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatJsonArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatJsonArgs.builder
      builder.json(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder)
    /**
     * @param scheduleConfig Configures the monitoring schedule. Fields are documented below.
     * @return builder
     */
    def scheduleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigScheduleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder)
    /**
     * @param constraintsResource The constraints resource for a monitoring job. Fields are documented below.
     * @return builder
     */
    def constraintsResource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigConstraintsResourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigConstraintsResourceArgs.builder
      builder.constraintsResource(args(argsBuilder).build)

    /**
     * @param statisticsResource The statistics resource for a monitoring job. Fields are documented below.
     * @return builder
     */
    def statisticsResource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResourceArgs.builder
      builder.statisticsResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder)
    /**
     * @param humanLoopActivationConfig An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * @return builder
     */
    def humanLoopActivationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.builder
      builder.humanLoopActivationConfig(args(argsBuilder).build)

    /**
     * @param humanLoopConfig An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * @return builder
     */
    def humanLoopConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.builder
      builder.humanLoopConfig(args(argsBuilder).build)

    /**
     * @param humanLoopRequestSource Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * @return builder
     */
    def humanLoopRequestSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.builder
      builder.humanLoopRequestSource(args(argsBuilder).build)

    /**
     * @param outputConfig An object containing information about where the human review results will be uploaded. See Output Config details below.
     * @return builder
     */
    def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder)
    /**
     * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * @return builder
     */
    def dataCatalogConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigArgs.builder
      builder.dataCatalogConfig(args(argsBuilder).build)

    /**
     * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * @return builder
     */
    def s3StorageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigArgs.builder
      builder.s3StorageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle of JupyterLab applications in a space. See `appLifecycleManagement` Block below.
     * @return builder
     */
    def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterLab application. See `codeRepository` Block below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a JupyterLab app. see `customImage` Block below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

    /**
     * @param emrSettings The configuration parameters that specify the IAM roles assumed by the execution role of SageMaker AI (assumable roles) and the cluster instances or job execution environments (execution roles or runtime roles) to manage and access resources required for running Amazon EMR clusters or Amazon EMR Serverless applications. see `emrSettings` Block below.
     * @return builder
     */
    def emrSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsEmrSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsEmrSettingsArgs.builder
      builder.emrSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder)
    /**
     * @param canvasAppSettings The Canvas app settings. See Canvas App Settings below.
     * @return builder
     */
    def canvasAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.builder
      builder.canvasAppSettings(args(argsBuilder).build)

    /**
     * @param codeEditorAppSettings The Code Editor application settings. See Code Editor App Settings below.
     * @return builder
     */
    def codeEditorAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.builder
      builder.codeEditorAppSettings(args(argsBuilder).build)

    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user profile. Permitted users can access this file system in Amazon SageMaker AI Studio. See Custom File System Config below.
     * @return builder
     */
    def customFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.builder
      builder.customFileSystemConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system operations. See Custom Posix User Config below.
     * @return builder
     */
    def customPosixUserConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomPosixUserConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomPosixUserConfigArgs.builder
      builder.customPosixUserConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See Jupyter Lab App Settings below.
     * @return builder
     */
    def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See Jupyter Server App Settings below.
     * @return builder
     */
    def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See Kernel Gateway App Settings below.
     * @return builder
     */
    def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param rSessionAppSettings The RSession app settings. See RSession App Settings below.
     * @return builder
     */
    def rSessionAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.builder
      builder.rSessionAppSettings(args(argsBuilder).build)

    /**
     * @param rStudioServerProAppSettings A collection of settings that configure user interaction with the RStudioServerPro app. See RStudioServerProAppSettings below.
     * @return builder
     */
    def rStudioServerProAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRStudioServerProAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRStudioServerProAppSettingsArgs.builder
      builder.rStudioServerProAppSettings(args(argsBuilder).build)

    /**
     * @param sharingSettings The sharing settings. See Sharing Settings below.
     * @return builder
     */
    def sharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSharingSettingsArgs.builder
      builder.sharingSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings for a private space. See Space Storage Settings below.
     * @return builder
     */
    def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

    /**
     * @param studioWebPortalSettings The Studio Web Portal settings. See `studioWebPortalSettings` Block below.
     * @return builder
     */
    def studioWebPortalSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsStudioWebPortalSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsStudioWebPortalSettingsArgs.builder
      builder.studioWebPortalSettings(args(argsBuilder).build)

    /**
     * @param tensorBoardAppSettings The TensorBoard app settings. See TensorBoard App Settings below.
     * @return builder
     */
    def tensorBoardAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.builder
      builder.tensorBoardAppSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder)
    /**
     * @param containerConfig The configuration used to run the application image container. See Container Config details below.
     * @return builder
     */
    def containerConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigContainerConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigContainerConfigArgs.builder
      builder.containerConfig(args(argsBuilder).build)

    /**
     * @param fileSystemConfig The URL where the Git repository is located. See File System Config details below.
     * @return builder
     */
    def fileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.Builder)
    /**
     * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment. See Traffic Routing Configuration.
     * @return builder
     */
    def trafficRoutingConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.builder
      builder.trafficRoutingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder)
    /**
     * @param monitoringOutputs Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded. Fields are documented below.
     * @return builder
     */
    def monitoringOutputs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.builder
      builder.monitoringOutputs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see Custom Image below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.Builder)
    /**
     * @param amountInUsd Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars. See Amount In Usd details below.
     * @return builder
     */
    def amountInUsd(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs.builder
      builder.amountInUsd(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelState.Builder)
    /**
     * @param containers Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container endpoint are called. See Inference Execution Config.
     * @return builder
     */
    def inferenceExecutionConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.builder
      builder.inferenceExecutionConfig(args(argsBuilder).build)

    /**
     * @param primaryContainer The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * @return builder
     */
    def primaryContainer(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    /**
     * @param vpcConfig Specifies the VPC that you want your model to connect to. This configuration is used in hosting services and in batch transform. See VPC Config.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.Builder)
    /**
     * @param alarms List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker AI rolls back the deployment. See Alarms.
     * @return builder
     */
    def alarms(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs.builder
      builder.alarms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.Builder)
    /**
     * @param datasetFormat The dataset format for your batch transform job. Fields are documented below.
     * @return builder
     */
    def datasetFormat(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.builder
      builder.datasetFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a RSession app. see `customImage` Block below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block above.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder)
    /**
     * @param clientConfig Configures the behavior of the client used by SageMaker AI to interact with the model container during asynchronous inference.
     * @return builder
     */
    def clientConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigClientConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigClientConfigArgs.builder
      builder.clientConfig(args(argsBuilder).build)

    /**
     * @param outputConfig Configuration for asynchronous inference invocation outputs.
     * @return builder
     */
    def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.Builder)
    /**
     * @param s3DataSources The S3 location of model data to deploy.
     * @return builder
     */
    def s3DataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.builder
      builder.s3DataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder)
    /**
     * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. Fields are documented below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder)
    /**
     * @param directDeploySettings The model deployment settings for the SageMaker AI Canvas application. See Direct Deploy Settings below.
     * @return builder
     */
    def directDeploySettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.builder
      builder.directDeploySettings(args(argsBuilder).build)

    /**
     * @param emrServerlessSettings The settings for running Amazon EMR Serverless jobs in SageMaker AI Canvas. See `emrServerlessSettings` Block below.
     * @return builder
     */
    def emrServerlessSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.builder
      builder.emrServerlessSettings(args(argsBuilder).build)

    def generativeAiSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.builder
      builder.generativeAiSettings(args(argsBuilder).build)

    /**
     * @param identityProviderOauthSettings The settings for connecting to an external data source with OAuth. See Identity Provider OAuth Settings below.
     * @return builder
     */
    def identityProviderOauthSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.builder
      builder.identityProviderOauthSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param kendraSettings The settings for document querying. See Kendra Settings below.
     * @return builder
     */
    def kendraSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsKendraSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsKendraSettingsArgs.builder
      builder.kendraSettings(args(argsBuilder).build)

    /**
     * @param modelRegisterSettings The model registry settings for the SageMaker AI Canvas application. See Model Register Settings below.
     * @return builder
     */
    def modelRegisterSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.builder
      builder.modelRegisterSettings(args(argsBuilder).build)

    /**
     * @param timeSeriesForecastingSettings Time series forecast settings for the Canvas app. See Time Series Forecasting Settings below.
     * @return builder
     */
    def timeSeriesForecastingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.builder
      builder.timeSeriesForecastingSettings(args(argsBuilder).build)

    /**
     * @param workspaceSettings The workspace settings for the SageMaker AI Canvas application. See Workspace Settings below.
     * @return builder
     */
    def workspaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.builder
      builder.workspaceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.Builder)
    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder)
    /**
     * @param directDeploySettings The model deployment settings for the SageMaker AI Canvas application. See `directDeploySettings` Block below.
     * @return builder
     */
    def directDeploySettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.builder
      builder.directDeploySettings(args(argsBuilder).build)

    /**
     * @param emrServerlessSettings The settings for running Amazon EMR Serverless jobs in SageMaker AI Canvas. See `emrServerlessSettings` Block below.
     * @return builder
     */
    def emrServerlessSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.builder
      builder.emrServerlessSettings(args(argsBuilder).build)

    def generativeAiSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.builder
      builder.generativeAiSettings(args(argsBuilder).build)

    /**
     * @param identityProviderOauthSettings The settings for connecting to an external data source with OAuth. See `identityProviderOauthSettings` Block below.
     * @return builder
     */
    def identityProviderOauthSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.builder
      builder.identityProviderOauthSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param kendraSettings The settings for document querying. See `kendraSettings` Block below.
     * @return builder
     */
    def kendraSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsKendraSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsKendraSettingsArgs.builder
      builder.kendraSettings(args(argsBuilder).build)

    /**
     * @param modelRegisterSettings The model registry settings for the SageMaker AI Canvas application. See `modelRegisterSettings` Block below.
     * @return builder
     */
    def modelRegisterSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.builder
      builder.modelRegisterSettings(args(argsBuilder).build)

    /**
     * @param timeSeriesForecastingSettings Time series forecast settings for the Canvas app. See `timeSeriesForecastingSettings` Block below.
     * @return builder
     */
    def timeSeriesForecastingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.builder
      builder.timeSeriesForecastingSettings(args(argsBuilder).build)

    /**
     * @param workspaceSettings The workspace settings for the SageMaker AI Canvas application. See `workspaceSettings` Block below.
     * @return builder
     */
    def workspaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.builder
      builder.workspaceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder)
    /**
     * @param publicWorkforceTaskPrice Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed. See Public Workforce Task Price details below.
     * @return builder
     */
    def publicWorkforceTaskPrice(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.builder
      builder.publicWorkforceTaskPrice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a CodeEditor app. see Custom Image below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointState.Builder)
    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * @return builder
     */
    def deploymentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.builder
      builder.deploymentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DeviceState.Builder)
    /**
     * @param device The device to register with SageMaker AI Edge Manager. See Device details below.
     * @return builder
     */
    def device(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DeviceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.builder
      builder.device(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.CodeRepositoryState.Builder)
    /**
     * @param gitConfig Specifies details about the repository. see Git Config details below.
     * @return builder
     */
    def gitConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.CodeRepositoryState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.builder
      builder.gitConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleState.Builder)
    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
     * @return builder
     */
    def monitoringScheduleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.builder
      builder.monitoringScheduleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DeviceFleetState.Builder)
    /**
     * @param outputConfig Specifies details about the repository. see Output Config details below.
     * @return builder
     */
    def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DeviceFleetState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.Builder)
    /**
     * @param s3DataSources The S3 location of model data to deploy.
     * @return builder
     */
    def s3DataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.builder
      builder.s3DataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder)
    /**
     * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidcConfig`. see Cognito Config details below.
     * @return builder
     */
    def cognitoConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.builder
      builder.cognitoConfig(args(argsBuilder).build)

    /**
     * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognitoConfig`. see OIDC Config details below.
     * @return builder
     */
    def oidcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.builder
      builder.oidcConfig(args(argsBuilder).build)

    /**
     * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
     * @return builder
     */
    def sourceIpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.builder
      builder.sourceIpConfig(args(argsBuilder).build)

    /**
     * @param workforceVpcConfig configure a workforce using VPC. see Workforce VPC Config details below.
     * @return builder
     */
    def workforceVpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.builder
      builder.workforceVpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ProjectState.Builder)
    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * @return builder
     */
    def serviceCatalogProvisioningDetails(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.builder
      builder.serviceCatalogProvisioningDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a CodeEditor app. see `customImage` Block below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle of JupyterLab applications in a space. See `appLifecycleManagement` Block below.
     * @return builder
     */
    def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.Builder)
    /**
     * @param modelAccessConfig Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license agreement (EULA) within the [`modelAccessConfig` configuration block]. see Model Access Config.
     * @return builder
     */
    def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.Builder)
    /**
     * @param repositoryAuthConfig Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified Vpc as the value for the RepositoryAccessMode field, and the private Docker registry where the model image is hosted requires authentication. see Repository Auth Config.
     * @return builder
     */
    def repositoryAuthConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigRepositoryAuthConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigRepositoryAuthConfigArgs.builder
      builder.repositoryAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. See `idleSettings` Block below.
     * @return builder
     */
    def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a JupyterLab app. see `customImage` Block below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

    /**
     * @param emrSettings The configuration parameters that specify the IAM roles assumed by the execution role of SageMaker AI (assumable roles) and the cluster instances or job execution environments (execution roles or runtime roles) to manage and access resources required for running Amazon EMR clusters or Amazon EMR Serverless applications. see `emrSettings` Block below.
     * @return builder
     */
    def emrSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsEmrSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsEmrSettingsArgs.builder
      builder.emrSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder)
    def collectionConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.builder
      builder.collectionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.Builder)
    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block above.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see Custom Image below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.Builder)
    /**
     * @param s3Output The Amazon S3 storage location where the results of a monitoring job are saved. Fields are documented below.
     * @return builder
     */
    def s3Output(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs.builder
      builder.s3Output(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.Builder)
    /**
     * @param efsFileSystemConfig The default EBS storage settings for a private space. See `efsFileSystemConfig` Block below.
     * @return builder
     */
    def efsFileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.builder
      builder.efsFileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileState.Builder)
    /**
     * @param userSettings The user settings. See User Settings below.
     * @return builder
     */
    def userSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.builder
      builder.userSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param defaultEbsStorageSettings The default EBS storage settings for a private space. See `defaultEbsStorageSettings` Block below.
     * @return builder
     */
    def defaultEbsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.builder
      builder.defaultEbsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder)
    /**
     * @param canvasAppSettings The Canvas app settings. See `canvasAppSettings` Block below.
     * @return builder
     */
    def canvasAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.builder
      builder.canvasAppSettings(args(argsBuilder).build)

    /**
     * @param codeEditorAppSettings The Code Editor application settings. See `codeEditorAppSettings` Block below.
     * @return builder
     */
    def codeEditorAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.builder
      builder.codeEditorAppSettings(args(argsBuilder).build)

    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user profile. Permitted users can access this file system in Amazon SageMaker AI Studio. See `customFileSystemConfig` Block below.
     * @return builder
     */
    def customFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.builder
      builder.customFileSystemConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system operations. See `customPosixUserConfig` Block below.
     * @return builder
     */
    def customPosixUserConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomPosixUserConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomPosixUserConfigArgs.builder
      builder.customPosixUserConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See `jupyterLabAppSettings` Block below.
     * @return builder
     */
    def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See `jupyterServerAppSettings` Block below.
     * @return builder
     */
    def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See `kernelGatewayAppSettings` Block below.
     * @return builder
     */
    def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param rSessionAppSettings The RSession app settings. See `rSessionAppSettings` Block below.
     * @return builder
     */
    def rSessionAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.builder
      builder.rSessionAppSettings(args(argsBuilder).build)

    /**
     * @param rStudioServerProAppSettings A collection of settings that configure user interaction with the RStudioServerPro app. See `rStudioServerProAppSettings` Block below.
     * @return builder
     */
    def rStudioServerProAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRStudioServerProAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRStudioServerProAppSettingsArgs.builder
      builder.rStudioServerProAppSettings(args(argsBuilder).build)

    /**
     * @param sharingSettings The sharing settings. See `sharingSettings` Block below.
     * @return builder
     */
    def sharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSharingSettingsArgs.builder
      builder.sharingSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings for a private space. See `spaceStorageSettings` Block below.
     * @return builder
     */
    def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

    /**
     * @param studioWebPortalSettings The Studio Web Portal settings. See `studioWebPortalSettings` Block below.
     * @return builder
     */
    def studioWebPortalSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsStudioWebPortalSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsStudioWebPortalSettingsArgs.builder
      builder.studioWebPortalSettings(args(argsBuilder).build)

    /**
     * @param tensorBoardAppSettings The TensorBoard app settings. See `tensorBoardAppSettings` Block below.
     * @return builder
     */
    def tensorBoardAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.builder
      builder.tensorBoardAppSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder)
    /**
     * @param featureDefinitions A list of Feature names and types. See Feature Definition Below.
     * @return builder
     */
    def featureDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.builder
      builder.featureDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param offlineStoreConfig The Offline Feature Store Configuration. See Offline Store Config Below.
     * @return builder
     */
    def offlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.builder
      builder.offlineStoreConfig(args(argsBuilder).build)

    /**
     * @param onlineStoreConfig The Online Feature Store Configuration. See Online Store Config Below.
     * @return builder
     */
    def onlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.builder
      builder.onlineStoreConfig(args(argsBuilder).build)

    def throughputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.builder
      builder.throughputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder)
    /**
     * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint deployment failures and recovery. See Auto Rollback Configuration.
     * @return builder
     */
    def autoRollbackConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.builder
      builder.autoRollbackConfiguration(args(argsBuilder).build)

    /**
     * @param blueGreenUpdatePolicy Update policy for a blue/green deployment. If this update policy is specified, SageMaker AI creates a new fleet during the deployment while maintaining the old fleet. SageMaker AI flips traffic to the new fleet according to the specified traffic routing configuration. Only one update policy should be used in the deployment configuration. If no update policy is specified, SageMaker AI uses a blue/green deployment strategy with all at once traffic shifting by default. See Blue Green Update Config.
     * @return builder
     */
    def blueGreenUpdatePolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.builder
      builder.blueGreenUpdatePolicy(args(argsBuilder).build)

    /**
     * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker AI endpoint. See Rolling Update Policy.
     * @return builder
     */
    def rollingUpdatePolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.builder
      builder.rollingUpdatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder)
    /**
     * @param memberDefinitions A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     * @return builder
     */
    def memberDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.builder
      builder.memberDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfiguration Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     * @return builder
     */
    def notificationConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.builder
      builder.notificationConfiguration(args(argsBuilder).build)

    /**
     * @param workerAccessConfiguration Use this optional parameter to constrain access to an Amazon S3 resource based on the IP address using supported IAM global condition keys. The Amazon S3 resource is accessed in the worker portal using a Amazon S3 presigned URL. see Worker Access Configuration details below.
     * @return builder
     */
    def workerAccessConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.builder
      builder.workerAccessConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder)
    /**
     * @param fileSystemConfig The URL where the Git repository is located. See File System Config details below.
     * @return builder
     */
    def fileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

    /**
     * @param kernelSpecs The default branch for the Git repository. See Kernel Spec details below.
     * @return builder
     */
    def kernelSpecs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecArgs.builder
      builder.kernelSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param ebsStorageSettings A collection of EBS storage settings for a space. See `ebsStorageSettings` Block below.
     * @return builder
     */
    def ebsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsEbsStorageSettingsArgs.builder
      builder.ebsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.Builder)
    /**
     * @param notificationConfig Configuration for notifications of inference results for asynchronous inference.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param defaultEbsStorageSettings The default EBS storage settings for a private space. See Default EBS Storage Settings below.
     * @return builder
     */
    def defaultEbsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.builder
      builder.defaultEbsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HubState.Builder)
    /**
     * @param s3StorageConfig The Amazon S3 storage configuration for the hub. See S3 Storage Config details below.
     * @return builder
     */
    def s3StorageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.builder
      builder.s3StorageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.PipelineState.Builder)
    /**
     * @param parallelismConfiguration This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
     * @return builder
     */
    def parallelismConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.builder
      builder.parallelismConfiguration(args(argsBuilder).build)

    /**
     * @param pipelineDefinitionS3Location The location of the pipeline definition stored in Amazon S3. If specified, SageMaker AI will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
     * @return builder
     */
    def pipelineDefinitionS3Location(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.builder
      builder.pipelineDefinitionS3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder)
    /**
     * @param coreDumpConfig Core dump configuration from the model container when the process crashes. Fields are documented below.
     * @return builder
     */
    def coreDumpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantCoreDumpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantCoreDumpConfigArgs.builder
      builder.coreDumpConfig(args(argsBuilder).build)

    /**
     * @param managedInstanceScaling Control the range in the number of instances that the endpoint provisions as it scales up or down to accommodate traffic.
     * @return builder
     */
    def managedInstanceScaling(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantManagedInstanceScalingArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantManagedInstanceScalingArgs.builder
      builder.managedInstanceScaling(args(argsBuilder).build)

    /**
     * @param routingConfigs How the endpoint routes incoming traffic. See routingConfig below.
     * @return builder
     */
    def routingConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantRoutingConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantRoutingConfigArgs.builder
      builder.routingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serverlessConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    def serverlessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantServerlessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantServerlessConfigArgs.builder
      builder.serverlessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. See `idleSettings` Block below.
     * @return builder
     */
    def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. See `customImage` Block below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder)
    /**
     * @param captureContentTypeHeader Content type headers to capture. See `captureContentTypeHeader` below.
     * @return builder
     */
    def captureContentTypeHeader(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs.builder
      builder.captureContentTypeHeader(args(argsBuilder).build)

    /**
     * @param captureOptions What data to capture. Fields are documented below.
     * @return builder
     */
    def captureOptions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureOptionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureOptionArgs.builder
      builder.captureOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder)
    /**
     * @param provisioningParameters A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * @return builder
     */
    def provisioningParameters(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs.builder
      builder.provisioningParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.Builder)
    /**
     * @param efsFileSystem A custom file system in Amazon EFS. See `efsFileSystem` Block below.
     * @return builder
     */
    def efsFileSystem(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemEfsFileSystemArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemEfsFileSystemArgs.builder
      builder.efsFileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.Builder)
    /**
     * @param iamPolicyConstraints Use this parameter to specify the allowed request source. Possible sources are either SourceIp or VpcSourceIp. see IAM Policy Constraints details below.
     * @return builder
     */
    def iamPolicyConstraints(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignIamPolicyConstraintsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignIamPolicyConstraintsArgs.builder
      builder.iamPolicyConstraints(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.Builder)
    /**
     * @param efsFileSystemConfigs The default EBS storage settings for a private space. See EFS File System Config below.
     * @return builder
     */
    def efsFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.builder
      builder.efsFileSystemConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.NotebookInstanceState.Builder)
    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the notebook instance. Conflicts with `instanceMetadataServiceConfiguration`. see details below.
     * @return builder
     */
    def instanceMetadataServiceConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.NotebookInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.builder
      builder.instanceMetadataServiceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder)
    /**
     * @param humanLoopActivationConditionsConfig defines under what conditions SageMaker AI creates a human loop. See Human Loop Activation Conditions Config details below.
     * @return builder
     */
    def humanLoopActivationConditionsConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs.builder
      builder.humanLoopActivationConditionsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder)
    /**
     * @param imageConfig Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * @return builder
     */
    def imageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param modelDataSource The location of model data to deploy. Use this for uncompressed model deployment. For information about how to deploy an uncompressed model, see [Deploying uncompressed models](https://docs.aws.amazon.com/sagemaker/latest/dg/large-model-inference-uncompressed.html) in the _AWS SageMaker AI Developer Guide_.
     * @return builder
     */
    def modelDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.builder
      builder.modelDataSource(args(argsBuilder).build)

    /**
     * @param multiModelConfig Specifies additional configuration for multi-model endpoints. see Multi Model Config.
     * @return builder
     */
    def multiModelConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerMultiModelConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerMultiModelConfigArgs.builder
      builder.multiModelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. See `codeRepository` Block below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.Builder)
    /**
     * @param modelAccessConfig Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license agreement (EULA) within the [`modelAccessConfig` configuration block]. see Model Access Config.
     * @return builder
     */
    def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder)
    /**
     * @param batchTransformInput Input object for the batch transform job. Fields are documented below.
     * @return builder
     */
    def batchTransformInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.builder
      builder.batchTransformInput(args(argsBuilder).build)

    /**
     * @param endpointInput Input object for the endpoint. Fields are documented below.
     * @return builder
     */
    def endpointInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputEndpointInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputEndpointInputArgs.builder
      builder.endpointInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder)
    /**
     * @param containerConfig The configuration used to run the application image container. See Container Config details below.
     * @return builder
     */
    def containerConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigContainerConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigContainerConfigArgs.builder
      builder.containerConfig(args(argsBuilder).build)

    /**
     * @param fileSystemConfig The URL where the Git repository is located. See File System Config details below.
     * @return builder
     */
    def fileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder)
    /**
     * @param codeEditorAppSettings The Code Editor application settings. See `codeEditorAppSettings` Block below.
     * @return builder
     */
    def codeEditorAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.builder
      builder.codeEditorAppSettings(args(argsBuilder).build)

    /**
     * @param customFileSystems A file system, created by you, that you assign to a space for an Amazon SageMaker AI Domain. See `customFileSystem` Block below.
     * @return builder
     */
    def customFileSystems(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.builder
      builder.customFileSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See `jupyterLabAppSettings` Block below.
     * @return builder
     */
    def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See `jupyterServerAppSettings` Block below.
     * @return builder
     */
    def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See `kernelGatewayAppSettings` Block below.
     * @return builder
     */
    def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings. See `spaceStorageSettings` Block below.
     * @return builder
     */
    def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder)
    /**
     * @param imageConfig Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * @return builder
     */
    def imageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param modelDataSource The location of model data to deploy. Use this for uncompressed model deployment. For information about how to deploy an uncompressed model, see [Deploying uncompressed models](https://docs.aws.amazon.com/sagemaker/latest/dg/large-model-inference-uncompressed.html) in the _AWS SageMaker AI Developer Guide_.
     * @return builder
     */
    def modelDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.builder
      builder.modelDataSource(args(argsBuilder).build)

    /**
     * @param multiModelConfig Specifies additional configuration for multi-model endpoints. see Multi Model Config.
     * @return builder
     */
    def multiModelConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerMultiModelConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerMultiModelConfigArgs.builder
      builder.multiModelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder)
    /**
     * @param securityConfig Security config for at-rest encryption of your OnlineStore. See Security Config Below.
     * @return builder
     */
    def securityConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigSecurityConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param ttlDuration Time to live duration, where the record is hard deleted after the expiration time is reached; ExpiresAt = EventTime + TtlDuration.. See TTl Duration Below.
     * @return builder
     */
    def ttlDuration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigTtlDurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigTtlDurationArgs.builder
      builder.ttlDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder)
    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. Fields are documented below.
     * @return builder
     */
    def dataQualityAppSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.builder
      builder.dataQualityAppSpecification(args(argsBuilder).build)

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring job. Fields are documented below.
     * @return builder
     */
    def dataQualityBaselineConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.builder
      builder.dataQualityBaselineConfig(args(argsBuilder).build)

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. Fields are documented below.
     * @return builder
     */
    def dataQualityJobInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.builder
      builder.dataQualityJobInput(args(argsBuilder).build)

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. Fields are documented below.
     * @return builder
     */
    def dataQualityJobOutputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.builder
      builder.dataQualityJobOutputConfig(args(argsBuilder).build)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. Fields are documented below.
     * @return builder
     */
    def jobResources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.builder
      builder.jobResources(args(argsBuilder).build)

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job. Fields are documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before stopping. Fields are documented below.
     * @return builder
     */
    def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see `customImage` Block below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder)
    /**
     * @param clusterConfig The configuration for the cluster resources used to run the processing job. Fields are documented below.
     * @return builder
     */
    def clusterConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesClusterConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.Builder)
    def vectorConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigVectorConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigVectorConfigArgs.builder
      builder.vectorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see `customImage` Block below.
     * @return builder
     */
    def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HumanTaskUIState.Builder)
    /**
     * @param uiTemplate The Liquid template for the worker user interface. See UI Template below.
     * @return builder
     */
    def uiTemplate(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HumanTaskUIState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.builder
      builder.uiTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder)
    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user profile. Permitted users can access this file system in Amazon SageMaker AI Studio. See `customFileSystemConfig` Block below.
     * @return builder
     */
    def customFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.builder
      builder.customFileSystemConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system operations. See `customPosixUserConfig` Block below.
     * @return builder
     */
    def customPosixUserConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomPosixUserConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomPosixUserConfigArgs.builder
      builder.customPosixUserConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See `jupyterLabAppSettings` Block below.
     * @return builder
     */
    def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See `jupyterServerAppSettings` Block below.
     * @return builder
     */
    def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See `kernelGatewayAppSettings` Block below.
     * @return builder
     */
    def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings for a private space. See `spaceStorageSettings` Block below.
     * @return builder
     */
    def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder)
    /**
     * @param s3Presign Defines any Amazon S3 resource constraints. see S3 Presign details below.
     * @return builder
     */
    def s3Presign(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.builder
      builder.s3Presign(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder)
    /**
     * @param dockerSettings A collection of settings that configure the domain\u2019s Docker interaction. see `dockerSettings` Block below.
     * @return builder
     */
    def dockerSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsDockerSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsDockerSettingsArgs.builder
      builder.dockerSettings(args(argsBuilder).build)

    /**
     * @param rStudioServerProDomainSettings A collection of settings that configure the RStudioServerPro Domain-level app. see `rStudioServerProDomainSettings` Block below.
     * @return builder
     */
    def rStudioServerProDomainSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.builder
      builder.rStudioServerProDomainSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder)
    /**
     * @param codeEditorAppImageConfig The CodeEditorAppImageConfig. See Code Editor App Image Config details below.
     * @return builder
     */
    def codeEditorAppImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.builder
      builder.codeEditorAppImageConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabImageConfig The JupyterLabAppImageConfig. See Jupyter Lab Image Config details below.
     * @return builder
     */
    def jupyterLabImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.builder
      builder.jupyterLabImageConfig(args(argsBuilder).build)

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker AI image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * @return builder
     */
    def kernelGatewayImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.builder
      builder.kernelGatewayImageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppState.Builder)
    /**
     * @param resourceSpec The instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance.See Resource Spec below.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.Builder)
    /**
     * @param efsFileSystemConfig The default EBS storage settings for a private space. See `efsFileSystemConfig` Block below.
     * @return builder
     */
    def efsFileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.builder
      builder.efsFileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder)
    /**
     * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team. See Cognito Member Definition details below.
     * @return builder
     */
    def cognitoMemberDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionCognitoMemberDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionCognitoMemberDefinitionArgs.builder
      builder.cognitoMemberDefinition(args(argsBuilder).build)

    /**
     * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a single private work team. See Cognito Member Definition details below.
     * @return builder
     */
    def oidcMemberDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionOidcMemberDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionOidcMemberDefinitionArgs.builder
      builder.oidcMemberDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceState.Builder)
    /**
     * @param ownershipSettings A collection of ownership settings. Required if `spaceSharingSettings` is set. See `ownershipSettings` Block below.
     * @return builder
     */
    def ownershipSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.builder
      builder.ownershipSettings(args(argsBuilder).build)

    /**
     * @param spaceSettings A collection of space settings. See `spaceSettings` Block below.
     * @return builder
     */
    def spaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.builder
      builder.spaceSettings(args(argsBuilder).build)

    /**
     * @param spaceSharingSettings A collection of space sharing settings. Required if `ownershipSettings` is set. See `spaceSharingSettings` Block below.
     * @return builder
     */
    def spaceSharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.builder
      builder.spaceSharingSettings(args(argsBuilder).build)

  /** Provides a SageMaker AI Human Task UI resource. */
  def HumanTaskUI(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.HumanTaskUIArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.HumanTaskUIArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.HumanTaskUI(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sagemaker.WorkteamArgs.Builder)
    /**
     * @param memberDefinitions A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     * @return builder
     */
    def memberDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.WorkteamArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.builder
      builder.memberDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfiguration Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     * @return builder
     */
    def notificationConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkteamArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.builder
      builder.notificationConfiguration(args(argsBuilder).build)

    /**
     * @param workerAccessConfiguration Use this optional parameter to constrain access to an Amazon S3 resource based on the IP address using supported IAM global condition keys. The Amazon S3 resource is accessed in the worker portal using a Amazon S3 presigned URL. see Worker Access Configuration details below.
     * @return builder
     */
    def workerAccessConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkteamArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.builder
      builder.workerAccessConfiguration(args(argsBuilder).build)

  /** Provides a SageMaker AI Domain resource. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.DomainArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sagemaker.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
