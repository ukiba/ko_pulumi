package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object drs:
  /**
   * Provides an Elastic Disaster Recovery replication configuration template resource. Before using DRS, your account must be [initialized](https://docs.aws.amazon.com/drs/latest/userguide/getting-started-initializing.html).
   *  
   *  &gt; **NOTE:** Your configuration must use the PIT policy shown in the basic configuration due to AWS rules. The only value that you can change is the `retentionDuration` of `ruleId` 3.
   */
  def ReplicationConfigurationTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.drs.ReplicationConfigurationTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateState.Builder)
    /**
     * @param pitPolicies Configuration block for Point in time (PIT) policy to manage snapshots taken during replication. See below.
     * @return builder
     */
    def pitPolicies(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.Builder]*):
        com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.builder
      builder.pitPolicies(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.Builder]):
        com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder)
    /**
     * @param pitPolicies Configuration block for Point in time (PIT) policy to manage snapshots taken during replication. See below.
     * @return builder
     */
    def pitPolicies(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.Builder]*):
        com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplatePitPolicyArgs.builder
      builder.pitPolicies(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.Builder]):
        com.pulumi.aws.drs.ReplicationConfigurationTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.drs.inputs.ReplicationConfigurationTemplateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
