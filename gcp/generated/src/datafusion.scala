package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object datafusion:
  extension (builder: com.pulumi.gcp.datafusion.InstanceArgs.Builder)
    /**
     * @param accelerators List of accelerators enabled for this CDF instance.
     *  If accelerators are enabled it is possible a permadiff will be created with the Options field.
     *  Users will need to either manually update their state file to include these diffed options, or include the field in a lifecycle ignore changes block.
     *  Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.Builder]*):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKeyConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.builder
      builder.cryptoKeyConfig(args(argsBuilder).build)

    /**
     * @param eventPublishConfig Option to enable and pass metadata for event publishing.
     *  Structure is documented below.
     * @return builder
     */
    def eventPublishConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.builder
      builder.eventPublishConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration options. These are required when a private Data Fusion instance is to be created.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Represents a Data Fusion instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-fusion/docs/)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datafusion.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.datafusion.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.datafusion.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type DatafusionFunctions = com.pulumi.gcp.datafusion.DatafusionFunctions
  object DatafusionFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.datafusion.DatafusionFunctions.*
  extension (self: DatafusionFunctions.type)
    /** Retrieves the current IAM policy data for instance */
    def getInstanceIamPolicy(args: Endofunction[com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datafusion.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyArgs.builder
      com.pulumi.gcp.datafusion.DatafusionFunctions.getInstanceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for instance */
    def getInstanceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datafusion.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyPlainArgs.builder
      com.pulumi.gcp.datafusion.DatafusionFunctions.getInstanceIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder)
    /**
     * @param privateServiceConnectConfig Optional. Configuration for Private Service Connect.
     *  This is required only when using connection type PRIVATE_SERVICE_CONNECT_INTERFACES.
     *  Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datafusion.inputs.InstanceState.Builder)
    /**
     * @param accelerators List of accelerators enabled for this CDF instance.
     *  If accelerators are enabled it is possible a permadiff will be created with the Options field.
     *  Users will need to either manually update their state file to include these diffed options, or include the field in a lifecycle ignore changes block.
     *  Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.Builder]*):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKeyConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.builder
      builder.cryptoKeyConfig(args(argsBuilder).build)

    /**
     * @param eventPublishConfig Option to enable and pass metadata for event publishing.
     *  Structure is documented below.
     * @return builder
     */
    def eventPublishConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.builder
      builder.eventPublishConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration options. These are required when a private Data Fusion instance is to be created.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
