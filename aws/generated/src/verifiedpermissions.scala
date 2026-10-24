package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object verifiedpermissions:
  /** Resource for managing an AWS Verified Permissions Identity Source. */
  def IdentitySource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.IdentitySourceArgs.builder
    com.pulumi.aws.verifiedpermissions.IdentitySource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Verified Permissions Policy. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyArgs.builder
    com.pulumi.aws.verifiedpermissions.Policy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** This is a Terraform resource for managing an AWS Verified Permissions Policy Store. */
  def PolicyStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyStoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Verified Permissions Policy Template. */
  def PolicyTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs.builder
    com.pulumi.aws.verifiedpermissions.PolicyTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** This is a Terraform resource for managing an AWS Verified Permissions Policy Store Schema. */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedpermissions.SchemaArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.verifiedpermissions.SchemaArgs.builder
    com.pulumi.aws.verifiedpermissions.Schema(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object VerifiedpermissionsFunctions:
    /** Data source for managing an AWS Verified Permissions Policy Store. */
    inline def getPolicyStore(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStoreArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.verifiedpermissions.outputs.GetPolicyStoreResult] =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStoreArgs.builder
      com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions.getPolicyStore(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Verified Permissions Policy Store. */
    inline def getPolicyStorePlain(args: Endofunction[com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStorePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.verifiedpermissions.outputs.GetPolicyStoreResult] =
      val argsBuilder = com.pulumi.aws.verifiedpermissions.inputs.GetPolicyStorePlainArgs.builder
      com.pulumi.aws.verifiedpermissions.VerifiedpermissionsFunctions.getPolicyStorePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
