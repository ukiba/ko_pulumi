package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object networkfunction:
  /** Manages a Network Function Collector Policy. */
  def CollectorPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.networkfunction.CollectorPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.networkfunction.CollectorPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder)
    /**
     * @param ipfxEmission An `ipfxEmission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    def ipfxEmission(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.Builder]):
        com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.builder
      builder.ipfxEmission(args(argsBuilder).build)

    /**
     * @param ipfxIngestion An `ipfxIngestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    def ipfxIngestion(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.Builder]):
        com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.builder
      builder.ipfxIngestion(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.networkfunction.CollectorPolicyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Network Function Azure Traffic Collector. */
  def AzureTrafficCollector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.networkfunction.AzureTrafficCollectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.networkfunction.AzureTrafficCollectorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.networkfunction.AzureTrafficCollector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.networkfunction.inputs.CollectorPolicyState.Builder)
    /**
     * @param ipfxEmission An `ipfxEmission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    def ipfxEmission(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.Builder]):
        com.pulumi.azure.networkfunction.inputs.CollectorPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs.builder
      builder.ipfxEmission(args(argsBuilder).build)

    /**
     * @param ipfxIngestion An `ipfxIngestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * @return builder
     */
    def ipfxIngestion(args: Endofunction[com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.Builder]):
        com.pulumi.azure.networkfunction.inputs.CollectorPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs.builder
      builder.ipfxIngestion(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.networkfunction.inputs.CollectorPolicyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
