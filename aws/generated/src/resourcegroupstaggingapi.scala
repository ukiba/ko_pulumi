package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object resourcegroupstaggingapi:
  object ResourcegroupstaggingapiFunctions:
    /** Lists the required tags for supported resource types in an AWS account. Required tags are defined through AWS Organizations [tag policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html). */
    inline def getRequiredTags(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetRequiredTagsResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getRequiredTags(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Lists the required tags for supported resource types in an AWS account. Required tags are defined through AWS Organizations [tag policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html). */
    inline def getRequiredTagsPlain(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetRequiredTagsResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetRequiredTagsPlainArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getRequiredTagsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about resource tagging. */
    inline def getResources(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetResourcesResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getResources(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about resource tagging. */
    inline def getResourcesPlain(args: Endofunction[com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resourcegroupstaggingapi.outputs.GetResourcesResult] =
      val argsBuilder = com.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesPlainArgs.builder
      com.pulumi.aws.resourcegroupstaggingapi.ResourcegroupstaggingapiFunctions.getResourcesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
