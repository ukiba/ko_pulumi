package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object redshiftserverless:
  /** Resource for managing an AWS Redshift Serverless Custom Domain Association. */
  def CustomDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.CustomDomainAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.CustomDomainAssociationArgs.builder
    com.pulumi.aws.redshiftserverless.CustomDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift Serverless Workgroup. */
  def Workgroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.WorkgroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshiftserverless.WorkgroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.redshiftserverless.Workgroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a new Amazon Redshift Serverless Namespace.
   * 
   *  &gt; **Note:** Write-Only argument `adminPasswordWo` is available to use in place of `adminPassword`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.NamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshiftserverless.NamespaceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.redshiftserverless.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift Serverless Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.ResourcePolicyArgs.builder
    com.pulumi.aws.redshiftserverless.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift Serverless Snapshot. */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.SnapshotArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.SnapshotArgs.builder
    com.pulumi.aws.redshiftserverless.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift Serverless Endpoint Access. */
  def EndpointAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.EndpointAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.EndpointAccessArgs.builder
    com.pulumi.aws.redshiftserverless.EndpointAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object RedshiftserverlessFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides redshift serverless temporary credentials for a workgroup. */
    inline def getCredentials(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetCredentialsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.redshiftserverless.outputs.GetCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetCredentialsArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getCredentials(args(argsBuilder).build)

    /** Provides redshift serverless temporary credentials for a workgroup. */
    inline def getCredentialsPlain(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetCredentialsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshiftserverless.outputs.GetCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetCredentialsPlainArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getCredentialsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Redshift Serverless Namespace. */
    inline def getNamespace(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.redshiftserverless.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetNamespaceArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getNamespace(args(argsBuilder).build)

    /** Data source for managing an AWS Redshift Serverless Namespace. */
    inline def getNamespacePlain(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshiftserverless.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetNamespacePlainArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getNamespacePlain(args(argsBuilder).build)

    /** Data source for managing an AWS Redshift Serverless Workgroup. */
    inline def getWorkgroup(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.redshiftserverless.outputs.GetWorkgroupResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getWorkgroup(args(argsBuilder).build)

    /** Data source for managing an AWS Redshift Serverless Workgroup. */
    inline def getWorkgroupPlain(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshiftserverless.outputs.GetWorkgroupResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupPlainArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getWorkgroupPlain(args(argsBuilder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.redshiftserverless.WorkgroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Creates a new Amazon Redshift Serverless Usage Limit. */
  def UsageLimit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.UsageLimitArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.UsageLimitArgs.builder
    com.pulumi.aws.redshiftserverless.UsageLimit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointArgs.Builder)
    /**
     * @param networkInterfaces The network interfaces of the endpoint.. See `Network Interface` below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshiftserverless.inputs.WorkgroupEndpointVpcEndpointNetworkInterfaceArgs.builder
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.redshiftserverless.inputs.WorkgroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
