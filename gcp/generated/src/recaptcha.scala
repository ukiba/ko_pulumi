package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object recaptcha:
  /** The RecaptchaEnterprise Key resource */
  inline def EnterpriseKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.recaptcha.EnterpriseKeyArgs.builder
    com.pulumi.gcp.recaptcha.EnterpriseKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
