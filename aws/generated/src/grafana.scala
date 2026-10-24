package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object grafana:
  object GrafanaFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides an Amazon Managed Grafana workspace data source. */
    inline def getWorkspace(args: Endofunction[com.pulumi.aws.grafana.inputs.GetWorkspaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.grafana.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.grafana.inputs.GetWorkspaceArgs.builder
      com.pulumi.aws.grafana.GrafanaFunctions.getWorkspace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides an Amazon Managed Grafana workspace data source. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.aws.grafana.inputs.GetWorkspacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.grafana.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.grafana.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.aws.grafana.GrafanaFunctions.getWorkspacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an Amazon Managed Grafana workspace license association resource. */
  def LicenseAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.LicenseAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.grafana.LicenseAssociationArgs.builder
    com.pulumi.aws.grafana.LicenseAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Amazon Managed Grafana workspace role association resource. */
  def RoleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.RoleAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.grafana.RoleAssociationArgs.builder
    com.pulumi.aws.grafana.RoleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Amazon Managed Grafana workspace resource. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.grafana.WorkspaceArgs.builder
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
    com.pulumi.aws.grafana.Workspace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Amazon Managed Grafana workspace API Key resource. */
  def WorkspaceApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceApiKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.grafana.WorkspaceApiKeyArgs.builder
    com.pulumi.aws.grafana.WorkspaceApiKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Amazon Managed Grafana workspace SAML configuration resource. */
  def WorkspaceSamlConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceSamlConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.grafana.WorkspaceSamlConfigurationArgs.builder
    com.pulumi.aws.grafana.WorkspaceSamlConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **Note:** You cannot update a service account. If you change any attribute, Terraform
   * will delete the current and create a new one.
   * 
   * Read about Service Accounts in the [Amazon Managed Grafana user guide](https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html).
   */
  def WorkspaceServiceAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceServiceAccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.grafana.WorkspaceServiceAccountArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.grafana.WorkspaceServiceAccount(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **Note:** You cannot update a service account token. If you change any attribute, Terraform
   * will delete the current and create a new one.
   * 
   * Read about Service Accounts Tokens in the [Amazon Managed Grafana user guide](https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html#service-account-tokens).
   */
  def WorkspaceServiceAccountToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceServiceAccountTokenArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.grafana.WorkspaceServiceAccountTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.grafana.WorkspaceServiceAccountToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
