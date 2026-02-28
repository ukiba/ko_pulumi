package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object costoptimizationhub:
  /**
   * Resource for managing AWS Cost Optimization Hub Enrollment Status.
   *  
   *  &gt; **TIP:** The Cost Optimization Hub only has a `us-east-1` endpoint. However, you can access the service globally with the AWS Provider from other regions. Other tools, such as the [AWS CLI](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/cost-optimization-hub/index.html), may require you to specify the `us-east-1` region when using the service.
   */
  def EnrollmentStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.costoptimizationhub.EnrollmentStatusArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.costoptimizationhub.EnrollmentStatusArgs.builder
    
    com.pulumi.aws.costoptimizationhub.EnrollmentStatus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing AWS Cost Optimization Hub Preferences. */
  def Preferences(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.costoptimizationhub.PreferencesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.costoptimizationhub.PreferencesArgs.builder
    
    com.pulumi.aws.costoptimizationhub.Preferences(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
