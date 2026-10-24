package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object activedirectory:
  /**
   * Creates a Microsoft AD domain
   * 
   * To get more information about Domain, see:
   * 
   * * [API documentation](https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains)
   * * How-to Guides
   *     * [Managed Microsoft Active Directory Quickstart](https://cloud.google.com/managed-microsoft-ad/docs/quickstarts)
   */
  inline def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.activedirectory.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.activedirectory.DomainArgs.builder
    com.pulumi.gcp.activedirectory.Domain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Adds a trust between Active Directory domains
   * 
   * To get more information about DomainTrust, see:
   * 
   * * [API documentation](https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains/attachTrust)
   * * How-to Guides
   *     * [Active Directory Trust](https://cloud.google.com/managed-microsoft-ad/docs/create-one-way-trust)
   */
  inline def DomainTrust(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.activedirectory.DomainTrustArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.activedirectory.DomainTrustArgs.builder
    com.pulumi.gcp.activedirectory.DomainTrust(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a Peering for Managed AD instance.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Peering, see:
   * 
   * * [API documentation](https://cloud.google.com/managed-microsoft-ad/reference/rest/v1beta1/projects.locations.global.peerings)
   * * How-to Guides
   *     * [Active Directory Domain Peering](https://cloud.google.com/managed-microsoft-ad/docs/domain-peering)
   */
  inline def Peering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.activedirectory.PeeringArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.activedirectory.PeeringArgs.builder
    com.pulumi.gcp.activedirectory.Peering(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
