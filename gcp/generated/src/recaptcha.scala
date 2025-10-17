package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object recaptcha:
  /** The RecaptchaEnterprise Key resource */
  def EnterpriseKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.builder
    com.pulumi.gcp.recaptcha.EnterpriseKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder)
    /**
     * @param androidSettings Settings for keys that can be used by Android apps.
     * @return builder
     */
    def androidSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyAndroidSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyAndroidSettingsArgs.builder
      builder.androidSettings(args(argsBuilder).build)

    /**
     * @param iosSettings Settings for keys that can be used by iOS apps.
     * @return builder
     */
    def iosSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyIosSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyIosSettingsArgs.builder
      builder.iosSettings(args(argsBuilder).build)

    /**
     * @param testingOptions Options for user acceptance testing.
     * @return builder
     */
    def testingOptions(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyTestingOptionsArgs.Builder]):
        com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyTestingOptionsArgs.builder
      builder.testingOptions(args(argsBuilder).build)

    /**
     * @param wafSettings Settings specific to keys that can be used for WAF (Web Application Firewall).
     * @return builder
     */
    def wafSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWafSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWafSettingsArgs.builder
      builder.wafSettings(args(argsBuilder).build)

    /**
     * @param webSettings Settings for keys that can be used by websites.
     * @return builder
     */
    def webSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsArgs.builder
      builder.webSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState.Builder)
    /**
     * @param androidSettings Settings for keys that can be used by Android apps.
     * @return builder
     */
    def androidSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyAndroidSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyAndroidSettingsArgs.builder
      builder.androidSettings(args(argsBuilder).build)

    /**
     * @param iosSettings Settings for keys that can be used by iOS apps.
     * @return builder
     */
    def iosSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyIosSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyIosSettingsArgs.builder
      builder.iosSettings(args(argsBuilder).build)

    /**
     * @param testingOptions Options for user acceptance testing.
     * @return builder
     */
    def testingOptions(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyTestingOptionsArgs.Builder]):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyTestingOptionsArgs.builder
      builder.testingOptions(args(argsBuilder).build)

    /**
     * @param wafSettings Settings specific to keys that can be used for WAF (Web Application Firewall).
     * @return builder
     */
    def wafSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWafSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWafSettingsArgs.builder
      builder.wafSettings(args(argsBuilder).build)

    /**
     * @param webSettings Settings for keys that can be used by websites.
     * @return builder
     */
    def webSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsArgs.builder
      builder.webSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsArgs.Builder)
    /**
     * @param challengeSettings Settings for POLICY_BASED_CHALLENGE keys to control when a challenge is triggered.
     * Structure is documented below.
     * @return builder
     */
    def challengeSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsArgs.builder
      builder.challengeSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsArgs.Builder)
    /**
     * @param actionSettings The action to score threshold map. The action name should be the same as the action name passed in the `data-action` attribute. Action names are case-insensitive.
     * Structure is documented below.
     * @return builder
     */
    def actionSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsActionSettingArgs.Builder]*):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsActionSettingArgs.builder
      builder.actionSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultSettings Defines when a challenge is triggered by default.
     * Structure is documented below.
     * @return builder
     */
    def defaultSettings(args: Endofunction[com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsDefaultSettingsArgs.Builder]):
        com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsChallengeSettingsDefaultSettingsArgs.builder
      builder.defaultSettings(args(argsBuilder).build)
