package jp.ukiba.ko_pulumi
package aws

object accountaccess_ext:
  extension (builder: com.pulumi.aws.accountaccess.ApplicationArgs.Builder)
    /**
     * @param identitySource Identity source for the application. Forces replacement when changed. See `identitySource` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def identitySource(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder]):
        com.pulumi.aws.accountaccess.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.builder
      builder.identitySource(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.accountaccess.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.EntitlementArgs.Builder)
    /**
     * @param entitlement Entitlement configuration. See `entitlement` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def entitlement(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder]):
        com.pulumi.aws.accountaccess.EntitlementArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.builder
      builder.entitlement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder)
    /**
     * @param identityCenter IAM Identity Center instance to use as the identity source. See `identityCenter` Block below.
     * @return builder
     */
    inline def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceIdentityCenterArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceIdentityCenterArgs.builder
      builder.identityCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder)
    /**
     * @param identitySource Identity source for the application. Forces replacement when changed. See `identitySource` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def identitySource(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.builder
      builder.identitySource(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder)
    /**
     * @param principalRole Principal role entitlement configuration. See `entitlement.principal_role` Block below.
     * @return builder
     */
    inline def principalRole(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.builder
      builder.principalRole(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.Builder)
    /**
     * @param principal Principal configuration. See `entitlement.principal_role.principal` Block below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalArgs.Builder)
    /**
     * @param identityCenter IAM Identity Center principal configuration. See `entitlement.principal_role.principal.identity_center` Block below.
     * @return builder
     */
    inline def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalIdentityCenterArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalIdentityCenterArgs.builder
      builder.identityCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.EntitlementState.Builder)
    /**
     * @param entitlement Entitlement configuration. See `entitlement` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def entitlement(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.EntitlementState.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.builder
      builder.entitlement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsArgs.Builder)
    /**
     * @param filter Filter criteria to narrow the entitlements returned. You can filter by principal, IAM role, or account. See `filter` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilter.Builder)
    /**
     * @param principalRole principal-to-role filter criteria for narrowing entitlement results. See `filter.principal_role` Block below.
     * @return builder
     */
    inline def principalRole(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRole.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilter.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRole.builder
      builder.principalRole(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.Builder)
    /**
     * @param principalRole principal-to-role filter criteria for narrowing entitlement results. See `filter.principal_role` Block below.
     * @return builder
     */
    inline def principalRole(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.builder
      builder.principalRole(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRole.Builder)
    /**
     * @param principal principal to filter entitlements by. See `filter.principal_role.principal` Block below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipal.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRole.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipal.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.Builder)
    /**
     * @param principal principal to filter entitlements by. See `filter.principal_role.principal` Block below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipal.Builder)
    /**
     * @param identityCenter IAM Identity Center principal filter criteria. See `filter.principal_role.principal.identity_center` Block below.
     * @return builder
     */
    inline def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalIdentityCenter.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipal.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalIdentityCenter.builder
      builder.identityCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.Builder)
    /**
     * @param identityCenter IAM Identity Center principal filter criteria. See `filter.principal_role.principal.identity_center` Block below.
     * @return builder
     */
    inline def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalIdentityCenterArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalIdentityCenterArgs.builder
      builder.identityCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsPlainArgs.Builder)
    /**
     * @param filter Filter criteria to narrow the entitlements returned. You can filter by principal, IAM role, or account. See `filter` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilter.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilter.builder
      builder.filter(args(argsBuilder).build)
