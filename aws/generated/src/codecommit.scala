package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object codecommit:
  /** Provides a CodeCommit Approval Rule Template Resource. */
  def ApprovalRuleTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.ApprovalRuleTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codecommit.ApprovalRuleTemplateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.codecommit.ApprovalRuleTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates a CodeCommit Approval Rule Template with a Repository. */
  def ApprovalRuleTemplateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociationArgs.builder
    com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CodecommitFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about a specific CodeCommit Approval Rule Template. */
    inline def getApprovalRuleTemplate(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codecommit.outputs.GetApprovalRuleTemplateResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplateArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getApprovalRuleTemplate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific CodeCommit Approval Rule Template. */
    inline def getApprovalRuleTemplatePlain(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codecommit.outputs.GetApprovalRuleTemplateResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplatePlainArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getApprovalRuleTemplatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository. */
    inline def getRepository(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetRepositoryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codecommit.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetRepositoryArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getRepository(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository. */
    inline def getRepositoryPlain(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetRepositoryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codecommit.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetRepositoryPlainArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getRepositoryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a CodeCommit Repository Resource. */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.RepositoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codecommit.RepositoryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.codecommit.Repository(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CodeCommit Trigger Resource. */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.TriggerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codecommit.TriggerArgs.builder
    com.pulumi.aws.codecommit.Trigger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
