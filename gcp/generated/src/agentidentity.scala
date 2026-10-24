package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object agentidentity:
  /**
   * An AuthProvider resource in Agent Identity to manage cloud authentication delegation.
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `auth_provider_type_params.three_legged_oauth.client_secret_wo`, `auth_provider_type_params.two_legged_oauth.client_secret_wo`.
   * Read more about Write-only Arguments.
   */
  def AuthProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.agentidentity.AuthProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agentidentity.AuthProviderArgs.builder
    com.pulumi.gcp.agentidentity.AuthProvider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
