package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object agenticapplications:
  /** Represents a persona configuration for an analyst agent in Agentic Applications. */
  inline def AnalystAgentPersona(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.agenticapplications.AnalystAgentPersonaArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agenticapplications.AnalystAgentPersonaArgs.builder
    com.pulumi.gcp.agenticapplications.AnalystAgentPersona(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
