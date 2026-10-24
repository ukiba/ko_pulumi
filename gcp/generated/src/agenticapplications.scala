package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object agenticapplications:
  /** Represents a persona configuration for an analyst agent in Agentic Applications. */
  def AnalystAgentPersona(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.agenticapplications.AnalystAgentPersonaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agenticapplications.AnalystAgentPersonaArgs.builder
    com.pulumi.gcp.agenticapplications.AnalystAgentPersona(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
