package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object inspector:
  /** Provides an Inspector Classic Assessment Target */
  def AssessmentTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.inspector.AssessmentTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector.AssessmentTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.inspector.AssessmentTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an Inspector Classic Assessment Template */
  def AssessmentTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector.AssessmentTemplateArgs.builder
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
    com.pulumi.aws.inspector.AssessmentTemplate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder)
    /**
     * @param eventSubscriptions A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     * @return builder
     */
    def eventSubscriptions(args: Endofunction[com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.Builder]*):
        com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.builder
      builder.eventSubscriptions(args.map(_(argsBuilder).build)*)

  object InspectorFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     */
    inline def getRulesPackages(args: Endofunction[com.pulumi.aws.inspector.inputs.GetRulesPackagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.inspector.outputs.GetRulesPackagesResult] =
      val argsBuilder = com.pulumi.aws.inspector.inputs.GetRulesPackagesArgs.builder
      com.pulumi.aws.inspector.InspectorFunctions.getRulesPackages(args(argsBuilder).build)

    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     */
    inline def getRulesPackagesPlain(args: Endofunction[com.pulumi.aws.inspector.inputs.GetRulesPackagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.inspector.outputs.GetRulesPackagesResult] =
      val argsBuilder = com.pulumi.aws.inspector.inputs.GetRulesPackagesPlainArgs.builder
      com.pulumi.aws.inspector.InspectorFunctions.getRulesPackagesPlain(args(argsBuilder).build)

  /** Provides an Amazon Inspector Classic Resource Group. */
  def ResourceGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.inspector.ResourceGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector.ResourceGroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.inspector.ResourceGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.inspector.inputs.AssessmentTemplateState.Builder)
    /**
     * @param eventSubscriptions A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     * @return builder
     */
    def eventSubscriptions(args: Endofunction[com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.Builder]*):
        com.pulumi.aws.inspector.inputs.AssessmentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.builder
      builder.eventSubscriptions(args.map(_(argsBuilder).build)*)
