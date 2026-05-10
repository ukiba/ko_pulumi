package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object integrationconnectors:
  /**
   * An Integration connectors Managed Zone.
   * 
   *  To get more information about ManagedZone, see:
   * 
   *  * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.global.managedZones)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/integration-connectors/docs)
   */
  def ManagedZone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.integrationconnectors.ManagedZoneArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.integrationconnectors.ManagedZoneArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.integrationconnectors.ManagedZone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An Integration connectors Endpoint Attachment.
   * 
   *  To get more information about EndpointAttachment, see:
   * 
   *  * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.endpointAttachments)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/integration-connectors/docs/create-endpoint-attachment)
   */
  def EndpointAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.integrationconnectors.EndpointAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.integrationconnectors.EndpointAttachmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.integrationconnectors.EndpointAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder)
    /**
     * @param authConfig authConfig for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def authConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.builder
      builder.authConfig(args(argsBuilder).build)

    /**
     * @param configVariables Config Variables for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def configVariables(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs.builder
      builder.configVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param destinationConfigs Define the Connectors target endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def destinationConfigs(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigArgs.builder
      builder.destinationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param eventingConfig Eventing Configuration of a connection
     *  Structure is documented below.
     * @return builder
     */
    def eventingConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.builder
      builder.eventingConfig(args(argsBuilder).build)

    /**
     * @param lockConfig Determines whether or no a connection is locked. If locked, a reason must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def lockConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionLockConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionLockConfigArgs.builder
      builder.lockConfig(args(argsBuilder).build)

    /**
     * @param logConfig Log configuration for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionLogConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Node configuration for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionNodeConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param sslConfig SSL Configuration of a connection
     *  Structure is documented below.
     * @return builder
     */
    def sslConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.builder
      builder.sslConfig(args(argsBuilder).build)

  /**
   * An Integration connectors Connection.
   * 
   *  To get more information about Connection, see:
   * 
   *  * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.connections)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/integration-connectors/docs/createconnection)
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.integrationconnectors.ConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.integrationconnectors.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder)
    /**
     * @param additionalVariables List containing additional auth configs.
     *  Structure is documented below.
     * @return builder
     */
    def additionalVariables(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableArgs.builder
      builder.additionalVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param oauth2AuthCodeFlow Parameters to support Oauth 2.0 Auth Code Grant Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2AuthCodeFlow(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2AuthCodeFlowArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2AuthCodeFlowArgs.builder
      builder.oauth2AuthCodeFlow(args(argsBuilder).build)

    /**
     * @param oauth2ClientCredentials OAuth3 Client Credentials for Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2ClientCredentials(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsArgs.builder
      builder.oauth2ClientCredentials(args(argsBuilder).build)

    /**
     * @param oauth2JwtBearer OAuth2 JWT Bearer for Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2JwtBearer(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerArgs.builder
      builder.oauth2JwtBearer(args(argsBuilder).build)

    /**
     * @param sshPublicKey SSH Public Key for Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def sshPublicKey(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeyArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeyArgs.builder
      builder.sshPublicKey(args(argsBuilder).build)

    /**
     * @param userPassword User password for Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def userPassword(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordArgs.builder
      builder.userPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableArgs.Builder)
    /**
     * @param encryptionKeyValue Encryption key value of configVariable.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKeyValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs.builder
      builder.encryptionKeyValue(args(argsBuilder).build)

    /**
     * @param secretValue Secret value of configVariable
     *  Structure is documented below.
     * @return builder
     */
    def secretValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableSecretValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableSecretValueArgs.builder
      builder.secretValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigArgs.Builder)
    /**
     * @param destinations The destinations for the key.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigDestinationArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigArgs.Builder)
    /**
     * @param additionalVariables List containing additional auth configs.
     *  Structure is documented below.
     * @return builder
     */
    def additionalVariables(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableArgs.builder
      builder.additionalVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param userPassword User password for Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def userPassword(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordArgs.builder
      builder.userPassword(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerArgs.Builder)
    /**
     * @param clientKey Secret version reference containing a PKCS#8 PEM-encoded private key associated with the Client Certificate.
     *  This private key will be used to sign JWTs used for the jwt-bearer authorization grant.
     *  Specified in the form as: projects&#47;&#42;&#47;secrets&#47;&#42;&#47;versions&#47;&#42;.
     * @return builder
     */
    def clientKey(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerClientKeyArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerClientKeyArgs.builder
      builder.clientKey(args(argsBuilder).build)

    /**
     * @param jwtClaims JwtClaims providers fields to generate the token.
     * @return builder
     */
    def jwtClaims(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerJwtClaimsArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerJwtClaimsArgs.builder
      builder.jwtClaims(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.Builder)
    /**
     * @param additionalVariables List containing additional auth configs.
     *  Structure is documented below.
     * @return builder
     */
    def additionalVariables(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableArgs.builder
      builder.additionalVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param authConfig authConfig for Eventing Configuration.
     *  Structure is documented below.
     * @return builder
     */
    def authConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigArgs.builder
      builder.authConfig(args(argsBuilder).build)

    /**
     * @param registrationDestinationConfig registrationDestinationConfig
     *  Structure is documented below.
     * @return builder
     */
    def registrationDestinationConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigRegistrationDestinationConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigRegistrationDestinationConfigArgs.builder
      builder.registrationDestinationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableArgs.Builder)
    /**
     * @param encryptionKeyValue Encryption key value of configVariable.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKeyValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs.builder
      builder.encryptionKeyValue(args(argsBuilder).build)

    /**
     * @param secretValue Secret value of configVariable
     *  Structure is documented below.
     * @return builder
     */
    def secretValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableSecretValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableSecretValueArgs.builder
      builder.secretValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeyArgs.Builder)
    /**
     * @param sshClientCert SSH Client Cert. It should contain both public and private key.
     *  Structure is documented below.
     * @return builder
     */
    def sshClientCert(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeySshClientCertArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeySshClientCertArgs.builder
      builder.sshClientCert(args(argsBuilder).build)

    /**
     * @param sshClientCertPass Password (passphrase) for ssh client certificate if it has one.
     *  Structure is documented below.
     * @return builder
     */
    def sshClientCertPass(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeySshClientCertPassArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeySshClientCertPassArgs.builder
      builder.sshClientCertPass(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordArgs.Builder)
    /**
     * @param password Password for Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def password(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordPasswordArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordPasswordArgs.builder
      builder.password(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordArgs.Builder)
    /**
     * @param password Password for Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def password(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordPasswordArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordPasswordArgs.builder
      builder.password(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder)
    /**
     * @param authConfig authConfig for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def authConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs.builder
      builder.authConfig(args(argsBuilder).build)

    /**
     * @param configVariables Config Variables for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def configVariables(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs.builder
      builder.configVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param connectorVersionInfraConfigs This configuration provides infra configs like rate limit threshold which need to be configurable for every connector version.
     *  Structure is documented below.
     * @return builder
     */
    def connectorVersionInfraConfigs(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionConnectorVersionInfraConfigArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionConnectorVersionInfraConfigArgs.builder
      builder.connectorVersionInfraConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param destinationConfigs Define the Connectors target endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def destinationConfigs(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigArgs.builder
      builder.destinationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param eventingConfig Eventing Configuration of a connection
     *  Structure is documented below.
     * @return builder
     */
    def eventingConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs.builder
      builder.eventingConfig(args(argsBuilder).build)

    /**
     * @param eventingRuntimeDatas Eventing Runtime Data.
     *  Structure is documented below.
     * @return builder
     */
    def eventingRuntimeDatas(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingRuntimeDataArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingRuntimeDataArgs.builder
      builder.eventingRuntimeDatas(args.map(_(argsBuilder).build)*)

    /**
     * @param lockConfig Determines whether or no a connection is locked. If locked, a reason must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def lockConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionLockConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionLockConfigArgs.builder
      builder.lockConfig(args(argsBuilder).build)

    /**
     * @param logConfig Log configuration for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionLogConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Node configuration for the connection.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionNodeConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param sslConfig SSL Configuration of a connection
     *  Structure is documented below.
     * @return builder
     */
    def sslConfig(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.builder
      builder.sslConfig(args(argsBuilder).build)

    /**
     * @param statuses (Output)
     *  Current status of eventing.
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionStatusArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigRegistrationDestinationConfigArgs.Builder)
    /**
     * @param destinations destinations for the connection
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigRegistrationDestinationConfigDestinationArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigRegistrationDestinationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigRegistrationDestinationConfigDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder)
    /**
     * @param additionalVariables Additional SSL related field values.
     *  Structure is documented below.
     * @return builder
     */
    def additionalVariables(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigAdditionalVariableArgs.builder
      builder.additionalVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param clientCertificate Client Certificate
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificate(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientCertificateArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientCertificateArgs.builder
      builder.clientCertificate(args(argsBuilder).build)

    /**
     * @param clientPrivateKey Client Private Key
     *  Structure is documented below.
     * @return builder
     */
    def clientPrivateKey(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientPrivateKeyArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientPrivateKeyArgs.builder
      builder.clientPrivateKey(args(argsBuilder).build)

    /**
     * @param clientPrivateKeyPass Secret containing the passphrase protecting the Client Private Key
     *  Structure is documented below.
     * @return builder
     */
    def clientPrivateKeyPass(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientPrivateKeyPassArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientPrivateKeyPassArgs.builder
      builder.clientPrivateKeyPass(args(argsBuilder).build)

    /**
     * @param privateServerCertificate Private Server Certificate. Needs to be specified if trust model is PRIVATE.
     *  Structure is documented below.
     * @return builder
     */
    def privateServerCertificate(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigPrivateServerCertificateArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigPrivateServerCertificateArgs.builder
      builder.privateServerCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableArgs.Builder)
    /**
     * @param encryptionKeyValue Encryption key value of configVariable.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKeyValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableEncryptionKeyValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableEncryptionKeyValueArgs.builder
      builder.encryptionKeyValue(args(argsBuilder).build)

    /**
     * @param secretValue Secret value of configVariable
     *  Structure is documented below.
     * @return builder
     */
    def secretValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs.builder
      builder.secretValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingRuntimeDataArgs.Builder)
    /**
     * @param statuses (Output)
     *  Current status of eventing.
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingRuntimeDataStatusArgs.Builder]*):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingRuntimeDataArgs.Builder =
      def argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingRuntimeDataStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableArgs.Builder)
    /**
     * @param encryptionKeyValue Encryption key value of configVariable.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKeyValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableEncryptionKeyValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableEncryptionKeyValueArgs.builder
      builder.encryptionKeyValue(args(argsBuilder).build)

    /**
     * @param secretValue Secret value of configVariable
     *  Structure is documented below.
     * @return builder
     */
    def secretValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableSecretValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAdditionalVariableSecretValueArgs.builder
      builder.secretValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsArgs.Builder)
    /**
     * @param clientSecret Secret version reference containing the client secret.
     * @return builder
     */
    def clientSecret(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsClientSecretArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs.Builder)
    /**
     * @param encryptionKeyValue Encryption key value of configVariable.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKeyValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableEncryptionKeyValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableEncryptionKeyValueArgs.builder
      builder.encryptionKeyValue(args(argsBuilder).build)

    /**
     * @param secretValue Secret value of configVariable.
     *  Structure is documented below.
     * @return builder
     */
    def secretValue(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableSecretValueArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableSecretValueArgs.builder
      builder.secretValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2AuthCodeFlowArgs.Builder)
    /**
     * @param clientSecret Client secret for user-provided OAuth app.
     * @return builder
     */
    def clientSecret(args: Endofunction[com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2AuthCodeFlowClientSecretArgs.Builder]):
        com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2AuthCodeFlowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2AuthCodeFlowClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)
