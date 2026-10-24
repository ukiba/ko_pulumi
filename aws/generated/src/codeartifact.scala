package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object codeartifact:
  object CodeartifactFunctions:
    /** The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain. */
    inline def getAuthorizationToken(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codeartifact.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getAuthorizationToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain. */
    inline def getAuthorizationTokenPlain(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codeartifact.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenPlainArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getAuthorizationTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format. */
    inline def getRepositoryEndpoint(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codeartifact.outputs.GetRepositoryEndpointResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getRepositoryEndpoint(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format. */
    inline def getRepositoryEndpointPlain(args: Endofunction[com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codeartifact.outputs.GetRepositoryEndpointResult] =
      val argsBuilder = com.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointPlainArgs.builder
      com.pulumi.aws.codeartifact.CodeartifactFunctions.getRepositoryEndpointPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a CodeArtifact Domain Resource. */
  inline def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeartifact.DomainArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.codeartifact.Domain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CodeArtifact Domains Permissions Policy Resource. */
  inline def DomainPermissions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.DomainPermissionsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codeartifact.DomainPermissionsArgs.builder
    com.pulumi.aws.codeartifact.DomainPermissions(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CodeArtifact Repository Resource. */
  inline def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.RepositoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeartifact.RepositoryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.codeartifact.Repository(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CodeArtifact Repository Permissions Policy Resource. */
  inline def RepositoryPermissionsPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeartifact.RepositoryPermissionsPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.codeartifact.RepositoryPermissionsPolicyArgs.builder
    com.pulumi.aws.codeartifact.RepositoryPermissionsPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
