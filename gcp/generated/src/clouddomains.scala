package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object clouddomains:
  /**
   * Registers a new domain name and creates a corresponding Registration resource.
   * 
   * To get more information about Registration, see:
   * 
   * * [API documentation](https://cloud.google.com/domains/docs/reference/rest/v1/projects.locations.registrations)
   * * How-to Guides
   *     * [Register a domain with Cloud Domains](https://cloud.google.com/domains/docs/buy-register-domain)
   * 
   * &gt; **Warning:** The Terraform implementation of this resource will not actually delete a Registration during
   * `terraform destroy`. Instead it will &#34;abandon&#34; the resource and remove it from state.
   * For information on deleting a registered domain, see https://cloud.google.com/domains/docs/delete-domain
   */
  def Registration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.clouddomains.RegistrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.clouddomains.RegistrationArgs.builder
    com.pulumi.gcp.clouddomains.Registration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
