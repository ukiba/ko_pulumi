package jp.ukiba.ko_pulumi
package aws

object timestreamwrite_ext:
  extension (builder: com.pulumi.aws.timestreamwrite.TableArgs.Builder)
    /**
     * @param magneticStoreWriteProperties Properties to set on the table when enabling magnetic store writes. See `magneticStoreWriteProperties` Block below for more details.
     * @return builder
     */
    def magneticStoreWriteProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.builder
      builder.magneticStoreWriteProperties(args(argsBuilder).build)

    /**
     * @param retentionProperties Retention duration for the memory store and magnetic store. See `retentionProperties` Block below for more details. If not provided, `magneticStoreRetentionPeriodInDays` defaults to 73000 and `memoryStoreRetentionPeriodInHours` defaults to 6.
     * @return builder
     */
    def retentionProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.builder
      builder.retentionProperties(args(argsBuilder).build)

    /**
     * @param schema Schema of the table. See `schema` Block below for more details.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder]):
        com.pulumi.aws.timestreamwrite.TableArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder)
    /**
     * @param magneticStoreRejectedDataLocation Location to write error reports for records rejected asynchronously during magnetic store writes. See `magneticStoreRejectedDataLocation` Block below for more details.
     * @return builder
     */
    def magneticStoreRejectedDataLocation(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.builder
      builder.magneticStoreRejectedDataLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.Builder)
    /**
     * @param s3Configuration Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See `s3Configuration` Block below for more details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder)
    /**
     * @param compositePartitionKey Non-empty list of partition keys defining the attributes used to partition the table data. The order of the list determines the partition hierarchy. The name and type of each partition key as well as the partition key order cannot be changed after the table is created. However, the enforcement level of each partition key can be changed. See `compositePartitionKey` Block below for more details.
     * @return builder
     */
    def compositePartitionKey(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableSchemaCompositePartitionKeyArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableSchemaCompositePartitionKeyArgs.builder
      builder.compositePartitionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamwrite.inputs.TableState.Builder)
    /**
     * @param magneticStoreWriteProperties Properties to set on the table when enabling magnetic store writes. See `magneticStoreWriteProperties` Block below for more details.
     * @return builder
     */
    def magneticStoreWriteProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesArgs.builder
      builder.magneticStoreWriteProperties(args(argsBuilder).build)

    /**
     * @param retentionProperties Retention duration for the memory store and magnetic store. See `retentionProperties` Block below for more details. If not provided, `magneticStoreRetentionPeriodInDays` defaults to 73000 and `memoryStoreRetentionPeriodInHours` defaults to 6.
     * @return builder
     */
    def retentionProperties(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesArgs.builder
      builder.retentionProperties(args(argsBuilder).build)

    /**
     * @param schema Schema of the table. See `schema` Block below for more details.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.Builder]):
        com.pulumi.aws.timestreamwrite.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamwrite.inputs.TableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)
