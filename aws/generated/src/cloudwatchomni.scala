package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudwatchomni:
  /**
   * Manages a CloudWatch Omni Access Grant. An access grant gives a principal a permission within a CloudWatch Omni space.
   * 
   * &gt; **NOTE:** CloudWatch Omni does not support updating an access grant, so changing any argument other than `tags` replaces it. Tags are updated in place.
   * 
   * &gt; **NOTE:** Except for `CUSTOM` grants, a principal can hold only one grant of each permission in a space. Creating a duplicate returns `ConflictException`.
   * 
   * &gt; **NOTE:** CloudWatch Omni creates service-managed access grants alongside each space. They cannot be deleted and are not managed by this resource.
   */
  inline def AccessGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.AccessGrantArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.AccessGrantArgs.builder
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
    com.pulumi.aws.cloudwatchomni.AccessGrant(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon CloudWatch Omni access profile.
   * 
   * An access profile belongs to a space and is referenced by access grants to authorize principals in that space.
   * 
   * &gt; **NOTE:** An access profile cannot be deleted while access grants reference it.
   */
  inline def AccessProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.AccessProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.AccessProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatchomni.AccessProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon CloudWatch Omni domain.
   * 
   * A domain is the top-level container for CloudWatch Omni. It configures how users sign in and contains the spaces that hold telemetry. An account can have one domain.
   * 
   * &gt; **NOTE:** A domain cannot be deleted while it contains spaces.
   */
  inline def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.DomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatchomni.Domain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CloudWatch Omni Space. A space is the container that holds your observability data within a CloudWatch Omni domain.
   * 
   * &gt; **NOTE:** CloudWatch Omni allows only **one space per AWS account per region**. Creating a second space in the same region returns `ConflictException`. A space in a different region is permitted, and a space does not have to be in the same region as its domain.
   * 
   * &gt; **NOTE:** CloudWatch Omni is not available in every region. In unsupported regions the API returns `AccessDeniedException`.
   */
  inline def Space(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.SpaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.SpaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatchomni.Space(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon CloudWatch Omni view.
   * 
   * A view is a named, reusable SQL query over CloudWatch telemetry. It stores the query, not the data: each time the view is queried, its definition runs against the underlying data. See the [CloudWatch SQL query reference](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/omni-sql-query-reference.html) for the query syntax.
   */
  inline def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.ViewArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.ViewArgs.builder
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
    com.pulumi.aws.cloudwatchomni.View(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
