package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object s3outposts:
  /** Provides a resource to manage an S3 Outposts Endpoint. */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3outposts.EndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3outposts.EndpointArgs.builder
    com.pulumi.aws.s3outposts.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
