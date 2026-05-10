package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object applicationintegration:
  extension (builder: com.pulumi.gcp.applicationintegration.ClientArgs.Builder)
    /**
     * @param cloudKmsConfig Cloud KMS config for AuthModule to encrypt/decrypt credentials.
     *  Structure is documented below.
     * @return builder
     */
    def cloudKmsConfig(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.ClientCloudKmsConfigArgs.Builder]):
        com.pulumi.gcp.applicationintegration.ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.ClientCloudKmsConfigArgs.builder
      builder.cloudKmsConfig(args(argsBuilder).build)

  /**
   * Application Integration Client.
   * 
   *  To get more information about Client, see:
   * 
   *  * [API documentation](https://cloud.google.com/application-integration/docs/reference/rest/v1/projects.locations.clients)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/application-integration/docs/overview)
   *      * [Set up Application Integration](https://cloud.google.com/application-integration/docs/setup-application-integration)
   */
  def Client(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.applicationintegration.ClientArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.applicationintegration.ClientArgs.builder
    com.pulumi.gcp.applicationintegration.Client(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The AuthConfig resource use to hold channels and connection config data.
   * 
   *  To get more information about AuthConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/application-integration/docs/reference/rest/v1/projects.locations.authConfigs)
   *  * How-to Guides
   *      * [Manage authentication profiles](https://cloud.google.com/application-integration/docs/configure-authentication-profiles)
   *      * [Official Documentation](https://cloud.google.com/application-integration/docs/overview)
   */
  def AuthConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.applicationintegration.AuthConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.applicationintegration.AuthConfigArgs.builder
    com.pulumi.gcp.applicationintegration.AuthConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.AuthConfigArgs.Builder)
    /**
     * @param clientCertificate Raw client certificate
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificate(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigClientCertificateArgs.Builder]):
        com.pulumi.gcp.applicationintegration.AuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigClientCertificateArgs.builder
      builder.clientCertificate(args(argsBuilder).build)

    /**
     * @param decryptedCredential Raw auth credentials.
     *  Structure is documented below.
     * @return builder
     */
    def decryptedCredential(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder]):
        com.pulumi.gcp.applicationintegration.AuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.builder
      builder.decryptedCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder)
    /**
     * @param authToken Auth token credential.
     *  Structure is documented below.
     * @return builder
     */
    def authToken(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialAuthTokenArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialAuthTokenArgs.builder
      builder.authToken(args(argsBuilder).build)

    /**
     * @param jwt JWT credential.
     *  Structure is documented below.
     * @return builder
     */
    def jwt(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialJwtArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialJwtArgs.builder
      builder.jwt(args(argsBuilder).build)

    /**
     * @param oauth2AuthorizationCode OAuth2 authorization code credential.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2AuthorizationCode(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2AuthorizationCodeArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2AuthorizationCodeArgs.builder
      builder.oauth2AuthorizationCode(args(argsBuilder).build)

    /**
     * @param oauth2ClientCredentials OAuth2 client credentials.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2ClientCredentials(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsArgs.builder
      builder.oauth2ClientCredentials(args(argsBuilder).build)

    /**
     * @param oidcToken Google OIDC ID Token.
     *  Structure is documented below.
     * @return builder
     */
    def oidcToken(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOidcTokenArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)

    /**
     * @param serviceAccountCredentials Service account credential.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountCredentials(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialServiceAccountCredentialsArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialServiceAccountCredentialsArgs.builder
      builder.serviceAccountCredentials(args(argsBuilder).build)

    /**
     * @param usernameAndPassword Username and password credential.
     *  Structure is documented below.
     * @return builder
     */
    def usernameAndPassword(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialUsernameAndPasswordArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialUsernameAndPasswordArgs.builder
      builder.usernameAndPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.AuthConfigState.Builder)
    /**
     * @param clientCertificate Raw client certificate
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificate(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigClientCertificateArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigClientCertificateArgs.builder
      builder.clientCertificate(args(argsBuilder).build)

    /**
     * @param decryptedCredential Raw auth credentials.
     *  Structure is documented below.
     * @return builder
     */
    def decryptedCredential(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs.builder
      builder.decryptedCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueArgs.Builder)
    /**
     * @param literalValue Passing a literal value
     *  Structure is documented below.
     * @return builder
     */
    def literalValue(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueLiteralValueArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueLiteralValueArgs.builder
      builder.literalValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.ClientState.Builder)
    /**
     * @param cloudKmsConfig Cloud KMS config for AuthModule to encrypt/decrypt credentials.
     *  Structure is documented below.
     * @return builder
     */
    def cloudKmsConfig(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.ClientCloudKmsConfigArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.ClientState.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.ClientCloudKmsConfigArgs.builder
      builder.cloudKmsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsArgs.Builder)
    /**
     * @param tokenParams Token parameters for the auth request.
     * @return builder
     */
    def tokenParams(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsArgs.builder
      builder.tokenParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryArgs.Builder)
    /**
     * @param key Key of the map entry.
     *  Structure is documented below.
     * @return builder
     */
    def key(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyArgs.builder
      builder.key(args(argsBuilder).build)

    /**
     * @param value Value of the map entry.
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyArgs.Builder)
    /**
     * @param literalValue Passing a literal value
     *  Structure is documented below.
     * @return builder
     */
    def literalValue(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyLiteralValueArgs.Builder]):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyLiteralValueArgs.builder
      builder.literalValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsArgs.Builder)
    /**
     * @param entries A list of parameter map entries.
     *  Structure is documented below.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryArgs.Builder]*):
        com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)
