package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudsearch:
  /**
   * Provides an CloudSearch domain service access policy resource.
   *  
   *  The provider waits for the domain service access policy to become `Active` when applying a configuration.
   */
  def DomainServiceAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudsearch.DomainServiceAccessPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudsearch.DomainServiceAccessPolicyArgs.builder
    
    com.pulumi.aws.cloudsearch.DomainServiceAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudsearch.DomainArgs.Builder)
    /**
     * @param endpointOptions Domain endpoint options. Documented below.
     * @return builder
     */
    def endpointOptions(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.cloudsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.builder
      builder.endpointOptions(args(argsBuilder).build)

    /**
     * @param indexFields The index fields for documents added to the domain. Documented below.
     * @return builder
     */
    def indexFields(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.Builder]*):
        com.pulumi.aws.cloudsearch.DomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.builder
      builder.indexFields(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingParameters Domain scaling parameters. Documented below.
     * @return builder
     */
    def scalingParameters(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.Builder]):
        com.pulumi.aws.cloudsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.builder
      builder.scalingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudsearch.inputs.DomainState.Builder)
    /**
     * @param endpointOptions Domain endpoint options. Documented below.
     * @return builder
     */
    def endpointOptions(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.cloudsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.builder
      builder.endpointOptions(args(argsBuilder).build)

    /**
     * @param indexFields The index fields for documents added to the domain. Documented below.
     * @return builder
     */
    def indexFields(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.Builder]*):
        com.pulumi.aws.cloudsearch.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.builder
      builder.indexFields(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingParameters Domain scaling parameters. Documented below.
     * @return builder
     */
    def scalingParameters(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.Builder]):
        com.pulumi.aws.cloudsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.builder
      builder.scalingParameters(args(argsBuilder).build)

  /**
   * Provides an CloudSearch domain resource.
   *  
   *  The provider waits for the domain to become `Active` when applying a configuration.
   */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudsearch.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudsearch.DomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudsearch.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
