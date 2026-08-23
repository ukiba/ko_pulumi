package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudsupport:
  /** A support event subscription for receiving notifications from Cloud Support API. */
  def SupportEventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudsupport.SupportEventSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudsupport.SupportEventSubscriptionArgs.builder
    com.pulumi.gcp.cloudsupport.SupportEventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
