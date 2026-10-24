package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object firebase:
  /**
   * Configuration for Firebase AI Logic.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Config, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/ai-logic/rest)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/ai-logic)
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `generative_language_config.api_key_wo`.
   * Read more about Write-only Arguments.
   */
  def AiLogicConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AiLogicConfigArgs.builder
    com.pulumi.gcp.firebase.AiLogicConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The PromptTemplate resource for Firebase AI Logic.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about PromptTemplate, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/ai-logic/rest/v1beta/projects.locations.templates)
   * * How-to Guides
   *     * [Get started with server prompt templates](https://firebase.google.com/docs/ai-logic/server-prompt-templates/get-started)
   *     * [Product documentation for Firebase AI Logic](https://firebase.google.com/docs/ai-logic)
   *     * [Specification for Dotprompt format](https://google.github.io/dotprompt/getting-started)
   */
  def AiLogicPromptTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AiLogicPromptTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AiLogicPromptTemplateArgs.builder
    com.pulumi.gcp.firebase.AiLogicPromptTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A resource that manages the lock state of a PromptTemplate.
   * When this resource is created, the template is locked.
   * When this resource is deleted, the template is unlocked.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def AiLogicPromptTemplateLock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AiLogicPromptTemplateLockArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AiLogicPromptTemplateLockArgs.builder
    com.pulumi.gcp.firebase.AiLogicPromptTemplateLock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Google Cloud Firebase Android application instance
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about AndroidApp, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/android/setup)
   */
  def AndroidApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AndroidAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AndroidAppArgs.builder
    com.pulumi.gcp.firebase.AndroidApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An app&#39;s App Attest configuration object. Note that the Team ID registered with your
   * app is used as part of the validation process. Make sure your `gcp.firebase.AppleApp` has a teamId present.
   * 
   * To get more information about AppAttestConfig, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.appAttestConfig)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckAppAttestConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckAppAttestConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckAppAttestConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckAppAttestConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A debug token is a secret used during the development or integration testing of
   * an app. It essentially allows the development or integration testing to bypass
   * app attestation while still allowing App Check to enforce protection on supported
   * production Firebase services.
   * 
   * To get more information about DebugToken, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.debugTokens)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckDebugToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckDebugTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckDebugTokenArgs.builder
    com.pulumi.gcp.firebase.AppCheckDebugToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An app&#39;s DeviceCheck configuration object. Note that the Team ID registered with your
   * app is used as part of the validation process. Make sure your `gcp.firebase.AppleApp` has a teamId present.
   * 
   * To get more information about DeviceCheckConfig, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.deviceCheckConfig)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckDeviceCheckConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckDeviceCheckConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckDeviceCheckConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckDeviceCheckConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An app&#39;s Play Integrity configuration object. Note that your registered SHA-256 certificate fingerprints are used to validate tokens issued by the Play Integrity API.
   * Make sure your `gcp.firebase.AndroidApp` has at least one `sha256Hashes` present.
   * 
   * To get more information about PlayIntegrityConfig, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.playIntegrityConfig)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckPlayIntegrityConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckPlayIntegrityConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckPlayIntegrityConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckPlayIntegrityConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An app&#39;s reCAPTCHA Enterprise configuration object.
   * 
   * To get more information about RecaptchaEnterpriseConfig, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.recaptchaEnterpriseConfig)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckRecaptchaEnterpriseConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An app&#39;s reCAPTCHA V3 configuration object.
   * 
   * To get more information about RecaptchaV3Config, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.recaptchaV3Config)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckRecaptchaV3Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckRecaptchaV3ConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckRecaptchaV3ConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckRecaptchaV3Config(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * App Check enforcement policy for a specific resource of a Google service supported by App Check. Note that this policy will override the service-level configuration.
   * 
   * To get more information about ResourcePolicy, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.services.resourcePolicies)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckResourcePolicyArgs.builder
    com.pulumi.gcp.firebase.AppCheckResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The enforcement configuration for a service supported by App Check.
   * 
   * To get more information about ServiceConfig, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.services)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/app-check)
   */
  def AppCheckServiceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppCheckServiceConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppCheckServiceConfigArgs.builder
    com.pulumi.gcp.firebase.AppCheckServiceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A Backend is the primary resource of App Hosting. */
  def AppHostingBackend(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingBackendArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingBackendArgs.builder
    com.pulumi.gcp.firebase.AppHostingBackend(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A single build for a backend, at a specific point codebase reference tag
   * and point in time. Encapsulates several resources, including an Artifact Registry
   * container image, a Cloud Build invocation that built the image, and the
   * Cloud Run revision that uses that image.
   */
  def AppHostingBuild(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingBuildArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingBuildArgs.builder
    com.pulumi.gcp.firebase.AppHostingBuild(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A domain name that is associated with a backend. */
  def AppHostingDefaultDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingDefaultDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingDefaultDomainArgs.builder
    com.pulumi.gcp.firebase.AppHostingDefaultDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A domain name that is associated with a backend. */
  def AppHostingDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingDomainArgs.builder
    com.pulumi.gcp.firebase.AppHostingDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Controls traffic configuration for a backend. */
  def AppHostingTraffic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppHostingTrafficArgs.builder
    com.pulumi.gcp.firebase.AppHostingTraffic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Google Cloud Firebase Apple application instance
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about AppleApp, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/ios/setup)
   */
  def AppleApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.AppleAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.AppleAppArgs.builder
    com.pulumi.gcp.firebase.AppleApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Firebase Data Connect service.
   * 
   * To get more information about Service, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/data-connect/rest)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/data-connect)
   */
  def DataConnectService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.DataConnectServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.DataConnectServiceArgs.builder
    com.pulumi.gcp.firebase.DataConnectService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Firebase Realtime Database instance.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/rest/database/database-management/rest)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/products/realtime-database)
   */
  def DatabaseInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.DatabaseInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.DatabaseInstanceArgs.builder
    com.pulumi.gcp.firebase.DatabaseInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An Instance is an installation of an Extension into a user&#39;s project.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Instance, see:
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/products/extensions)
   */
  def ExtensionsInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.ExtensionsInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.ExtensionsInstanceArgs.builder
    com.pulumi.gcp.firebase.ExtensionsInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object FirebaseFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * A Google Cloud Firebase Admin SDK configuration
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * To get more information about AdminSdkConfig, see:
     * 
     * * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects/getAdminSdkConfig)
     * * How-to Guides
     *     * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAdminSdkConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAdminSdkConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAdminSdkConfig(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Admin SDK configuration
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * To get more information about AdminSdkConfig, see:
     * 
     * * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects/getAdminSdkConfig)
     * * How-to Guides
     *     * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAdminSdkConfigPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAdminSdkConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAdminSdkConfigPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAdminSdkConfigPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Android application instance
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAndroidApp(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAndroidAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAndroidAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAndroidAppArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAndroidApp(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Android application instance
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
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
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAppleApp(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAppleAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleApp(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Apple application instance
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAppleAppPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAppleAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleAppPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Apple application configuration
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * To get more information about iosApp, see:
     * 
     * * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.iosApps)
     * * How-to Guides
     *     * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAppleAppConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetAppleAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppConfigArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleAppConfig(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Apple application configuration
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * To get more information about iosApp, see:
     * 
     * * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.iosApps)
     * * How-to Guides
     *     * [Official Documentation](https://firebase.google.com/)
     */
    inline def getAppleAppConfigPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetAppleAppConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetAppleAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetAppleAppConfigPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getAppleAppConfigPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Hosting Channel instance
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHostingChannel(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetHostingChannelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetHostingChannelResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetHostingChannelArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getHostingChannel(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase Hosting Channel instance
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHostingChannelPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetHostingChannelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetHostingChannelResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetHostingChannelPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getHostingChannelPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application instance
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getWebApp(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetWebAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebApp(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application instance
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getWebAppPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetWebAppResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebAppPlain(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application configuration
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * To get more information about WebApp, see:
     * 
     * * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps)
     * * How-to Guides
     *     * [Official Documentation](https://firebase.google.com/)
     */
    inline def getWebAppConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.firebase.outputs.GetWebAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppConfigArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebAppConfig(args(argsBuilder).build)

    /**
     * A Google Cloud Firebase web application configuration
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * To get more information about WebApp, see:
     * 
     * * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps)
     * * How-to Guides
     *     * [Official Documentation](https://firebase.google.com/)
     */
    inline def getWebAppConfigPlain(args: Endofunction[com.pulumi.gcp.firebase.inputs.GetWebAppConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.firebase.outputs.GetWebAppConfigResult] =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.GetWebAppConfigPlainArgs.builder
      com.pulumi.gcp.firebase.FirebaseFunctions.getWebAppConfigPlain(args(argsBuilder).build)

  /**
   * A `Channel` represents a stream of releases for a site. All sites have a default
   * `live` channel that serves content to the Firebase-provided subdomains and any
   * connected custom domains.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Channel, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/sites.channels)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingChannelArgs.builder
    com.pulumi.gcp.firebase.HostingChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages Custom Domains for Firebase Hosting. Custom Domains link your
   * domain names with Firebase Hosting sites, allowing Hosting to serve content
   * on those domain names.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about CustomDomain, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/projects.sites.customDomains)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingCustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingCustomDomainArgs.builder
    com.pulumi.gcp.firebase.HostingCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Release is a particular collection of configurations that is set to be public at a particular time.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Release, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/sites.releases)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingRelease(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingReleaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingReleaseArgs.builder
    com.pulumi.gcp.firebase.HostingRelease(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A `Site` represents a Firebase Hosting site.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Site, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/projects.sites)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingSiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingSiteArgs.builder
    com.pulumi.gcp.firebase.HostingSite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A `Version` is a configuration which determine how a site is displayed. Static files are not supported at the moment.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Version, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/hosting/rest/v1beta1/sites.versions)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/hosting)
   */
  def HostingVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.HostingVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.HostingVersionArgs.builder
    com.pulumi.gcp.firebase.HostingVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Google Cloud Firebase instance. This enables Firebase resources on a given Google Project.
   * Since a FirebaseProject is actually also a GCP Project, a FirebaseProject uses underlying GCP
   * identifiers (most importantly, the projectId) as its own for easy interop with GCP APIs.
   * Once Firebase has been added to a Google Project it cannot be removed.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Project, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects)
   * * How-to Guides
   *     * Official Documentation
   * 
   * &gt; **Note:** This resource should usually be used with a provider configuration
   * with `userProjectOverride = true` unless you wish for your quota
   * project to be different from the Firebase project.
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.ProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.ProjectArgs.builder
    com.pulumi.gcp.firebase.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A RemoteConfig represents a Remote Config template.
   * 
   * To get more information about RemoteConfig, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/remote-config/rest/v1/projects/getRemoteConfig)
   * * How-to Guides
   *     * [Remote Config Introduction](https://firebase.google.com/docs/remote-config)
   */
  def RemoteConfigRemoteConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.builder
    com.pulumi.gcp.firebase.RemoteConfigRemoteConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An association between a Firebase project and a Google Cloud Storage bucket.
   * This association enables integration of Cloud Storage buckets with Firebase such as Firebase SDKS, Authentication, and Security Rules.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Bucket, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/rest/storage/rest/v1beta/projects.buckets)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/storage/)
   */
  def StorageBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.StorageBucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.StorageBucketArgs.builder
    com.pulumi.gcp.firebase.StorageBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A resource that manages the creation of the default Google Cloud Storage bucket
   * for a Firebase project.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about DefaultBucket, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/rest/storage/rest/v1alpha/projects.defaultBucket)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/docs/storage/)
   */
  def StorageDefaultBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.StorageDefaultBucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.StorageDefaultBucketArgs.builder
    com.pulumi.gcp.firebase.StorageDefaultBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Google Cloud Firebase web application instance
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about WebApp, see:
   * 
   * * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps)
   * * How-to Guides
   *     * [Official Documentation](https://firebase.google.com/)
   */
  def WebApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebase.WebAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebase.WebAppArgs.builder
    com.pulumi.gcp.firebase.WebApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
