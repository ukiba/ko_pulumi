package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

object resourcegroupstaggingapi:
  type ResourcegroupstaggingapiFunctions = com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions
  object ResourcegroupstaggingapiFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.*
  extension (self: ResourcegroupstaggingapiFunctions.type)
    /** Provides details about resource tagging. */
    def getResources(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetResourcesResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getResources(args(argsBuilder).build)

    /** Provides details about resource tagging. */
    def getResourcesPlain(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesPlainArgs.Builder] = identity):
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
