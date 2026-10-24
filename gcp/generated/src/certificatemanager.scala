package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object certificatemanager:
  /**
   * Certificate represents a HTTP-reachable backend for a Certificate.
   * 
   * To get more information about Certificate, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.certificates)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/certificate-manager/docs/certificates)
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `self_managed.pem_private_key_wo`.
   * Read more about Write-only Arguments.
   */
  inline def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Certificate represents a HTTP-reachable backend for a Certificate.
   * 
   * To get more information about CertificateIssuanceConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.certificateIssuanceConfigs)
   * * How-to Guides
   *     * [Manage certificate issuance configs](https://cloud.google.com/certificate-manager/docs/issuance-configs)
   */
  inline def CertificateIssuanceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.CertificateIssuanceConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * CertificateMap defines a collection of certificate configurations,
   * which are usable by any associated target proxies
   */
  inline def CertificateMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateMapArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateMapArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.CertificateMap(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * CertificateMapEntry is a list of certificate configurations,
   * that have been issued for a particular hostname
   */
  inline def CertificateMapEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateMapEntryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateMapEntryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.CertificateMapEntry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CertificatemanagerFunctions:
    /** Get info about a Google Certificate Manager Certificate Map resource. */
    inline def getCertificateMap(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificatemanager.outputs.GetCertificateMapResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificateMap(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get info about a Google Certificate Manager Certificate Map resource. */
    inline def getCertificateMapPlain(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificatemanager.outputs.GetCertificateMapResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapPlainArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificateMapPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** List all certificates within Google Certificate Manager for a given project, region or filter. */
    inline def getCertificates(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificatemanager.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificatesArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** List all certificates within Google Certificate Manager for a given project, region or filter. */
    inline def getCertificatesPlain(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificatemanager.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificatesPlainArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about a Certificate Manager DNS Authorization. For more details, see the [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.dnsAuthorizations). */
    inline def getDnsAuthorization(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificatemanager.outputs.GetDnsAuthorizationResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getDnsAuthorization(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a Certificate Manager DNS Authorization. For more details, see the [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.dnsAuthorizations). */
    inline def getDnsAuthorizationPlain(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificatemanager.outputs.GetDnsAuthorizationResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationPlainArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getDnsAuthorizationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** DnsAuthorization represents a HTTP-reachable backend for a DnsAuthorization. */
  inline def DnsAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.DnsAuthorizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.DnsAuthorizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.DnsAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * TrustConfig represents a resource that represents your Public Key Infrastructure (PKI) configuration in Certificate Manager for use in mutual TLS authentication scenarios.
   * 
   * To get more information about TrustConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.trustConfigs/create)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/certificate-manager/docs)
   */
  inline def TrustConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.TrustConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.TrustConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
