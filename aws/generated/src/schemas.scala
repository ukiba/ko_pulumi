package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object schemas:
  /**
   * Provides an EventBridge Schema Discoverer resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def Discoverer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.schemas.DiscovererArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.schemas.DiscovererArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.schemas.Discoverer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge Schema resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.schemas.SchemaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.schemas.SchemaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.schemas.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS EventBridge Schemas Registry Policy. */
  def RegistryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.schemas.RegistryPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.schemas.RegistryPolicyArgs.builder
    
    com.pulumi.aws.schemas.RegistryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge Custom Schema Registry resource.
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.schemas.RegistryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.schemas.RegistryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.schemas.Registry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
