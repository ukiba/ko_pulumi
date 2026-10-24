package jp.ukiba.ko_pulumi
package gcp

object networkmanagement_ext:
  extension (builder: com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.Builder)
    /**
     * @param destination Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don&#39;t intend to test.
     * Structure is documented below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.Builder]):
        com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don&#39;t intend to test.
     * Structure is documented below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder]):
        com.pulumi.gcp.networkmanagement.ConnectivityTestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder)
    /**
     * @param appEngineVersion An App Engine service version.
     * Structure is documented below.
     * @return builder
     */
    inline def appEngineVersion(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceAppEngineVersionArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceAppEngineVersionArgs.builder
      builder.appEngineVersion(args(argsBuilder).build)

    /**
     * @param cloudFunction A Cloud Function.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudFunction(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudFunctionArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudFunctionArgs.builder
      builder.cloudFunction(args(argsBuilder).build)

    /**
     * @param cloudRunRevision A Cloud Run revision.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudRunRevision(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudRunRevisionArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudRunRevisionArgs.builder
      builder.cloudRunRevision(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState.Builder)
    /**
     * @param destination Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don&#39;t intend to test.
     * Structure is documented below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don&#39;t intend to test.
     * Structure is documented below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.Builder]):
        com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState.Builder =
      val argsBuilder = com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs.builder
      builder.source(args(argsBuilder).build)
