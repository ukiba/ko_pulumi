package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object inspector:
  /** Provides an Inspector Classic Assessment Target */
  inline def AssessmentTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector.AssessmentTargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector.AssessmentTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.inspector.AssessmentTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Inspector Classic Assessment Template */
  inline def AssessmentTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object InspectorFunctions:
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     */
    inline def getRulesPackages(args: Endofunction[com.pulumi.aws.inspector.inputs.GetRulesPackagesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.inspector.outputs.GetRulesPackagesResult] =
      val argsBuilder = com.pulumi.aws.inspector.inputs.GetRulesPackagesArgs.builder
      com.pulumi.aws.inspector.InspectorFunctions.getRulesPackages(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     */
    inline def getRulesPackagesPlain(args: Endofunction[com.pulumi.aws.inspector.inputs.GetRulesPackagesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.inspector.outputs.GetRulesPackagesResult] =
      val argsBuilder = com.pulumi.aws.inspector.inputs.GetRulesPackagesPlainArgs.builder
      com.pulumi.aws.inspector.InspectorFunctions.getRulesPackagesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an Amazon Inspector Classic Resource Group. */
  inline def ResourceGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector.ResourceGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)
