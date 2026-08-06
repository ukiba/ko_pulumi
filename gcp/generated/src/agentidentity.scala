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
  def AuthProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.agentidentity.AuthProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agentidentity.AuthProviderArgs.builder
    com.pulumi.gcp.agentidentity.AuthProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.agentidentity.AuthProviderArgs.Builder)
    /**
     * @param authProviderTypeParams AuthProvider type specific parameters.
     * Required when creating an auth_provider.
     * Structure is documented below.
     * @return builder
     */
    def authProviderTypeParams(args: Endofunction[com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.Builder]):
        com.pulumi.gcp.agentidentity.AuthProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.builder
      builder.authProviderTypeParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.Builder)
    /**
     * @param apiKey Message describing ApiKeyParams object.
     * Structure is documented below.
     * @return builder
     */
    def apiKey(args: Endofunction[com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsApiKeyArgs.Builder]):
        com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsApiKeyArgs.builder
      builder.apiKey(args(argsBuilder).build)

    /**
     * @param geAuthProviders (Output)
     * Message describing GeminiEnterpriseAuthProviderParams object.
     * Since GeminiEnterpriseAuthProviderParams currently takes no subfields, defining this empty block selects the geAuthProvider type.
     * @return builder
     */
    def geAuthProviders(args: Endofunction[com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsGeAuthProviderArgs.Builder]*):
        com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsGeAuthProviderArgs.builder
      builder.geAuthProviders(args.map(_(argsBuilder).build)*)

    /**
     * @param threeLeggedOauth Message describing ThreeLeggedOAuth object.
     * Structure is documented below.
     * @return builder
     */
    def threeLeggedOauth(args: Endofunction[com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsThreeLeggedOauthArgs.Builder]):
        com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsThreeLeggedOauthArgs.builder
      builder.threeLeggedOauth(args(argsBuilder).build)

    /**
     * @param twoLeggedOauth Message describing TwoLeggedOAuth object.
     * Structure is documented below.
     * @return builder
     */
    def twoLeggedOauth(args: Endofunction[com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsTwoLeggedOauthArgs.Builder]):
        com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsTwoLeggedOauthArgs.builder
      builder.twoLeggedOauth(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.agentidentity.inputs.AuthProviderState.Builder)
    /**
     * @param authProviderTypeParams AuthProvider type specific parameters.
     * Required when creating an auth_provider.
     * Structure is documented below.
     * @return builder
     */
    def authProviderTypeParams(args: Endofunction[com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.Builder]):
        com.pulumi.gcp.agentidentity.inputs.AuthProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.agentidentity.inputs.AuthProviderAuthProviderTypeParamsArgs.builder
      builder.authProviderTypeParams(args(argsBuilder).build)
