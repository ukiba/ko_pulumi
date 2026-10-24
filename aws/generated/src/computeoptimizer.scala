package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object computeoptimizer:
  /** Manages AWS Compute Optimizer enrollment status. */
  def EnrollmentStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.computeoptimizer.EnrollmentStatusArgs.builder
    com.pulumi.aws.computeoptimizer.EnrollmentStatus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages AWS Compute Optimizer recommendation preferences. */
  def RecommendationPreferences(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.computeoptimizer.RecommendationPreferencesArgs.builder
    com.pulumi.aws.computeoptimizer.RecommendationPreferences(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
