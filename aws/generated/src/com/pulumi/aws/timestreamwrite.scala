package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object timestreamwrite:
  type TimestreamwriteFunctions = com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions
  object TimestreamwriteFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.*
  extension (self: TimestreamwriteFunctions.type)
    /** Data source for managing an AWS Timestream Write Database. */
    def getDatabase(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetDatabaseArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.timestreamwrite.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetDatabaseArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getDatabase(args(argsBuilder).build)

    /** Data source for managing an AWS Timestream Write Database. */
    def getDatabasePlain(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetDatabasePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.timestreamwrite.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetDatabasePlainArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getDatabasePlain(args(argsBuilder).build)

    /** Data source for managing an AWS Timestream Write Table. */
    def getTable(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetTableArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.timestreamwrite.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetTableArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getTable(args(argsBuilder).build)

    /** Data source for managing an AWS Timestream Write Table. */
    def getTablePlain(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.GetTablePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.timestreamwrite.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.GetTablePlainArgs.builder
      com.pulumi.aws.timestreamwrite.TimestreamwriteFunctions.getTablePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.TableArgs.Builder)
    /**
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * @return builder
     */
    def magneticStoreWriteProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.builder
      builder.magneticStoreWriteProperties(args(argsBuilder).build)

    /**
     * @param retentionProperties The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magneticStoreRetentionPeriodInDays` default to 73000 and `memoryStoreRetentionPeriodInHours` defaults to 6.
     * @return builder
     */
    def retentionProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.builder
      builder.retentionProperties(args(argsBuilder).build)

    /**
     * @param schema The schema of the table. See Schema below for more details.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder]):
        com.pulumi.aws.timestreamwrite.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  /** Provides a Timestream table resource. */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreamwrite.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreamwrite.TableArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.timestreamwrite.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Timestream database resource. */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreamwrite.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreamwrite.DatabaseArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.timestreamwrite.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.Builder)
    /**
     * @param s3Configuration Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableState.Builder)
    /**
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * @return builder
     */
    def magneticStoreWriteProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.builder
      builder.magneticStoreWriteProperties(args(argsBuilder).build)

    /**
     * @param retentionProperties The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magneticStoreRetentionPeriodInDays` default to 73000 and `memoryStoreRetentionPeriodInHours` defaults to 6.
     * @return builder
     */
    def retentionProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.builder
      builder.retentionProperties(args(argsBuilder).build)

    /**
     * @param schema The schema of the table. See Schema below for more details.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder)
    /**
     * @param magneticStoreRejectedDataLocation The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
     * @return builder
     */
    def magneticStoreRejectedDataLocation(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.builder
      builder.magneticStoreRejectedDataLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder)
    /**
     * @param compositePartitionKey A non-empty list of partition keys defining the attributes used to partition the table data. The order of the list determines the partition hierarchy. The name and type of each partition key as well as the partition key order cannot be changed after the table is created. However, the enforcement level of each partition key can be changed. See Composite Partition Key below for more details.
     * @return builder
     */
    def compositePartitionKey(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableSchemaCompositePartitionKeyArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableSchemaCompositePartitionKeyArgs.builder
      builder.compositePartitionKey(args(argsBuilder).build)
