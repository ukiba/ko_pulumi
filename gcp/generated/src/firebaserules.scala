package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object firebaserules:
  /**
   * For more information, see:
   *  * [Get started with Firebase Security Rules](https://firebase.google.com/docs/rules/get-started)
   */
  def Release(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebaserules.ReleaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.firebaserules.ReleaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.firebaserules.Release(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebaserules.RulesetArgs.Builder)
    /**
     * @param source `Source` for the `Ruleset`.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder]):
        com.pulumi.gcp.firebaserules.RulesetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.builder
      builder.source(args(argsBuilder).build)

  /**
   * For more information, see:
   *  * [Get started with Firebase Security Rules](https://firebase.google.com/docs/rules/get-started)
   */
  def Ruleset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.firebaserules.RulesetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.firebaserules.RulesetArgs.builder
    com.pulumi.gcp.firebaserules.Ruleset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder)
    /**
     * @param files `File` set constituting the `Source` bundle.
     * @return builder
     */
    def files(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetSourceFileArgs.Builder]*):
        com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetSourceFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebaserules.inputs.RulesetState.Builder)
    /**
     * @param metadatas Output only. The metadata for this ruleset.
     * @return builder
     */
    def metadatas(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetMetadataArgs.Builder]*):
        com.pulumi.gcp.firebaserules.inputs.RulesetState.Builder =
      def argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param source `Source` for the `Ruleset`.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder]):
        com.pulumi.gcp.firebaserules.inputs.RulesetState.Builder =
      val argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.builder
      builder.source(args(argsBuilder).build)
