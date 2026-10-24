package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object redshiftdata:
  /** Executes a Redshift Data Statement. */
  def Statement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftdata.StatementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshiftdata.StatementArgs.builder
    com.pulumi.aws.redshiftdata.Statement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
