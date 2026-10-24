package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object datastream:
  /**
   * A set of reusable connection configurations to be used as a source or destination for a stream.
   * 
   * To get more information about ConnectionProfile, see:
   * 
   * * [API documentation](https://cloud.google.com/datastream/docs/reference/rest/v1/projects.locations.connectionProfiles)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/datastream/docs/create-connection-profiles)
   */
  def ConnectionProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.datastream.ConnectionProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.datastream.ConnectionProfileArgs.builder
    com.pulumi.gcp.datastream.ConnectionProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DatastreamFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Returns the list of IP addresses that Datastream connects from. For more information see
     * the [official documentation](https://cloud.google.com/datastream/docs/ip-allowlists-and-regions).
     */
    inline def getStaticIps(args: Endofunction[com.pulumi.gcp.datastream.inputs.GetStaticIpsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.datastream.outputs.GetStaticIpsResult] =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.GetStaticIpsArgs.builder
      com.pulumi.gcp.datastream.DatastreamFunctions.getStaticIps(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Returns the list of IP addresses that Datastream connects from. For more information see
     * the [official documentation](https://cloud.google.com/datastream/docs/ip-allowlists-and-regions).
     */
    inline def getStaticIpsPlain(args: Endofunction[com.pulumi.gcp.datastream.inputs.GetStaticIpsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datastream.outputs.GetStaticIpsResult] =
      val argsBuilder = com.pulumi.gcp.datastream.inputs.GetStaticIpsPlainArgs.builder
      com.pulumi.gcp.datastream.DatastreamFunctions.getStaticIpsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * The PrivateConnection resource is used to establish private connectivity between Datastream and a customer&#39;s network.
   * 
   * To get more information about PrivateConnection, see:
   * 
   * * [API documentation](https://cloud.google.com/datastream/docs/reference/rest/v1/projects.locations.privateConnections)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/datastream/docs/create-a-private-connectivity-configuration)
   */
  def PrivateConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.datastream.PrivateConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.datastream.PrivateConnectionArgs.builder
    com.pulumi.gcp.datastream.PrivateConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A resource representing streaming data from a source to a destination.
   * 
   * To get more information about Stream, see:
   * 
   * * [API documentation](https://cloud.google.com/datastream/docs/reference/rest/v1/projects.locations.streams)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/datastream/docs/create-a-stream)
   */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.datastream.StreamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.datastream.StreamArgs.builder
    com.pulumi.gcp.datastream.Stream(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
