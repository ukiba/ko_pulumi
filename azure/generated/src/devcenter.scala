package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object devcenter:
  /** Manages a Dev Center Attached Network. */
  def AttachedNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.AttachedNetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.AttachedNetworkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.devcenter.AttachedNetwork(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center Catalog. */
  def Catalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.CatalogArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.CatalogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.devcenter.Catalog(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center Dev Box Definition. */
  def DevBoxDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.DevBoxDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.DevBoxDefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.DevBoxDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center. */
  def DevCenter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.DevCenterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.DevCenterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.DevCenter(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DevcenterFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Dev Center. */
    inline def get(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.get(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Attached Network. */
    inline def getAttachedNetwork(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetAttachedNetworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetAttachedNetworkResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetAttachedNetworkArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getAttachedNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Attached Network. */
    inline def getAttachedNetworkPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetAttachedNetworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetAttachedNetworkResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetAttachedNetworkPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getAttachedNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Catalog. */
    inline def getCatalog(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetCatalogArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetCatalogResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetCatalogArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getCatalog(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Catalog. */
    inline def getCatalogPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetCatalogPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetCatalogResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetCatalogPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getCatalogPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Dev Box Definition. */
    inline def getDevBoxDefinition(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetDevBoxDefinitionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getDevBoxDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Dev Box Definition. */
    inline def getDevBoxDefinitionPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetDevBoxDefinitionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getDevBoxDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Environment Type. */
    inline def getEnvironmentType(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetEnvironmentTypeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetEnvironmentTypeArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getEnvironmentType(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Environment Type. */
    inline def getEnvironmentTypePlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetEnvironmentTypePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetEnvironmentTypePlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getEnvironmentTypePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Gallery. */
    inline def getGallery(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetGalleryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetGalleryResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetGalleryArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getGallery(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Gallery. */
    inline def getGalleryPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetGalleryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetGalleryResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetGalleryPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getGalleryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Managed DevOps Pool. */
    inline def getManagedDevOpsPool(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetManagedDevOpsPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getManagedDevOpsPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Managed DevOps Pool. */
    inline def getManagedDevOpsPoolPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetManagedDevOpsPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getManagedDevOpsPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Network Connection. */
    inline def getNetworkConnection(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetNetworkConnectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetNetworkConnectionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetNetworkConnectionArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getNetworkConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Network Connection. */
    inline def getNetworkConnectionPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetNetworkConnectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetNetworkConnectionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetNetworkConnectionPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getNetworkConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Project. */
    inline def getProject(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProject(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Project. */
    inline def getProjectPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Project Environment Type. */
    inline def getProjectEnvironmentType(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetProjectEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypeArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectEnvironmentType(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Project Environment Type. */
    inline def getProjectEnvironmentTypePlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetProjectEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypePlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectEnvironmentTypePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Dev Center Project Pool. */
    inline def getProjectPool(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetProjectPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectPoolArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Dev Center Project Pool. */
    inline def getProjectPoolPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetProjectPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectPoolPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Dev Center Environment Type. */
  def EnvironmentType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.EnvironmentTypeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.EnvironmentTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.EnvironmentType(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center Gallery. */
  def Gallery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.GalleryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.GalleryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.devcenter.Gallery(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Managed DevOps Pool. */
  def ManagedDevOpsPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.ManagedDevOpsPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center Network Connection. */
  def NetworkConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.NetworkConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.NetworkConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.NetworkConnection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center Project. */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ProjectArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.Project(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center Project Environment Type. */
  def ProjectEnvironmentType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.ProjectEnvironmentType(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Center Project Pool. */
  def ProjectPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ProjectPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ProjectPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devcenter.ProjectPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
