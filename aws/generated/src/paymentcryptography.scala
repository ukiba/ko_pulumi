package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object paymentcryptography:
  /** Resource for managing an AWS Payment Cryptography Control Plane Key. */
  def Key(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.paymentcryptography.KeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.paymentcryptography.KeyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.paymentcryptography.Key(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Payment Cryptography Control Plane Key Alias. */
  def KeyAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.paymentcryptography.KeyAliasArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.paymentcryptography.KeyAliasArgs.builder
    com.pulumi.aws.paymentcryptography.KeyAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
