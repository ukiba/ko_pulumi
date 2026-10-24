package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudsupport:
  /** A support event subscription for receiving notifications from Cloud Support API. */
  inline def SupportEventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudsupport.SupportEventSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudsupport.SupportEventSubscriptionArgs.builder
    com.pulumi.gcp.cloudsupport.SupportEventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
