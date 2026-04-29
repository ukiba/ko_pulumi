package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appconfig:
  /** Associates an AppConfig Extension with a Resource. */
  def ExtensionAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ExtensionAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appconfig.ExtensionAssociationArgs.builder
    
    com.pulumi.aws.appconfig.ExtensionAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppConfig Environment resource for an `aws.appconfig.Application` resource. One or more environments can be defined for an application. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appconfig.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppConfig Extension resource. */
  def Extension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.ExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appconfig.Extension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppConfig Deployment Strategy resource. */
  def DeploymentStrategy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.DeploymentStrategyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.DeploymentStrategyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appconfig.DeploymentStrategy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppConfig Application resource. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appconfig.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppConfig Hosted Configuration Version resource. */
  def HostedConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.HostedConfigurationVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appconfig.HostedConfigurationVersionArgs.builder
    
    com.pulumi.aws.appconfig.HostedConfigurationVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appconfig.ConfigurationProfileArgs.Builder)
    /**
     * @param validators Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     * @return builder
     */
    def validators(args: Endofunction[com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.Builder]*):
        com.pulumi.aws.appconfig.ConfigurationProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.builder
      builder.validators(args.map(_(argsBuilder).build)*)

  /** Provides an AppConfig Configuration Profile resource. */
  def ConfigurationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ConfigurationProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.ConfigurationProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appconfig.ConfigurationProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appconfig.EventIntegrationArgs.Builder)
    /**
     * @param eventFilter Block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * @return builder
     */
    def eventFilter(args: Endofunction[com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.Builder]):
        com.pulumi.aws.appconfig.EventIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

  type AppconfigFunctions = com.pulumi.aws.appconfig.AppconfigFunctions
  object AppconfigFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.appconfig.AppconfigFunctions.*
  extension (self: AppconfigFunctions.type)
    /** Provides details about an AWS AppConfig Application. */
    def getApplication(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetApplicationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetApplicationArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getApplication(args(argsBuilder).build)

    /** Provides details about an AWS AppConfig Application. */
    def getApplicationPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetApplicationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getApplicationPlain(args(argsBuilder).build)

    /** Provides access to an AppConfig Configuration Profile. */
    def getConfigurationProfile(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetConfigurationProfileResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfile(args(argsBuilder).build)

    /** Provides access to an AppConfig Configuration Profile. */
    def getConfigurationProfilePlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfilePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetConfigurationProfileResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfilePlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfilePlain(args(argsBuilder).build)

    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     *  Profile IDs to another resource.
     */
    def getConfigurationProfiles(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetConfigurationProfilesResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfiles(args(argsBuilder).build)

    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     *  Profile IDs to another resource.
     */
    def getConfigurationProfilesPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetConfigurationProfilesResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfilesPlain(args(argsBuilder).build)

    /** Provides access to an AppConfig Environment. */
    def getEnvironment(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironment(args(argsBuilder).build)

    /** Provides access to an AppConfig Environment. */
    def getEnvironmentPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironmentPlain(args(argsBuilder).build)

    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     *  resource.
     */
    def getEnvironments(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetEnvironmentsResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironments(args(argsBuilder).build)

    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     *  resource.
     */
    def getEnvironmentsPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetEnvironmentsResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentsPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironmentsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appconfig.ExtensionArgs.Builder)
    /**
     * @param actionPoints The action points defined in the extension. Detailed below.
     * @return builder
     */
    def actionPoints(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder]*):
        com.pulumi.aws.appconfig.ExtensionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.builder
      builder.actionPoints(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.Builder]*):
        com.pulumi.aws.appconfig.ExtensionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.EnvironmentArgs.Builder)
    /**
     * @param monitors Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     * @return builder
     */
    def monitors(args: Endofunction[com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.Builder]*):
        com.pulumi.aws.appconfig.EnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.builder
      builder.monitors(args.map(_(argsBuilder).build)*)

  /** Provides an AppConfig Deployment resource for an `aws.appconfig.Application` resource. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.DeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.DeploymentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appconfig.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Amazon AppIntegrations Event Integration resource. */
  def EventIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.EventIntegrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.EventIntegrationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appconfig.EventIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appconfig.inputs.ConfigurationProfileState.Builder)
    /**
     * @param validators Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     * @return builder
     */
    def validators(args: Endofunction[com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ConfigurationProfileState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.builder
      builder.validators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.inputs.ExtensionState.Builder)
    /**
     * @param actionPoints The action points defined in the extension. Detailed below.
     * @return builder
     */
    def actionPoints(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ExtensionState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.builder
      builder.actionPoints(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ExtensionState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.inputs.EnvironmentState.Builder)
    /**
     * @param monitors Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     * @return builder
     */
    def monitors(args: Endofunction[com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.builder
      builder.monitors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.inputs.EventIntegrationState.Builder)
    /**
     * @param eventFilter Block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * @return builder
     */
    def eventFilter(args: Endofunction[com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.Builder]):
        com.pulumi.aws.appconfig.inputs.EventIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder)
    /**
     * @param actions An action defines the tasks the extension performs during the AppConfig workflow. Detailed below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionActionPointActionArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionActionPointActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)
