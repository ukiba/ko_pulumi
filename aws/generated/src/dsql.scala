package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object dsql:
  /** Resource for managing an Amazon Aurora DSQL Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.dsql.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dsql.ClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.dsql.Cluster(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an Amazon Aurora DSQL Cluster Peering. */
  def ClusterPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.dsql.ClusterPeeringArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dsql.ClusterPeeringArgs.builder
    com.pulumi.aws.dsql.ClusterPeering(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an Amazon Aurora DSQL Cluster resource-based policy.
   * 
   * &gt; Aurora DSQL resource-based policies can grant access to principals within the same AWS account as the cluster. Cross-account access is not currently supported by Aurora DSQL resource-based policies.
   * 
   * &gt; Aurora DSQL resource-based policy changes are eventually consistent and typically take effect within one minute.
   */
  def ClusterPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.dsql.ClusterPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.dsql.ClusterPolicyArgs.builder
    com.pulumi.aws.dsql.ClusterPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
