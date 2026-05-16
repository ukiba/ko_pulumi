package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object devcenter:
  /** Manages a Dev Center Catalog. */
  def Catalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.CatalogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.CatalogArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.devcenter.Catalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Dev Center. */
  def DevCenter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.DevCenterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.DevCenterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.DevCenter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devcenter.ProjectArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.ProjectArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Dev Center Network Connection. */
  def NetworkConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.NetworkConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.NetworkConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.NetworkConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Dev Center Environment Type. */
  def EnvironmentType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.EnvironmentTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.EnvironmentTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.EnvironmentType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Dev Center Gallery. */
  def Gallery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.GalleryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.GalleryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.devcenter.Gallery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Dev Center Project Environment Type. */
  def ProjectEnvironmentType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.ProjectEnvironmentType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder)
    /**
     * @param azureDevopsOrganization An `azureDevopsOrganization` block as defined below.
     * @return builder
     */
    def azureDevopsOrganization(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.builder
      builder.azureDevopsOrganization(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param statefulAgent A `statefulAgent` block as defined below.
     * @return builder
     */
    def statefulAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.builder
      builder.statefulAgent(args(argsBuilder).build)

    /**
     * @param statelessAgent A `statelessAgent` block as defined below.
     * 
     *  &gt; **Note:** Exactly one of `statefulAgent` or `statelessAgent` must be specified.
     * @return builder
     */
    def statelessAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.builder
      builder.statelessAgent(args(argsBuilder).build)

    /**
     * @param virtualMachineScaleSetFabric A `virtualMachineScaleSetFabric` block as defined below.
     * @return builder
     */
    def virtualMachineScaleSetFabric(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.builder
      builder.virtualMachineScaleSetFabric(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Dev Center Project. */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devcenter.DevCenterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.DevCenterArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.DevCenterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Dev Center Attached Network. */
  def AttachedNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.AttachedNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.AttachedNetworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.devcenter.AttachedNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Managed DevOps Pool. */
  def ManagedDevOpsPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.ManagedDevOpsPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param userRoleAssignments A `userRoleAssignment` block as defined below.
     * @return builder
     */
    def userRoleAssignments(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.Builder]*):
        com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.builder
      builder.userRoleAssignments(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object DevcenterFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Dev Center. */
    inline def get(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.get(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Attached Network. */
    inline def getAttachedNetwork(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetAttachedNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetAttachedNetworkResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetAttachedNetworkArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getAttachedNetwork(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Attached Network. */
    inline def getAttachedNetworkPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetAttachedNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetAttachedNetworkResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetAttachedNetworkPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getAttachedNetworkPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Catalog. */
    inline def getCatalog(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetCatalogArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetCatalogResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetCatalogArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getCatalog(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Catalog. */
    inline def getCatalogPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetCatalogPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetCatalogResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetCatalogPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getCatalogPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Dev Box Definition. */
    inline def getDevBoxDefinition(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetDevBoxDefinitionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getDevBoxDefinition(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Dev Box Definition. */
    inline def getDevBoxDefinitionPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetDevBoxDefinitionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetDevBoxDefinitionPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getDevBoxDefinitionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Environment Type. */
    inline def getEnvironmentType(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetEnvironmentTypeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetEnvironmentTypeArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getEnvironmentType(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Environment Type. */
    inline def getEnvironmentTypePlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetEnvironmentTypePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetEnvironmentTypePlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getEnvironmentTypePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Gallery. */
    inline def getGallery(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetGalleryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetGalleryResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetGalleryArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getGallery(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Gallery. */
    inline def getGalleryPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetGalleryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetGalleryResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetGalleryPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getGalleryPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed DevOps Pool. */
    inline def getManagedDevOpsPool(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetManagedDevOpsPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getManagedDevOpsPool(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed DevOps Pool. */
    inline def getManagedDevOpsPoolPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetManagedDevOpsPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetManagedDevOpsPoolPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getManagedDevOpsPoolPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Network Connection. */
    inline def getNetworkConnection(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetNetworkConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetNetworkConnectionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetNetworkConnectionArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getNetworkConnection(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Network Connection. */
    inline def getNetworkConnectionPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetNetworkConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetNetworkConnectionResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetNetworkConnectionPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getNetworkConnectionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Project. */
    inline def getProject(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProject(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Project. */
    inline def getProjectPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Project Environment Type. */
    inline def getProjectEnvironmentType(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetProjectEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypeArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectEnvironmentType(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Project Environment Type. */
    inline def getProjectEnvironmentTypePlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetProjectEnvironmentTypeResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectEnvironmentTypePlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectEnvironmentTypePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Project Pool. */
    inline def getProjectPool(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devcenter.outputs.GetProjectPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectPoolArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectPool(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Center Project Pool. */
    inline def getProjectPoolPlain(args: Endofunction[com.pulumi.azure.devcenter.inputs.GetProjectPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devcenter.outputs.GetProjectPoolResult] =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.GetProjectPoolPlainArgs.builder
      com.pulumi.azure.devcenter.DevcenterFunctions.getProjectPoolPlain(args(argsBuilder).build)

  /** Manages a Dev Center Dev Box Definition. */
  def DevBoxDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.DevBoxDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.DevBoxDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.DevBoxDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder)
    /**
     * @param organizations One or more `organization` blocks as defined below.
     * @return builder
     */
    def organizations(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationOrganizationArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationOrganizationArgs.builder
      builder.organizations(args.map(_(argsBuilder).build)*)

    /**
     * @param permission A `permission` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def permission(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.builder
      builder.permission(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.Builder)
    /**
     * @param administratorAccount An `administratorAccount` block as defined below. This block is only valid when `kind` is set to `SpecificAccounts`. Changing this forces a new resource to be created.
     * @return builder
     */
    def administratorAccount(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionAdministratorAccountArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionAdministratorAccountArgs.builder
      builder.administratorAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder)
    /**
     * @param fridaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def fridaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionFridayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionFridayScheduleArgs.builder
      builder.fridaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param mondaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def mondaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionMondayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionMondayScheduleArgs.builder
      builder.mondaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param saturdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def saturdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSaturdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSaturdayScheduleArgs.builder
      builder.saturdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param sundaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def sundaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSundayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSundayScheduleArgs.builder
      builder.sundaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param thursdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def thursdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionThursdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionThursdayScheduleArgs.builder
      builder.thursdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param tuesdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def tuesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionTuesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionTuesdayScheduleArgs.builder
      builder.tuesdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param wednesdaySchedules One or more `dailySchedule` blocks as defined below.
     * 
     *  &gt; **Note:** Exactly one of `allWeekSchedule` or at least one individual daily schedule block must be specified.
     * 
     *  &gt; **Note:** Please refer to [Microsoft documentation](https://learn.microsoft.com/azure/devops/managed-devops-pools/configure-scaling?view=azure-devops&amp;tabs=azure-cli#manual) for more information about the manual predictions setup.
     * @return builder
     */
    def wednesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionWednesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionWednesdayScheduleArgs.builder
      builder.wednesdaySchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param userRoleAssignments A `userRoleAssignment` block as defined below.
     * @return builder
     */
    def userRoleAssignments(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeState.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.builder
      builder.userRoleAssignments(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder)
    /**
     * @param automaticResourcePrediction An `automaticResourcePrediction` block as defined below.
     * @return builder
     */
    def automaticResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentAutomaticResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentAutomaticResourcePredictionArgs.builder
      builder.automaticResourcePrediction(args(argsBuilder).build)

    /**
     * @param manualResourcePrediction A `manualResourcePrediction` block as defined below.
     * 
     *  &gt; **Note:** Exactly one of `manualResourcePrediction` or `automaticResourcePrediction` may be specified.
     * @return builder
     */
    def manualResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.builder
      builder.manualResourcePrediction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.DevCenterState.Builder)
    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.DevCenterState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.inputs.DevCenterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devcenter.inputs.ProjectState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.inputs.ProjectState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devcenter.inputs.CatalogState.Builder)
    /**
     * @param catalogAdogit A `catalogAdogit` block as defined below.
     * @return builder
     */
    def catalogAdogit(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.builder
      builder.catalogAdogit(args(argsBuilder).build)

    /**
     * @param catalogGithub A `catalogGithub` block as defined below.
     * @return builder
     */
    def catalogGithub(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.builder
      builder.catalogGithub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.Builder)
    /**
     * @param keyVaultManagement A `keyVaultManagement` block as defined below.
     * @return builder
     */
    def keyVaultManagement(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityKeyVaultManagementArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityKeyVaultManagementArgs.builder
      builder.keyVaultManagement(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder)
    /**
     * @param automaticResourcePrediction An `automaticResourcePrediction` block as defined below.
     * @return builder
     */
    def automaticResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentAutomaticResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentAutomaticResourcePredictionArgs.builder
      builder.automaticResourcePrediction(args(argsBuilder).build)

    /**
     * @param manualResourcePrediction A `manualResourcePrediction` block as defined below.
     * @return builder
     */
    def manualResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.builder
      builder.manualResourcePrediction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder)
    /**
     * @param azureDevopsOrganization An `azureDevopsOrganization` block as defined below.
     * @return builder
     */
    def azureDevopsOrganization(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.builder
      builder.azureDevopsOrganization(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param statefulAgent A `statefulAgent` block as defined below.
     * @return builder
     */
    def statefulAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.builder
      builder.statefulAgent(args(argsBuilder).build)

    /**
     * @param statelessAgent A `statelessAgent` block as defined below.
     * 
     *  &gt; **Note:** Exactly one of `statefulAgent` or `statelessAgent` must be specified.
     * @return builder
     */
    def statelessAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.builder
      builder.statelessAgent(args(argsBuilder).build)

    /**
     * @param virtualMachineScaleSetFabric A `virtualMachineScaleSetFabric` block as defined below.
     * @return builder
     */
    def virtualMachineScaleSetFabric(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.builder
      builder.virtualMachineScaleSetFabric(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder)
    /**
     * @param images One or more `image` blocks as defined below.
     * @return builder
     */
    def images(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricImageArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricImageArgs.builder
      builder.images(args.map(_(argsBuilder).build)*)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricStorageArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder)
    /**
     * @param fridaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def fridaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionFridayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionFridayScheduleArgs.builder
      builder.fridaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param mondaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def mondaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionMondayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionMondayScheduleArgs.builder
      builder.mondaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param saturdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def saturdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSaturdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSaturdayScheduleArgs.builder
      builder.saturdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param sundaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def sundaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSundayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSundayScheduleArgs.builder
      builder.sundaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param thursdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def thursdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionThursdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionThursdayScheduleArgs.builder
      builder.thursdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param tuesdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    def tuesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionTuesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionTuesdayScheduleArgs.builder
      builder.tuesdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param wednesdaySchedules One or more `dailySchedule` blocks as defined below.
     * 
     *  &gt; **Note:** Exactly one of `allWeekSchedule` or at least one individual daily schedule block must be specified.
     * 
     *  &gt; **Note:** Please refer to [Microsoft documentation](https://learn.microsoft.com/azure/devops/managed-devops-pools/configure-scaling?view=azure-devops&amp;tabs=azure-cli#manual) for more information about the manual predictions setup.
     * @return builder
     */
    def wednesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionWednesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionWednesdayScheduleArgs.builder
      builder.wednesdaySchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devcenter.CatalogArgs.Builder)
    /**
     * @param catalogAdogit A `catalogAdogit` block as defined below.
     * @return builder
     */
    def catalogAdogit(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.Builder]):
        com.pulumi.azure.devcenter.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.builder
      builder.catalogAdogit(args(argsBuilder).build)

    /**
     * @param catalogGithub A `catalogGithub` block as defined below.
     * @return builder
     */
    def catalogGithub(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.Builder]):
        com.pulumi.azure.devcenter.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.builder
      builder.catalogGithub(args(argsBuilder).build)

  /** Manages a Dev Center Project Pool. */
  def ProjectPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devcenter.ProjectPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devcenter.ProjectPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devcenter.ProjectPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
