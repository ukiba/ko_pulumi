package jp.ukiba.ko_pulumi
package azure

object loadtest_ext:
  extension (builder: com.pulumi.azure.loadtest.LoadTestArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new Load Test to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder]):
        com.pulumi.azure.loadtest.LoadTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Load Test.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.Builder]):
        com.pulumi.azure.loadtest.LoadTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Load Test to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestEncryptionIdentityArgs.Builder]):
        com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestEncryptionIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.loadtest.inputs.LoadTestState.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new Load Test to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder]):
        com.pulumi.azure.loadtest.inputs.LoadTestState.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Load Test.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.Builder]):
        com.pulumi.azure.loadtest.inputs.LoadTestState.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
