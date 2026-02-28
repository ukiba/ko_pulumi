package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object transfer:
  /** Provides a AWS Transfer AS2 Profile resource. */
  def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.ProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.ProfileArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.Profile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Transfer Family Web App. */
  def WebApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.WebAppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.WebAppArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.WebApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type TransferFunctions = com.pulumi.aws.transfer.TransferFunctions
  object TransferFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.transfer.TransferFunctions.*
  extension (self: TransferFunctions.type)
    /** Data source for managing an AWS Transfer Family Connector. */
    def getConnector(args: Endofunction[com.pulumi.aws.transfer.inputs.GetConnectorArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.transfer.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.aws.transfer.inputs.GetConnectorArgs.builder
      com.pulumi.aws.transfer.TransferFunctions.getConnector(args(argsBuilder).build)

    /** Data source for managing an AWS Transfer Family Connector. */
    def getConnectorPlain(args: Endofunction[com.pulumi.aws.transfer.inputs.GetConnectorPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.transfer.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.aws.transfer.inputs.GetConnectorPlainArgs.builder
      com.pulumi.aws.transfer.TransferFunctions.getConnectorPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of an AWS Transfer Server for use in other
     *  resources.
     */
    def getServer(args: Endofunction[com.pulumi.aws.transfer.inputs.GetServerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.transfer.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.aws.transfer.inputs.GetServerArgs.builder
      com.pulumi.aws.transfer.TransferFunctions.getServer(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of an AWS Transfer Server for use in other
     *  resources.
     */
    def getServerPlain(args: Endofunction[com.pulumi.aws.transfer.inputs.GetServerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.transfer.outputs.GetServerResult] =
      val argsBuilder = com.pulumi.aws.transfer.inputs.GetServerPlainArgs.builder
      com.pulumi.aws.transfer.TransferFunctions.getServerPlain(args(argsBuilder).build)

  /** Manages a host key for a server. This is an [_additional server host key_](https://docs.aws.amazon.com/transfer/latest/userguide/server-host-key-add.html). */
  def HostKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.HostKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.HostKeyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.HostKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transfer.UserArgs.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.UserArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  /**
   * Manages an individual Transfer Family resource tag. This resource should only be used in cases where Transfer Family resources are created outside the provider (e.g., Servers without AWS Management Console) or the tag key has the `aws:` prefix.
   *  
   *  &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.transfer.Server` and `aws.transfer.Tag` to manage tags of the same server will cause a perpetual difference where the `aws.transfer.Server` resource will try to remove the tag being added by the `aws.transfer.Tag` resource.
   *  
   *  &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.TagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.transfer.TagArgs.builder
    
    com.pulumi.aws.transfer.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a AWS Transfer Access resource.
   *  
   *  &gt; **NOTE:** We suggest using explicit JSON encoding or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate configuration to JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def Access(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.AccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.transfer.AccessArgs.builder
    
    com.pulumi.aws.transfer.Access(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a AWS Transfer User resource. Managing SSH keys can be accomplished with the `aws.transfer.SshKey` resource.
   *  
   *  &gt; **NOTE:** We suggest using `jsonencode()` or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate Terraform language into JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.UserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.UserArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a AWS Transfer AS2 Certificate resource. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.CertificateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a AWS Transfer User SSH Key resource. */
  def SshKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.SshKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.transfer.SshKeyArgs.builder
    
    com.pulumi.aws.transfer.SshKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transfer.ServerArgs.Builder)
    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. See `endpointDetails` Block below for details.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param protocolDetails The protocol settings that are configured for your server. See `protocolDetails` Block below for details.
     * @return builder
     */
    def protocolDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.builder
      builder.protocolDetails(args(argsBuilder).build)

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default. See `s3StorageOptions` Block below for details.
     * @return builder
     */
    def s3StorageOptions(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.builder
      builder.s3StorageOptions(args(argsBuilder).build)

    /**
     * @param workflowDetails Specifies the workflow details. See `workflowDetails` Block below for details.
     * @return builder
     */
    def workflowDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.builder
      builder.workflowDetails(args(argsBuilder).build)

  /** Resource for managing an AWS Transfer Family Web App Customization. */
  def WebAppCustomization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.WebAppCustomizationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.transfer.WebAppCustomizationArgs.builder
    
    com.pulumi.aws.transfer.WebAppCustomization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a AWS Transfer AS2 Connector resource. */
  def Connector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.ConnectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.ConnectorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.Connector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transfer.AccessArgs.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.AccessArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.AccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  /**
   * Provides a AWS Transfer Server resource.
   *  
   *  &gt; **NOTE on AWS IAM permissions:** If the `endpointType` is set to `VPC`, the `ec2:DescribeVpcEndpoints` and `ec2:ModifyVpcEndpoint` [actions](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonec2.html#amazonec2-actions-as-permissions) are used.
   *  
   *  &gt; **NOTE:** Use the `aws.transfer.Tag` resource to manage the system tags used for [custom hostnames](https://docs.aws.amazon.com/transfer/latest/userguide/requirements-dns.html#tag-custom-hostname-cdk).
   */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.ServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.ServerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.Server(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transfer.ConnectorArgs.Builder)
    /**
     * @param as2Config Either SFTP or AS2 is configured.The parameters to configure for the connector object. Fields documented below.
     * @return builder
     */
    def as2Config(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.Builder]):
        com.pulumi.aws.transfer.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.builder
      builder.as2Config(args(argsBuilder).build)

    /**
     * @param egressConfig Specifies the egress configuration for the connector. When set, enables routing through customer VPCs using VPC Lattice for private connectivity. Fields documented below.
     * @return builder
     */
    def egressConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder]):
        com.pulumi.aws.transfer.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.builder
      builder.egressConfig(args(argsBuilder).build)

    /**
     * @param sftpConfig Either SFTP or AS2 is configured.The parameters to configure for the connector object. Fields documented below.
     * @return builder
     */
    def sftpConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.Builder]):
        com.pulumi.aws.transfer.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.builder
      builder.sftpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.WorkflowArgs.Builder)
    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
     * @return builder
     */
    def onExceptionSteps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder]*):
        com.pulumi.aws.transfer.WorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.builder
      builder.onExceptionSteps(args.map(_(argsBuilder).build)*)

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder]*):
        com.pulumi.aws.transfer.WorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  /** Provides a AWS Transfer AS2 Agreement resource. */
  def Agreement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.AgreementArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.AgreementArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.Agreement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transfer.WebAppArgs.Builder)
    /**
     * @param endpointDetails Block for the endpoint configuration for the web app. If not specified, the web app will be created with a public endpoint.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.WebAppArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param identityProviderDetails Block for details of the identity provider to use with the web app. See Identity provider details below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def identityProviderDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder]):
        com.pulumi.aws.transfer.WebAppArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.builder
      builder.identityProviderDetails(args(argsBuilder).build)

    /**
     * @param webAppUnits Block for number of concurrent connections or the user sessions on the web app.
     *  * provisioned - (Optional) Number of units of concurrent connections.
     * @return builder
     */
    def webAppUnits(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.Builder]*):
        com.pulumi.aws.transfer.WebAppArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.builder
      builder.webAppUnits(args.map(_(argsBuilder).build)*)

  /** Provides a AWS Transfer Workflow resource. */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transfer.WorkflowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transfer.WorkflowArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transfer.Workflow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Specifies the details for the EFS file being copied.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Specifies the details for the S3 file being copied.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.Builder)
    /**
     * @param tags Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsTagArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Specifies the details for the EFS file being copied.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Specifies the details for the S3 file being copied.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder)
    /**
     * @param onPartialUpload A trigger that starts a workflow if a file is only partially uploaded. See Workflow Detail below. See `onPartialUpload` Block below for details.
     * @return builder
     */
    def onPartialUpload(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnPartialUploadArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnPartialUploadArgs.builder
      builder.onPartialUpload(args(argsBuilder).build)

    /**
     * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a file is uploaded. See `onUpload` Block below for details.
     * @return builder
     */
    def onUpload(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnUploadArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnUploadArgs.builder
      builder.onUpload(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Specifies the details for the EFS file being copied.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Specifies the details for the S3 file being copied.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WebAppState.Builder)
    /**
     * @param endpointDetails Block for the endpoint configuration for the web app. If not specified, the web app will be created with a public endpoint.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param identityProviderDetails Block for details of the identity provider to use with the web app. See Identity provider details below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def identityProviderDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.builder
      builder.identityProviderDetails(args(argsBuilder).build)

    /**
     * @param webAppUnits Block for number of concurrent connections or the user sessions on the web app.
     *  * provisioned - (Optional) Number of units of concurrent connections.
     * @return builder
     */
    def webAppUnits(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WebAppState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.builder
      builder.webAppUnits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder)
    /**
     * @param vpcLattice VPC Lattice configuration for routing connector traffic through customer VPCs. Fields documented below.
     * @return builder
     */
    def vpcLattice(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorEgressConfigVpcLatticeArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorEgressConfigVpcLatticeArgs.builder
      builder.vpcLattice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder)
    /**
     * @param vpc Block defining VPC configuration for hosting the web app endpoint within a VPC. See Vpc below.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsVpcArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.ServerState.Builder)
    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. See `endpointDetails` Block below for details.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param protocolDetails The protocol settings that are configured for your server. See `protocolDetails` Block below for details.
     * @return builder
     */
    def protocolDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.builder
      builder.protocolDetails(args(argsBuilder).build)

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default. See `s3StorageOptions` Block below for details.
     * @return builder
     */
    def s3StorageOptions(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.builder
      builder.s3StorageOptions(args(argsBuilder).build)

    /**
     * @param workflowDetails Specifies the workflow details. See `workflowDetails` Block below for details.
     * @return builder
     */
    def workflowDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.builder
      builder.workflowDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder)
    /**
     * @param copyStepDetails Details for a step that performs a file copy. See Copy Step Details below.
     * @return builder
     */
    def copyStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.builder
      builder.copyStepDetails(args(argsBuilder).build)

    /**
     * @param customStepDetails Details for a step that invokes a lambda function.
     * @return builder
     */
    def customStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCustomStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCustomStepDetailsArgs.builder
      builder.customStepDetails(args(argsBuilder).build)

    /**
     * @param decryptStepDetails Details for a step that decrypts the file.
     * @return builder
     */
    def decryptStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.builder
      builder.decryptStepDetails(args(argsBuilder).build)

    /**
     * @param deleteStepDetails Details for a step that deletes the file.
     * @return builder
     */
    def deleteStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDeleteStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDeleteStepDetailsArgs.builder
      builder.deleteStepDetails(args(argsBuilder).build)

    /**
     * @param tagStepDetails Details for a step that creates one or more tags.
     * @return builder
     */
    def tagStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.builder
      builder.tagStepDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowState.Builder)
    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
     * @return builder
     */
    def onExceptionSteps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.builder
      builder.onExceptionSteps(args.map(_(argsBuilder).build)*)

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.UserState.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder)
    /**
     * @param identityCenterConfig Block that describes the values to use for the IAM Identity Center settings. See Identity center config below.
     * @return builder
     */
    def identityCenterConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsIdentityCenterConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsIdentityCenterConfigArgs.builder
      builder.identityCenterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.AccessState.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.AccessState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.inputs.AccessState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Specifies the details for the EFS file being copied.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Specifies the details for the S3 file being copied.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.Builder)
    /**
     * @param tags Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsTagArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.ConnectorState.Builder)
    /**
     * @param as2Config Either SFTP or AS2 is configured.The parameters to configure for the connector object. Fields documented below.
     * @return builder
     */
    def as2Config(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.builder
      builder.as2Config(args(argsBuilder).build)

    /**
     * @param egressConfig Specifies the egress configuration for the connector. When set, enables routing through customer VPCs using VPC Lattice for private connectivity. Fields documented below.
     * @return builder
     */
    def egressConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.builder
      builder.egressConfig(args(argsBuilder).build)

    /**
     * @param sftpConfig Either SFTP or AS2 is configured.The parameters to configure for the connector object. Fields documented below.
     * @return builder
     */
    def sftpConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.builder
      builder.sftpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder)
    /**
     * @param copyStepDetails Details for a step that performs a file copy. See Copy Step Details below.
     * @return builder
     */
    def copyStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.builder
      builder.copyStepDetails(args(argsBuilder).build)

    /**
     * @param customStepDetails Details for a step that invokes a lambda function.
     * @return builder
     */
    def customStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCustomStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCustomStepDetailsArgs.builder
      builder.customStepDetails(args(argsBuilder).build)

    /**
     * @param decryptStepDetails Details for a step that decrypts the file.
     * @return builder
     */
    def decryptStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.builder
      builder.decryptStepDetails(args(argsBuilder).build)

    /**
     * @param deleteStepDetails Details for a step that deletes the file.
     * @return builder
     */
    def deleteStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDeleteStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDeleteStepDetailsArgs.builder
      builder.deleteStepDetails(args(argsBuilder).build)

    /**
     * @param tagStepDetails Details for a step that creates one or more tags.
     * @return builder
     */
    def tagStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.builder
      builder.tagStepDetails(args(argsBuilder).build)
