package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object modelarmor:
  /**
   * Model Armor floor settings define rules that dictate minimum requirements for all Model Armor templates created at a specific point in the Google Cloud resource hierarchy (that is, at an organization, folder, or project level). If there are
   * multiple floor settings that conflict with each other, the settings lower in the resource hierarchy take precedence
   * For more information, checkout https://cloud.google.com/security-command-center/docs/model_armor_floor_settings
   */
  def Floorsetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.modelarmor.FloorsettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.modelarmor.FloorsettingArgs.builder
    com.pulumi.gcp.modelarmor.Floorsetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A `Template` is a resource of Model Armor that lets you configure how Model Armor screens prompts and responses.
   * It functions as sets of customized filters and thresholds for different safety and security confidence levels, allowing control over what content is flagged.
   */
  def Template(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.modelarmor.TemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.modelarmor.TemplateArgs.builder
    com.pulumi.gcp.modelarmor.Template(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
