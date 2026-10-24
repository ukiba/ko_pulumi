package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object ecr:
  /** Provides a resource to manage AWS ECR account settings */
  def AccountSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.AccountSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecr.AccountSettingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.ecr.AccountSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object EcrFunctions:
    /** The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository. */
    inline def getAuthorizationToken(args: Endofunction[com.pulumi.aws.ecr.inputs.GetAuthorizationTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetAuthorizationTokenArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getAuthorizationToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository. */
    inline def getAuthorizationTokenPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetAuthorizationTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetAuthorizationTokenPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getAuthorizationTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getCredentials(args: Endofunction[com.pulumi.aws.ecr.inputs.GetCredentialsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetCredentialsResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetCredentialsArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getCredentials(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getCredentialsPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetCredentialsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetCredentialsResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetCredentialsPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getCredentialsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved. */
    inline def getImage(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImageArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved. */
    inline def getImagePlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The ECR Images data source allows the list of images in a specified repository to be retrieved. */
    inline def getImages(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImagesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImagesArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImages(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The ECR Images data source allows the list of images in a specified repository to be retrieved. */
    inline def getImagesPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImagesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImagesPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImagesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Generates an ECR lifecycle policy document in JSON format. Can be used with resources such as the `aws.ecr.LifecyclePolicy` resource.
     * 
     * &gt; For more information about building AWS ECR lifecycle policy documents, see the [AWS ECR Lifecycle Policy Document Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html).
     */
    inline def getLifecyclePolicyDocument(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetLifecyclePolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getLifecyclePolicyDocument(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Generates an ECR lifecycle policy document in JSON format. Can be used with resources such as the `aws.ecr.LifecyclePolicy` resource.
     * 
     * &gt; For more information about building AWS ECR lifecycle policy documents, see the [AWS ECR Lifecycle Policy Document Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html).
     */
    inline def getLifecyclePolicyDocumentPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetLifecyclePolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getLifecyclePolicyDocumentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The ECR Pull Through Cache Rule data source allows the upstream registry URL and registry ID to be retrieved for a Pull Through Cache Rule. */
    inline def getPullThroughCacheRule(args: Endofunction[com.pulumi.aws.ecr.inputs.GetPullThroughCacheRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetPullThroughCacheRuleResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetPullThroughCacheRuleArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getPullThroughCacheRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The ECR Pull Through Cache Rule data source allows the upstream registry URL and registry ID to be retrieved for a Pull Through Cache Rule. */
    inline def getPullThroughCacheRulePlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetPullThroughCacheRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetPullThroughCacheRuleResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetPullThroughCacheRulePlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getPullThroughCacheRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for providing information on AWS ECR (Elastic Container Registry) Repositories. */
    inline def getRepositories(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetRepositoriesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoriesArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositories(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for providing information on AWS ECR (Elastic Container Registry) Repositories. */
    inline def getRepositoriesPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetRepositoriesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoriesPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository. */
    inline def getRepository(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepository(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository. */
    inline def getRepositoryPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The ECR Repository Creation Template data source allows the template details to be retrieved for a Repository Creation Template. */
    inline def getRepositoryCreationTemplate(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetRepositoryCreationTemplateResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplateArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoryCreationTemplate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The ECR Repository Creation Template data source allows the template details to be retrieved for a Repository Creation Template. */
    inline def getRepositoryCreationTemplatePlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetRepositoryCreationTemplateResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplatePlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoryCreationTemplatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an ECR repository lifecycle policy.
   * 
   * &gt; **NOTE:** Only one `aws.ecr.LifecyclePolicy` resource can be used with the same ECR repository. To apply multiple rules, they must be combined in the `policy` JSON.
   * 
   * &gt; **NOTE:** The AWS ECR API seems to reorder rules based on `rulePriority`. If you define multiple rules that are not sorted in ascending `rulePriority` order in the this provider code, the resource will be flagged for recreation every deployment.
   */
  def LifecyclePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.LifecyclePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.LifecyclePolicyArgs.builder
    com.pulumi.aws.ecr.LifecyclePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Elastic Container Registry Pull Through Cache Rule.
   * 
   * More information about pull through cache rules, including the set of supported
   * upstream repositories, see [Using pull through cache rules](https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html).
   */
  def PullThroughCacheRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.PullThroughCacheRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.PullThroughCacheRuleArgs.builder
    com.pulumi.aws.ecr.PullThroughCacheRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS ECR (Elastic Container Registry) Pull Time Update Exclusion. */
  def PullTimeUpdateExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.PullTimeUpdateExclusionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.PullTimeUpdateExclusionArgs.builder
    com.pulumi.aws.ecr.PullTimeUpdateExclusion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Elastic Container Registry Policy.
   * 
   * &gt; **NOTE on ECR Registry Policies:** While the AWS Management Console interface may suggest the ability to define multiple policies by creating multiple statements, ECR registry policies are effectively managed as singular entities at the regional level by the AWS APIs. Therefore, the `aws.ecr.RegistryPolicy` resource should be configured only once per region with all necessary statements defined in the same policy. Attempting to define multiple `aws.ecr.RegistryPolicy` resources may result in perpetual differences, with one policy overriding another.
   */
  def RegistryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RegistryPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.RegistryPolicyArgs.builder
    com.pulumi.aws.ecr.RegistryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic Container Registry Scanning Configuration. Can&#39;t be completely deleted, instead reverts to the default `BASIC` scanning configuration without rules. */
  def RegistryScanningConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.builder
    com.pulumi.aws.ecr.RegistryScanningConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic Container Registry Replication Configuration. */
  def ReplicationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.ReplicationConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.ReplicationConfigurationArgs.builder
    com.pulumi.aws.ecr.ReplicationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic Container Registry Repository. */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RepositoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecr.RepositoryArgs.builder
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
    com.pulumi.aws.ecr.Repository(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic Container Registry Repository Creation Template. */
  def RepositoryCreationTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.builder
    com.pulumi.aws.ecr.RepositoryCreationTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Elastic Container Registry Repository Policy.
   * 
   * Note that currently only one policy may be applied to a repository.
   */
  def RepositoryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RepositoryPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecr.RepositoryPolicyArgs.builder
    com.pulumi.aws.ecr.RepositoryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
