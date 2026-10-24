package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object resourcemanager:
  /**
   * An app-enabled folder is a folder within the Google Cloud resource hierarchy that has been configured for application management. This folder lets you define and manage App Hub applications. These applications are functional groupings of services and workloads that span multiple projects within that folder and its descendant projects.
   * 
   * To get more information about Capability, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/resource-manager/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/resource-manager/docs/manage-applications)
   */
  inline def Capability(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.resourcemanager.CapabilityArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.resourcemanager.CapabilityArgs.builder
    com.pulumi.gcp.resourcemanager.Capability(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Capability configs define the enabled capabilities and their scope of
   * enforcement for folders, organizations, or projects within the resource hierarchy.
   * 
   * To get more information about CapabilityConfig, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/resource-manager/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/resource-manager/docs/manage-applications)
   */
  inline def CapabilityConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.resourcemanager.CapabilityConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.resourcemanager.CapabilityConfigArgs.builder
    com.pulumi.gcp.resourcemanager.CapabilityConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Lien represents an encumbrance on the actions that can be performed on a resource.
   * 
   * To get more information about Lien, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/resource-manager/reference/rest)
   * * How-to Guides
   *     * [Create a Lien](https://docs.cloud.google.com/resource-manager/docs/project-liens)
   */
  inline def Lien(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.resourcemanager.LienArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.resourcemanager.LienArgs.builder
    com.pulumi.gcp.resourcemanager.Lien(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
