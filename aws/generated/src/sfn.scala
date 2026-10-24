package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object sfn:
  /** Provides a Step Function Activity resource */
  def Activity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.sfn.ActivityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sfn.ActivityArgs.builder
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
    com.pulumi.aws.sfn.Activity(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Step Function State Machine Alias. */
  def Alias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.sfn.AliasArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sfn.AliasArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.sfn.Alias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object SfnFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides a Step Functions Activity data source */
    inline def getActivity(args: Endofunction[com.pulumi.aws.sfn.inputs.GetActivityArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetActivityResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetActivityArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getActivity(args(argsBuilder).build)

    /** Provides a Step Functions Activity data source */
    inline def getActivityPlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetActivityPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetActivityResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetActivityPlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getActivityPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Alias. */
    inline def getAlias(args: Endofunction[com.pulumi.aws.sfn.inputs.GetAliasArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetAliasArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getAlias(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Alias. */
    inline def getAliasPlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetAliasPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetAliasPlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getAliasPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of a State Machine in AWS Step
     * Function (SFN). By using this data source, you can reference a
     * state machine without having to hard code the ARNs as input.
     */
    inline def getStateMachine(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachineArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetStateMachineResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachineArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachine(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of a State Machine in AWS Step
     * Function (SFN). By using this data source, you can reference a
     * state machine without having to hard code the ARNs as input.
     */
    inline def getStateMachinePlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachinePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetStateMachineResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachinePlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachinePlain(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Versions. */
    inline def getStateMachineVersions(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachineVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.sfn.outputs.GetStateMachineVersionsResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachineVersionsArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachineVersions(args(argsBuilder).build)

    /** Data source for managing an AWS SFN (Step Functions) State Machine Versions. */
    inline def getStateMachineVersionsPlain(args: Endofunction[com.pulumi.aws.sfn.inputs.GetStateMachineVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sfn.outputs.GetStateMachineVersionsResult] =
      val argsBuilder = com.pulumi.aws.sfn.inputs.GetStateMachineVersionsPlainArgs.builder
      com.pulumi.aws.sfn.SfnFunctions.getStateMachineVersionsPlain(args(argsBuilder).build)

  /** Provides a Step Function State Machine resource */
  def StateMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.sfn.StateMachineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sfn.StateMachineArgs.builder
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
    com.pulumi.aws.sfn.StateMachine(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
