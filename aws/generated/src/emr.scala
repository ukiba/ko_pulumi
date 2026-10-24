package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object emr:
  /** Resource for managing an AWS EMR block public access configuration. This region level security configuration restricts the launch of EMR clusters that have associated security groups permitting public access on unspecified ports. See the [EMR Block Public Access Configuration](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-block-public-access.html) documentation for further information. */
  def BlockPublicAccessConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.BlockPublicAccessConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.emr.BlockPublicAccessConfigurationArgs.builder
    com.pulumi.aws.emr.BlockPublicAccessConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Elastic MapReduce Cluster, a web service that makes it easy to process large amounts of data efficiently. See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/elastic-mapreduce/) for more information.
   * 
   * To configure [Instance Groups](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for [task nodes](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-task), see the `aws.emr.InstanceGroup` resource.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emr.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.emr.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object EmrFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieve information about EMR Release Labels. */
    inline def getReleaseLabels(args: Endofunction[com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.emr.outputs.GetReleaseLabelsResult] =
      val argsBuilder = com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs.builder
      com.pulumi.aws.emr.EmrFunctions.getReleaseLabels(args(argsBuilder).build)

    /** Retrieve information about EMR Release Labels. */
    inline def getReleaseLabelsPlain(args: Endofunction[com.pulumi.aws.emr.inputs.GetReleaseLabelsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.emr.outputs.GetReleaseLabelsResult] =
      val argsBuilder = com.pulumi.aws.emr.inputs.GetReleaseLabelsPlainArgs.builder
      com.pulumi.aws.emr.EmrFunctions.getReleaseLabelsPlain(args(argsBuilder).build)

    /** Data source for managing AWS EMR Supported Instance Types. */
    inline def getSupportedInstanceTypes(args: Endofunction[com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.emr.outputs.GetSupportedInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs.builder
      com.pulumi.aws.emr.EmrFunctions.getSupportedInstanceTypes(args(argsBuilder).build)

    /** Data source for managing AWS EMR Supported Instance Types. */
    inline def getSupportedInstanceTypesPlain(args: Endofunction[com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.emr.outputs.GetSupportedInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesPlainArgs.builder
      com.pulumi.aws.emr.EmrFunctions.getSupportedInstanceTypesPlain(args(argsBuilder).build)

  /**
   * Provides an Elastic MapReduce Cluster Instance Fleet configuration.
   * See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/emr/) for more information.
   * 
   * &gt; **NOTE:** At this time, Instance Fleets cannot be destroyed through the API nor
   * web interface. Instance Fleets are destroyed when the EMR Cluster is destroyed.
   * the provider will resize any Instance Fleet to zero when destroying the resource.
   */
  def InstanceFleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.InstanceFleetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emr.InstanceFleetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.emr.InstanceFleet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Elastic MapReduce Cluster Instance Group configuration.
   * See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/emr/) for more information.
   * 
   * &gt; **NOTE:** At this time, Instance Groups cannot be destroyed through the API nor
   * web interface. Instance Groups are destroyed when the EMR Cluster is destroyed.
   * this provider will resize any Instance Group to zero when destroying the resource.
   */
  def InstanceGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.InstanceGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emr.InstanceGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.emr.InstanceGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Managed Scaling policy for EMR Cluster. With Amazon EMR versions 5.30.0 and later (except for Amazon EMR 6.0.0), you can enable EMR managed scaling to automatically increase or decrease the number of instances or units in your cluster based on workload. See [Using EMR Managed Scaling in Amazon EMR](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-scaling.html) for more information. */
  def ManagedScalingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.ManagedScalingPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.emr.ManagedScalingPolicyArgs.builder
    com.pulumi.aws.emr.ManagedScalingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage AWS EMR Security Configurations */
  def SecurityConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.SecurityConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emr.SecurityConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.emr.SecurityConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic MapReduce Studio. */
  def Studio(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.StudioArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.emr.StudioArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.emr.Studio(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Elastic MapReduce Studio Session Mapping. */
  def StudioSessionMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.emr.StudioSessionMappingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.emr.StudioSessionMappingArgs.builder
    com.pulumi.aws.emr.StudioSessionMapping(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
