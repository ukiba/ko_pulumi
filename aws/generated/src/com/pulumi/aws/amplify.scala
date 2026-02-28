package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object amplify:
  /** Provides an Amplify Domain Association resource. */
  def DomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amplify.DomainAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.amplify.DomainAssociationArgs.builder
    
    com.pulumi.aws.amplify.DomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Amplify Branch resource. */
  def Branch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amplify.BranchArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amplify.BranchArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.amplify.Branch(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.amplify.AppArgs.Builder)
    /**
     * @param autoBranchCreationConfig Automated branch creation configuration for an Amplify app. See `autoBranchCreationConfig` Block for details.
     * @return builder
     */
    def autoBranchCreationConfig(args: Endofunction[com.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigArgs.Builder]):
        com.pulumi.aws.amplify.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigArgs.builder
      builder.autoBranchCreationConfig(args(argsBuilder).build)

    /**
     * @param cacheConfig Cache configuration for the Amplify app. See `cacheConfig` Block for details.
     * @return builder
     */
    def cacheConfig(args: Endofunction[com.pulumi.aws.amplify.inputs.AppCacheConfigArgs.Builder]):
        com.pulumi.aws.amplify.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.AppCacheConfigArgs.builder
      builder.cacheConfig(args(argsBuilder).build)

    /**
     * @param customRules Custom rewrite and redirect rules for an Amplify app. See `customRule` Block for details.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.aws.amplify.inputs.AppCustomRuleArgs.Builder]*):
        com.pulumi.aws.amplify.AppArgs.Builder =
      def argsBuilder = com.pulumi.aws.amplify.inputs.AppCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param jobConfig Used to configure the [Amplify Application build instance compute type](https://docs.aws.amazon.com/amplify/latest/APIReference/API_JobConfig.html#amplify-Type-JobConfig-buildComputeType). See `jobConfig` Block for details.
     * @return builder
     */
    def jobConfig(args: Endofunction[com.pulumi.aws.amplify.inputs.AppJobConfigArgs.Builder]):
        com.pulumi.aws.amplify.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.AppJobConfigArgs.builder
      builder.jobConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amplify.DomainAssociationArgs.Builder)
    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. If you don&#39;t specify a certificate type, Amplify uses the default certificate that it provisions and manages for you.
     * @return builder
     */
    def certificateSettings(args: Endofunction[com.pulumi.aws.amplify.inputs.DomainAssociationCertificateSettingsArgs.Builder]):
        com.pulumi.aws.amplify.DomainAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.DomainAssociationCertificateSettingsArgs.builder
      builder.certificateSettings(args(argsBuilder).build)

    /**
     * @param subDomains Setting for the subdomain. Documented below.
     * @return builder
     */
    def subDomains(args: Endofunction[com.pulumi.aws.amplify.inputs.DomainAssociationSubDomainArgs.Builder]*):
        com.pulumi.aws.amplify.DomainAssociationArgs.Builder =
      def argsBuilder = com.pulumi.aws.amplify.inputs.DomainAssociationSubDomainArgs.builder
      builder.subDomains(args.map(_(argsBuilder).build)*)

  /** Provides an Amplify Webhook resource. */
  def Webhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amplify.WebhookArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.amplify.WebhookArgs.builder
    
    com.pulumi.aws.amplify.Webhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amplify App resource, a fullstack serverless app hosted on the [AWS Amplify Console](https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html).
   *  
   *  &gt; **Note:** When you create/update an Amplify App from the provider, you may end up with the error &#34;BadRequestException: You should at least provide one valid token&#34; because of authentication issues. See the section &#34;Repository with Tokens&#34; below.
   */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amplify.AppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.amplify.AppArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.amplify.App(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Amplify Backend Environment resource. */
  def BackendEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.amplify.BackendEnvironmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.amplify.BackendEnvironmentArgs.builder
    
    com.pulumi.aws.amplify.BackendEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.amplify.inputs.DomainAssociationState.Builder)
    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. If you don&#39;t specify a certificate type, Amplify uses the default certificate that it provisions and manages for you.
     * @return builder
     */
    def certificateSettings(args: Endofunction[com.pulumi.aws.amplify.inputs.DomainAssociationCertificateSettingsArgs.Builder]):
        com.pulumi.aws.amplify.inputs.DomainAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.DomainAssociationCertificateSettingsArgs.builder
      builder.certificateSettings(args(argsBuilder).build)

    /**
     * @param subDomains Setting for the subdomain. Documented below.
     * @return builder
     */
    def subDomains(args: Endofunction[com.pulumi.aws.amplify.inputs.DomainAssociationSubDomainArgs.Builder]*):
        com.pulumi.aws.amplify.inputs.DomainAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.amplify.inputs.DomainAssociationSubDomainArgs.builder
      builder.subDomains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.amplify.inputs.AppState.Builder)
    /**
     * @param autoBranchCreationConfig Automated branch creation configuration for an Amplify app. See `autoBranchCreationConfig` Block for details.
     * @return builder
     */
    def autoBranchCreationConfig(args: Endofunction[com.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigArgs.Builder]):
        com.pulumi.aws.amplify.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigArgs.builder
      builder.autoBranchCreationConfig(args(argsBuilder).build)

    /**
     * @param cacheConfig Cache configuration for the Amplify app. See `cacheConfig` Block for details.
     * @return builder
     */
    def cacheConfig(args: Endofunction[com.pulumi.aws.amplify.inputs.AppCacheConfigArgs.Builder]):
        com.pulumi.aws.amplify.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.AppCacheConfigArgs.builder
      builder.cacheConfig(args(argsBuilder).build)

    /**
     * @param customRules Custom rewrite and redirect rules for an Amplify app. See `customRule` Block for details.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.aws.amplify.inputs.AppCustomRuleArgs.Builder]*):
        com.pulumi.aws.amplify.inputs.AppState.Builder =
      def argsBuilder = com.pulumi.aws.amplify.inputs.AppCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param jobConfig Used to configure the [Amplify Application build instance compute type](https://docs.aws.amazon.com/amplify/latest/APIReference/API_JobConfig.html#amplify-Type-JobConfig-buildComputeType). See `jobConfig` Block for details.
     * @return builder
     */
    def jobConfig(args: Endofunction[com.pulumi.aws.amplify.inputs.AppJobConfigArgs.Builder]):
        com.pulumi.aws.amplify.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.amplify.inputs.AppJobConfigArgs.builder
      builder.jobConfig(args(argsBuilder).build)

    /**
     * @param productionBranches Describes the information about a production branch for an Amplify app. A `productionBranch` block is documented below.
     * @return builder
     */
    def productionBranches(args: Endofunction[com.pulumi.aws.amplify.inputs.AppProductionBranchArgs.Builder]*):
        com.pulumi.aws.amplify.inputs.AppState.Builder =
      def argsBuilder = com.pulumi.aws.amplify.inputs.AppProductionBranchArgs.builder
      builder.productionBranches(args.map(_(argsBuilder).build)*)
