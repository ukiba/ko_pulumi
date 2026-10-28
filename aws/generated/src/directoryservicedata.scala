package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object directoryservicedata:
  /** Manages a group in an AWS Directory Service directory. */
  inline def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservicedata.GroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservicedata.GroupArgs.builder
    com.pulumi.aws.directoryservicedata.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a user in an AWS Directory Service directory. */
  inline def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservicedata.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservicedata.UserArgs.builder
    com.pulumi.aws.directoryservicedata.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
