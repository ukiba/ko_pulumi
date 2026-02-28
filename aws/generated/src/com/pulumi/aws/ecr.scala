package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ecr:
  type EcrFunctions = com.pulumi.aws.ecr.EcrFunctions
  object EcrFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ecr.EcrFunctions.*
  extension (self: EcrFunctions.type)
    /** The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository. */
    def getAuthorizationToken(args: Endofunction[com.pulumi.aws.ecr.inputs.GetAuthorizationTokenArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetAuthorizationTokenArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getAuthorizationToken(args(argsBuilder).build)

    /** The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository. */
    def getAuthorizationTokenPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetAuthorizationTokenPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetAuthorizationTokenPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getAuthorizationTokenPlain(args(argsBuilder).build)

    /** The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved. */
    def getImage(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImageArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImageArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImage(args(argsBuilder).build)

    /** The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved. */
    def getImagePlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImagePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImagePlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImagePlain(args(argsBuilder).build)

    /** The ECR Images data source allows the list of images in a specified repository to be retrieved. */
    def getImages(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImagesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImagesArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImages(args(argsBuilder).build)

    /** The ECR Images data source allows the list of images in a specified repository to be retrieved. */
    def getImagesPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetImagesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetImagesPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getImagesPlain(args(argsBuilder).build)

    /**
     * Generates an ECR lifecycle policy document in JSON format. Can be used with resources such as the `aws.ecr.LifecyclePolicy` resource.
     *  
     *  &gt; For more information about building AWS ECR lifecycle policy documents, see the [AWS ECR Lifecycle Policy Document Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html).
     */
    def getLifecyclePolicyDocument(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetLifecyclePolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getLifecyclePolicyDocument(args(argsBuilder).build)

    /**
     * Generates an ECR lifecycle policy document in JSON format. Can be used with resources such as the `aws.ecr.LifecyclePolicy` resource.
     *  
     *  &gt; For more information about building AWS ECR lifecycle policy documents, see the [AWS ECR Lifecycle Policy Document Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html).
     */
    def getLifecyclePolicyDocumentPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetLifecyclePolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getLifecyclePolicyDocumentPlain(args(argsBuilder).build)

    /** The ECR Pull Through Cache Rule data source allows the upstream registry URL and registry ID to be retrieved for a Pull Through Cache Rule. */
    def getPullThroughCacheRule(args: Endofunction[com.pulumi.aws.ecr.inputs.GetPullThroughCacheRuleArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetPullThroughCacheRuleResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetPullThroughCacheRuleArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getPullThroughCacheRule(args(argsBuilder).build)

    /** The ECR Pull Through Cache Rule data source allows the upstream registry URL and registry ID to be retrieved for a Pull Through Cache Rule. */
    def getPullThroughCacheRulePlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetPullThroughCacheRulePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetPullThroughCacheRuleResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetPullThroughCacheRulePlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getPullThroughCacheRulePlain(args(argsBuilder).build)

    /** Data source for providing information on AWS ECR (Elastic Container Registry) Repositories. */
    def getRepositories(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoriesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetRepositoriesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoriesArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositories(args(argsBuilder).build)

    /** Data source for providing information on AWS ECR (Elastic Container Registry) Repositories. */
    def getRepositoriesPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoriesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetRepositoriesResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoriesPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoriesPlain(args(argsBuilder).build)

    /** The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository. */
    def getRepository(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepository(args(argsBuilder).build)

    /** The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository. */
    def getRepositoryPlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryPlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoryPlain(args(argsBuilder).build)

    /** The ECR Repository Creation Template data source allows the template details to be retrieved for a Repository Creation Template. */
    def getRepositoryCreationTemplate(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecr.outputs.GetRepositoryCreationTemplateResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplateArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoryCreationTemplate(args(argsBuilder).build)

    /** The ECR Repository Creation Template data source allows the template details to be retrieved for a Repository Creation Template. */
    def getRepositoryCreationTemplatePlain(args: Endofunction[com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecr.outputs.GetRepositoryCreationTemplateResult] =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetRepositoryCreationTemplatePlainArgs.builder
      com.pulumi.aws.ecr.EcrFunctions.getRepositoryCreationTemplatePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.RepositoryArgs.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the repository. See below for schema.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageScanningConfiguration Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
     * @return builder
     */
    def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)

  /** Provides an Elastic Container Registry Scanning Configuration. Can&#39;t be completely deleted, instead reverts to the default `BASIC` scanning configuration without rules. */
  def RegistryScanningConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.builder
    
    com.pulumi.aws.ecr.RegistryScanningConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for any created repositories. See below for schema.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)

  /** Provides a resource to manage AWS ECR account settings */
  def AccountSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.AccountSettingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecr.AccountSettingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ecr.AccountSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.Builder)
    /**
     * @param rules One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Manages an ECR repository lifecycle policy.
   *  
   *  &gt; **NOTE:** Only one `aws.ecr.LifecyclePolicy` resource can be used with the same ECR repository. To apply multiple rules, they must be combined in the `policy` JSON.
   *  
   *  &gt; **NOTE:** The AWS ECR API seems to reorder rules based on `rulePriority`. If you define multiple rules that are not sorted in ascending `rulePriority` order in the this provider code, the resource will be flagged for recreation every deployment.
   */
  def LifecyclePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.LifecyclePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.LifecyclePolicyArgs.builder
    
    com.pulumi.aws.ecr.LifecyclePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Container Registry Policy.
   *  
   *  &gt; **NOTE on ECR Registry Policies:** While the AWS Management Console interface may suggest the ability to define multiple policies by creating multiple statements, ECR registry policies are effectively managed as singular entities at the regional level by the AWS APIs. Therefore, the `aws.ecr.RegistryPolicy` resource should be configured only once per region with all necessary statements defined in the same policy. Attempting to define multiple `aws.ecr.RegistryPolicy` resources may result in perpetual differences, with one policy overriding another.
   */
  def RegistryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RegistryPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.RegistryPolicyArgs.builder
    
    com.pulumi.aws.ecr.RegistryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ecr.LifecyclePolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs. Consider using the `aws.ecr.getLifecyclePolicyDocument` dataSource to generate/manage the JSON document used for the `policy` argument.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.LifecyclePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  /** Manages an AWS ECR (Elastic Container Registry) Pull Time Update Exclusion. */
  def PullTimeUpdateExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.PullTimeUpdateExclusionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.PullTimeUpdateExclusionArgs.builder
    
    com.pulumi.aws.ecr.PullTimeUpdateExclusion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Elastic Container Registry Repository. */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecr.RepositoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ecr.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Elastic Container Registry Repository Creation Template. */
  def RepositoryCreationTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.builder
    
    com.pulumi.aws.ecr.RepositoryCreationTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Container Registry Repository Policy.
   *  
   *  Note that currently only one policy may be applied to a repository.
   */
  def RepositoryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.RepositoryPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.RepositoryPolicyArgs.builder
    
    com.pulumi.aws.ecr.RepositoryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Container Registry Pull Through Cache Rule.
   *  
   *  More information about pull through cache rules, including the set of supported
   *  upstream repositories, see [Using pull through cache rules](https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html).
   */
  def PullThroughCacheRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.PullThroughCacheRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.PullThroughCacheRuleArgs.builder
    
    com.pulumi.aws.ecr.PullThroughCacheRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ecr.RepositoryPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.RepositoryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.ReplicationConfigurationArgs.Builder)
    /**
     * @param replicationConfiguration Replication configuration for a registry. See Replication Configuration.
     * @return builder
     */
    def replicationConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.ReplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

  /** Provides an Elastic Container Registry Replication Configuration. */
  def ReplicationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecr.ReplicationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecr.ReplicationConfigurationArgs.builder
    
    com.pulumi.aws.ecr.ReplicationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ecr.RegistryPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.RegistryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder)
    /**
     * @param destinations the details of a replication destination. A maximum of 25 are allowed per `rule`. See Destination.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleDestinationArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param repositoryFilters filters for a replication rule. See Repository Filter.
     * @return builder
     */
    def repositoryFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs.builder
      builder.repositoryFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder)
    /**
     * @param repositoryFilters One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filterType` (required string, currently only `WILDCARD` is supported).
     * @return builder
     */
    def repositoryFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleRepositoryFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleRepositoryFilterArgs.builder
      builder.repositoryFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder)
    /**
     * @param rules The replication rules for a replication configuration. A maximum of 10 are allowed per `replicationConfiguration`. See Rule
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.Builder)
    def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationState.Builder)
    /**
     * @param rules One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.RepositoryPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.inputs.RepositoryPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder)
    /**
     * @param action Specifies the action to take.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleActionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param selection Collects parameters describing the selection criteria for the ECR lifecycle policy:
     * @return builder
     */
    def selection(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleSelectionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleSelectionArgs.builder
      builder.selection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder)
    /**
     * @param rules The rules that comprise the lifecycle policy.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.ReplicationConfigurationState.Builder)
    /**
     * @param replicationConfiguration Replication configuration for a registry. See Replication Configuration.
     * @return builder
     */
    def replicationConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateState.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for any created repositories. See below for schema.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.LifecyclePolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs. Consider using the `aws.ecr.getLifecyclePolicyDocument` dataSource to generate/manage the JSON document used for the `policy` argument.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.RepositoryState.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the repository. See below for schema.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageScanningConfiguration Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
     * @return builder
     */
    def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.RegistryPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.inputs.RegistryPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder)
    def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder)
    /**
     * @param action The action to take when the rule is triggered.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyActionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param selection The selection criteria for the rule.
     * @return builder
     */
    def selection(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicySelectionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicySelectionArgs.builder
      builder.selection(args(argsBuilder).build)
