package jp.ukiba.ko_pulumi
package gcp

object sourcerepo_ext:
  extension (builder: com.pulumi.gcp.sourcerepo.RepositoryArgs.Builder)
    /**
     * @param pubsubConfigs How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * @return builder
     */
    def pubsubConfigs(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.Builder]*):
        com.pulumi.gcp.sourcerepo.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.builder
      builder.pubsubConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.inputs.RepositoryState.Builder)
    /**
     * @param pubsubConfigs How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * @return builder
     */
    def pubsubConfigs(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.Builder]*):
        com.pulumi.gcp.sourcerepo.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.builder
      builder.pubsubConfigs(args.map(_(argsBuilder).build)*)
