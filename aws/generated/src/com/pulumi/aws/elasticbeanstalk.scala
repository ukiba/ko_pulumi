package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object elasticbeanstalk:
  /**
   * Provides an Elastic Beanstalk Environment Resource. Elastic Beanstalk allows
   *  you to deploy and manage applications in the AWS cloud without worrying about
   *  the infrastructure that runs those applications.
   *  
   *  Environments are often things such as `development`, `integration`, or
   *  `production`.
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticbeanstalk.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticbeanstalk.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticbeanstalk.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Beanstalk Application Resource. Elastic Beanstalk allows
   *  you to deploy and manage applications in the AWS cloud without worrying about
   *  the infrastructure that runs those applications.
   *  
   *  This resource creates an application that has one configuration template named
   *  `default`, and no application versions
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticbeanstalk.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticbeanstalk.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticbeanstalk.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Beanstalk Configuration Template, which are associated with
   *  a specific application and are used to deploy different versions of the
   *  application with the same configuration settings.
   */
  def ConfigurationTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticbeanstalk.ConfigurationTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticbeanstalk.ConfigurationTemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.elasticbeanstalk.ConfigurationTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ElasticbeanstalkFunctions = com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions
  object ElasticbeanstalkFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions.*
  extension (self: ElasticbeanstalkFunctions.type)
    /** Retrieve information about an Elastic Beanstalk Application. */
    def getApplication(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticbeanstalk.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs.builder
      com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions.getApplication(args(argsBuilder).build)

    /** Retrieve information about an Elastic Beanstalk Application. */
    def getApplicationPlain(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticbeanstalk.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions.getApplicationPlain(args(argsBuilder).build)

    /** Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region). */
    def getHostedZone(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticbeanstalk.outputs.GetHostedZoneResult] =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs.builder
      com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions.getHostedZone(args(argsBuilder).build)

    /** Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region). */
    def getHostedZonePlain(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZonePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticbeanstalk.outputs.GetHostedZoneResult] =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZonePlainArgs.builder
      com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions.getHostedZonePlain(args(argsBuilder).build)

    /** Use this data source to get the name of a elastic beanstalk solution stack. */
    def getSolutionStack(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticbeanstalk.outputs.GetSolutionStackResult] =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackArgs.builder
      com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions.getSolutionStack(args(argsBuilder).build)

    /** Use this data source to get the name of a elastic beanstalk solution stack. */
    def getSolutionStackPlain(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticbeanstalk.outputs.GetSolutionStackResult] =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackPlainArgs.builder
      com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions.getSolutionStackPlain(args(argsBuilder).build)

  /**
   * Provides an Elastic Beanstalk Application Version Resource. Elastic Beanstalk allows
   *  you to deploy and manage applications in the AWS cloud without worrying about
   *  the infrastructure that runs those applications.
   *  
   *  This resource creates a Beanstalk Application Version that can be deployed to a Beanstalk
   *  Environment.
   *  
   *  &gt; **NOTE on Application Version Resource:**  When using the Application Version resource with multiple
   *  Elastic Beanstalk Environments it is possible that an error may be returned
   *  when attempting to delete an Application Version while it is still in use by a different environment.
   *  To work around this you can either create each environment in a separate AWS account or create your `aws.elasticbeanstalk.ApplicationVersion` resources with a unique names in your Elastic Beanstalk Application. For example &amp;lt;revision&amp;gt;-&amp;lt;environment&amp;gt;.
   */
  def ApplicationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticbeanstalk.ApplicationVersionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticbeanstalk.ApplicationVersionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticbeanstalk.ApplicationVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elasticbeanstalk.EnvironmentArgs.Builder)
    /**
     * @param settings Option settings to configure the new Environment. These
     *  override specific values that are set as defaults. The format is detailed
     *  below in Option Settings
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.EnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticbeanstalk.ConfigurationTemplateArgs.Builder)
    /**
     * @param settings Option settings to configure the new Environment. These
     *  override specific values that are set as defaults. The format is detailed
     *  below in Option Settings
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.ConfigurationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticbeanstalk.ApplicationArgs.Builder)
    def appversionLifecycle(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.Builder]):
        com.pulumi.aws.elasticbeanstalk.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.builder
      builder.appversionLifecycle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentState.Builder)
    /**
     * @param allSettings List of all option settings configured in this Environment. These
     *  are a combination of default settings and their overrides from `setting` in
     *  the configuration.
     * @return builder
     */
    def allSettings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentAllSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentAllSettingArgs.builder
      builder.allSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param settings Option settings to configure the new Environment. These
     *  override specific values that are set as defaults. The format is detailed
     *  below in Option Settings
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticbeanstalk.inputs.ApplicationState.Builder)
    def appversionLifecycle(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.Builder]):
        com.pulumi.aws.elasticbeanstalk.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.builder
      builder.appversionLifecycle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateState.Builder)
    /**
     * @param settings Option settings to configure the new Environment. These
     *  override specific values that are set as defaults. The format is detailed
     *  below in Option Settings
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)
