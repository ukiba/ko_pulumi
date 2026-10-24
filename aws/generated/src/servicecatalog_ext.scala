package jp.ukiba.ko_pulumi
package aws

object servicecatalog_ext:
  extension (builder: com.pulumi.aws.servicecatalog.ProductArgs.Builder)
    /**
     * @param provisioningArtifactParameters Configuration block for provisioning artifact (i.e., version) parameters. See `provisioningArtifactParameters` Block for details.
     * @return builder
     */
    inline def provisioningArtifactParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.Builder]):
        com.pulumi.aws.servicecatalog.ProductArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.builder
      builder.provisioningArtifactParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.ProvisionedProductArgs.Builder)
    /**
     * @param provisioningParameters Configuration block with parameters specified by the administrator that are required for provisioning the product. See `provisioningParameters` Block for details.
     * @return builder
     */
    inline def provisioningParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.Builder]*):
        com.pulumi.aws.servicecatalog.ProvisionedProductArgs.Builder =
      def argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.builder
      builder.provisioningParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stackSetProvisioningPreferences Configuration block with information about the provisioning preferences for a stack set. See `stackSetProvisioningPreferences` Block for details.
     * @return builder
     */
    inline def stackSetProvisioningPreferences(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.Builder]):
        com.pulumi.aws.servicecatalog.ProvisionedProductArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.builder
      builder.stackSetProvisioningPreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.ServiceActionArgs.Builder)
    /**
     * @param definition Self-service action definition configuration block. Detailed below.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.Builder]):
        com.pulumi.aws.servicecatalog.ServiceActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.inputs.ProductState.Builder)
    /**
     * @param provisioningArtifactParameters Configuration block for provisioning artifact (i.e., version) parameters. See `provisioningArtifactParameters` Block for details.
     * @return builder
     */
    inline def provisioningArtifactParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.Builder]):
        com.pulumi.aws.servicecatalog.inputs.ProductState.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.builder
      builder.provisioningArtifactParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder)
    /**
     * @param outputs The set of outputs for the product created.
     * @return builder
     */
    inline def outputs(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductOutputArgs.Builder]*):
        com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder =
      def argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductOutputArgs.builder
      builder.outputs(args.map(_(argsBuilder).build)*)

    /**
     * @param provisioningParameters Configuration block with parameters specified by the administrator that are required for provisioning the product. See `provisioningParameters` Block for details.
     * @return builder
     */
    inline def provisioningParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.Builder]*):
        com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder =
      def argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.builder
      builder.provisioningParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stackSetProvisioningPreferences Configuration block with information about the provisioning preferences for a stack set. See `stackSetProvisioningPreferences` Block for details.
     * @return builder
     */
    inline def stackSetProvisioningPreferences(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.Builder]):
        com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.builder
      builder.stackSetProvisioningPreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.inputs.ServiceActionState.Builder)
    /**
     * @param definition Self-service action definition configuration block. Detailed below.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.Builder]):
        com.pulumi.aws.servicecatalog.inputs.ServiceActionState.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)
