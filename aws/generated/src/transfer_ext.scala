package jp.ukiba.ko_pulumi
package aws

object transfer_ext:
  extension (builder: com.pulumi.aws.transfer.AccessArgs.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See `homeDirectoryMappings` Block below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.AccessArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See `posixProfile` Block below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.AccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.ConnectorArgs.Builder)
    /**
     * @param as2Config Either SFTP or AS2 is configured. Parameters to configure for the connector object. See `as2Config` Block below.
     * @return builder
     */
    def as2Config(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.Builder]):
        com.pulumi.aws.transfer.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.builder
      builder.as2Config(args(argsBuilder).build)

    /**
     * @param egressConfig Egress configuration for the connector. When set, enables routing through customer VPCs using VPC Lattice for private connectivity. See `egressConfig` Block below.
     * @return builder
     */
    def egressConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder]):
        com.pulumi.aws.transfer.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.builder
      builder.egressConfig(args(argsBuilder).build)

    /**
     * @param sftpConfig Either SFTP or AS2 is configured. Parameters to configure for the connector object. See `sftpConfig` Block below.
     * @return builder
     */
    def sftpConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.Builder]):
        com.pulumi.aws.transfer.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.builder
      builder.sftpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.ServerArgs.Builder)
    /**
     * @param endpointDetails VPC endpoint settings that you want to configure for your SFTP server. See `endpointDetails` Block below for details.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param protocolDetails Protocol settings that are configured for your server. See `protocolDetails` Block below for details.
     * @return builder
     */
    def protocolDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.builder
      builder.protocolDetails(args(argsBuilder).build)

    /**
     * @param s3StorageOptions Whether performance for your Amazon S3 directories is optimized. This is disabled by default. See `s3StorageOptions` Block below for details.
     * @return builder
     */
    def s3StorageOptions(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.builder
      builder.s3StorageOptions(args(argsBuilder).build)

    /**
     * @param workflowDetails Workflow details. See `workflowDetails` Block below for details.
     * @return builder
     */
    def workflowDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder]):
        com.pulumi.aws.transfer.ServerArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.builder
      builder.workflowDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.UserArgs.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See `homeDirectoryMappings` Block below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.UserArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See `posixProfile` Block below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.WebAppArgs.Builder)
    /**
     * @param endpointDetails Block for the endpoint configuration for the web app. If not specified, the web app will be created with a public endpoint. See `endpointDetails` Block below.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.WebAppArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param identityProviderDetails Block for details of the identity provider to use with the web app. See `identityProviderDetails` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def identityProviderDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder]):
        com.pulumi.aws.transfer.WebAppArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.builder
      builder.identityProviderDetails(args(argsBuilder).build)

    /**
     * @param webAppUnits Block for number of concurrent connections or the user sessions on the web app. See `webAppUnits` Block below.
     * @return builder
     */
    def webAppUnits(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.Builder]*):
        com.pulumi.aws.transfer.WebAppArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.builder
      builder.webAppUnits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.WorkflowArgs.Builder)
    /**
     * @param onExceptionSteps Steps (actions) to take if errors are encountered during execution of the workflow. See `onExceptionSteps` Block below.
     * @return builder
     */
    def onExceptionSteps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder]*):
        com.pulumi.aws.transfer.WorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.builder
      builder.onExceptionSteps(args.map(_(argsBuilder).build)*)

    /**
     * @param steps Details for the steps that are in the specified workflow. See `steps` Block below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder]*):
        com.pulumi.aws.transfer.WorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.AccessState.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See `homeDirectoryMappings` Block below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.AccessState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.AccessHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See `posixProfile` Block below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.inputs.AccessState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.AccessPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder)
    /**
     * @param vpcLattice VPC Lattice configuration for routing connector traffic through customer VPCs. See `vpcLattice` Block below.
     * @return builder
     */
    def vpcLattice(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorEgressConfigVpcLatticeArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorEgressConfigVpcLatticeArgs.builder
      builder.vpcLattice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.ConnectorState.Builder)
    /**
     * @param as2Config Either SFTP or AS2 is configured. Parameters to configure for the connector object. See `as2Config` Block below.
     * @return builder
     */
    def as2Config(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorAs2ConfigArgs.builder
      builder.as2Config(args(argsBuilder).build)

    /**
     * @param egressConfig Egress configuration for the connector. When set, enables routing through customer VPCs using VPC Lattice for private connectivity. See `egressConfig` Block below.
     * @return builder
     */
    def egressConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorEgressConfigArgs.builder
      builder.egressConfig(args(argsBuilder).build)

    /**
     * @param sftpConfig Either SFTP or AS2 is configured. Parameters to configure for the connector object. See `sftpConfig` Block below.
     * @return builder
     */
    def sftpConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ConnectorSftpConfigArgs.builder
      builder.sftpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.ServerState.Builder)
    /**
     * @param endpointDetails VPC endpoint settings that you want to configure for your SFTP server. See `endpointDetails` Block below for details.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param protocolDetails Protocol settings that are configured for your server. See `protocolDetails` Block below for details.
     * @return builder
     */
    def protocolDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerProtocolDetailsArgs.builder
      builder.protocolDetails(args(argsBuilder).build)

    /**
     * @param s3StorageOptions Whether performance for your Amazon S3 directories is optimized. This is disabled by default. See `s3StorageOptions` Block below for details.
     * @return builder
     */
    def s3StorageOptions(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerS3StorageOptionsArgs.builder
      builder.s3StorageOptions(args(argsBuilder).build)

    /**
     * @param workflowDetails Workflow details. See `workflowDetails` Block below for details.
     * @return builder
     */
    def workflowDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.builder
      builder.workflowDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder)
    /**
     * @param onPartialUpload Trigger that starts a workflow if a file is only partially uploaded. See `onPartialUpload` Block below for details.
     * @return builder
     */
    def onPartialUpload(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnPartialUploadArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnPartialUploadArgs.builder
      builder.onPartialUpload(args(argsBuilder).build)

    /**
     * @param onUpload Trigger that starts a workflow: the workflow begins to execute after a file is uploaded. See `onUpload` Block below for details.
     * @return builder
     */
    def onUpload(args: Endofunction[com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnUploadArgs.Builder]):
        com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.ServerWorkflowDetailsOnUploadArgs.builder
      builder.onUpload(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.UserState.Builder)
    /**
     * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See `homeDirectoryMappings` Block below.
     * @return builder
     */
    def homeDirectoryMappings(args: Endofunction[com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs.builder
      builder.homeDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param posixProfile Full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See `posixProfile` Block below.
     * @return builder
     */
    def posixProfile(args: Endofunction[com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.Builder]):
        com.pulumi.aws.transfer.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.UserPosixProfileArgs.builder
      builder.posixProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder)
    /**
     * @param vpc Block defining VPC configuration for hosting the web app endpoint within a VPC. See `vpc` Block below.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsVpcArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder)
    /**
     * @param identityCenterConfig Block that describes the values to use for the IAM Identity Center settings. See `identityCenterConfig` Block below.
     * @return builder
     */
    def identityCenterConfig(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsIdentityCenterConfigArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsIdentityCenterConfigArgs.builder
      builder.identityCenterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WebAppState.Builder)
    /**
     * @param endpointDetails Block for the endpoint configuration for the web app. If not specified, the web app will be created with a public endpoint. See `endpointDetails` Block below.
     * @return builder
     */
    def endpointDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppEndpointDetailsArgs.builder
      builder.endpointDetails(args(argsBuilder).build)

    /**
     * @param identityProviderDetails Block for details of the identity provider to use with the web app. See `identityProviderDetails` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def identityProviderDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WebAppState.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WebAppIdentityProviderDetailsArgs.builder
      builder.identityProviderDetails(args(argsBuilder).build)

    /**
     * @param webAppUnits Block for number of concurrent connections or the user sessions on the web app. See `webAppUnits` Block below.
     * @return builder
     */
    def webAppUnits(args: Endofunction[com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WebAppState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WebAppWebAppUnitArgs.builder
      builder.webAppUnits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder)
    /**
     * @param copyStepDetails Details for a step that performs a file copy. See `copyStepDetails` Block below.
     * @return builder
     */
    def copyStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.builder
      builder.copyStepDetails(args(argsBuilder).build)

    /**
     * @param customStepDetails Details for a step that invokes a lambda function. See `customStepDetails` Block below.
     * @return builder
     */
    def customStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCustomStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCustomStepDetailsArgs.builder
      builder.customStepDetails(args(argsBuilder).build)

    /**
     * @param decryptStepDetails Details for a step that decrypts the file. See `decryptStepDetails` Block below.
     * @return builder
     */
    def decryptStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.builder
      builder.decryptStepDetails(args(argsBuilder).build)

    /**
     * @param deleteStepDetails Details for a step that deletes the file. See `deleteStepDetails` Block below.
     * @return builder
     */
    def deleteStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDeleteStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDeleteStepDetailsArgs.builder
      builder.deleteStepDetails(args(argsBuilder).build)

    /**
     * @param tagStepDetails Details for a step that creates one or more tags. See `tagStepDetails` Block below.
     * @return builder
     */
    def tagStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.builder
      builder.tagStepDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Location for the file being copied. Use `\${Transfer:username}` in this field to parametrize the destination prefix by username. See `destinationFileLocation` Block below.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Details for the EFS file being copied. See `efsFileLocation` Block below.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Details for the S3 file being copied. See `s3FileLocation` Block below.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Location for the file being copied. Use `\${Transfer:username}` in this field to parametrize the destination prefix by username. See `destinationFileLocation` Block below.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Details for the EFS file being copied. See `efsFileLocation` Block below.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Details for the S3 file being copied. See `s3FileLocation` Block below.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.Builder)
    /**
     * @param tags Array that contains from 1 to 10 key/value pairs. See `tags` Block below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsTagArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowState.Builder)
    /**
     * @param onExceptionSteps Steps (actions) to take if errors are encountered during execution of the workflow. See `onExceptionSteps` Block below.
     * @return builder
     */
    def onExceptionSteps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs.builder
      builder.onExceptionSteps(args.map(_(argsBuilder).build)*)

    /**
     * @param steps Details for the steps that are in the specified workflow. See `steps` Block below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowState.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder)
    /**
     * @param copyStepDetails Details for a step that performs a file copy. See `copyStepDetails` Block below.
     * @return builder
     */
    def copyStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.builder
      builder.copyStepDetails(args(argsBuilder).build)

    /**
     * @param customStepDetails Details for a step that invokes a lambda function. See `customStepDetails` Block below.
     * @return builder
     */
    def customStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCustomStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCustomStepDetailsArgs.builder
      builder.customStepDetails(args(argsBuilder).build)

    /**
     * @param decryptStepDetails Details for a step that decrypts the file. See `decryptStepDetails` Block below.
     * @return builder
     */
    def decryptStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.builder
      builder.decryptStepDetails(args(argsBuilder).build)

    /**
     * @param deleteStepDetails Details for a step that deletes the file. See `deleteStepDetails` Block below.
     * @return builder
     */
    def deleteStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDeleteStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDeleteStepDetailsArgs.builder
      builder.deleteStepDetails(args(argsBuilder).build)

    /**
     * @param tagStepDetails Details for a step that creates one or more tags. See `tagStepDetails` Block below.
     * @return builder
     */
    def tagStepDetails(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.builder
      builder.tagStepDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Location for the file being copied. Use `\${Transfer:username}` in this field to parametrize the destination prefix by username. See `destinationFileLocation` Block below.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Details for the EFS file being copied. See `efsFileLocation` Block below.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Details for the S3 file being copied. See `s3FileLocation` Block below.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepCopyStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.Builder)
    /**
     * @param destinationFileLocation Location for the file being copied. Use `\${Transfer:username}` in this field to parametrize the destination prefix by username. See `destinationFileLocation` Block below.
     * @return builder
     */
    def destinationFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.builder
      builder.destinationFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder)
    /**
     * @param efsFileLocation Details for the EFS file being copied. See `efsFileLocation` Block below.
     * @return builder
     */
    def efsFileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationEfsFileLocationArgs.builder
      builder.efsFileLocation(args(argsBuilder).build)

    /**
     * @param s3FileLocation Details for the S3 file being copied. See `s3FileLocation` Block below.
     * @return builder
     */
    def s3FileLocation(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.Builder]):
        com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepDecryptStepDetailsDestinationFileLocationS3FileLocationArgs.builder
      builder.s3FileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.Builder)
    /**
     * @param tags Array that contains from 1 to 10 key/value pairs. See `tags` Block below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsTagArgs.Builder]*):
        com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.transfer.inputs.WorkflowStepTagStepDetailsTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)
