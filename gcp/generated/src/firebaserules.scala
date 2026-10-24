package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object firebaserules:
  /**
   * For more information, see:
   * * [Get started with Firebase Security Rules](https://firebase.google.com/docs/rules/get-started)
   */
  def Release(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.firebaserules.ReleaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.firebaserules.ReleaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.firebaserules.Release(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * For more information, see:
   * * [Get started with Firebase Security Rules](https://firebase.google.com/docs/rules/get-started)
   */
  def Ruleset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.firebaserules.RulesetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.firebaserules.RulesetArgs.builder
    com.pulumi.gcp.firebaserules.Ruleset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
