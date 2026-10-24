package jp.ukiba.ko_pulumi
package gcp

object folder_ext:
  extension (builder: com.pulumi.gcp.folder.AccessApprovalSettingsArgs.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * @return builder
     */
    inline def enrolledServices(args: Endofunction[com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.folder.AccessApprovalSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.folder.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.folder.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.folder.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.IamAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.folder.IamAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    inline def booleanPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It
     * can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    inline def listPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     * &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     * effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * @return builder
     */
    inline def restorePolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.AccessApprovalSettingsState.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * @return builder
     */
    inline def enrolledServices(args: Endofunction[com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.folder.inputs.AccessApprovalSettingsState.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.folder.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.folder.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.folder.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.IamAuditConfigState.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.folder.inputs.IamAuditConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder)
    /**
     * @param allow or `deny` - (Optional) One or the other must be set.
     * @return builder
     */
    inline def allow(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyAllowArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param deny One or the other must be set.
     * @return builder
     */
    inline def deny(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyDenyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyDenyArgs.builder
      builder.deny(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    inline def booleanPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It
     * can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    inline def listPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     * &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     * effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * @return builder
     */
    inline def restorePolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)
