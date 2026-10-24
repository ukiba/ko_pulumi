package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object verifiedpermissions:
  /** Resource for managing an AWS Verified Permissions Identity Source. */
  def IdentitySource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.builder
    com.pulumi.aws.verifiedpermissions.IdentitySource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Verified Permissions Policy. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyArgs.builder
    com.pulumi.aws.verifiedpermissions.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** This is a Terraform resource for managing an AWS Verified Permissions Policy Store. */
  def PolicyStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.verifiedpermissions.PolicyStore(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Verified Permissions Policy Template. */
  def PolicyTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs.builder
    com.pulumi.aws.verifiedpermissions.PolicyTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** This is a Terraform resource for managing an AWS Verified Permissions Policy Store Schema. */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.SchemaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.SchemaArgs.builder
    com.pulumi.aws.verifiedpermissions.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object VerifiedpermissionsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Verified Permissions Policy Store. */
    inline def getPolicyStore(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStoreArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.verifiedpermissions.outputs.GetPolicyStoreResult] =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStoreArgs.builder
      com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions.getPolicyStore(args(argsBuilder).build)

    /** Data source for managing an AWS Verified Permissions Policy Store. */
    inline def getPolicyStorePlain(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStorePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.verifiedpermissions.outputs.GetPolicyStoreResult] =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStorePlainArgs.builder
      com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions.getPolicyStorePlain(args(argsBuilder).build)
