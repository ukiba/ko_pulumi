package jp.ukiba.ko_pulumi
package aws

object codeartifact_ext:
  extension (builder: com.pulumi.aws.codeartifact.RepositoryArgs.Builder)
    /**
     * @param externalConnections An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
     * @return builder
     */
    def externalConnections(args: Endofunction[com.pulumi.aws.codeartifact.inputs.RepositoryExternalConnectionsArgs.Builder]):
        com.pulumi.aws.codeartifact.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.RepositoryExternalConnectionsArgs.builder
      builder.externalConnections(args(argsBuilder).build)

    /**
     * @param upstreams A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.aws.codeartifact.inputs.RepositoryUpstreamArgs.Builder]*):
        com.pulumi.aws.codeartifact.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.codeartifact.inputs.RepositoryUpstreamArgs.builder
      builder.upstreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codeartifact.inputs.RepositoryState.Builder)
    /**
     * @param externalConnections An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
     * @return builder
     */
    def externalConnections(args: Endofunction[com.pulumi.aws.codeartifact.inputs.RepositoryExternalConnectionsArgs.Builder]):
        com.pulumi.aws.codeartifact.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.RepositoryExternalConnectionsArgs.builder
      builder.externalConnections(args(argsBuilder).build)

    /**
     * @param upstreams A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.aws.codeartifact.inputs.RepositoryUpstreamArgs.Builder]*):
        com.pulumi.aws.codeartifact.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.aws.codeartifact.inputs.RepositoryUpstreamArgs.builder
      builder.upstreams(args.map(_(argsBuilder).build)*)
