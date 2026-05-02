package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object arczonalshift:
  /** Manages the autoshift observer notification status for AWS Application Recovery Controller Zonal Shift. This controls whether autoshift observer notifications are enabled or disabled. */
  def AutoshiftObserverNotificationStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatusArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatusArgs.builder
    
    com.pulumi.aws.arczonalshift.AutoshiftObserverNotificationStatus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
