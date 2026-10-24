package jp.ukiba.ko_pulumi
package azure

object datashare_ext:
  extension (builder: com.pulumi.azure.datashare.AccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datashare.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.datashare.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datashare.DatasetBlobStorageArgs.Builder)
    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.Builder]):
        com.pulumi.azure.datashare.DatasetBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datashare.ShareArgs.Builder)
    /**
     * @param snapshotSchedule A `snapshotSchedule` block as defined below.
     * @return builder
     */
    def snapshotSchedule(args: Endofunction[com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.Builder]):
        com.pulumi.azure.datashare.ShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.builder
      builder.snapshotSchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datashare.inputs.AccountState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datashare.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.datashare.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datashare.inputs.DatasetBlobStorageState.Builder)
    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.Builder]):
        com.pulumi.azure.datashare.inputs.DatasetBlobStorageState.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datashare.inputs.ShareState.Builder)
    /**
     * @param snapshotSchedule A `snapshotSchedule` block as defined below.
     * @return builder
     */
    def snapshotSchedule(args: Endofunction[com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.Builder]):
        com.pulumi.azure.datashare.inputs.ShareState.Builder =
      val argsBuilder = com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs.builder
      builder.snapshotSchedule(args(argsBuilder).build)
