package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object sfn:
  /** Provides a Step Function Activity resource */
  def Activity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sfn.ActivityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sfn.ActivityArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sfn.Activity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Step Function State Machine Alias. */
  def Alias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sfn.AliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sfn.AliasArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.sfn.Alias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sfn.StateMachineArgs.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the State Machine. For more information see [TBD] in the AWS Step Functions User Guide.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.StateMachineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is valid when `type` is set to `STANDARD` or `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html), [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) and [Logging Configuration](https://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateStateMachine.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.StateMachineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param tracingConfiguration Selects whether AWS X-Ray tracing is enabled.
     * @return builder
     */
    def tracingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.StateMachineArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.builder
      builder.tracingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sfn.ActivityArgs.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the Activity. For more information see the section [Data at rest encyption](https://docs.aws.amazon.com/step-functions/latest/dg/encryption-at-rest.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.ActivityArgs.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  /** Provides a Step Function State Machine resource */
  def StateMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sfn.StateMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sfn.StateMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sfn.StateMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SfnFunctions = com.pulumi.aws.sfn.SfnFunctions
  object SfnFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.sfn.SfnFunctions.*
  extension (self: SfnFunctions.type)
    /** Provides a Step Functions Activity data source */
    def getActivity(args: Endofunction[com.pulumi.aws.sfn.inputs.GetActivityArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetActivityResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetActivityArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getActivity(args(argsBuilder).build)

    /** Provides a Step Functions Activity data source */
    def getActivityPlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetActivityPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetActivityResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetActivityPlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getActivityPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Alias. */
    def getAlias(args: Endofunction[com.pulumi.aws.sfn.inputs.GetAliasArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetAliasArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getAlias(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Alias. */
    def getAliasPlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetAliasPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetAliasPlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getAliasPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of a State Machine in AWS Step
     *  Function (SFN). By using this data source, you can reference a
     *  state machine without having to hard code the ARNs as input.
     */
    def getStateMachine(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachineArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetStateMachineResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachineArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachine(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of a State Machine in AWS Step
     *  Function (SFN). By using this data source, you can reference a
     *  state machine without having to hard code the ARNs as input.
     */
    def getStateMachinePlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachinePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetStateMachineResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachinePlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachinePlain(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Versions. */
    def getStateMachineVersions(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachineVersionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetStateMachineVersionsResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachineVersionsArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachineVersions(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Versions. */
    def getStateMachineVersionsPlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachineVersionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetStateMachineVersionsResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachineVersionsPlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachineVersionsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sfn.AliasArgs.Builder)
    /**
     * @param routingConfigurations The StateMachine alias&#39; route configuration settings. Fields documented below
     * @return builder
     */
    def routingConfigurations(args: Endofunction[com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.Builder]*):
        com.pulumi.aws.sfn.AliasArgs.Builder =
      def argsBuilder = com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.builder
      builder.routingConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sfn.inputs.ActivityState.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the Activity. For more information see the section [Data at rest encyption](https://docs.aws.amazon.com/step-functions/latest/dg/encryption-at-rest.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.ActivityState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.ActivityEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sfn.inputs.AliasState.Builder)
    /**
     * @param routingConfigurations The StateMachine alias&#39; route configuration settings. Fields documented below
     * @return builder
     */
    def routingConfigurations(args: Endofunction[com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.Builder]*):
        com.pulumi.aws.sfn.inputs.AliasState.Builder =
      def argsBuilder = com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs.builder
      builder.routingConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sfn.inputs.StateMachineState.Builder)
    /**
     * @param encryptionConfiguration Defines what encryption configuration is used to encrypt data in the State Machine. For more information see [TBD] in the AWS Step Functions User Guide.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.StateMachineState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is valid when `type` is set to `STANDARD` or `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html), [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) and [Logging Configuration](https://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateStateMachine.html) in the AWS Step Functions User Guide.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.StateMachineState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param tracingConfiguration Selects whether AWS X-Ray tracing is enabled.
     * @return builder
     */
    def tracingConfiguration(args: Endofunction[com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.Builder]):
        com.pulumi.aws.sfn.inputs.StateMachineState.Builder =
      val argsBuilder = com.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs.builder
      builder.tracingConfiguration(args(argsBuilder).build)
