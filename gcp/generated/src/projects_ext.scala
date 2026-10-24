package jp.ukiba.ko_pulumi
package gcp

object projects_ext:
  extension (builder: com.pulumi.gcp.projects.AccessApprovalSettingsArgs.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * @return builder
     */
    inline def enrolledServices(args: Endofunction[com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.projects.AccessApprovalSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.ApiKeyArgs.Builder)
    /**
     * @param restrictions Key restrictions.
     * @return builder
     */
    inline def restrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.ApiKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.builder
      builder.restrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.IAMAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.projects.IAMAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.projects.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.projects.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    inline def booleanPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    inline def listPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     * &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     * effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * @return builder
     */
    inline def restorePolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.AccessApprovalSettingsState.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * @return builder
     */
    inline def enrolledServices(args: Endofunction[com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.AccessApprovalSettingsState.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.Builder)
    /**
     * @param allowedApplications A list of Android applications that are allowed to make API calls with this key.
     * @return builder
     */
    inline def allowedApplications(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs.builder
      builder.allowedApplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder)
    /**
     * @param androidKeyRestrictions The Android apps that are allowed to use the key.
     * @return builder
     */
    inline def androidKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.builder
      builder.androidKeyRestrictions(args(argsBuilder).build)

    /**
     * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
     * @return builder
     */
    inline def apiTargets(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsApiTargetArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsApiTargetArgs.builder
      builder.apiTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param browserKeyRestrictions The HTTP referrers (websites) that are allowed to use the key.
     * @return builder
     */
    inline def browserKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsBrowserKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsBrowserKeyRestrictionsArgs.builder
      builder.browserKeyRestrictions(args(argsBuilder).build)

    /**
     * @param iosKeyRestrictions The iOS apps that are allowed to use the key.
     * @return builder
     */
    inline def iosKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsIosKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsIosKeyRestrictionsArgs.builder
      builder.iosKeyRestrictions(args(argsBuilder).build)

    /**
     * @param serverKeyRestrictions The IP addresses of callers that are allowed to use the key.
     * @return builder
     */
    inline def serverKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsServerKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsServerKeyRestrictionsArgs.builder
      builder.serverKeyRestrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.ApiKeyState.Builder)
    /**
     * @param restrictions Key restrictions.
     * @return builder
     */
    inline def restrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.builder
      builder.restrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.IAMAuditConfigState.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.IAMAuditConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.projects.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.projects.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder)
    /**
     * @param allow or `deny` - (Optional) One or the other must be set.
     * @return builder
     */
    inline def allow(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyAllowArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param deny One or the other must be set.
     * @return builder
     */
    inline def deny(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyDenyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyDenyArgs.builder
      builder.deny(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    inline def booleanPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    inline def listPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     * &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     * effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * @return builder
     */
    inline def restorePolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)
