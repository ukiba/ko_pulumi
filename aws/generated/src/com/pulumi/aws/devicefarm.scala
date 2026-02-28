package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object devicefarm:
  /**
   * Provides a resource to manage AWS Device Farm Instance Profiles.
   *  \u2202
   *  &gt; **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
   */
  def InstanceProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devicefarm.InstanceProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.devicefarm.InstanceProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.devicefarm.InstanceProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.devicefarm.DevicePoolArgs.Builder)
    /**
     * @param rules The device pool&#39;s rules. See Rule.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.Builder]*):
        com.pulumi.aws.devicefarm.DevicePoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage AWS Device Farm Test Grid Projects.
   *  
   *  &gt; **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
   */
  def TestGridProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devicefarm.TestGridProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.devicefarm.TestGridProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.devicefarm.TestGridProject(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage AWS Device Farm Device Pools. */
  def DevicePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devicefarm.DevicePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.devicefarm.DevicePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.devicefarm.DevicePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.devicefarm.TestGridProjectArgs.Builder)
    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. See VPC Config below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.Builder]):
        com.pulumi.aws.devicefarm.TestGridProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  /**
   * Provides a resource to manage AWS Device Farm Network Profiles.
   *  \u2202
   *  &gt; **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
   */
  def NetworkProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devicefarm.NetworkProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.devicefarm.NetworkProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.devicefarm.NetworkProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage AWS Device Farm Projects.
   *  
   *  For more information about Device Farm Projects, see the AWS Documentation on
   *  [Device Farm Projects][aws-get-project].
   *  
   *  &gt; **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devicefarm.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.devicefarm.ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.devicefarm.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage AWS Device Farm Uploads.
   *  
   *  &gt; **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
   */
  def Upload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devicefarm.UploadArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.devicefarm.UploadArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.devicefarm.Upload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.devicefarm.inputs.TestGridProjectState.Builder)
    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. See VPC Config below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.Builder]):
        com.pulumi.aws.devicefarm.inputs.TestGridProjectState.Builder =
      val argsBuilder = com.pulumi.aws.devicefarm.inputs.TestGridProjectVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devicefarm.inputs.DevicePoolState.Builder)
    /**
     * @param rules The device pool&#39;s rules. See Rule.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.Builder]*):
        com.pulumi.aws.devicefarm.inputs.DevicePoolState.Builder =
      def argsBuilder = com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)
