package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codecommit:
  /** Provides a CodeCommit Approval Rule Template Resource. */
  def ApprovalRuleTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.ApprovalRuleTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codecommit.ApprovalRuleTemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.codecommit.ApprovalRuleTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CodeCommit Repository Resource. */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.RepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codecommit.RepositoryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codecommit.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codecommit.TriggerArgs.Builder)
    /**
     * @param triggers The name of the trigger.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.Builder]*):
        com.pulumi.aws.codecommit.TriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

  /** Provides a CodeCommit Trigger Resource. */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.TriggerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codecommit.TriggerArgs.builder
    
    com.pulumi.aws.codecommit.Trigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CodecommitFunctions = com.pulumi.aws.codecommit.CodecommitFunctions
  object CodecommitFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.codecommit.CodecommitFunctions.*
  extension (self: CodecommitFunctions.type)
    /** Provides details about a specific CodeCommit Approval Rule Template. */
    def getApprovalRuleTemplate(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codecommit.outputs.GetApprovalRuleTemplateResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplateArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getApprovalRuleTemplate(args(argsBuilder).build)

    /** Provides details about a specific CodeCommit Approval Rule Template. */
    def getApprovalRuleTemplatePlain(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codecommit.outputs.GetApprovalRuleTemplateResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplatePlainArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getApprovalRuleTemplatePlain(args(argsBuilder).build)

    /** The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository. */
    def getRepository(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetRepositoryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codecommit.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetRepositoryArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getRepository(args(argsBuilder).build)

    /** The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository. */
    def getRepositoryPlain(args: Endofunction[com.pulumi.aws.codecommit.inputs.GetRepositoryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codecommit.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.aws.codecommit.inputs.GetRepositoryPlainArgs.builder
      com.pulumi.aws.codecommit.CodecommitFunctions.getRepositoryPlain(args(argsBuilder).build)

  /** Associates a CodeCommit Approval Rule Template with a Repository. */
  def ApprovalRuleTemplateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociationArgs.builder
    
    com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codecommit.inputs.TriggerState.Builder)
    /**
     * @param triggers The name of the trigger.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.Builder]*):
        com.pulumi.aws.codecommit.inputs.TriggerState.Builder =
      def argsBuilder = com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)
