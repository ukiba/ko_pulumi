package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudbuild:
  extension (builder: com.pulumi.gcp.cloudbuild.BitbucketServerConfigArgs.Builder)
    /**
     * @param connectedRepositories Connected Bitbucket Server repositories for this config.
     *  Structure is documented below.
     * @return builder
     */
    def connectedRepositories(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigConnectedRepositoryArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.BitbucketServerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigConnectedRepositoryArgs.builder
      builder.connectedRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets Secret Manager secrets needed by the config.
     *  Structure is documented below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigSecretsArgs.Builder]):
        com.pulumi.gcp.cloudbuild.BitbucketServerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigSecretsArgs.builder
      builder.secrets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.WorkerPoolArgs.Builder)
    /**
     * @param networkConfig Network configuration for the `WorkerPool`. Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.WorkerPoolNetworkConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.WorkerPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.WorkerPoolNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param privateServiceConnect Private Service Connect configuration for the pool.
     * @return builder
     */
    def privateServiceConnect(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.WorkerPoolPrivateServiceConnectArgs.Builder]):
        com.pulumi.gcp.cloudbuild.WorkerPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.WorkerPoolPrivateServiceConnectArgs.builder
      builder.privateServiceConnect(args(argsBuilder).build)

    /**
     * @param workerConfig Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
     * @return builder
     */
    def workerConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.WorkerPoolWorkerConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.WorkerPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.WorkerPoolWorkerConfigArgs.builder
      builder.workerConfig(args(argsBuilder).build)

  type CloudbuildFunctions = com.pulumi.gcp.cloudbuild.CloudbuildFunctions
  object CloudbuildFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.cloudbuild.CloudbuildFunctions.*
  extension (self: CloudbuildFunctions.type)
    /**
     * To get more information about Cloudbuild Trigger, see:
     * 
     *  * [API documentation](https://cloud.google.com/build/docs/api/reference/rest/v1/projects.triggers)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/build/docs/automating-builds/create-manage-triggers)
     */
    def getTrigger(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.GetTriggerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudbuild.outputs.GetTriggerResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.GetTriggerArgs.builder
      com.pulumi.gcp.cloudbuild.CloudbuildFunctions.getTrigger(args(argsBuilder).build)

    /**
     * To get more information about Cloudbuild Trigger, see:
     * 
     *  * [API documentation](https://cloud.google.com/build/docs/api/reference/rest/v1/projects.triggers)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/build/docs/automating-builds/create-manage-triggers)
     */
    def getTriggerPlain(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.GetTriggerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudbuild.outputs.GetTriggerResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.GetTriggerPlainArgs.builder
      com.pulumi.gcp.cloudbuild.CloudbuildFunctions.getTriggerPlain(args(argsBuilder).build)

  /** Definition of custom Cloud Build WorkerPools for running jobs with custom configuration and custom networking. */
  def WorkerPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuild.WorkerPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuild.WorkerPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuild.WorkerPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.TriggerArgs.Builder)
    /**
     * @param approvalConfig Configuration for manual approval to start a build invocation of this BuildTrigger.
     *  Builds created by this trigger will require approval before they execute.
     *  Any user with a Cloud Build Approver role for the project can approve a build.
     *  Structure is documented below.
     * @return builder
     */
    def approvalConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerApprovalConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerApprovalConfigArgs.builder
      builder.approvalConfig(args(argsBuilder).build)

    /**
     * @param bitbucketServerTriggerConfig BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     *  Structure is documented below.
     * @return builder
     */
    def bitbucketServerTriggerConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigArgs.builder
      builder.bitbucketServerTriggerConfig(args(argsBuilder).build)

    /**
     * @param build Contents of the build template. Either a filename or build template must be provided.
     *  Structure is documented below.
     * @return builder
     */
    def build(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.builder
      builder.build(args(argsBuilder).build)

    /**
     * @param developerConnectEventConfig Configuration for triggers that respond to Developer Connect events.
     *  Structure is documented below.
     * @return builder
     */
    def developerConnectEventConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigArgs.builder
      builder.developerConnectEventConfig(args(argsBuilder).build)

    /**
     * @param gitFileSource The file source describing the local or remote Build template.
     *  Structure is documented below.
     * @return builder
     */
    def gitFileSource(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerGitFileSourceArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerGitFileSourceArgs.builder
      builder.gitFileSource(args(argsBuilder).build)

    /**
     * @param github Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
     *  Structure is documented below.
     * @return builder
     */
    def github(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param pubsubConfig PubsubConfig describes the configuration of a trigger that creates
     *  a build whenever a Pub/Sub message is published.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerPubsubConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerPubsubConfigArgs.builder
      builder.pubsubConfig(args(argsBuilder).build)

    /**
     * @param repositoryEventConfig The configuration of a trigger that creates a build whenever an event from Repo API is received.
     *  Structure is documented below.
     * @return builder
     */
    def repositoryEventConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigArgs.builder
      builder.repositoryEventConfig(args(argsBuilder).build)

    /**
     * @param sourceToBuild The repo and ref of the repository from which to build.
     *  This field is used only for those triggers that do not respond to SCM events.
     *  Triggers that respond to such events build source at whatever commit caused the event.
     *  This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     *  Structure is documented below.
     * @return builder
     */
    def sourceToBuild(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerSourceToBuildArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerSourceToBuildArgs.builder
      builder.sourceToBuild(args(argsBuilder).build)

    /**
     * @param triggerTemplate Template describing the types of source changes to trigger a build.
     *  Branch and tag names in trigger templates are interpreted as regular
     *  expressions. Any branch or tag change that matches that regular
     *  expression will trigger a build.
     *  Structure is documented below.
     * @return builder
     */
    def triggerTemplate(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerTriggerTemplateArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerTriggerTemplateArgs.builder
      builder.triggerTemplate(args(argsBuilder).build)

    /**
     * @param webhookConfig WebhookConfig describes the configuration of a trigger that creates
     *  a build whenever a webhook is sent to a trigger&#39;s webhook URL.
     *  Structure is documented below.
     * @return builder
     */
    def webhookConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerWebhookConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerWebhookConfigArgs.builder
      builder.webhookConfig(args(argsBuilder).build)

  /**
   * BitbucketServerConfig represents the configuration for a Bitbucket Server.
   * 
   *  To get more information about BitbucketServerConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/build/docs/api/reference/rest/v1/projects.locations.bitbucketServerConfigs)
   *  * How-to Guides
   *      * [Connect to a Bitbucket Server host](https://cloud.google.com/build/docs/automating-builds/bitbucket/connect-host-bitbucket-server)
   */
  def BitbucketServerConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuild.BitbucketServerConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudbuild.BitbucketServerConfigArgs.builder
    com.pulumi.gcp.cloudbuild.BitbucketServerConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Configuration for an automated build in response to source repository changes.
   * 
   *  To get more information about Trigger, see:
   * 
   *  * [API documentation](https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.triggers)
   *  * How-to Guides
   *      * [Automating builds using build triggers](https://cloud.google.com/cloud-build/docs/running-builds/automate-builds)
   * 
   *  &gt; **Note:** You can retrieve the email of the Cloud Build Service Account used in jobs by using the `gcp.projects.ServiceIdentity` resource.
   */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuild.TriggerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuild.TriggerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuild.Trigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs.Builder)
    /**
     * @param mavenArtifacts A Maven artifact to upload to Artifact Registry upon successful completion of all build steps.
     *  The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field.
     *  If any objects fail to be pushed, the build is marked FAILURE.
     *  Structure is documented below.
     * @return builder
     */
    def mavenArtifacts(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsMavenArtifactArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsMavenArtifactArgs.builder
      builder.mavenArtifacts(args.map(_(argsBuilder).build)*)

    /**
     * @param npmPackages Npm package to upload to Artifact Registry upon successful completion of all build steps.
     *  The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field.
     *  If any objects fail to be pushed, the build is marked FAILURE.
     *  Structure is documented below.
     * @return builder
     */
    def npmPackages(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsNpmPackageArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsNpmPackageArgs.builder
      builder.npmPackages(args.map(_(argsBuilder).build)*)

    /**
     * @param objects A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps.
     *  Files in the workspace matching specified paths globs will be uploaded to the
     *  Cloud Storage location using the builder service account&#39;s credentials.
     *  The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field.
     *  If any objects fail to be pushed, the build is marked FAILURE.
     *  Structure is documented below.
     * @return builder
     */
    def objects(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsArgs.builder
      builder.objects(args(argsBuilder).build)

    /**
     * @param pythonPackages Python package to upload to Artifact Registry upon successful completion of all build steps. A package can encapsulate multiple objects to be uploaded to a single repository.
     *  The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field.
     *  If any objects fail to be pushed, the build is marked FAILURE.
     *  Structure is documented below.
     * @return builder
     */
    def pythonPackages(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsPythonPackageArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsPythonPackageArgs.builder
      builder.pythonPackages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsArgs.Builder)
    /**
     * @param volumes Global list of volumes to mount for ALL build steps
     *  Each volume is created as an empty volume prior to starting the build process.
     *  Upon completion of the build, volumes and their contents are discarded. Global
     *  volume names and paths cannot conflict with the volumes defined a build step.
     *  Using a global volume in a build with only one step is not valid as it is indicative
     *  of a build request with an incorrect configuration.
     *  Structure is documented below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder)
    /**
     * @param artifacts Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     *  Structure is documented below.
     * @return builder
     */
    def artifacts(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs.builder
      builder.artifacts(args(argsBuilder).build)

    /**
     * @param availableSecrets Secrets and secret environment variables.
     *  Structure is documented below.
     * @return builder
     */
    def availableSecrets(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsArgs.builder
      builder.availableSecrets(args(argsBuilder).build)

    /**
     * @param options Special options for this build.
     *  Structure is documented below.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param secrets Secrets to decrypt using Cloud Key Management Service.
     *  Structure is documented below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSecretArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param source The location of the source files to build.
     *  One of `storageSource` or `repoSource` must be provided.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param steps The operations to be performed on the workspace.
     *  Structure is documented below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder)
    /**
     * @param approvalConfig Configuration for manual approval to start a build invocation of this BuildTrigger.
     *  Builds created by this trigger will require approval before they execute.
     *  Any user with a Cloud Build Approver role for the project can approve a build.
     *  Structure is documented below.
     * @return builder
     */
    def approvalConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerApprovalConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerApprovalConfigArgs.builder
      builder.approvalConfig(args(argsBuilder).build)

    /**
     * @param bitbucketServerTriggerConfig BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     *  Structure is documented below.
     * @return builder
     */
    def bitbucketServerTriggerConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigArgs.builder
      builder.bitbucketServerTriggerConfig(args(argsBuilder).build)

    /**
     * @param build Contents of the build template. Either a filename or build template must be provided.
     *  Structure is documented below.
     * @return builder
     */
    def build(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs.builder
      builder.build(args(argsBuilder).build)

    /**
     * @param developerConnectEventConfig Configuration for triggers that respond to Developer Connect events.
     *  Structure is documented below.
     * @return builder
     */
    def developerConnectEventConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigArgs.builder
      builder.developerConnectEventConfig(args(argsBuilder).build)

    /**
     * @param gitFileSource The file source describing the local or remote Build template.
     *  Structure is documented below.
     * @return builder
     */
    def gitFileSource(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerGitFileSourceArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerGitFileSourceArgs.builder
      builder.gitFileSource(args(argsBuilder).build)

    /**
     * @param github Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
     *  Structure is documented below.
     * @return builder
     */
    def github(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param pubsubConfig PubsubConfig describes the configuration of a trigger that creates
     *  a build whenever a Pub/Sub message is published.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerPubsubConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerPubsubConfigArgs.builder
      builder.pubsubConfig(args(argsBuilder).build)

    /**
     * @param repositoryEventConfig The configuration of a trigger that creates a build whenever an event from Repo API is received.
     *  Structure is documented below.
     * @return builder
     */
    def repositoryEventConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigArgs.builder
      builder.repositoryEventConfig(args(argsBuilder).build)

    /**
     * @param sourceToBuild The repo and ref of the repository from which to build.
     *  This field is used only for those triggers that do not respond to SCM events.
     *  Triggers that respond to such events build source at whatever commit caused the event.
     *  This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     *  Structure is documented below.
     * @return builder
     */
    def sourceToBuild(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerSourceToBuildArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerSourceToBuildArgs.builder
      builder.sourceToBuild(args(argsBuilder).build)

    /**
     * @param triggerTemplate Template describing the types of source changes to trigger a build.
     *  Branch and tag names in trigger templates are interpreted as regular
     *  expressions. Any branch or tag change that matches that regular
     *  expression will trigger a build.
     *  Structure is documented below.
     * @return builder
     */
    def triggerTemplate(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerTriggerTemplateArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerTriggerTemplateArgs.builder
      builder.triggerTemplate(args(argsBuilder).build)

    /**
     * @param webhookConfig WebhookConfig describes the configuration of a trigger that creates
     *  a build whenever a webhook is sent to a trigger&#39;s webhook URL.
     *  Structure is documented below.
     * @return builder
     */
    def webhookConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerWebhookConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerWebhookConfigArgs.builder
      builder.webhookConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigArgs.Builder)
    /**
     * @param pullRequest Filter to match changes in pull requests.
     *  Structure is documented below.
     * @return builder
     */
    def pullRequest(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigPullRequestArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigPullRequestArgs.builder
      builder.pullRequest(args(argsBuilder).build)

    /**
     * @param push Filter to match changes in refs like branches and tags.
     *  Structure is documented below.
     * @return builder
     */
    def push(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigPushArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerDeveloperConnectEventConfigPushArgs.builder
      builder.push(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs.Builder)
    /**
     * @param pullRequest filter to match changes in pull requests. Specify only one of `pullRequest` or `push`.
     *  Structure is documented below.
     * @return builder
     */
    def pullRequest(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerGithubPullRequestArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerGithubPullRequestArgs.builder
      builder.pullRequest(args(argsBuilder).build)

    /**
     * @param push filter to match changes in refs, like branches or tags. Specify only one of `pullRequest` or `push`.
     *  Structure is documented below.
     * @return builder
     */
    def push(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerGithubPushArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerGithubPushArgs.builder
      builder.push(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigArgs.Builder)
    /**
     * @param pullRequest Filter to match changes in pull requests.
     *  Structure is documented below.
     * @return builder
     */
    def pullRequest(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigPullRequestArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigPullRequestArgs.builder
      builder.pullRequest(args(argsBuilder).build)

    /**
     * @param push Filter to match changes in refs like branches, tags.
     *  Structure is documented below.
     * @return builder
     */
    def push(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigPushArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBitbucketServerTriggerConfigPushArgs.builder
      builder.push(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigArgs.Builder)
    /**
     * @param pullRequest Contains filter properties for matching Pull Requests.
     *  Structure is documented below.
     * @return builder
     */
    def pullRequest(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigPullRequestArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigPullRequestArgs.builder
      builder.pullRequest(args(argsBuilder).build)

    /**
     * @param push Contains filter properties for matching git pushes.
     *  Structure is documented below.
     * @return builder
     */
    def push(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigPushArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigPushArgs.builder
      builder.push(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsArgs.Builder)
    /**
     * @param secretManagers Pairs a secret environment variable with a SecretVersion in Secret Manager.
     *  Structure is documented below.
     * @return builder
     */
    def secretManagers(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsSecretManagerArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsSecretManagerArgs.builder
      builder.secretManagers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigState.Builder)
    /**
     * @param connectedRepositories Connected Bitbucket Server repositories for this config.
     *  Structure is documented below.
     * @return builder
     */
    def connectedRepositories(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigConnectedRepositoryArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigConnectedRepositoryArgs.builder
      builder.connectedRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets Secret Manager secrets needed by the config.
     *  Structure is documented below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigSecretsArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.BitbucketServerConfigSecretsArgs.builder
      builder.secrets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.WorkerPoolState.Builder)
    /**
     * @param networkConfig Network configuration for the `WorkerPool`. Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.WorkerPoolNetworkConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.WorkerPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.WorkerPoolNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param privateServiceConnect Private Service Connect configuration for the pool.
     * @return builder
     */
    def privateServiceConnect(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.WorkerPoolPrivateServiceConnectArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.WorkerPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.WorkerPoolPrivateServiceConnectArgs.builder
      builder.privateServiceConnect(args(argsBuilder).build)

    /**
     * @param workerConfig Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
     * @return builder
     */
    def workerConfig(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.WorkerPoolWorkerConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.WorkerPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.WorkerPoolWorkerConfigArgs.builder
      builder.workerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsArgs.Builder)
    /**
     * @param timings (Output)
     *  Output only. Stores timing information for pushing all artifact objects.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedBuildArtifactsObjectsTiming&#34;&gt;&lt;/a&gt;The `timing` block contains:
     * @return builder
     */
    def timings(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsTimingArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsTimingArgs.builder
      builder.timings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepArgs.Builder)
    /**
     * @param volumes List of volumes to mount into the build step.
     *  Each volume is created as an empty volume prior to execution of the
     *  build step. Upon completion of the build, volumes and their contents
     *  are discarded.
     *  Using a named volume in only one step is not valid as it is
     *  indicative of a build request with an incorrect configuration.
     *  Structure is documented below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceArgs.Builder)
    /**
     * @param repoSource Location of the source in a Google Cloud Source Repository.
     *  Structure is documented below.
     * @return builder
     */
    def repoSource(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceRepoSourceArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceRepoSourceArgs.builder
      builder.repoSource(args(argsBuilder).build)

    /**
     * @param storageSource Location of the source in an archive file in Google Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def storageSource(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceStorageSourceArgs.Builder]):
        com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceStorageSourceArgs.builder
      builder.storageSource(args(argsBuilder).build)
