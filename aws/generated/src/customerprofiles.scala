package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object customerprofiles:
  /**
   * Resource for managing an Amazon Customer Profiles Domain.
   * See the [Create Domain](https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateDomain.html) for more information.
   */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.customerprofiles.DomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.customerprofiles.DomainArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.customerprofiles.Domain(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an Amazon Customer Profiles Profile.
   * See the [Create Profile](https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateProfile.html) for more information.
   */
  def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.customerprofiles.ProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.customerprofiles.ProfileArgs.builder
    com.pulumi.aws.customerprofiles.Profile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
