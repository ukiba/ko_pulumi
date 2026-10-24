package jp.ukiba.ko_pulumi
package gcp

object developerconnect_ext:
  extension (builder: com.pulumi.gcp.developerconnect.AccountConnectorArgs.Builder)
    /**
     * @param customOauthConfig Message for a customized OAuth config.
     * Structure is documented below.
     * @return builder
     */
    inline def customOauthConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.AccountConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigArgs.builder
      builder.customOauthConfig(args(argsBuilder).build)

    /**
     * @param providerOauthConfig ProviderOAuthConfig is the OAuth config for a provider.
     * Structure is documented below.
     * @return builder
     */
    inline def providerOauthConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.AccountConnectorProviderOauthConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.AccountConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.AccountConnectorProviderOauthConfigArgs.builder
      builder.providerOauthConfig(args(argsBuilder).build)

    /**
     * @param proxyConfig The proxy configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def proxyConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.AccountConnectorProxyConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.AccountConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.AccountConnectorProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.ConnectionArgs.Builder)
    /**
     * @param bitbucketCloudConfig Configuration for connections to an instance of Bitbucket Cloud.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketCloudConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs.builder
      builder.bitbucketCloudConfig(args(argsBuilder).build)

    /**
     * @param bitbucketDataCenterConfig Configuration for connections to an instance of Bitbucket Data Center.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketDataCenterConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.builder
      builder.bitbucketDataCenterConfig(args(argsBuilder).build)

    /**
     * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-managed
     * encryption keys (CMEK) feature.
     * Structure is documented below.
     * @return builder
     */
    inline def cryptoKeyConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionCryptoKeyConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionCryptoKeyConfigArgs.builder
      builder.cryptoKeyConfig(args(argsBuilder).build)

    /**
     * @param githubConfig Configuration for connections to github.com.
     * Structure is documented below.
     * @return builder
     */
    inline def githubConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigArgs.builder
      builder.githubConfig(args(argsBuilder).build)

    /**
     * @param githubEnterpriseConfig Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def githubEnterpriseConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigArgs.builder
      builder.githubEnterpriseConfig(args(argsBuilder).build)

    /**
     * @param gitlabConfig Configuration for connections to gitlab.com.
     * Structure is documented below.
     * @return builder
     */
    inline def gitlabConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs.builder
      builder.gitlabConfig(args(argsBuilder).build)

    /**
     * @param gitlabEnterpriseConfig Configuration for connections to an instance of GitLab Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def gitlabEnterpriseConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.builder
      builder.gitlabEnterpriseConfig(args(argsBuilder).build)

    /**
     * @param httpConfig Configuration for connections to an HTTP service provider.
     * Structure is documented below.
     * @return builder
     */
    inline def httpConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.InsightsConfigArgs.Builder)
    /**
     * @param artifactConfigs The artifact configurations of the artifacts that are deployed.
     * Structure is documented below.
     * @return builder
     */
    inline def artifactConfigs(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigArgs.Builder]*):
        com.pulumi.gcp.developerconnect.InsightsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigArgs.builder
      builder.artifactConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param targetProjects The projects to track with the InsightsConfig.
     * Structure is documented below.
     * @return builder
     */
    inline def targetProjects(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigTargetProjectsArgs.Builder]):
        com.pulumi.gcp.developerconnect.InsightsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigTargetProjectsArgs.builder
      builder.targetProjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigArgs.Builder)
    /**
     * @param serviceDirectoryConfig ServiceDirectoryConfig represents Service Directory configuration for a
     * connection.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.AccountConnectorState.Builder)
    /**
     * @param customOauthConfig Message for a customized OAuth config.
     * Structure is documented below.
     * @return builder
     */
    inline def customOauthConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.AccountConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.AccountConnectorCustomOauthConfigArgs.builder
      builder.customOauthConfig(args(argsBuilder).build)

    /**
     * @param providerOauthConfig ProviderOAuthConfig is the OAuth config for a provider.
     * Structure is documented below.
     * @return builder
     */
    inline def providerOauthConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.AccountConnectorProviderOauthConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.AccountConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.AccountConnectorProviderOauthConfigArgs.builder
      builder.providerOauthConfig(args(argsBuilder).build)

    /**
     * @param proxyConfig The proxy configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def proxyConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.AccountConnectorProxyConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.AccountConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.AccountConnectorProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs.Builder)
    /**
     * @param authorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

    /**
     * @param readAuthorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def readAuthorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigReadAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigReadAuthorizerCredentialArgs.builder
      builder.readAuthorizerCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder)
    /**
     * @param authorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

    /**
     * @param readAuthorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def readAuthorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigReadAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigReadAuthorizerCredentialArgs.builder
      builder.readAuthorizerCredential(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig ServiceDirectoryConfig represents Service Directory configuration for a
     * connection.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigArgs.Builder)
    /**
     * @param authorizerCredential Represents an OAuth token of the account that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigArgs.Builder)
    /**
     * @param serviceDirectoryConfig ServiceDirectoryConfig represents Service Directory configuration for a
     * connection.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs.Builder)
    /**
     * @param authorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

    /**
     * @param readAuthorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def readAuthorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigReadAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigReadAuthorizerCredentialArgs.builder
      builder.readAuthorizerCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.Builder)
    /**
     * @param authorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

    /**
     * @param readAuthorizerCredential Represents a personal access token that authorized the Connection,
     * and associated metadata.
     * Structure is documented below.
     * @return builder
     */
    inline def readAuthorizerCredential(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigReadAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigReadAuthorizerCredentialArgs.builder
      builder.readAuthorizerCredential(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig ServiceDirectoryConfig represents Service Directory configuration for a
     * connection.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.Builder)
    /**
     * @param basicAuthentication Basic authentication with username and password.
     * Structure is documented below.
     * @return builder
     */
    inline def basicAuthentication(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigBasicAuthenticationArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigBasicAuthenticationArgs.builder
      builder.basicAuthentication(args(argsBuilder).build)

    /**
     * @param bearerTokenAuthentication Bearer token authentication with a token.
     * Structure is documented below.
     * @return builder
     */
    inline def bearerTokenAuthentication(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigBearerTokenAuthenticationArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigBearerTokenAuthenticationArgs.builder
      builder.bearerTokenAuthentication(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig ServiceDirectoryConfig represents Service Directory configuration for a
     * connection.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder)
    /**
     * @param bitbucketCloudConfig Configuration for connections to an instance of Bitbucket Cloud.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketCloudConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs.builder
      builder.bitbucketCloudConfig(args(argsBuilder).build)

    /**
     * @param bitbucketDataCenterConfig Configuration for connections to an instance of Bitbucket Data Center.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketDataCenterConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs.builder
      builder.bitbucketDataCenterConfig(args(argsBuilder).build)

    /**
     * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-managed
     * encryption keys (CMEK) feature.
     * Structure is documented below.
     * @return builder
     */
    inline def cryptoKeyConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionCryptoKeyConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionCryptoKeyConfigArgs.builder
      builder.cryptoKeyConfig(args(argsBuilder).build)

    /**
     * @param githubConfig Configuration for connections to github.com.
     * Structure is documented below.
     * @return builder
     */
    inline def githubConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigArgs.builder
      builder.githubConfig(args(argsBuilder).build)

    /**
     * @param githubEnterpriseConfig Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def githubEnterpriseConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigArgs.builder
      builder.githubEnterpriseConfig(args(argsBuilder).build)

    /**
     * @param gitlabConfig Configuration for connections to gitlab.com.
     * Structure is documented below.
     * @return builder
     */
    inline def gitlabConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs.builder
      builder.gitlabConfig(args(argsBuilder).build)

    /**
     * @param gitlabEnterpriseConfig Configuration for connections to an instance of GitLab Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def gitlabEnterpriseConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs.builder
      builder.gitlabEnterpriseConfig(args(argsBuilder).build)

    /**
     * @param httpConfig Configuration for connections to an HTTP service provider.
     * Structure is documented below.
     * @return builder
     */
    inline def httpConfig(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

    /**
     * @param installationStates Describes stage and necessary actions to be taken by the
     * user to complete the installation. Used for GitHub and GitHub Enterprise
     * based connections.
     * Structure is documented below.
     * @return builder
     */
    inline def installationStates(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.ConnectionInstallationStateArgs.Builder]*):
        com.pulumi.gcp.developerconnect.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.developerconnect.inputs.ConnectionInstallationStateArgs.builder
      builder.installationStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigArgs.Builder)
    /**
     * @param googleArtifactAnalysis Google Artifact Analysis configurations.
     * Structure is documented below.
     * @return builder
     */
    inline def googleArtifactAnalysis(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigGoogleArtifactAnalysisArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigGoogleArtifactAnalysisArgs.builder
      builder.googleArtifactAnalysis(args(argsBuilder).build)

    /**
     * @param googleArtifactRegistry Google Artifact Registry configurations.
     * Structure is documented below.
     * @return builder
     */
    inline def googleArtifactRegistry(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigGoogleArtifactRegistryArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigGoogleArtifactRegistryArgs.builder
      builder.googleArtifactRegistry(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.InsightsConfigErrorArgs.Builder)
    /**
     * @param details (Output)
     * A list of messages that carry the error details.  There is a common set of
     * message types for APIs to use.
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigErrorDetailArgs.Builder]*):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigArgs.Builder)
    /**
     * @param appHubWorkload AppHubWorkload represents the App Hub Workload.
     * Structure is documented below.
     * @return builder
     */
    inline def appHubWorkload(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigAppHubWorkloadArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigAppHubWorkloadArgs.builder
      builder.appHubWorkload(args(argsBuilder).build)

    /**
     * @param gkeWorkload GKEWorkload represents the Google Kubernetes Engine runtime.
     * Structure is documented below.
     * @return builder
     */
    inline def gkeWorkload(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigGkeWorkloadArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigGkeWorkloadArgs.builder
      builder.gkeWorkload(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.developerconnect.inputs.InsightsConfigState.Builder)
    /**
     * @param artifactConfigs The artifact configurations of the artifacts that are deployed.
     * Structure is documented below.
     * @return builder
     */
    inline def artifactConfigs(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigArgs.Builder]*):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigArtifactConfigArgs.builder
      builder.artifactConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param errors Any errors that occurred while setting up the InsightsConfig.
     * Each error will be in the format: `field_name: errorMessage`, e.g.
     * GetAppHubApplication: Permission denied while getting App Hub
     * application. Please grant permissions to the P4SA.
     * Structure is documented below.
     * @return builder
     */
    inline def errors(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigErrorArgs.Builder]*):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param runtimeConfigs The runtime configurations where the application is deployed.
     * Structure is documented below.
     * @return builder
     */
    inline def runtimeConfigs(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigArgs.Builder]*):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigRuntimeConfigArgs.builder
      builder.runtimeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param targetProjects The projects to track with the InsightsConfig.
     * Structure is documented below.
     * @return builder
     */
    inline def targetProjects(args: Endofunction[com.pulumi.gcp.developerconnect.inputs.InsightsConfigTargetProjectsArgs.Builder]):
        com.pulumi.gcp.developerconnect.inputs.InsightsConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.developerconnect.inputs.InsightsConfigTargetProjectsArgs.builder
      builder.targetProjects(args(argsBuilder).build)
