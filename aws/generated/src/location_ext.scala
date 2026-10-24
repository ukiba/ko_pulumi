package jp.ukiba.ko_pulumi
package aws

object location_ext:
  extension (builder: com.pulumi.aws.location.MapArgs.Builder)
    /**
     * @param configuration Configuration block with the map style selected from an available data provider. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.location.inputs.MapConfigurationArgs.Builder]):
        com.pulumi.aws.location.MapArgs.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.MapConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.location.PlaceIndexArgs.Builder)
    /**
     * @param dataSourceConfiguration Configuration block with the data storage option chosen for requesting Places. Detailed below.
     * @return builder
     */
    def dataSourceConfiguration(args: Endofunction[com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.location.PlaceIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.builder
      builder.dataSourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.location.inputs.MapState.Builder)
    /**
     * @param configuration Configuration block with the map style selected from an available data provider. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.location.inputs.MapConfigurationArgs.Builder]):
        com.pulumi.aws.location.inputs.MapState.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.MapConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.location.inputs.PlaceIndexState.Builder)
    /**
     * @param dataSourceConfiguration Configuration block with the data storage option chosen for requesting Places. Detailed below.
     * @return builder
     */
    def dataSourceConfiguration(args: Endofunction[com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.location.inputs.PlaceIndexState.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.builder
      builder.dataSourceConfiguration(args(argsBuilder).build)
