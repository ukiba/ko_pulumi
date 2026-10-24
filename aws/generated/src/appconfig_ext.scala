package jp.ukiba.ko_pulumi
package aws

object appconfig_ext:
  extension (builder: com.pulumi.aws.appconfig.ConfigurationProfileArgs.Builder)
    /**
     * @param validators Set of methods for validating the configuration. Maximum of 2. See `validator` Block below for more details.
     * @return builder
     */
    inline def validators(args: Endofunction[com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.Builder]*):
        com.pulumi.aws.appconfig.ConfigurationProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.builder
      builder.validators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.EnvironmentArgs.Builder)
    /**
     * @param monitors Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     * @return builder
     */
    inline def monitors(args: Endofunction[com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.Builder]*):
        com.pulumi.aws.appconfig.EnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.builder
      builder.monitors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.EventIntegrationArgs.Builder)
    /**
     * @param eventFilter Block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * @return builder
     */
    inline def eventFilter(args: Endofunction[com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.Builder]):
        com.pulumi.aws.appconfig.EventIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appconfig.ExtensionArgs.Builder)
    /**
     * @param actionPoints Action points defined in the extension. Detailed below.
     * @return builder
     */
    inline def actionPoints(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder]*):
        com.pulumi.aws.appconfig.ExtensionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.builder
      builder.actionPoints(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.Builder]*):
        com.pulumi.aws.appconfig.ExtensionArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.inputs.ConfigurationProfileState.Builder)
    /**
     * @param validators Set of methods for validating the configuration. Maximum of 2. See `validator` Block below for more details.
     * @return builder
     */
    inline def validators(args: Endofunction[com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ConfigurationProfileState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs.builder
      builder.validators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.inputs.EnvironmentState.Builder)
    /**
     * @param monitors Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     * @return builder
     */
    inline def monitors(args: Endofunction[com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.EnvironmentMonitorArgs.builder
      builder.monitors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.inputs.EventIntegrationState.Builder)
    /**
     * @param eventFilter Block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * @return builder
     */
    inline def eventFilter(args: Endofunction[com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.Builder]):
        com.pulumi.aws.appconfig.inputs.EventIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder)
    /**
     * @param actions Action the extension performs during the AppConfig workflow. Detailed below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionActionPointActionArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionActionPointActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appconfig.inputs.ExtensionState.Builder)
    /**
     * @param actionPoints Action points defined in the extension. Detailed below.
     * @return builder
     */
    inline def actionPoints(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ExtensionState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs.builder
      builder.actionPoints(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.Builder]*):
        com.pulumi.aws.appconfig.inputs.ExtensionState.Builder =
      def argsBuilder = com.pulumi.aws.appconfig.inputs.ExtensionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)
