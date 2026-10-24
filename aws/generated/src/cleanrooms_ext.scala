package jp.ukiba.ko_pulumi
package aws

object cleanrooms_ext:
  extension (builder: com.pulumi.aws.cleanrooms.CollaborationArgs.Builder)
    /**
     * @param dataEncryptionMetadata Collection of settings which determine how the [c3r client](https://docs.aws.amazon.com/clean-rooms/latest/userguide/crypto-computing.html) will encrypt data for use within this collaboration. See below.
     * @return builder
     */
    def dataEncryptionMetadata(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.Builder]):
        com.pulumi.aws.cleanrooms.CollaborationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.builder
      builder.dataEncryptionMetadata(args(argsBuilder).build)

    /**
     * @param members Additional members of the collaboration which will be invited to join the collaboration. See below.
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.Builder]*):
        com.pulumi.aws.cleanrooms.CollaborationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cleanrooms.ConfiguredTableArgs.Builder)
    /**
     * @param tableReference A reference to the AWS Glue table which will be used to create the configured table.
     * * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
     * * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
     * @return builder
     */
    def tableReference(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.ConfiguredTableTableReferenceArgs.Builder]):
        com.pulumi.aws.cleanrooms.ConfiguredTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.ConfiguredTableTableReferenceArgs.builder
      builder.tableReference(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cleanrooms.MembershipArgs.Builder)
    /**
     * @param defaultResultConfiguration The default configuration for a query result.
     * @return builder
     */
    def defaultResultConfiguration(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationArgs.Builder]):
        com.pulumi.aws.cleanrooms.MembershipArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationArgs.builder
      builder.defaultResultConfiguration(args(argsBuilder).build)

    def paymentConfiguration(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.Builder]):
        com.pulumi.aws.cleanrooms.MembershipArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.builder
      builder.paymentConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.CollaborationState.Builder)
    /**
     * @param dataEncryptionMetadata Collection of settings which determine how the [c3r client](https://docs.aws.amazon.com/clean-rooms/latest/userguide/crypto-computing.html) will encrypt data for use within this collaboration. See below.
     * @return builder
     */
    def dataEncryptionMetadata(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.CollaborationState.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.builder
      builder.dataEncryptionMetadata(args(argsBuilder).build)

    /**
     * @param members Additional members of the collaboration which will be invited to join the collaboration. See below.
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.Builder]*):
        com.pulumi.aws.cleanrooms.inputs.CollaborationState.Builder =
      def argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.ConfiguredTableState.Builder)
    /**
     * @param tableReference A reference to the AWS Glue table which will be used to create the configured table.
     * * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
     * * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
     * @return builder
     */
    def tableReference(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.ConfiguredTableTableReferenceArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.ConfiguredTableState.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.ConfiguredTableTableReferenceArgs.builder
      builder.tableReference(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationArgs.Builder)
    def outputConfiguration(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationOutputConfigurationArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationOutputConfigurationArgs.builder
      builder.outputConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationOutputConfigurationArgs.Builder)
    def s3(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationOutputConfigurationS3Args.Builder]):
        com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationOutputConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationOutputConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.Builder)
    def queryCompute(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationQueryComputeArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationQueryComputeArgs.builder
      builder.queryCompute(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.MembershipState.Builder)
    /**
     * @param defaultResultConfiguration The default configuration for a query result.
     * @return builder
     */
    def defaultResultConfiguration(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.MembershipState.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipDefaultResultConfigurationArgs.builder
      builder.defaultResultConfiguration(args(argsBuilder).build)

    def paymentConfiguration(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.MembershipState.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.builder
      builder.paymentConfiguration(args(argsBuilder).build)
