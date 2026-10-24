package jp.ukiba.ko_pulumi
package gcp

object organizations_ext:
  extension (builder: com.pulumi.gcp.organizations.AccessApprovalSettingsArgs.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * @return builder
     */
    inline def enrolledServices(args: Endofunction[com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.organizations.AccessApprovalSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.organizations.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.organizations.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.IamAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.IamAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.PolicyArgs.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * @return builder
     */
    inline def booleanPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    inline def listPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     * &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     * effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * @return builder
     */
    inline def restorePolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.organizations.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * @return builder
     */
    inline def enrolledServices(args: Endofunction[com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.Builder)
    /**
     * @param auditConfigs A nested configuration block that defines logging additional configuration for your project. This field is only supported on `gcp.projects.IAMPolicy`, `gcp.folder.IAMPolicy` and `gcp.organizations.IAMPolicy`.
     * @return builder
     */
    inline def auditConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.builder
      builder.auditConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bindings A nested configuration block (described below)
     * defining a binding to be included in the policy document. Multiple
     * `binding` arguments are supported.
     * 
     * Each document configuration must have one or more `binding` blocks, which
     * each accept the following arguments:
     * @return builder
     */
    inline def bindings(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfig.Builder)
    /**
     * @param auditLogConfigs A nested block that defines the operations you&#39;d like to log.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfig.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfig.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfig.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs A nested block that defines the operations you&#39;d like to log.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyBinding.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingCondition.Builder]):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyBinding.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingCondition.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyPlainArgs.Builder)
    /**
     * @param auditConfigs A nested configuration block that defines logging additional configuration for your project. This field is only supported on `gcp.projects.IAMPolicy`, `gcp.folder.IAMPolicy` and `gcp.organizations.IAMPolicy`.
     * @return builder
     */
    inline def auditConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfig.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyPlainArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfig.builder
      builder.auditConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bindings A nested configuration block (described below)
     * defining a binding to be included in the policy document. Multiple
     * `binding` arguments are supported.
     * 
     * Each document configuration must have one or more `binding` blocks, which
     * each accept the following arguments:
     * @return builder
     */
    inline def bindings(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyBinding.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyPlainArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyBinding.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.IamAuditConfigState.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    inline def auditLogConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.IamAuditConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder)
    /**
     * @param allow or `deny` - (Optional) One or the other must be set.
     * @return builder
     */
    inline def allow(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyAllowArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param deny One or the other must be set.
     * @return builder
     */
    inline def deny(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyDenyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyDenyArgs.builder
      builder.deny(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.PolicyState.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * @return builder
     */
    inline def booleanPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    inline def listPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     * &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     * effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * @return builder
     */
    inline def restorePolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)
