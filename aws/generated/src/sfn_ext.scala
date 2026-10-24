package jp.ukiba.ko_pulumi
package aws

object sfn_ext:
  extension (builder: com.pulumi.aws.sfn.ActivityArgs.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the Activity. For more information see the section [Data at rest encryption](https://docs.aws.amazon.com/step-functions/latest/dg/encryption-at-rest.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.ActivityArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sfn.AliasArgs.Builder)
    /**
     * @param routingConfigurations The StateMachine alias&#39; route configuration settings. Fields documented below
     * @return builder
     */
    inline def routingConfigurations(args: Endofunction[com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.Builder]*):
        com.pulumi.aws.sfn.AliasArgs.Builder =
      def argsBuilder = com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.builder
      builder.routingConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sfn.StateMachineArgs.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the State Machine. For more information see [TBD] in the AWS Step Functions User Guide.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.StateMachineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is valid when `type` is set to `STANDARD` or `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html), [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) and [Logging Configuration](https://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateStateMachine.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    inline def loggingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.StateMachineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param tracingConfiguration Selects whether AWS X-Ray tracing is enabled.
     * @return builder
     */
    inline def tracingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.StateMachineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.builder
      builder.tracingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sfn.inputs.ActivityState.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the Activity. For more information see the section [Data at rest encryption](https://docs.aws.amazon.com/step-functions/latest/dg/encryption-at-rest.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.ActivityState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sfn.inputs.AliasState.Builder)
    /**
     * @param routingConfigurations The StateMachine alias&#39; route configuration settings. Fields documented below
     * @return builder
     */
    inline def routingConfigurations(args: Endofunction[com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.Builder]*):
        com.pulumi.aws.sfn.inputs.AliasState.Builder =
      def argsBuilder = com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.builder
      builder.routingConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sfn.inputs.StateMachineState.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the State Machine. For more information see [TBD] in the AWS Step Functions User Guide.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.StateMachineState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is valid when `type` is set to `STANDARD` or `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html), [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) and [Logging Configuration](https://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateStateMachine.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    inline def loggingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.StateMachineState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param tracingConfiguration Selects whether AWS X-Ray tracing is enabled.
     * @return builder
     */
    inline def tracingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.StateMachineState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.builder
      builder.tracingConfiguration(args(argsBuilder).build)
