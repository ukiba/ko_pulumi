package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object privilegedaccessmanager:
  /**
   * An Entitlement defines the eligibility of a set of users to obtain a predefined access for some time possibly after going through an approval workflow.
   * 
   * To get more information about Entitlement, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
   * * How-to Guides
   *     * [How to create an Entitlement](https://cloud.google.com/iam/docs/pam-create-entitlements)
   *     * [Official Documentation](https://cloud.google.com/iam/docs/pam-overview)
   */
  def Entitlement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.builder
    com.pulumi.gcp.privilegedaccessmanager.Entitlement(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object PrivilegedaccessmanagerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     */
    inline def getEntitlement(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.privilegedaccessmanager.outputs.GetEntitlementResult] =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs.builder
      com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions.getEntitlement(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     */
    inline def getEntitlementPlain(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.privilegedaccessmanager.outputs.GetEntitlementResult] =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementPlainArgs.builder
      com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions.getEntitlementPlain(args(argsBuilder).build)

  /**
   * Settings resource defines the properties, applied directly to the resource or inherited through the hierarchy, to enable consistent, federated use of PAM.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Settings, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/pam/rest/v1beta/folders.locations/updateSettings)
   * * How-to Guides
   *     * [Configure Privileged Access Manager settings](https://cloud.google.com/iam/docs/pam-configure-settings)
   *     * [Official Documentation](https://cloud.google.com/iam/docs/pam-overview)
   */
  def Settings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.builder
    com.pulumi.gcp.privilegedaccessmanager.Settings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
