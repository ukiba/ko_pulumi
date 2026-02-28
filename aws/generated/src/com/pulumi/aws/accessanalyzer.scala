package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object accessanalyzer:
  extension (builder: com.pulumi.aws.accessanalyzer.AnalyzerArgs.Builder)
    /**
     * @param configuration A block that specifies the configuration of the analyzer. See `configuration` Block for details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationArgs.Builder]):
        com.pulumi.aws.accessanalyzer.AnalyzerArgs.Builder =
      val argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  /** Manages an Access Analyzer Analyzer. More information can be found in the [Access Analyzer User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html). */
  def Analyzer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.accessanalyzer.AnalyzerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.accessanalyzer.AnalyzerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.accessanalyzer.Analyzer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS AccessAnalyzer Archive Rule. */
  def ArchiveRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.accessanalyzer.ArchiveRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.accessanalyzer.ArchiveRuleArgs.builder
    
    com.pulumi.aws.accessanalyzer.ArchiveRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.accessanalyzer.ArchiveRuleArgs.Builder)
    /**
     * @param filters Filter criteria for the archive rule. See Filter for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.ArchiveRuleFilterArgs.Builder]*):
        com.pulumi.aws.accessanalyzer.ArchiveRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.accessanalyzer.inputs.ArchiveRuleFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.accessanalyzer.inputs.AnalyzerState.Builder)
    /**
     * @param configuration A block that specifies the configuration of the analyzer. See `configuration` Block for details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationArgs.Builder]):
        com.pulumi.aws.accessanalyzer.inputs.AnalyzerState.Builder =
      val argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationArgs.Builder)
    /**
     * @param internalAccess Specifies the configuration of an internal access analyzer for an AWS organization or account. This configuration determines how the analyzer evaluates access within your AWS environment. See `internalAccess` Block for details.
     * @return builder
     */
    def internalAccess(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessArgs.Builder]):
        com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessArgs.builder
      builder.internalAccess(args(argsBuilder).build)

    /**
     * @param unusedAccess Specifies the configuration of an unused access analyzer for an AWS organization or account. See `unusedAccess` Block for details.
     * @return builder
     */
    def unusedAccess(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessArgs.Builder]):
        com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessArgs.builder
      builder.unusedAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessArgs.Builder)
    /**
     * @param analysisRule Information about analysis rules for the analyzer. Analysis rules determine which entities will generate findings based on the criteria you define when you create the rule. See `analysisRule` Block for Unused Access Analyzer for details.
     * @return builder
     */
    def analysisRule(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessAnalysisRuleArgs.Builder]):
        com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessAnalysisRuleArgs.builder
      builder.analysisRule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessArgs.Builder)
    /**
     * @param analysisRule Information about analysis rules for the internal access analyzer. These rules determine which resources and access patterns will be analyzed. See `analysisRule` Block for Internal Access Analyzer for details.
     * @return builder
     */
    def analysisRule(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessAnalysisRuleArgs.Builder]):
        com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessAnalysisRuleArgs.builder
      builder.analysisRule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessAnalysisRuleArgs.Builder)
    /**
     * @param exclusions List of rules for the analyzer containing criteria to exclude from analysis. Entities that meet the rule criteria will not generate findings. See `exclusion` Block for details.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessAnalysisRuleExclusionArgs.Builder]*):
        com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessAnalysisRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationUnusedAccessAnalysisRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessAnalysisRuleArgs.Builder)
    /**
     * @param inclusions List of rules for the internal access analyzer containing criteria to include in analysis. Only resources that meet the rule criteria will generate findings. See `inclusion` Block for details.
     * @return builder
     */
    def inclusions(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessAnalysisRuleInclusionArgs.Builder]*):
        com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessAnalysisRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.accessanalyzer.inputs.AnalyzerConfigurationInternalAccessAnalysisRuleInclusionArgs.builder
      builder.inclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.accessanalyzer.inputs.ArchiveRuleState.Builder)
    /**
     * @param filters Filter criteria for the archive rule. See Filter for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.accessanalyzer.inputs.ArchiveRuleFilterArgs.Builder]*):
        com.pulumi.aws.accessanalyzer.inputs.ArchiveRuleState.Builder =
      def argsBuilder = com.pulumi.aws.accessanalyzer.inputs.ArchiveRuleFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)
