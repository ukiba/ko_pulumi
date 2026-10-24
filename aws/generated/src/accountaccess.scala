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
