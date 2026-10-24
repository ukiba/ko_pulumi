package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object arczonalshift:
  /** Manages the autoshift observer notification status for AWS Application Recovery Controller Zonal Shift. This controls whether autoshift observer notifications are enabled or disabled. */
  def AutoshiftObserverNotificationStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatusArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatusArgs.builder
    com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatus(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Application Recovery Controller Zonal Shift Zonal Autoshift Configuration for a managed resource (such as a load balancer).
   * 
   * Zonal autoshift is a capability in AWS Application Recovery Controller (ARC) that automatically shifts traffic away from an Availability Zone when AWS identifies a potential issue, helping maintain application availability.
   */
  def ZonalAutoshiftConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.arczonalshift.ZonalAutoshiftConfigurationArgs.builder
    com.pulumi.aws.arczonalshift.ZonalAutoshiftConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
