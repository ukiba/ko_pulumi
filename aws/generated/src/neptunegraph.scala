package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object neptunegraph:
  /** The `aws.neptunegraph.Graph` resource creates an Amazon Analytics Graph. */
  inline def Graph(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptunegraph.GraphArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptunegraph.GraphArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.neptunegraph.Graph(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon Neptune Analytics Private Graph Endpoint. */
  inline def PrivateGraphEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptunegraph.PrivateGraphEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.neptunegraph.PrivateGraphEndpointArgs.builder
    com.pulumi.aws.neptunegraph.PrivateGraphEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
