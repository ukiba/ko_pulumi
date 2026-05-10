package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object databasemigration:
  type DatabasemigrationFunctions = com.pulumi.azure.databasemigration.DatabasemigrationFunctions
  object DatabasemigrationFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.databasemigration.DatabasemigrationFunctions.*
  extension (self: DatabasemigrationFunctions.type)
    /** Use this data source to access information about an existing Database Migration Project. */
    def getProject(args: Endofunction[com.pulumi.azure.databasemigration.inputs.GetProjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databasemigration.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.azure.databasemigration.inputs.GetProjectArgs.builder
      com.pulumi.azure.databasemigration.DatabasemigrationFunctions.getProject(args(argsBuilder).build)

    /** Use this data source to access information about an existing Database Migration Project. */
    def getProjectPlain(args: Endofunction[com.pulumi.azure.databasemigration.inputs.GetProjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databasemigration.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.azure.databasemigration.inputs.GetProjectPlainArgs.builder
      com.pulumi.azure.databasemigration.DatabasemigrationFunctions.getProjectPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Database Migration Service. */
    def getService(args: Endofunction[com.pulumi.azure.databasemigration.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databasemigration.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.databasemigration.inputs.GetServiceArgs.builder
      com.pulumi.azure.databasemigration.DatabasemigrationFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Database Migration Service. */
    def getServicePlain(args: Endofunction[com.pulumi.azure.databasemigration.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databasemigration.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.databasemigration.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.databasemigration.DatabasemigrationFunctions.getServicePlain(args(argsBuilder).build)

  /**
   * Manages a Azure Database Migration Service.
   * 
   *  &gt; **NOTE:** Destroying a Database Migration Service will leave any outstanding tasks untouched. This is to avoid unexpectedly deleting any tasks managed outside of this provide.
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databasemigration.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.databasemigration.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.databasemigration.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manage a Azure Database Migration Project.
   * 
   *  &gt; **NOTE:** Destroying a Database Migration Project will leave any outstanding tasks untouched. This is to avoid unexpectedly deleting any tasks managed outside of this provider.
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databasemigration.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.databasemigration.ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.databasemigration.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
