package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object paymentcryptography:
  /** Resource for managing an AWS Payment Cryptography Control Plane Key. */
  def Key(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.paymentcryptography.KeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Payment Cryptography Control Plane Key Alias. */
  def KeyAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.paymentcryptography.KeyAliasArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.paymentcryptography.KeyAliasArgs.builder
    com.pulumi.aws.paymentcryptography.KeyAlias(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
