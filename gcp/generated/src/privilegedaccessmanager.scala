package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
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
  inline def Entitlement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.builder
    com.pulumi.gcp.privilegedaccessmanager.Entitlement(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object PrivilegedaccessmanagerFunctions:
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     */
    inline def getEntitlement(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.privilegedaccessmanager.outputs.GetEntitlementResult] =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs.builder
      com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions.getEntitlement(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     */
    inline def getEntitlementPlain(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.privilegedaccessmanager.outputs.GetEntitlementResult] =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementPlainArgs.builder
      com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions.getEntitlementPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

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
  inline def Settings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.builder
    com.pulumi.gcp.privilegedaccessmanager.Settings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
