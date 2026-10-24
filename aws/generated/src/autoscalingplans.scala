package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object autoscalingplans:
  /**
   * Manages an AWS Auto Scaling scaling plan.
   * More information can be found in the [AWS Auto Scaling User Guide](https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html).
   * 
   * &gt; **NOTE:** The AWS Auto Scaling service uses an AWS IAM service-linked role to manage predictive scaling of Amazon EC2 Auto Scaling groups. The service attempts to automatically create this role the first time a scaling plan with predictive scaling enabled is created.
   * An `aws.iam.ServiceLinkedRole` resource can be used to manually manage this role.
   * See the [AWS documentation](https://docs.aws.amazon.com/autoscaling/plans/userguide/aws-auto-scaling-service-linked-roles.html#create-service-linked-role-manual) for more details.
   */
  def ScalingPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscalingplans.ScalingPlanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.autoscalingplans.ScalingPlan(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
