package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object inspector:
  /** Provides an Inspector Classic Assessment Template */
  def AssessmentTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector.AssessmentTemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.inspector.AssessmentTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type InspectorFunctions = com.pulumi.aws.inspector.InspectorFunctions
  object InspectorFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.inspector.InspectorFunctions.*
  extension (self: InspectorFunctions.type)
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     *  Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     *  configured in the provider.
     */
    def getRulesPackages(args: Endofunction[com.pulumi.aws.inspector.inputs.GetRulesPackagesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.inspector.outputs.GetRulesPackagesResult] =
      val argsBuilder = com.pulumi.aws.inspector.inputs.GetRulesPackagesArgs.builder
      com.pulumi.aws.inspector.InspectorFunctions.getRulesPackages(args(argsBuilder).build)

    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     *  Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     *  configured in the provider.
     */
    def getRulesPackagesPlain(args: Endofunction[com.pulumi.aws.inspector.inputs.GetRulesPackagesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.inspector.outputs.GetRulesPackagesResult] =
      val argsBuilder = com.pulumi.aws.inspector.inputs.GetRulesPackagesPlainArgs.builder
      com.pulumi.aws.inspector.InspectorFunctions.getRulesPackagesPlain(args(argsBuilder).build)

  /** Provides an Inspector Classic Assessment Target */
  def AssessmentTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector.AssessmentTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector.AssessmentTargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.inspector.AssessmentTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder)
    /**
     * @param eventSubscriptions A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     * @return builder
     */
    def eventSubscriptions(args: Endofunction[com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.Builder]*):
        com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.builder
      builder.eventSubscriptions(args.map(_(argsBuilder).build)*)

  /** Provides an Amazon Inspector Classic Resource Group. */
  def ResourceGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector.ResourceGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector.ResourceGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.inspector.ResourceGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.inspector.inputs.AssessmentTemplateState.Builder)
    /**
     * @param eventSubscriptions A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     * @return builder
     */
    def eventSubscriptions(args: Endofunction[com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.Builder]*):
        com.pulumi.aws.inspector.inputs.AssessmentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.builder
      builder.eventSubscriptions(args.map(_(argsBuilder).build)*)
