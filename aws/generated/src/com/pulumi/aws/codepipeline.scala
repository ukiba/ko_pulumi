package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object codepipeline:
  /** Provides a CodePipeline. */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codepipeline.PipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codepipeline.PipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codepipeline.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codepipeline.WebhookArgs.Builder)
    /**
     * @param authenticationConfiguration An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.codepipeline.WebhookArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param filters One or more `filter` blocks. Filter blocks are documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.codepipeline.inputs.WebhookFilterArgs.Builder]*):
        com.pulumi.aws.codepipeline.WebhookArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.WebhookFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  /** Provides a CodeDeploy CustomActionType */
  def CustomActionType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codepipeline.CustomActionTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codepipeline.CustomActionTypeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codepipeline.CustomActionType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codepipeline.CustomActionTypeArgs.Builder)
    /**
     * @param configurationProperties The configuration properties for the custom action. Max 10 items.
     * @return builder
     */
    def configurationProperties(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeConfigurationPropertyArgs.Builder]*):
        com.pulumi.aws.codepipeline.CustomActionTypeArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeConfigurationPropertyArgs.builder
      builder.configurationProperties(args.map(_(argsBuilder).build)*)

    def inputArtifactDetails(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeInputArtifactDetailsArgs.Builder]):
        com.pulumi.aws.codepipeline.CustomActionTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeInputArtifactDetailsArgs.builder
      builder.inputArtifactDetails(args(argsBuilder).build)

    def outputArtifactDetails(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeOutputArtifactDetailsArgs.Builder]):
        com.pulumi.aws.codepipeline.CustomActionTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeOutputArtifactDetailsArgs.builder
      builder.outputArtifactDetails(args(argsBuilder).build)

    def settings(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeSettingsArgs.Builder]):
        com.pulumi.aws.codepipeline.CustomActionTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  /** Provides a CodePipeline Webhook. */
  def Webhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codepipeline.WebhookArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codepipeline.WebhookArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codepipeline.Webhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codepipeline.PipelineArgs.Builder)
    /**
     * @param artifactStores One or more artifactStore blocks. Artifact stores are documented below.
     * @return builder
     */
    def artifactStores(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs.Builder]*):
        com.pulumi.aws.codepipeline.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs.builder
      builder.artifactStores(args.map(_(argsBuilder).build)*)

    /**
     * @param stages A stage block. Stages are documented below.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.Builder]*):
        com.pulumi.aws.codepipeline.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

    /**
     * @param triggers A trigger block. Valid only when `pipelineType` is `V2`. Triggers are documented below.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerArgs.Builder]*):
        com.pulumi.aws.codepipeline.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

    /**
     * @param variables A pipeline-level variable block. Valid only when `pipelineType` is `V2`. Variable are documented below.
     *  
     *  **Note:** `QUEUED` or `PARALLEL` mode can only be used with V2 pipelines.
     * @return builder
     */
    def variables(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineVariableArgs.Builder]*):
        com.pulumi.aws.codepipeline.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineVariableArgs.builder
      builder.variables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushArgs.Builder)
    /**
     * @param branches The field that specifies to filter on branches for the push trigger configuration. A `branches` block is documented below.
     * @return builder
     */
    def branches(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushBranchArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushBranchArgs.builder
      builder.branches(args.map(_(argsBuilder).build)*)

    /**
     * @param filePaths The field that specifies to filter on file paths for the push trigger configuration. A `filePaths` block is documented below.
     * @return builder
     */
    def filePaths(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushFilePathArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushFilePathArgs.builder
      builder.filePaths(args.map(_(argsBuilder).build)*)

    /**
     * @param tags The field that contains the details for the Git tags trigger configuration. A `tags` block is documented below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushTagArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationArgs.Builder)
    /**
     * @param pullRequests The field where the repository event that will start the pipeline is specified as pull requests. A `pullRequest` block is documented below.
     * @return builder
     */
    def pullRequests(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestArgs.builder
      builder.pullRequests(args.map(_(argsBuilder).build)*)

    /**
     * @param pushes The field where the repository event that will start the pipeline, such as pushing Git tags, is specified with details. A `push` block is documented below.
     * @return builder
     */
    def pushes(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPushArgs.builder
      builder.pushes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionRuleArgs.Builder)
    /**
     * @param ruleTypeId The ID for the rule type, which is made up of the combined values for `category`, `owner`, `provider`, and `version`. Defined as an `ruleTypeId` block below.
     * @return builder
     */
    def ruleTypeId(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionRuleRuleTypeIdArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionRuleRuleTypeIdArgs.builder
      builder.ruleTypeId(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionArgs.Builder)
    /**
     * @param rules The rules that make up the condition. Defined as a `rule` block below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionRuleArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionArgs.Builder)
    /**
     * @param rules The rules that make up the condition. Defined as a `rule` block below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionRuleArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushArgs.Builder)
    /**
     * @param branches The field that specifies to filter on branches for the push trigger configuration. A `branches` block is documented below.
     * @return builder
     */
    def branches(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushBranchesArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushBranchesArgs.builder
      builder.branches(args(argsBuilder).build)

    /**
     * @param filePaths The field that specifies to filter on file paths for the push trigger configuration. A `filePaths` block is documented below.
     * @return builder
     */
    def filePaths(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushFilePathsArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushFilePathsArgs.builder
      builder.filePaths(args(argsBuilder).build)

    /**
     * @param tags The field that contains the details for the Git tags trigger configuration. A `tags` block is documented below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushTagsArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationArgs.Builder)
    /**
     * @param pullRequests The field where the repository event that will start the pipeline is specified as pull requests. A `pullRequest` block is documented below.
     * @return builder
     */
    def pullRequests(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestArgs.builder
      builder.pullRequests(args.map(_(argsBuilder).build)*)

    /**
     * @param pushes The field where the repository event that will start the pipeline, such as pushing Git tags, is specified with details. A `push` block is documented below.
     * @return builder
     */
    def pushes(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPushArgs.builder
      builder.pushes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestArgs.Builder)
    /**
     * @param branches The field that specifies to filter on branches for the pull request trigger configuration. A `branches` block is documented below.
     * @return builder
     */
    def branches(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestBranchArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestBranchArgs.builder
      builder.branches(args.map(_(argsBuilder).build)*)

    /**
     * @param filePaths The field that specifies to filter on file paths for the pull request trigger configuration. A `filePaths` block is documented below.
     * @return builder
     */
    def filePaths(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestFilePathArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationPullRequestFilePathArgs.builder
      builder.filePaths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionArgs.Builder)
    /**
     * @param rules The rules that make up the condition. Defined as a `rule` block below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionRuleArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessArgs.Builder)
    /**
     * @param condition The conditions that are success conditions. Defined as a `condition` block below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionRuleArgs.Builder)
    /**
     * @param ruleTypeId The ID for the rule type, which is made up of the combined values for `category`, `owner`, `provider`, and `version`. Defined as an `ruleTypeId` block below.
     * @return builder
     */
    def ruleTypeId(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionRuleRuleTypeIdArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionRuleRuleTypeIdArgs.builder
      builder.ruleTypeId(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllArgs.Builder)
    /**
     * @param gitConfigurations Provides the filter criteria and the source stage for the repository event that starts the pipeline. For more information, refer to the [AWS documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-filter.html). A `gitConfiguration` block is documented below.
     * @return builder
     */
    def gitConfigurations(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllGitConfigurationArgs.builder
      builder.gitConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestArgs.Builder)
    /**
     * @param branches The field that specifies to filter on branches for the pull request trigger configuration. A `branches` block is documented below.
     * @return builder
     */
    def branches(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestBranchesArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestBranchesArgs.builder
      builder.branches(args(argsBuilder).build)

    /**
     * @param filePaths The field that specifies to filter on file paths for the pull request trigger configuration. A `filePaths` block is documented below.
     * @return builder
     */
    def filePaths(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestFilePathsArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationPullRequestFilePathsArgs.builder
      builder.filePaths(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineState.Builder)
    /**
     * @param artifactStores One or more artifactStore blocks. Artifact stores are documented below.
     * @return builder
     */
    def artifactStores(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs.builder
      builder.artifactStores(args.map(_(argsBuilder).build)*)

    /**
     * @param stages A stage block. Stages are documented below.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerAlls A list of all triggers present on the pipeline, including default triggers added by AWS for `V2` pipelines which omit an explicit `trigger` definition.
     * @return builder
     */
    def triggerAlls(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerAllArgs.builder
      builder.triggerAlls(args.map(_(argsBuilder).build)*)

    /**
     * @param triggers A trigger block. Valid only when `pipelineType` is `V2`. Triggers are documented below.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

    /**
     * @param variables A pipeline-level variable block. Valid only when `pipelineType` is `V2`. Variable are documented below.
     *  
     *  **Note:** `QUEUED` or `PARALLEL` mode can only be used with V2 pipelines.
     * @return builder
     */
    def variables(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineVariableArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineVariableArgs.builder
      builder.variables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureArgs.Builder)
    /**
     * @param condition The conditions that are failure conditions. Defined as a `condition` block below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param retryConfiguration The retry configuration specifies automatic retry for a failed stage, along with the configured retry mode. Defined as a `retryConfiguration` block below.
     * @return builder
     */
    def retryConfiguration(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureRetryConfigurationArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureRetryConfigurationArgs.builder
      builder.retryConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs.Builder)
    /**
     * @param encryptionKey The encryption key block AWS CodePipeline uses to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If you don&#39;t specify a key, AWS CodePipeline uses the default key for Amazon Simple Storage Service (Amazon S3). An `encryptionKey` block is documented below.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreEncryptionKeyArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionRuleArgs.Builder)
    /**
     * @param ruleTypeId The ID for the rule type, which is made up of the combined values for `category`, `owner`, `provider`, and `version`. Defined as an `ruleTypeId` block below.
     * @return builder
     */
    def ruleTypeId(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionRuleRuleTypeIdArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessConditionRuleRuleTypeIdArgs.builder
      builder.ruleTypeId(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.CustomActionTypeState.Builder)
    /**
     * @param configurationProperties The configuration properties for the custom action. Max 10 items.
     * @return builder
     */
    def configurationProperties(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeConfigurationPropertyArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.CustomActionTypeState.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeConfigurationPropertyArgs.builder
      builder.configurationProperties(args.map(_(argsBuilder).build)*)

    def inputArtifactDetails(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeInputArtifactDetailsArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.CustomActionTypeState.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeInputArtifactDetailsArgs.builder
      builder.inputArtifactDetails(args(argsBuilder).build)

    def outputArtifactDetails(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeOutputArtifactDetailsArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.CustomActionTypeState.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeOutputArtifactDetailsArgs.builder
      builder.outputArtifactDetails(args(argsBuilder).build)

    def settings(args: Endofunction[com.pulumi.aws.codepipeline.inputs.CustomActionTypeSettingsArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.CustomActionTypeState.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.CustomActionTypeSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.Builder)
    /**
     * @param actions The action(s) to include in the stage. Defined as an `action` block below
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageActionArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeEntry The method to use when a stage allows entry. For example, configuring this field for conditions will allow entry to the stage when the conditions are met.
     * @return builder
     */
    def beforeEntry(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryArgs.builder
      builder.beforeEntry(args(argsBuilder).build)

    /**
     * @param onFailure The method to use when a stage has not completed successfully. For example, configuring this field for rollback will roll back a failed stage automatically to the last successful pipeline execution in the stage.
     * @return builder
     */
    def onFailure(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnFailureArgs.builder
      builder.onFailure(args(argsBuilder).build)

    /**
     * @param onSuccess The method to use when a stage has succeeded. For example, configuring this field for conditions will allow the stage to succeed when the conditions are met.
     * @return builder
     */
    def onSuccess(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageOnSuccessArgs.builder
      builder.onSuccess(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.WebhookState.Builder)
    /**
     * @param authenticationConfiguration An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.WebhookState.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param filters One or more `filter` blocks. Filter blocks are documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.codepipeline.inputs.WebhookFilterArgs.Builder]*):
        com.pulumi.aws.codepipeline.inputs.WebhookState.Builder =
      def argsBuilder = com.pulumi.aws.codepipeline.inputs.WebhookFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryArgs.Builder)
    /**
     * @param condition The conditions that are configured as entry condition. Defined as a `condition` block below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineStageBeforeEntryConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codepipeline.inputs.PipelineTriggerArgs.Builder)
    /**
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository event that starts the pipeline. For more information, refer to the [AWS documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-filter.html). A `gitConfiguration` block is documented below.
     * @return builder
     */
    def gitConfiguration(args: Endofunction[com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationArgs.Builder]):
        com.pulumi.aws.codepipeline.inputs.PipelineTriggerArgs.Builder =
      val argsBuilder = com.pulumi.aws.codepipeline.inputs.PipelineTriggerGitConfigurationArgs.builder
      builder.gitConfiguration(args(argsBuilder).build)
