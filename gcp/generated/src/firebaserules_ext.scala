package jp.ukiba.ko_pulumi
package gcp

object firebaserules_ext:
  extension (builder: com.pulumi.gcp.firebaserules.RulesetArgs.Builder)
    /**
     * @param source `Source` for the `Ruleset`.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder]):
        com.pulumi.gcp.firebaserules.RulesetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder)
    /**
     * @param files `File` set constituting the `Source` bundle.
     * @return builder
     */
    inline def files(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetSourceFileArgs.Builder]*):
        com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetSourceFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebaserules.inputs.RulesetState.Builder)
    /**
     * @param metadatas Output only. The metadata for this ruleset.
     * @return builder
     */
    inline def metadatas(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetMetadataArgs.Builder]*):
        com.pulumi.gcp.firebaserules.inputs.RulesetState.Builder =
      def argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param source `Source` for the `Ruleset`.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.Builder]):
        com.pulumi.gcp.firebaserules.inputs.RulesetState.Builder =
      val argsBuilder = com.pulumi.gcp.firebaserules.inputs.RulesetSourceArgs.builder
      builder.source(args(argsBuilder).build)
