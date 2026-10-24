package jp.ukiba.ko_pulumi
package gcp

object compute_ext1:
  extension (builder: com.pulumi.gcp.compute.AutoscalerArgs.Builder)
    /**
     * @param autoscalingPolicy The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * @return builder
     */
    inline def autoscalingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.AutoscalerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.builder
      builder.autoscalingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.BackendBucketArgs.Builder)
    /**
     * @param cdnPolicy Cloud CDN configuration for this Backend Bucket.
     * Structure is documented below.
     * @return builder
     */
    inline def cdnPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.Builder]):
        com.pulumi.gcp.compute.BackendBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.builder
      builder.cdnPolicy(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketParamsArgs.Builder]):
        com.pulumi.gcp.compute.BackendBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.BackendBucketIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.BackendBucketIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.BackendBucketIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.BackendBucketIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.BackendServiceArgs.Builder)
    /**
     * @param backends The set of backends that serve this BackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def backends(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceBackendArgs.Builder]*):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param cdnPolicy Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def cdnPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.builder
      builder.cdnPolicy(args(argsBuilder).build)

    /**
     * @param circuitBreakers Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def circuitBreakers(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersArgs.builder
      builder.circuitBreakers(args(argsBuilder).build)

    /**
     * @param consistentHash Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing. This field only applies if the loadBalancingScheme is set to
     * INTERNAL_SELF_MANAGED. This field is only applicable when localityLbPolicy is
     * set to MAGLEV or RING_HASH.
     * Structure is documented below.
     * @return builder
     */
    inline def consistentHash(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashArgs.builder
      builder.consistentHash(args(argsBuilder).build)

    /**
     * @param customMetrics List of custom metrics that are used for the WEIGHTED_ROUND_ROBIN locality_lb_policy.
     * Structure is documented below.
     * @return builder
     */
    inline def customMetrics(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCustomMetricArgs.Builder]*):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCustomMetricArgs.builder
      builder.customMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicForwarding (Optional, Beta)
     * Dynamic forwarding configuration. This field is used to configure the backend service with dynamic forwarding
     * feature which together with Service Extension allows customized and complex routing logic.
     * Structure is documented below.
     * @return builder
     */
    inline def dynamicForwarding(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingArgs.builder
      builder.dynamicForwarding(args(argsBuilder).build)

    /**
     * @param iap Settings for enabling Cloud Identity Aware Proxy.
     * If OAuth client is not set, the Google-managed OAuth client is used.
     * Structure is documented below.
     * @return builder
     */
    inline def iap(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceIapArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceIapArgs.builder
      builder.iap(args(argsBuilder).build)

    /**
     * @param localityLbPolicies A list of locality load balancing policies to be used in order of
     * preference. Either the policy or the customPolicy field should be set.
     * Overrides any value set in the localityLbPolicy field.
     * localityLbPolicies is only supported when the BackendService is referenced
     * by a URL Map that is referenced by a target gRPC proxy that has the
     * validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def localityLbPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyArgs.builder
      builder.localityLbPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param logConfig This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param maxStreamDuration Specifies the default maximum duration (timeout) for streams to this service. Duration is computed from the
     * beginning of the stream until the response has been completely processed, including all retries. A stream that
     * does not complete in this duration is closed.
     * If not specified, there will be no timeout limit, i.e. the maximum duration is infinite.
     * This value can be overridden in the PathMatcher configuration of the UrlMap that references this backend service.
     * This field is only allowed when the loadBalancingScheme of the backend service is INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def maxStreamDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceMaxStreamDurationArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceMaxStreamDurationArgs.builder
      builder.maxStreamDuration(args(argsBuilder).build)

    /**
     * @param networkPassThroughLbTrafficPolicy (Optional, Beta)
     * Configures traffic steering properties of internal passthrough Network Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def networkPassThroughLbTrafficPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyArgs.builder
      builder.networkPassThroughLbTrafficPolicy(args(argsBuilder).build)

    /**
     * @param outlierDetection Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * Applicable backend service types can be a global backend service with the
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED or EXTERNAL_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def outlierDetection(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionArgs.builder
      builder.outlierDetection(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceParamsArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param securitySettings The security settings that apply to this backend service. This field is applicable to either
     * a regional backend service with the serviceProtocol set to HTTP, HTTPS, HTTP2 or H2C, and
     * loadBalancingScheme set to INTERNAL_MANAGED; or a global backend service with the
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def securitySettings(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsArgs.builder
      builder.securitySettings(args(argsBuilder).build)

    /**
     * @param strongSessionAffinityCookie Describes the HTTP cookie used for stateful session affinity. This field is applicable and required if the sessionAffinity is set to STRONG_COOKIE_AFFINITY.
     * Structure is documented below.
     * @return builder
     */
    inline def strongSessionAffinityCookie(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieArgs.builder
      builder.strongSessionAffinityCookie(args(argsBuilder).build)

    /**
     * @param tlsSettings Configuration for Backend Authenticated TLS and mTLS. May only be specified when the backend protocol is SSL, HTTPS or HTTP2.
     * Structure is documented below.
     * @return builder
     */
    inline def tlsSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsArgs.builder
      builder.tlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.BackendServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.BackendServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.BackendServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.BulkPerInstanceConfigArgs.Builder)
    /**
     * @param instances The list of per-instance configs.
     * Structure is documented below.
     * @return builder
     */
    inline def instances(args: Endofunction[com.pulumi.gcp.compute.inputs.BulkPerInstanceConfigInstanceArgs.Builder]*):
        com.pulumi.gcp.compute.BulkPerInstanceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BulkPerInstanceConfigInstanceArgs.builder
      builder.instances(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.DiskArgs.Builder)
    /**
     * @param asyncPrimaryDisk A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def asyncPrimaryDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskAsyncPrimaryDiskArgs.Builder]):
        com.pulumi.gcp.compute.DiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskAsyncPrimaryDiskArgs.builder
      builder.asyncPrimaryDisk(args(argsBuilder).build)

    /**
     * @param diskEncryptionKey Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * ~&gt;**NOTE** Only changing `kmsKeySelfLink` between Cloud KMS keys is
     * done in place; other changes to this block recreate the disk.
     * Structure is documented below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.DiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param guestOsFeatures A list of features to enable on the guest operating system.
     * Applicable only for bootable disks.
     * Structure is documented below.
     * @return builder
     */
    inline def guestOsFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.compute.DiskArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.DiskGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskParamsArgs.Builder]):
        com.pulumi.gcp.compute.DiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.DiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.DiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.DiskAsyncReplicationArgs.Builder)
    /**
     * @param secondaryDisk The secondary disk (target of replication). You can specify only one value. Structure is documented below.
     * @return builder
     */
    inline def secondaryDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskAsyncReplicationSecondaryDiskArgs.Builder]):
        com.pulumi.gcp.compute.DiskAsyncReplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskAsyncReplicationSecondaryDiskArgs.builder
      builder.secondaryDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.DiskIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.DiskIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.DiskIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.DiskIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ExternalVpnGatewayArgs.Builder)
    /**
     * @param interfaces A list of interfaces on this external VPN gateway.
     * Structure is documented below.
     * @return builder
     */
    inline def interfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.ExternalVpnGatewayInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.ExternalVpnGatewayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ExternalVpnGatewayInterfaceArgs.builder
      builder.interfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.ExternalVpnGatewayParamsArgs.Builder]):
        com.pulumi.gcp.compute.ExternalVpnGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ExternalVpnGatewayParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.FirewallArgs.Builder)
    /**
     * @param allows The list of ALLOW rules specified by this firewall. Each rule
     * specifies a protocol and port-range tuple that describes a permitted
     * connection.
     * Structure is documented below.
     * @return builder
     */
    inline def allows(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallAllowArgs.Builder]*):
        com.pulumi.gcp.compute.FirewallArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallAllowArgs.builder
      builder.allows(args.map(_(argsBuilder).build)*)

    /**
     * @param denies The list of DENY rules specified by this firewall. Each rule specifies
     * a protocol and port-range tuple that describes a denied connection.
     * Structure is documented below.
     * @return builder
     */
    inline def denies(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallDenyArgs.Builder]*):
        com.pulumi.gcp.compute.FirewallArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallDenyArgs.builder
      builder.denies(args.map(_(argsBuilder).build)*)

    /**
     * @param logConfig This field denotes the logging options for a particular firewall rule.
     * If defined, logging is enabled, and logs will be exported to Cloud Logging.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.FirewallArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallParamsArgs.Builder]):
        com.pulumi.gcp.compute.FirewallArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.FirewallPolicyIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.FirewallPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.FirewallPolicyIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.FirewallPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.FirewallPolicyRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.FirewallPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target secure tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.FirewallPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.FirewallPolicyWithRulesArgs.Builder)
    /**
     * @param rules A list of firewall policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleArgs.Builder]*):
        com.pulumi.gcp.compute.FirewallPolicyWithRulesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.ForwardingRuleArgs.Builder)
    /**
     * @param serviceDirectoryRegistrations Service Directory resources to register this forwarding rule with.
     * Currently, only supports a single Service Directory resource.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryRegistrations(args: Endofunction[com.pulumi.gcp.compute.inputs.ForwardingRuleServiceDirectoryRegistrationsArgs.Builder]):
        com.pulumi.gcp.compute.ForwardingRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ForwardingRuleServiceDirectoryRegistrationsArgs.builder
      builder.serviceDirectoryRegistrations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.FutureReservationArgs.Builder)
    /**
     * @param aggregateReservation Aggregate reservation details for the future reservation.
     * Structure is documented below.
     * @return builder
     */
    inline def aggregateReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationArgs.Builder]):
        com.pulumi.gcp.compute.FutureReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationArgs.builder
      builder.aggregateReservation(args(argsBuilder).build)

    /**
     * @param autoCreatedReservationsDuration Specifies the duration of auto-created reservations. It represents relative time to future reservation startTime when auto-created reservations will be automatically deleted by Compute Engine. Duration time unit is represented as a count of seconds and fractions of seconds at nanosecond resolution.
     * Structure is documented below.
     * @return builder
     */
    inline def autoCreatedReservationsDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationAutoCreatedReservationsDurationArgs.Builder]):
        com.pulumi.gcp.compute.FutureReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationAutoCreatedReservationsDurationArgs.builder
      builder.autoCreatedReservationsDuration(args(argsBuilder).build)

    /**
     * @param commitmentInfo If not present, then FR will not deliver a new commitment or update an existing commitment.
     * Structure is documented below.
     * @return builder
     */
    inline def commitmentInfo(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationCommitmentInfoArgs.Builder]):
        com.pulumi.gcp.compute.FutureReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationCommitmentInfoArgs.builder
      builder.commitmentInfo(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationParamsArgs.Builder]):
        com.pulumi.gcp.compute.FutureReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param shareSettings Settings for sharing the future reservation
     * Structure is documented below.
     * @return builder
     */
    inline def shareSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsArgs.Builder]):
        com.pulumi.gcp.compute.FutureReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsArgs.builder
      builder.shareSettings(args(argsBuilder).build)

    /**
     * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * @return builder
     */
    inline def specificSkuProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesArgs.Builder]):
        com.pulumi.gcp.compute.FutureReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesArgs.builder
      builder.specificSkuProperties(args(argsBuilder).build)

    /**
     * @param timeWindow Time window for this Future Reservation.
     * Structure is documented below.
     * @return builder
     */
    inline def timeWindow(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs.Builder]):
        com.pulumi.gcp.compute.FutureReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs.builder
      builder.timeWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.GlobalForwardingRuleArgs.Builder)
    /**
     * @param metadataFilters Opaque filter criteria used by Loadbalancer to restrict routing
     * configuration to a limited set xDS compliant clients. In their xDS
     * requests to Loadbalancer, xDS clients present node metadata. If a
     * match takes place, the relevant routing configuration is made available
     * to those proxies.
     * For each metadataFilter in this list, if its filterMatchCriteria is set
     * to MATCH_ANY, at least one of the filterLabels must match the
     * corresponding label provided in the metadata. If its filterMatchCriteria
     * is set to MATCH_ALL, then all of its filterLabels must match with
     * corresponding labels in the provided metadata.
     * metadataFilters specified here can be overridden by those specified in
     * the UrlMap that this ForwardingRule references.
     * metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def metadataFilters(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterArgs.Builder]*):
        com.pulumi.gcp.compute.GlobalForwardingRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterArgs.builder
      builder.metadataFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceDirectoryRegistrations Service Directory resources to register this forwarding rule with.
     * Currently, only supports a single Service Directory resource.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryRegistrations(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalForwardingRuleServiceDirectoryRegistrationsArgs.Builder]):
        com.pulumi.gcp.compute.GlobalForwardingRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.GlobalForwardingRuleServiceDirectoryRegistrationsArgs.builder
      builder.serviceDirectoryRegistrations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.GlobalVmExtensionPolicyArgs.Builder)
    /**
     * @param extensionPolicies Map from extension (eg: &#34;cloudops&#34;) to its policy configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def extensionPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyExtensionPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.GlobalVmExtensionPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyExtensionPolicyArgs.builder
      builder.extensionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectors Selector to target VMs for a policy.
     * Structure is documented below.
     * @return builder
     */
    inline def instanceSelectors(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorArgs.Builder]*):
        com.pulumi.gcp.compute.GlobalVmExtensionPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorArgs.builder
      builder.instanceSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param rolloutOperation Represents the rollout operation.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutOperation(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationArgs.Builder]):
        com.pulumi.gcp.compute.GlobalVmExtensionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationArgs.builder
      builder.rolloutOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.HaVpnGatewayArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.HaVpnGatewayParamsArgs.Builder]):
        com.pulumi.gcp.compute.HaVpnGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HaVpnGatewayParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param vpnInterfaces A list of interfaces on this VPN gateway.
     * Structure is documented below.
     * @return builder
     */
    inline def vpnInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.HaVpnGatewayVpnInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.HaVpnGatewayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.HaVpnGatewayVpnInterfaceArgs.builder
      builder.vpnInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.HealthCheckArgs.Builder)
    /**
     * @param grpcHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckGrpcHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckGrpcHealthCheckArgs.builder
      builder.grpcHealthCheck(args(argsBuilder).build)

    /**
     * @param grpcTlsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcTlsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckGrpcTlsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckGrpcTlsHealthCheckArgs.builder
      builder.grpcTlsHealthCheck(args(argsBuilder).build)

    /**
     * @param http2HealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def http2HealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckHttp2HealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckHttp2HealthCheckArgs.builder
      builder.http2HealthCheck(args(argsBuilder).build)

    /**
     * @param httpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckHttpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckHttpHealthCheckArgs.builder
      builder.httpHealthCheck(args(argsBuilder).build)

    /**
     * @param httpsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckHttpsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckHttpsHealthCheckArgs.builder
      builder.httpsHealthCheck(args(argsBuilder).build)

    /**
     * @param logConfig Configure logging on this health check.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param sslHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def sslHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckSslHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckSslHealthCheckArgs.builder
      builder.sslHealthCheck(args(argsBuilder).build)

    /**
     * @param tcpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def tcpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckTcpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.HealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckTcpHealthCheckArgs.builder
      builder.tcpHealthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ImageArgs.Builder)
    /**
     * @param guestOsFeatures A list of features to enable on the guest operating system.
     * Applicable only for bootable images.
     * Structure is documented below.
     * @return builder
     */
    inline def guestOsFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ImageGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param imageEncryptionKey Encrypts the image using a customer-supplied encryption key.
     * After you encrypt an image with a customer-supplied key, you must
     * provide the same key if you use the image later (e.g. to create a
     * disk from the image)
     * Structure is documented below.
     * @return builder
     */
    inline def imageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageImageEncryptionKeyArgs.builder
      builder.imageEncryptionKey(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload.
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageParamsArgs.Builder]):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param rawDisk The parameters of the raw disk image.
     * Structure is documented below.
     * @return builder
     */
    inline def rawDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageRawDiskArgs.Builder]):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageRawDiskArgs.builder
      builder.rawDisk(args(argsBuilder).build)

    /**
     * @param shieldedInstanceInitialState Set the secure boot keys of shielded instance.
     * Structure is documented below.
     * @return builder
     */
    inline def shieldedInstanceInitialState(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.Builder]):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.builder
      builder.shieldedInstanceInitialState(args(argsBuilder).build)

    /**
     * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source disk. Required if
     * the source disk is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceDiskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageSourceDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageSourceDiskEncryptionKeyArgs.builder
      builder.sourceDiskEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required if
     * the source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.ImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ImageIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.ImageIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ImageIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.ImageIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceArgs.Builder)
    /**
     * @param advancedMachineFeatures Configure Nested Virtualisation and Simultaneous Hyper Threading  on this VM. Structure is documented below
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param attachedDisks Additional disks to attach to the instance. Can be repeated multiple times for multiple disks. Structure is documented below.
     * @return builder
     */
    inline def attachedDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceAttachedDiskArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceAttachedDiskArgs.builder
      builder.attachedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDisk The boot disk for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def bootDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * **Note:** GPU accelerators can only be used with `onHostMaintenance` option set to TERMINATE.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceEncryptionKey Configuration for data encryption on the instance with encryption keys. Structure is documented below.
     * @return builder
     */
    inline def instanceEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceInstanceEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceInstanceEncryptionKeyArgs.builder
      builder.instanceEncryptionKey(args(argsBuilder).build)

    /**
     * @param networkInterfaces Networks to attach to the instance. This can
     * be specified multiple times. Structure is documented below.
     * 
     * ***
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance. Structure is
     * documented below. **Note**: `machineType` must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param params Additional instance parameters.
     * .
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceParamsArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param scratchDisks Scratch disks to attach to the instance. This can be
     * specified multiple times for multiple scratch disks. Structure is documented below.
     * @return builder
     */
    inline def scratchDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceScratchDiskArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceScratchDiskArgs.builder
      builder.scratchDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccount Service account to attach to the instance.
     * Structure is documented below.
     * **Note**: `allowStoppingForUpdate` must be set to true or your instance must have a `desiredStatus` of `TERMINATED` in order to update this field.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * **Note**: `allowStoppingForUpdate` must be set to true or your instance must have a `desiredStatus` of `TERMINATED` in order to update this field.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity Config. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder)
    /**
     * @param advancedMachineFeatures Controls for advanced machine-related behavior features.
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig The Confidential VM config being used by the instance.  onHostMaintenance has to be set to TERMINATE or this will fail to create.
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceEncryptionKey Encryption key used to provide data encryption on the given instance.
     * @return builder
     */
    inline def instanceEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageInstanceEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageInstanceEncryptionKeyArgs.builder
      builder.instanceEncryptionKey(args(argsBuilder).build)

    /**
     * @param networkInterfaces The networks attached to the instance.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance. If not specified, the instance will be created with its default network performance configuration.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param params Stores additional params passed with the request, but not persisted as part of resource payload.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageParamsArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy being used by the instance.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param serviceAccount The service account to attach to the instance.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig The shielded vm config being used by the instance.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param sourceMachineImageEncryptionKey Encryption key for the source machine image.
     * @return builder
     */
    inline def sourceMachineImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSourceMachineImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSourceMachineImageEncryptionKeyArgs.builder
      builder.sourceMachineImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload identity config.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromMachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder)
    /**
     * @param advancedMachineFeatures Controls for advanced machine-related behavior features.
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param attachedDisks List of disks attached to the instance
     * @return builder
     */
    inline def attachedDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateAttachedDiskArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateAttachedDiskArgs.builder
      builder.attachedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDisk The boot disk for the instance.
     * @return builder
     */
    inline def bootDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig The Confidential VM config being used by the instance.  onHostMaintenance has to be set to TERMINATE or this will fail to create.
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceEncryptionKey Encryption key used to provide data encryption on the given instance.
     * @return builder
     */
    inline def instanceEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateInstanceEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateInstanceEncryptionKeyArgs.builder
      builder.instanceEncryptionKey(args(argsBuilder).build)

    /**
     * @param networkInterfaces The networks attached to the instance.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance. If not specified, the instance will be created with its default network performance configuration.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param params Stores additional params passed with the request, but not persisted as part of resource payload.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateParamsArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy being used by the instance.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param scratchDisks * `network_interface.alias_ip_range`
     * * `network_interface.alias_ipv6_range` [Beta]
     * * `network_interface.access_config`
     * @return builder
     */
    inline def scratchDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateScratchDiskArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateScratchDiskArgs.builder
      builder.scratchDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccount The service account to attach to the instance.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig The shielded vm config being used by the instance.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload identity config.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceFromTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceGroupArgs.Builder)
    /**
     * @param namedPorts The named port configuration. See the section below
     * for details on configuration. Structure is documented below.
     * @return builder
     */
    inline def namedPorts(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupNamedPortArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupNamedPortArgs.builder
      builder.namedPorts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder)
    /**
     * @param allInstancesConfig Properties to set on all instances in the group. After setting
     * allInstancesConfig on the group, you must update the group&#39;s instances to
     * apply the configuration.
     * @return builder
     */
    inline def allInstancesConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerAllInstancesConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerAllInstancesConfigArgs.builder
      builder.allInstancesConfig(args(argsBuilder).build)

    /**
     * @param autoHealingPolicies The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * @return builder
     */
    inline def autoHealingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerAutoHealingPoliciesArgs.Builder]):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerAutoHealingPoliciesArgs.builder
      builder.autoHealingPolicies(args(argsBuilder).build)

    /**
     * @param instanceLifecyclePolicy The instance lifecycle policy for this managed instance group.
     * @return builder
     */
    inline def instanceLifecyclePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs.Builder]):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs.builder
      builder.instanceLifecyclePolicy(args(argsBuilder).build)

    /**
     * @param namedPorts The named port configuration. See the section below
     * for details on configuration.
     * @return builder
     */
    inline def namedPorts(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerNamedPortArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerNamedPortArgs.builder
      builder.namedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param params ) Input only additional params for instance group manager creation. Structure is documented below. For more information, see [API](https://cloud.google.com/compute/docs/reference/rest/beta/instanceGroupManagers/insert).
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerParamsArgs.Builder]):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resourcePolicies Resource policies for this managed instance group. Structure is documented below.
     * @return builder
     */
    inline def resourcePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerResourcePoliciesArgs.Builder]):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerResourcePoliciesArgs.builder
      builder.resourcePolicies(args(argsBuilder).build)

    /**
     * @param standbyPolicy The standby policy for stopped and suspended instances. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/suspended-and-stopped-vms-in-mig).
     * @return builder
     */
    inline def standbyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStandbyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStandbyPolicyArgs.builder
      builder.standbyPolicy(args(argsBuilder).build)

    /**
     * @param statefulDisks Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * @return builder
     */
    inline def statefulDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulDiskArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulDiskArgs.builder
      builder.statefulDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulExternalIps External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulExternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulExternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulExternalIpArgs.builder
      builder.statefulExternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulInternalIps Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulInternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulInternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulInternalIpArgs.builder
      builder.statefulInternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param targetSizePolicies The policy that specifies how the MIG creates its VMs to achieve the target size. Structure is documented below.
     * @return builder
     */
    inline def targetSizePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerTargetSizePolicyArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerTargetSizePolicyArgs.builder
      builder.targetSizePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param updatePolicy The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch).
     * @return builder
     */
    inline def updatePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

    /**
     * @param versions Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * @return builder
     */
    inline def versions(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.InstanceIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.InstanceIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.InstanceIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceSettingsArgs.Builder)
    /**
     * @param metadata The metadata key/value pairs assigned to all the instances in the corresponding scope.
     * Structure is documented below.
     * @return builder
     */
    inline def metadata(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSettingsMetadataArgs.Builder]):
        com.pulumi.gcp.compute.InstanceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSettingsMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceTemplateArgs.Builder)
    /**
     * @param advancedMachineFeatures Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param disks Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig (Optional, Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machineType`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param serviceAccount Service account to attach to the instance. Structure is documented below.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity Config. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceTemplateIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstanceTemplateIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.InstanceTemplateIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstantSnapshotArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstantSnapshotParamsArgs.Builder]):
        com.pulumi.gcp.compute.InstantSnapshotArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstantSnapshotParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstantSnapshotIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstantSnapshotIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.InstantSnapshotIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstantSnapshotIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InstantSnapshotIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstantSnapshotIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.InstantSnapshotIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstantSnapshotIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InterconnectArgs.Builder)
    /**
     * @param applicationAwareInterconnect (Optional, Beta)
     * Configuration that enables Media Access Control security (MACsec) on the Cloud
     * Interconnect connection between Google and your on-premises router.
     * Structure is documented below.
     * @return builder
     */
    inline def applicationAwareInterconnect(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.Builder]):
        com.pulumi.gcp.compute.InterconnectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.builder
      builder.applicationAwareInterconnect(args(argsBuilder).build)

    /**
     * @param macsec Configuration that enables Media Access Control security (MACsec) on the Cloud
     * Interconnect connection between Google and your on-premises router.
     * Structure is documented below.
     * @return builder
     */
    inline def macsec(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectMacsecArgs.Builder]):
        com.pulumi.gcp.compute.InterconnectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectMacsecArgs.builder
      builder.macsec(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectParamsArgs.Builder]):
        com.pulumi.gcp.compute.InterconnectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InterconnectAttachmentArgs.Builder)
    /**
     * @param l2Forwarding L2 Interconnect Attachment related configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def l2Forwarding(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingArgs.Builder]):
        com.pulumi.gcp.compute.InterconnectAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingArgs.builder
      builder.l2Forwarding(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentParamsArgs.Builder]):
        com.pulumi.gcp.compute.InterconnectAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InterconnectAttachmentGroupArgs.Builder)
    /**
     * @param attachments Attachments in the AttachmentGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Attachments per group&#34; quota.
     * Structure is documented below.
     * @return builder
     */
    inline def attachments(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupAttachmentArgs.Builder]*):
        com.pulumi.gcp.compute.InterconnectAttachmentGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)

    /**
     * @param intent The user&#39;s intent for this group. This is the only required field besides
     * the name that must be specified on group creation.
     * Structure is documented below.
     * @return builder
     */
    inline def intent(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupIntentArgs.Builder]):
        com.pulumi.gcp.compute.InterconnectAttachmentGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.InterconnectGroupArgs.Builder)
    /**
     * @param intent The user&#39;s intent for this group. This is the only required field besides
     * the name that must be specified on group creation.
     * Structure is documented below.
     * @return builder
     */
    inline def intent(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupIntentArgs.Builder]):
        com.pulumi.gcp.compute.InterconnectGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupIntentArgs.builder
      builder.intent(args(argsBuilder).build)

    /**
     * @param interconnects Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Interconnects per group&#34; quota.
     * Structure is documented below.
     * @return builder
     */
    inline def interconnects(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupInterconnectArgs.Builder]*):
        com.pulumi.gcp.compute.InterconnectGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupInterconnectArgs.builder
      builder.interconnects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.MachineImageArgs.Builder)
    /**
     * @param machineImageEncryptionKey Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     * @return builder
     */
    inline def machineImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageMachineImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.MachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageMachineImageEncryptionKeyArgs.builder
      builder.machineImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload.
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageParamsArgs.Builder]):
        com.pulumi.gcp.compute.MachineImageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.MachineImageIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.MachineImageIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.MachineImageIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.MachineImageIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ManagedSslCertificateArgs.Builder)
    /**
     * @param managed Properties relevant to a managed certificate.  These will be used if the
     * certificate is managed (as indicated by a value of `MANAGED` in `type`).
     * Structure is documented below.
     * @return builder
     */
    inline def managed(args: Endofunction[com.pulumi.gcp.compute.inputs.ManagedSslCertificateManagedArgs.Builder]):
        com.pulumi.gcp.compute.ManagedSslCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ManagedSslCertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.MangedSslCertificateArgs.Builder)
    /**
     * @param managed Properties relevant to a managed certificate.  These will be used if the
     * certificate is managed (as indicated by a value of `MANAGED` in `type`).
     * Structure is documented below.
     * @return builder
     */
    inline def managed(args: Endofunction[com.pulumi.gcp.compute.inputs.MangedSslCertificateManagedArgs.Builder]):
        com.pulumi.gcp.compute.MangedSslCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MangedSslCertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.NetworkArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkParamsArgs.Builder]):
        com.pulumi.gcp.compute.NetworkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.NetworkEndpointListArgs.Builder)
    /**
     * @param networkEndpoints The network endpoints to be added to the enclosing network endpoint group
     * (NEG). Each endpoint specifies an IP address and port, along with
     * additional information depending on the NEG type.
     * Structure is documented below.
     * @return builder
     */
    inline def networkEndpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkEndpointListNetworkEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.NetworkEndpointListArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkEndpointListNetworkEndpointArgs.builder
      builder.networkEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.NetworkFirewallPolicyIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.NetworkFirewallPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.NetworkFirewallPolicyIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.NetworkFirewallPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.NetworkFirewallPolicyPacketMirroringRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.NetworkFirewallPolicyPacketMirroringRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.NetworkFirewallPolicyPacketMirroringRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.NetworkFirewallPolicyRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.NetworkFirewallPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.NetworkFirewallPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.NetworkFirewallPolicyWithRulesArgs.Builder)
    /**
     * @param rules A list of firewall policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleArgs.Builder]*):
        com.pulumi.gcp.compute.NetworkFirewallPolicyWithRulesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.NodeGroupArgs.Builder)
    /**
     * @param autoscalingPolicy If you use sole-tenant nodes for your workloads, you can use the node
     * group autoscaler to automatically manage the sizes of your node groups.
     * One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
     * Structure is documented below.
     * @return builder
     */
    inline def autoscalingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeGroupAutoscalingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeGroupAutoscalingPolicyArgs.builder
      builder.autoscalingPolicy(args(argsBuilder).build)

    /**
     * @param maintenanceWindow contains properties for the timeframe of maintenance
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeGroupMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.compute.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeGroupMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param shareSettings Share settings for the node group.
     * Structure is documented below.
     * @return builder
     */
    inline def shareSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsArgs.Builder]):
        com.pulumi.gcp.compute.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsArgs.builder
      builder.shareSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.NodeTemplateArgs.Builder)
    /**
     * @param accelerators List of the type and count of accelerator cards attached to the
     * node template
     * Structure is documented below.
     * @return builder
     */
    inline def accelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.NodeTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param disks List of the type, size and count of disks attached to the
     * node template
     * Structure is documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.NodeTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypeFlexibility Flexible properties for the desired node type. Node groups that
     * use this node template will create nodes of a type that matches
     * these properties. Only one of nodeTypeFlexibility and nodeType can
     * be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def nodeTypeFlexibility(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateNodeTypeFlexibilityArgs.Builder]):
        com.pulumi.gcp.compute.NodeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateNodeTypeFlexibilityArgs.builder
      builder.nodeTypeFlexibility(args(argsBuilder).build)

    /**
     * @param serverBinding The server binding policy for nodes using this template. Determines
     * where the nodes should restart following a maintenance event.
     * Structure is documented below.
     * @return builder
     */
    inline def serverBinding(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateServerBindingArgs.Builder]):
        com.pulumi.gcp.compute.NodeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateServerBindingArgs.builder
      builder.serverBinding(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.OrganizationSecurityPolicyArgs.Builder)
    /**
     * @param advancedOptionsConfig Additional options for this security policy.
     * Structure is documented below.
     * @return builder
     */
    inline def advancedOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.OrganizationSecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigArgs.builder
      builder.advancedOptionsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.OrganizationSecurityPolicyRuleArgs.Builder)
    /**
     * @param headerAction Optional, additional actions that are performed on headers.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.OrganizationSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.OrganizationSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule.
     * If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
     * Structure is documented below.
     * @return builder
     */
    inline def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.OrganizationSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param redirectOptions Parameters defining the redirect action. Cannot be specified for any other actions.
     * Note: For organization security policies, only EXTERNAL_302 redirect type is supported. GOOGLE_RECAPTCHA is not supported.
     * Structure is documented below.
     * @return builder
     */
    inline def redirectOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleRedirectOptionsArgs.Builder]):
        com.pulumi.gcp.compute.OrganizationSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleRedirectOptionsArgs.builder
      builder.redirectOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.OrganizationSnapshotRecycleBinPolicyArgs.Builder)
    /**
     * @param rules The rules for the snapshot recycle bin policy. The key name is either &#39;default&#39;
     * or namespaced name of the tag value which can be in the format:
     * {organization_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_number}/{tag_key_short_name}/{tag_value_short_name}. The default rule is
     * applied if snapshots do not have any of these tags. The value is the rule for the key.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.OrganizationSnapshotRecycleBinPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.PacketMirroringArgs.Builder)
    /**
     * @param collectorIlb The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
     * that will be used as collector for mirrored traffic. The
     * specified forwarding rule must have isMirroringCollector
     * set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def collectorIlb(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringCollectorIlbArgs.Builder]):
        com.pulumi.gcp.compute.PacketMirroringArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringCollectorIlbArgs.builder
      builder.collectorIlb(args(argsBuilder).build)

    /**
     * @param filter A filter for mirrored traffic.  If unset, all traffic is mirrored.
     * Structure is documented below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringFilterArgs.Builder]):
        com.pulumi.gcp.compute.PacketMirroringArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param mirroredResources A means of specifying which resources to mirror.
     * Structure is documented below.
     * @return builder
     */
    inline def mirroredResources(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs.Builder]):
        com.pulumi.gcp.compute.PacketMirroringArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs.builder
      builder.mirroredResources(args(argsBuilder).build)

    /**
     * @param network Specifies the mirrored VPC network. Only packets in this network
     * will be mirrored. All mirrored VMs should have a NIC in the given
     * network. All mirrored subnetworks should belong to the given network.
     * Structure is documented below.
     * @return builder
     */
    inline def network(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringNetworkArgs.Builder]):
        com.pulumi.gcp.compute.PacketMirroringArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringNetworkArgs.builder
      builder.network(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.PerInstanceConfigArgs.Builder)
    /**
     * @param preservedState The preserved state for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def preservedState(args: Endofunction[com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.Builder]):
        com.pulumi.gcp.compute.PerInstanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.builder
      builder.preservedState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.PreviewFeatureArgs.Builder)
    /**
     * @param rolloutOperation The rollout operation of the feature.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutOperation(args: Endofunction[com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationArgs.Builder]):
        com.pulumi.gcp.compute.PreviewFeatureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationArgs.builder
      builder.rolloutOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionAutoscalerArgs.Builder)
    /**
     * @param autoscalingPolicy The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * @return builder
     */
    inline def autoscalingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionAutoscalerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.builder
      builder.autoscalingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionBackendBucketIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendBucketIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendBucketIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendBucketIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionBackendBucketIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendBucketIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendBucketIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendBucketIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder)
    /**
     * @param backends The set of backends that serve this RegionBackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def backends(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendArgs.Builder]*):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param cdnPolicy Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def cdnPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs.builder
      builder.cdnPolicy(args(argsBuilder).build)

    /**
     * @param circuitBreakers Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the `loadBalancingScheme` is set to INTERNAL_MANAGED
     * and the `protocol` is set to HTTP, HTTPS, HTTP2 or H2C.
     * Structure is documented below.
     * @return builder
     */
    inline def circuitBreakers(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersArgs.builder
      builder.circuitBreakers(args(argsBuilder).build)

    /**
     * @param connectionTrackingPolicy Connection Tracking configuration for this BackendService.
     * This is available only for Layer 4 Internal Load Balancing and
     * Network Load Balancing.
     * Structure is documented below.
     * @return builder
     */
    inline def connectionTrackingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceConnectionTrackingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceConnectionTrackingPolicyArgs.builder
      builder.connectionTrackingPolicy(args(argsBuilder).build)

    /**
     * @param consistentHash Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing.
     * This field only applies when all of the following are true -
     * @return builder
     */
    inline def consistentHash(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashArgs.builder
      builder.consistentHash(args(argsBuilder).build)

    /**
     * @param customMetrics List of custom metrics that are used for the WEIGHTED_ROUND_ROBIN locality_lb_policy.
     * Structure is documented below.
     * @return builder
     */
    inline def customMetrics(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCustomMetricArgs.Builder]*):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCustomMetricArgs.builder
      builder.customMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicForwarding (Optional, Beta)
     * Dynamic forwarding configuration. This field is used to configure the backend service with dynamic forwarding
     * feature which together with Service Extension allows customized and complex routing logic.
     * Structure is documented below.
     * @return builder
     */
    inline def dynamicForwarding(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingArgs.builder
      builder.dynamicForwarding(args(argsBuilder).build)

    /**
     * @param failoverPolicy Policy for failovers.
     * Structure is documented below.
     * @return builder
     */
    inline def failoverPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceFailoverPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceFailoverPolicyArgs.builder
      builder.failoverPolicy(args(argsBuilder).build)

    /**
     * @param haPolicy Configures self-managed High Availability (HA) for External and Internal Protocol Forwarding.
     * The backends of this regional backend service must only specify zonal network endpoint groups
     * (NEGs) of type GCE_VM_IP. Note that haPolicy is not for load balancing, and therefore cannot
     * be specified with sessionAffinity, connectionTrackingPolicy, and failoverPolicy. haPolicy
     * requires customers to be responsible for tracking backend endpoint health and electing a
     * leader among the healthy endpoints. Therefore, haPolicy cannot be specified with healthChecks.
     * haPolicy can only be specified for External Passthrough Network Load Balancers and Internal
     * Passthrough Network Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def haPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyArgs.builder
      builder.haPolicy(args(argsBuilder).build)

    /**
     * @param iap Settings for enabling Cloud Identity Aware Proxy.
     * If OAuth client is not set, Google-managed OAuth client is used.
     * Structure is documented below.
     * @return builder
     */
    inline def iap(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceIapArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceIapArgs.builder
      builder.iap(args(argsBuilder).build)

    /**
     * @param logConfig This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param networkPassThroughLbTrafficPolicy Configures traffic steering properties of internal passthrough Network Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def networkPassThroughLbTrafficPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyArgs.builder
      builder.networkPassThroughLbTrafficPolicy(args(argsBuilder).build)

    /**
     * @param outlierDetection Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the `loadBalancingScheme` is set
     * to INTERNAL_MANAGED and the `protocol` is set to HTTP, HTTPS, HTTP2 or H2C.
     * Structure is documented below.
     * @return builder
     */
    inline def outlierDetection(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs.builder
      builder.outlierDetection(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceParamsArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param strongSessionAffinityCookie Describes the HTTP cookie used for stateful session affinity. This field is applicable and required if the sessionAffinity is set to STRONG_COOKIE_AFFINITY.
     * Structure is documented below.
     * @return builder
     */
    inline def strongSessionAffinityCookie(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieArgs.builder
      builder.strongSessionAffinityCookie(args(argsBuilder).build)

    /**
     * @param subsetting (Optional, Beta)
     * Subsetting configuration for this BackendService. Currently this is applicable only for Internal TCP/UDP load balancing and Internal HTTP(S) load balancing.
     * Structure is documented below.
     * @return builder
     */
    inline def subsetting(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceSubsettingArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceSubsettingArgs.builder
      builder.subsetting(args(argsBuilder).build)

    /**
     * @param tlsSettings Configuration for Backend Authenticated TLS and mTLS. May only be specified when the backend protocol is SSL, HTTPS or HTTP2.
     * Structure is documented below.
     * @return builder
     */
    inline def tlsSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsArgs.builder
      builder.tlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionBackendServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionBackendServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionBackendServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionCommitmentArgs.Builder)
    /**
     * @param licenseResource The license specification required as part of a license commitment.
     * Structure is documented below.
     * @return builder
     */
    inline def licenseResource(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionCommitmentLicenseResourceArgs.Builder]):
        com.pulumi.gcp.compute.RegionCommitmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionCommitmentLicenseResourceArgs.builder
      builder.licenseResource(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionCommitmentParamsArgs.Builder]):
        com.pulumi.gcp.compute.RegionCommitmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionCommitmentParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resources A list of commitment amounts for particular resources.
     * Note that VCPU and MEMORY resource commitments must occur together.
     * Structure is documented below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionCommitmentResourceArgs.Builder]*):
        com.pulumi.gcp.compute.RegionCommitmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionCommitmentResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RegionDiskArgs.Builder)
    /**
     * @param asyncPrimaryDisk A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def asyncPrimaryDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskAsyncPrimaryDiskArgs.Builder]):
        com.pulumi.gcp.compute.RegionDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskAsyncPrimaryDiskArgs.builder
      builder.asyncPrimaryDisk(args(argsBuilder).build)

    /**
     * @param diskEncryptionKey Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * ~&gt;**NOTE** Only changing `kmsKeyName` between Cloud KMS keys is done
     * in place; other changes to this block recreate the disk.
     * Structure is documented below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.RegionDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param guestOsFeatures A list of features to enable on the guest operating system.
     * Applicable only for bootable disks.
     * Structure is documented below.
     * @return builder
     */
    inline def guestOsFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.compute.RegionDiskArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.RegionDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.RegionDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionDiskIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionDiskIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionDiskIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionDiskIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder)
    /**
     * @param grpcHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcHealthCheckArgs.builder
      builder.grpcHealthCheck(args(argsBuilder).build)

    /**
     * @param grpcTlsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcTlsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcTlsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcTlsHealthCheckArgs.builder
      builder.grpcTlsHealthCheck(args(argsBuilder).build)

    /**
     * @param http2HealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def http2HealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckHttp2HealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckHttp2HealthCheckArgs.builder
      builder.http2HealthCheck(args(argsBuilder).build)

    /**
     * @param httpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs.builder
      builder.httpHealthCheck(args(argsBuilder).build)

    /**
     * @param httpsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpsHealthCheckArgs.builder
      builder.httpsHealthCheck(args(argsBuilder).build)

    /**
     * @param logConfig Configure logging on this health check.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param sslHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def sslHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckSslHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckSslHealthCheckArgs.builder
      builder.sslHealthCheck(args(argsBuilder).build)

    /**
     * @param tcpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def tcpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckTcpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.RegionHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckTcpHealthCheckArgs.builder
      builder.tcpHealthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder)
    /**
     * @param allInstancesConfig Properties to set on all instances in the group. After setting
     * allInstancesConfig on the group, you must update the group&#39;s instances to
     * apply the configuration.
     * @return builder
     */
    inline def allInstancesConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAllInstancesConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAllInstancesConfigArgs.builder
      builder.allInstancesConfig(args(argsBuilder).build)

    /**
     * @param autoHealingPolicies The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * @return builder
     */
    inline def autoHealingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAutoHealingPoliciesArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAutoHealingPoliciesArgs.builder
      builder.autoHealingPolicies(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy The flexibility policy for managed instance group. Instance flexibility allows managed instance group to create VMs from multiple types of machines. Instance flexibility configuration on managed instance group overrides instance template configuration. Structure is documented below.
     * @return builder
     */
    inline def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

    /**
     * @param instanceLifecyclePolicy The instance lifecycle policy for this managed instance group.
     * @return builder
     */
    inline def instanceLifecyclePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyArgs.builder
      builder.instanceLifecyclePolicy(args(argsBuilder).build)

    /**
     * @param namedPorts The named port configuration. See the section below
     * for details on configuration.
     * @return builder
     */
    inline def namedPorts(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerNamedPortArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerNamedPortArgs.builder
      builder.namedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param params ) Input only additional params for instance group manager creation. Structure is documented below. For more information, see [API](https://cloud.google.com/compute/docs/reference/rest/beta/instanceGroupManagers/insert).
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerParamsArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resourcePolicies Resource policies for this managed instance group. Structure is documented below.
     * 
     * ***
     * @return builder
     */
    inline def resourcePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerResourcePoliciesArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerResourcePoliciesArgs.builder
      builder.resourcePolicies(args(argsBuilder).build)

    /**
     * @param standbyPolicy The standby policy for stopped and suspended instances. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/suspended-and-stopped-vms-in-mig).
     * @return builder
     */
    inline def standbyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStandbyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStandbyPolicyArgs.builder
      builder.standbyPolicy(args(argsBuilder).build)

    /**
     * @param statefulDisks Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs). Proactive cross zone instance redistribution must be disabled before you can update stateful disks on existing instance group managers. This can be controlled via the `updatePolicy`.
     * @return builder
     */
    inline def statefulDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulDiskArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulDiskArgs.builder
      builder.statefulDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulExternalIps External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulExternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulExternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulExternalIpArgs.builder
      builder.statefulExternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulInternalIps Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulInternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulInternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulInternalIpArgs.builder
      builder.statefulInternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param targetSizePolicies The policy that specifies how the MIG creates its VMs to achieve the target size. Structure is documented below.
     * @return builder
     */
    inline def targetSizePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerTargetSizePolicyArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerTargetSizePolicyArgs.builder
      builder.targetSizePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param updatePolicy The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     * @return builder
     */
    inline def updatePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

    /**
     * @param versions Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * @return builder
     */
    inline def versions(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder)
    /**
     * @param advancedMachineFeatures Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param disks Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machineType`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param serviceAccount Service account to attach to the instance. Structure is documented below.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity Config. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstanceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionInstantSnapshotArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstantSnapshotParamsArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstantSnapshotArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstantSnapshotParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionInstantSnapshotIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstantSnapshotIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionInstantSnapshotIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionInstantSnapshotIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs.Builder)
    /**
     * @param appEngine This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def appEngine(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupAppEngineArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupAppEngineArgs.builder
      builder.appEngine(args(argsBuilder).build)

    /**
     * @param cloudFunction This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudFunction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudFunctionArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudFunctionArgs.builder
      builder.cloudFunction(args(argsBuilder).build)

    /**
     * @param cloudRun This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudRun(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudRunArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudRunArgs.builder
      builder.cloudRun(args(argsBuilder).build)

    /**
     * @param pscData This field is only used for PSC NEGs.
     * Structure is documented below.
     * @return builder
     */
    inline def pscData(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupPscDataArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupPscDataArgs.builder
      builder.pscData(args(argsBuilder).build)

    /**
     * @param serverlessDeployment (Optional, Beta)
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def serverlessDeployment(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupServerlessDeploymentArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupServerlessDeploymentArgs.builder
      builder.serverlessDeployment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionNetworkFirewallPolicyIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkFirewallPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionNetworkFirewallPolicyIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkFirewallPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionNetworkFirewallPolicyRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkFirewallPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.RegionNetworkFirewallPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RegionNetworkFirewallPolicyWithRulesArgs.Builder)
    /**
     * @param rules A list of firewall policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs.Builder]*):
        com.pulumi.gcp.compute.RegionNetworkFirewallPolicyWithRulesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RegionNetworkPolicyTrafficClassificationRuleArgs.Builder)
    /**
     * @param action The Action to perform when the client connection triggers the rule.
     * Structure is documented below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleActionArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkPolicyTrafficClassificationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.RegionNetworkPolicyTrafficClassificationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the traffic classification rule applies to.
     * If targetSecureTag are specified, then the traffic classification rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.RegionNetworkPolicyTrafficClassificationRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RegionPerInstanceConfigArgs.Builder)
    /**
     * @param preservedState The preserved state for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def preservedState(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.Builder]):
        com.pulumi.gcp.compute.RegionPerInstanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.builder
      builder.preservedState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionResizeRequestArgs.Builder)
    /**
     * @param requestedRunDuration Requested run duration for instances that will be created by this request. At the end of the run duration instances will be deleted.
     * Structure is documented below.
     * @return builder
     */
    inline def requestedRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestRequestedRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.RegionResizeRequestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestRequestedRunDurationArgs.builder
      builder.requestedRunDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionSecurityPolicyArgs.Builder)
    /**
     * @param advancedOptionsConfig Advanced Options Config of this security policy.
     * Structure is documented below.
     * @return builder
     */
    inline def advancedOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionSecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigArgs.builder
      builder.advancedOptionsConfig(args(argsBuilder).build)

    /**
     * @param ddosProtectionConfig Configuration for Google Cloud Armor DDOS Proctection Config.
     * Structure is documented below.
     * @return builder
     */
    inline def ddosProtectionConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyDdosProtectionConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionSecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyDdosProtectionConfigArgs.builder
      builder.ddosProtectionConfig(args(argsBuilder).build)

    /**
     * @param rules The set of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.RegionSecurityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param userDefinedFields Definitions of user-defined fields for CLOUD_ARMOR_NETWORK policies.
     * A user-defined field consists of up to 4 bytes extracted from a fixed offset in the packet, relative to the IPv4, IPv6, TCP, or UDP header, with an optional mask to select certain bits.
     * Rules may then specify matching values for these fields.
     * Structure is documented below.
     * @return builder
     */
    inline def userDefinedFields(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyUserDefinedFieldArgs.Builder]*):
        com.pulumi.gcp.compute.RegionSecurityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyUserDefinedFieldArgs.builder
      builder.userDefinedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RegionSecurityPolicyRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param networkMatch A match condition that incoming packets are evaluated against for CLOUD_ARMOR_NETWORK security policies. If it matches, the corresponding &#39;action&#39; is enforced.
     * The match criteria for a rule consists of built-in match fields (like &#39;srcIpRanges&#39;) and potentially multiple user-defined match fields (&#39;userDefinedFields&#39;).
     * Field values may be extracted directly from the packet or derived from it (e.g. &#39;srcRegionCodes&#39;). Some fields may not be present in every packet (e.g. &#39;srcPorts&#39;). A user-defined field is only present if the base header is found in the packet and the entire field is in bounds.
     * Each match field may specify which values can match it, listing one or more ranges, prefixes, or exact values that are considered a match for the field. A field value must be present in order to match a specified match field. If no match values are specified for a match field, then any field value is considered to match it, and it&#39;s not required to be present. For strings specifying &#39;*&#39; is also equivalent to match all.
     * For a packet to match a rule, all specified match fields must match the corresponding field values derived from the packet.
     * Example:
     * networkMatch: srcIpRanges: - &#34;192.0.2.0/24&#34; - &#34;198.51.100.0/24&#34; userDefinedFields: - name: &#34;ipv4FragmentOffset&#34; values: - &#34;1-0x1fff&#34;
     * The above match condition matches packets with a source IP in 192.0.2.0/24 or 198.51.100.0/24 and a user-defined field named &#34;ipv4FragmentOffset&#34; with a value between 1 and 0x1fff inclusive
     * Structure is documented below.
     * @return builder
     */
    inline def networkMatch(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.Builder]):
        com.pulumi.gcp.compute.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.builder
      builder.networkMatch(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule.
     * If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
     * Structure is documented below.
     * @return builder
     */
    inline def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param rateLimitOptions Must be specified if the action is &#34;rateBasedBan&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * Structure is documented below.
     * @return builder
     */
    inline def rateLimitOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.Builder]):
        com.pulumi.gcp.compute.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.builder
      builder.rateLimitOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RegionUrlMapArgs.Builder)
    /**
     * @param defaultRouteAction defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within defaultRouteAction.
     * defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultRouteAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.RegionUrlMapArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.builder
      builder.defaultRouteAction(args(argsBuilder).build)

    /**
     * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultUrlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.RegionUrlMapArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultUrlRedirectArgs.builder
      builder.defaultUrlRedirect(args(argsBuilder).build)

    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.RegionUrlMapArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param hostRules The list of HostRules to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    inline def hostRules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapHostRuleArgs.Builder]*):
        com.pulumi.gcp.compute.RegionUrlMapArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapHostRuleArgs.builder
      builder.hostRules(args.map(_(argsBuilder).build)*)

    /**
     * @param pathMatchers The list of named PathMatchers to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    inline def pathMatchers(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder]*):
        com.pulumi.gcp.compute.RegionUrlMapArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.builder
      builder.pathMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param tests The list of expected URL mappings. Requests to update this UrlMap will
     * succeed only if all of the test cases pass.
     * Structure is documented below.
     * @return builder
     */
    inline def tests(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapTestArgs.Builder]*):
        com.pulumi.gcp.compute.RegionUrlMapArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapTestArgs.builder
      builder.tests(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.ReservationArgs.Builder)
    /**
     * @param deleteAfterDuration Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
     * Structure is documented below.
     * @return builder
     */
    inline def deleteAfterDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationDeleteAfterDurationArgs.Builder]):
        com.pulumi.gcp.compute.ReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationDeleteAfterDurationArgs.builder
      builder.deleteAfterDuration(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationParamsArgs.Builder]):
        com.pulumi.gcp.compute.ReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationSharingPolicy Sharing policy for reservations with Google Cloud managed services.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationSharingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationReservationSharingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.ReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationReservationSharingPolicyArgs.builder
      builder.reservationSharingPolicy(args(argsBuilder).build)

    /**
     * @param shareSettings The share setting for reservations.
     * Structure is documented below.
     * @return builder
     */
    inline def shareSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs.Builder]):
        com.pulumi.gcp.compute.ReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs.builder
      builder.shareSettings(args(argsBuilder).build)

    /**
     * @param specificReservation Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * @return builder
     */
    inline def specificReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs.Builder]):
        com.pulumi.gcp.compute.ReservationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs.builder
      builder.specificReservation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ResizeRequestArgs.Builder)
    /**
     * @param requestedRunDuration Requested run duration for instances that will be created by this request. At the end of the run duration instance will be deleted.
     * Structure is documented below.
     * @return builder
     */
    inline def requestedRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.ResizeRequestRequestedRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.ResizeRequestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResizeRequestRequestedRunDurationArgs.builder
      builder.requestedRunDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ResourcePolicyArgs.Builder)
    /**
     * @param diskConsistencyGroupPolicy Replication consistency group for asynchronous disk replication.
     * Structure is documented below.
     * @return builder
     */
    inline def diskConsistencyGroupPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyDiskConsistencyGroupPolicyArgs.Builder]):
        com.pulumi.gcp.compute.ResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyDiskConsistencyGroupPolicyArgs.builder
      builder.diskConsistencyGroupPolicy(args(argsBuilder).build)

    /**
     * @param groupPlacementPolicy Resource policy for instances used for placement configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def groupPlacementPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyGroupPlacementPolicyArgs.Builder]):
        com.pulumi.gcp.compute.ResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyGroupPlacementPolicyArgs.builder
      builder.groupPlacementPolicy(args(argsBuilder).build)

    /**
     * @param instanceSchedulePolicy Resource policy for scheduling instance operations.
     * Structure is documented below.
     * @return builder
     */
    inline def instanceSchedulePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs.Builder]):
        com.pulumi.gcp.compute.ResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs.builder
      builder.instanceSchedulePolicy(args(argsBuilder).build)

    /**
     * @param snapshotSchedulePolicy Policy for creating snapshots of persistent disks.
     * Structure is documented below.
     * @return builder
     */
    inline def snapshotSchedulePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.Builder]):
        com.pulumi.gcp.compute.ResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs.builder
      builder.snapshotSchedulePolicy(args(argsBuilder).build)

    /**
     * @param workloadPolicy Represents the workload policy.
     * Structure is documented below.
     * @return builder
     */
    inline def workloadPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.ResourcePolicyWorkloadPolicyArgs.Builder]):
        com.pulumi.gcp.compute.ResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ResourcePolicyWorkloadPolicyArgs.builder
      builder.workloadPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RolloutPlanArgs.Builder)
    /**
     * @param waves The waves included in this rollout plan.
     * Structure is documented below.
     * @return builder
     */
    inline def waves(args: Endofunction[com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.Builder]*):
        com.pulumi.gcp.compute.RolloutPlanArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RolloutPlanWaveArgs.builder
      builder.waves(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RouteArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RouteParamsArgs.Builder]):
        com.pulumi.gcp.compute.RouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouteParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RouterArgs.Builder)
    /**
     * @param bgp BGP information specific to this router.
     * Structure is documented below.
     * @return builder
     */
    inline def bgp(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterBgpArgs.Builder]):
        com.pulumi.gcp.compute.RouterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

    /**
     * @param md5AuthenticationKeys Keys used for MD5 authentication.
     * Structure is documented below.
     * @return builder
     */
    inline def md5AuthenticationKeys(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterMd5AuthenticationKeysArgs.Builder]):
        com.pulumi.gcp.compute.RouterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterMd5AuthenticationKeysArgs.builder
      builder.md5AuthenticationKeys(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterParamsArgs.Builder]):
        com.pulumi.gcp.compute.RouterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RouterNamedSetArgs.Builder)
    /**
     * @param elements CEL expressions that are comparable to constructs of this set&#39;s type.
     * Structure is documented below.
     * @return builder
     */
    inline def elements(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNamedSetElementArgs.Builder]*):
        com.pulumi.gcp.compute.RouterNamedSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNamedSetElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RouterNatArgs.Builder)
    /**
     * @param logConfig Configuration for logging on NAT
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.RouterNatArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param nat64Subnetworks One or more subnetwork NAT configurations whose traffic should be translated by NAT64 Gateway.
     * Only used if `sourceSubnetworkIpRangesToNat64` is set to `LIST_OF_IPV6_SUBNETWORKS`
     * Structure is documented below.
     * @return builder
     */
    inline def nat64Subnetworks(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatNat64SubnetworkArgs.Builder]*):
        com.pulumi.gcp.compute.RouterNatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatNat64SubnetworkArgs.builder
      builder.nat64Subnetworks(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A list of rules associated with this NAT.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatRuleArgs.Builder]*):
        com.pulumi.gcp.compute.RouterNatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param subnetworks One or more subnetwork NAT configurations. Only used if
     * `sourceSubnetworkIpRangesToNat` is set to `LIST_OF_SUBNETWORKS`
     * Structure is documented below.
     * @return builder
     */
    inline def subnetworks(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterNatSubnetworkArgs.Builder]*):
        com.pulumi.gcp.compute.RouterNatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterNatSubnetworkArgs.builder
      builder.subnetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.RouterPeerArgs.Builder)
    /**
     * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is `CUSTOM` and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * @return builder
     */
    inline def advertisedIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerAdvertisedIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.RouterPeerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerAdvertisedIpRangeArgs.builder
      builder.advertisedIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param bfd BFD configuration for the BGP peering.
     * Structure is documented below.
     * @return builder
     */
    inline def bfd(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerBfdArgs.Builder]):
        com.pulumi.gcp.compute.RouterPeerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerBfdArgs.builder
      builder.bfd(args(argsBuilder).build)

    /**
     * @param customLearnedIpRanges The custom learned route IP address range. Must be a valid CIDR-formatted prefix.
     * If an IP address is provided without a subnet mask, it is interpreted as, for IPv4,
     * a /32 singular IP address range, and, for IPv6, /128.
     * Structure is documented below.
     * @return builder
     */
    inline def customLearnedIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerCustomLearnedIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.RouterPeerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerCustomLearnedIpRangeArgs.builder
      builder.customLearnedIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param md5AuthenticationKey Configuration for MD5 authentication on the BGP session.
     * Structure is documented below.
     * @return builder
     */
    inline def md5AuthenticationKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterPeerMd5AuthenticationKeyArgs.Builder]):
        com.pulumi.gcp.compute.RouterPeerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RouterPeerMd5AuthenticationKeyArgs.builder
      builder.md5AuthenticationKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.RouterRoutePolicyArgs.Builder)
    /**
     * @param terms List of terms (the order in the list is not important, they are evaluated in order of priority).
     * Structure is documented below.
     * @return builder
     */
    inline def terms(args: Endofunction[com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs.Builder]*):
        com.pulumi.gcp.compute.RouterRoutePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs.builder
      builder.terms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.SecurityPolicyArgs.Builder)
    /**
     * @param adaptiveProtectionConfig Configuration for [Google Cloud Armor Adaptive Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * @return builder
     */
    inline def adaptiveProtectionConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs.builder
      builder.adaptiveProtectionConfig(args(argsBuilder).build)

    /**
     * @param advancedOptionsConfig [Advanced Configuration Options](https://cloud.google.com/armor/docs/security-policy-overview#json-parsing).
     * Structure is documented below.
     * @return builder
     */
    inline def advancedOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyAdvancedOptionsConfigArgs.builder
      builder.advancedOptionsConfig(args(argsBuilder).build)

    /**
     * @param recaptchaOptionsConfig [reCAPTCHA Configuration Options](https://cloud.google.com/armor/docs/configure-security-policies?hl=en#use_a_manual_challenge_to_distinguish_between_human_or_automated_clients). Structure is documented below.
     * @return builder
     */
    inline def recaptchaOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRecaptchaOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRecaptchaOptionsConfigArgs.builder
      builder.recaptchaOptionsConfig(args(argsBuilder).build)

    /**
     * @param rules The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match &#34;\*&#34;). If no rules are provided when creating a
     * security policy, a default rule with action &#34;allow&#34; will be added. Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.SecurityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.SecurityPolicyRuleArgs.Builder)
    /**
     * @param headerAction Optional, additional actions that are performed on headers. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param match A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule.
     * If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
     * Structure is documented below.
     * @return builder
     */
    inline def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param rateLimitOptions Must be specified if the action is &#34;rateBasedBan&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * Structure is documented below.
     * @return builder
     */
    inline def rateLimitOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsArgs.builder
      builder.rateLimitOptions(args(argsBuilder).build)

    /**
     * @param redirectOptions Parameters defining the redirect action. Cannot be specified for any other actions. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
     * Structure is documented below.
     * @return builder
     */
    inline def redirectOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRedirectOptionsArgs.Builder]):
        com.pulumi.gcp.compute.SecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityPolicyRuleRedirectOptionsArgs.builder
      builder.redirectOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.SecurityScanConfigArgs.Builder)
    /**
     * @param authentication The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs.Builder]):
        com.pulumi.gcp.compute.SecurityScanConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param schedule The schedule of the ScanConfig
     * Structure is documented below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.gcp.compute.inputs.SecurityScanConfigScheduleArgs.Builder]):
        com.pulumi.gcp.compute.SecurityScanConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SecurityScanConfigScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ServiceAttachmentArgs.Builder)
    /**
     * @param consumerAcceptLists An array of projects that are allowed to connect to this service
     * attachment.
     * Structure is documented below.
     * @return builder
     */
    inline def consumerAcceptLists(args: Endofunction[com.pulumi.gcp.compute.inputs.ServiceAttachmentConsumerAcceptListArgs.Builder]*):
        com.pulumi.gcp.compute.ServiceAttachmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ServiceAttachmentConsumerAcceptListArgs.builder
      builder.consumerAcceptLists(args.map(_(argsBuilder).build)*)

    /**
     * @param tunnelingConfig (Optional, Beta)
     * Tunneling configuration for this service attachment.
     * Structure is documented below.
     * @return builder
     */
    inline def tunnelingConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.ServiceAttachmentTunnelingConfigArgs.Builder]):
        com.pulumi.gcp.compute.ServiceAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ServiceAttachmentTunnelingConfigArgs.builder
      builder.tunnelingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.SnapshotArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotParamsArgs.Builder]):
        com.pulumi.gcp.compute.SnapshotArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param snapshotEncryptionKey Encrypts the snapshot using a customer-supplied encryption key.
     * After you encrypt a snapshot using a customer-supplied key, you must
     * provide the same key if you use the snapshot later. For example, you
     * must provide the encryption key when you create a disk from the
     * encrypted snapshot in a future request.
     * Customer-supplied encryption keys do not protect access to metadata of
     * the snapshot.
     * If you do not provide an encryption key when creating the snapshot,
     * then the snapshot will be encrypted using an automatically generated
     * key and you do not need to provide a key to use the snapshot later.
     * ~&gt;**NOTE** Only changing `kmsKeySelfLink` between Cloud KMS keys is
     * done in place; other changes to this block recreate the snapshot.
     * Structure is documented below.
     * @return builder
     */
    inline def snapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.SnapshotArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyArgs.builder
      builder.snapshotEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceDiskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.SnapshotArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyArgs.builder
      builder.sourceDiskEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.SnapshotIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.SnapshotIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.SnapshotIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.SnapshotIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.SnapshotRecycleBinPolicyArgs.Builder)
    /**
     * @param rules The rules for the snapshot recycle bin policy. The key name is either &#39;default&#39;
     * or namespaced name of the tag value which can be in the format:
     * {organization_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_number}/{tag_key_short_name}/{tag_value_short_name}. The default rule is
     * applied if snapshots do not have any of these tags. The value is the rule for the key.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.SnapshotRecycleBinPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotRecycleBinPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.SnapshotSettingsArgs.Builder)
    /**
     * @param storageLocation Policy of which storage location is going to be resolved, and additional data
     * that particularizes how the policy is going to be carried out
     * Structure is documented below.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationArgs.Builder]):
        com.pulumi.gcp.compute.SnapshotSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SnapshotSettingsStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.StoragePoolArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolParamsArgs.Builder]):
        com.pulumi.gcp.compute.StoragePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.StoragePoolIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.StoragePoolIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.StoragePoolIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.StoragePoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.StoragePoolIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.StoragePoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.SubnetworkArgs.Builder)
    /**
     * @param logConfig This field denotes the VPC flow logging options for this subnetwork. If
     * logging is enabled, logs are exported to Cloud Logging. Flow logging
     * isn&#39;t supported if the subnet `purpose` field is set to subnetwork is
     * `REGIONAL_MANAGED_PROXY` or `GLOBAL_MANAGED_PROXY`.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.SubnetworkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkParamsArgs.Builder]):
        com.pulumi.gcp.compute.SubnetworkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param secondaryIpRanges An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * @return builder
     */
    inline def secondaryIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.SubnetworkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeArgs.builder
      builder.secondaryIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.SubnetworkIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.SubnetworkIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.SubnetworkIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.SubnetworkIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.SubnetworkIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.SubnetworkIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.URLMapArgs.Builder)
    /**
     * @param defaultCustomErrorResponsePolicy defaultCustomErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
     * This policy takes effect at the PathMatcher level and applies only when no policy has been defined for the error code at lower levels like RouteRule and PathRule within this PathMatcher. If an error code does not have a policy defined in defaultCustomErrorResponsePolicy, then a policy defined for the error code in UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * For example, consider a UrlMap with the following configuration:
     * UrlMap.defaultCustomErrorResponsePolicy is configured with policies for 5xx and 4xx errors
     * A RouteRule for /coming_soon/ is configured for the error code 404.
     * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * When used in conjunction with pathMatcher.defaultRouteAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the defaultCustomErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the defaultCustomErrorResponsePolicy is ignored and the response from the service is returned to the client.
     * defaultCustomErrorResponsePolicy is supported only for global external Application Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultCustomErrorResponsePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyArgs.Builder]):
        com.pulumi.gcp.compute.URLMapArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultCustomErrorResponsePolicyArgs.builder
      builder.defaultCustomErrorResponsePolicy(args(argsBuilder).build)

    /**
     * @param defaultRouteAction defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions
     * like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend.
     * If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService
     * is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultRouteAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.URLMapArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs.builder
      builder.defaultRouteAction(args(argsBuilder).build)

    /**
     * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultUrlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapDefaultUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.URLMapArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapDefaultUrlRedirectArgs.builder
      builder.defaultUrlRedirect(args(argsBuilder).build)

    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for
     * the selected backendService. The headerAction specified here take effect after
     * headerAction specified under pathMatcher.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.URLMapArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param hostRules The list of HostRules to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    inline def hostRules(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapHostRuleArgs.Builder]*):
        com.pulumi.gcp.compute.URLMapArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapHostRuleArgs.builder
      builder.hostRules(args.map(_(argsBuilder).build)*)

    /**
     * @param pathMatchers The list of named PathMatchers to use against the URL.
     * Structure is documented below.
     * @return builder
     */
    inline def pathMatchers(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.Builder]*):
        com.pulumi.gcp.compute.URLMapArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs.builder
      builder.pathMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param tests The list of expected URL mapping tests. Request to update this UrlMap will
     * succeed only if all of the test cases pass. You can specify a maximum of 100
     * tests per UrlMap.
     * Structure is documented below.
     * @return builder
     */
    inline def tests(args: Endofunction[com.pulumi.gcp.compute.inputs.URLMapTestArgs.Builder]*):
        com.pulumi.gcp.compute.URLMapArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.URLMapTestArgs.builder
      builder.tests(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.VPNGatewayArgs.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNGatewayParamsArgs.Builder]):
        com.pulumi.gcp.compute.VPNGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNGatewayParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.VPNTunnelArgs.Builder)
    /**
     * @param cipherSuite User specified list of ciphers to use for the phase 1 and phase 2 of the IKE protocol.
     * Structure is documented below.
     * @return builder
     */
    inline def cipherSuite(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuiteArgs.Builder]):
        com.pulumi.gcp.compute.VPNTunnelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNTunnelCipherSuiteArgs.builder
      builder.cipherSuite(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.VPNTunnelParamsArgs.Builder]):
        com.pulumi.gcp.compute.VPNTunnelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.VPNTunnelParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.WireGroupArgs.Builder)
    /**
     * @param endpoints Endpoints grouped by location, each mapping to interconnect configurations.
     * Structure is documented below.
     * @return builder
     */
    inline def endpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.WireGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param wireGroupProperties (Optional, Beta)
     * Properties specific to the wire group.
     * Structure is documented below.
     * @return builder
     */
    inline def wireGroupProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupWireGroupPropertiesArgs.Builder]):
        com.pulumi.gcp.compute.WireGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupWireGroupPropertiesArgs.builder
      builder.wireGroupProperties(args(argsBuilder).build)

    /**
     * @param wireProperties Default properties for wires within the group.
     * Structure is documented below.
     * @return builder
     */
    inline def wireProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.WireGroupWirePropertiesArgs.Builder]):
        com.pulumi.gcp.compute.WireGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.WireGroupWirePropertiesArgs.builder
      builder.wireProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.ZoneVmExtensionPolicyArgs.Builder)
    /**
     * @param extensionPolicies A map of extension names (for example, &#34;ops-agent&#34;) to their corresponding policy configurations.
     * Structure is documented below.
     * @return builder
     */
    inline def extensionPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyExtensionPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.ZoneVmExtensionPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyExtensionPolicyArgs.builder
      builder.extensionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectors Selectors to target VMs for this policy.
     * Structure is documented below.
     * @return builder
     */
    inline def instanceSelectors(args: Endofunction[com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorArgs.Builder]*):
        com.pulumi.gcp.compute.ZoneVmExtensionPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ZoneVmExtensionPolicyInstanceSelectorArgs.builder
      builder.instanceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder)
    /**
     * @param cpuUtilization Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * @return builder
     */
    inline def cpuUtilization(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyCpuUtilizationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyCpuUtilizationArgs.builder
      builder.cpuUtilization(args(argsBuilder).build)

    /**
     * @param loadBalancingUtilization Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * @return builder
     */
    inline def loadBalancingUtilization(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs.builder
      builder.loadBalancingUtilization(args(argsBuilder).build)

    /**
     * @param metrics Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyMetricArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

    /**
     * @param scaleDownControl (Optional, Beta)
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * @return builder
     */
    inline def scaleDownControl(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlArgs.builder
      builder.scaleDownControl(args(argsBuilder).build)

    /**
     * @param scaleInControl Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * @return builder
     */
    inline def scaleInControl(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleInControlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleInControlArgs.builder
      builder.scaleInControl(args(argsBuilder).build)

    /**
     * @param scalingSchedules Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * @return builder
     */
    inline def scalingSchedules(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScalingScheduleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScalingScheduleArgs.builder
      builder.scalingSchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlArgs.Builder)
    /**
     * @param maxScaledDownReplicas A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def maxScaledDownReplicas(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs.Builder]):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs.builder
      builder.maxScaledDownReplicas(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleInControlArgs.Builder)
    /**
     * @param maxScaledInReplicas A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def maxScaledInReplicas(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs.Builder]):
        com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleInControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs.builder
      builder.maxScaledInReplicas(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.AutoscalerState.Builder)
    /**
     * @param autoscalingPolicy The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * @return builder
     */
    inline def autoscalingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.AutoscalerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyArgs.builder
      builder.autoscalingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.Builder)
    /**
     * @param bypassCacheOnRequestHeaders Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
     * Structure is documented below.
     * @return builder
     */
    inline def bypassCacheOnRequestHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs.builder
      builder.bypassCacheOnRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheKeyPolicy The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * @return builder
     */
    inline def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
     * Structure is documented below.
     * @return builder
     */
    inline def negativeCachingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyNegativeCachingPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyNegativeCachingPolicyArgs.builder
      builder.negativeCachingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendBucketIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendBucketIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendBucketIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendBucketIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendBucketState.Builder)
    /**
     * @param cdnPolicy Cloud CDN configuration for this Backend Bucket.
     * Structure is documented below.
     * @return builder
     */
    inline def cdnPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendBucketState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs.builder
      builder.cdnPolicy(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendBucketParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendBucketState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendBucketParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceBackendArgs.Builder)
    /**
     * @param customMetrics The set of custom metrics that are used for &lt;code&gt;CUSTOM_METRICS&lt;/code&gt; BalancingMode.
     * Structure is documented below.
     * @return builder
     */
    inline def customMetrics(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceBackendCustomMetricArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceBackendArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceBackendCustomMetricArgs.builder
      builder.customMetrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.Builder)
    /**
     * @param bypassCacheOnRequestHeaders Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified.
     * The cache is bypassed for all cdnPolicy.cacheMode settings.
     * Structure is documented below.
     * @return builder
     */
    inline def bypassCacheOnRequestHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs.builder
      builder.bypassCacheOnRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheKeyPolicy The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * @return builder
     */
    inline def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
     * Structure is documented below.
     * @return builder
     */
    inline def negativeCachingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyNegativeCachingPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyNegativeCachingPolicyArgs.builder
      builder.negativeCachingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersArgs.Builder)
    /**
     * @param connectTimeout (Optional, Beta)
     * The timeout for new network connections to hosts.
     * Structure is documented below.
     * @return builder
     */
    inline def connectTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersConnectTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersConnectTimeoutArgs.builder
      builder.connectTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashArgs.Builder)
    /**
     * @param httpCookie Hash is based on HTTP Cookie. This field describes a HTTP cookie
     * that will be used as the hash key for the consistent hash load
     * balancer. If the cookie is not present, it will be generated.
     * This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
     * Structure is documented below.
     * @return builder
     */
    inline def httpCookie(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashHttpCookieArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashHttpCookieArgs.builder
      builder.httpCookie(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashHttpCookieArgs.Builder)
    /**
     * @param ttl Lifetime of the cookie.
     * Structure is documented below.
     * @return builder
     */
    inline def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashHttpCookieTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashHttpCookieArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashHttpCookieTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingArgs.Builder)
    /**
     * @param forwardProxy (Optional, Beta)
     * Dynamic Forwarding Proxy configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def forwardProxy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingForwardProxyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingForwardProxyArgs.builder
      builder.forwardProxy(args(argsBuilder).build)

    /**
     * @param ipPortSelection (Optional, Beta)
     * IP:PORT based dynamic forwarding configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def ipPortSelection(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingIpPortSelectionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingIpPortSelectionArgs.builder
      builder.ipPortSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyArgs.Builder)
    /**
     * @param customPolicy The configuration for a custom policy implemented by the user and
     * deployed with the client.
     * Structure is documented below.
     * @return builder
     */
    inline def customPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyCustomPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyCustomPolicyArgs.builder
      builder.customPolicy(args(argsBuilder).build)

    /**
     * @param policy The configuration for a built-in load balancing policy.
     * Structure is documented below.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyPolicyArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceLogConfigArgs.Builder)
    /**
     * @param requestHeaders This field can only be specified if logging is enabled for this backend service and if the BackendService protocol is one of HTTP, HTTPS, HTTP2 and GRPC. Contains a list of request headers to be logged.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLogConfigRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceLogConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLogConfigRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaders This field can only be specified if logging is enabled for this backend service and if the BackendService protocol is one of HTTP, HTTPS, HTTP2 and GRPC. Contains a list of response headers to be logged.
     * Structure is documented below.
     * @return builder
     */
    inline def responseHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLogConfigResponseHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceLogConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLogConfigResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder)
    /**
     * @param zonalAffinity When configured, new connections are load balanced across healthy backend endpoints in the local zone.
     * Structure is documented below.
     * @return builder
     */
    inline def zonalAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs.builder
      builder.zonalAffinity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionArgs.Builder)
    /**
     * @param baseEjectionTime The base time that a host is ejected for. The real time is equal to the base
     * time multiplied by the number of times the host has been ejected. Defaults to
     * 30000ms or 30s.
     * Structure is documented below.
     * @return builder
     */
    inline def baseEjectionTime(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionBaseEjectionTimeArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionBaseEjectionTimeArgs.builder
      builder.baseEjectionTime(args(argsBuilder).build)

    /**
     * @param interval Time interval between ejection sweep analysis. This can result in both new
     * ejections as well as hosts being returned to service. Defaults to 10 seconds.
     * Structure is documented below.
     * @return builder
     */
    inline def interval(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionIntervalArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionIntervalArgs.builder
      builder.interval(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsArgs.Builder)
    /**
     * @param awsV4Authentication The configuration needed to generate a signature for access to private storage buckets that support AWS&#39;s Signature Version 4 for authentication.
     * Allowed only for INTERNET_IP_PORT and INTERNET_FQDN_PORT NEG backends.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedSecuritySettingsAwsV4Authentication&#34;&gt;&lt;/a&gt;The `awsV4Authentication` block supports:
     * @return builder
     */
    inline def awsV4Authentication(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsAwsV4AuthenticationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsAwsV4AuthenticationArgs.builder
      builder.awsV4Authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceState.Builder)
    /**
     * @param backends The set of backends that serve this BackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def backends(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceBackendArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param cdnPolicy Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def cdnPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyArgs.builder
      builder.cdnPolicy(args(argsBuilder).build)

    /**
     * @param circuitBreakers Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def circuitBreakers(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersArgs.builder
      builder.circuitBreakers(args(argsBuilder).build)

    /**
     * @param consistentHash Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing. This field only applies if the loadBalancingScheme is set to
     * INTERNAL_SELF_MANAGED. This field is only applicable when localityLbPolicy is
     * set to MAGLEV or RING_HASH.
     * Structure is documented below.
     * @return builder
     */
    inline def consistentHash(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceConsistentHashArgs.builder
      builder.consistentHash(args(argsBuilder).build)

    /**
     * @param customMetrics List of custom metrics that are used for the WEIGHTED_ROUND_ROBIN locality_lb_policy.
     * Structure is documented below.
     * @return builder
     */
    inline def customMetrics(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceCustomMetricArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceCustomMetricArgs.builder
      builder.customMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicForwarding (Optional, Beta)
     * Dynamic forwarding configuration. This field is used to configure the backend service with dynamic forwarding
     * feature which together with Service Extension allows customized and complex routing logic.
     * Structure is documented below.
     * @return builder
     */
    inline def dynamicForwarding(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceDynamicForwardingArgs.builder
      builder.dynamicForwarding(args(argsBuilder).build)

    /**
     * @param iap Settings for enabling Cloud Identity Aware Proxy.
     * If OAuth client is not set, the Google-managed OAuth client is used.
     * Structure is documented below.
     * @return builder
     */
    inline def iap(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceIapArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceIapArgs.builder
      builder.iap(args(argsBuilder).build)

    /**
     * @param localityLbPolicies A list of locality load balancing policies to be used in order of
     * preference. Either the policy or the customPolicy field should be set.
     * Overrides any value set in the localityLbPolicy field.
     * localityLbPolicies is only supported when the BackendService is referenced
     * by a URL Map that is referenced by a target gRPC proxy that has the
     * validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def localityLbPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLocalityLbPolicyArgs.builder
      builder.localityLbPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param logConfig This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param maxStreamDuration Specifies the default maximum duration (timeout) for streams to this service. Duration is computed from the
     * beginning of the stream until the response has been completely processed, including all retries. A stream that
     * does not complete in this duration is closed.
     * If not specified, there will be no timeout limit, i.e. the maximum duration is infinite.
     * This value can be overridden in the PathMatcher configuration of the UrlMap that references this backend service.
     * This field is only allowed when the loadBalancingScheme of the backend service is INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def maxStreamDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceMaxStreamDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceMaxStreamDurationArgs.builder
      builder.maxStreamDuration(args(argsBuilder).build)

    /**
     * @param networkPassThroughLbTrafficPolicy (Optional, Beta)
     * Configures traffic steering properties of internal passthrough Network Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def networkPassThroughLbTrafficPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyArgs.builder
      builder.networkPassThroughLbTrafficPolicy(args(argsBuilder).build)

    /**
     * @param outlierDetection Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * Applicable backend service types can be a global backend service with the
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED or EXTERNAL_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def outlierDetection(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionArgs.builder
      builder.outlierDetection(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param securitySettings The security settings that apply to this backend service. This field is applicable to either
     * a regional backend service with the serviceProtocol set to HTTP, HTTPS, HTTP2 or H2C, and
     * loadBalancingScheme set to INTERNAL_MANAGED; or a global backend service with the
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def securitySettings(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsArgs.builder
      builder.securitySettings(args(argsBuilder).build)

    /**
     * @param strongSessionAffinityCookie Describes the HTTP cookie used for stateful session affinity. This field is applicable and required if the sessionAffinity is set to STRONG_COOKIE_AFFINITY.
     * Structure is documented below.
     * @return builder
     */
    inline def strongSessionAffinityCookie(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieArgs.builder
      builder.strongSessionAffinityCookie(args(argsBuilder).build)

    /**
     * @param tlsSettings Configuration for Backend Authenticated TLS and mTLS. May only be specified when the backend protocol is SSL, HTTPS or HTTP2.
     * Structure is documented below.
     * @return builder
     */
    inline def tlsSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsArgs.builder
      builder.tlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieArgs.Builder)
    /**
     * @param ttl Lifetime of the cookie.
     * Structure is documented below.
     * @return builder
     */
    inline def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceStrongSessionAffinityCookieTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsArgs.Builder)
    /**
     * @param subjectAltNames A list of Subject Alternative Names (SANs) that the Load Balancer verifies during a TLS handshake with the backend.
     * When the server presents its X.509 certificate to the Load Balancer, the Load Balancer inspects the certificate&#39;s SAN field,
     * and requires that at least one SAN match one of the subjectAltNames in the list. This field is limited to 5 entries.
     * When both sni and subjectAltNames are specified, the load balancer matches the backend certificate&#39;s SAN only to
     * subjectAltNames.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectAltNames(args: Endofunction[com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsSubjectAltNameArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BackendServiceTlsSettingsSubjectAltNameArgs.builder
      builder.subjectAltNames(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.BulkPerInstanceConfigState.Builder)
    /**
     * @param instances The list of per-instance configs.
     * Structure is documented below.
     * @return builder
     */
    inline def instances(args: Endofunction[com.pulumi.gcp.compute.inputs.BulkPerInstanceConfigInstanceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.BulkPerInstanceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.BulkPerInstanceConfigInstanceArgs.builder
      builder.instances(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.DiskAsyncReplicationState.Builder)
    /**
     * @param secondaryDisk The secondary disk (target of replication). You can specify only one value. Structure is documented below.
     * @return builder
     */
    inline def secondaryDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskAsyncReplicationSecondaryDiskArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskAsyncReplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskAsyncReplicationSecondaryDiskArgs.builder
      builder.secondaryDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.DiskIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.DiskIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.DiskState.Builder)
    /**
     * @param asyncPrimaryDisk A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def asyncPrimaryDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskAsyncPrimaryDiskArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskAsyncPrimaryDiskArgs.builder
      builder.asyncPrimaryDisk(args(argsBuilder).build)

    /**
     * @param diskEncryptionKey Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * ~&gt;**NOTE** Only changing `kmsKeySelfLink` between Cloud KMS keys is
     * done in place; other changes to this block recreate the disk.
     * Structure is documented below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param guestOsFeatures A list of features to enable on the guest operating system.
     * Applicable only for bootable disks.
     * Structure is documented below.
     * @return builder
     */
    inline def guestOsFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.DiskState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.DiskGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.DiskSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.DiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.DiskSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ExternalVpnGatewayState.Builder)
    /**
     * @param interfaces A list of interfaces on this external VPN gateway.
     * Structure is documented below.
     * @return builder
     */
    inline def interfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.ExternalVpnGatewayInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ExternalVpnGatewayState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ExternalVpnGatewayInterfaceArgs.builder
      builder.interfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.ExternalVpnGatewayParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ExternalVpnGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ExternalVpnGatewayParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FirewallPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FirewallPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedMatchLayer4Configs&#34;&gt;&lt;/a&gt;The `layer4Configs` block supports:
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyRuleState.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FirewallPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target secure tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleArgs.Builder)
    /**
     * @param matches (Output)
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def matches(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

    /**
     * @param targetSecureTags (Output)
     * A list of secure tags that controls which instances the firewall rule
     * applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the
     * firewall rule applies only to instances in the VPC network that have one
     * of those EFFECTIVE secure tags, if all the targetSecureTag are in
     * INEFFECTIVE state, then this rule will be ignored.
     * &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as
     * &lt;code&gt;targetServiceAccounts&lt;/code&gt;.
     * If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor
     * &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies
     * to all instances on the specified network.
     * Maximum number of target secure tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source
     * of the traffic.
     * For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE,
     * and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored.
     * Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule
     * applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the
     * firewall rule applies only to instances in the VPC network that have one
     * of those EFFECTIVE secure tags, if all the targetSecureTag are in
     * INEFFECTIVE state, then this rule will be ignored.
     * &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as
     * &lt;code&gt;targetServiceAccounts&lt;/code&gt;.
     * If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor
     * &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies
     * to all instances on the specified network.
     * Maximum number of target secure tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source
     * of the traffic.
     * For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE,
     * and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored.
     * Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesState.Builder)
    /**
     * @param predefinedRules A list of pre-define firewall policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def predefinedRules(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesPredefinedRuleArgs.builder
      builder.predefinedRules(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A list of firewall policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallPolicyWithRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FirewallState.Builder)
    /**
     * @param allows The list of ALLOW rules specified by this firewall. Each rule
     * specifies a protocol and port-range tuple that describes a permitted
     * connection.
     * Structure is documented below.
     * @return builder
     */
    inline def allows(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallAllowArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallAllowArgs.builder
      builder.allows(args.map(_(argsBuilder).build)*)

    /**
     * @param denies The list of DENY rules specified by this firewall. Each rule specifies
     * a protocol and port-range tuple that describes a denied connection.
     * Structure is documented below.
     * @return builder
     */
    inline def denies(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallDenyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FirewallState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FirewallDenyArgs.builder
      builder.denies(args.map(_(argsBuilder).build)*)

    /**
     * @param logConfig This field denotes the logging options for a particular firewall rule.
     * If defined, logging is enabled, and logs will be exported to Cloud Logging.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FirewallState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.FirewallParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FirewallState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FirewallParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ForwardingRuleState.Builder)
    /**
     * @param serviceDirectoryRegistrations Service Directory resources to register this forwarding rule with.
     * Currently, only supports a single Service Directory resource.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryRegistrations(args: Endofunction[com.pulumi.gcp.compute.inputs.ForwardingRuleServiceDirectoryRegistrationsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ForwardingRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ForwardingRuleServiceDirectoryRegistrationsArgs.builder
      builder.serviceDirectoryRegistrations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationArgs.Builder)
    /**
     * @param reservedResources futureReservations.list of reserved resources (CPUs, memory, accelerators).
     * Structure is documented below.
     * @return builder
     */
    inline def reservedResources(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationReservedResourceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationReservedResourceArgs.builder
      builder.reservedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationReservedResourceArgs.Builder)
    /**
     * @param accelerator Properties of accelerator resources in this reservation.
     * Structure is documented below.
     * @return builder
     */
    inline def accelerator(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationReservedResourceAcceleratorArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationReservedResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationReservedResourceAcceleratorArgs.builder
      builder.accelerator(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsArgs.Builder)
    /**
     * @param projectMaps A map of project id and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * @return builder
     */
    inline def projectMaps(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsProjectMapArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsProjectMapArgs.builder
      builder.projectMaps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesArgs.Builder)
    /**
     * @param instanceProperties Properties of the SKU instances being reserved.
     * Structure is documented below.
     * @return builder
     */
    inline def instanceProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesArgs.builder
      builder.instanceProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesArgs.Builder)
    /**
     * @param guestAccelerators Specifies accelerator type and count.
     * Structure is documented below.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param localSsds Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * Structure is documented below.
     * @return builder
     */
    inline def localSsds(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesLocalSsdArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesLocalSsdArgs.builder
      builder.localSsds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationState.Builder)
    /**
     * @param aggregateReservation Aggregate reservation details for the future reservation.
     * Structure is documented below.
     * @return builder
     */
    inline def aggregateReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationArgs.builder
      builder.aggregateReservation(args(argsBuilder).build)

    /**
     * @param autoCreatedReservationsDuration Specifies the duration of auto-created reservations. It represents relative time to future reservation startTime when auto-created reservations will be automatically deleted by Compute Engine. Duration time unit is represented as a count of seconds and fractions of seconds at nanosecond resolution.
     * Structure is documented below.
     * @return builder
     */
    inline def autoCreatedReservationsDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationAutoCreatedReservationsDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationAutoCreatedReservationsDurationArgs.builder
      builder.autoCreatedReservationsDuration(args(argsBuilder).build)

    /**
     * @param commitmentInfo If not present, then FR will not deliver a new commitment or update an existing commitment.
     * Structure is documented below.
     * @return builder
     */
    inline def commitmentInfo(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationCommitmentInfoArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationCommitmentInfoArgs.builder
      builder.commitmentInfo(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param shareSettings Settings for sharing the future reservation
     * Structure is documented below.
     * @return builder
     */
    inline def shareSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationShareSettingsArgs.builder
      builder.shareSettings(args(argsBuilder).build)

    /**
     * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * @return builder
     */
    inline def specificSkuProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesArgs.builder
      builder.specificSkuProperties(args(argsBuilder).build)

    /**
     * @param statuses [Output only] Status of the Future Reservation
     * Structure is documented below.
     * @return builder
     */
    inline def statuses(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param timeWindow Time window for this Future Reservation.
     * Structure is documented below.
     * @return builder
     */
    inline def timeWindow(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs.builder
      builder.timeWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationStatusArgs.Builder)
    /**
     * @param lastKnownGoodState This field represents the future reservation before an amendment was requested. If the amendment is declined, the Future Reservation will be reverted to the last known good state. The last known good state is not set when updating a future reservation whose Procurement Status is DRAFTING.
     * Structure is documented below.
     * @return builder
     */
    inline def lastKnownGoodState(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateArgs.builder
      builder.lastKnownGoodState(args(argsBuilder).build)

    /**
     * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * @return builder
     */
    inline def specificSkuProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusSpecificSkuPropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusSpecificSkuPropertiesArgs.builder
      builder.specificSkuProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateArgs.Builder)
    /**
     * @param existingMatchingUsageInfo Represents the matching usage for the future reservation before an amendment was requested.
     * Structure is documented below.
     * @return builder
     */
    inline def existingMatchingUsageInfo(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateExistingMatchingUsageInfoArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateExistingMatchingUsageInfoArgs.builder
      builder.existingMatchingUsageInfo(args(argsBuilder).build)

    /**
     * @param futureReservationSpecs The previous instance-related properties of the Future Reservation.
     * Structure is documented below.
     * @return builder
     */
    inline def futureReservationSpecs(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs.builder
      builder.futureReservationSpecs(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs.Builder)
    /**
     * @param shareSettings Settings for sharing the future reservation
     * Structure is documented below.
     * @return builder
     */
    inline def shareSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs.builder
      builder.shareSettings(args(argsBuilder).build)

    /**
     * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * @return builder
     */
    inline def specificSkuProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs.builder
      builder.specificSkuProperties(args(argsBuilder).build)

    /**
     * @param timeWindow Time window for this Future Reservation.
     * Structure is documented below.
     * @return builder
     */
    inline def timeWindow(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs.builder
      builder.timeWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs.Builder)
    /**
     * @param projectMaps A map of project id and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * @return builder
     */
    inline def projectMaps(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs.builder
      builder.projectMaps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs.Builder)
    /**
     * @param instanceProperties Properties of the SKU instances being reserved.
     * Structure is documented below.
     * @return builder
     */
    inline def instanceProperties(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesArgs.builder
      builder.instanceProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesArgs.Builder)
    /**
     * @param guestAccelerators Specifies accelerator type and count.
     * Structure is documented below.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param localSsds Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * Structure is documented below.
     * @return builder
     */
    inline def localSsds(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsdArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsdArgs.builder
      builder.localSsds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs.Builder)
    /**
     * @param duration Duration of the future reservation
     * Structure is documented below.
     * @return builder
     */
    inline def duration(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowDurationArgs.builder
      builder.duration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs.Builder)
    /**
     * @param duration Duration of the future reservation
     * Structure is documented below.
     * @return builder
     */
    inline def duration(args: Endofunction[com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowDurationArgs.builder
      builder.duration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterArgs.Builder)
    /**
     * @param filterLabels The list of label value pairs that must match labels in the
     * provided metadata based on filterMatchCriteria
     * This list must not be empty and can have at the most 64 entries.
     * Structure is documented below.
     * @return builder
     */
    inline def filterLabels(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterFilterLabelArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterFilterLabelArgs.builder
      builder.filterLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalForwardingRuleState.Builder)
    /**
     * @param metadataFilters Opaque filter criteria used by Loadbalancer to restrict routing
     * configuration to a limited set xDS compliant clients. In their xDS
     * requests to Loadbalancer, xDS clients present node metadata. If a
     * match takes place, the relevant routing configuration is made available
     * to those proxies.
     * For each metadataFilter in this list, if its filterMatchCriteria is set
     * to MATCH_ANY, at least one of the filterLabels must match the
     * corresponding label provided in the metadata. If its filterMatchCriteria
     * is set to MATCH_ALL, then all of its filterLabels must match with
     * corresponding labels in the provided metadata.
     * metadataFilters specified here can be overridden by those specified in
     * the UrlMap that this ForwardingRule references.
     * metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * @return builder
     */
    inline def metadataFilters(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalForwardingRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterArgs.builder
      builder.metadataFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceDirectoryRegistrations Service Directory resources to register this forwarding rule with.
     * Currently, only supports a single Service Directory resource.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryRegistrations(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalForwardingRuleServiceDirectoryRegistrationsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.GlobalForwardingRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.GlobalForwardingRuleServiceDirectoryRegistrationsArgs.builder
      builder.serviceDirectoryRegistrations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorArgs.Builder)
    /**
     * @param labelSelector LabelSelector matches VM labels.
     * Structure is documented below.
     * @return builder
     */
    inline def labelSelector(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorLabelSelectorArgs.Builder]):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorLabelSelectorArgs.builder
      builder.labelSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationArgs.Builder)
    /**
     * @param rolloutInput Rollout input settings.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutInput(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutInputArgs.Builder]):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutInputArgs.builder
      builder.rolloutInput(args(argsBuilder).build)

    /**
     * @param rolloutStatuses (Output)
     * Rollout status.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutStatuses(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusArgs.builder
      builder.rolloutStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusArgs.Builder)
    /**
     * @param currentRollouts The current rollouts for the latest version of the resource.
     * @return builder
     */
    inline def currentRollouts(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusCurrentRolloutArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusCurrentRolloutArgs.builder
      builder.currentRollouts(args.map(_(argsBuilder).build)*)

    /**
     * @param previousRollouts Rollout status of the previous rollout.
     * @return builder
     */
    inline def previousRollouts(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusPreviousRolloutArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusPreviousRolloutArgs.builder
      builder.previousRollouts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusCurrentRolloutArgs.Builder)
    /**
     * @param locationRolloutStatuses The rollout status for each location.
     * @return builder
     */
    inline def locationRolloutStatuses(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusCurrentRolloutLocationRolloutStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusCurrentRolloutArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusCurrentRolloutLocationRolloutStatusArgs.builder
      builder.locationRolloutStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusPreviousRolloutArgs.Builder)
    /**
     * @param locationRolloutStatuses The rollout status for each location.
     * @return builder
     */
    inline def locationRolloutStatuses(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusPreviousRolloutLocationRolloutStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusPreviousRolloutArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationRolloutStatusPreviousRolloutLocationRolloutStatusArgs.builder
      builder.locationRolloutStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyState.Builder)
    /**
     * @param extensionPolicies Map from extension (eg: &#34;cloudops&#34;) to its policy configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def extensionPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyExtensionPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyExtensionPolicyArgs.builder
      builder.extensionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSelectors Selector to target VMs for a policy.
     * Structure is documented below.
     * @return builder
     */
    inline def instanceSelectors(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyInstanceSelectorArgs.builder
      builder.instanceSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param rolloutOperation Represents the rollout operation.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutOperation(args: Endofunction[com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.GlobalVmExtensionPolicyRolloutOperationArgs.builder
      builder.rolloutOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.HaVpnGatewayState.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.HaVpnGatewayParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HaVpnGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HaVpnGatewayParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param vpnInterfaces A list of interfaces on this VPN gateway.
     * Structure is documented below.
     * @return builder
     */
    inline def vpnInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.HaVpnGatewayVpnInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.HaVpnGatewayState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.HaVpnGatewayVpnInterfaceArgs.builder
      builder.vpnInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.HealthCheckState.Builder)
    /**
     * @param grpcHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckGrpcHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckGrpcHealthCheckArgs.builder
      builder.grpcHealthCheck(args(argsBuilder).build)

    /**
     * @param grpcTlsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcTlsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckGrpcTlsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckGrpcTlsHealthCheckArgs.builder
      builder.grpcTlsHealthCheck(args(argsBuilder).build)

    /**
     * @param http2HealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def http2HealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckHttp2HealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckHttp2HealthCheckArgs.builder
      builder.http2HealthCheck(args(argsBuilder).build)

    /**
     * @param httpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckHttpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckHttpHealthCheckArgs.builder
      builder.httpHealthCheck(args(argsBuilder).build)

    /**
     * @param httpsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckHttpsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckHttpsHealthCheckArgs.builder
      builder.httpsHealthCheck(args(argsBuilder).build)

    /**
     * @param logConfig Configure logging on this health check.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param sslHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def sslHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckSslHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckSslHealthCheckArgs.builder
      builder.sslHealthCheck(args(argsBuilder).build)

    /**
     * @param tcpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def tcpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.HealthCheckTcpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.HealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.HealthCheckTcpHealthCheckArgs.builder
      builder.tcpHealthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ImageIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ImageIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.Builder)
    /**
     * @param dbs The Key Database (db).
     * Structure is documented below.
     * @return builder
     */
    inline def dbs(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateDbArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateDbArgs.builder
      builder.dbs(args.map(_(argsBuilder).build)*)

    /**
     * @param dbxs The forbidden key database (dbx).
     * Structure is documented below.
     * @return builder
     */
    inline def dbxs(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateDbxArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateDbxArgs.builder
      builder.dbxs(args.map(_(argsBuilder).build)*)

    /**
     * @param keks The Key Exchange Key (KEK).
     * Structure is documented below.
     * @return builder
     */
    inline def keks(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateKekArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateKekArgs.builder
      builder.keks(args.map(_(argsBuilder).build)*)

    /**
     * @param pk The Platform Key (PK).
     * Structure is documented below.
     * @return builder
     */
    inline def pk(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStatePkArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStatePkArgs.builder
      builder.pk(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ImageState.Builder)
    /**
     * @param guestOsFeatures A list of features to enable on the guest operating system.
     * Applicable only for bootable images.
     * Structure is documented below.
     * @return builder
     */
    inline def guestOsFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.ImageGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param imageEncryptionKey Encrypts the image using a customer-supplied encryption key.
     * After you encrypt an image with a customer-supplied key, you must
     * provide the same key if you use the image later (e.g. to create a
     * disk from the image)
     * Structure is documented below.
     * @return builder
     */
    inline def imageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageImageEncryptionKeyArgs.builder
      builder.imageEncryptionKey(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload.
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param rawDisk The parameters of the raw disk image.
     * Structure is documented below.
     * @return builder
     */
    inline def rawDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageRawDiskArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageRawDiskArgs.builder
      builder.rawDisk(args(argsBuilder).build)

    /**
     * @param shieldedInstanceInitialState Set the secure boot keys of shielded instance.
     * Structure is documented below.
     * @return builder
     */
    inline def shieldedInstanceInitialState(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageShieldedInstanceInitialStateArgs.builder
      builder.shieldedInstanceInitialState(args(argsBuilder).build)

    /**
     * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source disk. Required if
     * the source disk is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceDiskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageSourceDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageSourceDiskEncryptionKeyArgs.builder
      builder.sourceDiskEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required if
     * the source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.ImageSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ImageSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs.Builder)
    /**
     * @param initializeParams Parameters for a new disk that will be created
     * alongside the new instance. Either `initializeParams` or `source` must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def initializeParams(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs.builder
      builder.initializeParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs.Builder)
    /**
     * @param sourceImageEncryptionKey Encryption key used to decrypt the given image. Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey Encryption key used to decrypt the given snapshot. Structure is documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskArgs.Builder)
    /**
     * @param initializeParams Parameters with which a disk was created alongside the instance.
     * @return builder
     */
    inline def initializeParams(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsArgs.builder
      builder.initializeParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsArgs.Builder)
    /**
     * @param sourceImageEncryptionKey The encryption key used to decrypt the source image.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The encryption key used to decrypt the source snapshot.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.Builder)
    /**
     * @param accessConfigs Access configurations, i.e. IPs via which this instance can be accessed via the Internet.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpRanges An array of alias IP ranges for this network interface.
     * @return builder
     */
    inline def aliasIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs.builder
      builder.aliasIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpv6Ranges An array of IPv6 alias IP ranges for this network interface.
     * @return builder
     */
    inline def aliasIpv6Ranges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAliasIpv6RangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAliasIpv6RangeArgs.builder
      builder.aliasIpv6Ranges(args.map(_(argsBuilder).build)*)

    /**
     * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * @return builder
     */
    inline def ipv6AccessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs.builder
      builder.ipv6AccessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinityArgs.Builder)
    /**
     * @param specificReservation Specifies the label selector for the reservation to use.
     * @return builder
     */
    inline def specificReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinitySpecificReservationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinitySpecificReservationArgs.builder
      builder.specificReservation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder)
    /**
     * @param gracefulShutdown Settings for the instance to perform a graceful shutdown.
     * @return builder
     */
    inline def gracefulShutdown(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingGracefulShutdownArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingGracefulShutdownArgs.builder
      builder.gracefulShutdown(args(argsBuilder).build)

    /**
     * @param localSsdRecoveryTimeout Specifies the maximum amount of time a Local Ssd Vm should wait while
     *   recovery of the Local Ssd state is attempted. Its value should be in
     *   between 0 and 168 hours with hour granularity and the default value being 1
     *   hour.
     * @return builder
     */
    inline def localSsdRecoveryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingLocalSsdRecoveryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingLocalSsdRecoveryTimeoutArgs.builder
      builder.localSsdRecoveryTimeout(args(argsBuilder).build)

    /**
     * @param maxRunDuration The timeout for new network connections to hosts.
     * @return builder
     */
    inline def maxRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingMaxRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingMaxRunDurationArgs.builder
      builder.maxRunDuration(args(argsBuilder).build)

    /**
     * @param nodeAffinities Specifies node affinities or anti-affinities to determine which sole-tenant nodes your instances and managed instance groups will use as host systems.
     * @return builder
     */
    inline def nodeAffinities(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

    /**
     * @param onInstanceStopAction Defines the behaviour for instances with the instance_termination_action.
     * @return builder
     */
    inline def onInstanceStopAction(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingOnInstanceStopActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingOnInstanceStopActionArgs.builder
      builder.onInstanceStopAction(args(argsBuilder).build)

    /**
     * @param preemptionNoticeDuration The duration of the notice that the instance will receive before it is preempted.
     * @return builder
     */
    inline def preemptionNoticeDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingPreemptionNoticeDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingPreemptionNoticeDurationArgs.builder
      builder.preemptionNoticeDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingGracefulShutdownArgs.Builder)
    /**
     * @param maxDuration The time allotted for the instance to gracefully shut down.
     * 										If the graceful shutdown isn&#39;t complete after this time, then the instance
     * 										transitions to the STOPPING state.
     * @return builder
     */
    inline def maxDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingGracefulShutdownMaxDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingGracefulShutdownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingGracefulShutdownMaxDurationArgs.builder
      builder.maxDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder)
    /**
     * @param advancedMachineFeatures Controls for advanced machine-related behavior features.
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param attachedDisks List of disks attached to the instance
     * @return builder
     */
    inline def attachedDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageAttachedDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageAttachedDiskArgs.builder
      builder.attachedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDisks The boot disk for the instance.
     * @return builder
     */
    inline def bootDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskArgs.builder
      builder.bootDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param confidentialInstanceConfig The Confidential VM config being used by the instance.  onHostMaintenance has to be set to TERMINATE or this will fail to create.
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceEncryptionKey Encryption key used to provide data encryption on the given instance.
     * @return builder
     */
    inline def instanceEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageInstanceEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageInstanceEncryptionKeyArgs.builder
      builder.instanceEncryptionKey(args(argsBuilder).build)

    /**
     * @param networkInterfaces The networks attached to the instance.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance. If not specified, the instance will be created with its default network performance configuration.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param params Stores additional params passed with the request, but not persisted as part of resource payload.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy being used by the instance.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param scratchDisks The scratch disks attached to the instance.
     * @return builder
     */
    inline def scratchDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageScratchDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageScratchDiskArgs.builder
      builder.scratchDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccount The service account to attach to the instance.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig The shielded vm config being used by the instance.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param sourceMachineImageEncryptionKey Encryption key for the source machine image.
     * @return builder
     */
    inline def sourceMachineImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSourceMachineImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSourceMachineImageEncryptionKeyArgs.builder
      builder.sourceMachineImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload identity config.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromMachineImageWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromMachineImageWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs.Builder)
    /**
     * @param initializeParams Parameters with which a disk was created alongside the instance.
     * @return builder
     */
    inline def initializeParams(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsArgs.builder
      builder.initializeParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsArgs.Builder)
    /**
     * @param sourceImageEncryptionKey The encryption key used to decrypt the source image.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The encryption key used to decrypt the source snapshot.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.Builder)
    /**
     * @param accessConfigs Access configurations, i.e. IPs via which this instance can be accessed via the Internet.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpRanges An array of alias IP ranges for this network interface.
     * @return builder
     */
    inline def aliasIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAliasIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAliasIpRangeArgs.builder
      builder.aliasIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpv6Ranges An array of IPv6 alias IP ranges for this network interface.
     * @return builder
     */
    inline def aliasIpv6Ranges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAliasIpv6RangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAliasIpv6RangeArgs.builder
      builder.aliasIpv6Ranges(args.map(_(argsBuilder).build)*)

    /**
     * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * @return builder
     */
    inline def ipv6AccessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs.builder
      builder.ipv6AccessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs.Builder)
    /**
     * @param specificReservation Specifies the label selector for the reservation to use.
     * @return builder
     */
    inline def specificReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinitySpecificReservationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinitySpecificReservationArgs.builder
      builder.specificReservation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder)
    /**
     * @param gracefulShutdown Settings for the instance to perform a graceful shutdown.
     * @return builder
     */
    inline def gracefulShutdown(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingGracefulShutdownArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingGracefulShutdownArgs.builder
      builder.gracefulShutdown(args(argsBuilder).build)

    /**
     * @param localSsdRecoveryTimeout Specifies the maximum amount of time a Local Ssd Vm should wait while
     *   recovery of the Local Ssd state is attempted. Its value should be in
     *   between 0 and 168 hours with hour granularity and the default value being 1
     *   hour.
     * @return builder
     */
    inline def localSsdRecoveryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingLocalSsdRecoveryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingLocalSsdRecoveryTimeoutArgs.builder
      builder.localSsdRecoveryTimeout(args(argsBuilder).build)

    /**
     * @param maxRunDuration The timeout for new network connections to hosts.
     * @return builder
     */
    inline def maxRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingMaxRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingMaxRunDurationArgs.builder
      builder.maxRunDuration(args(argsBuilder).build)

    /**
     * @param nodeAffinities Specifies node affinities or anti-affinities to determine which sole-tenant nodes your instances and managed instance groups will use as host systems.
     * @return builder
     */
    inline def nodeAffinities(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

    /**
     * @param onInstanceStopAction Defines the behaviour for instances with the instance_termination_action.
     * @return builder
     */
    inline def onInstanceStopAction(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingOnInstanceStopActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingOnInstanceStopActionArgs.builder
      builder.onInstanceStopAction(args(argsBuilder).build)

    /**
     * @param preemptionNoticeDuration The duration of the notice that the instance will receive before it is preempted.
     * @return builder
     */
    inline def preemptionNoticeDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingPreemptionNoticeDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingPreemptionNoticeDurationArgs.builder
      builder.preemptionNoticeDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingGracefulShutdownArgs.Builder)
    /**
     * @param maxDuration The time allotted for the instance to gracefully shut down.
     * 										If the graceful shutdown isn&#39;t complete after this time, then the instance
     * 										transitions to the STOPPING state.
     * @return builder
     */
    inline def maxDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingGracefulShutdownMaxDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingGracefulShutdownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingGracefulShutdownMaxDurationArgs.builder
      builder.maxDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder)
    /**
     * @param advancedMachineFeatures Controls for advanced machine-related behavior features.
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param attachedDisks List of disks attached to the instance
     * @return builder
     */
    inline def attachedDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateAttachedDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateAttachedDiskArgs.builder
      builder.attachedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDisk The boot disk for the instance.
     * @return builder
     */
    inline def bootDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig The Confidential VM config being used by the instance.  onHostMaintenance has to be set to TERMINATE or this will fail to create.
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceEncryptionKey Encryption key used to provide data encryption on the given instance.
     * @return builder
     */
    inline def instanceEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateInstanceEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateInstanceEncryptionKeyArgs.builder
      builder.instanceEncryptionKey(args(argsBuilder).build)

    /**
     * @param networkInterfaces The networks attached to the instance.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance. If not specified, the instance will be created with its default network performance configuration.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param params Stores additional params passed with the request, but not persisted as part of resource payload.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy being used by the instance.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param scratchDisks * `network_interface.alias_ip_range`
     * * `network_interface.alias_ipv6_range` [Beta]
     * * `network_interface.access_config`
     * @return builder
     */
    inline def scratchDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateScratchDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateScratchDiskArgs.builder
      builder.scratchDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccount The service account to attach to the instance.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig The shielded vm config being used by the instance.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload identity config.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceFromTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceFromTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceFromTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs.Builder)
    /**
     * @param onRepair , Configuration for VM repairs in the MIG. Structure is documented below.
     * ***
     * @return builder
     */
    inline def onRepair(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyOnRepairArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyOnRepairArgs.builder
      builder.onRepair(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder)
    /**
     * @param allInstancesConfig Properties to set on all instances in the group. After setting
     * allInstancesConfig on the group, you must update the group&#39;s instances to
     * apply the configuration.
     * @return builder
     */
    inline def allInstancesConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerAllInstancesConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerAllInstancesConfigArgs.builder
      builder.allInstancesConfig(args(argsBuilder).build)

    /**
     * @param autoHealingPolicies The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * @return builder
     */
    inline def autoHealingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerAutoHealingPoliciesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerAutoHealingPoliciesArgs.builder
      builder.autoHealingPolicies(args(argsBuilder).build)

    /**
     * @param instanceLifecyclePolicy The instance lifecycle policy for this managed instance group.
     * @return builder
     */
    inline def instanceLifecyclePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs.builder
      builder.instanceLifecyclePolicy(args(argsBuilder).build)

    /**
     * @param namedPorts The named port configuration. See the section below
     * for details on configuration.
     * @return builder
     */
    inline def namedPorts(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerNamedPortArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerNamedPortArgs.builder
      builder.namedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param params ) Input only additional params for instance group manager creation. Structure is documented below. For more information, see [API](https://cloud.google.com/compute/docs/reference/rest/beta/instanceGroupManagers/insert).
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resourcePolicies Resource policies for this managed instance group. Structure is documented below.
     * @return builder
     */
    inline def resourcePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerResourcePoliciesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerResourcePoliciesArgs.builder
      builder.resourcePolicies(args(argsBuilder).build)

    /**
     * @param standbyPolicy The standby policy for stopped and suspended instances. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/suspended-and-stopped-vms-in-mig).
     * @return builder
     */
    inline def standbyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStandbyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStandbyPolicyArgs.builder
      builder.standbyPolicy(args(argsBuilder).build)

    /**
     * @param statefulDisks Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * @return builder
     */
    inline def statefulDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulDiskArgs.builder
      builder.statefulDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulExternalIps External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulExternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulExternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulExternalIpArgs.builder
      builder.statefulExternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulInternalIps Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulInternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulInternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulInternalIpArgs.builder
      builder.statefulInternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param statuses The status of this managed instance group.
     * @return builder
     */
    inline def statuses(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param targetSizePolicies The policy that specifies how the MIG creates its VMs to achieve the target size. Structure is documented below.
     * @return builder
     */
    inline def targetSizePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerTargetSizePolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerTargetSizePolicyArgs.builder
      builder.targetSizePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param updatePolicy The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch).
     * @return builder
     */
    inline def updatePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

    /**
     * @param versions Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * @return builder
     */
    inline def versions(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusArgs.Builder)
    /**
     * @param allInstancesConfigs Properties to set on all instances in the group. After setting
     * allInstancesConfig on the group, you must update the group&#39;s instances to
     * apply the configuration.
     * @return builder
     */
    inline def allInstancesConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusAllInstancesConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusAllInstancesConfigArgs.builder
      builder.allInstancesConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param statefuls Stateful status of the given Instance Group Manager.
     * @return builder
     */
    inline def statefuls(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulArgs.builder
      builder.statefuls(args.map(_(argsBuilder).build)*)

    /**
     * @param versionTargets A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances&#39; target version are specified by version field on Instance Group Manager.
     * @return builder
     */
    inline def versionTargets(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusVersionTargetArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusVersionTargetArgs.builder
      builder.versionTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulArgs.Builder)
    /**
     * @param perInstanceConfigs Status of per-instance configs on the instances.
     * @return builder
     */
    inline def perInstanceConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulPerInstanceConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulPerInstanceConfigArgs.builder
      builder.perInstanceConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs.Builder)
    /**
     * @param targetSize The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     * &gt; Exactly one `version` you specify must not have a `targetSize` specified. During a rolling update, the instance group manager will fulfill the `targetSize`
     * constraints of every other `version`, and any remaining instances will be provisioned with the version where `targetSize` is unset.
     * @return builder
     */
    inline def targetSize(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionTargetSizeArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionTargetSizeArgs.builder
      builder.targetSize(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceGroupState.Builder)
    /**
     * @param namedPorts The named port configuration. See the section below
     * for details on configuration. Structure is documented below.
     * @return builder
     */
    inline def namedPorts(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGroupNamedPortArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGroupNamedPortArgs.builder
      builder.namedPorts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.Builder)
    /**
     * @param accessConfigs Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet. If omitted, ssh provisioners will not
     * work unless Terraform can send traffic to the instance&#39;s network (e.g. via
     * tunnel or because it is running on another cloud instance on that network).
     * This block can be specified once per `networkInterface`. Structure documented below.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpRanges An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * @return builder
     */
    inline def aliasIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAliasIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAliasIpRangeArgs.builder
      builder.aliasIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpv6Ranges [Beta] An
     * array of alias IPv6 ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * @return builder
     */
    inline def aliasIpv6Ranges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAliasIpv6RangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAliasIpv6RangeArgs.builder
      builder.aliasIpv6Ranges(args.map(_(argsBuilder).build)*)

    /**
     * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * @return builder
     */
    inline def ipv6AccessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceIpv6AccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceIpv6AccessConfigArgs.builder
      builder.ipv6AccessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceReservationAffinityArgs.Builder)
    /**
     * @param specificReservation Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * @return builder
     */
    inline def specificReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceReservationAffinitySpecificReservationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceReservationAffinityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceReservationAffinitySpecificReservationArgs.builder
      builder.specificReservation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder)
    /**
     * @param gracefulShutdown Beta Settings for the instance to perform a graceful shutdown. Structure is documented below.
     * @return builder
     */
    inline def gracefulShutdown(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingGracefulShutdownArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingGracefulShutdownArgs.builder
      builder.gracefulShutdown(args(argsBuilder).build)

    /**
     * @param localSsdRecoveryTimeout (../guides/provider_versions.html.markdown) Specifies the maximum amount of time a Local Ssd Vm should wait while recovery of the Local Ssd state is attempted. Its value should be in between 0 and 168 hours with hour granularity and the default value being 1 hour. Structure is documented below.
     * @return builder
     */
    inline def localSsdRecoveryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingLocalSsdRecoveryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingLocalSsdRecoveryTimeoutArgs.builder
      builder.localSsdRecoveryTimeout(args(argsBuilder).build)

    /**
     * @param maxRunDuration The duration of the instance. Instance will run and be terminated after then, the termination action could be defined in `instanceTerminationAction`. Structure is documented below.
     * @return builder
     */
    inline def maxRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingMaxRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingMaxRunDurationArgs.builder
      builder.maxRunDuration(args(argsBuilder).build)

    /**
     * @param nodeAffinities Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * @return builder
     */
    inline def nodeAffinities(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

    /**
     * @param onInstanceStopAction Specifies the action to be performed when the instance is terminated using `maxRunDuration` and `STOP` `instanceTerminationAction`. Only support `true` `discardLocalSsd` at this point. Structure is documented below.
     * @return builder
     */
    inline def onInstanceStopAction(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingOnInstanceStopActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingOnInstanceStopActionArgs.builder
      builder.onInstanceStopAction(args(argsBuilder).build)

    /**
     * @param preemptionNoticeDuration Specifies the Metadata Service preemption notice duration before the GCE ACPI G2 Soft Off signal is triggered for Spot VMs only. If not specified, there will be no wait before the G2 Soft Off signal is triggered. Structure is documented below.
     * @return builder
     */
    inline def preemptionNoticeDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingPreemptionNoticeDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingPreemptionNoticeDurationArgs.builder
      builder.preemptionNoticeDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceSchedulingGracefulShutdownArgs.Builder)
    /**
     * @param maxDuration The time allotted for the instance to gracefully shut down.
     * If the graceful shutdown isn&#39;t complete after this time, then the instance
     * transitions to the STOPPING state. Structure is documented below:
     * @return builder
     */
    inline def maxDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingGracefulShutdownMaxDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceSchedulingGracefulShutdownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingGracefulShutdownMaxDurationArgs.builder
      builder.maxDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceSettingsState.Builder)
    /**
     * @param metadata The metadata key/value pairs assigned to all the instances in the corresponding scope.
     * Structure is documented below.
     * @return builder
     */
    inline def metadata(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSettingsMetadataArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceSettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSettingsMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceState.Builder)
    /**
     * @param advancedMachineFeatures Configure Nested Virtualisation and Simultaneous Hyper Threading  on this VM. Structure is documented below
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param attachedDisks Additional disks to attach to the instance. Can be repeated multiple times for multiple disks. Structure is documented below.
     * @return builder
     */
    inline def attachedDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceAttachedDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceAttachedDiskArgs.builder
      builder.attachedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param bootDisk The boot disk for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def bootDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * **Note:** GPU accelerators can only be used with `onHostMaintenance` option set to TERMINATE.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceEncryptionKey Configuration for data encryption on the instance with encryption keys. Structure is documented below.
     * @return builder
     */
    inline def instanceEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceInstanceEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceInstanceEncryptionKeyArgs.builder
      builder.instanceEncryptionKey(args(argsBuilder).build)

    /**
     * @param networkInterfaces Networks to attach to the instance. This can
     * be specified multiple times. Structure is documented below.
     * 
     * ***
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance. Structure is
     * documented below. **Note**: `machineType` must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param params Additional instance parameters.
     * .
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param scratchDisks Scratch disks to attach to the instance. This can be
     * specified multiple times for multiple scratch disks. Structure is documented below.
     * @return builder
     */
    inline def scratchDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceScratchDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceScratchDiskArgs.builder
      builder.scratchDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccount Service account to attach to the instance.
     * Structure is documented below.
     * **Note**: `allowStoppingForUpdate` must be set to true or your instance must have a `desiredStatus` of `TERMINATED` in order to update this field.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * **Note**: `allowStoppingForUpdate` must be set to true or your instance must have a `desiredStatus` of `TERMINATED` in order to update this field.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity Config. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.Builder)
    /**
     * @param diskEncryptionKey Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     * If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key.
     * 
     * If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance.
     * 
     * If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later.
     * 
     * Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group. Structure documented below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateDiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateDiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption
     * key of the source image. Required if the source image is protected by a
     * customer-supplied encryption key.
     * 
     * Instance templates do not store customer-supplied encryption keys, so you
     * cannot create disks for instances in a managed instance group if the source
     * images are encrypted with your own keys. Structure
     * documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateDiskSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateDiskSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption
     * key of the source snapshot. Structure
     * documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateDiskSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateDiskSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.Builder)
    /**
     * @param accessConfigs Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet (this means that ssh provisioners will
     * not work unless you can send traffic to the instance&#39;s
     * network (e.g. via tunnel or because it is running on another cloud instance
     * on that network). This block can be specified once per `networkInterface`. Structure documented below.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpRanges An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * @return builder
     */
    inline def aliasIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAliasIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAliasIpRangeArgs.builder
      builder.aliasIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpv6Ranges [Beta] An
     * array of alias IPv6 ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * @return builder
     */
    inline def aliasIpv6Ranges(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAliasIpv6RangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAliasIpv6RangeArgs.builder
      builder.aliasIpv6Ranges(args.map(_(argsBuilder).build)*)

    /**
     * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * @return builder
     */
    inline def ipv6AccessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceIpv6AccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceIpv6AccessConfigArgs.builder
      builder.ipv6AccessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs.Builder)
    /**
     * @param specificReservation Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * @return builder
     */
    inline def specificReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinitySpecificReservationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinitySpecificReservationArgs.builder
      builder.specificReservation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder)
    /**
     * @param gracefulShutdown Beta Settings for the instance to perform a graceful shutdown. Structure is documented below.
     * @return builder
     */
    inline def gracefulShutdown(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingGracefulShutdownArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingGracefulShutdownArgs.builder
      builder.gracefulShutdown(args(argsBuilder).build)

    /**
     * @param localSsdRecoveryTimeouts (../guides/provider_versions.html.markdown) Specifies the maximum amount of time a Local Ssd Vm should wait while recovery of the Local Ssd state is attempted. Its value should be in between 0 and 168 hours with hour granularity and the default value being 1 hour. Structure is documented below.
     * @return builder
     */
    inline def localSsdRecoveryTimeouts(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingLocalSsdRecoveryTimeoutArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingLocalSsdRecoveryTimeoutArgs.builder
      builder.localSsdRecoveryTimeouts(args.map(_(argsBuilder).build)*)

    /**
     * @param maxRunDuration The duration of the instance. Instance will run and be terminated after then, the termination action could be defined in `instanceTerminationAction`. Structure is documented below.
     * @return builder
     */
    inline def maxRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingMaxRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingMaxRunDurationArgs.builder
      builder.maxRunDuration(args(argsBuilder).build)

    /**
     * @param nodeAffinities Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * @return builder
     */
    inline def nodeAffinities(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

    /**
     * @param onInstanceStopAction Specifies the action to be performed when the instance is terminated using `maxRunDuration` and `STOP` `instanceTerminationAction`. Only support `true` `discardLocalSsd` at this point. Structure is documented below.
     * @return builder
     */
    inline def onInstanceStopAction(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingOnInstanceStopActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingOnInstanceStopActionArgs.builder
      builder.onInstanceStopAction(args(argsBuilder).build)

    /**
     * @param preemptionNoticeDuration Specifies the Metadata Service preemption notice duration before the GCE ACPI G2 Soft Off signal is triggered for Spot VMs only. If not specified, there will be no wait before the G2 Soft Off signal is triggered. Structure is documented below.
     * @return builder
     */
    inline def preemptionNoticeDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingPreemptionNoticeDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingPreemptionNoticeDurationArgs.builder
      builder.preemptionNoticeDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingGracefulShutdownArgs.Builder)
    /**
     * @param maxDuration The time allotted for the instance to gracefully shut down.
     * If the graceful shutdown isn&#39;t complete after this time, then the instance
     * transitions to the STOPPING state. Structure is documented below:
     * @return builder
     */
    inline def maxDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingGracefulShutdownMaxDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingGracefulShutdownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingGracefulShutdownMaxDurationArgs.builder
      builder.maxDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder)
    /**
     * @param advancedMachineFeatures Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param disks Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig (Optional, Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machineType`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param serviceAccount Service account to attach to the instance. Structure is documented below.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity Config. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.InstanceTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstanceTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstantSnapshotIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstantSnapshotIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstantSnapshotIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstantSnapshotIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstantSnapshotIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.InstantSnapshotIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstantSnapshotIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstantSnapshotIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InstantSnapshotState.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InstantSnapshotParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InstantSnapshotState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InstantSnapshotParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.Builder)
    /**
     * @param bandwidthPercentagePolicy (Optional, Beta)
     * Bandwidth Percentage policy allows you to have granular control over how your Interconnect
     * bandwidth is utilized among your workloads mapping to different traffic classes.
     * Structure is documented below.
     * @return builder
     */
    inline def bandwidthPercentagePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyArgs.builder
      builder.bandwidthPercentagePolicy(args(argsBuilder).build)

    /**
     * @param shapeAveragePercentages (Optional, Beta)
     * Optional field to specify a list of shape average percentages to be
     * applied in conjunction with StrictPriorityPolicy or BandwidthPercentagePolicy
     * Structure is documented below.
     * @return builder
     */
    inline def shapeAveragePercentages(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectShapeAveragePercentageArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectShapeAveragePercentageArgs.builder
      builder.shapeAveragePercentages(args.map(_(argsBuilder).build)*)

    /**
     * @param strictPriorityPolicy (Optional, Beta)
     * Specify configuration for StrictPriorityPolicy.
     * @return builder
     */
    inline def strictPriorityPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectStrictPriorityPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectStrictPriorityPolicyArgs.builder
      builder.strictPriorityPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyArgs.Builder)
    /**
     * @param bandwidthPercentages (Optional, Beta)
     * Specify bandwidth percentages for various traffic classes for queuing
     * type Bandwidth Percent.
     * Structure is documented below.
     * @return builder
     */
    inline def bandwidthPercentages(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyBandwidthPercentageArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectBandwidthPercentagePolicyBandwidthPercentageArgs.builder
      builder.bandwidthPercentages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredArgs.Builder)
    /**
     * @param availabilitySlas (Output)
     * Which SLA this group is configured to support, and why this
     * group does or does not meet that SLA&#39;s requirements.
     * Structure is documented below.
     * @return builder
     */
    inline def availabilitySlas(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredAvailabilitySlaArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredAvailabilitySlaArgs.builder
      builder.availabilitySlas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredAvailabilitySlaArgs.Builder)
    /**
     * @param intendedSlaBlockers (Output)
     * Reasons why configuration.availabilitySLA.sla differs from
     * intent.availabilitySLA. This list is empty if and only if those are the
     * same.
     * Structure is documented below.
     * @return builder
     */
    inline def intendedSlaBlockers(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredAvailabilitySlaIntendedSlaBlockerArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredAvailabilitySlaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredAvailabilitySlaIntendedSlaBlockerArgs.builder
      builder.intendedSlaBlockers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureArgs.Builder)
    /**
     * @param regions (Output)
     * Regions used to explain this blocker in more
     * detail. These are region names formatted like &#34;us-central1&#34;. This
     * will be set for some blockers (like INCOMPATIBLE_REGIONS) but does
     * not apply to others.
     * @return builder
     */
    inline def regions(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionArgs.Builder)
    /**
     * @param metros (Output)
     * Metros used to explain this blocker in more detail.
     * These are three-letter lowercase strings like &#34;iad&#34;. This will be set
     * for some blockers (like NO_ATTACHMENTS_IN_METRO_AND_ZONE) but does
     * not apply to others.
     * @return builder
     */
    inline def metros(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroArgs.builder
      builder.metros(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroArgs.Builder)
    /**
     * @param facilities (Output)
     * The facilities used for this group&#39;s Attachments&#39;
     * Interconnects.
     * Structure is documented below.
     * @return builder
     */
    inline def facilities(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityArgs.builder
      builder.facilities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityArgs.Builder)
    /**
     * @param zones (Output)
     * Zones used to explain this blocker in more detail.
     * Format is &#34;zone1&#34; and/or &#34;zone2&#34;. This will be set for some blockers
     * (like  MISSING_ZONE) but does not apply to others.
     * @return builder
     */
    inline def zones(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZoneArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZoneArgs.builder
      builder.zones(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupState.Builder)
    /**
     * @param attachments Attachments in the AttachmentGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Attachments per group&#34; quota.
     * Structure is documented below.
     * @return builder
     */
    inline def attachments(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupAttachmentArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)

    /**
     * @param configureds The redundancy this group is configured to support. The way a
     * user queries what SLA their Attachment gets is by looking at this field of
     * the Attachment&#39;s AttachmentGroup.
     * Structure is documented below.
     * @return builder
     */
    inline def configureds(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupConfiguredArgs.builder
      builder.configureds(args.map(_(argsBuilder).build)*)

    /**
     * @param intent The user&#39;s intent for this group. This is the only required field besides
     * the name that must be specified on group creation.
     * Structure is documented below.
     * @return builder
     */
    inline def intent(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupIntentArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupIntentArgs.builder
      builder.intent(args(argsBuilder).build)

    /**
     * @param logicalStructures An analysis of the logical layout of Attachments in this
     * group. Every Attachment in the group is shown once in this structure.
     * Structure is documented below.
     * @return builder
     */
    inline def logicalStructures(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupLogicalStructureArgs.builder
      builder.logicalStructures(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingApplianceMappingArgs.Builder)
    /**
     * @param innerVlanToApplianceMappings Structure is documented below.
     * @return builder
     */
    inline def innerVlanToApplianceMappings(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMappingArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingApplianceMappingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingApplianceMappingInnerVlanToApplianceMappingArgs.builder
      builder.innerVlanToApplianceMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingArgs.Builder)
    /**
     * @param applianceMappings A map of VLAN tags to appliances and optional inner mapping rules.
     * @return builder
     */
    inline def applianceMappings(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingApplianceMappingArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingApplianceMappingArgs.builder
      builder.applianceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param geneveHeader GeneveHeader related configurations.
     * @return builder
     */
    inline def geneveHeader(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingGeneveHeaderArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingGeneveHeaderArgs.builder
      builder.geneveHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectAttachmentState.Builder)
    /**
     * @param l2Forwarding L2 Interconnect Attachment related configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def l2Forwarding(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentL2ForwardingArgs.builder
      builder.l2Forwarding(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param privateInterconnectInfos Information specific to an InterconnectAttachment. This property
     * is populated if the interconnect that this is attached to is of type DEDICATED.
     * Structure is documented below.
     * @return builder
     */
    inline def privateInterconnectInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectAttachmentPrivateInterconnectInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectAttachmentState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectAttachmentPrivateInterconnectInfoArgs.builder
      builder.privateInterconnectInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredArgs.Builder)
    /**
     * @param topologyCapabilities (Output)
     * How reliable this topology is configured to be, and why
     * this group does or does not meet the requirements for the intended
     * capability.
     * Structure is documented below.
     * @return builder
     */
    inline def topologyCapabilities(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredTopologyCapabilityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredTopologyCapabilityArgs.builder
      builder.topologyCapabilities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredTopologyCapabilityArgs.Builder)
    /**
     * @param intendedCapabilityBlockers (Output)
     * Reasons why configuration.topologyCapability.sla differs
     * from intent.topologyCapability. This list is empty if and only if those
     * are the same.
     * Structure is documented below.
     * @return builder
     */
    inline def intendedCapabilityBlockers(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredTopologyCapabilityIntendedCapabilityBlockerArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredTopologyCapabilityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredTopologyCapabilityIntendedCapabilityBlockerArgs.builder
      builder.intendedCapabilityBlockers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureArgs.Builder)
    /**
     * @param metros (Output)
     * Metros used to explain this blocker in more detail.
     * These are three-letter lowercase strings like &#34;iad&#34;. A blocker like
     * INCOMPATIBLE_METROS will specify the problematic metros in this
     * field.
     * @return builder
     */
    inline def metros(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroArgs.builder
      builder.metros(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroArgs.Builder)
    /**
     * @param facilities (Output)
     * Facilities used to explain this blocker in more detail.
     * Like physicalStructure.metros.facilities.facility, this is a numeric
     * string like &#34;5467&#34;.
     * @return builder
     */
    inline def facilities(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroFacilityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroFacilityArgs.builder
      builder.facilities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroFacilityArgs.Builder)
    /**
     * @param zones (Output)
     * Zones used to explain this blocker in more detail.
     * Zone names are &#34;zone1&#34; and/or &#34;zone2&#34;.
     * @return builder
     */
    inline def zones(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroFacilityZoneArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroFacilityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroFacilityZoneArgs.builder
      builder.zones(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectGroupState.Builder)
    /**
     * @param configureds The status of the group as configured. This has the same
     * structure as the operational field reported by the OperationalStatus
     * method, but does not take into account the operational status of each
     * resource.
     * Structure is documented below.
     * @return builder
     */
    inline def configureds(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupConfiguredArgs.builder
      builder.configureds(args.map(_(argsBuilder).build)*)

    /**
     * @param intent The user&#39;s intent for this group. This is the only required field besides
     * the name that must be specified on group creation.
     * Structure is documented below.
     * @return builder
     */
    inline def intent(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupIntentArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupIntentArgs.builder
      builder.intent(args(argsBuilder).build)

    /**
     * @param interconnects Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Interconnects per group&#34; quota.
     * Structure is documented below.
     * @return builder
     */
    inline def interconnects(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupInterconnectArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupInterconnectArgs.builder
      builder.interconnects(args.map(_(argsBuilder).build)*)

    /**
     * @param physicalStructures An analysis of the physical layout of Interconnects in this
     * group. Every Interconnect in the group is shown once in this structure.
     * Structure is documented below.
     * @return builder
     */
    inline def physicalStructures(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureArgs.builder
      builder.physicalStructures(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectMacsecArgs.Builder)
    /**
     * @param preSharedKeys A keychain placeholder describing a set of named key objects along with their
     * start times. A MACsec CKN/CAK is generated for each key in the key chain.
     * Google router automatically picks the key with the most recent startTime when establishing
     * or re-establishing a MACsec secure link.
     * Structure is documented below.
     * @return builder
     */
    inline def preSharedKeys(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectMacsecPreSharedKeyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectMacsecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectMacsecPreSharedKeyArgs.builder
      builder.preSharedKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.InterconnectState.Builder)
    /**
     * @param applicationAwareInterconnect (Optional, Beta)
     * Configuration that enables Media Access Control security (MACsec) on the Cloud
     * Interconnect connection between Google and your on-premises router.
     * Structure is documented below.
     * @return builder
     */
    inline def applicationAwareInterconnect(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectApplicationAwareInterconnectArgs.builder
      builder.applicationAwareInterconnect(args(argsBuilder).build)

    /**
     * @param circuitInfos A list of CircuitInfo objects, that describe the individual circuits in this LAG.
     * Structure is documented below.
     * @return builder
     */
    inline def circuitInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectCircuitInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectCircuitInfoArgs.builder
      builder.circuitInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param expectedOutages A list of outages expected for this Interconnect.
     * Structure is documented below.
     * @return builder
     */
    inline def expectedOutages(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectExpectedOutageArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.InterconnectState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectExpectedOutageArgs.builder
      builder.expectedOutages(args.map(_(argsBuilder).build)*)

    /**
     * @param macsec Configuration that enables Media Access Control security (MACsec) on the Cloud
     * Interconnect connection between Google and your on-premises router.
     * Structure is documented below.
     * @return builder
     */
    inline def macsec(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectMacsecArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectMacsecArgs.builder
      builder.macsec(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.InterconnectParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.InterconnectState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.InterconnectParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.MachineImageIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.MachineImageIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.MachineImageIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.MachineImageIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.MachineImageState.Builder)
    /**
     * @param machineImageEncryptionKey Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     * @return builder
     */
    inline def machineImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageMachineImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.MachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageMachineImageEncryptionKeyArgs.builder
      builder.machineImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload.
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.MachineImageParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.MachineImageState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MachineImageParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.ManagedSslCertificateState.Builder)
    /**
     * @param managed Properties relevant to a managed certificate.  These will be used if the
     * certificate is managed (as indicated by a value of `MANAGED` in `type`).
     * Structure is documented below.
     * @return builder
     */
    inline def managed(args: Endofunction[com.pulumi.gcp.compute.inputs.ManagedSslCertificateManagedArgs.Builder]):
        com.pulumi.gcp.compute.inputs.ManagedSslCertificateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.ManagedSslCertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.MangedSslCertificateState.Builder)
    /**
     * @param managed Properties relevant to a managed certificate.  These will be used if the
     * certificate is managed (as indicated by a value of `MANAGED` in `type`).
     * Structure is documented below.
     * @return builder
     */
    inline def managed(args: Endofunction[com.pulumi.gcp.compute.inputs.MangedSslCertificateManagedArgs.Builder]):
        com.pulumi.gcp.compute.inputs.MangedSslCertificateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.MangedSslCertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkAttachmentState.Builder)
    /**
     * @param connectionEndpoints An array of connections for all the producers connected to this network attachment.
     * Structure is documented below.
     * @return builder
     */
    inline def connectionEndpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkAttachmentConnectionEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkAttachmentState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkAttachmentConnectionEndpointArgs.builder
      builder.connectionEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkEndpointListState.Builder)
    /**
     * @param networkEndpoints The network endpoints to be added to the enclosing network endpoint group
     * (NEG). Each endpoint specifies an IP address and port, along with
     * additional information depending on the NEG type.
     * Structure is documented below.
     * @return builder
     */
    inline def networkEndpoints(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkEndpointListNetworkEndpointArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkEndpointListState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkEndpointListNetworkEndpointArgs.builder
      builder.networkEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedMatchLayer4Configs&#34;&gt;&lt;/a&gt;The `layer4Configs` block supports:
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleState.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleState.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder)
    /**
     * @param matches (Output)
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def matches(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

    /**
     * @param targetSecureTags (Output)
     * A list of secure tags that controls which instances the firewall rule
     * applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the
     * firewall rule applies only to instances in the VPC network that have one
     * of those EFFECTIVE secure tags, if all the targetSecureTag are in
     * INEFFECTIVE state, then this rule will be ignored.
     * &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as
     * &lt;code&gt;targetServiceAccounts&lt;/code&gt;.
     * If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor
     * &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies
     * to all instances on the specified network.
     * Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source
     * of the traffic.
     * For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE,
     * and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored.
     * Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedRuleMatchLayer4Config&#34;&gt;&lt;/a&gt;The `layer4Config` block supports:
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule
     * applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the
     * firewall rule applies only to instances in the VPC network that have one
     * of those EFFECTIVE secure tags, if all the targetSecureTag are in
     * INEFFECTIVE state, then this rule will be ignored.
     * &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as
     * &lt;code&gt;targetServiceAccounts&lt;/code&gt;.
     * If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor
     * &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies
     * to all instances on the specified network.
     * Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source
     * of the traffic.
     * For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE,
     * and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored.
     * Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedRuleMatchLayer4Config&#34;&gt;&lt;/a&gt;The `layer4Config` block supports:
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesState.Builder)
    /**
     * @param predefinedRules A list of firewall policy pre-defined rules.
     * Structure is documented below.
     * @return builder
     */
    inline def predefinedRules(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesPredefinedRuleArgs.builder
      builder.predefinedRules(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A list of firewall policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyWithRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NetworkState.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.NetworkParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NetworkState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NetworkParamsArgs.builder
      builder.params(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsArgs.Builder)
    /**
     * @param projectMaps A map of project id and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * @return builder
     */
    inline def projectMaps(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsProjectMapArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsProjectMapArgs.builder
      builder.projectMaps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.NodeGroupState.Builder)
    /**
     * @param autoscalingPolicy If you use sole-tenant nodes for your workloads, you can use the node
     * group autoscaler to automatically manage the sizes of your node groups.
     * One of `initialSize` or `autoscalingPolicy` must be configured on resource creation.
     * Structure is documented below.
     * @return builder
     */
    inline def autoscalingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeGroupAutoscalingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeGroupAutoscalingPolicyArgs.builder
      builder.autoscalingPolicy(args(argsBuilder).build)

    /**
     * @param maintenanceWindow contains properties for the timeframe of maintenance
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeGroupMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeGroupMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param shareSettings Share settings for the node group.
     * Structure is documented below.
     * @return builder
     */
    inline def shareSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeGroupShareSettingsArgs.builder
      builder.shareSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.NodeTemplateState.Builder)
    /**
     * @param accelerators List of the type and count of accelerator cards attached to the
     * node template
     * Structure is documented below.
     * @return builder
     */
    inline def accelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NodeTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param disks List of the type, size and count of disks attached to the
     * node template
     * Structure is documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.NodeTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypeFlexibility Flexible properties for the desired node type. Node groups that
     * use this node template will create nodes of a type that matches
     * these properties. Only one of nodeTypeFlexibility and nodeType can
     * be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def nodeTypeFlexibility(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateNodeTypeFlexibilityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NodeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateNodeTypeFlexibilityArgs.builder
      builder.nodeTypeFlexibility(args(argsBuilder).build)

    /**
     * @param serverBinding The server binding policy for nodes using this template. Determines
     * where the nodes should restart following a maintenance event.
     * Structure is documented below.
     * @return builder
     */
    inline def serverBinding(args: Endofunction[com.pulumi.gcp.compute.inputs.NodeTemplateServerBindingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.NodeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.NodeTemplateServerBindingArgs.builder
      builder.serverBinding(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigArgs.Builder)
    /**
     * @param jsonCustomConfig Custom JSON parsing configurations.
     * Structure is documented below.
     * @return builder
     */
    inline def jsonCustomConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigJsonCustomConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigJsonCustomConfigArgs.builder
      builder.jsonCustomConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds The list of request headers to add or overwrite if they&#39;re already present.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs.Builder)
    /**
     * @param config The configuration options for matching the rule.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param expr User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * @return builder
     */
    inline def expr(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchExprArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchExprArgs.builder
      builder.expr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchConfigArgs.Builder)
    /**
     * @param layer4Configs (Optional, Beta)
     * Pairs of IP protocols and ports that the rule should match.
     * This field may only be specified when versionedExpr is set to FIREWALL.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedMatchConfigLayer4Config&#34;&gt;&lt;/a&gt;The `layer4Config` block supports:
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigArgs.Builder)
    /**
     * @param exclusions An exclusion to apply during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder)
    /**
     * @param requestCookies Request cookie whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    inline def requestCookies(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyArgs.builder
      builder.requestCookies(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaders Request header whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param requestQueryParams Request query parameter whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Note that the parameter can be in the query string or in the POST body.
     * Structure is documented below.
     * @return builder
     */
    inline def requestQueryParams(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParamArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParamArgs.builder
      builder.requestQueryParams(args.map(_(argsBuilder).build)*)

    /**
     * @param requestUris Request URI from the request line to be excluded from inspection during preconfigured WAF evaluation.
     * When specifying this field, the query or fragment part should be excluded.
     * Structure is documented below.
     * @return builder
     */
    inline def requestUris(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUriArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUriArgs.builder
      builder.requestUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleState.Builder)
    /**
     * @param headerAction Optional, additional actions that are performed on headers.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule.
     * If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
     * Structure is documented below.
     * @return builder
     */
    inline def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param redirectOptions Parameters defining the redirect action. Cannot be specified for any other actions.
     * Note: For organization security policies, only EXTERNAL_302 redirect type is supported. GOOGLE_RECAPTCHA is not supported.
     * Structure is documented below.
     * @return builder
     */
    inline def redirectOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleRedirectOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleRedirectOptionsArgs.builder
      builder.redirectOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyState.Builder)
    /**
     * @param advancedOptionsConfig Additional options for this security policy.
     * Structure is documented below.
     * @return builder
     */
    inline def advancedOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyAdvancedOptionsConfigArgs.builder
      builder.advancedOptionsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleArgs.Builder)
    /**
     * @param standardSnapshots The rule config for standard snapshots.
     * Structure is documented below.
     * @return builder
     */
    inline def standardSnapshots(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleStandardSnapshotsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleStandardSnapshotsArgs.builder
      builder.standardSnapshots(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyState.Builder)
    /**
     * @param rules The rules for the snapshot recycle bin policy. The key name is either &#39;default&#39;
     * or namespaced name of the tag value which can be in the format:
     * {organization_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_id}/{tag_key_short_name}/{tag_value_short_name} or
     * {project_number}/{tag_key_short_name}/{tag_value_short_name}. The default rule is
     * applied if snapshots do not have any of these tags. The value is the rule for the key.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param systemRules The system rules for snapshot recycle bin policy. Defines the default rule that applies if no customer-defined
     * rule matches.
     * Structure is documented below.
     * @return builder
     */
    inline def systemRules(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicySystemRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicySystemRuleArgs.builder
      builder.systemRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicySystemRuleArgs.Builder)
    /**
     * @param standardSnapshots (Output)
     * The rule config for standard snapshots.
     * Structure is documented below.
     * @return builder
     */
    inline def standardSnapshots(args: Endofunction[com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicySystemRuleStandardSnapshotArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicySystemRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.OrganizationSnapshotRecycleBinPolicySystemRuleStandardSnapshotArgs.builder
      builder.standardSnapshots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs.Builder)
    /**
     * @param instances All the listed instances will be mirrored.  Specify at most 50.
     * Structure is documented below.
     * @return builder
     */
    inline def instances(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesInstanceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesInstanceArgs.builder
      builder.instances(args.map(_(argsBuilder).build)*)

    /**
     * @param subnetworks All instances in one of these subnetworks will be mirrored.
     * Structure is documented below.
     * @return builder
     */
    inline def subnetworks(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesSubnetworkArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesSubnetworkArgs.builder
      builder.subnetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.PacketMirroringState.Builder)
    /**
     * @param collectorIlb The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
     * that will be used as collector for mirrored traffic. The
     * specified forwarding rule must have isMirroringCollector
     * set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def collectorIlb(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringCollectorIlbArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PacketMirroringState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringCollectorIlbArgs.builder
      builder.collectorIlb(args(argsBuilder).build)

    /**
     * @param filter A filter for mirrored traffic.  If unset, all traffic is mirrored.
     * Structure is documented below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringFilterArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PacketMirroringState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param mirroredResources A means of specifying which resources to mirror.
     * Structure is documented below.
     * @return builder
     */
    inline def mirroredResources(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PacketMirroringState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs.builder
      builder.mirroredResources(args(argsBuilder).build)

    /**
     * @param network Specifies the mirrored VPC network. Only packets in this network
     * will be mirrored. All mirrored VMs should have a NIC in the given
     * network. All mirrored subnetworks should belong to the given network.
     * Structure is documented below.
     * @return builder
     */
    inline def network(args: Endofunction[com.pulumi.gcp.compute.inputs.PacketMirroringNetworkArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PacketMirroringState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PacketMirroringNetworkArgs.builder
      builder.network(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.Builder)
    /**
     * @param disks Stateful disks for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param externalIps Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * @return builder
     */
    inline def externalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateExternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateExternalIpArgs.builder
      builder.externalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param internalIps Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * @return builder
     */
    inline def internalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateInternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateInternalIpArgs.builder
      builder.internalIps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateExternalIpArgs.Builder)
    /**
     * @param ipAddress Ip address representation
     * Structure is documented below.
     * @return builder
     */
    inline def ipAddress(args: Endofunction[com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateExternalIpIpAddressArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateExternalIpArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateExternalIpIpAddressArgs.builder
      builder.ipAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateInternalIpArgs.Builder)
    /**
     * @param ipAddress Ip address representation
     * Structure is documented below.
     * @return builder
     */
    inline def ipAddress(args: Endofunction[com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateInternalIpIpAddressArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateInternalIpArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateInternalIpIpAddressArgs.builder
      builder.ipAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.PerInstanceConfigState.Builder)
    /**
     * @param preservedState The preserved state for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def preservedState(args: Endofunction[com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PerInstanceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs.builder
      builder.preservedState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationArgs.Builder)
    /**
     * @param rolloutInput The input for the rollout operation.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutInput(args: Endofunction[com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationRolloutInputArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationRolloutInputArgs.builder
      builder.rolloutInput(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.PreviewFeatureState.Builder)
    /**
     * @param rolloutOperation The rollout operation of the feature.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutOperation(args: Endofunction[com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.PreviewFeatureState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.PreviewFeatureRolloutOperationArgs.builder
      builder.rolloutOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.PublicDelegatedPrefixState.Builder)
    /**
     * @param publicDelegatedSubPrefixs List of sub public delegated fixes for BYO IP functionality.
     * Each item in this array represents a sub prefix that can be
     * used to create addresses or further allocations.
     * Structure is documented below.
     * @return builder
     */
    inline def publicDelegatedSubPrefixs(args: Endofunction[com.pulumi.gcp.compute.inputs.PublicDelegatedPrefixPublicDelegatedSubPrefixArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.PublicDelegatedPrefixState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.PublicDelegatedPrefixPublicDelegatedSubPrefixArgs.builder
      builder.publicDelegatedSubPrefixs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder)
    /**
     * @param cpuUtilization Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * @return builder
     */
    inline def cpuUtilization(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs.builder
      builder.cpuUtilization(args(argsBuilder).build)

    /**
     * @param loadBalancingUtilization Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * @return builder
     */
    inline def loadBalancingUtilization(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs.builder
      builder.loadBalancingUtilization(args(argsBuilder).build)

    /**
     * @param metrics Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyMetricArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

    /**
     * @param scaleDownControl (Optional, Beta)
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * @return builder
     */
    inline def scaleDownControl(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlArgs.builder
      builder.scaleDownControl(args(argsBuilder).build)

    /**
     * @param scaleInControl Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * @return builder
     */
    inline def scaleInControl(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlArgs.builder
      builder.scaleInControl(args(argsBuilder).build)

    /**
     * @param scalingSchedules Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * @return builder
     */
    inline def scalingSchedules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScalingScheduleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScalingScheduleArgs.builder
      builder.scalingSchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlArgs.Builder)
    /**
     * @param maxScaledDownReplicas A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def maxScaledDownReplicas(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs.builder
      builder.maxScaledDownReplicas(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlArgs.Builder)
    /**
     * @param maxScaledInReplicas A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def maxScaledInReplicas(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs.builder
      builder.maxScaledInReplicas(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionAutoscalerState.Builder)
    /**
     * @param autoscalingPolicy The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * @return builder
     */
    inline def autoscalingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionAutoscalerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs.builder
      builder.autoscalingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendBucketIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendBucketIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendBucketIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendBucketIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendBucketIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendBucketIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendBucketIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendBucketIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendArgs.Builder)
    /**
     * @param customMetrics The set of custom metrics that are used for &lt;code&gt;CUSTOM_METRICS&lt;/code&gt; BalancingMode.
     * Structure is documented below.
     * @return builder
     */
    inline def customMetrics(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendCustomMetricArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendCustomMetricArgs.builder
      builder.customMetrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs.Builder)
    /**
     * @param cacheKeyPolicy The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * @return builder
     */
    inline def cacheKeyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyCacheKeyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyCacheKeyPolicyArgs.builder
      builder.cacheKeyPolicy(args(argsBuilder).build)

    /**
     * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
     * Structure is documented below.
     * @return builder
     */
    inline def negativeCachingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs.builder
      builder.negativeCachingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersArgs.Builder)
    /**
     * @param connectTimeout (Optional, Beta)
     * The timeout for new network connections to hosts.
     * Structure is documented below.
     * @return builder
     */
    inline def connectTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersConnectTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersConnectTimeoutArgs.builder
      builder.connectTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashArgs.Builder)
    /**
     * @param httpCookie Hash is based on HTTP Cookie. This field describes a HTTP cookie
     * that will be used as the hash key for the consistent hash load
     * balancer. If the cookie is not present, it will be generated.
     * This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
     * Structure is documented below.
     * @return builder
     */
    inline def httpCookie(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieArgs.builder
      builder.httpCookie(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieArgs.Builder)
    /**
     * @param ttl Lifetime of the cookie.
     * Structure is documented below.
     * @return builder
     */
    inline def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingArgs.Builder)
    /**
     * @param forwardProxy (Optional, Beta)
     * Dynamic Forwarding Proxy configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def forwardProxy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingForwardProxyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingForwardProxyArgs.builder
      builder.forwardProxy(args(argsBuilder).build)

    /**
     * @param ipPortSelection (Optional, Beta)
     * IP:PORT based dynamic forwarding configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def ipPortSelection(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingIpPortSelectionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingIpPortSelectionArgs.builder
      builder.ipPortSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyArgs.Builder)
    /**
     * @param leader Selects one of the network endpoints attached to the backend NEGs of this service as the
     * active endpoint (the leader) that receives all traffic.
     * Structure is documented below.
     * @return builder
     */
    inline def leader(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyLeaderArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyLeaderArgs.builder
      builder.leader(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyLeaderArgs.Builder)
    /**
     * @param networkEndpoint The network endpoint within the leader.backendGroup that is designated as the leader.
     * Structure is documented below.
     * @return builder
     */
    inline def networkEndpoint(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyLeaderNetworkEndpointArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyLeaderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyLeaderNetworkEndpointArgs.builder
      builder.networkEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs.Builder)
    /**
     * @param requestHeaders This field can only be specified if logging is enabled for this backend service and if the BackendService protocol is one of HTTP, HTTPS, HTTP2 and GRPC. Contains a list of request headers to be logged.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaders This field can only be specified if logging is enabled for this backend service and if the BackendService protocol is one of HTTP, HTTPS, HTTP2 and GRPC. Contains a list of response headers to be logged.
     * Structure is documented below.
     * @return builder
     */
    inline def responseHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigResponseHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder)
    /**
     * @param zonalAffinity When configured, new connections are load balanced across healthy backend endpoints in the local zone.
     * Structure is documented below.
     * @return builder
     */
    inline def zonalAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs.builder
      builder.zonalAffinity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs.Builder)
    /**
     * @param baseEjectionTime The base time that a host is ejected for. The real time is equal to the base
     * time multiplied by the number of times the host has been ejected. Defaults to
     * 30000ms or 30s.
     * Structure is documented below.
     * @return builder
     */
    inline def baseEjectionTime(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs.builder
      builder.baseEjectionTime(args(argsBuilder).build)

    /**
     * @param interval Time interval between ejection sweep analysis. This can result in both new
     * ejections as well as hosts being returned to service. Defaults to 10 seconds.
     * Structure is documented below.
     * @return builder
     */
    inline def interval(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionIntervalArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionIntervalArgs.builder
      builder.interval(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder)
    /**
     * @param backends The set of backends that serve this RegionBackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def backends(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

    /**
     * @param cdnPolicy Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * @return builder
     */
    inline def cdnPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs.builder
      builder.cdnPolicy(args(argsBuilder).build)

    /**
     * @param circuitBreakers Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the `loadBalancingScheme` is set to INTERNAL_MANAGED
     * and the `protocol` is set to HTTP, HTTPS, HTTP2 or H2C.
     * Structure is documented below.
     * @return builder
     */
    inline def circuitBreakers(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersArgs.builder
      builder.circuitBreakers(args(argsBuilder).build)

    /**
     * @param connectionTrackingPolicy Connection Tracking configuration for this BackendService.
     * This is available only for Layer 4 Internal Load Balancing and
     * Network Load Balancing.
     * Structure is documented below.
     * @return builder
     */
    inline def connectionTrackingPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceConnectionTrackingPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceConnectionTrackingPolicyArgs.builder
      builder.connectionTrackingPolicy(args(argsBuilder).build)

    /**
     * @param consistentHash Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing.
     * This field only applies when all of the following are true -
     * @return builder
     */
    inline def consistentHash(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashArgs.builder
      builder.consistentHash(args(argsBuilder).build)

    /**
     * @param customMetrics List of custom metrics that are used for the WEIGHTED_ROUND_ROBIN locality_lb_policy.
     * Structure is documented below.
     * @return builder
     */
    inline def customMetrics(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceCustomMetricArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceCustomMetricArgs.builder
      builder.customMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicForwarding (Optional, Beta)
     * Dynamic forwarding configuration. This field is used to configure the backend service with dynamic forwarding
     * feature which together with Service Extension allows customized and complex routing logic.
     * Structure is documented below.
     * @return builder
     */
    inline def dynamicForwarding(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceDynamicForwardingArgs.builder
      builder.dynamicForwarding(args(argsBuilder).build)

    /**
     * @param failoverPolicy Policy for failovers.
     * Structure is documented below.
     * @return builder
     */
    inline def failoverPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceFailoverPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceFailoverPolicyArgs.builder
      builder.failoverPolicy(args(argsBuilder).build)

    /**
     * @param haPolicy Configures self-managed High Availability (HA) for External and Internal Protocol Forwarding.
     * The backends of this regional backend service must only specify zonal network endpoint groups
     * (NEGs) of type GCE_VM_IP. Note that haPolicy is not for load balancing, and therefore cannot
     * be specified with sessionAffinity, connectionTrackingPolicy, and failoverPolicy. haPolicy
     * requires customers to be responsible for tracking backend endpoint health and electing a
     * leader among the healthy endpoints. Therefore, haPolicy cannot be specified with healthChecks.
     * haPolicy can only be specified for External Passthrough Network Load Balancers and Internal
     * Passthrough Network Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def haPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceHaPolicyArgs.builder
      builder.haPolicy(args(argsBuilder).build)

    /**
     * @param iap Settings for enabling Cloud Identity Aware Proxy.
     * If OAuth client is not set, Google-managed OAuth client is used.
     * Structure is documented below.
     * @return builder
     */
    inline def iap(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceIapArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceIapArgs.builder
      builder.iap(args(argsBuilder).build)

    /**
     * @param logConfig This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param networkPassThroughLbTrafficPolicy Configures traffic steering properties of internal passthrough Network Load Balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def networkPassThroughLbTrafficPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceNetworkPassThroughLbTrafficPolicyArgs.builder
      builder.networkPassThroughLbTrafficPolicy(args(argsBuilder).build)

    /**
     * @param outlierDetection Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the `loadBalancingScheme` is set
     * to INTERNAL_MANAGED and the `protocol` is set to HTTP, HTTPS, HTTP2 or H2C.
     * Structure is documented below.
     * @return builder
     */
    inline def outlierDetection(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs.builder
      builder.outlierDetection(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param strongSessionAffinityCookie Describes the HTTP cookie used for stateful session affinity. This field is applicable and required if the sessionAffinity is set to STRONG_COOKIE_AFFINITY.
     * Structure is documented below.
     * @return builder
     */
    inline def strongSessionAffinityCookie(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieArgs.builder
      builder.strongSessionAffinityCookie(args(argsBuilder).build)

    /**
     * @param subsetting (Optional, Beta)
     * Subsetting configuration for this BackendService. Currently this is applicable only for Internal TCP/UDP load balancing and Internal HTTP(S) load balancing.
     * Structure is documented below.
     * @return builder
     */
    inline def subsetting(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceSubsettingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceSubsettingArgs.builder
      builder.subsetting(args(argsBuilder).build)

    /**
     * @param tlsSettings Configuration for Backend Authenticated TLS and mTLS. May only be specified when the backend protocol is SSL, HTTPS or HTTP2.
     * Structure is documented below.
     * @return builder
     */
    inline def tlsSettings(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsArgs.builder
      builder.tlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieArgs.Builder)
    /**
     * @param ttl Lifetime of the cookie.
     * Structure is documented below.
     * @return builder
     */
    inline def ttl(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieTtlArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceStrongSessionAffinityCookieTtlArgs.builder
      builder.ttl(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsArgs.Builder)
    /**
     * @param subjectAltNames A list of Subject Alternative Names (SANs) that the Load Balancer verifies during a TLS handshake with the backend.
     * When the server presents its X.509 certificate to the Load Balancer, the Load Balancer inspects the certificate&#39;s SAN field,
     * and requires that at least one SAN match one of the subjectAltNames in the list. This field is limited to 5 entries.
     * When both sni and subjectAltNames are specified, the load balancer matches the backend certificate&#39;s SAN only to
     * subjectAltNames.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectAltNames(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsSubjectAltNameArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionBackendServiceTlsSettingsSubjectAltNameArgs.builder
      builder.subjectAltNames(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionCommitmentState.Builder)
    /**
     * @param licenseResource The license specification required as part of a license commitment.
     * Structure is documented below.
     * @return builder
     */
    inline def licenseResource(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionCommitmentLicenseResourceArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionCommitmentState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionCommitmentLicenseResourceArgs.builder
      builder.licenseResource(args(argsBuilder).build)

    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionCommitmentParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionCommitmentState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionCommitmentParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resources A list of commitment amounts for particular resources.
     * Note that VCPU and MEMORY resource commitments must occur together.
     * Structure is documented below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionCommitmentResourceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionCommitmentState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionCommitmentResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionDiskIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionDiskIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionDiskIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionDiskIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionDiskState.Builder)
    /**
     * @param asyncPrimaryDisk A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def asyncPrimaryDisk(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskAsyncPrimaryDiskArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionDiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskAsyncPrimaryDiskArgs.builder
      builder.asyncPrimaryDisk(args(argsBuilder).build)

    /**
     * @param diskEncryptionKey Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * ~&gt;**NOTE** Only changing `kmsKeyName` between Cloud KMS keys is done
     * in place; other changes to this block recreate the disk.
     * Structure is documented below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionDiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param guestOsFeatures A list of features to enable on the guest operating system.
     * Applicable only for bootable disks.
     * Structure is documented below.
     * @return builder
     */
    inline def guestOsFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionDiskState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionDiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionDiskSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionDiskState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionDiskSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder)
    /**
     * @param grpcHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcHealthCheckArgs.builder
      builder.grpcHealthCheck(args(argsBuilder).build)

    /**
     * @param grpcTlsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcTlsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcTlsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcTlsHealthCheckArgs.builder
      builder.grpcTlsHealthCheck(args(argsBuilder).build)

    /**
     * @param http2HealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def http2HealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckHttp2HealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckHttp2HealthCheckArgs.builder
      builder.http2HealthCheck(args(argsBuilder).build)

    /**
     * @param httpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs.builder
      builder.httpHealthCheck(args(argsBuilder).build)

    /**
     * @param httpsHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def httpsHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpsHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpsHealthCheckArgs.builder
      builder.httpsHealthCheck(args(argsBuilder).build)

    /**
     * @param logConfig Configure logging on this health check.
     * Structure is documented below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckLogConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param sslHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def sslHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckSslHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckSslHealthCheckArgs.builder
      builder.sslHealthCheck(args(argsBuilder).build)

    /**
     * @param tcpHealthCheck A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def tcpHealthCheck(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionHealthCheckTcpHealthCheckArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionHealthCheckState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionHealthCheckTcpHealthCheckArgs.builder
      builder.tcpHealthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs.Builder)
    /**
     * @param instanceSelections Named instance selections configuring properties that the group will use when creating new VMs.
     * @return builder
     */
    inline def instanceSelections(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs.builder
      builder.instanceSelections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs.Builder)
    /**
     * @param disks List of disks to be attached to the instances created from this selection.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.Builder)
    /**
     * @param diskEncryptionKey , Encrypts or decrypts a disk using a customer-supplied encryption key.  Structure is documented below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param labels , A set of key/value label pairs to assign to disks. Structure is documented below.
     * @return builder
     */
    inline def labels(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskLabelArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceManagerTags , A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored (both PUT &amp; PATCH) when empty. Structure is documented below.
     * @return builder
     */
    inline def resourceManagerTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskResourceManagerTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskResourceManagerTagArgs.builder
      builder.resourceManagerTags(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceImageEncryptionKey , The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys. Structure is documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey , The customer-supplied encryption key of the source snapshot. Structure is documented below.
     * ***
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionDiskSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyArgs.Builder)
    /**
     * @param onRepair , Configuration for VM repairs in the MIG. Structure is documented below.
     * ***
     * @return builder
     */
    inline def onRepair(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyOnRepairArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyOnRepairArgs.builder
      builder.onRepair(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder)
    /**
     * @param allInstancesConfig Properties to set on all instances in the group. After setting
     * allInstancesConfig on the group, you must update the group&#39;s instances to
     * apply the configuration.
     * @return builder
     */
    inline def allInstancesConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAllInstancesConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAllInstancesConfigArgs.builder
      builder.allInstancesConfig(args(argsBuilder).build)

    /**
     * @param autoHealingPolicies The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * @return builder
     */
    inline def autoHealingPolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAutoHealingPoliciesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAutoHealingPoliciesArgs.builder
      builder.autoHealingPolicies(args(argsBuilder).build)

    /**
     * @param instanceFlexibilityPolicy The flexibility policy for managed instance group. Instance flexibility allows managed instance group to create VMs from multiple types of machines. Instance flexibility configuration on managed instance group overrides instance template configuration. Structure is documented below.
     * @return builder
     */
    inline def instanceFlexibilityPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs.builder
      builder.instanceFlexibilityPolicy(args(argsBuilder).build)

    /**
     * @param instanceLifecyclePolicy The instance lifecycle policy for this managed instance group.
     * @return builder
     */
    inline def instanceLifecyclePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceLifecyclePolicyArgs.builder
      builder.instanceLifecyclePolicy(args(argsBuilder).build)

    /**
     * @param namedPorts The named port configuration. See the section below
     * for details on configuration.
     * @return builder
     */
    inline def namedPorts(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerNamedPortArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerNamedPortArgs.builder
      builder.namedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param params ) Input only additional params for instance group manager creation. Structure is documented below. For more information, see [API](https://cloud.google.com/compute/docs/reference/rest/beta/instanceGroupManagers/insert).
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resourcePolicies Resource policies for this managed instance group. Structure is documented below.
     * 
     * ***
     * @return builder
     */
    inline def resourcePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerResourcePoliciesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerResourcePoliciesArgs.builder
      builder.resourcePolicies(args(argsBuilder).build)

    /**
     * @param standbyPolicy The standby policy for stopped and suspended instances. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/suspended-and-stopped-vms-in-mig).
     * @return builder
     */
    inline def standbyPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStandbyPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStandbyPolicyArgs.builder
      builder.standbyPolicy(args(argsBuilder).build)

    /**
     * @param statefulDisks Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs). Proactive cross zone instance redistribution must be disabled before you can update stateful disks on existing instance group managers. This can be controlled via the `updatePolicy`.
     * @return builder
     */
    inline def statefulDisks(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulDiskArgs.builder
      builder.statefulDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulExternalIps External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulExternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulExternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulExternalIpArgs.builder
      builder.statefulExternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param statefulInternalIps Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name. Structure is documented below.
     * @return builder
     */
    inline def statefulInternalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulInternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulInternalIpArgs.builder
      builder.statefulInternalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param statuses The status of this managed instance group.
     * @return builder
     */
    inline def statuses(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param targetSizePolicies The policy that specifies how the MIG creates its VMs to achieve the target size. Structure is documented below.
     * @return builder
     */
    inline def targetSizePolicies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerTargetSizePolicyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerTargetSizePolicyArgs.builder
      builder.targetSizePolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param updatePolicy The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     * @return builder
     */
    inline def updatePolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

    /**
     * @param versions Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * @return builder
     */
    inline def versions(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusArgs.Builder)
    /**
     * @param allInstancesConfigs Properties to set on all instances in the group. After setting
     * allInstancesConfig on the group, you must update the group&#39;s instances to
     * apply the configuration.
     * @return builder
     */
    inline def allInstancesConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusAllInstancesConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusAllInstancesConfigArgs.builder
      builder.allInstancesConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param statefuls Stateful status of the given Instance Group Manager.
     * @return builder
     */
    inline def statefuls(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulArgs.builder
      builder.statefuls(args.map(_(argsBuilder).build)*)

    /**
     * @param versionTargets A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances&#39; target version are specified by version field on Instance Group Manager.
     * @return builder
     */
    inline def versionTargets(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusVersionTargetArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusVersionTargetArgs.builder
      builder.versionTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulArgs.Builder)
    /**
     * @param perInstanceConfigs Status of per-instance configs on the instances.
     * @return builder
     */
    inline def perInstanceConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs.builder
      builder.perInstanceConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs.Builder)
    /**
     * @param targetSize The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     * &gt; Exactly one `version` you specify must not have a `targetSize` specified. During a rolling update, the instance group manager will fulfill the `targetSize`
     * constraints of every other `version`, and any remaining instances will be provisioned with the version where `targetSize` is unset.
     * @return builder
     */
    inline def targetSize(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionTargetSizeArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionTargetSizeArgs.builder
      builder.targetSize(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.Builder)
    /**
     * @param diskEncryptionKey Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     * If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key.
     * 
     * If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance.
     * 
     * If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later.
     * 
     * Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group. Structure documented below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceImageEncryptionKey The customer-supplied encryption
     * key of the source image. Required if the source image is protected by a
     * customer-supplied encryption key.
     * 
     * Instance templates do not store customer-supplied encryption keys, so you
     * cannot create disks for instances in a managed instance group if the source
     * images are encrypted with your own keys. Structure
     * documented below.
     * @return builder
     */
    inline def sourceImageEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskSourceImageEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskSourceImageEncryptionKeyArgs.builder
      builder.sourceImageEncryptionKey(args(argsBuilder).build)

    /**
     * @param sourceSnapshotEncryptionKey The customer-supplied encryption
     * key of the source snapshot. Structure
     * documented below.
     * @return builder
     */
    inline def sourceSnapshotEncryptionKey(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskSourceSnapshotEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskSourceSnapshotEncryptionKeyArgs.builder
      builder.sourceSnapshotEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.Builder)
    /**
     * @param accessConfigs Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet (this means that ssh provisioners will
     * not work unless you are running Terraform can send traffic to the instance&#39;s
     * network (e.g. via tunnel or because it is running on another cloud instance
     * on that network). This block can be specified once per `networkInterface`. Structure documented below.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceAccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpRanges An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * @return builder
     */
    inline def aliasIpRanges(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceAliasIpRangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceAliasIpRangeArgs.builder
      builder.aliasIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpv6Ranges [Beta] An
     * array of alias IPv6 ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * @return builder
     */
    inline def aliasIpv6Ranges(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceAliasIpv6RangeArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceAliasIpv6RangeArgs.builder
      builder.aliasIpv6Ranges(args.map(_(argsBuilder).build)*)

    /**
     * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * @return builder
     */
    inline def ipv6AccessConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceIpv6AccessConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceIpv6AccessConfigArgs.builder
      builder.ipv6AccessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinityArgs.Builder)
    /**
     * @param specificReservation Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * @return builder
     */
    inline def specificReservation(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinitySpecificReservationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinitySpecificReservationArgs.builder
      builder.specificReservation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder)
    /**
     * @param gracefulShutdown Settings for the instance to perform a graceful shutdown.
     * @return builder
     */
    inline def gracefulShutdown(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingGracefulShutdownArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingGracefulShutdownArgs.builder
      builder.gracefulShutdown(args(argsBuilder).build)

    /**
     * @param localSsdRecoveryTimeouts Specifies the maximum amount of time a Local Ssd Vm should wait while
     *   recovery of the Local Ssd state is attempted. Its value should be in
     *   between 0 and 168 hours with hour granularity and the default value being 1
     *   hour.
     * @return builder
     */
    inline def localSsdRecoveryTimeouts(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingLocalSsdRecoveryTimeoutArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingLocalSsdRecoveryTimeoutArgs.builder
      builder.localSsdRecoveryTimeouts(args.map(_(argsBuilder).build)*)

    /**
     * @param maxRunDuration The duration of the instance. Instance will run and be terminated after then, the termination action could be defined in `instanceTerminationAction`. Only support `DELETE` `instanceTerminationAction` at this point. Structure is documented below.
     * @return builder
     */
    inline def maxRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingMaxRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingMaxRunDurationArgs.builder
      builder.maxRunDuration(args(argsBuilder).build)

    /**
     * @param nodeAffinities Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * @return builder
     */
    inline def nodeAffinities(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

    /**
     * @param onInstanceStopAction Defines the behaviour for instances with the instance_termination_action.
     * @return builder
     */
    inline def onInstanceStopAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingOnInstanceStopActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingOnInstanceStopActionArgs.builder
      builder.onInstanceStopAction(args(argsBuilder).build)

    /**
     * @param preemptionNoticeDuration The duration of the notice that the instance will receive before it is preempted.
     * @return builder
     */
    inline def preemptionNoticeDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingPreemptionNoticeDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingPreemptionNoticeDurationArgs.builder
      builder.preemptionNoticeDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingGracefulShutdownArgs.Builder)
    /**
     * @param maxDuration The time allotted for the instance to gracefully shut down.
     * If the graceful shutdown isn&#39;t complete after this time, then the instance
     * transitions to the STOPPING state. Structure is documented below:
     * @return builder
     */
    inline def maxDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingGracefulShutdownMaxDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingGracefulShutdownArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingGracefulShutdownMaxDurationArgs.builder
      builder.maxDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder)
    /**
     * @param advancedMachineFeatures Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * @return builder
     */
    inline def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * @return builder
     */
    inline def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param disks Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * @return builder
     */
    inline def guestAccelerators(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machineType`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * @return builder
     */
    inline def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param reservationAffinity Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationAffinity(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinityArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param scheduling The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def scheduling(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param serviceAccount Service account to attach to the instance. Structure is documented below.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateServiceAccountArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity Config. More details about
     * this configuration option are detailed below.
     * @return builder
     */
    inline def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstanceTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstanceTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstantSnapshotIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionInstantSnapshotState.Builder)
    /**
     * @param params Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstantSnapshotParamsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionInstantSnapshotState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstantSnapshotParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param resourceStatuses Resource status for the instant snapshot.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceStatuses(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionInstantSnapshotResourceStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionInstantSnapshotState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionInstantSnapshotResourceStatusArgs.builder
      builder.resourceStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState.Builder)
    /**
     * @param appEngine This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def appEngine(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupAppEngineArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupAppEngineArgs.builder
      builder.appEngine(args(argsBuilder).build)

    /**
     * @param cloudFunction This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudFunction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudFunctionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudFunctionArgs.builder
      builder.cloudFunction(args(argsBuilder).build)

    /**
     * @param cloudRun This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudRun(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudRunArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudRunArgs.builder
      builder.cloudRun(args(argsBuilder).build)

    /**
     * @param pscData This field is only used for PSC NEGs.
     * Structure is documented below.
     * @return builder
     */
    inline def pscData(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupPscDataArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupPscDataArgs.builder
      builder.pscData(args(argsBuilder).build)

    /**
     * @param serverlessDeployment (Optional, Beta)
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def serverlessDeployment(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupServerlessDeploymentArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupServerlessDeploymentArgs.builder
      builder.serverlessDeployment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleState.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder)
    /**
     * @param matches (Output)
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def matches(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

    /**
     * @param targetSecureTags (Output)
     * A list of secure tags that controls which instances the firewall rule
     * applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the
     * firewall rule applies only to instances in the VPC network that have one
     * of those EFFECTIVE secure tags, if all the targetSecureTag are in
     * INEFFECTIVE state, then this rule will be ignored.
     * &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as
     * &lt;code&gt;targetServiceAccounts&lt;/code&gt;.
     * If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor
     * &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies
     * to all instances on the specified network.
     * Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source
     * of the traffic.
     * For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE,
     * and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored.
     * Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedRuleMatchLayer4Config&#34;&gt;&lt;/a&gt;The `layer4Config` block supports:
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the firewall rule
     * applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the
     * firewall rule applies only to instances in the VPC network that have one
     * of those EFFECTIVE secure tags, if all the targetSecureTag are in
     * INEFFECTIVE state, then this rule will be ignored.
     * &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as
     * &lt;code&gt;targetServiceAccounts&lt;/code&gt;.
     * If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor
     * &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies
     * to all instances on the specified network.
     * Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

    /**
     * @param srcSecureTags List of secure tag values, which should be matched at the source
     * of the traffic.
     * For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE,
     * and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored.
     * Maximum number of source tag values allowed is 256.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedRuleMatchLayer4Config&#34;&gt;&lt;/a&gt;The `layer4Config` block supports:
     * @return builder
     */
    inline def srcSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchSrcSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchSrcSecureTagArgs.builder
      builder.srcSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesState.Builder)
    /**
     * @param predefinedRules A list of firewall policy pre-defined rules.
     * Structure is documented below.
     * @return builder
     */
    inline def predefinedRules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleArgs.builder
      builder.predefinedRules(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A list of firewall policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkPolicyState.Builder)
    /**
     * @param associations [Output Only] A list of associations that belong to this network policy.
     * Structure is documented below.
     * @return builder
     */
    inline def associations(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyAssociationArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyAssociationArgs.builder
      builder.associations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchArgs.Builder)
    /**
     * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedMatchLayer4Configs&#34;&gt;&lt;/a&gt;The `layer4Configs` block supports:
     * @return builder
     */
    inline def layer4Configs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchLayer4ConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchLayer4ConfigArgs.builder
      builder.layer4Configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleState.Builder)
    /**
     * @param action The Action to perform when the client connection triggers the rule.
     * Structure is documented below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param targetSecureTags A list of secure tags that controls which instances the traffic classification rule applies to.
     * If targetSecureTag are specified, then the traffic classification rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * @return builder
     */
    inline def targetSecureTags(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleTargetSecureTagArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionNetworkPolicyTrafficClassificationRuleTargetSecureTagArgs.builder
      builder.targetSecureTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.Builder)
    /**
     * @param disks Stateful disks for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def disks(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateDiskArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param externalIps Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * @return builder
     */
    inline def externalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateExternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateExternalIpArgs.builder
      builder.externalIps(args.map(_(argsBuilder).build)*)

    /**
     * @param internalIps Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * @return builder
     */
    inline def internalIps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpArgs.builder
      builder.internalIps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateExternalIpArgs.Builder)
    /**
     * @param ipAddress Ip address representation
     * Structure is documented below.
     * @return builder
     */
    inline def ipAddress(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateExternalIpIpAddressArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateExternalIpArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateExternalIpIpAddressArgs.builder
      builder.ipAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpArgs.Builder)
    /**
     * @param ipAddress Ip address representation
     * Structure is documented below.
     * @return builder
     */
    inline def ipAddress(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpIpAddressArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpIpAddressArgs.builder
      builder.ipAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigState.Builder)
    /**
     * @param preservedState The preserved state for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def preservedState(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs.builder
      builder.preservedState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestState.Builder)
    /**
     * @param requestedRunDuration Requested run duration for instances that will be created by this request. At the end of the run duration instances will be deleted.
     * Structure is documented below.
     * @return builder
     */
    inline def requestedRunDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestRequestedRunDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestRequestedRunDurationArgs.builder
      builder.requestedRunDuration(args(argsBuilder).build)

    /**
     * @param statuses Status of the request.
     * Structure is documented below.
     * @return builder
     */
    inline def statuses(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusArgs.Builder)
    /**
     * @param errors (Output)
     * Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the lastAttempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
     * Structure is documented below.
     * @return builder
     */
    inline def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param lastAttempts (Output)
     * Information about the last attempt to fulfill the request. The value is temporary since the ResizeRequest can retry, as long as it&#39;s still active and the last attempt value can either be cleared or replaced with a different error. Since ResizeRequest retries infrequently, the value may be stale and no longer show an active problem. The value is cleared when ResizeRequest transitions to the final state (becomes inactive). If the final state is FAILED the error describing it will be storred in the &#34;error&#34; field only.
     * Structure is documented below.
     * @return builder
     */
    inline def lastAttempts(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptArgs.builder
      builder.lastAttempts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorArgs.Builder)
    /**
     * @param errors (Output)
     * The array of errors encountered while processing this operation.
     * Structure is documented below.
     * @return builder
     */
    inline def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorArgs.Builder)
    /**
     * @param errorDetails (Output)
     * An array of messages that contain the error details. There is a set of defined message types to use for providing details.The syntax depends on the error code. For example, QuotaExceededInfo will have details when the error code is QUOTA_EXCEEDED.
     * Structure is documented below.
     * @return builder
     */
    inline def errorDetails(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailArgs.builder
      builder.errorDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailArgs.Builder)
    /**
     * @param errorInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def errorInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs.builder
      builder.errorInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param helps (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def helps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailHelpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailHelpArgs.builder
      builder.helps(args.map(_(argsBuilder).build)*)

    /**
     * @param localizedMessages (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def localizedMessages(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailLocalizedMessageArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailLocalizedMessageArgs.builder
      builder.localizedMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def quotaInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailQuotaInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailQuotaInfoArgs.builder
      builder.quotaInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailHelpArgs.Builder)
    /**
     * @param links (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def links(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailHelpLinkArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailHelpArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusErrorErrorErrorDetailHelpLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptArgs.Builder)
    /**
     * @param errors (Output)
     * Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the lastAttempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
     * Structure is documented below.
     * @return builder
     */
    inline def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorArgs.Builder)
    /**
     * @param errors (Output)
     * The array of errors encountered while processing this operation.
     * Structure is documented below.
     * @return builder
     */
    inline def errors(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorArgs.Builder)
    /**
     * @param errorDetails (Output)
     * An array of messages that contain the error details. There is a set of defined message types to use for providing details.The syntax depends on the error code. For example, QuotaExceededInfo will have details when the error code is QUOTA_EXCEEDED.
     * Structure is documented below.
     * @return builder
     */
    inline def errorDetails(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.builder
      builder.errorDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder)
    /**
     * @param errorInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def errorInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailErrorInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailErrorInfoArgs.builder
      builder.errorInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param helps (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def helps(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.builder
      builder.helps(args.map(_(argsBuilder).build)*)

    /**
     * @param localizedMessages (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def localizedMessages(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailLocalizedMessageArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailLocalizedMessageArgs.builder
      builder.localizedMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaInfos (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def quotaInfos(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailQuotaInfoArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailQuotaInfoArgs.builder
      builder.quotaInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.Builder)
    /**
     * @param links (Output)
     * A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def links(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLinkArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigArgs.Builder)
    /**
     * @param jsonCustomConfig Custom configuration to apply the JSON parsing. Only applicable when JSON parsing is set to STANDARD.
     * Structure is documented below.
     * @return builder
     */
    inline def jsonCustomConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigJsonCustomConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigJsonCustomConfigArgs.builder
      builder.jsonCustomConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param networkMatch A match condition that incoming packets are evaluated against for CLOUD_ARMOR_NETWORK security policies. If it matches, the corresponding &#39;action&#39; is enforced.
     * The match criteria for a rule consists of built-in match fields (like &#39;srcIpRanges&#39;) and potentially multiple user-defined match fields (&#39;userDefinedFields&#39;).
     * Field values may be extracted directly from the packet or derived from it (e.g. &#39;srcRegionCodes&#39;). Some fields may not be present in every packet (e.g. &#39;srcPorts&#39;). A user-defined field is only present if the base header is found in the packet and the entire field is in bounds.
     * Each match field may specify which values can match it, listing one or more ranges, prefixes, or exact values that are considered a match for the field. A field value must be present in order to match a specified match field. If no match values are specified for a match field, then any field value is considered to match it, and it&#39;s not required to be present. For strings specifying &#39;*&#39; is also equivalent to match all.
     * For a packet to match a rule, all specified match fields must match the corresponding field values derived from the packet.
     * Example:
     * networkMatch: srcIpRanges: - &#34;192.0.2.0/24&#34; - &#34;198.51.100.0/24&#34; userDefinedFields: - name: &#34;ipv4FragmentOffset&#34; values: - &#34;1-0x1fff&#34;
     * The above match condition matches packets with a source IP in 192.0.2.0/24 or 198.51.100.0/24 and a user-defined field named &#34;ipv4FragmentOffset&#34; with a value between 1 and 0x1fff inclusive
     * Structure is documented below.
     * @return builder
     */
    inline def networkMatch(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.builder
      builder.networkMatch(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule.
     * If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
     * Structure is documented below.
     * @return builder
     */
    inline def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param rateLimitOptions Must be specified if the action is &#34;rateBasedBan&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * Structure is documented below.
     * @return builder
     */
    inline def rateLimitOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.builder
      builder.rateLimitOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.Builder)
    /**
     * @param config The configuration options available when specifying versionedExpr.
     * This field must be specified if versionedExpr is specified and cannot be specified if versionedExpr is not specified.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param expr User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * @return builder
     */
    inline def expr(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchExprArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchExprArgs.builder
      builder.expr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.Builder)
    /**
     * @param userDefinedFields User-defined fields. Each element names a defined field and lists the matching values for that field.
     * Structure is documented below.
     * @return builder
     */
    inline def userDefinedFields(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchUserDefinedFieldArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchUserDefinedFieldArgs.builder
      builder.userDefinedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.Builder)
    /**
     * @param exclusions An exclusion to apply during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder)
    /**
     * @param requestBodies (Optional, Beta)
     * A list of request body fields to be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    inline def requestBodies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestBodyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestBodyArgs.builder
      builder.requestBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param requestCookies Request cookie whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    inline def requestCookies(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyArgs.builder
      builder.requestCookies(args.map(_(argsBuilder).build)*)

    /**
     * @param requestHeaders Request header whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeaders(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param requestQueryParams Request query parameter whose value will be excluded from inspection during preconfigured WAF evaluation.
     * Note that the parameter can be in the query string or in the POST body.
     * Structure is documented below.
     * @return builder
     */
    inline def requestQueryParams(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParamArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParamArgs.builder
      builder.requestQueryParams(args.map(_(argsBuilder).build)*)

    /**
     * @param requestUris Request URI from the request line to be excluded from inspection during preconfigured WAF evaluation.
     * When specifying this field, the query or fragment part should be excluded.
     * Structure is documented below.
     * @return builder
     */
    inline def requestUris(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUriArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUriArgs.builder
      builder.requestUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.Builder)
    /**
     * @param banThreshold Can only be specified if the action for the rule is &#34;rateBasedBan&#34;.
     * If specified, the key will be banned for the configured &#39;banDurationSec&#39; when the number of requests that exceed the &#39;rateLimitThreshold&#39; also exceed this &#39;banThreshold&#39;.
     * Structure is documented below.
     * @return builder
     */
    inline def banThreshold(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsBanThresholdArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsBanThresholdArgs.builder
      builder.banThreshold(args(argsBuilder).build)

    /**
     * @param enforceOnKeyConfigs If specified, any combination of values of enforceOnKeyType/enforceOnKeyName is treated as the key on which ratelimit threshold/action is enforced.
     * You can specify up to 3 enforceOnKeyConfigs.
     * If enforceOnKeyConfigs is specified, enforceOnKey must not be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def enforceOnKeyConfigs(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfigArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfigArgs.builder
      builder.enforceOnKeyConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param rateLimitThreshold Threshold at which to begin ratelimiting.
     * Structure is documented below.
     * @return builder
     */
    inline def rateLimitThreshold(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs.builder
      builder.rateLimitThreshold(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleState.Builder)
    /**
     * @param match A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

    /**
     * @param networkMatch A match condition that incoming packets are evaluated against for CLOUD_ARMOR_NETWORK security policies. If it matches, the corresponding &#39;action&#39; is enforced.
     * The match criteria for a rule consists of built-in match fields (like &#39;srcIpRanges&#39;) and potentially multiple user-defined match fields (&#39;userDefinedFields&#39;).
     * Field values may be extracted directly from the packet or derived from it (e.g. &#39;srcRegionCodes&#39;). Some fields may not be present in every packet (e.g. &#39;srcPorts&#39;). A user-defined field is only present if the base header is found in the packet and the entire field is in bounds.
     * Each match field may specify which values can match it, listing one or more ranges, prefixes, or exact values that are considered a match for the field. A field value must be present in order to match a specified match field. If no match values are specified for a match field, then any field value is considered to match it, and it&#39;s not required to be present. For strings specifying &#39;*&#39; is also equivalent to match all.
     * For a packet to match a rule, all specified match fields must match the corresponding field values derived from the packet.
     * Example:
     * networkMatch: srcIpRanges: - &#34;192.0.2.0/24&#34; - &#34;198.51.100.0/24&#34; userDefinedFields: - name: &#34;ipv4FragmentOffset&#34; values: - &#34;1-0x1fff&#34;
     * The above match condition matches packets with a source IP in 192.0.2.0/24 or 198.51.100.0/24 and a user-defined field named &#34;ipv4FragmentOffset&#34; with a value between 1 and 0x1fff inclusive
     * Structure is documented below.
     * @return builder
     */
    inline def networkMatch(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleNetworkMatchArgs.builder
      builder.networkMatch(args(argsBuilder).build)

    /**
     * @param preconfiguredWafConfig Preconfigured WAF configuration to be applied for the rule.
     * If the rule does not evaluate preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have no effect.
     * Structure is documented below.
     * @return builder
     */
    inline def preconfiguredWafConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRulePreconfiguredWafConfigArgs.builder
      builder.preconfiguredWafConfig(args(argsBuilder).build)

    /**
     * @param rateLimitOptions Must be specified if the action is &#34;rateBasedBan&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * Structure is documented below.
     * @return builder
     */
    inline def rateLimitOptions(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleRateLimitOptionsArgs.builder
      builder.rateLimitOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionSecurityPolicyState.Builder)
    /**
     * @param advancedOptionsConfig Advanced Options Config of this security policy.
     * Structure is documented below.
     * @return builder
     */
    inline def advancedOptionsConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyAdvancedOptionsConfigArgs.builder
      builder.advancedOptionsConfig(args(argsBuilder).build)

    /**
     * @param ddosProtectionConfig Configuration for Google Cloud Armor DDOS Proctection Config.
     * Structure is documented below.
     * @return builder
     */
    inline def ddosProtectionConfig(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyDdosProtectionConfigArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyDdosProtectionConfigArgs.builder
      builder.ddosProtectionConfig(args(argsBuilder).build)

    /**
     * @param rules The set of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param userDefinedFields Definitions of user-defined fields for CLOUD_ARMOR_NETWORK policies.
     * A user-defined field consists of up to 4 bytes extracted from a fixed offset in the packet, relative to the IPv4, IPv6, TCP, or UDP header, with an optional mask to select certain bits.
     * Rules may then specify matching values for these fields.
     * Structure is documented below.
     * @return builder
     */
    inline def userDefinedFields(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionSecurityPolicyUserDefinedFieldArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionSecurityPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionSecurityPolicyUserDefinedFieldArgs.builder
      builder.userDefinedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder)
    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * @return builder
     */
    inline def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
     * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
     * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
     * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
     * Structure is documented below.
     * @return builder
     */
    inline def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
     * If not specified, this field uses the largest timeout among all backend services associated with the route.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, before forwarding the request to the matched service.
     * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
     * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    inline def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    inline def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    inline def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    inline def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    inline def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request before forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response before sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    inline def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request before forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response before sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    inline def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder)
    /**
     * @param defaultRouteAction defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultRouteAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.builder
      builder.defaultRouteAction(args(argsBuilder).build)

    /**
     * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultUrlRedirect(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultUrlRedirectArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultUrlRedirectArgs.builder
      builder.defaultUrlRedirect(args(argsBuilder).build)

    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

    /**
     * @param pathRules The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that&#39;s required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c&#47;&#42; will match before /a/b&#47;&#42;
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def pathRules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleArgs.builder
      builder.pathRules(args.map(_(argsBuilder).build)*)

    /**
     * @param routeRules The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * @return builder
     */
    inline def routeRules(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs.builder
      builder.routeRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder)
    /**
     * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * @return builder
     */
    inline def corsPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionCorsPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionCorsPolicyArgs.builder
      builder.corsPolicy(args(argsBuilder).build)

    /**
     * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service.
     * Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
     * timeout and retryPolicy is ignored by clients that are configured with a faultInjectionPolicy if: 1. The traffic is generated by fault injection AND 2. The fault injection is not a delay fault injection.
     * Fault injection is not supported with the global external HTTP(S) load balancer (classic). To see which load balancers support fault injection, see Load balancing: [Routing and traffic management features](https://cloud.google.com/load-balancing/docs/features#routing-traffic-management).
     * Structure is documented below.
     * @return builder
     */
    inline def faultInjectionPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.builder
      builder.faultInjectionPolicy(args(argsBuilder).build)

    /**
     * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route.
     * Unlike the `Timeout` field where the timeout duration starts from the time the request
     * has been fully processed (known as end-of-stream), the duration in this field
     * is computed from the beginning of the stream until the response has been processed,
     * including all retries. A stream that does not complete in this duration is closed.
     * Structure is documented below.
     * @return builder
     */
    inline def maxStreamDuration(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDurationArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionMaxStreamDurationArgs.builder
      builder.maxStreamDuration(args(argsBuilder).build)

    /**
     * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def requestMirrorPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs.builder
      builder.requestMirrorPolicy(args(argsBuilder).build)

    /**
     * @param retryPolicy Specifies the retry policy associated with this route.
     * Structure is documented below.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as end-of-stream) up until the response has been processed. Timeout includes all retries.
     * If not specified, this field uses the largest timeout among all backend services associated with the route.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def timeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param urlRewrite The spec to modify the URL of the request, before forwarding the request to the matched service.
     * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
     * Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def urlRewrite(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionUrlRewriteArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionUrlRewriteArgs.builder
      builder.urlRewrite(args(argsBuilder).build)

    /**
     * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number.
     * After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * @return builder
     */
    inline def weightedBackendServices(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.builder
      builder.weightedBackendServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder)
    /**
     * @param abort The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * @return builder
     */
    inline def abort(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs.builder
      builder.abort(args(argsBuilder).build)

    /**
     * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * @return builder
     */
    inline def delay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.builder
      builder.delay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder)
    /**
     * @param fixedDelay Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * @return builder
     */
    inline def fixedDelay(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs.builder
      builder.fixedDelay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs.Builder)
    /**
     * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * @return builder
     */
    inline def perTryTimeout(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyPerTryTimeoutArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionRetryPolicyPerTryTimeoutArgs.builder
      builder.perTryTimeout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.Builder)
    /**
     * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
     * Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * Structure is documented below.
     * @return builder
     */
    inline def headerAction(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder]):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.builder
      builder.headerAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request before forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response before sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    inline def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionArgs.Builder)
    /**
     * @param requestHeadersToAdds Headers to add to a matching request before forwarding the request to the backendService.
     * Structure is documented below.
     * @return builder
     */
    inline def requestHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionRequestHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionRequestHeadersToAddArgs.builder
      builder.requestHeadersToAdds(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeadersToAdds Headers to add the response before sending the response back to the client.
     * Structure is documented below.
     * @return builder
     */
    inline def responseHeadersToAdds(args: Endofunction[com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionResponseHeadersToAddArgs.Builder]*):
        com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherHeaderActionResponseHeadersToAddArgs.builder
      builder.responseHeadersToAdds(args.map(_(argsBuilder).build)*)
