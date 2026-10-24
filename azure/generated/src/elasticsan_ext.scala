package jp.ukiba.ko_pulumi
package azure

object elasticsan_ext:
  extension (builder: com.pulumi.azure.elasticsan.ElasticSanArgs.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.Builder]):
        com.pulumi.azure.elasticsan.ElasticSanArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.elasticsan.VolumeArgs.Builder)
    /**
     * @param createSource A `createSource` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def createSource(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.Builder]):
        com.pulumi.azure.elasticsan.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.builder
      builder.createSource(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * 
     * &gt; **Note:** The `encryption` block can only be set when `encryptionType` is set to `EncryptionAtRestWithCustomerManagedKey`.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.Builder]):
        com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.Builder]):
        com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRules One or more `networkRule` blocks as defined below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.Builder]*):
        com.pulumi.azure.elasticsan.VolumeGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticsan.inputs.ElasticSanState.Builder)
    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.ElasticSanState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.ElasticSanSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * 
     * &gt; **Note:** The `encryption` block can only be set when `encryptionType` is set to `EncryptionAtRestWithCustomerManagedKey`.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRules One or more `networkRule` blocks as defined below.
     * @return builder
     */
    def networkRules(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.Builder]*):
        com.pulumi.azure.elasticsan.inputs.VolumeGroupState.Builder =
      def argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeGroupNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticsan.inputs.VolumeState.Builder)
    /**
     * @param createSource A `createSource` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def createSource(args: Endofunction[com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.Builder]):
        com.pulumi.azure.elasticsan.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.elasticsan.inputs.VolumeCreateSourceArgs.builder
      builder.createSource(args(argsBuilder).build)
