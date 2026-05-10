package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object recaptcha:
  /** The RecaptchaEnterprise Key resource */
  def EnterpriseKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.builder
    com.pulumi.gcp.recaptcha.EnterpriseKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
