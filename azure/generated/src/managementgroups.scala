package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object managementgroups:
  /**
   * Manages a Management Group.
   * 
   *  !&gt; **Note:** Configuring `subscriptionIds` is not supported when using the `azure.management.GroupSubscriptionAssociation` resource, results will be unpredictable.
   */
  @deprecated() def ManagementGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managementgroups.ManagementGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managementgroups.ManagementGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.managementgroups.ManagementGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ManagementgroupsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Management Group. */
    @deprecated inline def getManagementGroup(args: Endofunction[com.pulumi.azure.managementgroups.inputs.GetManagementGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.managementgroups.outputs.GetManagementGroupResult] =
      val argsBuilder = com.pulumi.azure.managementgroups.inputs.GetManagementGroupArgs.builder
      com.pulumi.azure.managementgroups.ManagementgroupsFunctions.getManagementGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Management Group. */
    @deprecated inline def getManagementGroupPlain(args: Endofunction[com.pulumi.azure.managementgroups.inputs.GetManagementGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managementgroups.outputs.GetManagementGroupResult] =
      val argsBuilder = com.pulumi.azure.managementgroups.inputs.GetManagementGroupPlainArgs.builder
      com.pulumi.azure.managementgroups.ManagementgroupsFunctions.getManagementGroupPlain(args(argsBuilder).build)
