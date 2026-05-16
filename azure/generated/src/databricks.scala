package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object databricks:
  /** Manages a Databricks Workspace */
  def WorkspaceCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databricks.WorkspaceCustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.databricks.WorkspaceCustomerManagedKeyArgs.builder
    com.pulumi.azure.databricks.WorkspaceCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Databricks Access Connector */
  def AccessConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databricks.AccessConnectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.databricks.AccessConnectorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.databricks.AccessConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Customer Managed Key for the Databricks Workspaces Root Databricks File System (DBFS) */
  def WorkspaceRootDbfsCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databricks.WorkspaceRootDbfsCustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.databricks.WorkspaceRootDbfsCustomerManagedKeyArgs.builder
    com.pulumi.azure.databricks.WorkspaceRootDbfsCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.databricks.WorkspaceArgs.Builder)
    /**
     * @param customParameters A `customParameters` block as documented below.
     * @return builder
     */
    def customParameters(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.Builder]):
        com.pulumi.azure.databricks.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.builder
      builder.customParameters(args(argsBuilder).build)

    /**
     * @param enhancedSecurityCompliance An `enhancedSecurityCompliance` block as documented below. This feature is only valid if `sku` is set to `premium`.
     * @return builder
     */
    def enhancedSecurityCompliance(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.Builder]):
        com.pulumi.azure.databricks.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.builder
      builder.enhancedSecurityCompliance(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.databricks.WorkspaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object DatabricksFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Databricks Access Connector. */
    inline def getAccessConnector(args: Endofunction[com.pulumi.azure.databricks.inputs.GetAccessConnectorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databricks.outputs.GetAccessConnectorResult] =
      val argsBuilder = com.pulumi.azure.databricks.inputs.GetAccessConnectorArgs.builder
      com.pulumi.azure.databricks.DatabricksFunctions.getAccessConnector(args(argsBuilder).build)

    /** Use this data source to access information about an existing Databricks Access Connector. */
    inline def getAccessConnectorPlain(args: Endofunction[com.pulumi.azure.databricks.inputs.GetAccessConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databricks.outputs.GetAccessConnectorResult] =
      val argsBuilder = com.pulumi.azure.databricks.inputs.GetAccessConnectorPlainArgs.builder
      com.pulumi.azure.databricks.DatabricksFunctions.getAccessConnectorPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Databricks workspace. */
    inline def getWorkspace(args: Endofunction[com.pulumi.azure.databricks.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databricks.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.databricks.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.databricks.DatabricksFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Databricks workspace. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.azure.databricks.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databricks.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.databricks.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.databricks.DatabricksFunctions.getWorkspacePlain(args(argsBuilder).build)

    /** Use this data source to access information on an existing Databricks Workspace private endpoint connection state. */
    inline def getWorkspacePrivateEndpointConnection(args: Endofunction[com.pulumi.azure.databricks.inputs.GetWorkspacePrivateEndpointConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.databricks.outputs.GetWorkspacePrivateEndpointConnectionResult] =
      val argsBuilder = com.pulumi.azure.databricks.inputs.GetWorkspacePrivateEndpointConnectionArgs.builder
      com.pulumi.azure.databricks.DatabricksFunctions.getWorkspacePrivateEndpointConnection(args(argsBuilder).build)

    /** Use this data source to access information on an existing Databricks Workspace private endpoint connection state. */
    inline def getWorkspacePrivateEndpointConnectionPlain(args: Endofunction[com.pulumi.azure.databricks.inputs.GetWorkspacePrivateEndpointConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.databricks.outputs.GetWorkspacePrivateEndpointConnectionResult] =
      val argsBuilder = com.pulumi.azure.databricks.inputs.GetWorkspacePrivateEndpointConnectionPlainArgs.builder
      com.pulumi.azure.databricks.DatabricksFunctions.getWorkspacePrivateEndpointConnectionPlain(args(argsBuilder).build)

  /** Manages a Databricks Virtual Network Peering */
  def VirtualNetworkPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databricks.VirtualNetworkPeeringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.databricks.VirtualNetworkPeeringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.databricks.VirtualNetworkPeering(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.databricks.AccessConnectorArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.Builder]):
        com.pulumi.azure.databricks.AccessConnectorArgs.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.databricks.AccessConnectorArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Databricks Workspace */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.databricks.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.databricks.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.databricks.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.databricks.inputs.AccessConnectorState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.Builder]):
        com.pulumi.azure.databricks.inputs.AccessConnectorState.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.databricks.inputs.AccessConnectorState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.databricks.inputs.WorkspaceState.Builder)
    /**
     * @param customParameters A `customParameters` block as documented below.
     * @return builder
     */
    def customParameters(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.Builder]):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.builder
      builder.customParameters(args(argsBuilder).build)

    /**
     * @param enhancedSecurityCompliance An `enhancedSecurityCompliance` block as documented below. This feature is only valid if `sku` is set to `premium`.
     * @return builder
     */
    def enhancedSecurityCompliance(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.Builder]):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.builder
      builder.enhancedSecurityCompliance(args(argsBuilder).build)

    /**
     * @param managedDiskIdentities A `managedDiskIdentity` block as documented below.
     * @return builder
     */
    def managedDiskIdentities(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceManagedDiskIdentityArgs.Builder]*):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      def argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceManagedDiskIdentityArgs.builder
      builder.managedDiskIdentities(args.map(_(argsBuilder).build)*)

    /**
     * @param storageAccountIdentities A `storageAccountIdentity` block as documented below.
     * @return builder
     */
    def storageAccountIdentities(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceStorageAccountIdentityArgs.Builder]*):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      def argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceStorageAccountIdentityArgs.builder
      builder.storageAccountIdentities(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
