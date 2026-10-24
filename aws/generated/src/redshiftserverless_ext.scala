package jp.ukiba.ko_pulumi
package aws

object redshiftserverless_ext:
  extension (builder: com.pulumi.aws.redshiftserverless.WorkgroupArgs.Builder)
    /**
     * @param configParameters An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
     * @return builder
     */
    def configParameters(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupConfigParameterArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.WorkgroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupConfigParameterArgs.builder
      builder.configParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param pricePerformanceTarget Price-performance scaling for the workgroup. See `Price Performance Target` below.
     * @return builder
     */
    def pricePerformanceTarget(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupPricePerformanceTargetArgs.Builder]):
        com.pulumi.aws.redshiftserverless.WorkgroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupPricePerformanceTargetArgs.builder
      builder.pricePerformanceTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshiftserverless.inputs.EndpointAccessState.Builder)
    /**
     * @param vpcEndpoints The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * @return builder
     */
    def vpcEndpoints(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.EndpointAccessVpcEndpointArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.inputs.EndpointAccessState.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.EndpointAccessVpcEndpointArgs.builder
      builder.vpcEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshiftserverless.inputs.EndpointAccessVpcEndpointArgs.Builder)
    /**
     * @param networkInterfaces The network interfaces of the endpoint.. See `Network Interface` below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.EndpointAccessVpcEndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.inputs.EndpointAccessVpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.EndpointAccessVpcEndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointArgs.Builder)
    /**
     * @param vpcEndpoints The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * @return builder
     */
    def vpcEndpoints(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointArgs.builder
      builder.vpcEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointArgs.Builder)
    /**
     * @param networkInterfaces The network interfaces of the endpoint.. See `Network Interface` below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshiftserverless.inputs.WorkgroupState.Builder)
    /**
     * @param configParameters An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
     * @return builder
     */
    def configParameters(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupConfigParameterArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.inputs.WorkgroupState.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupConfigParameterArgs.builder
      builder.configParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param endpoints The endpoint that is created from the workgroup. See `Endpoint` below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.inputs.WorkgroupState.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param pricePerformanceTarget Price-performance scaling for the workgroup. See `Price Performance Target` below.
     * @return builder
     */
    def pricePerformanceTarget(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupPricePerformanceTargetArgs.Builder]):
        com.pulumi.aws.redshiftserverless.inputs.WorkgroupState.Builder =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupPricePerformanceTargetArgs.builder
      builder.pricePerformanceTarget(args(argsBuilder).build)
