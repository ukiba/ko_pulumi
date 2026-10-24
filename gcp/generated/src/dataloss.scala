package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataloss:
  /**
   * A policy to apply to content based on its inspection findings.
   * 
   * To get more information about ContentPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/sensitive-data-protection/docs/reference/rest/v2/projects.locations.contentPolicies)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/sensitive-data-protection/docs)
   */
  inline def PreventionContentPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionContentPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionContentPolicyArgs.builder
    com.pulumi.gcp.dataloss.PreventionContentPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows creation of templates to de-identify content.
   * 
   * To get more information about DeidentifyTemplate, see:
   * 
   * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.deidentifyTemplates)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dlp/docs/concepts-templates)
   */
  inline def PreventionDeidentifyTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs.builder
    com.pulumi.gcp.dataloss.PreventionDeidentifyTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Configuration for discovery to scan resources for profile generation. Only one discovery configuration may exist per organization, folder, or project.
   * 
   * To get more information about DiscoveryConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.locations.discoveryConfigs)
   * * How-to Guides
   *     * [Schedule inspection scan](https://cloud.google.com/dlp/docs/schedule-inspection-scan)
   */
  inline def PreventionDiscoveryConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.builder
    com.pulumi.gcp.dataloss.PreventionDiscoveryConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An inspect job template.
   * 
   * To get more information about InspectTemplate, see:
   * 
   * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.inspectTemplates)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dlp/docs/creating-templates-inspect)
   */
  inline def PreventionInspectTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionInspectTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionInspectTemplateArgs.builder
    com.pulumi.gcp.dataloss.PreventionInspectTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A job trigger configuration.
   * 
   * To get more information about JobTrigger, see:
   * 
   * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.jobTriggers)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dlp/docs/creating-job-triggers)
   */
  inline def PreventionJobTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionJobTriggerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionJobTriggerArgs.builder
    com.pulumi.gcp.dataloss.PreventionJobTrigger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows creation of custom info types.
   * 
   * To get more information about StoredInfoType, see:
   * 
   * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.storedInfoTypes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dlp/docs/creating-stored-infotypes)
   */
  inline def PreventionStoredInfoType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.builder
    com.pulumi.gcp.dataloss.PreventionStoredInfoType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
