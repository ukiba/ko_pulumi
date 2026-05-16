package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object networkmanagement:
  extension (builder: com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.Builder)
    /**
     * @param destination Required. Destination specification of the Connectivity Test.
     *  You can use a combination of destination IP address, URI of a supported
     *  endpoint, project ID, or VPC network to identify the destination location.
     *  Reachability analysis proceeds even if the destination location is
     *  ambiguous. However, the test result might include endpoints or use a
     *  destination that you don&#39;t intend to test.
     *  Structure is documented below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.Builder]):
        com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Required. Source specification of the Connectivity Test.
     *  You can use a combination of source IP address, URI of a supported
     *  endpoint, project ID, or VPC network to identify the source location.
     *  Reachability analysis might proceed even if the source location is
     *  ambiguous. However, the test result might include endpoints or use a source
     *  that you don&#39;t intend to test.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder]):
        com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.builder
      builder.source(args(argsBuilder).build)

  /** VPC Flow Logs Config is a resource that lets you configure Flow Logs for Organization. */
  def OrganizationVpcFlowLogsConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkmanagement.OrganizationVpcFlowLogsConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkmanagement.OrganizationVpcFlowLogsConfigArgs.builder
    com.pulumi.gcp.networkmanagement.OrganizationVpcFlowLogsConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** VPC Flow Logs Config is a resource that lets you configure Flow Logs for Networks, Subnets, Interconnect attachments or VPN Tunnels. */
  def VpcFlowLogsConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkmanagement.VpcFlowLogsConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkmanagement.VpcFlowLogsConfigArgs.builder
    com.pulumi.gcp.networkmanagement.VpcFlowLogsConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object NetworkmanagementFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * !&gt; This datasource triggers side effects on the target resource. It will take a long time to refresh (i.e. `pulumi preview` will take much longer than usual) and may modify the state of the parent resource or other copies of the resource copying the same parent.
     * 
     *  A connectivity test is a static analysis of your resource configurations
     *  that enables you to evaluate connectivity to and from Google Cloud
     *  resources in your Virtual Private Cloud (VPC) network. This data source allows
     *  you to trigger a rerun operation on a connectivity test and return the results.
     * 
     *  To get more information about connectivity tests, see:
     * 
     *  * [API documentation](https://cloud.google.com/network-intelligence-center/docs/reference/networkmanagement/rest/v1/projects.locations.global.connectivityTests/rerun)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/network-intelligence-center/docs)
     */
    inline def getConnectivityTestRun(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestRunArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.networkmanagement.outputs.GetConnectivityTestRunResult] =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestRunArgs.builder
      com.pulumi.gcp.networkmanagement.NetworkmanagementFunctions.getConnectivityTestRun(args(argsBuilder).build)

    /**
     * !&gt; This datasource triggers side effects on the target resource. It will take a long time to refresh (i.e. `pulumi preview` will take much longer than usual) and may modify the state of the parent resource or other copies of the resource copying the same parent.
     * 
     *  A connectivity test is a static analysis of your resource configurations
     *  that enables you to evaluate connectivity to and from Google Cloud
     *  resources in your Virtual Private Cloud (VPC) network. This data source allows
     *  you to trigger a rerun operation on a connectivity test and return the results.
     * 
     *  To get more information about connectivity tests, see:
     * 
     *  * [API documentation](https://cloud.google.com/network-intelligence-center/docs/reference/networkmanagement/rest/v1/projects.locations.global.connectivityTests/rerun)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/network-intelligence-center/docs)
     */
    inline def getConnectivityTestRunPlain(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestRunPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networkmanagement.outputs.GetConnectivityTestRunResult] =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestRunPlainArgs.builder
      com.pulumi.gcp.networkmanagement.NetworkmanagementFunctions.getConnectivityTestRunPlain(args(argsBuilder).build)

    /**
     * A connectivity test is a static analysis of your resource configurations
     *  that enables you to evaluate connectivity to and from Google Cloud
     *  resources in your Virtual Private Cloud (VPC) network. This data source allows
     *  you to list connectivity tests in a project.
     * 
     *  To get more information about connectivity tests, see:
     * 
     *  * [API documentation](https://cloud.google.com/network-intelligence-center/docs/reference/networkmanagement/rest/v1/projects.locations.global.connectivityTests/rerun)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/network-intelligence-center/docs)
     */
    inline def getConnectivityTests(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.networkmanagement.outputs.GetConnectivityTestsResult] =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestsArgs.builder
      com.pulumi.gcp.networkmanagement.NetworkmanagementFunctions.getConnectivityTests(args(argsBuilder).build)

    /**
     * A connectivity test is a static analysis of your resource configurations
     *  that enables you to evaluate connectivity to and from Google Cloud
     *  resources in your Virtual Private Cloud (VPC) network. This data source allows
     *  you to list connectivity tests in a project.
     * 
     *  To get more information about connectivity tests, see:
     * 
     *  * [API documentation](https://cloud.google.com/network-intelligence-center/docs/reference/networkmanagement/rest/v1/projects.locations.global.connectivityTests/rerun)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/network-intelligence-center/docs)
     */
    inline def getConnectivityTestsPlain(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networkmanagement.outputs.GetConnectivityTestsResult] =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.GetConnectivityTestsPlainArgs.builder
      com.pulumi.gcp.networkmanagement.NetworkmanagementFunctions.getConnectivityTestsPlain(args(argsBuilder).build)

  /**
   * A connectivity test are a static analysis of your resource configurations
   *  that enables you to evaluate connectivity to and from Google Cloud
   *  resources in your Virtual Private Cloud (VPC) network.
   * 
   *  To get more information about ConnectivityTest, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-intelligence-center/docs/connectivity-tests/reference/networkmanagement/rest/v1/projects.locations.global.connectivityTests)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/network-intelligence-center/docs)
   */
  def ConnectivityTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkmanagement.ConnectivityTest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder)
    /**
     * @param appEngineVersion An App Engine service version.
     *  Structure is documented below.
     * @return builder
     */
    def appEngineVersion(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceAppEngineVersionArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceAppEngineVersionArgs.builder
      builder.appEngineVersion(args(argsBuilder).build)

    /**
     * @param cloudFunction A Cloud Function.
     *  Structure is documented below.
     * @return builder
     */
    def cloudFunction(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudFunctionArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudFunctionArgs.builder
      builder.cloudFunction(args(argsBuilder).build)

    /**
     * @param cloudRunRevision A Cloud Run revision.
     *  Structure is documented below.
     * @return builder
     */
    def cloudRunRevision(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudRunRevisionArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudRunRevisionArgs.builder
      builder.cloudRunRevision(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState.Builder)
    /**
     * @param destination Required. Destination specification of the Connectivity Test.
     *  You can use a combination of destination IP address, URI of a supported
     *  endpoint, project ID, or VPC network to identify the destination location.
     *  Reachability analysis proceeds even if the destination location is
     *  ambiguous. However, the test result might include endpoints or use a
     *  destination that you don&#39;t intend to test.
     *  Structure is documented below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Required. Source specification of the Connectivity Test.
     *  You can use a combination of source IP address, URI of a supported
     *  endpoint, project ID, or VPC network to identify the source location.
     *  Reachability analysis might proceed even if the source location is
     *  ambiguous. However, the test result might include endpoints or use a source
     *  that you don&#39;t intend to test.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.builder
      builder.source(args(argsBuilder).build)
