package jp.ukiba.ko_pulumi
package aws


object resourcegroupstaggingapi:
  object ResourcegroupstaggingapiFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Lists the required tags for supported resource types in an AWS account. Required tags are defined through AWS Organizations [tag policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html). */
    inline def getRequiredTags(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetRequiredTagsResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getRequiredTags(args(argsBuilder).build)

    /** Lists the required tags for supported resource types in an AWS account. Required tags are defined through AWS Organizations [tag policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html). */
    inline def getRequiredTagsPlain(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetRequiredTagsResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsPlainArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getRequiredTagsPlain(args(argsBuilder).build)

    /** Provides details about resource tagging. */
    inline def getResources(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetResourcesResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getResources(args(argsBuilder).build)

    /** Provides details about resource tagging. */
    inline def getResourcesPlain(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetResourcesResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesPlainArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getResourcesPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.Builder)
    /**
     * @param tagFilters Specifies a list of Tag Filters (keys and values) to restrict the output to only those resources that have the specified tag and, if included, the specified value. See Tag Filter below. Conflicts with `resourceArnList`.
     * @return builder
     */
    def tagFilters(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesTagFilterArgs.Builder]*):
        com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesTagFilterArgs.builder
      builder.tagFilters(args.map(_(argsBuilder).build)*)
