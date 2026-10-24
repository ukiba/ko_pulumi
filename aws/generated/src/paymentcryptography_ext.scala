package jp.ukiba.ko_pulumi
package aws

object paymentcryptography_ext:
  extension (builder: com.pulumi.aws.paymentcryptography.KeyArgs.Builder)
    /**
     * @param keyAttributes Role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def keyAttributes(args: Endofunction[com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeArgs.Builder]*):
        com.pulumi.aws.paymentcryptography.KeyArgs.Builder =
      def argsBuilder = com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeArgs.builder
      builder.keyAttributes(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.paymentcryptography.inputs.KeyTimeoutsArgs.Builder]):
        com.pulumi.aws.paymentcryptography.KeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.paymentcryptography.inputs.KeyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeArgs.Builder)
    /**
     * @param keyModesOfUses List of cryptographic operations that you can perform using the key.
     * @return builder
     */
    def keyModesOfUses(args: Endofunction[com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeKeyModesOfUseArgs.Builder]*):
        com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeArgs.Builder =
      def argsBuilder = com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeKeyModesOfUseArgs.builder
      builder.keyModesOfUses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.paymentcryptography.inputs.KeyState.Builder)
    /**
     * @param keyAttributes Role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def keyAttributes(args: Endofunction[com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeArgs.Builder]*):
        com.pulumi.aws.paymentcryptography.inputs.KeyState.Builder =
      def argsBuilder = com.pulumi.aws.paymentcryptography.inputs.KeyKeyAttributeArgs.builder
      builder.keyAttributes(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.paymentcryptography.inputs.KeyTimeoutsArgs.Builder]):
        com.pulumi.aws.paymentcryptography.inputs.KeyState.Builder =
      val argsBuilder = com.pulumi.aws.paymentcryptography.inputs.KeyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
