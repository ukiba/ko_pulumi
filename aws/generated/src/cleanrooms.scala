package jp.ukiba.ko_pulumi
package aws

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
