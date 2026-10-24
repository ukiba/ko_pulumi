package jp.ukiba.ko_pulumi
package azure

object networkfunction_ext:
  extension (builder: com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder)
    /**
     * @param ipfxEmission An `ipfxEmission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    inline def ipfxEmission(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.Builder]):
        com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.builder
      builder.ipfxEmission(args(argsBuilder).build)

    /**
     * @param ipfxIngestion An `ipfxIngestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    inline def ipfxIngestion(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.Builder]):
        com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.builder
      builder.ipfxIngestion(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.networkfunction.inputs.CollectorPolicyState.Builder)
    /**
     * @param ipfxEmission An `ipfxEmission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    inline def ipfxEmission(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.Builder]):
        com.pulumi.azure.networkfunction.inputs.CollectorPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.builder
      builder.ipfxEmission(args(argsBuilder).build)

    /**
     * @param ipfxIngestion An `ipfxIngestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    inline def ipfxIngestion(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.Builder]):
        com.pulumi.azure.networkfunction.inputs.CollectorPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.builder
      builder.ipfxIngestion(args(argsBuilder).build)
