package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object developerconnect:
  /** Description */
  inline def AccountConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.developerconnect.AccountConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.developerconnect.AccountConnectorArgs.builder
    com.pulumi.gcp.developerconnect.AccountConnector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A connection for GitHub, GitHub Enterprise, GitLab, and GitLab Enterprise.
   * 
   * To get more information about Connection, see:
   * 
   * * [API documentation](https://cloud.google.com/developer-connect/docs/api/reference/rest/v1/projects.locations.connections)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/developer-connect/docs/overview)
   */
  inline def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.developerconnect.ConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.developerconnect.ConnectionArgs.builder
    com.pulumi.gcp.developerconnect.Connection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A git repository link to a parent connection.
   * 
   * To get more information about GitRepositoryLink, see:
   * 
   * * [API documentation](https://cloud.google.com/developer-connect/docs/api/reference/rest/v1/projects.locations.connections.gitRepositoryLinks)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/developer-connect/docs/overview)
   */
  inline def GitRepositoryLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.developerconnect.GitRepositoryLinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.developerconnect.GitRepositoryLinkArgs.builder
    com.pulumi.gcp.developerconnect.GitRepositoryLink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Description */
  inline def InsightsConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.developerconnect.InsightsConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.developerconnect.InsightsConfigArgs.builder
    com.pulumi.gcp.developerconnect.InsightsConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
