package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object cleanrooms:
  extension (builder: com.pulumi.aws.cleanrooms.ConfiguredTableArgs.Builder)
    /**
     * @param tableReference A reference to the AWS Glue table which will be used to create the configured table.
     *  * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
     *  * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
     * @return builder
     */
    def tableReference(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.ConfiguredTableTableReferenceArgs.Builder]):
        com.pulumi.aws.cleanrooms.ConfiguredTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.ConfiguredTableTableReferenceArgs.builder
      builder.tableReference(args(argsBuilder).build)

  /**
   * Provides a AWS Clean Rooms collaboration.
   *  All members included in the definition will be invited to join the collaboration and can create memberships.
   */
  def Collaboration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cleanrooms.CollaborationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cleanrooms.CollaborationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cleanrooms.Collaboration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.aws.cleanrooms.CollaborationArgs.Builder)
    /**
     * @param dataEncryptionMetadata a collection of settings which determine how the [c3r client](https://docs.aws.amazon.com/clean-rooms/latest/userguide/crypto-computing.html) will encrypt data for use within this collaboration.
     *  * `data_encryption_metadata.allow_clear_text` - (Required - Forces new resource) - Indicates whether encrypted tables can contain cleartext data. This is a boolea
     *    field.
     *  * `data_encryption_metadata.allow_duplicates` - (Required - Forces new resource ) - Indicates whether Fingerprint columns can contain duplicate entries. This is a
     *    boolean field.
     *  * `data_encryption_metadata.allow_joins_on_columns_with_different_names` - (Required - Forces new resource) - Indicates whether Fingerprint columns can be joined
     *    n any other Fingerprint column with a different name. This is a boolean field.
     *  * `data_encryption_metadata.preserve_nulls` - (Required - Forces new resource) - Indicates whether NULL values are to be copied as NULL to encrypted tables (true)
     *    or cryptographically processed (false).
     * @return builder
     */
    def dataEncryptionMetadata(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.Builder]):
        com.pulumi.aws.cleanrooms.CollaborationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.builder
      builder.dataEncryptionMetadata(args(argsBuilder).build)

    /**
     * @param members Additional members of the collaboration which will be invited to join the collaboration.
     *  * `member.account_id` - (Required - Forces new resource) - The account id for the invited member.
     *  * `member.display_name` - (Required - Forces new resource) - The display name for the invited member.
     *  * `member.member_abilities` - (Required - Forces new resource) - The list of abilities for the invited member. Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-creatorMemberAbilities).
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.Builder]*):
        com.pulumi.aws.cleanrooms.CollaborationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  /** Provides a AWS Clean Rooms membership. Memberships are used to join a Clean Rooms collaboration by the invited member. */
  def Membership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cleanrooms.MembershipArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cleanrooms.MembershipArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cleanrooms.Membership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a AWS Clean Rooms configured table. Configured tables are used to represent references to existing tables in the AWS Glue Data Catalog. */
  def ConfiguredTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cleanrooms.ConfiguredTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cleanrooms.ConfiguredTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cleanrooms.ConfiguredTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.CollaborationState.Builder)
    /**
     * @param dataEncryptionMetadata a collection of settings which determine how the [c3r client](https://docs.aws.amazon.com/clean-rooms/latest/userguide/crypto-computing.html) will encrypt data for use within this collaboration.
     *  * `data_encryption_metadata.allow_clear_text` - (Required - Forces new resource) - Indicates whether encrypted tables can contain cleartext data. This is a boolea
     *    field.
     *  * `data_encryption_metadata.allow_duplicates` - (Required - Forces new resource ) - Indicates whether Fingerprint columns can contain duplicate entries. This is a
     *    boolean field.
     *  * `data_encryption_metadata.allow_joins_on_columns_with_different_names` - (Required - Forces new resource) - Indicates whether Fingerprint columns can be joined
     *    n any other Fingerprint column with a different name. This is a boolean field.
     *  * `data_encryption_metadata.preserve_nulls` - (Required - Forces new resource) - Indicates whether NULL values are to be copied as NULL to encrypted tables (true)
     *    or cryptographically processed (false).
     * @return builder
     */
    def dataEncryptionMetadata(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.CollaborationState.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs.builder
      builder.dataEncryptionMetadata(args(argsBuilder).build)

    /**
     * @param members Additional members of the collaboration which will be invited to join the collaboration.
     *  * `member.account_id` - (Required - Forces new resource) - The account id for the invited member.
     *  * `member.display_name` - (Required - Forces new resource) - The display name for the invited member.
     *  * `member.member_abilities` - (Required - Forces new resource) - The list of abilities for the invited member. Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-creatorMemberAbilities).
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.Builder]*):
        com.pulumi.aws.cleanrooms.inputs.CollaborationState.Builder =
      def argsBuilder = com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.Builder)
    def queryCompute(args: Endofunction[com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationQueryComputeArgs.Builder]):
        com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cleanrooms.inputs.MembershipPaymentConfigurationQueryComputeArgs.builder
      builder.queryCompute(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cleanrooms.inputs.ConfiguredTableState.Builder)
    /**
     * @param tableReference A reference to the AWS Glue table which will be used to create the configured table.
     *  * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
     *  * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
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
