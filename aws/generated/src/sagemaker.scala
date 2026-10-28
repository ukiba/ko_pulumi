package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object sagemaker:
  /** Manages an AWS SageMaker AI Algorithm. */
  inline def Algorithm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.AlgorithmArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.AlgorithmArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Algorithm(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI App resource. */
  inline def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.AppArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.AppArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.App(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI App Image Config resource. */
  inline def AppImageConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.AppImageConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.AppImageConfigArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.AppImageConfig(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Code Repository resource. */
  inline def CodeRepository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.CodeRepositoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.CodeRepositoryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.CodeRepository(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI data quality job definition resource. */
  inline def DataQualityJobDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs.builder
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
    com.pulumi.aws.sagemaker.DataQualityJobDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Device resource. */
  inline def Device(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DeviceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sagemaker.DeviceArgs.builder
    com.pulumi.aws.sagemaker.Device(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Device Fleet resource. */
  inline def DeviceFleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DeviceFleetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.DeviceFleetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.DeviceFleet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Domain resource. */
  inline def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.DomainArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Domain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a SageMaker AI Endpoint resource.
   * 
   * &gt; **Note:** `aws.sagemaker.Endpoint` resources cannot recognize changes to an `aws.sagemaker.EndpointConfiguration` resource unless the Endpoint Configuration&#39;s `name` attribute, changes. Endpoint Configuration names should be randomized by either specifying `namePrefix` or specifying no name. This will automatically change the name when the Endpoint Configuration is modified. The Endpoint Configuration&#39;s lifecycle meta-argument `lifecycle.create_before_destroy` should also be set to `true` to prevent conflicts.
   * 
   * ## Import
   * 
   * Using `pulumi import`, import endpoints using the `name`. For example:
   * 
   * ```sh
   * \$ pulumi import aws:sagemaker/endpoint:Endpoint test_endpoint my-endpoint
   * ```
   */
  inline def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.EndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.EndpointArgs.builder
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
    com.pulumi.aws.sagemaker.Endpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a SageMaker AI endpoint configuration resource.
   * 
   * &gt; **Note:** `aws.sagemaker.Endpoint` resources cannot recognize changes to an `aws.sagemaker.EndpointConfiguration` resource unless the Endpoint Configuration&#39;s `name` attribute, changes. Endpoint Configuration names should be randomized by either specifying `namePrefix` or specifying no name. This will automatically change the name when the Endpoint Configuration is modified. The Endpoint Configuration&#39;s lifecycle meta-argument `lifecycle.create_before_destroy` should also be set to `true` to prevent conflicts.
   * 
   * #### Optional
   * 
   * * `accountId` (String) AWS Account where this resource is managed.
   * * `region` (String) Region where this resource is managed.
   * 
   * Using `pulumi import`, import Endpoint Configurations using `name`. For example:
   * 
   * ```sh
   * \$ pulumi import aws:sagemaker/endpointConfiguration:EndpointConfiguration example example-endpoint-config
   * ```
   */
  inline def EndpointConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.EndpointConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.EndpointConfigurationArgs.builder
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
    com.pulumi.aws.sagemaker.EndpointConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Feature Group resource. */
  inline def FeatureGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.FeatureGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.FeatureGroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.FeatureGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Flow Definition resource. */
  inline def FlowDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.FlowDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.FlowDefinitionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.FlowDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Hub resource. */
  inline def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.HubArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.HubArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Hub(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a SageMaker AI Hub Content Reference resource. A hub content reference copies a model from the SageMaker JumpStart public hub into a private hub so that it is accessible to users in that hub. */
  inline def HubContentReference(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.HubContentReferenceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.HubContentReferenceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.HubContentReference(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Human Task UI resource. */
  inline def HumanTaskUI(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.HumanTaskUIArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.HumanTaskUIArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.HumanTaskUI(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS SageMaker AI Hyper Parameter Tuning Job.
   * 
   * &gt; **NOTE:** This resource does not wait for the tuning job to complete before returning. Terraform may complete apply before the job reaches a terminal state.
   */
  inline def HyperParameterTuningJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.HyperParameterTuningJobArgs.builder
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
    com.pulumi.aws.sagemaker.HyperParameterTuningJob(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Image resource. */
  inline def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ImageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ImageArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Image(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Image Version resource. */
  inline def ImageVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ImageVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sagemaker.ImageVersionArgs.builder
    com.pulumi.aws.sagemaker.ImageVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Inference Component resource. An inference component is a SageMaker AI hosting object that you can use to deploy a model to an endpoint. You can optimize resource utilization by tailoring how the required CPU cores, accelerators, and memory are allocated. You can deploy multiple inference components to an endpoint, where each inference component contains one model and the resource utilization needs for that individual model. */
  inline def InferenceComponent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.InferenceComponentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.InferenceComponentArgs.builder
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
    com.pulumi.aws.sagemaker.InferenceComponent(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manage an Amazon SageMaker labeling job. */
  inline def LabelingJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.LabelingJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.LabelingJobArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.LabelingJob(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI MLflow App resource. */
  inline def MlflowApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.MlflowAppArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.MlflowAppArgs.builder
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
    com.pulumi.aws.sagemaker.MlflowApp(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI MLFlow Tracking Server resource. */
  inline def MlflowTrackingServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.MlflowTrackingServerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.MlflowTrackingServerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.MlflowTrackingServer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon SageMaker AI Model. */
  inline def Model(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ModelArgs.builder
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
    com.pulumi.aws.sagemaker.Model(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manage an Amazon SageMaker Model Card. */
  inline def ModelCard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelCardArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ModelCardArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.ModelCard(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manage an Amazon SageMaker Model Card export job. */
  inline def ModelCardExportJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelCardExportJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sagemaker.ModelCardExportJobArgs.builder
    com.pulumi.aws.sagemaker.ModelCardExportJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Model Package Group resource. */
  inline def ModelPackageGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelPackageGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ModelPackageGroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.ModelPackageGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Model Package Group Policy resource. */
  inline def ModelPackageGroupPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ModelPackageGroupPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sagemaker.ModelPackageGroupPolicyArgs.builder
    com.pulumi.aws.sagemaker.ModelPackageGroupPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI monitoring schedule resource. */
  inline def MonitoringSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.MonitoringScheduleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.MonitoringScheduleArgs.builder
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
    com.pulumi.aws.sagemaker.MonitoringSchedule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Notebook Instance resource. */
  inline def NotebookInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.NotebookInstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.NotebookInstanceArgs.builder
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
    com.pulumi.aws.sagemaker.NotebookInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a lifecycle configuration for SageMaker AI Notebook Instances. */
  inline def NotebookInstanceLifecycleConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.NotebookInstanceLifecycleConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.NotebookInstanceLifecycleConfigurationArgs.builder
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
    com.pulumi.aws.sagemaker.NotebookInstanceLifecycleConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Pipeline resource. */
  inline def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.PipelineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.PipelineArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Pipeline(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a SageMaker AI Project resource.
   * 
   *  &gt; Note: If you are trying to use SageMaker AI projects with SageMaker AI studio you will need to add a tag with the key `sagemaker:studio-visibility` with value `true`. For more on requirements to use projects and permission needed see [AWS Docs](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-projects-templates-custom.html).
   */
  inline def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ProjectArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.ProjectArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Project(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SagemakerFunctions:
    /**
     * Get information about prebuilt Amazon SageMaker AI  Docker images.
     * 
     * &gt; **NOTE:** The AWS provider creates a validly constructed `registryPath` but does not verify that the `registryPath` corresponds to an existing image. For example, using a `registryPath` containing an `imageTag` that does not correspond to a Docker image in the ECR repository, will result in an error.
     */
    inline def getPrebuiltEcrImage(args: Endofunction[com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sagemaker.outputs.GetPrebuiltEcrImageResult] =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImageArgs.builder
      com.pulumi.aws.sagemaker.SagemakerFunctions.getPrebuiltEcrImage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about prebuilt Amazon SageMaker AI  Docker images.
     * 
     * &gt; **NOTE:** The AWS provider creates a validly constructed `registryPath` but does not verify that the `registryPath` corresponds to an existing image. For example, using a `registryPath` containing an `imageTag` that does not correspond to a Docker image in the ECR repository, will result in an error.
     */
    inline def getPrebuiltEcrImagePlain(args: Endofunction[com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sagemaker.outputs.GetPrebuiltEcrImageResult] =
      val argsBuilder = com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImagePlainArgs.builder
      com.pulumi.aws.sagemaker.SagemakerFunctions.getPrebuiltEcrImagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker AI projects. */
  inline def ServicecatalogPortfolioStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.ServicecatalogPortfolioStatusArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sagemaker.ServicecatalogPortfolioStatusArgs.builder
    com.pulumi.aws.sagemaker.ServicecatalogPortfolioStatus(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Space resource. */
  inline def Space(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.SpaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.SpaceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Space(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Studio Lifecycle Config resource. */
  inline def StudioLifecycleConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.StudioLifecycleConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.StudioLifecycleConfigArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.StudioLifecycleConfig(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS SageMaker AI Training Job. */
  inline def TrainingJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.TrainingJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.TrainingJobArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.TrainingJob(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI User Profile resource. */
  inline def UserProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.UserProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.UserProfileArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.UserProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Workforce resource. */
  inline def Workforce(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.WorkforceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sagemaker.WorkforceArgs.builder
    com.pulumi.aws.sagemaker.Workforce(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SageMaker AI Workteam resource. */
  inline def Workteam(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sagemaker.WorkteamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sagemaker.WorkteamArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sagemaker.Workteam(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
