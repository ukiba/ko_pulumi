package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object computeoptimizer:
  extension (builder: com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.EnrollmentStatusTimeoutsArgs.Builder]):
        com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.Builder =
      val argsBuilder = com.pulumi.aws.computeoptimizer.inputs.EnrollmentStatusTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages AWS Compute Optimizer enrollment status. */
  def EnrollmentStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.builder
    
    com.pulumi.aws.computeoptimizer.EnrollmentStatus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages AWS Compute Optimizer recommendation preferences. */
  def RecommendationPreferences(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.builder
    
    com.pulumi.aws.computeoptimizer.RecommendationPreferences(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder)
    /**
     * @param externalMetricsPreference The provider of the external metrics recommendation preference. See External Metrics Preference below.
     * @return builder
     */
    def externalMetricsPreference(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesExternalMetricsPreferenceArgs.Builder]):
        com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder =
      val argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesExternalMetricsPreferenceArgs.builder
      builder.externalMetricsPreference(args(argsBuilder).build)

    /**
     * @param preferredResources The preference to control which resource type values are considered when generating rightsizing recommendations. See Preferred Resources below.
     * @return builder
     */
    def preferredResources(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesPreferredResourceArgs.Builder]*):
        com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder =
      def argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesPreferredResourceArgs.builder
      builder.preferredResources(args.map(_(argsBuilder).build)*)

    /**
     * @param scope The scope of the recommendation preferences. See Scope below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesScopeArgs.Builder]):
        com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder =
      val argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    /**
     * @param utilizationPreferences The preference to control the resource\u2019s CPU utilization threshold, CPU utilization headroom, and memory utilization headroom. See Utilization Preferences below.
     * @return builder
     */
    def utilizationPreferences(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceArgs.Builder]*):
        com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder =
      def argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceArgs.builder
      builder.utilizationPreferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesState.Builder)
    /**
     * @param externalMetricsPreference The provider of the external metrics recommendation preference. See External Metrics Preference below.
     * @return builder
     */
    def externalMetricsPreference(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesExternalMetricsPreferenceArgs.Builder]):
        com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesState.Builder =
      val argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesExternalMetricsPreferenceArgs.builder
      builder.externalMetricsPreference(args(argsBuilder).build)

    /**
     * @param preferredResources The preference to control which resource type values are considered when generating rightsizing recommendations. See Preferred Resources below.
     * @return builder
     */
    def preferredResources(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesPreferredResourceArgs.Builder]*):
        com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesState.Builder =
      def argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesPreferredResourceArgs.builder
      builder.preferredResources(args.map(_(argsBuilder).build)*)

    /**
     * @param scope The scope of the recommendation preferences. See Scope below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesScopeArgs.Builder]):
        com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesState.Builder =
      val argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    /**
     * @param utilizationPreferences The preference to control the resource\u2019s CPU utilization threshold, CPU utilization headroom, and memory utilization headroom. See Utilization Preferences below.
     * @return builder
     */
    def utilizationPreferences(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceArgs.Builder]*):
        com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesState.Builder =
      def argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceArgs.builder
      builder.utilizationPreferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceArgs.Builder)
    /**
     * @param metricParameters The parameters to set when customizing the resource utilization thresholds.
     * @return builder
     */
    def metricParameters(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceMetricParametersArgs.Builder]):
        com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceArgs.Builder =
      val argsBuilder = com.pulumi.aws.computeoptimizer.inputs.RecommendationPreferencesUtilizationPreferenceMetricParametersArgs.builder
      builder.metricParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.computeoptimizer.inputs.EnrollmentStatusState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.computeoptimizer.inputs.EnrollmentStatusTimeoutsArgs.Builder]):
        com.pulumi.aws.computeoptimizer.inputs.EnrollmentStatusState.Builder =
      val argsBuilder = com.pulumi.aws.computeoptimizer.inputs.EnrollmentStatusTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
