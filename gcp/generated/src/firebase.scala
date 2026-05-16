package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object firebase:
  /**
   * A `Version` is a configuration which determine how a site is displayed. Static files are not supported at the moment.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Version, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/sites.versions)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingVersionArgs.builder
    com.pulumi.gcp.firebase.HostingVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A resource that manages the lock state of a PromptTemplate.
   *  When this resource is created, the template is locked.
   *  When this resource is deleted, the template is unlocked.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def AiLogicPromptTemplateLock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AiLogicPromptTemplateLockArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AiLogicPromptTemplateLockArgs.builder
    com.pulumi.gcp.firebase.AiLogicPromptTemplateLock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A single build for a backend, at a specific point codebase reference tag
   *  and point in time. Encapsulates several resources, including an Artifact Registry
   *  container image, a Cloud Build invocation that built the image, and the
   *  Cloud Run revision that uses that image.
   */
  def AppHostingBuild(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingBuildArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingBuildArgs.builder
    com.pulumi.gcp.firebase.AppHostingBuild(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Custom Domains for Firebase Hosting. Custom Domains link your
   *  domain names with Firebase Hosting sites, allowing Hosting to serve content
   *  on those domain names.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about CustomDomain, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/projects.sites.customDomains)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingCustomDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingCustomDomainArgs.builder
    com.pulumi.gcp.firebase.HostingCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An association between a Firebase project and a Google Cloud Storage bucket.
   *  This association enables integration of Cloud Storage buckets with Firebase such as Firebase SDKS, Authentication, and Security Rules.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Bucket, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/rest/storage/rest/v1beta/projects.buckets)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/storage/)
   */
  def StorageBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.StorageBucketArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.StorageBucketArgs.builder
    com.pulumi.gcp.firebase.StorageBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An app&#39;s App Attest configuration object. Note that the Team ID registered with your
   *  app is used as part of the validation process. Make sure your `gcp.firebase.AppleApp` has a teamId present.
   * 
   *  To get more information about AppAttestConfig, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.appAttestConfig)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckAppAttestConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckAppAttestConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckAppAttestConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckAppAttestConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Firebase web application instance
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about WebApp, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/)
   */
  def WebApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.WebAppArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.WebAppArgs.builder
    com.pulumi.gcp.firebase.WebApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A Backend is the primary resource of App Hosting. */
  def AppHostingBackend(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingBackendArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingBackendArgs.builder
    com.pulumi.gcp.firebase.AppHostingBackend(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A domain name that is associated with a backend. */
  def AppHostingDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingDomainArgs.builder
    com.pulumi.gcp.firebase.AppHostingDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Configuration for Firebase AI Logic.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Config, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/ai-logic/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/ai-logic)
   * 
   *  &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `generative_language_config.api_key_wo`.
   *  Read more about Write-only Arguments.
   */
  def AiLogicConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AiLogicConfigArgs.builder
    com.pulumi.gcp.firebase.AiLogicConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Firebase Apple application instance
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about AppleApp, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/ios/setup)
   */
  def AppleApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppleAppArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppleAppArgs.builder
    com.pulumi.gcp.firebase.AppleApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingBackendArgs.Builder)
    /**
     * @param codebase The connection to an external source repository to watch for event-driven
     *  updates to the backend.
     *  Structure is documented below.
     * @return builder
     */
    def codebase(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingBackendArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.builder
      builder.codebase(args(argsBuilder).build)

  /**
   * An app&#39;s DeviceCheck configuration object. Note that the Team ID registered with your
   *  app is used as part of the validation process. Make sure your `gcp.firebase.AppleApp` has a teamId present.
   * 
   *  To get more information about DeviceCheckConfig, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.deviceCheckConfig)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckDeviceCheckConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckDeviceCheckConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckDeviceCheckConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckDeviceCheckConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A debug token is a secret used during the development or integration testing of
   *  an app. It essentially allows the development or integration testing to bypass
   *  app attestation while still allowing App Check to enforce protection on supported
   *  production Firebase services.
   * 
   *  To get more information about DebugToken, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.debugTokens)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckDebugToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckDebugTokenArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckDebugTokenArgs.builder
    com.pulumi.gcp.firebase.AppCheckDebugToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Firebase Realtime Database instance.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/rest/database/database-management/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/products/realtime-database)
   */
  def DatabaseInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.DatabaseInstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.DatabaseInstanceArgs.builder
    com.pulumi.gcp.firebase.DatabaseInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * App Check enforcement policy for a specific resource of a Google service supported by App Check. Note that this policy will override the service-level configuration.
   * 
   *  To get more information about ResourcePolicy, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.services.resourcePolicies)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckResourcePolicyArgs.builder
    com.pulumi.gcp.firebase.AppCheckResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A resource that manages the creation of the default Google Cloud Storage bucket
   *  for a Firebase project.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about DefaultBucket, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/rest/storage/rest/v1alpha/projects.defaultBucket)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/storage/)
   */
  def StorageDefaultBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.StorageDefaultBucketArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.StorageDefaultBucketArgs.builder
    com.pulumi.gcp.firebase.StorageDefaultBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The PromptTemplate resource for Firebase AI Logic.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about PromptTemplate, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/ai-logic/rest/v1beta/projects.locations.templates)
   *  * How-to Guides
   *      * [Get started with server prompt templates](https://firebase.google.com/docs/ai-logic/server-prompt-templates/get-started)
   *      * [Product documentation for Firebase AI Logic](https://firebase.google.com/docs/ai-logic)
   *      * [Specification for Dotprompt format](https://google.github.io/dotprompt/getting-started)
   */
  def AiLogicPromptTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AiLogicPromptTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AiLogicPromptTemplateArgs.builder
    com.pulumi.gcp.firebase.AiLogicPromptTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A `Channel` represents a stream of releases for a site. All sites have a default
   *  `live` channel that serves content to the Firebase-provided subdomains and any
   *  connected custom domains.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Channel, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/sites.channels)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingChannelArgs.builder
    com.pulumi.gcp.firebase.HostingChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Firebase Data Connect service.
   * 
   *  To get more information about Service, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/data-connect/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/data-connect)
   */
  def DataConnectService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.DataConnectServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.DataConnectServiceArgs.builder
    com.pulumi.gcp.firebase.DataConnectService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder)
    /**
     * @param generativeLanguageConfig Configuration for using the Gemini Developer API via Firebase AI Logic.
     *  When using the Gemini Developer API via Firebase AI Logic, a separate Gemini
     *  API key is stored in this configuration *on the server* so that you do
     *  **not** add your Gemini API key directly into your app&#39;s codebase.
     *  Structure is documented below.
     * @return builder
     */
    def generativeLanguageConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.Builder]):
        com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.builder
      builder.generativeLanguageConfig(args(argsBuilder).build)

    /**
     * @param telemetryConfig Configuration for telemetry.
     *  Telemetry is the collection of metrics, logs, and traces recorded by the
     *  Firebase AI Logic backend.
     *  Structure is documented below.
     * @return builder
     */
    def telemetryConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.Builder]):
        com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.builder
      builder.telemetryConfig(args(argsBuilder).build)

    /**
     * @param trafficFilter Configuration for traffic filtering.
     *  Structure is documented below.
     * @return builder
     */
    def trafficFilter(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.Builder]):
        com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.builder
      builder.trafficFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingBuildArgs.Builder)
    /**
     * @param source The source for the build.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingBuildArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder)
    /**
     * @param conditions A list of conditions in descending order by priority.
     *  The values of the condition names must be unique.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.Builder]*):
        com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterGroups Map of parameter group names to their descriptions and grouped parameters.
     *  A group&#39;s name is mutable but must be unique among groups in the config.
     *  The name is limited to 256 characters and intended to be human-readable.
     *  Any Unicode characters are allowed.
     *  Groups have a list of parameters which allows users of the API to group
     *  parameters that are associated with the same feature or theme together for
     *  easy organizational access.
     *  For example, a parameter group with the name &#34;Search V2&#34; may have the
     *  `description` &#34;New mobile search view&#34; and contain parameters for the new
     *  search&#39;s layout and font.
     *  Structure is documented below.
     * @return builder
     */
    def parameterGroups(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder]*):
        com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.builder
      builder.parameterGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Map of parameter keys to their optional default values and optional
     *  conditional values.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder]*):
        com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  /**
   * A RemoteConfig represents a Remote Config template.
   * 
   *  To get more information about RemoteConfig, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/remote-config/rest/v1/projects/getRemoteConfig)
   *  * How-to Guides
   *      * [Remote Config Introduction](https://firebase.google.com/docs/remote-config)
   */
  def RemoteConfigRemoteConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.builder
    com.pulumi.gcp.firebase.RemoteConfigRemoteConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebase.HostingVersionArgs.Builder)
    /**
     * @param config The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder]):
        com.pulumi.gcp.firebase.HostingVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.builder
      builder.config(args(argsBuilder).build)

  /**
   * A Release is a particular collection of configurations that is set to be public at a particular time.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Release, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/sites.releases)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingRelease(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingReleaseArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingReleaseArgs.builder
    com.pulumi.gcp.firebase.HostingRelease(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebase.ExtensionsInstanceArgs.Builder)
    /**
     * @param config The current Config of the Extension Instance.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.Builder]):
        com.pulumi.gcp.firebase.ExtensionsInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  /**
   * An app&#39;s Play Integrity configuration object. Note that your registered SHA-256 certificate fingerprints are used to validate tokens issued by the Play Integrity API.
   *  Make sure your `gcp.firebase.AndroidApp` has at least one `sha256Hashes` present.
   * 
   *  To get more information about PlayIntegrityConfig, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.playIntegrityConfig)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckPlayIntegrityConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckPlayIntegrityConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckPlayIntegrityConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckPlayIntegrityConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object FirebaseFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * A Google Cloud Firebase Admin SDK configuration
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  To get more information about AdminSdkConfig, see:
     * 
     *  * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects/getAdminSdkConfig)
     *  * How-to Guides
     *      * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAdminSdkConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAdminSdkConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAdminSdkConfig(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Admin SDK configuration
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  To get more information about AdminSdkConfig, see:
     * 
     *  * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects/getAdminSdkConfig)
     *  * How-to Guides
     *      * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAdminSdkConfigPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAdminSdkConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAdminSdkConfigPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Android application instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getAndroidApp(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAndroidAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAndroidAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAndroidAppArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAndroidApp(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Android application instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getAndroidAppPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAndroidAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAndroidAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAndroidAppPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAndroidAppPlain(args(argsBuilder).build)

    inline def getAndroidAppConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAndroidAppConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAndroidAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAndroidAppConfigArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAndroidAppConfig(args(argsBuilder).build)

    inline def getAndroidAppConfigPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAndroidAppConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAndroidAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAndroidAppConfigPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAndroidAppConfigPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Apple application instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getAppleApp(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAppleAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleApp(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Apple application instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getAppleAppPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAppleAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleAppPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Apple application configuration
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  To get more information about iosApp, see:
     * 
     *  * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.iosApps)
     *  * How-to Guides
     *      * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAppleAppConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAppleAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppConfigArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleAppConfig(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Apple application configuration
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  To get more information about iosApp, see:
     * 
     *  * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.iosApps)
     *  * How-to Guides
     *      * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAppleAppConfigPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAppleAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppConfigPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleAppConfigPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Hosting Channel instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getHostingChannel(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetHostingChannelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetHostingChannelResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetHostingChannelArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getHostingChannel(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Hosting Channel instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getHostingChannelPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetHostingChannelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetHostingChannelResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetHostingChannelPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getHostingChannelPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getWebApp(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetWebAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebApp(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application instance
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getWebAppPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetWebAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebAppPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application configuration
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  To get more information about WebApp, see:
     * 
     *  * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps)
     *  * How-to Guides
     *      * [Official Documentation](https://firebase.google.com/)
     */
    inline def getWebAppConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetWebAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppConfigArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebAppConfig(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application configuration
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  To get more information about WebApp, see:
     * 
     *  * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps)
     *  * How-to Guides
     *      * [Official Documentation](https://firebase.google.com/)
     */
    inline def getWebAppConfigPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetWebAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppConfigPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebAppConfigPlain(args(argsBuilder).build)

  /** A domain name that is associated with a backend. */
  def AppHostingDefaultDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingDefaultDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingDefaultDomainArgs.builder
    com.pulumi.gcp.firebase.AppHostingDefaultDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Firebase instance. This enables Firebase resources on a given Google Project.
   *  Since a FirebaseProject is actually also a GCP Project, a FirebaseProject uses underlying GCP
   *  identifiers (most importantly, the projectId) as its own for easy interop with GCP APIs.
   *  Once Firebase has been added to a Google Project it cannot be removed.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Project, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects)
   *  * How-to Guides
   *      * Official Documentation
   * 
   *  &gt; **Note:** This resource should usually be used with a provider configuration
   *  with `userProjectOverride = true` unless you wish for your quota
   *  project to be different from the Firebase project.
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.ProjectArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.ProjectArgs.builder
    com.pulumi.gcp.firebase.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An app&#39;s reCAPTCHA Enterprise configuration object.
   * 
   *  To get more information about RecaptchaEnterpriseConfig, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.recaptchaEnterpriseConfig)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckRecaptchaEnterpriseConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingDomainArgs.Builder)
    /**
     * @param serve The serving behavior of the domain. If specified, the domain will
     *  serve content other than its Backend&#39;s live content.
     *  Structure is documented below.
     * @return builder
     */
    def serve(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingDomainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.builder
      builder.serve(args(argsBuilder).build)

  /**
   * The enforcement configuration for a service supported by App Check.
   * 
   *  To get more information about ServiceConfig, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.services)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckServiceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckServiceConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckServiceConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckServiceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An app&#39;s reCAPTCHA V3 configuration object.
   * 
   *  To get more information about RecaptchaV3Config, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.recaptchaV3Config)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckRecaptchaV3Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckRecaptchaV3ConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckRecaptchaV3ConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckRecaptchaV3Config(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Firebase Android application instance
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about AndroidApp, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/android/setup)
   */
  def AndroidApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AndroidAppArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AndroidAppArgs.builder
    com.pulumi.gcp.firebase.AndroidApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A `Site` represents a Firebase Hosting site.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Site, see:
   * 
   *  * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/projects.sites)
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingSiteArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingSiteArgs.builder
    com.pulumi.gcp.firebase.HostingSite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An Instance is an installation of an Extension into a user&#39;s project.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Instance, see:
   *  * How-to Guides
   *      * [Official Documentation](https://firebase.google.com/products/extensions)
   */
  def ExtensionsInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.ExtensionsInstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.ExtensionsInstanceArgs.builder
    com.pulumi.gcp.firebase.ExtensionsInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder)
    /**
     * @param rolloutPolicy The policy for how builds and rollouts are triggered and rolled out.
     *  Structure is documented below.
     * @return builder
     */
    def rolloutPolicy(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.builder
      builder.rolloutPolicy(args(argsBuilder).build)

    /**
     * @param target Set to manually control the desired traffic for the backend. This will
     *  cause current to eventually match this value. The percentages must add
     *  up to 100.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /** Controls traffic configuration for a backend. */
  def AppHostingTraffic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingTrafficArgs.builder
    com.pulumi.gcp.firebase.AppHostingTraffic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder)
    /**
     * @param certs The SSL certificate Hosting has for this `CustomDomain`&#39;s domain name.
     *  For new `CustomDomain`s, this often represents Hosting&#39;s intent to create
     *  a certificate, rather than an actual cert. Check the `state` field for
     *  more.
     *  Structure is documented below.
     * @return builder
     */
    def certs(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.builder
      builder.certs(args.map(_(argsBuilder).build)*)

    /**
     * @param issues A set of errors Hosting systems encountered when trying to establish
     *  Hosting&#39;s ability to serve secure content for your domain name. Resolve
     *  these issues to ensure your `CustomDomain` behaves properly.
     *  Structure is documented below.
     * @return builder
     */
    def issues(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainIssueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainIssueArgs.builder
      builder.issues(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDnsUpdates A set of updates you should make to the domain name&#39;s DNS records to
     *  let Hosting serve secure content on its behalf.
     *  Structure is documented below.
     * @return builder
     */
    def requiredDnsUpdates(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.builder
      builder.requiredDnsUpdates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingVersionState.Builder)
    /**
     * @param config The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder)
    /**
     * @param issues (Output)
     *  A list of issues with domain configuration. Allows users to self-correct
     *  problems with DNS records.
     *  Structure is documented below.
     * @return builder
     */
    def issues(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusIssueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusIssueArgs.builder
      builder.issues(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDnsUpdates (Output)
     *  Lists the records that must added or removed to a custom domain&#39;s DNS
     *  in order to finish setup and start serving content.
     *  Field is present during onboarding. Also present after onboarding if one
     *  or more of the above states is not *_ACTIVE, indicating the domain&#39;s DNS
     *  records are in a bad state.
     *  Structure is documented below.
     * @return builder
     */
    def requiredDnsUpdates(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.builder
      builder.requiredDnsUpdates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder)
    /**
     * @param fatalError The fatal error state for the extension instance
     *  Structure is documented below.
     * @return builder
     */
    def fatalError(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataFatalErrorArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataFatalErrorArgs.builder
      builder.fatalError(args(argsBuilder).build)

    /**
     * @param processingState The processing state for the extension instance
     *  Structure is documented below.
     * @return builder
     */
    def processingState(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataProcessingStateArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataProcessingStateArgs.builder
      builder.processingState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBuildState.Builder)
    /**
     * @param errors The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildErrorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param source The source for the build.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder)
    /**
     * @param headers An array of objects, where each object specifies a URL pattern that, if matched to the request URL path,
     *  triggers Hosting to apply the specified custom response headers.
     *  Structure is documented below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigHeaderArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param redirects An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path,
     *  triggers Hosting to respond with a redirect to the specified destination path.
     *  Structure is documented below.
     * @return builder
     */
    def redirects(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigRedirectArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigRedirectArgs.builder
      builder.redirects(args.map(_(argsBuilder).build)*)

    /**
     * @param rewrites An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the
     *  request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
     *  Structure is documented below.
     * @return builder
     */
    def rewrites(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder)
    /**
     * @param redirect Specifies redirect behavior for a domain.
     *  Structure is documented below.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainServeRedirectArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainServeRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.StorageDefaultBucketState.Builder)
    /**
     * @param buckets The resource name of the underlying Google Cloud Storage bucket.
     *  Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.firebase.inputs.StorageDefaultBucketBucketArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.StorageDefaultBucketState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.StorageDefaultBucketBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder)
    /**
     * @param dns A `TXT` record to add to your DNS records that confirms your intent to
     *  let Hosting create an SSL cert for your domain name.
     *  Structure is documented below.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param http A file to add to your existing, non-Hosting hosting service that confirms
     *  your intent to let Hosting create an SSL cert for your domain name.
     *  Structure is documented below.
     * @return builder
     */
    def http(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationHttpArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationHttpArgs.builder
      builder.http(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder)
    /**
     * @param desireds A text string to serve at the path.
     * @return builder
     */
    def desireds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.builder
      builder.desireds(args.map(_(argsBuilder).build)*)

    /**
     * @param discovereds Whether Hosting was able to find the required file contents on the
     *  specified path during its last check.
     * @return builder
     */
    def discovereds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.builder
      builder.discovereds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder)
    /**
     * @param generativeLanguageConfig Configuration for using the Gemini Developer API via Firebase AI Logic.
     *  When using the Gemini Developer API via Firebase AI Logic, a separate Gemini
     *  API key is stored in this configuration *on the server* so that you do
     *  **not** add your Gemini API key directly into your app&#39;s codebase.
     *  Structure is documented below.
     * @return builder
     */
    def generativeLanguageConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.builder
      builder.generativeLanguageConfig(args(argsBuilder).build)

    /**
     * @param telemetryConfig Configuration for telemetry.
     *  Telemetry is the collection of metrics, logs, and traces recorded by the
     *  Firebase AI Logic backend.
     *  Structure is documented below.
     * @return builder
     */
    def telemetryConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.builder
      builder.telemetryConfig(args(argsBuilder).build)

    /**
     * @param trafficFilter Configuration for traffic filtering.
     *  Structure is documented below.
     * @return builder
     */
    def trafficFilter(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.builder
      builder.trafficFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder)
    /**
     * @param checkErrors (Output)
     *  The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def checkErrors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredCheckErrorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredCheckErrorArgs.builder
      builder.checkErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param records (Output)
     *  Records on the domain.
     *  Structure is documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder)
    /**
     * @param conditionalValues The conditionName of the highest priority
     *  (the one listed first in the RemoteConfig&#39;s conditions list) determines
     *  the value of this parameter.
     *  Only one of useInAppDefault or value may be specified.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalValues(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterConditionalValueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterConditionalValueArgs.builder
      builder.conditionalValues(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultValue Value to set the parameter to, when none of the named conditions evaluate to true.
     *  Only one of useInAppDefault or value may be specified.
     *  Structure is documented below.
     * @return builder
     */
    def defaultValue(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterDefaultValueArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterDefaultValueArgs.builder
      builder.defaultValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder)
    /**
     * @param parameters Map of parameter keys to their optional default values and optional
     *  conditional values for parameters that belong to this group.
     *  A parameter only appears once per RemoteConfig: an ungrouped parameter
     *  appears at the top level; a parameter organized within a group appears
     *  within its group&#39;s map of parameters.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.Builder)
    /**
     * @param records Records on the domain
     *  Structure is documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder)
    /**
     * @param checkErrors (Output)
     *  The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def checkErrors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredCheckErrorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredCheckErrorArgs.builder
      builder.checkErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param records (Output)
     *  Records on the domain.
     *  Structure is documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBackendState.Builder)
    /**
     * @param codebase The connection to an external source repository to watch for event-driven
     *  updates to the backend.
     *  Structure is documented below.
     * @return builder
     */
    def codebase(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBackendState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.builder
      builder.codebase(args(argsBuilder).build)

    /**
     * @param managedResources A list of the resources managed by this backend.
     *  Structure is documented below.
     * @return builder
     */
    def managedResources(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBackendState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.builder
      builder.managedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainState.Builder)
    /**
     * @param customDomainStatuses The status of a custom domain&#39;s linkage to the Backend.
     *  Structure is documented below.
     * @return builder
     */
    def customDomainStatuses(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.builder
      builder.customDomainStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param serve The serving behavior of the domain. If specified, the domain will
     *  serve content other than its Backend&#39;s live content.
     *  Structure is documented below.
     * @return builder
     */
    def serve(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.builder
      builder.serve(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder)
    /**
     * @param config The current Config of the Extension Instance.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param errorStatuses If this Instance has `state: ERRORED`, the error messages
     *  will be found here.
     *  Structure is documented below.
     * @return builder
     */
    def errorStatuses(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceErrorStatusArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceErrorStatusArgs.builder
      builder.errorStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param runtimeDatas Data set by the extension instance at runtime.
     *  Structure is documented below.
     * @return builder
     */
    def runtimeDatas(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.builder
      builder.runtimeDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.Builder)
    /**
     * @param updateUsers (Output)
     *  All the fields associated with the person/service account that wrote a
     *  Remote Config template.
     *  Structure is documented below.
     * @return builder
     */
    def updateUsers(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionUpdateUserArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionUpdateUserArgs.builder
      builder.updateUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.Builder)
    /**
     * @param splits (Output)
     *  A list of traffic splits that together represent where traffic is being routed.
     *  Structure is documented below.
     * @return builder
     */
    def splits(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentSplitArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentSplitArgs.builder
      builder.splits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.Builder)
    /**
     * @param run The request will be forwarded to Cloud Run.
     *  Structure is documented below.
     * @return builder
     */
    def run(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteRunArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteRunArgs.builder
      builder.run(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.Builder)
    /**
     * @param records Records on the domain
     *  Structure is documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.Builder)
    /**
     * @param runServices (Output)
     *  A managed Cloud Run
     *  [`service`](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services#resource:-service).
     *  Structure is documented below.
     * @return builder
     */
    def runServices(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceRunServiceArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceRunServiceArgs.builder
      builder.runServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder)
    /**
     * @param splits A list of traffic splits that together represent where traffic is being routed.
     *  Structure is documented below.
     * @return builder
     */
    def splits(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetSplitArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetSplitArgs.builder
      builder.splits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder)
    /**
     * @param desireds A text string to serve at the path.
     * @return builder
     */
    def desireds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.builder
      builder.desireds(args.map(_(argsBuilder).build)*)

    /**
     * @param discovereds Whether Hosting was able to find the required file contents on the
     *  specified path during its last check.
     * @return builder
     */
    def discovereds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.builder
      builder.discovereds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.Builder)
    /**
     * @param authors (Output)
     *  Version control metadata for a user associated with a resolved codebase.
     *  Currently assumes a Git user.
     *  Structure is documented below.
     * @return builder
     */
    def authors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseAuthorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseAuthorArgs.builder
      builder.authors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder)
    /**
     * @param conditionalValues The conditionName of the highest priority
     *  (the one listed first in the RemoteConfig&#39;s conditions list) determines
     *  the value of this parameter.
     *  Only one of useInAppDefault or value may be specified.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalValues(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterConditionalValueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterConditionalValueArgs.builder
      builder.conditionalValues(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultValue Value to set the parameter to, when none of the named conditions evaluate to true.
     *  Only one of useInAppDefault or value may be specified.
     *  Structure is documented below.
     * @return builder
     */
    def defaultValue(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterDefaultValueArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterDefaultValueArgs.builder
      builder.defaultValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder)
    /**
     * @param conditions A list of conditions in descending order by priority.
     *  The values of the condition names must be unique.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterGroups Map of parameter group names to their descriptions and grouped parameters.
     *  A group&#39;s name is mutable but must be unique among groups in the config.
     *  The name is limited to 256 characters and intended to be human-readable.
     *  Any Unicode characters are allowed.
     *  Groups have a list of parameters which allows users of the API to group
     *  parameters that are associated with the same feature or theme together for
     *  easy organizational access.
     *  For example, a parameter group with the name &#34;Search V2&#34; may have the
     *  `description` &#34;New mobile search view&#34; and contain parameters for the new
     *  search&#39;s layout and font.
     *  Structure is documented below.
     * @return builder
     */
    def parameterGroups(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.builder
      builder.parameterGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Map of parameter keys to their optional default values and optional
     *  conditional values.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param versions Contains all metadata about a particular version of the Remote Config
     *  template.
     *  All fields are set at the time the specified Remote Config template was
     *  written.
     *  Structure is documented below.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder)
    /**
     * @param codebase A codebase source, representing the state of the codebase
     *  that the build will be created at.
     *  Structure is documented below.
     * @return builder
     */
    def codebase(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.builder
      builder.codebase(args(argsBuilder).build)

    /**
     * @param container The URI of an Artifact Registry
     *  [container
     *  image](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages)
     *  to use as the build source.
     *  Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceContainerArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.Builder)
    /**
     * @param verification A set of ACME challenges you can add to your DNS records or existing,
     *  non-Hosting hosting provider to allow Hosting to create an SSL certificate
     *  for your domain name before you point traffic toward hosting. You can use
     *  thse challenges as part of a zero downtime transition from your old
     *  provider to Hosting.
     *  Structure is documented below.
     * @return builder
     */
    def verification(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.builder
      builder.verification(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder)
    /**
     * @param currents Current state of traffic allocation for the backend.
     *  When setting `target`, this field may differ for some time until the desired state is reached.
     *  Structure is documented below.
     * @return builder
     */
    def currents(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.builder
      builder.currents(args.map(_(argsBuilder).build)*)

    /**
     * @param rolloutPolicy The policy for how builds and rollouts are triggered and rolled out.
     *  Structure is documented below.
     * @return builder
     */
    def rolloutPolicy(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.builder
      builder.rolloutPolicy(args(argsBuilder).build)

    /**
     * @param target Set to manually control the desired traffic for the backend. This will
     *  cause current to eventually match this value. The percentages must add
     *  up to 100.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.Builder)
    /**
     * @param records Records on the domain
     *  Structure is documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder)
    /**
     * @param desireds (Output)
     *  The set of DNS records App Hosting needs in order to be able to serve
     *  secure content on the domain.
     *  Structure is documented below.
     * @return builder
     */
    def desireds(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.builder
      builder.desireds(args.map(_(argsBuilder).build)*)

    /**
     * @param discovereds (Output)
     *  The set of DNS records App Hosting discovered when inspecting a domain.
     *  Structure is documented below.
     * @return builder
     */
    def discovereds(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.builder
      builder.discovereds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.Builder)
    /**
     * @param records Records on the domain
     *  Structure is documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)
