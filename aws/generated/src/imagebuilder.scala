package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object imagebuilder:
  /** Manages an Image Builder Image Recipe. */
  def ImageRecipe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ImageRecipeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ImageRecipeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.ImageRecipe(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.imagebuilder.ImageArgs.Builder)
    /**
     * @param imageScanningConfiguration Configuration block with image scanning configuration. Detailed below.
     * @return builder
     */
    def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImageArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTestsConfiguration Configuration block with image tests configuration. Detailed below.
     * @return builder
     */
    def imageTestsConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageImageTestsConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImageArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageImageTestsConfigurationArgs.builder
      builder.imageTestsConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block with logging configuration. Detailed below.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImageArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param workflows Configuration block with the workflow configuration. Detailed below.
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageWorkflowArgs.Builder]*):
        com.pulumi.aws.imagebuilder.ImageArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.DistributionConfigurationArgs.Builder)
    /**
     * @param distributions One or more configuration blocks with distribution settings. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def distributions(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder]*):
        com.pulumi.aws.imagebuilder.DistributionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.builder
      builder.distributions(args.map(_(argsBuilder).build)*)

  /** Manages an Image Builder Image. */
  def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ImageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ImageArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.Image(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Image Builder Image Pipeline.
   *  
   *  &gt; **NOTE:** Starting with version `5.74.0`, lifecycle meta-argument `replaceTriggeredBy` must be used in order to prevent a dependency error on destroy.
   *  
   *  #### Required
   *  
   *  - `arn` (String) Amazon Resource Name (ARN) of the Image Builder image pipeline.
   *  
   *  Using `pulumi import`, import `aws.imagebuilder.ImagePipeline` resources using the Amazon Resource Name (ARN). For example:
   *  
   *  ```sh
   *  $ pulumi import aws:imagebuilder/imagePipeline:ImagePipeline example arn:aws:imagebuilder:us-east-1:123456789012:image-pipeline/example
   *  ```
   */
  def ImagePipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ImagePipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.ImagePipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.Builder)
    /**
     * @param instanceMetadataOptions Configuration block with instance metadata options for the HTTP requests that pipeline builds use to launch EC2 build and test instances. Detailed below.
     * @return builder
     */
    def instanceMetadataOptions(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationInstanceMetadataOptionsArgs.Builder]):
        com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationInstanceMetadataOptionsArgs.builder
      builder.instanceMetadataOptions(args(argsBuilder).build)

    /**
     * @param logging Configuration block with logging settings. Detailed below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingArgs.Builder]):
        com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param placement Configuration block with placement settings that define where the instances that are launched from your image will run. Detailed below.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationPlacementArgs.Builder]):
        com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.ImageRecipeArgs.Builder)
    /**
     * @param blockDeviceMappings Configuration block(s) with block device mappings for the image recipe. Detailed below.
     * @return builder
     */
    def blockDeviceMappings(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs.Builder]*):
        com.pulumi.aws.imagebuilder.ImageRecipeArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs.builder
      builder.blockDeviceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
     * @return builder
     */
    def components(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs.Builder]*):
        com.pulumi.aws.imagebuilder.ImageRecipeArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    /**
     * @param systemsManagerAgent Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
     * @return builder
     */
    def systemsManagerAgent(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeSystemsManagerAgentArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImageRecipeArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeSystemsManagerAgentArgs.builder
      builder.systemsManagerAgent(args(argsBuilder).build)

  /** Manages an Image Builder Lifecycle Policy. */
  def LifecyclePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.LifecyclePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.LifecyclePolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.LifecyclePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Image Builder Component. */
  def Component(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ComponentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ComponentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.Component(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ImagebuilderFunctions = com.pulumi.aws.imagebuilder.ImagebuilderFunctions
  object ImagebuilderFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.imagebuilder.ImagebuilderFunctions.*
  extension (self: ImagebuilderFunctions.type)
    /** Provides details about an Image Builder Component. */
    def getComponent(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetComponentResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponent(args(argsBuilder).build)

    /** Provides details about an Image Builder Component. */
    def getComponentPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetComponentResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponentPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Components matching the specified criteria. */
    def getComponents(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetComponentsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentsArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponents(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Components matching the specified criteria. */
    def getComponentsPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetComponentsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentsPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponentsPlain(args(argsBuilder).build)

    /** Provides details about an Image builder Container Recipe. */
    def getContainerRecipe(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipeArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipe(args(argsBuilder).build)

    /** Provides details about an Image builder Container Recipe. */
    def getContainerRecipePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipePlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria. */
    def getContainerRecipes(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipes(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria. */
    def getContainerRecipesPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipesPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Distribution Configuration. */
    def getDistributionConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfiguration(args(argsBuilder).build)

    /** Provides details about an Image Builder Distribution Configuration. */
    def getDistributionConfigurationPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Distribution Configurations matching the specified criteria. */
    def getDistributionConfigurations(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfigurations(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Distribution Configurations matching the specified criteria. */
    def getDistributionConfigurationsPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfigurationsPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Image. */
    def getImage(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImage(args(argsBuilder).build)

    /** Provides details about an Image Builder Image. */
    def getImagePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Pipeline. */
    def getImagePipeline(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelineArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImagePipelineResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelineArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipeline(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Pipeline. */
    def getImagePipelinePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelinePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImagePipelineResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelinePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipelinePlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Pipelines matching the specified criteria. */
    def getImagePipelines(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImagePipelinesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipelines(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Pipelines matching the specified criteria. */
    def getImagePipelinesPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImagePipelinesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipelinesPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Recipe. */
    def getImageRecipe(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImageRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipeArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipe(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Recipe. */
    def getImageRecipePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImageRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipePlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Recipes matching the specified criteria. */
    def getImageRecipes(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImageRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipesArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipes(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Recipes matching the specified criteria. */
    def getImageRecipesPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImageRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipesPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipesPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Infrastructure Configuration. */
    def getInfrastructureConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfiguration(args(argsBuilder).build)

    /** Provides details about an Image Builder Infrastructure Configuration. */
    def getInfrastructureConfigurationPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Infrastructure Configurations matching the specified criteria. */
    def getInfrastructureConfigurations(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfigurations(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Infrastructure Configurations matching the specified criteria. */
    def getInfrastructureConfigurationsPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfigurationsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.LifecyclePolicyArgs.Builder)
    /**
     * @param policyDetails Configuration block with policy details. Detailed below.
     * @return builder
     */
    def policyDetails(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.Builder]*):
        com.pulumi.aws.imagebuilder.LifecyclePolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.builder
      builder.policyDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy applies to. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def resourceSelection(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionArgs.Builder]):
        com.pulumi.aws.imagebuilder.LifecyclePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionArgs.builder
      builder.resourceSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.ContainerRecipeArgs.Builder)
    /**
     * @param components Ordered configuration block(s) with components for the container recipe. Detailed below.
     * @return builder
     */
    def components(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentArgs.Builder]*):
        com.pulumi.aws.imagebuilder.ContainerRecipeArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceConfiguration Configuration block used to configure an instance for building and testing container images. Detailed below.
     * @return builder
     */
    def instanceConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.ContainerRecipeArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param targetRepository The destination repository for the container image. Detailed below.
     * @return builder
     */
    def targetRepository(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeTargetRepositoryArgs.Builder]):
        com.pulumi.aws.imagebuilder.ContainerRecipeArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeTargetRepositoryArgs.builder
      builder.targetRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder)
    /**
     * @param imageScanningConfiguration Configuration block with image scanning configuration. Detailed below.
     * @return builder
     */
    def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTestsConfiguration Configuration block with image tests configuration. Detailed below.
     * @return builder
     */
    def imageTestsConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageTestsConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageTestsConfigurationArgs.builder
      builder.imageTestsConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block with logging configuration. Detailed below.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param schedule Configuration block with schedule settings. Detailed below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineScheduleArgs.Builder]):
        com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param workflows Configuration block with the workflow configuration. Detailed below.
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowArgs.Builder]*):
        com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  /** Manages an Image Builder Container Recipe. */
  def ContainerRecipe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ContainerRecipeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ContainerRecipeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.ContainerRecipe(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Image Builder Infrastructure Configuration. */
  def InfrastructureConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.InfrastructureConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS EC2 Image Builder Workflow.
   *  
   *  &gt; Image Builder manages the workflows for the distribution stage. Therefore, using the DISTRIBUTION workflow type results in an error.
   */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.WorkflowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.WorkflowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.Workflow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Image Builder Distribution Configuration. */
  def DistributionConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.DistributionConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.DistributionConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.imagebuilder.DistributionConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationState.Builder)
    /**
     * @param instanceMetadataOptions Configuration block with instance metadata options for the HTTP requests that pipeline builds use to launch EC2 build and test instances. Detailed below.
     * @return builder
     */
    def instanceMetadataOptions(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationInstanceMetadataOptionsArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationInstanceMetadataOptionsArgs.builder
      builder.instanceMetadataOptions(args(argsBuilder).build)

    /**
     * @param logging Configuration block with logging settings. Detailed below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param placement Configuration block with placement settings that define where the instances that are launched from your image will run. Detailed below.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationPlacementArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailActionArgs.Builder)
    /**
     * @param includeResources Specifies the resources that the lifecycle policy applies to. Detailed below.
     * @return builder
     */
    def includeResources(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailActionIncludeResourcesArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailActionIncludeResourcesArgs.builder
      builder.includeResources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImageState.Builder)
    /**
     * @param imageScanningConfiguration Configuration block with image scanning configuration. Detailed below.
     * @return builder
     */
    def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTestsConfiguration Configuration block with image tests configuration. Detailed below.
     * @return builder
     */
    def imageTestsConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageImageTestsConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageImageTestsConfigurationArgs.builder
      builder.imageTestsConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block with logging configuration. Detailed below.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param outputResources List of objects with resources created by the image.
     * @return builder
     */
    def outputResources(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceArgs.builder
      builder.outputResources(args.map(_(argsBuilder).build)*)

    /**
     * @param workflows Configuration block with the workflow configuration. Detailed below.
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageWorkflowArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentArgs.Builder)
    /**
     * @param parameters Configuration block(s) for parameters to configure the component. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentParameterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationState.Builder)
    /**
     * @param distributions One or more configuration blocks with distribution settings. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def distributions(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.builder
      builder.distributions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder)
    /**
     * @param amiDistributionConfiguration Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
     * @return builder
     */
    def amiDistributionConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs.builder
      builder.amiDistributionConfiguration(args(argsBuilder).build)

    /**
     * @param containerDistributionConfiguration Configuration block with container distribution settings. Detailed below.
     * @return builder
     */
    def containerDistributionConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationArgs.builder
      builder.containerDistributionConfiguration(args(argsBuilder).build)

    /**
     * @param fastLaunchConfigurations Set of Windows faster-launching configurations to use for AMI distribution. Detailed below.
     * @return builder
     */
    def fastLaunchConfigurations(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationArgs.builder
      builder.fastLaunchConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigurations Set of launch template configuration settings that apply to image distribution. Detailed below.
     * @return builder
     */
    def launchTemplateConfigurations(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionLaunchTemplateConfigurationArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionLaunchTemplateConfigurationArgs.builder
      builder.launchTemplateConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param s3ExportConfiguration Configuration block with S3 export settings. Detailed below.
     * @return builder
     */
    def s3ExportConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionS3ExportConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionS3ExportConfigurationArgs.builder
      builder.s3ExportConfiguration(args(argsBuilder).build)

    /**
     * @param ssmParameterConfigurations Configuration block with SSM parameter configuration to use as AMI id output. Detailed below.
     * @return builder
     */
    def ssmParameterConfigurations(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionSsmParameterConfigurationArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionSsmParameterConfigurationArgs.builder
      builder.ssmParameterConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesFilterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.GetImageRecipesArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipesFilterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.GetImageRecipesArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesAmisArgs.Builder)
    /**
     * @param lastLaunched Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle actions. Detailed below.
     * @return builder
     */
    def lastLaunched(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesAmisLastLaunchedArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesAmisArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesAmisLastLaunchedArgs.builder
      builder.lastLaunched(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationArgs.Builder)
    /**
     * @param ecrConfiguration Configuration block with ECR configuration. Detailed below.
     * @return builder
     */
    def ecrConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationEcrConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageImageScanningConfigurationEcrConfigurationArgs.builder
      builder.ecrConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationBlockDeviceMappingArgs.Builder)
    /**
     * @param ebs Configuration block with Elastic Block Storage (EBS) block device mapping settings. Detailed below.
     * @return builder
     */
    def ebs(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationBlockDeviceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs.builder
      builder.ebs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs.Builder)
    /**
     * @param parameters Configuration block(s) for parameters to configure the component. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentParameterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs.Builder)
    /**
     * @param blockDeviceMappings Configuration block(s) with block device mappings for the container recipe. Detailed below.
     * @return builder
     */
    def blockDeviceMappings(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationBlockDeviceMappingArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationBlockDeviceMappingArgs.builder
      builder.blockDeviceMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationArgs.Builder)
    /**
     * @param ecrConfiguration Configuration block with ECR configuration for image scanning. Detailed below.
     * @return builder
     */
    def ecrConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationEcrConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationEcrConfigurationArgs.builder
      builder.ecrConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs.Builder)
    /**
     * @param launchPermission Configuration block of EC2 launch permissions to apply to the distributed AMI. Detailed below.
     * @return builder
     */
    def launchPermission(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionArgs.builder
      builder.launchPermission(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowArgs.Builder)
    /**
     * @param parameters Configuration block for the workflow parameters. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowParameterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationArgs.Builder)
    /**
     * @param targetRepository Configuration block with the destination repository for the container distribution configuration.
     * @return builder
     */
    def targetRepository(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryArgs.builder
      builder.targetRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingArgs.Builder)
    /**
     * @param s3Logs Configuration block with S3 logging settings. Detailed below.
     * @return builder
     */
    def s3Logs(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingS3LogsArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingS3LogsArgs.builder
      builder.s3Logs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImagePipelineState.Builder)
    /**
     * @param imageScanningConfiguration Configuration block with image scanning configuration. Detailed below.
     * @return builder
     */
    def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImagePipelineState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTestsConfiguration Configuration block with image tests configuration. Detailed below.
     * @return builder
     */
    def imageTestsConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageTestsConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImagePipelineState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineImageTestsConfigurationArgs.builder
      builder.imageTestsConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block with logging configuration. Detailed below.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImagePipelineState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param schedule Configuration block with schedule settings. Detailed below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineScheduleArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImagePipelineState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param workflows Configuration block with the workflow configuration. Detailed below.
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImagePipelineState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImagePipelineWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsFilterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesFilterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationArgs.Builder)
    /**
     * @param launchTemplate Configuration block for the launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create pre-provisioned snapshots. Detailed below.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param snapshotConfiguration Configuration block for managing the number of snapshots that are created from pre-provisioned instances for the Windows AMI when faster launching is enabled. Detailed below.
     * @return builder
     */
    def snapshotConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfigurationArgs.builder
      builder.snapshotConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs.Builder)
    /**
     * @param ebs Configuration block with Elastic Block Storage (EBS) block device mapping settings. Detailed below.
     * @return builder
     */
    def ebs(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingEbsArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingEbsArgs.builder
      builder.ebs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyState.Builder)
    /**
     * @param policyDetails Configuration block with policy details. Detailed below.
     * @return builder
     */
    def policyDetails(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.builder
      builder.policyDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy applies to. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def resourceSelection(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionArgs.builder
      builder.resourceSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImageWorkflowArgs.Builder)
    /**
     * @param parameters Configuration block for the workflow parameters. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageWorkflowParameterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageWorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageWorkflowParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionArgs.Builder)
    /**
     * @param recipes A list of recipe that are used as selection criteria for the output images that the lifecycle policy applies to. Detailed below.
     * @return builder
     */
    def recipes(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionRecipeArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyResourceSelectionRecipeArgs.builder
      builder.recipes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceArgs.Builder)
    /**
     * @param amis Set of objects with each Amazon Machine Image (AMI) created.
     * @return builder
     */
    def amis(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceAmiArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceAmiArgs.builder
      builder.amis(args.map(_(argsBuilder).build)*)

    /**
     * @param containers Set of objects with each container image created and stored in the output repository.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceContainerArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageOutputResourceContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ContainerRecipeState.Builder)
    /**
     * @param components Ordered configuration block(s) with components for the container recipe. Detailed below.
     * @return builder
     */
    def components(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ContainerRecipeState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceConfiguration Configuration block used to configure an instance for building and testing container images. Detailed below.
     * @return builder
     */
    def instanceConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ContainerRecipeState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs.builder
      builder.instanceConfiguration(args(argsBuilder).build)

    /**
     * @param targetRepository The destination repository for the container image. Detailed below.
     * @return builder
     */
    def targetRepository(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ContainerRecipeTargetRepositoryArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ContainerRecipeState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ContainerRecipeTargetRepositoryArgs.builder
      builder.targetRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsFilterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.GetComponentsArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentsFilterArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.GetComponentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.Builder)
    /**
     * @param action Configuration details for the policy action.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailActionArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param exclusionRules Additional rules to specify resources that should be exempt from policy actions.
     * @return builder
     */
    def exclusionRules(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesArgs.builder
      builder.exclusionRules(args(argsBuilder).build)

    /**
     * @param filter Specifies the resources that the lifecycle policy applies to.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailFilterArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.ImageRecipeState.Builder)
    /**
     * @param blockDeviceMappings Configuration block(s) with block device mappings for the image recipe. Detailed below.
     * @return builder
     */
    def blockDeviceMappings(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageRecipeState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs.builder
      builder.blockDeviceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
     * @return builder
     */
    def components(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs.Builder]*):
        com.pulumi.aws.imagebuilder.inputs.ImageRecipeState.Builder =
      def argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    /**
     * @param systemsManagerAgent Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
     * @return builder
     */
    def systemsManagerAgent(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.ImageRecipeSystemsManagerAgentArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.ImageRecipeState.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.ImageRecipeSystemsManagerAgentArgs.builder
      builder.systemsManagerAgent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesArgs.Builder)
    /**
     * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle action. Detailed below.
     * @return builder
     */
    def amis(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesAmisArgs.Builder]):
        com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesArgs.Builder =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.LifecyclePolicyPolicyDetailExclusionRulesAmisArgs.builder
      builder.amis(args(argsBuilder).build)
