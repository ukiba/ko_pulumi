package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object imagebuilder:
  /** Manages an Image Builder Component. */
  def Component(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ComponentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ComponentArgs.builder
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
    com.pulumi.aws.imagebuilder.Component(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Image Builder Container Recipe. */
  def ContainerRecipe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ContainerRecipeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ContainerRecipeArgs.builder
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
    com.pulumi.aws.imagebuilder.ContainerRecipe(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Image Builder Distribution Configuration. */
  def DistributionConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.DistributionConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.DistributionConfigurationArgs.builder
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
    com.pulumi.aws.imagebuilder.DistributionConfiguration(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Image Builder Image. */
  def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ImageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ImageArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.imagebuilder.Image(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an Image Builder Image Pipeline.
   * 
   * &gt; **NOTE:** Starting with version `5.74.0`, lifecycle meta-argument `replaceTriggeredBy` must be used in order to prevent a dependency error on destroy.
   * 
   * #### Required
   * 
   * - `arn` (String) ARN of the Image Builder image pipeline.
   * 
   * Using `pulumi import`, import `aws.imagebuilder.ImagePipeline` resources using the ARN. For example:
   * 
   * ```sh
   * \$ pulumi import aws:imagebuilder/imagePipeline:ImagePipeline example arn:aws:imagebuilder:us-east-1:123456789012:image-pipeline/example
   * ```
   */
  def ImagePipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ImagePipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ImagePipelineArgs.builder
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
    com.pulumi.aws.imagebuilder.ImagePipeline(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Image Builder Image Recipe. */
  def ImageRecipe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.ImageRecipeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.ImageRecipeArgs.builder
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
    com.pulumi.aws.imagebuilder.ImageRecipe(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object ImagebuilderFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an Image Builder Component. */
    inline def getComponent(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetComponentResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponent(args(argsBuilder).build)

    /** Provides details about an Image Builder Component. */
    inline def getComponentPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetComponentResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponentPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Components matching the specified criteria. */
    inline def getComponents(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetComponentsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentsArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponents(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Components matching the specified criteria. */
    inline def getComponentsPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetComponentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetComponentsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetComponentsPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getComponentsPlain(args(argsBuilder).build)

    /** Provides details about an Image builder Container Recipe. */
    inline def getContainerRecipe(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipeArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipe(args(argsBuilder).build)

    /** Provides details about an Image builder Container Recipe. */
    inline def getContainerRecipePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipePlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria. */
    inline def getContainerRecipes(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipes(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria. */
    inline def getContainerRecipesPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetContainerRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getContainerRecipesPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Distribution Configuration. */
    inline def getDistributionConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfiguration(args(argsBuilder).build)

    /** Provides details about an Image Builder Distribution Configuration. */
    inline def getDistributionConfigurationPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Distribution Configurations matching the specified criteria. */
    inline def getDistributionConfigurations(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfigurations(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Distribution Configurations matching the specified criteria. */
    inline def getDistributionConfigurationsPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getDistributionConfigurationsPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Image. */
    inline def getImage(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImage(args(argsBuilder).build)

    /** Provides details about an Image Builder Image. */
    inline def getImagePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Pipeline. */
    inline def getImagePipeline(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelineArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImagePipelineResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelineArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipeline(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Pipeline. */
    inline def getImagePipelinePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelinePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImagePipelineResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelinePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipelinePlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Pipelines matching the specified criteria. */
    inline def getImagePipelines(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImagePipelinesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipelines(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Pipelines matching the specified criteria. */
    inline def getImagePipelinesPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImagePipelinesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImagePipelinesPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImagePipelinesPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Recipe. */
    inline def getImageRecipe(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImageRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipeArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipe(args(argsBuilder).build)

    /** Provides details about an Image Builder Image Recipe. */
    inline def getImageRecipePlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImageRecipeResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipePlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipePlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Recipes matching the specified criteria. */
    inline def getImageRecipes(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetImageRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipesArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipes(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Image Recipes matching the specified criteria. */
    inline def getImageRecipesPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetImageRecipesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetImageRecipesResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetImageRecipesPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getImageRecipesPlain(args(argsBuilder).build)

    /** Provides details about an Image Builder Infrastructure Configuration. */
    inline def getInfrastructureConfiguration(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfiguration(args(argsBuilder).build)

    /** Provides details about an Image Builder Infrastructure Configuration. */
    inline def getInfrastructureConfigurationPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Infrastructure Configurations matching the specified criteria. */
    inline def getInfrastructureConfigurations(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfigurations(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Image Builder Infrastructure Configurations matching the specified criteria. */
    inline def getInfrastructureConfigurationsPlain(args: Endofunction[com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationsResult] =
      val argsBuilder = com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsPlainArgs.builder
      com.pulumi.aws.imagebuilder.ImagebuilderFunctions.getInfrastructureConfigurationsPlain(args(argsBuilder).build)

  /** Manages an Image Builder Infrastructure Configuration. */
  def InfrastructureConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.builder
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
    com.pulumi.aws.imagebuilder.InfrastructureConfiguration(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Image Builder Lifecycle Policy. */
  def LifecyclePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.LifecyclePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.LifecyclePolicyArgs.builder
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
    com.pulumi.aws.imagebuilder.LifecyclePolicy(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS EC2 Image Builder Workflow.
   * 
   * &gt; Image Builder manages the workflows for the distribution stage. Therefore, using the DISTRIBUTION workflow type results in an error.
   */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.imagebuilder.WorkflowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.imagebuilder.WorkflowArgs.builder
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
    com.pulumi.aws.imagebuilder.Workflow(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
