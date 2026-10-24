package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object managementgroups:
  /**
   * Manages a Management Group.
   * 
   * &gt; **Note:** Configuring `subscriptionIds` is not supported when using the `azure.management.GroupSubscriptionAssociation` resource, results will be unpredictable.
   */
  @deprecated("azure.managementgroups.ManagementGroup has been deprecated in favor of azure.management.Group") def ManagementGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.managementgroups.ManagementGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managementgroups.ManagementGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.managementgroups.ManagementGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ManagementgroupsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Management Group. */
    @deprecated("azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup") inline def getManagementGroup(args: Endofunction[com.pulumi.azure.managementgroups.inputs.GetManagementGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.managementgroups.outputs.GetManagementGroupResult] =
      val argsBuilder = com.pulumi.azure.managementgroups.inputs.GetManagementGroupArgs.builder
      com.pulumi.azure.managementgroups.ManagementgroupsFunctions.getManagementGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Management Group. */
    @deprecated("azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup") inline def getManagementGroupPlain(args: Endofunction[com.pulumi.azure.managementgroups.inputs.GetManagementGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managementgroups.outputs.GetManagementGroupResult] =
      val argsBuilder = com.pulumi.azure.managementgroups.inputs.GetManagementGroupPlainArgs.builder
      com.pulumi.azure.managementgroups.ManagementgroupsFunctions.getManagementGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
