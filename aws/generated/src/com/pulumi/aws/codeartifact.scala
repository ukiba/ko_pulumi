package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object codeartifact:
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

  /** Provides a CodeArtifact Domains Permissions Policy Resource. */
  def DomainPermissions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.DomainPermissionsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codeartifact.DomainPermissionsArgs.builder
    
    com.pulumi.aws.codeartifact.DomainPermissions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CodeArtifact Repostory Permissions Policy Resource. */
  def RepositoryPermissionsPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.RepositoryPermissionsPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codeartifact.RepositoryPermissionsPolicyArgs.builder
    
    com.pulumi.aws.codeartifact.RepositoryPermissionsPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CodeArtifact Repository Resource. */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.RepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeartifact.RepositoryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codeartifact.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CodeartifactFunctions = com.pulumi.aws.codeartifact.CodeartifactFunctions
  object CodeartifactFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.codeartifact.CodeartifactFunctions.*
  extension (self: CodeartifactFunctions.type)
    /** The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain. */
    def getAuthorizationToken(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codeartifact.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getAuthorizationToken(args(argsBuilder).build)

    /** The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain. */
    def getAuthorizationTokenPlain(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codeartifact.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenPlainArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getAuthorizationTokenPlain(args(argsBuilder).build)

    /** The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format. */
    def getRepositoryEndpoint(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codeartifact.outputs.GetRepositoryEndpointResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getRepositoryEndpoint(args(argsBuilder).build)

    /** The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format. */
    def getRepositoryEndpointPlain(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codeartifact.outputs.GetRepositoryEndpointResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointPlainArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getRepositoryEndpointPlain(args(argsBuilder).build)

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

  /** Provides a CodeArtifact Domain Resource. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeartifact.DomainArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codeartifact.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
