package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object accountaccess:
  object AccountaccessFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Looks up an existing AWS Account Access Application. Lookup is by Application ARN or by IAM Identity Center instance ARN (one Application per instance). */
    inline def getApplication(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.accountaccess.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetApplicationArgs.builder
      com.pulumi.aws.accountaccess.AccountaccessFunctions.getApplication(args(argsBuilder).build)

    /** Looks up an existing AWS Account Access Application. Lookup is by Application ARN or by IAM Identity Center instance ARN (one Application per instance). */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.accountaccess.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.accountaccess.AccountaccessFunctions.getApplicationPlain(args(argsBuilder).build)

    /** Lists AWS Account Access Entitlements for a given Application. */
    inline def getEntitlements(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.accountaccess.outputs.GetEntitlementsResult] =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsArgs.builder
      com.pulumi.aws.accountaccess.AccountaccessFunctions.getEntitlements(args(argsBuilder).build)

    /** Lists AWS Account Access Entitlements for a given Application. */
    inline def getEntitlementsPlain(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.accountaccess.outputs.GetEntitlementsResult] =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsPlainArgs.builder
      com.pulumi.aws.accountaccess.AccountaccessFunctions.getEntitlementsPlain(args(argsBuilder).build)

  /**
   * Manages an AWS Account Access Application. An Application binds Account Access to an IAM Identity Center instance and serves as the parent container for entitlements that grant principals access to roles in target accounts.
   * 
   * &gt; **Note:** Only one Application may exist per IAM Identity Center instance. Attempting to create a second Application for the same instance produces an error directing you to import the existing resource.
   * 
   * &gt; **Note:** Granting access to roles in target accounts is done with `aws.accountaccess.Entitlement`. Each target role must trust the Account Access service in its `assumeRolePolicy` \u2014 see that resource&#39;s documentation for the required trust policy.
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.accountaccess.ApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.accountaccess.ApplicationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.accountaccess.Application(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.accountaccess.ApplicationArgs.Builder)
    /**
     * @param identitySource Identity source for the application. Forces replacement when changed. See `identitySource` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def identitySource(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder]):
        com.pulumi.aws.accountaccess.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.builder
      builder.identitySource(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.accountaccess.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS Account Access Entitlement. An Entitlement grants an IAM Identity Center principal the ability to assume a specific IAM role in a target AWS account through an Account Access Application.
   * 
   * &gt; **Note:** Entitlements are immutable. Changing `applicationArn` or `entitlement` triggers replacement.
   * 
   * &gt; **Note:** The IAM role referenced by `entitlement.principal_role.role_arn` must have a trust policy that allows the Account Access service to assume it. The role&#39;s `assumeRolePolicy` must grant `sts:AssumeRole`, `sts:SetContext`, and `sts:TagSession` to the `account-access.amazonaws.com` service principal. Without `sts:TagSession`, credential retrieval for the entitlement fails. See the Complete Example below.
   */
  def Entitlement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.accountaccess.EntitlementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.accountaccess.EntitlementArgs.builder
    com.pulumi.aws.accountaccess.Entitlement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.accountaccess.EntitlementArgs.Builder)
    /**
     * @param entitlement Entitlement configuration. See `entitlement` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def entitlement(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder]):
        com.pulumi.aws.accountaccess.EntitlementArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.builder
      builder.entitlement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder)
    /**
     * @param identityCenter IAM Identity Center instance to use as the identity source. See `identityCenter` Block below.
     * @return builder
     */
    def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceIdentityCenterArgs.Builder]):
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
    def identitySource(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.builder
      builder.identitySource(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder)
    /**
     * @param principalRole Principal role entitlement configuration. See `entitlement.principal_role` Block below.
     * @return builder
     */
    def principalRole(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.builder
      builder.principalRole(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.Builder)
    /**
     * @param principal Principal configuration. See `entitlement.principal_role.principal` Block below.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRoleArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalArgs.Builder)
    /**
     * @param identityCenter IAM Identity Center principal configuration. See `entitlement.principal_role.principal.identity_center` Block below.
     * @return builder
     */
    def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementPrincipalRolePrincipalIdentityCenterArgs.Builder]):
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
    def entitlement(args: Endofunction[com.pulumi.aws.accountaccess.inputs.EntitlementEntitlementArgs.Builder]):
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
    def filter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.Builder)
    /**
     * @param principalRole principal-to-role filter criteria for narrowing entitlement results. See `filter.principal_role` Block below.
     * @return builder
     */
    def principalRole(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.builder
      builder.principalRole(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.Builder)
    /**
     * @param principal principal to filter entitlements by. See `filter.principal_role.principal` Block below.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRoleArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.Builder)
    /**
     * @param identityCenter IAM Identity Center principal filter criteria. See `filter.principal_role.principal.identity_center` Block below.
     * @return builder
     */
    def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalIdentityCenterArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.GetEntitlementsFilterPrincipalRolePrincipalIdentityCenterArgs.builder
      builder.identityCenter(args(argsBuilder).build)
