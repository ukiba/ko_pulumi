package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object applicationintegration:
  /**
   * The AuthConfig resource use to hold channels and connection config data.
   * 
   * To get more information about AuthConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/application-integration/docs/reference/rest/v1/projects.locations.authConfigs)
   * * How-to Guides
   *     * [Manage authentication profiles](https://cloud.google.com/application-integration/docs/configure-authentication-profiles)
   *     * [Official Documentation](https://cloud.google.com/application-integration/docs/overview)
   */
  inline def AuthConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.applicationintegration.AuthConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.applicationintegration.AuthConfigArgs.builder
    com.pulumi.gcp.applicationintegration.AuthConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Application Integration Client.
   * 
   * To get more information about Client, see:
   * 
   * * [API documentation](https://cloud.google.com/application-integration/docs/reference/rest/v1/projects.locations.clients)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/application-integration/docs/overview)
   *     * [Set up Application Integration](https://cloud.google.com/application-integration/docs/setup-application-integration)
   */
  inline def Client(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.applicationintegration.ClientArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.applicationintegration.ClientArgs.builder
    com.pulumi.gcp.applicationintegration.Client(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
