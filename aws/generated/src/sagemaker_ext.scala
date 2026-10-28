package jp.ukiba.ko_pulumi
package aws

object sagemaker_ext:
  extension (builder: com.pulumi.aws.sagemaker.AlgorithmArgs.Builder)
    /**
     * @param inferenceSpecification Configuration for inference jobs that use this algorithm. See Inference Specification.
     * @return builder
     */
    inline def inferenceSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.AlgorithmArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationArgs.builder
      builder.inferenceSpecification(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.AlgorithmArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param trainingSpecification Configuration for training jobs that use this algorithm. See Training Specification.
     * @return builder
     */
    inline def trainingSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.AlgorithmArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.builder
      builder.trainingSpecification(args(argsBuilder).build)

    /**
     * @param validationSpecification Configuration used to validate the algorithm. See Validation Specification.
     * @return builder
     */
    inline def validationSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.AlgorithmArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationArgs.builder
      builder.validationSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.AppArgs.Builder)
    /**
     * @param resourceSpec Instance type and the ARN of the SageMaker AI image created on the instance. See Resource Spec below.
     * @return builder
     */
    inline def resourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder)
    /**
     * @param codeEditorAppImageConfig The CodeEditorAppImageConfig. See Code Editor App Image Config details below.
     * @return builder
     */
    inline def codeEditorAppImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.builder
      builder.codeEditorAppImageConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabImageConfig The JupyterLabAppImageConfig. See Jupyter Lab Image Config details below.
     * @return builder
     */
    inline def jupyterLabImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.builder
      builder.jupyterLabImageConfig(args(argsBuilder).build)

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker AI image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * @return builder
     */
    inline def kernelGatewayImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.builder
      builder.kernelGatewayImageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.CodeRepositoryArgs.Builder)
    /**
     * @param gitConfig Specifies details about the repository. see Git Config details below.
     * @return builder
     */
    inline def gitConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.CodeRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.builder
      builder.gitConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder)
    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def dataQualityAppSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.builder
      builder.dataQualityAppSpecification(args(argsBuilder).build)

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def dataQualityBaselineConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.builder
      builder.dataQualityBaselineConfig(args(argsBuilder).build)

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def dataQualityJobInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.builder
      builder.dataQualityJobInput(args(argsBuilder).build)

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. Fields are documented below.
     * @return builder
     */
    inline def dataQualityJobOutputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.builder
      builder.dataQualityJobOutputConfig(args(argsBuilder).build)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. Fields are documented below.
     * @return builder
     */
    inline def jobResources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.builder
      builder.jobResources(args(argsBuilder).build)

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before stopping. Fields are documented below.
     * @return builder
     */
    inline def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.DeviceArgs.Builder)
    /**
     * @param device The device to register with SageMaker AI Edge Manager. See Device details below.
     * @return builder
     */
    inline def device(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.Builder]):
        com.pulumi.aws.sagemaker.DeviceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.builder
      builder.device(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.DeviceFleetArgs.Builder)
    /**
     * @param outputConfig Specifies details about the repository. see Output Config details below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.DeviceFleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.DomainArgs.Builder)
    /**
     * @param defaultSpaceSettings The default space settings. See `defaultSpaceSettings` Block below.
     * @return builder
     */
    inline def defaultSpaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.builder
      builder.defaultSpaceSettings(args(argsBuilder).build)

    /**
     * @param defaultUserSettings The default user settings. See `defaultUserSettings` Block below.
     * @return builder
     */
    inline def defaultUserSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.builder
      builder.defaultUserSettings(args(argsBuilder).build)

    /**
     * @param domainSettings The domain settings. See `domainSettings` Block below.
     * @return builder
     */
    inline def domainSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.builder
      builder.domainSettings(args(argsBuilder).build)

    /**
     * @param retentionPolicy The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See `retentionPolicy` Block below.
     * @return builder
     */
    inline def retentionPolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.EndpointArgs.Builder)
    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * @return builder
     */
    inline def deploymentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.builder
      builder.deploymentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder)
    /**
     * @param asyncInferenceConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    inline def asyncInferenceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.builder
      builder.asyncInferenceConfig(args(argsBuilder).build)

    /**
     * @param dataCaptureConfig Parameters to capture input/output of SageMaker AI models endpoints. Fields are documented below.
     * @return builder
     */
    inline def dataCaptureConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.builder
      builder.dataCaptureConfig(args(argsBuilder).build)

    /**
     * @param productionVariants List each model that you want to host at this endpoint. See below.
     * @return builder
     */
    inline def productionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.builder
      builder.productionVariants(args.map(_(argsBuilder).build)*)

    /**
     * @param shadowProductionVariants Models that you want to host at this endpoint in shadow mode with production traffic replicated from the model specified on `productionVariants`. If you use this field, you can only specify one variant for `productionVariants` and one variant for `shadowProductionVariants`. See below (same arguments as `productionVariants`).
     * @return builder
     */
    inline def shadowProductionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.builder
      builder.shadowProductionVariants(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder)
    /**
     * @param featureDefinitions A list of Feature names and types. See Feature Definition Below.
     * @return builder
     */
    inline def featureDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.builder
      builder.featureDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param offlineStoreConfig The Offline Feature Store Configuration. See Offline Store Config Below.
     * @return builder
     */
    inline def offlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.builder
      builder.offlineStoreConfig(args(argsBuilder).build)

    /**
     * @param onlineStoreConfig The Online Feature Store Configuration. See Online Store Config Below.
     * @return builder
     */
    inline def onlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.builder
      builder.onlineStoreConfig(args(argsBuilder).build)

    inline def throughputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.builder
      builder.throughputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder)
    /**
     * @param humanLoopActivationConfig An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * @return builder
     */
    inline def humanLoopActivationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.builder
      builder.humanLoopActivationConfig(args(argsBuilder).build)

    /**
     * @param humanLoopConfig An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * @return builder
     */
    inline def humanLoopConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.builder
      builder.humanLoopConfig(args(argsBuilder).build)

    /**
     * @param humanLoopRequestSource Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * @return builder
     */
    inline def humanLoopRequestSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.builder
      builder.humanLoopRequestSource(args(argsBuilder).build)

    /**
     * @param outputConfig An object containing information about where the human review results will be uploaded. See Output Config details below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.HubArgs.Builder)
    /**
     * @param s3StorageConfig The Amazon S3 storage configuration for the hub. See S3 Storage Config details below.
     * @return builder
     */
    inline def s3StorageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.HubArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.builder
      builder.s3StorageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.HubContentReferenceArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HubContentReferenceTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.HubContentReferenceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HubContentReferenceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.HumanTaskUIArgs.Builder)
    /**
     * @param uiTemplate The Liquid template for the worker user interface. See UI Template below.
     * @return builder
     */
    inline def uiTemplate(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.Builder]):
        com.pulumi.aws.sagemaker.HumanTaskUIArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.builder
      builder.uiTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder)
    /**
     * @param autotune Autotune settings. See `autotune`.
     * @return builder
     */
    inline def autotune(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobAutotuneArgs.Builder]):
        com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobAutotuneArgs.builder
      builder.autotune(args(argsBuilder).build)

    /**
     * @param config Tuning job settings. See `config`.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.builder
      builder.config(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param trainingJobDefinition Single training job definition for tuning. See `trainingJobDefinition`.
     * @return builder
     */
    inline def trainingJobDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.builder
      builder.trainingJobDefinition(args(argsBuilder).build)

    /**
     * @param trainingJobDefinitions Multiple training job definitions for tuning. See `trainingJobDefinition`.
     * @return builder
     */
    inline def trainingJobDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.builder
      builder.trainingJobDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param warmStartConfig Warm start settings. See `warmStartConfig`.
     * @return builder
     */
    inline def warmStartConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigArgs.builder
      builder.warmStartConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.InferenceComponentArgs.Builder)
    /**
     * @param deploymentConfig Deployment configuration for the inference component, which controls the rollout strategy and rollback behavior. This directive applies only when the inference component is **updated** \u2014 the `CreateInferenceComponent` API does not accept it, so it has no effect on initial creation. It is not returned by the API and is therefore not refreshed into state or verified on import. See `deploymentConfig` Block.
     * @return builder
     */
    inline def deploymentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.InferenceComponentArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigArgs.builder
      builder.deploymentConfig(args(argsBuilder).build)

    /**
     * @param runtimeConfig Runtime settings for a model that is deployed with an inference component. See `runtimeConfig` Block.
     * @return builder
     */
    inline def runtimeConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.InferenceComponentArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

    /**
     * @param specification Details about the resources to deploy with this inference component. Exactly one of `specification` or `specifications` must be configured. See `specification` and `specifications` Block.
     * @return builder
     */
    inline def specification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.InferenceComponentArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.builder
      builder.specification(args(argsBuilder).build)

    /**
     * @param specifications List of specification objects for the inference component, one per instance type. At least two blocks are required; configure `specification` instead to deploy to a single instance type. Exactly one of `specification` or `specifications` must be configured. See `specification` and `specifications` Block.
     * @return builder
     */
    inline def specifications(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder]*):
        com.pulumi.aws.sagemaker.InferenceComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.builder
      builder.specifications(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.InferenceComponentArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.LabelingJobArgs.Builder)
    /**
     * @param humanTaskConfig Configuration information required for human workers to complete a labeling task. Fields are documented below.
     * @return builder
     */
    inline def humanTaskConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.LabelingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.builder
      builder.humanTaskConfig(args(argsBuilder).build)

    /**
     * @param inputConfig Input data for the labeling job. Fields are documented below.
     * @return builder
     */
    inline def inputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.LabelingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigArgs.builder
      builder.inputConfig(args(argsBuilder).build)

    /**
     * @param labelingJobAlgorithmsConfig Information required to perform automated data labeling.. Fields are documented below.
     * @return builder
     */
    inline def labelingJobAlgorithmsConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.LabelingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigArgs.builder
      builder.labelingJobAlgorithmsConfig(args(argsBuilder).build)

    /**
     * @param outputConfig Location of the output data. Fields are documented below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.LabelingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

    /**
     * @param stoppingConditions Conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped. Fields are documented below.
     * @return builder
     */
    inline def stoppingConditions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobStoppingConditionArgs.Builder]*):
        com.pulumi.aws.sagemaker.LabelingJobArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobStoppingConditionArgs.builder
      builder.stoppingConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.MlflowAppArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MlflowAppTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.MlflowAppArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MlflowAppTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.ModelArgs.Builder)
    /**
     * @param containers Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
     * @return builder
     */
    inline def containers(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder]*):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container endpoint are called. See Inference Execution Config.
     * @return builder
     */
    inline def inferenceExecutionConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.builder
      builder.inferenceExecutionConfig(args(argsBuilder).build)

    /**
     * @param primaryContainer Primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * @return builder
     */
    inline def primaryContainer(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    /**
     * @param vpcConfig Specifies the VPC that you want your model to connect to. This configuration is used in hosting services and in batch transform. See VPC Config.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.ModelCardArgs.Builder)
    /**
     * @param securityConfig KMS key to encrypt, decrypt, and re-encrypt model card content. Fields are documented below.
     * @return builder
     */
    inline def securityConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardSecurityConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelCardArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelCardArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.ModelCardExportJobArgs.Builder)
    /**
     * @param outputConfig Export output details. Fields are documented below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardExportJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelCardExportJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardExportJobOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardExportJobTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.ModelCardExportJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardExportJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.MonitoringScheduleArgs.Builder)
    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def monitoringScheduleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.MonitoringScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.builder
      builder.monitoringScheduleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.NotebookInstanceArgs.Builder)
    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the notebook instance. Conflicts with `instanceMetadataServiceConfiguration`. see details below.
     * @return builder
     */
    inline def instanceMetadataServiceConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.NotebookInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.builder
      builder.instanceMetadataServiceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.PipelineArgs.Builder)
    /**
     * @param parallelismConfiguration This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
     * @return builder
     */
    inline def parallelismConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.builder
      builder.parallelismConfiguration(args(argsBuilder).build)

    /**
     * @param pipelineDefinitionS3Location The location of the pipeline definition stored in Amazon S3. If specified, SageMaker AI will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
     * @return builder
     */
    inline def pipelineDefinitionS3Location(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.Builder]):
        com.pulumi.aws.sagemaker.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.builder
      builder.pipelineDefinitionS3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.ProjectArgs.Builder)
    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * @return builder
     */
    inline def serviceCatalogProvisioningDetails(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder]):
        com.pulumi.aws.sagemaker.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.builder
      builder.serviceCatalogProvisioningDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.SpaceArgs.Builder)
    /**
     * @param ownershipSettings A collection of ownership settings. Required if `spaceSharingSettings` is set. See `ownershipSettings` Block below.
     * @return builder
     */
    inline def ownershipSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.builder
      builder.ownershipSettings(args(argsBuilder).build)

    /**
     * @param spaceSettings A collection of space settings. See `spaceSettings` Block below.
     * @return builder
     */
    inline def spaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.builder
      builder.spaceSettings(args(argsBuilder).build)

    /**
     * @param spaceSharingSettings A collection of space sharing settings. Required if `ownershipSettings` is set. See `spaceSharingSettings` Block below.
     * @return builder
     */
    inline def spaceSharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.builder
      builder.spaceSharingSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.TrainingJobArgs.Builder)
    /**
     * @param algorithmSpecification Algorithm-related parameters of the training job. See `algorithmSpecification` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def algorithmSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationArgs.builder
      builder.algorithmSpecification(args(argsBuilder).build)

    /**
     * @param checkpointConfig Location of checkpoints during training. See `checkpointConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def checkpointConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobCheckpointConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobCheckpointConfigArgs.builder
      builder.checkpointConfig(args(argsBuilder).build)

    /**
     * @param debugHookConfig Configuration for debugging rules. See `debugHookConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def debugHookConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigArgs.builder
      builder.debugHookConfig(args(argsBuilder).build)

    /**
     * @param debugRuleConfigurations List of debug rule configurations. Maximum of 20. See `debugRuleConfigurations` below.
     * @return builder
     */
    inline def debugRuleConfigurations(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobDebugRuleConfigurationArgs.Builder]*):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobDebugRuleConfigurationArgs.builder
      builder.debugRuleConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param experimentConfig Associates a SageMaker AI Experiment or Trial to the training job. See `experimentConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def experimentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobExperimentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobExperimentConfigArgs.builder
      builder.experimentConfig(args(argsBuilder).build)

    /**
     * @param infraCheckConfig Infrastructure health check configuration. See `infraCheckConfig` below.
     * @return builder
     */
    inline def infraCheckConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInfraCheckConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInfraCheckConfigArgs.builder
      builder.infraCheckConfig(args(argsBuilder).build)

    /**
     * @param inputDataConfigs List of input data channel configurations for the training job. Maximum of 20. See `inputDataConfig` below.
     * @return builder
     */
    inline def inputDataConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigArgs.builder
      builder.inputDataConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param mlflowConfig MLflow integration configuration. See `mlflowConfig` below.
     * @return builder
     */
    inline def mlflowConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobMlflowConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobMlflowConfigArgs.builder
      builder.mlflowConfig(args(argsBuilder).build)

    /**
     * @param modelPackageConfig Model package configuration. Requires `serverlessJobConfig`. See `modelPackageConfig` below.
     * @return builder
     */
    inline def modelPackageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobModelPackageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobModelPackageConfigArgs.builder
      builder.modelPackageConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Location of the output data from the training job. See `outputDataConfig` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def outputDataConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobOutputDataConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    /**
     * @param profilerConfig Configuration for the profiler. See `profilerConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def profilerConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerConfigArgs.builder
      builder.profilerConfig(args(argsBuilder).build)

    /**
     * @param profilerRuleConfigurations List of profiler rule configurations. Maximum of 20. See `profilerRuleConfigurations` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def profilerRuleConfigurations(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerRuleConfigurationArgs.Builder]*):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerRuleConfigurationArgs.builder
      builder.profilerRuleConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteDebugConfig Configuration for remote debugging. See `remoteDebugConfig` below.
     * @return builder
     */
    inline def remoteDebugConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobRemoteDebugConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobRemoteDebugConfigArgs.builder
      builder.remoteDebugConfig(args(argsBuilder).build)

    /**
     * @param resourceConfig Resources for the training job, including compute instances and storage volumes. See `resourceConfig` below.
     * @return builder
     */
    inline def resourceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigArgs.builder
      builder.resourceConfig(args(argsBuilder).build)

    /**
     * @param retryStrategy Number of times to retry the job if it fails. See `retryStrategy` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def retryStrategy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobRetryStrategyArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobRetryStrategyArgs.builder
      builder.retryStrategy(args(argsBuilder).build)

    /**
     * @param serverlessJobConfig Configuration for serverless training jobs using foundation models. Conflicts with `algorithmSpecification`, `enableManagedSpotTraining`, `environment`, `retryStrategy`, `checkpointConfig`, `debugHookConfig`, `experimentConfig`, `profilerConfig`, `profilerRuleConfigurations`, and `tensorBoardOutputConfig`. See `serverlessJobConfig` below.
     * @return builder
     */
    inline def serverlessJobConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobServerlessJobConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobServerlessJobConfigArgs.builder
      builder.serverlessJobConfig(args(argsBuilder).build)

    /**
     * @param sessionChainingConfig Configuration for session tag chaining. See `sessionChainingConfig` below.
     * @return builder
     */
    inline def sessionChainingConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobSessionChainingConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobSessionChainingConfigArgs.builder
      builder.sessionChainingConfig(args(argsBuilder).build)

    inline def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

    /**
     * @param tensorBoardOutputConfig Configuration for TensorBoard output. See `tensorBoardOutputConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def tensorBoardOutputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobTensorBoardOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobTensorBoardOutputConfigArgs.builder
      builder.tensorBoardOutputConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig VPC configuration for the training job. See `vpcConfig` below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.TrainingJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.UserProfileArgs.Builder)
    /**
     * @param userSettings The user settings. See User Settings below.
     * @return builder
     */
    inline def userSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.UserProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.builder
      builder.userSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.WorkforceArgs.Builder)
    /**
     * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidcConfig`. see Cognito Config details below.
     * @return builder
     */
    inline def cognitoConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.builder
      builder.cognitoConfig(args(argsBuilder).build)

    /**
     * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognitoConfig`. see OIDC Config details below.
     * @return builder
     */
    inline def oidcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.builder
      builder.oidcConfig(args(argsBuilder).build)

    /**
     * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source IP Config details below.
     * @return builder
     */
    inline def sourceIpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.builder
      builder.sourceIpConfig(args(argsBuilder).build)

    /**
     * @param workforceVpcConfig configure a workforce using VPC. see Workforce VPC Config details below.
     * @return builder
     */
    inline def workforceVpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.builder
      builder.workforceVpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.WorkteamArgs.Builder)
    /**
     * @param memberDefinitions A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     * @return builder
     */
    inline def memberDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.WorkteamArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.builder
      builder.memberDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfiguration Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     * @return builder
     */
    inline def notificationConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkteamArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.builder
      builder.notificationConfiguration(args(argsBuilder).build)

    /**
     * @param workerAccessConfiguration Use this optional parameter to constrain access to an Amazon S3 resource based on the IP address using supported IAM global condition keys. The Amazon S3 resource is accessed in the worker portal using a Amazon S3 presigned URL. see Worker Access Configuration details below.
     * @return builder
     */
    inline def workerAccessConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.WorkteamArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.builder
      builder.workerAccessConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationArgs.Builder)
    /**
     * @param containers List of container definitions for inference.
     * @return builder
     */
    inline def containers(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerArgs.Builder)
    /**
     * @param additionalS3DataSource Additional model data to make available to the container. See Additional S3 Data Source.
     * @return builder
     */
    inline def additionalS3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerAdditionalS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerAdditionalS3DataSourceArgs.builder
      builder.additionalS3DataSource(args(argsBuilder).build)

    /**
     * @param baseModel Base model information for the container. See Base Model.
     * @return builder
     */
    inline def baseModel(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerBaseModelArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerBaseModelArgs.builder
      builder.baseModel(args(argsBuilder).build)

    /**
     * @param modelDataSource Source of model data for the container. See Model Data Source.
     * @return builder
     */
    inline def modelDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceArgs.builder
      builder.modelDataSource(args(argsBuilder).build)

    /**
     * @param modelInput Additional model input configuration. See Model Input.
     * @return builder
     */
    inline def modelInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelInputArgs.builder
      builder.modelInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceArgs.Builder)
    /**
     * @param s3DataSource S3-backed model data source. See Model Data Source S3 Data Source.
     * @return builder
     */
    inline def s3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceArgs.builder
      builder.s3DataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceArgs.Builder)
    inline def hubAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceHubAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceHubAccessConfigArgs.builder
      builder.hubAccessConfig(args(argsBuilder).build)

    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationContainerModelDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmState.Builder)
    /**
     * @param inferenceSpecification Configuration for inference jobs that use this algorithm. See Inference Specification.
     * @return builder
     */
    inline def inferenceSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmInferenceSpecificationArgs.builder
      builder.inferenceSpecification(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param trainingSpecification Configuration for training jobs that use this algorithm. See Training Specification.
     * @return builder
     */
    inline def trainingSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.builder
      builder.trainingSpecification(args(argsBuilder).build)

    /**
     * @param validationSpecification Configuration used to validate the algorithm. See Validation Specification.
     * @return builder
     */
    inline def validationSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationArgs.builder
      builder.validationSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder)
    /**
     * @param additionalS3DataSource Additional training data to make available to the algorithm. See Additional S3 Data Source.
     * @return builder
     */
    inline def additionalS3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationAdditionalS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationAdditionalS3DataSourceArgs.builder
      builder.additionalS3DataSource(args(argsBuilder).build)

    /**
     * @param metricDefinitions List of metric definitions used to parse training logs. See Metric Definitions.
     * @return builder
     */
    inline def metricDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationMetricDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationMetricDefinitionArgs.builder
      builder.metricDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param supportedHyperParameters Hyperparameter definitions supported by the algorithm. See Supported Hyper Parameters.
     * @return builder
     */
    inline def supportedHyperParameters(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterArgs.builder
      builder.supportedHyperParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param supportedTuningJobObjectiveMetrics Objective metrics supported for hyperparameter tuning jobs. See Supported Tuning Job Objective Metrics.
     * @return builder
     */
    inline def supportedTuningJobObjectiveMetrics(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedTuningJobObjectiveMetricArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedTuningJobObjectiveMetricArgs.builder
      builder.supportedTuningJobObjectiveMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @param trainingChannels List of channel definitions supported for training. See Training Channels.
     * @return builder
     */
    inline def trainingChannels(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationTrainingChannelArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationTrainingChannelArgs.builder
      builder.trainingChannels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterArgs.Builder)
    /**
     * @param range Allowed value range for the hyperparameter. See Parameter Range.
     * @return builder
     */
    inline def range(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeArgs.builder
      builder.range(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeArgs.Builder)
    /**
     * @param categoricalParameterRangeSpecification Categorical range definition. See Categorical Parameter Range Specification.
     * @return builder
     */
    inline def categoricalParameterRangeSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeCategoricalParameterRangeSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeCategoricalParameterRangeSpecificationArgs.builder
      builder.categoricalParameterRangeSpecification(args(argsBuilder).build)

    /**
     * @param continuousParameterRangeSpecification Continuous range definition. See Continuous Parameter Range Specification.
     * @return builder
     */
    inline def continuousParameterRangeSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeContinuousParameterRangeSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeContinuousParameterRangeSpecificationArgs.builder
      builder.continuousParameterRangeSpecification(args(argsBuilder).build)

    /**
     * @param integerParameterRangeSpecification Integer range definition. See Integer Parameter Range Specification.
     * @return builder
     */
    inline def integerParameterRangeSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeIntegerParameterRangeSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmTrainingSpecificationSupportedHyperParameterRangeIntegerParameterRangeSpecificationArgs.builder
      builder.integerParameterRangeSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationArgs.Builder)
    /**
     * @param validationProfiles Validation profiles for the algorithm. See Validation Profiles.
     * @return builder
     */
    inline def validationProfiles(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesArgs.builder
      builder.validationProfiles(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesArgs.Builder)
    /**
     * @param trainingJobDefinition Training job definition used during validation. See Training Job Definition.
     * @return builder
     */
    inline def trainingJobDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionArgs.builder
      builder.trainingJobDefinition(args(argsBuilder).build)

    /**
     * @param transformJobDefinition Transform job definition used during validation. See Transform Job Definition.
     * @return builder
     */
    inline def transformJobDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionArgs.builder
      builder.transformJobDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionArgs.Builder)
    /**
     * @param inputDataConfigs Input channel configuration for the validation training job. See Input Data Config.
     * @return builder
     */
    inline def inputDataConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigArgs.builder
      builder.inputDataConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param outputDataConfig Output configuration for the validation training job. See Output Data Config.
     * @return builder
     */
    inline def outputDataConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionOutputDataConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    /**
     * @param resourceConfig Resource configuration for the validation training job. See Resource Config.
     * @return builder
     */
    inline def resourceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigArgs.builder
      builder.resourceConfig(args(argsBuilder).build)

    /**
     * @param stoppingCondition Stopping condition for the validation training job. See Stopping Condition.
     * @return builder
     */
    inline def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigArgs.Builder)
    /**
     * @param dataSource Source of the input data. See Data Source.
     * @return builder
     */
    inline def dataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceArgs.builder
      builder.dataSource(args(argsBuilder).build)

    /**
     * @param shuffleConfig Shuffle configuration for the channel. See Shuffle Config.
     * @return builder
     */
    inline def shuffleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigShuffleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigShuffleConfigArgs.builder
      builder.shuffleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder)
    /**
     * @param fileSystemDataSource File system-backed data source. See File System Data Source.
     * @return builder
     */
    inline def fileSystemDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceFileSystemDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceFileSystemDataSourceArgs.builder
      builder.fileSystemDataSource(args(argsBuilder).build)

    /**
     * @param s3DataSource S3-backed training data source. See Training S3 Data Source.
     * @return builder
     */
    inline def s3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.builder
      builder.s3DataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder)
    inline def hubAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceHubAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceHubAccessConfigArgs.builder
      builder.hubAccessConfig(args(argsBuilder).build)

    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigArgs.Builder)
    /**
     * @param instanceGroups Instance group definitions for the training job. See Instance Groups.
     * @return builder
     */
    inline def instanceGroups(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstanceGroupArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstanceGroupArgs.builder
      builder.instanceGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param instancePlacementConfig Placement configuration for the training job. See Instance Placement Config.
     * @return builder
     */
    inline def instancePlacementConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.builder
      builder.instancePlacementConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.Builder)
    /**
     * @param placementSpecifications Placement specifications for ultra servers. See Placement Specifications.
     * @return builder
     */
    inline def placementSpecifications(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstancePlacementConfigPlacementSpecificationArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTrainingJobDefinitionResourceConfigInstancePlacementConfigPlacementSpecificationArgs.builder
      builder.placementSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionArgs.Builder)
    /**
     * @param transformInput Input configuration for the transform job. See Transform Input.
     * @return builder
     */
    inline def transformInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputArgs.builder
      builder.transformInput(args(argsBuilder).build)

    /**
     * @param transformOutput Output configuration for the transform job. See Transform Output.
     * @return builder
     */
    inline def transformOutput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformOutputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformOutputArgs.builder
      builder.transformOutput(args(argsBuilder).build)

    /**
     * @param transformResources Compute resources for the transform job. See Transform Resources.
     * @return builder
     */
    inline def transformResources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformResourcesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformResourcesArgs.builder
      builder.transformResources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputArgs.Builder)
    /**
     * @param dataSource Data source for the transform job. See Transform Job Data Source.
     * @return builder
     */
    inline def dataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputDataSourceArgs.builder
      builder.dataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputDataSourceArgs.Builder)
    /**
     * @param s3DataSource S3-backed training data source. See Training S3 Data Source.
     * @return builder
     */
    inline def s3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputDataSourceS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AlgorithmValidationSpecificationValidationProfilesTransformJobDefinitionTransformInputDataSourceS3DataSourceArgs.builder
      builder.s3DataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder)
    /**
     * @param containerConfig The configuration used to run the application image container. See Container Config details below.
     * @return builder
     */
    inline def containerConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigContainerConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigContainerConfigArgs.builder
      builder.containerConfig(args(argsBuilder).build)

    /**
     * @param fileSystemConfig The URL where the Git repository is located. See File System Config details below.
     * @return builder
     */
    inline def fileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder)
    /**
     * @param containerConfig The configuration used to run the application image container. See Container Config details below.
     * @return builder
     */
    inline def containerConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigContainerConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigContainerConfigArgs.builder
      builder.containerConfig(args(argsBuilder).build)

    /**
     * @param fileSystemConfig The URL where the Git repository is located. See File System Config details below.
     * @return builder
     */
    inline def fileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder)
    /**
     * @param fileSystemConfig The URL where the Git repository is located. See File System Config details below.
     * @return builder
     */
    inline def fileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

    /**
     * @param kernelSpecs The default branch for the Git repository. See Kernel Spec details below.
     * @return builder
     */
    inline def kernelSpecs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecArgs.builder
      builder.kernelSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder)
    /**
     * @param codeEditorAppImageConfig The CodeEditorAppImageConfig. See Code Editor App Image Config details below.
     * @return builder
     */
    inline def codeEditorAppImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigCodeEditorAppImageConfigArgs.builder
      builder.codeEditorAppImageConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabImageConfig The JupyterLabAppImageConfig. See Jupyter Lab Image Config details below.
     * @return builder
     */
    inline def jupyterLabImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigJupyterLabImageConfigArgs.builder
      builder.jupyterLabImageConfig(args(argsBuilder).build)

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker AI image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * @return builder
     */
    inline def kernelGatewayImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppImageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs.builder
      builder.kernelGatewayImageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.AppState.Builder)
    /**
     * @param resourceSpec Instance type and the ARN of the SageMaker AI image created on the instance. See Resource Spec below.
     * @return builder
     */
    inline def resourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.CodeRepositoryState.Builder)
    /**
     * @param gitConfig Specifies details about the repository. see Git Config details below.
     * @return builder
     */
    inline def gitConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.CodeRepositoryState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs.builder
      builder.gitConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder)
    /**
     * @param constraintsResource The constraints resource for a monitoring job. Fields are documented below.
     * @return builder
     */
    inline def constraintsResource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigConstraintsResourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigConstraintsResourceArgs.builder
      builder.constraintsResource(args(argsBuilder).build)

    /**
     * @param statisticsResource The statistics resource for a monitoring job. Fields are documented below.
     * @return builder
     */
    inline def statisticsResource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResourceArgs.builder
      builder.statisticsResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder)
    /**
     * @param batchTransformInput Input object for the batch transform job. Fields are documented below.
     * @return builder
     */
    inline def batchTransformInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.builder
      builder.batchTransformInput(args(argsBuilder).build)

    /**
     * @param endpointInput Input object for the endpoint. Fields are documented below.
     * @return builder
     */
    inline def endpointInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputEndpointInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputEndpointInputArgs.builder
      builder.endpointInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.Builder)
    /**
     * @param datasetFormat The dataset format for your batch transform job. Fields are documented below.
     * @return builder
     */
    inline def datasetFormat(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.builder
      builder.datasetFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder)
    /**
     * @param csv The CSV dataset used in the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def csv(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatCsvArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatCsvArgs.builder
      builder.csv(args(argsBuilder).build)

    /**
     * @param json The JSON dataset used in the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def json(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatJsonArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputBatchTransformInputDatasetFormatJsonArgs.builder
      builder.json(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder)
    /**
     * @param monitoringOutputs Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded. Fields are documented below.
     * @return builder
     */
    inline def monitoringOutputs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.builder
      builder.monitoringOutputs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.Builder)
    /**
     * @param s3Output The Amazon S3 storage location where the results of a monitoring job are saved. Fields are documented below.
     * @return builder
     */
    inline def s3Output(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs.builder
      builder.s3Output(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder)
    /**
     * @param clusterConfig The configuration for the cluster resources used to run the processing job. Fields are documented below.
     * @return builder
     */
    inline def clusterConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesClusterConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder)
    /**
     * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. Fields are documented below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder)
    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def dataQualityAppSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs.builder
      builder.dataQualityAppSpecification(args(argsBuilder).build)

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def dataQualityBaselineConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs.builder
      builder.dataQualityBaselineConfig(args(argsBuilder).build)

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def dataQualityJobInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs.builder
      builder.dataQualityJobInput(args(argsBuilder).build)

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. Fields are documented below.
     * @return builder
     */
    inline def dataQualityJobOutputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs.builder
      builder.dataQualityJobOutputConfig(args(argsBuilder).build)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. Fields are documented below.
     * @return builder
     */
    inline def jobResources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs.builder
      builder.jobResources(args(argsBuilder).build)

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before stopping. Fields are documented below.
     * @return builder
     */
    inline def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DeviceFleetState.Builder)
    /**
     * @param outputConfig Specifies details about the repository. see Output Config details below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DeviceFleetState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DeviceState.Builder)
    /**
     * @param device The device to register with SageMaker AI Edge Manager. See Device details below.
     * @return builder
     */
    inline def device(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DeviceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs.builder
      builder.device(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder)
    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user profile. Permitted users can access this file system in Amazon SageMaker AI Studio. See `customFileSystemConfig` Block below.
     * @return builder
     */
    inline def customFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.builder
      builder.customFileSystemConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system operations. See `customPosixUserConfig` Block below.
     * @return builder
     */
    inline def customPosixUserConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomPosixUserConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomPosixUserConfigArgs.builder
      builder.customPosixUserConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See `jupyterLabAppSettings` Block below.
     * @return builder
     */
    inline def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See `jupyterServerAppSettings` Block below.
     * @return builder
     */
    inline def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See `kernelGatewayAppSettings` Block below.
     * @return builder
     */
    inline def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings for a private space. See `spaceStorageSettings` Block below.
     * @return builder
     */
    inline def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.Builder)
    /**
     * @param efsFileSystemConfig The default EBS storage settings for a private space. See `efsFileSystemConfig` Block below.
     * @return builder
     */
    inline def efsFileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.builder
      builder.efsFileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    inline def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    inline def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a JupyterLab app. see `customImage` Block below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

    /**
     * @param emrSettings The configuration parameters that specify the IAM roles assumed by the execution role of SageMaker AI (assumable roles) and the cluster instances or job execution environments (execution roles or runtime roles) to manage and access resources required for running Amazon EMR clusters or Amazon EMR Serverless applications. see `emrSettings` Block below.
     * @return builder
     */
    inline def emrSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsEmrSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterLabAppSettingsEmrSettingsArgs.builder
      builder.emrSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see `customImage` Block below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param defaultEbsStorageSettings The default EBS storage settings for a private space. See `defaultEbsStorageSettings` Block below.
     * @return builder
     */
    inline def defaultEbsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.builder
      builder.defaultEbsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder)
    /**
     * @param canvasAppSettings The Canvas app settings. See `canvasAppSettings` Block below.
     * @return builder
     */
    inline def canvasAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.builder
      builder.canvasAppSettings(args(argsBuilder).build)

    /**
     * @param codeEditorAppSettings The Code Editor application settings. See `codeEditorAppSettings` Block below.
     * @return builder
     */
    inline def codeEditorAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.builder
      builder.codeEditorAppSettings(args(argsBuilder).build)

    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user profile. Permitted users can access this file system in Amazon SageMaker AI Studio. See `customFileSystemConfig` Block below.
     * @return builder
     */
    inline def customFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.builder
      builder.customFileSystemConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system operations. See `customPosixUserConfig` Block below.
     * @return builder
     */
    inline def customPosixUserConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomPosixUserConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomPosixUserConfigArgs.builder
      builder.customPosixUserConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See `jupyterLabAppSettings` Block below.
     * @return builder
     */
    inline def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See `jupyterServerAppSettings` Block below.
     * @return builder
     */
    inline def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See `kernelGatewayAppSettings` Block below.
     * @return builder
     */
    inline def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param rSessionAppSettings The RSession app settings. See `rSessionAppSettings` Block below.
     * @return builder
     */
    inline def rSessionAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.builder
      builder.rSessionAppSettings(args(argsBuilder).build)

    /**
     * @param rStudioServerProAppSettings A collection of settings that configure user interaction with the RStudioServerPro app. See `rStudioServerProAppSettings` Block below.
     * @return builder
     */
    inline def rStudioServerProAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRStudioServerProAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRStudioServerProAppSettingsArgs.builder
      builder.rStudioServerProAppSettings(args(argsBuilder).build)

    /**
     * @param sharingSettings The sharing settings. See `sharingSettings` Block below.
     * @return builder
     */
    inline def sharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSharingSettingsArgs.builder
      builder.sharingSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings for a private space. See `spaceStorageSettings` Block below.
     * @return builder
     */
    inline def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

    /**
     * @param studioWebPortalSettings The Studio Web Portal settings. See `studioWebPortalSettings` Block below.
     * @return builder
     */
    inline def studioWebPortalSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsStudioWebPortalSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsStudioWebPortalSettingsArgs.builder
      builder.studioWebPortalSettings(args(argsBuilder).build)

    /**
     * @param tensorBoardAppSettings The TensorBoard app settings. See `tensorBoardAppSettings` Block below.
     * @return builder
     */
    inline def tensorBoardAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.builder
      builder.tensorBoardAppSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder)
    /**
     * @param directDeploySettings The model deployment settings for the SageMaker AI Canvas application. See `directDeploySettings` Block below.
     * @return builder
     */
    inline def directDeploySettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.builder
      builder.directDeploySettings(args(argsBuilder).build)

    /**
     * @param emrServerlessSettings The settings for running Amazon EMR Serverless jobs in SageMaker AI Canvas. See `emrServerlessSettings` Block below.
     * @return builder
     */
    inline def emrServerlessSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.builder
      builder.emrServerlessSettings(args(argsBuilder).build)

    inline def generativeAiSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.builder
      builder.generativeAiSettings(args(argsBuilder).build)

    /**
     * @param identityProviderOauthSettings The settings for connecting to an external data source with OAuth. See `identityProviderOauthSettings` Block below.
     * @return builder
     */
    inline def identityProviderOauthSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.builder
      builder.identityProviderOauthSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param kendraSettings The settings for document querying. See `kendraSettings` Block below.
     * @return builder
     */
    inline def kendraSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsKendraSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsKendraSettingsArgs.builder
      builder.kendraSettings(args(argsBuilder).build)

    /**
     * @param modelRegisterSettings The model registry settings for the SageMaker AI Canvas application. See `modelRegisterSettings` Block below.
     * @return builder
     */
    inline def modelRegisterSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.builder
      builder.modelRegisterSettings(args(argsBuilder).build)

    /**
     * @param timeSeriesForecastingSettings Time series forecast settings for the Canvas app. See `timeSeriesForecastingSettings` Block below.
     * @return builder
     */
    inline def timeSeriesForecastingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.builder
      builder.timeSeriesForecastingSettings(args(argsBuilder).build)

    /**
     * @param workspaceSettings The workspace settings for the SageMaker AI Canvas application. See `workspaceSettings` Block below.
     * @return builder
     */
    inline def workspaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.builder
      builder.workspaceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    inline def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    inline def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a CodeEditor app. see `customImage` Block below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.Builder)
    /**
     * @param efsFileSystemConfig The default EBS storage settings for a private space. See `efsFileSystemConfig` Block below.
     * @return builder
     */
    inline def efsFileSystemConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.builder
      builder.efsFileSystemConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    inline def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    inline def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a JupyterLab app. see `customImage` Block below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

    /**
     * @param emrSettings The configuration parameters that specify the IAM roles assumed by the execution role of SageMaker AI (assumable roles) and the cluster instances or job execution environments (execution roles or runtime roles) to manage and access resources required for running Amazon EMR clusters or Amazon EMR Serverless applications. see `emrSettings` Block below.
     * @return builder
     */
    inline def emrSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsEmrSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterLabAppSettingsEmrSettingsArgs.builder
      builder.emrSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see `codeRepository` Block below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see `customImage` Block below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a RSession app. see `customImage` Block below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block above.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param defaultEbsStorageSettings The default EBS storage settings for a private space. See `defaultEbsStorageSettings` Block below.
     * @return builder
     */
    inline def defaultEbsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.builder
      builder.defaultEbsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.Builder)
    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder)
    /**
     * @param dockerSettings A collection of settings that configure the domain\u2019s Docker interaction. see `dockerSettings` Block below.
     * @return builder
     */
    inline def dockerSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsDockerSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsDockerSettingsArgs.builder
      builder.dockerSettings(args(argsBuilder).build)

    /**
     * @param rStudioServerProDomainSettings A collection of settings that configure the RStudioServerPro Domain-level app. see `rStudioServerProDomainSettings` Block below.
     * @return builder
     */
    inline def rStudioServerProDomainSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.builder
      builder.rStudioServerProDomainSettings(args(argsBuilder).build)

    /**
     * @param trustedIdentityPropagationSettings Configuration for trusted identity propagation. See the `trustedIdentityPropagationSettings` Block below.
     * @return builder
     */
    inline def trustedIdentityPropagationSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsTrustedIdentityPropagationSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsTrustedIdentityPropagationSettingsArgs.builder
      builder.trustedIdentityPropagationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.Builder)
    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see `defaultResourceSpec` Block above.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsRStudioServerProDomainSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.DomainState.Builder)
    /**
     * @param defaultSpaceSettings The default space settings. See `defaultSpaceSettings` Block below.
     * @return builder
     */
    inline def defaultSpaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultSpaceSettingsArgs.builder
      builder.defaultSpaceSettings(args(argsBuilder).build)

    /**
     * @param defaultUserSettings The default user settings. See `defaultUserSettings` Block below.
     * @return builder
     */
    inline def defaultUserSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs.builder
      builder.defaultUserSettings(args(argsBuilder).build)

    /**
     * @param domainSettings The domain settings. See `domainSettings` Block below.
     * @return builder
     */
    inline def domainSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainDomainSettingsArgs.builder
      builder.domainSettings(args(argsBuilder).build)

    /**
     * @param retentionPolicy The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See `retentionPolicy` Block below.
     * @return builder
     */
    inline def retentionPolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder)
    /**
     * @param clientConfig Configures the behavior of the client used by SageMaker AI to interact with the model container during asynchronous inference.
     * @return builder
     */
    inline def clientConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigClientConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigClientConfigArgs.builder
      builder.clientConfig(args(argsBuilder).build)

    /**
     * @param outputConfig Configuration for asynchronous inference invocation outputs.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.Builder)
    /**
     * @param notificationConfig Configuration for notifications of inference results for asynchronous inference.
     * @return builder
     */
    inline def notificationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder)
    /**
     * @param captureContentTypeHeader Content type headers to capture. See `captureContentTypeHeader` below.
     * @return builder
     */
    inline def captureContentTypeHeader(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs.builder
      builder.captureContentTypeHeader(args(argsBuilder).build)

    /**
     * @param captureOptions What data to capture. Fields are documented below.
     * @return builder
     */
    inline def captureOptions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureOptionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureOptionArgs.builder
      builder.captureOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder)
    /**
     * @param capacityReservationConfig Settings for the capacity reservation for the compute instances that SageMaker AI reserves for an endpoint. See capacityReservationConfig below.
     * @return builder
     */
    inline def capacityReservationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantCapacityReservationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantCapacityReservationConfigArgs.builder
      builder.capacityReservationConfig(args(argsBuilder).build)

    /**
     * @param coreDumpConfig Core dump configuration from the model container when the process crashes. Fields are documented below.
     * @return builder
     */
    inline def coreDumpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantCoreDumpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantCoreDumpConfigArgs.builder
      builder.coreDumpConfig(args(argsBuilder).build)

    /**
     * @param managedInstanceScaling Control the range in the number of instances that the endpoint provisions as it scales up or down to accommodate traffic.
     * @return builder
     */
    inline def managedInstanceScaling(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantManagedInstanceScalingArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantManagedInstanceScalingArgs.builder
      builder.managedInstanceScaling(args(argsBuilder).build)

    /**
     * @param routingConfigs How the endpoint routes incoming traffic. See routingConfig below.
     * @return builder
     */
    inline def routingConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantRoutingConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantRoutingConfigArgs.builder
      builder.routingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serverlessConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    inline def serverlessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantServerlessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantServerlessConfigArgs.builder
      builder.serverlessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder)
    /**
     * @param capacityReservationConfig Settings for the capacity reservation for the compute instances that SageMaker AI reserves for an endpoint. See capacityReservationConfig below.
     * @return builder
     */
    inline def capacityReservationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantCapacityReservationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantCapacityReservationConfigArgs.builder
      builder.capacityReservationConfig(args(argsBuilder).build)

    /**
     * @param coreDumpConfig Core dump configuration from the model container when the process crashes. Fields are documented below.
     * @return builder
     */
    inline def coreDumpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantCoreDumpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantCoreDumpConfigArgs.builder
      builder.coreDumpConfig(args(argsBuilder).build)

    /**
     * @param managedInstanceScaling Control the range in the number of instances that the endpoint provisions as it scales up or down to accommodate traffic.
     * @return builder
     */
    inline def managedInstanceScaling(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantManagedInstanceScalingArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantManagedInstanceScalingArgs.builder
      builder.managedInstanceScaling(args(argsBuilder).build)

    /**
     * @param routingConfigs How the endpoint routes incoming traffic. See routingConfig below.
     * @return builder
     */
    inline def routingConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantRoutingConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantRoutingConfigArgs.builder
      builder.routingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serverlessConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    inline def serverlessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantServerlessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantServerlessConfigArgs.builder
      builder.serverlessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder)
    /**
     * @param asyncInferenceConfig How an endpoint performs asynchronous inference.
     * @return builder
     */
    inline def asyncInferenceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigArgs.builder
      builder.asyncInferenceConfig(args(argsBuilder).build)

    /**
     * @param dataCaptureConfig Parameters to capture input/output of SageMaker AI models endpoints. Fields are documented below.
     * @return builder
     */
    inline def dataCaptureConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigArgs.builder
      builder.dataCaptureConfig(args(argsBuilder).build)

    /**
     * @param productionVariants List each model that you want to host at this endpoint. See below.
     * @return builder
     */
    inline def productionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantArgs.builder
      builder.productionVariants(args.map(_(argsBuilder).build)*)

    /**
     * @param shadowProductionVariants Models that you want to host at this endpoint in shadow mode with production traffic replicated from the model specified on `productionVariants`. If you use this field, you can only specify one variant for `productionVariants` and one variant for `shadowProductionVariants`. See below (same arguments as `productionVariants`).
     * @return builder
     */
    inline def shadowProductionVariants(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointConfigurationShadowProductionVariantArgs.builder
      builder.shadowProductionVariants(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder)
    /**
     * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint deployment failures and recovery. See Auto Rollback Configuration.
     * @return builder
     */
    inline def autoRollbackConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.builder
      builder.autoRollbackConfiguration(args(argsBuilder).build)

    /**
     * @param blueGreenUpdatePolicy Update policy for a blue/green deployment. If this update policy is specified, SageMaker AI creates a new fleet during the deployment while maintaining the old fleet. SageMaker AI flips traffic to the new fleet according to the specified traffic routing configuration. Only one update policy should be used in the deployment configuration. If no update policy is specified, SageMaker AI uses a blue/green deployment strategy with all at once traffic shifting by default. See Blue Green Update Config.
     * @return builder
     */
    inline def blueGreenUpdatePolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.builder
      builder.blueGreenUpdatePolicy(args(argsBuilder).build)

    /**
     * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker AI endpoint. See Rolling Update Policy.
     * @return builder
     */
    inline def rollingUpdatePolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.builder
      builder.rollingUpdatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.Builder)
    /**
     * @param alarms List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker AI rolls back the deployment. See Alarms.
     * @return builder
     */
    inline def alarms(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs.builder
      builder.alarms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.Builder)
    /**
     * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment. See Traffic Routing Configuration.
     * @return builder
     */
    inline def trafficRoutingConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.builder
      builder.trafficRoutingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder)
    /**
     * @param canarySize Batch size for the first step to turn on traffic on the new endpoint fleet. Value must be less than or equal to 50% of the variant&#39;s total instance count. See Canary Size.
     * @return builder
     */
    inline def canarySize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs.builder
      builder.canarySize(args(argsBuilder).build)

    /**
     * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint fleet. Value must be 10-50% of the variant&#39;s total instance count. See Linear Step Size.
     * @return builder
     */
    inline def linearStepSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs.builder
      builder.linearStepSize(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder)
    /**
     * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant&#39;s total instance count. See Maximum Batch Size.
     * @return builder
     */
    inline def maximumBatchSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyMaximumBatchSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyMaximumBatchSizeArgs.builder
      builder.maximumBatchSize(args(argsBuilder).build)

    /**
     * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is absent, the default value will be set to 100% of total capacity which means to bring up the whole capacity of the old fleet at once during rollback. See Rollback Maximum Batch Size.
     * @return builder
     */
    inline def rollbackMaximumBatchSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyRollbackMaximumBatchSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigRollingUpdatePolicyRollbackMaximumBatchSizeArgs.builder
      builder.rollbackMaximumBatchSize(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.EndpointState.Builder)
    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * @return builder
     */
    inline def deploymentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs.builder
      builder.deploymentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder)
    inline def collectionConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.builder
      builder.collectionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.Builder)
    inline def vectorConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigVectorConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionCollectionConfigVectorConfigArgs.builder
      builder.vectorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder)
    /**
     * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * @return builder
     */
    inline def dataCatalogConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigArgs.builder
      builder.dataCatalogConfig(args(argsBuilder).build)

    /**
     * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * @return builder
     */
    inline def s3StorageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigArgs.builder
      builder.s3StorageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder)
    /**
     * @param securityConfig Security config for at-rest encryption of your OnlineStore. See Security Config Below.
     * @return builder
     */
    inline def securityConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigSecurityConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param ttlDuration Time to live duration, where the record is hard deleted after the expiration time is reached; ExpiresAt = EventTime + TtlDuration.. See TTL Duration Below.
     * @return builder
     */
    inline def ttlDuration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigTtlDurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigTtlDurationArgs.builder
      builder.ttlDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder)
    /**
     * @param featureDefinitions A list of Feature names and types. See Feature Definition Below.
     * @return builder
     */
    inline def featureDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs.builder
      builder.featureDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param offlineStoreConfig The Offline Feature Store Configuration. See Offline Store Config Below.
     * @return builder
     */
    inline def offlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs.builder
      builder.offlineStoreConfig(args(argsBuilder).build)

    /**
     * @param onlineStoreConfig The Online Feature Store Configuration. See Online Store Config Below.
     * @return builder
     */
    inline def onlineStoreConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs.builder
      builder.onlineStoreConfig(args(argsBuilder).build)

    inline def throughputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FeatureGroupState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FeatureGroupThroughputConfigArgs.builder
      builder.throughputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder)
    /**
     * @param humanLoopActivationConditionsConfig defines under what conditions SageMaker AI creates a human loop. See Human Loop Activation Conditions Config details below.
     * @return builder
     */
    inline def humanLoopActivationConditionsConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs.builder
      builder.humanLoopActivationConditionsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder)
    /**
     * @param publicWorkforceTaskPrice Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed. See Public Workforce Task Price details below.
     * @return builder
     */
    inline def publicWorkforceTaskPrice(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.builder
      builder.publicWorkforceTaskPrice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.Builder)
    /**
     * @param amountInUsd Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars. See Amount In Usd details below.
     * @return builder
     */
    inline def amountInUsd(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs.builder
      builder.amountInUsd(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder)
    /**
     * @param humanLoopActivationConfig An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * @return builder
     */
    inline def humanLoopActivationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs.builder
      builder.humanLoopActivationConfig(args(argsBuilder).build)

    /**
     * @param humanLoopConfig An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * @return builder
     */
    inline def humanLoopConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs.builder
      builder.humanLoopConfig(args(argsBuilder).build)

    /**
     * @param humanLoopRequestSource Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * @return builder
     */
    inline def humanLoopRequestSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs.builder
      builder.humanLoopRequestSource(args(argsBuilder).build)

    /**
     * @param outputConfig An object containing information about where the human review results will be uploaded. See Output Config details below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.FlowDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HubContentReferenceState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HubContentReferenceTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HubContentReferenceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HubContentReferenceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HubState.Builder)
    /**
     * @param s3StorageConfig The Amazon S3 storage configuration for the hub. See S3 Storage Config details below.
     * @return builder
     */
    inline def s3StorageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HubS3StorageConfigArgs.builder
      builder.s3StorageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HumanTaskUIState.Builder)
    /**
     * @param uiTemplate The Liquid template for the worker user interface. See UI Template below.
     * @return builder
     */
    inline def uiTemplate(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HumanTaskUIState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs.builder
      builder.uiTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder)
    /**
     * @param objective Objective metric used by tuning. See `objective`.
     * @return builder
     */
    inline def objective(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigObjectiveArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigObjectiveArgs.builder
      builder.objective(args(argsBuilder).build)

    /**
     * @param parameterRanges Hyperparameter search ranges. See `parameterRanges`.
     * @return builder
     */
    inline def parameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesArgs.builder
      builder.parameterRanges(args(argsBuilder).build)

    /**
     * @param resourceLimits Training job limits for tuning. See `resourceLimits`.
     * @return builder
     */
    inline def resourceLimits(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigResourceLimitsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigResourceLimitsArgs.builder
      builder.resourceLimits(args(argsBuilder).build)

    /**
     * @param strategyConfig Extra strategy options. See `strategyConfig`.
     * @return builder
     */
    inline def strategyConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigStrategyConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigStrategyConfigArgs.builder
      builder.strategyConfig(args(argsBuilder).build)

    /**
     * @param tuningJobCompletionCriteria Conditions to complete tuning. See `tuningJobCompletionCriteria`.
     * @return builder
     */
    inline def tuningJobCompletionCriteria(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaArgs.builder
      builder.tuningJobCompletionCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesArgs.Builder)
    /**
     * @param autoParameters Parameter list for automatic range selection.
     * @return builder
     */
    inline def autoParameters(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesAutoParameterArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesAutoParameterArgs.builder
      builder.autoParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param categoricalParameterRanges Categorical parameter ranges.
     * @return builder
     */
    inline def categoricalParameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesCategoricalParameterRangeArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesCategoricalParameterRangeArgs.builder
      builder.categoricalParameterRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param continuousParameterRanges Continuous parameter ranges.
     * @return builder
     */
    inline def continuousParameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesContinuousParameterRangeArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesContinuousParameterRangeArgs.builder
      builder.continuousParameterRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param integerParameterRanges Integer parameter ranges.
     * @return builder
     */
    inline def integerParameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesIntegerParameterRangeArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigParameterRangesIntegerParameterRangeArgs.builder
      builder.integerParameterRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigStrategyConfigArgs.Builder)
    /**
     * @param hyperbandStrategyConfig Hyperband strategy settings. See `hyperbandStrategyConfig`.
     * @return builder
     */
    inline def hyperbandStrategyConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigStrategyConfigHyperbandStrategyConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigStrategyConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigStrategyConfigHyperbandStrategyConfigArgs.builder
      builder.hyperbandStrategyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaArgs.Builder)
    /**
     * @param bestObjectiveNotImproving Stop condition for non-improving jobs. See `bestObjectiveNotImproving`.
     * @return builder
     */
    inline def bestObjectiveNotImproving(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaBestObjectiveNotImprovingArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaBestObjectiveNotImprovingArgs.builder
      builder.bestObjectiveNotImproving(args(argsBuilder).build)

    /**
     * @param convergenceDetected Stop condition based on convergence. See `convergenceDetected`.
     * @return builder
     */
    inline def convergenceDetected(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaConvergenceDetectedArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigTuningJobCompletionCriteriaConvergenceDetectedArgs.builder
      builder.convergenceDetected(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobState.Builder)
    /**
     * @param autotune Autotune settings. See `autotune`.
     * @return builder
     */
    inline def autotune(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobAutotuneArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobAutotuneArgs.builder
      builder.autotune(args(argsBuilder).build)

    /**
     * @param config Tuning job settings. See `config`.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobConfigArgs.builder
      builder.config(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param trainingJobDefinition Single training job definition for tuning. See `trainingJobDefinition`.
     * @return builder
     */
    inline def trainingJobDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.builder
      builder.trainingJobDefinition(args(argsBuilder).build)

    /**
     * @param trainingJobDefinitions Multiple training job definitions for tuning. See `trainingJobDefinition`.
     * @return builder
     */
    inline def trainingJobDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.builder
      builder.trainingJobDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param warmStartConfig Warm start settings. See `warmStartConfig`.
     * @return builder
     */
    inline def warmStartConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigArgs.builder
      builder.warmStartConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionAlgorithmSpecificationArgs.Builder)
    /**
     * @param metricDefinitions Metric extraction rules.
     * @return builder
     */
    inline def metricDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionAlgorithmSpecificationMetricDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionAlgorithmSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionAlgorithmSpecificationMetricDefinitionArgs.builder
      builder.metricDefinitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder)
    /**
     * @param algorithmSpecification Algorithm settings. See `algorithmSpecification`.
     * @return builder
     */
    inline def algorithmSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionAlgorithmSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionAlgorithmSpecificationArgs.builder
      builder.algorithmSpecification(args(argsBuilder).build)

    /**
     * @param checkpointConfig Checkpoint output location. See `checkpointConfig`.
     * @return builder
     */
    inline def checkpointConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionCheckpointConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionCheckpointConfigArgs.builder
      builder.checkpointConfig(args(argsBuilder).build)

    /**
     * @param hyperParameterRanges Hyperparameter ranges for this definition. See `parameterRanges`.
     * @return builder
     */
    inline def hyperParameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesArgs.builder
      builder.hyperParameterRanges(args(argsBuilder).build)

    /**
     * @param hyperParameterTuningResourceConfig Tuning resource settings. See `hyperParameterTuningResourceConfig`.
     * @return builder
     */
    inline def hyperParameterTuningResourceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterTuningResourceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterTuningResourceConfigArgs.builder
      builder.hyperParameterTuningResourceConfig(args(argsBuilder).build)

    /**
     * @param inputDataConfigs Input data channels. See `inputDataConfig`.
     * @return builder
     */
    inline def inputDataConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigArgs.builder
      builder.inputDataConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param outputDataConfig Output data settings. See `outputDataConfig`.
     * @return builder
     */
    inline def outputDataConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionOutputDataConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    /**
     * @param resourceConfig Training resources. See `resourceConfig`.
     * @return builder
     */
    inline def resourceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigArgs.builder
      builder.resourceConfig(args(argsBuilder).build)

    /**
     * @param retryStrategies Retry settings. See `retryStrategy`.
     * @return builder
     */
    inline def retryStrategies(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionRetryStrategyArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionRetryStrategyArgs.builder
      builder.retryStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param stoppingCondition Stopping settings. See `stoppingCondition`.
     * @return builder
     */
    inline def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

    /**
     * @param tuningObjective Objective for this training definition. See `tuningObjective`.
     * @return builder
     */
    inline def tuningObjective(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionTuningObjectiveArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionTuningObjectiveArgs.builder
      builder.tuningObjective(args(argsBuilder).build)

    /**
     * @param vpcConfig VPC settings. See `vpcConfig`.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesArgs.Builder)
    /**
     * @param autoParameters Parameter list for automatic range selection.
     * @return builder
     */
    inline def autoParameters(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesAutoParameterArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesAutoParameterArgs.builder
      builder.autoParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param categoricalParameterRanges Categorical parameter ranges.
     * @return builder
     */
    inline def categoricalParameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesCategoricalParameterRangeArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesCategoricalParameterRangeArgs.builder
      builder.categoricalParameterRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param continuousParameterRanges Continuous parameter ranges.
     * @return builder
     */
    inline def continuousParameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesContinuousParameterRangeArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesContinuousParameterRangeArgs.builder
      builder.continuousParameterRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param integerParameterRanges Integer parameter ranges.
     * @return builder
     */
    inline def integerParameterRanges(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesIntegerParameterRangeArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterRangesIntegerParameterRangeArgs.builder
      builder.integerParameterRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterTuningResourceConfigArgs.Builder)
    /**
     * @param instanceConfigs Per-instance-type resource settings. See `instanceConfigs`.
     * @return builder
     */
    inline def instanceConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterTuningResourceConfigInstanceConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterTuningResourceConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionHyperParameterTuningResourceConfigInstanceConfigArgs.builder
      builder.instanceConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigArgs.Builder)
    /**
     * @param dataSource Data source settings. See `dataSource`.
     * @return builder
     */
    inline def dataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceArgs.builder
      builder.dataSource(args(argsBuilder).build)

    /**
     * @param shuffleConfig Shuffling settings. See `shuffleConfig`.
     * @return builder
     */
    inline def shuffleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigShuffleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigShuffleConfigArgs.builder
      builder.shuffleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder)
    /**
     * @param fileSystemDataSource File system source settings. See `fileSystemDataSource`.
     * @return builder
     */
    inline def fileSystemDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceFileSystemDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceFileSystemDataSourceArgs.builder
      builder.fileSystemDataSource(args(argsBuilder).build)

    /**
     * @param s3DataSource S3 source settings. See `s3DataSource`.
     * @return builder
     */
    inline def s3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.builder
      builder.s3DataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder)
    /**
     * @param hubAccessConfig Hub access settings. See `hubAccessConfig`.
     * @return builder
     */
    inline def hubAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceHubAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceHubAccessConfigArgs.builder
      builder.hubAccessConfig(args(argsBuilder).build)

    /**
     * @param modelAccessConfig Model access settings. See `modelAccessConfig`.
     * @return builder
     */
    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionInputDataConfigDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigArgs.Builder)
    /**
     * @param instanceGroups Instance group settings. See `instanceGroups`.
     * @return builder
     */
    inline def instanceGroups(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstanceGroupArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstanceGroupArgs.builder
      builder.instanceGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param instancePlacementConfig Placement settings. See `instancePlacementConfig`.
     * @return builder
     */
    inline def instancePlacementConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.builder
      builder.instancePlacementConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.Builder)
    /**
     * @param placementSpecifications Placement details. See `placementSpecifications`.
     * @return builder
     */
    inline def placementSpecifications(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstancePlacementConfigPlacementSpecificationArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstancePlacementConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobTrainingJobDefinitionResourceConfigInstancePlacementConfigPlacementSpecificationArgs.builder
      builder.placementSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigArgs.Builder)
    /**
     * @param parentHyperParameterTuningJobs Parent tuning jobs for warm start.
     * @return builder
     */
    inline def parentHyperParameterTuningJobs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigParentHyperParameterTuningJobArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.HyperParameterTuningJobWarmStartConfigParentHyperParameterTuningJobArgs.builder
      builder.parentHyperParameterTuningJobs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigArgs.Builder)
    /**
     * @param autoRollbackConfiguration Automatic rollback configuration. See `autoRollbackConfiguration` Block.
     * @return builder
     */
    inline def autoRollbackConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigAutoRollbackConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigAutoRollbackConfigurationArgs.builder
      builder.autoRollbackConfiguration(args(argsBuilder).build)

    /**
     * @param rollingUpdatePolicy Rolling deployment strategy. See `rollingUpdatePolicy` Block.
     * @return builder
     */
    inline def rollingUpdatePolicy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyArgs.builder
      builder.rollingUpdatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigAutoRollbackConfigurationArgs.Builder)
    /**
     * @param alarms List of CloudWatch alarms that trigger rollback. See `alarms` Block.
     * @return builder
     */
    inline def alarms(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigAutoRollbackConfigurationAlarmArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigAutoRollbackConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigAutoRollbackConfigurationAlarmArgs.builder
      builder.alarms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyArgs.Builder)
    /**
     * @param maximumBatchSize Batch size for each rolling step. See `maximumBatchSize` and `rollbackMaximumBatchSize` Block.
     * @return builder
     */
    inline def maximumBatchSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyMaximumBatchSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyMaximumBatchSizeArgs.builder
      builder.maximumBatchSize(args(argsBuilder).build)

    /**
     * @param rollbackMaximumBatchSize Batch size for a rollback. See `maximumBatchSize` and `rollbackMaximumBatchSize` Block.
     * @return builder
     */
    inline def rollbackMaximumBatchSize(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyRollbackMaximumBatchSizeArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigRollingUpdatePolicyRollbackMaximumBatchSizeArgs.builder
      builder.rollbackMaximumBatchSize(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigArgs.Builder)
    /**
     * @param placementStatuses Placement status of the inference component copies across instance types. See below.
     * @return builder
     */
    inline def placementStatuses(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigPlacementStatusArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigPlacementStatusArgs.builder
      builder.placementStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder)
    /**
     * @param computeResourceRequirements Compute resources allocated to run a model. See `computeResourceRequirements` Block.
     * @return builder
     */
    inline def computeResourceRequirements(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationComputeResourceRequirementsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationComputeResourceRequirementsArgs.builder
      builder.computeResourceRequirements(args(argsBuilder).build)

    /**
     * @param container Container that provides the runtime environment for a model. See `container` Block.
     * @return builder
     */
    inline def container(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param dataCacheConfig Settings that affect how the inference component caches data. See `dataCacheConfig` Block.
     * @return builder
     */
    inline def dataCacheConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationDataCacheConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationDataCacheConfigArgs.builder
      builder.dataCacheConfig(args(argsBuilder).build)

    /**
     * @param schedulingConfig Scheduling configuration for placing inference component copies. See `schedulingConfig` Block.
     * @return builder
     */
    inline def schedulingConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationSchedulingConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationSchedulingConfigArgs.builder
      builder.schedulingConfig(args(argsBuilder).build)

    /**
     * @param startupParameters Settings that take effect while the model container starts up. See `startupParameters` Block.
     * @return builder
     */
    inline def startupParameters(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationStartupParametersArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationStartupParametersArgs.builder
      builder.startupParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerArgs.Builder)
    /**
     * @param containerMetricsConfig Configuration for container metrics scraping. See `containerMetricsConfig` Block.
     * @return builder
     */
    inline def containerMetricsConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerContainerMetricsConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerContainerMetricsConfigArgs.builder
      builder.containerMetricsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerContainerMetricsConfigArgs.Builder)
    /**
     * @param metricsEndpoint Metrics endpoint configuration. See `metricsEndpoint` Block.
     * @return builder
     */
    inline def metricsEndpoint(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerContainerMetricsConfigMetricsEndpointArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerContainerMetricsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationContainerContainerMetricsConfigMetricsEndpointArgs.builder
      builder.metricsEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationSchedulingConfigArgs.Builder)
    /**
     * @param availabilityZoneBalance Configuration for balancing copies across Availability Zones. See `availabilityZoneBalance` Block.
     * @return builder
     */
    inline def availabilityZoneBalance(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationSchedulingConfigAvailabilityZoneBalanceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationSchedulingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationSchedulingConfigAvailabilityZoneBalanceArgs.builder
      builder.availabilityZoneBalance(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.InferenceComponentState.Builder)
    /**
     * @param deploymentConfig Deployment configuration for the inference component, which controls the rollout strategy and rollback behavior. This directive applies only when the inference component is **updated** \u2014 the `CreateInferenceComponent` API does not accept it, so it has no effect on initial creation. It is not returned by the API and is therefore not refreshed into state or verified on import. See `deploymentConfig` Block.
     * @return builder
     */
    inline def deploymentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentDeploymentConfigArgs.builder
      builder.deploymentConfig(args(argsBuilder).build)

    /**
     * @param runtimeConfig Runtime settings for a model that is deployed with an inference component. See `runtimeConfig` Block.
     * @return builder
     */
    inline def runtimeConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

    /**
     * @param specification Details about the resources to deploy with this inference component. Exactly one of `specification` or `specifications` must be configured. See `specification` and `specifications` Block.
     * @return builder
     */
    inline def specification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.builder
      builder.specification(args(argsBuilder).build)

    /**
     * @param specifications List of specification objects for the inference component, one per instance type. At least two blocks are required; configure `specification` instead to deploy to a single instance type. Exactly one of `specification` or `specifications` must be configured. See `specification` and `specifications` Block.
     * @return builder
     */
    inline def specifications(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentSpecificationArgs.builder
      builder.specifications(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.InferenceComponentTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.InferenceComponentState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.InferenceComponentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.Builder)
    /**
     * @param annotationConsolidationConfig How labels are consolidated across human workers. Fields are documented below.
     * @return builder
     */
    inline def annotationConsolidationConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigAnnotationConsolidationConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigAnnotationConsolidationConfigArgs.builder
      builder.annotationConsolidationConfig(args(argsBuilder).build)

    /**
     * @param publicWorkforceTaskPrice Price to pay for each task performed by an Amazon Mechanical Turk worker. Fields are documented below.
     * @return builder
     */
    inline def publicWorkforceTaskPrice(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigPublicWorkforceTaskPriceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigPublicWorkforceTaskPriceArgs.builder
      builder.publicWorkforceTaskPrice(args(argsBuilder).build)

    /**
     * @param uiConfig Information about the user interface that workers use to complete the labeling task. Fields are documented below.
     * @return builder
     */
    inline def uiConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigUiConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigUiConfigArgs.builder
      builder.uiConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigPublicWorkforceTaskPriceArgs.Builder)
    /**
     * @param amountInUsd Amount of money paid to an Amazon Mechanical Turk worker in United States dollars. Fields are documented below.
     * @return builder
     */
    inline def amountInUsd(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigPublicWorkforceTaskPriceAmountInUsdArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigPublicWorkforceTaskPriceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigPublicWorkforceTaskPriceAmountInUsdArgs.builder
      builder.amountInUsd(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigArgs.Builder)
    /**
     * @param dataAttributes Attributes of the data. Fields are documented below.
     * @return builder
     */
    inline def dataAttributes(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataAttributesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataAttributesArgs.builder
      builder.dataAttributes(args(argsBuilder).build)

    /**
     * @param dataSource Location of the input data.. Fields are documented below.
     * @return builder
     */
    inline def dataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceArgs.builder
      builder.dataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceArgs.Builder)
    /**
     * @param s3DataSource S3 location of the input data objects.. Fields are documented below.
     * @return builder
     */
    inline def s3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceS3DataSourceArgs.builder
      builder.s3DataSource(args(argsBuilder).build)

    /**
     * @param snsDataSource SNS data source used for streaming labeling jobs. Fields are documented below.
     * @return builder
     */
    inline def snsDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceSnsDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigDataSourceSnsDataSourceArgs.builder
      builder.snsDataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigArgs.Builder)
    /**
     * @param labelingJobResourceConfig Configuration information for the labeling job. Fields are documented below.
     * @return builder
     */
    inline def labelingJobResourceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigLabelingJobResourceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigLabelingJobResourceConfigArgs.builder
      builder.labelingJobResourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigLabelingJobResourceConfigArgs.Builder)
    /**
     * @param vpcConfig VPC that SageMaker jobs, hosted models, and compute resources have access to. Fields are documented below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigLabelingJobResourceConfigVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigLabelingJobResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigLabelingJobResourceConfigVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.LabelingJobState.Builder)
    /**
     * @param humanTaskConfig Configuration information required for human workers to complete a labeling task. Fields are documented below.
     * @return builder
     */
    inline def humanTaskConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobHumanTaskConfigArgs.builder
      builder.humanTaskConfig(args(argsBuilder).build)

    /**
     * @param inputConfig Input data for the labeling job. Fields are documented below.
     * @return builder
     */
    inline def inputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobInputConfigArgs.builder
      builder.inputConfig(args(argsBuilder).build)

    /**
     * @param labelCounters A breakdown of the number of objects labeled.
     * @return builder
     */
    inline def labelCounters(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobLabelCounterArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.LabelingJobState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobLabelCounterArgs.builder
      builder.labelCounters(args.map(_(argsBuilder).build)*)

    /**
     * @param labelingJobAlgorithmsConfig Information required to perform automated data labeling.. Fields are documented below.
     * @return builder
     */
    inline def labelingJobAlgorithmsConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobLabelingJobAlgorithmsConfigArgs.builder
      builder.labelingJobAlgorithmsConfig(args(argsBuilder).build)

    /**
     * @param outputConfig Location of the output data. Fields are documented below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.LabelingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

    /**
     * @param stoppingConditions Conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped. Fields are documented below.
     * @return builder
     */
    inline def stoppingConditions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.LabelingJobStoppingConditionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.LabelingJobState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.LabelingJobStoppingConditionArgs.builder
      builder.stoppingConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MlflowAppState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MlflowAppTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MlflowAppState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MlflowAppTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelCardExportJobState.Builder)
    /**
     * @param exportArtifacts Exported model card artifacts.
     * @return builder
     */
    inline def exportArtifacts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardExportJobExportArtifactArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelCardExportJobState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardExportJobExportArtifactArgs.builder
      builder.exportArtifacts(args.map(_(argsBuilder).build)*)

    /**
     * @param outputConfig Export output details. Fields are documented below.
     * @return builder
     */
    inline def outputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardExportJobOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelCardExportJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardExportJobOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardExportJobTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelCardExportJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardExportJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelCardState.Builder)
    /**
     * @param securityConfig KMS key to encrypt, decrypt, and re-encrypt model card content. Fields are documented below.
     * @return builder
     */
    inline def securityConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardSecurityConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelCardState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelCardTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelCardState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelCardTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceArgs.Builder)
    /**
     * @param s3DataSources S3 location of model data to deploy. See S3 Data Source.
     * @return builder
     */
    inline def s3DataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceS3DataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceS3DataSourceArgs.builder
      builder.s3DataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceS3DataSourceArgs.Builder)
    /**
     * @param modelAccessConfig Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license agreement (EULA) within the `modelAccessConfig` configuration block. See Model Access Config.
     * @return builder
     */
    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder)
    /**
     * @param additionalModelDataSources Additional data sources that are available to the model in addition to those specified in `modelDataSource`. See Additional Model Data Source.
     * @return builder
     */
    inline def additionalModelDataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerAdditionalModelDataSourceArgs.builder
      builder.additionalModelDataSources(args.map(_(argsBuilder).build)*)

    /**
     * @param imageConfig Whether the model container is in Amazon ECR or a private Docker registry accessible from your VPC. For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * @return builder
     */
    inline def imageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param modelDataSource Location of model data to deploy. Use this for uncompressed model deployment. For information about how to deploy an uncompressed model, see [Deploying uncompressed models](https://docs.aws.amazon.com/sagemaker/latest/dg/large-model-inference-uncompressed.html) in the _AWS SageMaker AI Developer Guide_.
     * @return builder
     */
    inline def modelDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.builder
      builder.modelDataSource(args(argsBuilder).build)

    /**
     * @param multiModelConfig Specifies additional configuration for multi-model endpoints. see Multi Model Config.
     * @return builder
     */
    inline def multiModelConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerMultiModelConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerMultiModelConfigArgs.builder
      builder.multiModelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.Builder)
    /**
     * @param repositoryAuthConfig Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified `Vpc` as the value for the RepositoryAccessMode field, and the private Docker registry where the model image is hosted requires authentication. see Repository Auth Config.
     * @return builder
     */
    inline def repositoryAuthConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigRepositoryAuthConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigRepositoryAuthConfigArgs.builder
      builder.repositoryAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.Builder)
    /**
     * @param s3DataSources S3 location of model data to deploy. See S3 Data Source.
     * @return builder
     */
    inline def s3DataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.builder
      builder.s3DataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.Builder)
    /**
     * @param modelAccessConfig Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license agreement (EULA) within the `modelAccessConfig` configuration block. See Model Access Config.
     * @return builder
     */
    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerModelDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceArgs.Builder)
    /**
     * @param s3DataSources S3 location of model data to deploy. See S3 Data Source.
     * @return builder
     */
    inline def s3DataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceS3DataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceS3DataSourceArgs.builder
      builder.s3DataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceS3DataSourceArgs.Builder)
    /**
     * @param modelAccessConfig Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license agreement (EULA) within the `modelAccessConfig` configuration block. See Model Access Config.
     * @return builder
     */
    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder)
    /**
     * @param additionalModelDataSources Additional data sources that are available to the model in addition to those specified in `modelDataSource`. See Additional Model Data Source.
     * @return builder
     */
    inline def additionalModelDataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerAdditionalModelDataSourceArgs.builder
      builder.additionalModelDataSources(args.map(_(argsBuilder).build)*)

    /**
     * @param imageConfig Whether the model container is in Amazon ECR or a private Docker registry accessible from your VPC. For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * @return builder
     */
    inline def imageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param modelDataSource Location of model data to deploy. Use this for uncompressed model deployment. For information about how to deploy an uncompressed model, see [Deploying uncompressed models](https://docs.aws.amazon.com/sagemaker/latest/dg/large-model-inference-uncompressed.html) in the _AWS SageMaker AI Developer Guide_.
     * @return builder
     */
    inline def modelDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.builder
      builder.modelDataSource(args(argsBuilder).build)

    /**
     * @param multiModelConfig Specifies additional configuration for multi-model endpoints. see Multi Model Config.
     * @return builder
     */
    inline def multiModelConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerMultiModelConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerMultiModelConfigArgs.builder
      builder.multiModelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.Builder)
    /**
     * @param repositoryAuthConfig Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified `Vpc` as the value for the RepositoryAccessMode field, and the private Docker registry where the model image is hosted requires authentication. see Repository Auth Config.
     * @return builder
     */
    inline def repositoryAuthConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigRepositoryAuthConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigRepositoryAuthConfigArgs.builder
      builder.repositoryAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.Builder)
    /**
     * @param s3DataSources S3 location of model data to deploy. See S3 Data Source.
     * @return builder
     */
    inline def s3DataSources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.builder
      builder.s3DataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.Builder)
    /**
     * @param modelAccessConfig Specifies the access configuration file for the ML model. You can explicitly accept the model end-user license agreement (EULA) within the `modelAccessConfig` configuration block. See Model Access Config.
     * @return builder
     */
    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerModelDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ModelState.Builder)
    /**
     * @param containers Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
     * @return builder
     */
    inline def containers(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container endpoint are called. See Inference Execution Config.
     * @return builder
     */
    inline def inferenceExecutionConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs.builder
      builder.inferenceExecutionConfig(args(argsBuilder).build)

    /**
     * @param primaryContainer Primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * @return builder
     */
    inline def primaryContainer(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    /**
     * @param vpcConfig Specifies the VPC that you want your model to connect to. This configuration is used in hosting services and in batch transform. See VPC Config.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ModelState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder)
    /**
     * @param monitoringJobDefinition Defines the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def monitoringJobDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.builder
      builder.monitoringJobDefinition(args(argsBuilder).build)

    /**
     * @param scheduleConfig Configures the monitoring schedule. Fields are documented below.
     * @return builder
     */
    inline def scheduleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigScheduleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder)
    /**
     * @param baseline Baseline configuration used to validate that the data conforms to the specified constraints and statistics. Fields are documented below.
     * @return builder
     */
    inline def baseline(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineArgs.builder
      builder.baseline(args(argsBuilder).build)

    /**
     * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker container image. Fields are documented below.
     * @return builder
     */
    inline def monitoringAppSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringAppSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringAppSpecificationArgs.builder
      builder.monitoringAppSpecification(args(argsBuilder).build)

    /**
     * @param monitoringInputs Inputs for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def monitoringInputs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsArgs.builder
      builder.monitoringInputs(args(argsBuilder).build)

    /**
     * @param monitoringOutputConfig Outputs from the monitoring job to be uploaded to Amazon S3. Fields are documented below.
     * @return builder
     */
    inline def monitoringOutputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigArgs.builder
      builder.monitoringOutputConfig(args(argsBuilder).build)

    /**
     * @param monitoringResources Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. Fields are documented below.
     * @return builder
     */
    inline def monitoringResources(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringResourcesArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringResourcesArgs.builder
      builder.monitoringResources(args(argsBuilder).build)

    /**
     * @param networkConfig Networking options for the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionNetworkConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param stoppingConditions How long the monitoring job is allowed to run. Fields are documented below.
     * @return builder
     */
    inline def stoppingConditions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionStoppingConditionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionStoppingConditionArgs.builder
      builder.stoppingConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineArgs.Builder)
    inline def constraintsResource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineConstraintsResourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineConstraintsResourceArgs.builder
      builder.constraintsResource(args(argsBuilder).build)

    inline def statisticsResource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineStatisticsResourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionBaselineStatisticsResourceArgs.builder
      builder.statisticsResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsArgs.Builder)
    /**
     * @param batchTransformInput Input object for the batch transform job. Fields are documented below.
     * @return builder
     */
    inline def batchTransformInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputArgs.builder
      builder.batchTransformInput(args(argsBuilder).build)

    /**
     * @param endpointInput Endpoint for a monitoring job. Fields are documented below.
     * @return builder
     */
    inline def endpointInput(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsEndpointInputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsEndpointInputArgs.builder
      builder.endpointInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputArgs.Builder)
    /**
     * @param datasetFormat Dataset format for the batch transform job. Fields are documented below.
     * @return builder
     */
    inline def datasetFormat(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatArgs.builder
      builder.datasetFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatArgs.Builder)
    /**
     * @param csv CSV dataset used in the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def csv(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatCsvArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatCsvArgs.builder
      builder.csv(args(argsBuilder).build)

    /**
     * @param json JSON dataset used in the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def json(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatJsonArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringInputsBatchTransformInputDatasetFormatJsonArgs.builder
      builder.json(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigArgs.Builder)
    /**
     * @param monitoringOutputs Monitoring outputs for monitoring jobs. Fields are documented below.
     * @return builder
     */
    inline def monitoringOutputs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigMonitoringOutputsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigMonitoringOutputsArgs.builder
      builder.monitoringOutputs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigMonitoringOutputsArgs.Builder)
    /**
     * @param s3Output Amazon S3 storage location where the results of a monitoring job are saved. Fields are documented below.
     * @return builder
     */
    inline def s3Output(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigMonitoringOutputsS3OutputArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigMonitoringOutputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringOutputConfigMonitoringOutputsS3OutputArgs.builder
      builder.s3Output(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringResourcesArgs.Builder)
    /**
     * @param clusterConfig Configuration for the cluster resources used to run the processing job. Fields are documented below.
     * @return builder
     */
    inline def clusterConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringResourcesClusterConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringResourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionMonitoringResourcesClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionNetworkConfigArgs.Builder)
    /**
     * @param vpcConfig VPC that SageMaker jobs, hosted models, and compute resources have access to. Fields are documented below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionNetworkConfigVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigMonitoringJobDefinitionNetworkConfigVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.MonitoringScheduleState.Builder)
    /**
     * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
     * @return builder
     */
    inline def monitoringScheduleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.MonitoringScheduleState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.MonitoringScheduleMonitoringScheduleConfigArgs.builder
      builder.monitoringScheduleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.NotebookInstanceState.Builder)
    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the notebook instance. Conflicts with `instanceMetadataServiceConfiguration`. see details below.
     * @return builder
     */
    inline def instanceMetadataServiceConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.NotebookInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.NotebookInstanceInstanceMetadataServiceConfigurationArgs.builder
      builder.instanceMetadataServiceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.PipelineState.Builder)
    /**
     * @param parallelismConfiguration This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
     * @return builder
     */
    inline def parallelismConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelineParallelismConfigurationArgs.builder
      builder.parallelismConfiguration(args(argsBuilder).build)

    /**
     * @param pipelineDefinitionS3Location The location of the pipeline definition stored in Amazon S3. If specified, SageMaker AI will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
     * @return builder
     */
    inline def pipelineDefinitionS3Location(args: Endofunction[com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.PipelinePipelineDefinitionS3LocationArgs.builder
      builder.pipelineDefinitionS3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder)
    /**
     * @param provisioningParameters A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * @return builder
     */
    inline def provisioningParameters(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs.builder
      builder.provisioningParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.ProjectState.Builder)
    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * @return builder
     */
    inline def serviceCatalogProvisioningDetails(args: Endofunction[com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs.builder
      builder.serviceCatalogProvisioningDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder)
    /**
     * @param codeEditorAppSettings The Code Editor application settings. See `codeEditorAppSettings` Block below.
     * @return builder
     */
    inline def codeEditorAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.builder
      builder.codeEditorAppSettings(args(argsBuilder).build)

    /**
     * @param customFileSystems A file system, created by you, that you assign to a space for an Amazon SageMaker AI Domain. See `customFileSystem` Block below.
     * @return builder
     */
    inline def customFileSystems(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.builder
      builder.customFileSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See `jupyterLabAppSettings` Block below.
     * @return builder
     */
    inline def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See `jupyterServerAppSettings` Block below.
     * @return builder
     */
    inline def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See `kernelGatewayAppSettings` Block below.
     * @return builder
     */
    inline def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings. See `spaceStorageSettings` Block below.
     * @return builder
     */
    inline def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. See `idleSettings` Block below.
     * @return builder
     */
    inline def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle of JupyterLab applications in a space. See `appLifecycleManagement` Block below.
     * @return builder
     */
    inline def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.Builder)
    /**
     * @param efsFileSystem A custom file system in Amazon EFS. See `efsFileSystem` Block below.
     * @return builder
     */
    inline def efsFileSystem(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemEfsFileSystemArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsCustomFileSystemEfsFileSystemArgs.builder
      builder.efsFileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. See `idleSettings` Block below.
     * @return builder
     */
    inline def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle of JupyterLab applications in a space. See `appLifecycleManagement` Block below.
     * @return builder
     */
    inline def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterLab application. See `codeRepository` Block below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. See `codeRepository` Block below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. See `customImage` Block below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. See `defaultResourceSpec` Block below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param ebsStorageSettings A collection of EBS storage settings for a space. See `ebsStorageSettings` Block below.
     * @return builder
     */
    inline def ebsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsSpaceStorageSettingsEbsStorageSettingsArgs.builder
      builder.ebsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.SpaceState.Builder)
    /**
     * @param ownershipSettings A collection of ownership settings. Required if `spaceSharingSettings` is set. See `ownershipSettings` Block below.
     * @return builder
     */
    inline def ownershipSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceOwnershipSettingsArgs.builder
      builder.ownershipSettings(args(argsBuilder).build)

    /**
     * @param spaceSettings A collection of space settings. See `spaceSettings` Block below.
     * @return builder
     */
    inline def spaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSettingsArgs.builder
      builder.spaceSettings(args(argsBuilder).build)

    /**
     * @param spaceSharingSettings A collection of space sharing settings. Required if `ownershipSettings` is set. See `spaceSharingSettings` Block below.
     * @return builder
     */
    inline def spaceSharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.SpaceSpaceSharingSettingsArgs.builder
      builder.spaceSharingSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationArgs.Builder)
    /**
     * @param metricDefinitions List of metric definitions for the training job. Maximum of 40. Use this to extract custom metrics from your own training container logs. SageMaker can still publish built-in metrics for built-in algorithms and supported prebuilt images when this block is omitted. See `metricDefinitions` below.
     * @return builder
     */
    inline def metricDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationMetricDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationMetricDefinitionArgs.builder
      builder.metricDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param trainingImageConfig Training image configuration. See `trainingImageConfig` below.
     * @return builder
     */
    inline def trainingImageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationTrainingImageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationTrainingImageConfigArgs.builder
      builder.trainingImageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationTrainingImageConfigArgs.Builder)
    /**
     * @param trainingRepositoryAuthConfig Authentication configuration for the training image repository. See `trainingRepositoryAuthConfig` below.
     * @return builder
     */
    inline def trainingRepositoryAuthConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationTrainingImageConfigTrainingRepositoryAuthConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationTrainingImageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationTrainingImageConfigTrainingRepositoryAuthConfigArgs.builder
      builder.trainingRepositoryAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigArgs.Builder)
    /**
     * @param collectionConfigurations List of tensor collections to configure for the debug hook. Maximum of 20. See `collectionConfigurations` below.
     * @return builder
     */
    inline def collectionConfigurations(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigCollectionConfigurationArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigCollectionConfigurationArgs.builder
      builder.collectionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigArgs.Builder)
    /**
     * @param dataSource Location of the channel data. See `dataSource` below.
     * @return builder
     */
    inline def dataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceArgs.builder
      builder.dataSource(args(argsBuilder).build)

    /**
     * @param shuffleConfig Configuration for shuffling data in the channel. See `shuffleConfig` below.
     * @return builder
     */
    inline def shuffleConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigShuffleConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigShuffleConfigArgs.builder
      builder.shuffleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceArgs.Builder)
    /**
     * @param fileSystemDataSource File system data source. See `fileSystemDataSource` below.
     * @return builder
     */
    inline def fileSystemDataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceFileSystemDataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceFileSystemDataSourceArgs.builder
      builder.fileSystemDataSource(args(argsBuilder).build)

    /**
     * @param s3DataSource S3 data source. See `s3DataSource` below.
     * @return builder
     */
    inline def s3DataSource(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceArgs.builder
      builder.s3DataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceArgs.Builder)
    /**
     * @param hubAccessConfig SageMaker AI Hub access configuration. See `hubAccessConfig` below.
     * @return builder
     */
    inline def hubAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceHubAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceHubAccessConfigArgs.builder
      builder.hubAccessConfig(args(argsBuilder).build)

    /**
     * @param modelAccessConfig Model access configuration. See `modelAccessConfig` below.
     * @return builder
     */
    inline def modelAccessConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceModelAccessConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigDataSourceS3DataSourceModelAccessConfigArgs.builder
      builder.modelAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigArgs.Builder)
    /**
     * @param instanceGroups List of instance groups for heterogeneous cluster training. Maximum of 5. Conflicts with `instanceCount`, `instanceType`, and `keepAlivePeriodInSeconds`. See `instanceGroups` below.
     * @return builder
     */
    inline def instanceGroups(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstanceGroupArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstanceGroupArgs.builder
      builder.instanceGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param instancePlacementConfig Instance placement configuration. See `instancePlacementConfig` below.
     * @return builder
     */
    inline def instancePlacementConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstancePlacementConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstancePlacementConfigArgs.builder
      builder.instancePlacementConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstancePlacementConfigArgs.Builder)
    /**
     * @param placementSpecifications Placement specifications for instance placement. See `placementSpecifications` below.
     * @return builder
     */
    inline def placementSpecifications(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstancePlacementConfigPlacementSpecificationArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstancePlacementConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigInstancePlacementConfigPlacementSpecificationArgs.builder
      builder.placementSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder)
    /**
     * @param algorithmSpecification Algorithm-related parameters of the training job. See `algorithmSpecification` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def algorithmSpecification(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobAlgorithmSpecificationArgs.builder
      builder.algorithmSpecification(args(argsBuilder).build)

    /**
     * @param checkpointConfig Location of checkpoints during training. See `checkpointConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def checkpointConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobCheckpointConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobCheckpointConfigArgs.builder
      builder.checkpointConfig(args(argsBuilder).build)

    /**
     * @param debugHookConfig Configuration for debugging rules. See `debugHookConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def debugHookConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobDebugHookConfigArgs.builder
      builder.debugHookConfig(args(argsBuilder).build)

    /**
     * @param debugRuleConfigurations List of debug rule configurations. Maximum of 20. See `debugRuleConfigurations` below.
     * @return builder
     */
    inline def debugRuleConfigurations(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobDebugRuleConfigurationArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobDebugRuleConfigurationArgs.builder
      builder.debugRuleConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param experimentConfig Associates a SageMaker AI Experiment or Trial to the training job. See `experimentConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def experimentConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobExperimentConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobExperimentConfigArgs.builder
      builder.experimentConfig(args(argsBuilder).build)

    /**
     * @param infraCheckConfig Infrastructure health check configuration. See `infraCheckConfig` below.
     * @return builder
     */
    inline def infraCheckConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInfraCheckConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInfraCheckConfigArgs.builder
      builder.infraCheckConfig(args(argsBuilder).build)

    /**
     * @param inputDataConfigs List of input data channel configurations for the training job. Maximum of 20. See `inputDataConfig` below.
     * @return builder
     */
    inline def inputDataConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobInputDataConfigArgs.builder
      builder.inputDataConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param mlflowConfig MLflow integration configuration. See `mlflowConfig` below.
     * @return builder
     */
    inline def mlflowConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobMlflowConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobMlflowConfigArgs.builder
      builder.mlflowConfig(args(argsBuilder).build)

    /**
     * @param modelPackageConfig Model package configuration. Requires `serverlessJobConfig`. See `modelPackageConfig` below.
     * @return builder
     */
    inline def modelPackageConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobModelPackageConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobModelPackageConfigArgs.builder
      builder.modelPackageConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Location of the output data from the training job. See `outputDataConfig` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def outputDataConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobOutputDataConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    /**
     * @param profilerConfig Configuration for the profiler. See `profilerConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def profilerConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerConfigArgs.builder
      builder.profilerConfig(args(argsBuilder).build)

    /**
     * @param profilerRuleConfigurations List of profiler rule configurations. Maximum of 20. See `profilerRuleConfigurations` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def profilerRuleConfigurations(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerRuleConfigurationArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobProfilerRuleConfigurationArgs.builder
      builder.profilerRuleConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteDebugConfig Configuration for remote debugging. See `remoteDebugConfig` below.
     * @return builder
     */
    inline def remoteDebugConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobRemoteDebugConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobRemoteDebugConfigArgs.builder
      builder.remoteDebugConfig(args(argsBuilder).build)

    /**
     * @param resourceConfig Resources for the training job, including compute instances and storage volumes. See `resourceConfig` below.
     * @return builder
     */
    inline def resourceConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobResourceConfigArgs.builder
      builder.resourceConfig(args(argsBuilder).build)

    /**
     * @param retryStrategy Number of times to retry the job if it fails. See `retryStrategy` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def retryStrategy(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobRetryStrategyArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobRetryStrategyArgs.builder
      builder.retryStrategy(args(argsBuilder).build)

    /**
     * @param serverlessJobConfig Configuration for serverless training jobs using foundation models. Conflicts with `algorithmSpecification`, `enableManagedSpotTraining`, `environment`, `retryStrategy`, `checkpointConfig`, `debugHookConfig`, `experimentConfig`, `profilerConfig`, `profilerRuleConfigurations`, and `tensorBoardOutputConfig`. See `serverlessJobConfig` below.
     * @return builder
     */
    inline def serverlessJobConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobServerlessJobConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobServerlessJobConfigArgs.builder
      builder.serverlessJobConfig(args(argsBuilder).build)

    /**
     * @param sessionChainingConfig Configuration for session tag chaining. See `sessionChainingConfig` below.
     * @return builder
     */
    inline def sessionChainingConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobSessionChainingConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobSessionChainingConfigArgs.builder
      builder.sessionChainingConfig(args(argsBuilder).build)

    inline def stoppingCondition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobStoppingConditionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobStoppingConditionArgs.builder
      builder.stoppingCondition(args(argsBuilder).build)

    /**
     * @param tensorBoardOutputConfig Configuration for TensorBoard output. See `tensorBoardOutputConfig` below. Conflicts with `serverlessJobConfig`.
     * @return builder
     */
    inline def tensorBoardOutputConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobTensorBoardOutputConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobTensorBoardOutputConfigArgs.builder
      builder.tensorBoardOutputConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobTimeoutsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig VPC configuration for the training job. See `vpcConfig` below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.TrainingJobVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.TrainingJobState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.TrainingJobVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileState.Builder)
    /**
     * @param userSettings The user settings. See User Settings below.
     * @return builder
     */
    inline def userSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.builder
      builder.userSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder)
    /**
     * @param canvasAppSettings The Canvas app settings. See Canvas App Settings below.
     * @return builder
     */
    inline def canvasAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.builder
      builder.canvasAppSettings(args(argsBuilder).build)

    /**
     * @param codeEditorAppSettings The Code Editor application settings. See Code Editor App Settings below.
     * @return builder
     */
    inline def codeEditorAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.builder
      builder.codeEditorAppSettings(args(argsBuilder).build)

    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user profile. Permitted users can access this file system in Amazon SageMaker AI Studio. See Custom File System Config below.
     * @return builder
     */
    inline def customFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.builder
      builder.customFileSystemConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system operations. See Custom POSIX User Config below.
     * @return builder
     */
    inline def customPosixUserConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomPosixUserConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomPosixUserConfigArgs.builder
      builder.customPosixUserConfig(args(argsBuilder).build)

    /**
     * @param jupyterLabAppSettings The settings for the JupyterLab application. See Jupyter Lab App Settings below.
     * @return builder
     */
    inline def jupyterLabAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.builder
      builder.jupyterLabAppSettings(args(argsBuilder).build)

    /**
     * @param jupyterServerAppSettings The Jupyter server&#39;s app settings. See Jupyter Server App Settings below.
     * @return builder
     */
    inline def jupyterServerAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.builder
      builder.jupyterServerAppSettings(args(argsBuilder).build)

    /**
     * @param kernelGatewayAppSettings The kernel gateway app settings. See Kernel Gateway App Settings below.
     * @return builder
     */
    inline def kernelGatewayAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.builder
      builder.kernelGatewayAppSettings(args(argsBuilder).build)

    /**
     * @param rSessionAppSettings The RSession app settings. See RSession App Settings below.
     * @return builder
     */
    inline def rSessionAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.builder
      builder.rSessionAppSettings(args(argsBuilder).build)

    /**
     * @param rStudioServerProAppSettings A collection of settings that configure user interaction with the RStudioServerPro app. See RStudioServerProAppSettings below.
     * @return builder
     */
    inline def rStudioServerProAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRStudioServerProAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRStudioServerProAppSettingsArgs.builder
      builder.rStudioServerProAppSettings(args(argsBuilder).build)

    /**
     * @param sharingSettings The sharing settings. See Sharing Settings below.
     * @return builder
     */
    inline def sharingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSharingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSharingSettingsArgs.builder
      builder.sharingSettings(args(argsBuilder).build)

    /**
     * @param spaceStorageSettings The storage settings for a private space. See Space Storage Settings below.
     * @return builder
     */
    inline def spaceStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.builder
      builder.spaceStorageSettings(args(argsBuilder).build)

    /**
     * @param studioWebPortalSettings The Studio Web Portal settings. See `studioWebPortalSettings` Block below.
     * @return builder
     */
    inline def studioWebPortalSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsStudioWebPortalSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsStudioWebPortalSettingsArgs.builder
      builder.studioWebPortalSettings(args(argsBuilder).build)

    /**
     * @param tensorBoardAppSettings The TensorBoard app settings. See TensorBoard App Settings below.
     * @return builder
     */
    inline def tensorBoardAppSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.builder
      builder.tensorBoardAppSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder)
    /**
     * @param directDeploySettings The model deployment settings for the SageMaker AI Canvas application. See Direct Deploy Settings below.
     * @return builder
     */
    inline def directDeploySettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsDirectDeploySettingsArgs.builder
      builder.directDeploySettings(args(argsBuilder).build)

    /**
     * @param emrServerlessSettings The settings for running Amazon EMR Serverless jobs in SageMaker AI Canvas. See `emrServerlessSettings` Block below.
     * @return builder
     */
    inline def emrServerlessSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsEmrServerlessSettingsArgs.builder
      builder.emrServerlessSettings(args(argsBuilder).build)

    inline def generativeAiSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsGenerativeAiSettingsArgs.builder
      builder.generativeAiSettings(args(argsBuilder).build)

    /**
     * @param identityProviderOauthSettings The settings for connecting to an external data source with OAuth. See Identity Provider OAuth Settings below.
     * @return builder
     */
    inline def identityProviderOauthSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsIdentityProviderOauthSettingArgs.builder
      builder.identityProviderOauthSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param kendraSettings The settings for document querying. See Kendra Settings below.
     * @return builder
     */
    inline def kendraSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsKendraSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsKendraSettingsArgs.builder
      builder.kendraSettings(args(argsBuilder).build)

    /**
     * @param modelRegisterSettings The model registry settings for the SageMaker AI Canvas application. See Model Register Settings below.
     * @return builder
     */
    inline def modelRegisterSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsModelRegisterSettingsArgs.builder
      builder.modelRegisterSettings(args(argsBuilder).build)

    /**
     * @param timeSeriesForecastingSettings Time series forecast settings for the Canvas app. See Time Series Forecasting Settings below.
     * @return builder
     */
    inline def timeSeriesForecastingSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs.builder
      builder.timeSeriesForecastingSettings(args(argsBuilder).build)

    /**
     * @param workspaceSettings The workspace settings for the SageMaker AI Canvas application. See Workspace Settings below.
     * @return builder
     */
    inline def workspaceSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsWorkspaceSettingsArgs.builder
      builder.workspaceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    inline def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    inline def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a CodeEditor app. see Custom Image below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCodeEditorAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.Builder)
    /**
     * @param efsFileSystemConfigs The default EBS storage settings for a private space. See EFS File System Config below.
     * @return builder
     */
    inline def efsFileSystemConfigs(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCustomFileSystemConfigEfsFileSystemConfigArgs.builder
      builder.efsFileSystemConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder)
    /**
     * @param idleSettings Settings related to idle shutdown of Studio applications. see `idleSettings` Block below.
     * @return builder
     */
    inline def idleSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementIdleSettingsArgs.builder
      builder.idleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder)
    /**
     * @param appLifecycleManagement Indicates whether idle shutdown is activated for JupyterLab applications. see `appLifecycleManagement` Block below.
     * @return builder
     */
    inline def appLifecycleManagement(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsAppLifecycleManagementArgs.builder
      builder.appLifecycleManagement(args(argsBuilder).build)

    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

    /**
     * @param emrSettings The configuration parameters that specify the IAM roles assumed by the execution role of SageMaker AI (assumable roles) and the cluster instances or job execution environments (execution roles or runtime roles) to manage and access resources required for running Amazon EMR clusters or Amazon EMR Serverless applications. see `emrSettings` Block below.
     * @return builder
     */
    inline def emrSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsEmrSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterLabAppSettingsEmrSettingsArgs.builder
      builder.emrSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder)
    /**
     * @param codeRepositories A list of Git repositories that SageMaker AI automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * @return builder
     */
    inline def codeRepositories(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsCodeRepositoryArgs.builder
      builder.codeRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see Custom Image below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder)
    /**
     * @param customImages A list of custom SageMaker AI images that are configured to run as a KernelGateway app. see Custom Image below.
     * @return builder
     */
    inline def customImages(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsCustomImageArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsCustomImageArgs.builder
      builder.customImages(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsRSessionAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.Builder)
    /**
     * @param defaultEbsStorageSettings The default EBS storage settings for a private space. See Default EBS Storage Settings below.
     * @return builder
     */
    inline def defaultEbsStorageSettings(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSpaceStorageSettingsDefaultEbsStorageSettingsArgs.builder
      builder.defaultEbsStorageSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.Builder)
    /**
     * @param defaultResourceSpec Default instance type and the ARN of the SageMaker AI image created on the instance. see Default Resource Spec below.
     * @return builder
     */
    inline def defaultResourceSpec(args: Endofunction[com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs.builder
      builder.defaultResourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder)
    /**
     * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidcConfig`. see Cognito Config details below.
     * @return builder
     */
    inline def cognitoConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs.builder
      builder.cognitoConfig(args(argsBuilder).build)

    /**
     * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognitoConfig`. see OIDC Config details below.
     * @return builder
     */
    inline def oidcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs.builder
      builder.oidcConfig(args(argsBuilder).build)

    /**
     * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source IP Config details below.
     * @return builder
     */
    inline def sourceIpConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs.builder
      builder.sourceIpConfig(args(argsBuilder).build)

    /**
     * @param workforceVpcConfig configure a workforce using VPC. see Workforce VPC Config details below.
     * @return builder
     */
    inline def workforceVpcConfig(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkforceState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkforceWorkforceVpcConfigArgs.builder
      builder.workforceVpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder)
    /**
     * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team. See Cognito Member Definition details below.
     * @return builder
     */
    inline def cognitoMemberDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionCognitoMemberDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionCognitoMemberDefinitionArgs.builder
      builder.cognitoMemberDefinition(args(argsBuilder).build)

    /**
     * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a single private work team. See Cognito Member Definition details below.
     * @return builder
     */
    inline def oidcMemberDefinition(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionOidcMemberDefinitionArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionOidcMemberDefinitionArgs.builder
      builder.oidcMemberDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder)
    /**
     * @param memberDefinitions A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     * @return builder
     */
    inline def memberDefinitions(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.Builder]*):
        com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder =
      def argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs.builder
      builder.memberDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfiguration Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     * @return builder
     */
    inline def notificationConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationArgs.builder
      builder.notificationConfiguration(args(argsBuilder).build)

    /**
     * @param workerAccessConfiguration Use this optional parameter to constrain access to an Amazon S3 resource based on the IP address using supported IAM global condition keys. The Amazon S3 resource is accessed in the worker portal using a Amazon S3 presigned URL. see Worker Access Configuration details below.
     * @return builder
     */
    inline def workerAccessConfiguration(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamState.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.builder
      builder.workerAccessConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder)
    /**
     * @param s3Presign Defines any Amazon S3 resource constraints. see S3 Presign details below.
     * @return builder
     */
    inline def s3Presign(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.builder
      builder.s3Presign(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.Builder)
    /**
     * @param iamPolicyConstraints Use this parameter to specify the allowed request source. Possible sources are either SourceIp or VpcSourceIp. see IAM Policy Constraints details below.
     * @return builder
     */
    inline def iamPolicyConstraints(args: Endofunction[com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignIamPolicyConstraintsArgs.Builder]):
        com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignArgs.Builder =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.WorkteamWorkerAccessConfigurationS3PresignIamPolicyConstraintsArgs.builder
      builder.iamPolicyConstraints(args(argsBuilder).build)
