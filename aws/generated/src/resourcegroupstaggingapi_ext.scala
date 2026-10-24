package jp.ukiba.ko_pulumi
package aws

object resourcegroupstaggingapi_ext:
  extension (builder: com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.Builder)
    /**
     * @param tagFilters Specifies a list of Tag Filters (keys and values) to restrict the output to only those resources that have the specified tag and, if included, the specified value. See Tag Filter below. Conflicts with `resourceArnList`.
     * @return builder
     */
    inline def tagFilters(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesTagFilterArgs.Builder]*):
        com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesTagFilterArgs.builder
      builder.tagFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesPlainArgs.Builder)
    /**
     * @param tagFilters Specifies a list of Tag Filters (keys and values) to restrict the output to only those resources that have the specified tag and, if included, the specified value. See Tag Filter below. Conflicts with `resourceArnList`.
     * @return builder
     */
    inline def tagFilters(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesTagFilter.Builder]*):
        com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesTagFilter.builder
      builder.tagFilters(args.map(_(argsBuilder).build)*)
