package jp.ukiba.ko_pulumi
package gcp

object cloudbuildv2_ext:
  extension (builder: com.pulumi.gcp.cloudbuildv2.ConnectionArgs.Builder)
    /**
     * @param bitbucketCloudConfig Configuration for connections to Bitbucket Cloud.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketCloudConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigArgs.builder
      builder.bitbucketCloudConfig(args(argsBuilder).build)

    /**
     * @param bitbucketDataCenterConfig Configuration for connections to Bitbucket Data Center.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketDataCenterConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.builder
      builder.bitbucketDataCenterConfig(args(argsBuilder).build)

    /**
     * @param githubConfig Configuration for connections to github.com.
     * Structure is documented below.
     * @return builder
     */
    inline def githubConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigArgs.builder
      builder.githubConfig(args(argsBuilder).build)

    /**
     * @param githubEnterpriseConfig Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def githubEnterpriseConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigArgs.builder
      builder.githubEnterpriseConfig(args(argsBuilder).build)

    /**
     * @param gitlabConfig Configuration for connections to gitlab.com or an instance of GitLab Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def gitlabConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.builder
      builder.gitlabConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigArgs.Builder)
    /**
     * @param authorizerCredential Required. An access token with the `webhook`, `repository`, `repository:admin` and `pullrequest` scope access. It can be either a workspace, project or repository access token. It&#39;s recommended to use a system account to generate these credentials.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

    /**
     * @param readAuthorizerCredential Required. An access token with the `repository` access. It can be either a workspace, project or repository access token. It&#39;s recommended to use a system account to generate the credentials.
     * Structure is documented below.
     * @return builder
     */
    inline def readAuthorizerCredential(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigReadAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigReadAuthorizerCredentialArgs.builder
      builder.readAuthorizerCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder)
    /**
     * @param authorizerCredential Required. A http access token with the `REPO_ADMIN` scope access.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

    /**
     * @param readAuthorizerCredential Required. A http access token with the `REPO_READ` access.
     * Structure is documented below.
     * @return builder
     */
    inline def readAuthorizerCredential(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigReadAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigReadAuthorizerCredentialArgs.builder
      builder.readAuthorizerCredential(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig Configuration for using Service Directory to privately connect to a Bitbucket Data Center. This should only be set if the Bitbucket Data Center is hosted on-premises and not reachable by public internet. If this field is left empty, calls to the Bitbucket Data Center will be made over the public internet.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigArgs.Builder)
    /**
     * @param authorizerCredential OAuth credential of the account that authorized the Cloud Build GitHub App. It is recommended to use a robot account instead of a human user account. The OAuth token must be tied to the Cloud Build GitHub App.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigArgs.Builder)
    /**
     * @param serviceDirectoryConfig Configuration for using Service Directory to privately connect to a GitHub Enterprise server. This should only be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, calls to the GitHub Enterprise server will be made over the public internet.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.Builder)
    /**
     * @param authorizerCredential Required. A GitLab personal access token with the `api` scope access.
     * Structure is documented below.
     * @return builder
     */
    inline def authorizerCredential(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigAuthorizerCredentialArgs.builder
      builder.authorizerCredential(args(argsBuilder).build)

    /**
     * @param readAuthorizerCredential Required. A GitLab personal access token with the minimum `readApi` scope access.
     * Structure is documented below.
     * @return builder
     */
    inline def readAuthorizerCredential(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigReadAuthorizerCredentialArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigReadAuthorizerCredentialArgs.builder
      builder.readAuthorizerCredential(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig Configuration for using Service Directory to privately connect to a GitLab Enterprise server. This should only be set if the GitLab Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, calls to the GitLab Enterprise server will be made over the public internet.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudbuildv2.inputs.ConnectionState.Builder)
    /**
     * @param bitbucketCloudConfig Configuration for connections to Bitbucket Cloud.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketCloudConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketCloudConfigArgs.builder
      builder.bitbucketCloudConfig(args(argsBuilder).build)

    /**
     * @param bitbucketDataCenterConfig Configuration for connections to Bitbucket Data Center.
     * Structure is documented below.
     * @return builder
     */
    inline def bitbucketDataCenterConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionBitbucketDataCenterConfigArgs.builder
      builder.bitbucketDataCenterConfig(args(argsBuilder).build)

    /**
     * @param githubConfig Configuration for connections to github.com.
     * Structure is documented below.
     * @return builder
     */
    inline def githubConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigArgs.builder
      builder.githubConfig(args(argsBuilder).build)

    /**
     * @param githubEnterpriseConfig Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def githubEnterpriseConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigArgs.builder
      builder.githubEnterpriseConfig(args(argsBuilder).build)

    /**
     * @param gitlabConfig Configuration for connections to gitlab.com or an instance of GitLab Enterprise.
     * Structure is documented below.
     * @return builder
     */
    inline def gitlabConfig(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.Builder]):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGitlabConfigArgs.builder
      builder.gitlabConfig(args(argsBuilder).build)

    /**
     * @param installationStates Output only. Installation state of the Connection.
     * Structure is documented below.
     * @return builder
     */
    inline def installationStates(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.ConnectionInstallationStateArgs.Builder]*):
        com.pulumi.gcp.cloudbuildv2.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.ConnectionInstallationStateArgs.builder
      builder.installationStates(args.map(_(argsBuilder).build)*)
