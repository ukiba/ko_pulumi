package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object redshiftdata:
  /** Executes a Redshift Data Statement. */
  inline def Statement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshiftdata.StatementArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshiftdata.StatementArgs.builder
    com.pulumi.aws.redshiftdata.Statement(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
