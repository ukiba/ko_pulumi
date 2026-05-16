package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object servicenetworking:
  object ServicenetworkingFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    inline def getPeeredDnsDomain(args: Endofunction[com.pulumi.gcp.servicenetworking.inputs.GetPeeredDnsDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.servicenetworking.outputs.GetPeeredDnsDomainResult] =
      val argsBuilder = com.pulumi.gcp.servicenetworking.inputs.GetPeeredDnsDomainArgs.builder
      com.pulumi.gcp.servicenetworking.ServicenetworkingFunctions.getPeeredDnsDomain(args(argsBuilder).build)

    inline def getPeeredDnsDomainPlain(args: Endofunction[com.pulumi.gcp.servicenetworking.inputs.GetPeeredDnsDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.servicenetworking.outputs.GetPeeredDnsDomainResult] =
      val argsBuilder = com.pulumi.gcp.servicenetworking.inputs.GetPeeredDnsDomainPlainArgs.builder
      com.pulumi.gcp.servicenetworking.ServicenetworkingFunctions.getPeeredDnsDomainPlain(args(argsBuilder).build)

  /**
   * Manages the VPC Service Controls configuration for a service
   *  networking connection
   * 
   *  When enabled, Google Cloud makes the following
   *  route configuration changes in the service producer VPC network:
   *  - Removes the IPv4 default route (destination 0.0.0.0/0,
   *    next hop default internet gateway), Google Cloud then creates an
   *    IPv4 route for destination 199.36.153.4/30 using the default
   *    internet gateway next hop.
   *  - Creates Cloud DNS managed private zones and authorizes those zones
   *    for the service producer VPC network. The zones include
   *    googleapis.com, gcr.io, pkg.dev, notebooks.cloud.google.com,
   *    kernels.googleusercontent.com, backupdr.cloud.google.com, and
   *    backupdr.googleusercontent.com as necessary domains or host names
   *    for Google APIs and services that are compatible with VPC Service
   *    Controls. Record data in the zones resolves all host names to
   *    199.36.153.4, 199.36.153.5, 199.36.153.6, and 199.36.153.7.
   * 
   *  When disabled, Google Cloud makes the following route configuration
   *  changes in the service producer VPC network:
   *  - Restores a default route (destination 0.0.0.0/0, next hop default
   *    internet gateway)
   *  - Deletes the Cloud DNS managed private zones that provided the host
   *    name overrides.
   * 
   *  To get more information about VPCServiceControls, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-infrastructure/docs/service-networking/reference/rest/v1/services)
   *  * How-to Guides
   *      * [Enable VPC Service Controls for service networking](https://cloud.google.com/sdk/gcloud/reference/services/vpc-peerings/enable-vpc-service-controls)
   *      * [Private Google Access with VPC Service Controls](https://cloud.google.com/vpc-service-controls/docs/private-connectivity)
   *      * [Set up private connectivity to Google APIs and services](https://cloud.google.com/vpc-service-controls/docs/set-up-private-connectivity)
   * 
   *  &gt; **Note:** Destroying a `gcp.servicenetworking.VpcServiceControls`
   *  resource will remove it from state, but will not change the
   *  underlying VPC Service Controls configuration for the service
   *  producer network.
   */
  def VpcServiceControls(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicenetworking.VpcServiceControlsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.servicenetworking.VpcServiceControlsArgs.builder
    com.pulumi.gcp.servicenetworking.VpcServiceControls(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows management of a single peered DNS domain for an existing Google Cloud Platform project.
   * 
   *  When using Google Cloud DNS to manage internal DNS, create peered DNS domains to make your DNS available to services like Google Cloud Build.
   * 
   *  For more information see [the API](https://cloud.google.com/service-infrastructure/docs/service-networking/reference/rest/v1/services.projects.global.networks.peeredDnsDomains)
   */
  def PeeredDnsDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicenetworking.PeeredDnsDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.servicenetworking.PeeredDnsDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.servicenetworking.PeeredDnsDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a private VPC connection with a GCP service provider. For more information see
   *  [the official documentation](https://cloud.google.com/vpc/docs/configure-private-services-access#creating-connection)
   *  and
   *  [API](https://cloud.google.com/service-infrastructure/docs/service-networking/reference/rest/v1/services.connections).
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicenetworking.ConnectionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.servicenetworking.ConnectionArgs.builder
    com.pulumi.gcp.servicenetworking.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
