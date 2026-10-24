package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object computeoptimizer:
  /** Manages AWS Compute Optimizer enrollment status. */
  def EnrollmentStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.builder
    com.pulumi.aws.computeoptimizer.EnrollmentStatus(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages AWS Compute Optimizer recommendation preferences. */
  def RecommendationPreferences(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.builder
    com.pulumi.aws.computeoptimizer.RecommendationPreferences(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
