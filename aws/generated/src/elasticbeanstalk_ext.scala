package jp.ukiba.ko_pulumi
package aws

object elasticbeanstalk_ext:
  extension (builder: com.pulumi.aws.elasticbeanstalk.ApplicationArgs.Builder)
    inline def appversionLifecycle(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.Builder]):
        com.pulumi.aws.elasticbeanstalk.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.builder
      builder.appversionLifecycle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticbeanstalk.ConfigurationTemplateArgs.Builder)
    /**
     * @param settings Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.ConfigurationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticbeanstalk.EnvironmentArgs.Builder)
    /**
     * @param settings Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.EnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticbeanstalk.inputs.ApplicationState.Builder)
    inline def appversionLifecycle(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.Builder]):
        com.pulumi.aws.elasticbeanstalk.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs.builder
      builder.appversionLifecycle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateState.Builder)
    /**
     * @param settings Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentState.Builder)
    /**
     * @param allSettings List of all option settings configured in this Environment. These
     * are a combination of default settings and their overrides from `setting` in
     * the configuration.
     * @return builder
     */
    inline def allSettings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentAllSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentAllSettingArgs.builder
      builder.allSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param settings Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.Builder]*):
        com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)
