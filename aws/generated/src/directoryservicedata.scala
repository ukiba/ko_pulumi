package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object directoryservicedata:
  /** Manages a user in an AWS Directory Service directory. */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservicedata.UserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservicedata.UserArgs.builder
    com.pulumi.aws.directoryservicedata.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
