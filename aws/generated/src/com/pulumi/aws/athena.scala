package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object athena:
  /**
   * Resource for managing an AWS Athena Capacity Reservation.
   *  
   *  &gt; Destruction of this resource will both [cancel](https://docs.aws.amazon.com/athena/latest/ug/capacity-management-cancelling-a-capacity-reservation.html) and [delete](https://docs.aws.amazon.com/athena/latest/ug/capacity-management-deleting-a-capacity-reservation.html) the capacity reservation.
   */
  def CapacityReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.athena.CapacityReservationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.CapacityReservationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.athena.CapacityReservation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Athena Named Query resource. */
  def NamedQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.athena.NamedQueryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.NamedQueryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.athena.NamedQuery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an Athena Prepared Statement. */
  def PreparedStatement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.athena.PreparedStatementArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.PreparedStatementArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.athena.PreparedStatement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Athena Workgroup. */
  def Workgroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.athena.WorkgroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.WorkgroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.athena.Workgroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Athena database. */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.athena.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.athena.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.athena.DatabaseArgs.Builder)
    /**
     * @param aclConfiguration That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * @return builder
     */
    def aclConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.Builder]):
        com.pulumi.aws.athena.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.builder
      builder.aclConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  /**
   * Provides an Athena data catalog.
   *  
   *  More information about Athena and Athena data catalogs can be found in the [Athena User Guide](https://docs.aws.amazon.com/athena/latest/ug/what-is.html).
   *  
   *  &gt; **Tip:** for a more detailed explanation on the usage of `parameters`, see the [DataCatalog API documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html)
   */
  def DataCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.athena.DataCatalogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.DataCatalogArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.athena.DataCatalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type AthenaFunctions = com.pulumi.aws.athena.AthenaFunctions
  object AthenaFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.athena.AthenaFunctions.*
  extension (self: AthenaFunctions.type)
    /** Provides an Athena Named Query data source. */
    def getNamedQuery(args: Endofunction[com.pulumi.aws.athena.inputs.GetNamedQueryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.athena.outputs.GetNamedQueryResult] =
      val argsBuilder = com.pulumi.aws.athena.inputs.GetNamedQueryArgs.builder
      com.pulumi.aws.athena.AthenaFunctions.getNamedQuery(args(argsBuilder).build)

    /** Provides an Athena Named Query data source. */
    def getNamedQueryPlain(args: Endofunction[com.pulumi.aws.athena.inputs.GetNamedQueryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.athena.outputs.GetNamedQueryResult] =
      val argsBuilder = com.pulumi.aws.athena.inputs.GetNamedQueryPlainArgs.builder
      com.pulumi.aws.athena.AthenaFunctions.getNamedQueryPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.WorkgroupArgs.Builder)
    /**
     * @param configuration Configuration block with various settings for the workgroup. Documented below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder]):
        com.pulumi.aws.athena.WorkgroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder)
    /**
     * @param aclConfiguration That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * @return builder
     */
    def aclConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationAclConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationAclConfigurationArgs.builder
      builder.aclConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Configuration block with encryption settings. See Encryption Configuration below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.DatabaseState.Builder)
    /**
     * @param aclConfiguration That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * @return builder
     */
    def aclConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.builder
      builder.aclConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder)
    /**
     * @param engineVersion Configuration block for the Athena Engine Versioning. For more information, see [Athena Engine Versioning](https://docs.aws.amazon.com/athena/latest/ug/engine-versions.html). See Engine Version below.
     * @return builder
     */
    def engineVersion(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationEngineVersionArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationEngineVersionArgs.builder
      builder.engineVersion(args(argsBuilder).build)

    /**
     * @param identityCenterConfiguration Configuration block to set up an IAM Identity Center enabled workgroup. See Identity Center Configuration below.
     * @return builder
     */
    def identityCenterConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationIdentityCenterConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationIdentityCenterConfigurationArgs.builder
      builder.identityCenterConfiguration(args(argsBuilder).build)

    /**
     * @param resultConfiguration Configuration block with result settings. See Result Configuration below.
     * @return builder
     */
    def resultConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.builder
      builder.resultConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.CapacityReservationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.athena.inputs.CapacityReservationState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupState.Builder)
    /**
     * @param configuration Configuration block with various settings for the workgroup. Documented below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.CapacityReservationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.athena.CapacityReservationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
