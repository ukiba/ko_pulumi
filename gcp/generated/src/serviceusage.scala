package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object serviceusage:
  /**
   * A consumer override is applied to the consumer on its own authority to limit its own quota usage.
   *  Consumer overrides cannot be used to grant more quota than would be allowed by admin overrides,
   *  producer overrides, or the default limit of the service.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about ConsumerQuotaOverride, see:
   *  * How-to Guides
   *      * [Managing Service Quota](https://cloud.google.com/service-usage/docs/manage-quota)
   *      * [REST API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services.consumerQuotaMetrics.limits.consumerOverrides)
   */
  def ConsumerQuotaOverride(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs.builder
    com.pulumi.gcp.serviceusage.ConsumerQuotaOverride(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
