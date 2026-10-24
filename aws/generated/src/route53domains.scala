package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object route53domains:
  /** Provides a resource to manage a [delegation signer record](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html#dns-configuring-dnssec-enable-signing-step-1) in the parent DNS zone for domains registered with Route53. */
  def DelegationSignerRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53domains.DelegationSignerRecordArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.route53domains.DelegationSignerRecordArgs.builder
    com.pulumi.aws.route53domains.DelegationSignerRecord(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage a domain. This resource registers, renews and deregisters a domain name. If a domain name&#39;s lifecycle is managed outside of Terraform use the `aws.route53domains.RegisteredDomain` resource instead. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53domains.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53domains.DomainArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.route53domains.Domain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to manage a domain that has been [registered](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html) and associated with the current AWS account. To register, renew and deregister a domain use the `aws.route53domains.Domain` resource instead.
   * 
   * **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
   * 
   * The `aws.route53domains.RegisteredDomain` resource behaves differently from normal resources in that if a domain has been registered, the provider does not _register_ this domain, but instead &#34;adopts&#34; it into management. A destroy does not delete the domain but does remove the resource from state.
   */
  def RegisteredDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53domains.RegisteredDomainArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.route53domains.RegisteredDomain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
