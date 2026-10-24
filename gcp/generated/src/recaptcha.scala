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
