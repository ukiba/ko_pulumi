package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object costmanagement:
  /** Manages an Azure Cost Management Scheduled Action. */
  def ScheduledAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.costmanagement.ScheduledActionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.costmanagement.ScheduledActionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.costmanagement.ScheduledAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Cost Anomaly Alert.
   * 
   *  &gt; **Note:** Anomaly alerts are sent based on the current access of the rule creator at the time that the email is sent. Learn more [here](https://learn.microsoft.com/en-us/azure/cost-management-billing/understand/analyze-unexpected-charges#create-an-anomaly-alert).
   */
  def AnomalyAlert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.costmanagement.AnomalyAlertArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.costmanagement.AnomalyAlertArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.costmanagement.AnomalyAlert(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
