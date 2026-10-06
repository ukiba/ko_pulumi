package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object serviceusage:
  /**
   * A consumer override is applied to the consumer on its own authority to limit its own quota usage.
   * Consumer overrides cannot be used to grant more quota than would be allowed by admin overrides,
   * producer overrides, or the default limit of the service.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about ConsumerQuotaOverride, see:
   * * How-to Guides
   *     * [Managing Service Quota](https://cloud.google.com/service-usage/docs/manage-quota)
   *     * [REST API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services.consumerQuotaMetrics.limits.consumerOverrides)
   */
  def ConsumerQuotaOverride(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs.builder
    com.pulumi.gcp.serviceusage.ConsumerQuotaOverride(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Consumer Policy is a set of rules that define what services or service groups can be used for a cloud resource hierarchy.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about ConsumerPolicy, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/service-usage/docs/reference/rest/v2beta/consumerPolicies)
   * * How-to Guides
   *     * [Enabling and Disabling Services](https://cloud.google.com/service-usage/docs/enable-disable)
   * 
   * ## Import
   * 
   * ConsumerPolicy can be imported using any of these accepted formats:
   * 
   * * `{{parent}}/consumerPolicies/{{name}}`
   * 
   * When using the `pulumi import` command, ConsumerPolicy can be imported using one of the formats above. For example:
   * 
   * ```sh
   * $ pulumi import gcp:serviceusage/v2ConsumerPolicy:V2ConsumerPolicy default {{parent}}/consumerPolicies/{{name}}
   * ```
   */
  def V2ConsumerPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceusage.V2ConsumerPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.serviceusage.V2ConsumerPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.serviceusage.V2ConsumerPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.serviceusage.V2ConsumerPolicyArgs.Builder)
    /**
     * @param enableRules The consumer policy rule that defines enabled services. The structure is documented below.
     * Structure is documented below.
     * @return builder
     */
    def enableRules(args: Endofunction[com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.Builder]*):
        com.pulumi.gcp.serviceusage.V2ConsumerPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.builder
      builder.enableRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyState.Builder)
    /**
     * @param enableRules The consumer policy rule that defines enabled services. The structure is documented below.
     * Structure is documented below.
     * @return builder
     */
    def enableRules(args: Endofunction[com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.Builder]*):
        com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.serviceusage.inputs.V2ConsumerPolicyEnableRuleArgs.builder
      builder.enableRules(args.map(_(argsBuilder).build)*)
