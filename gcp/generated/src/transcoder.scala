package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object transcoder:
  /**
   * Transcoding Job Resource
   * 
   * To get more information about Job, see:
   * 
   * * [API documentation](https://cloud.google.com/transcoder/docs/reference/rest/v1/projects.locations.jobs)
   * * How-to Guides
   *     * [Transcoder](https://cloud.google.com/transcoder/docs/)
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.transcoder.JobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.transcoder.JobArgs.builder
    com.pulumi.gcp.transcoder.Job(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Transcoding Job Template Resource
   * 
   * To get more information about JobTemplate, see:
   * 
   * * [API documentation](https://cloud.google.com/transcoder/docs/reference/rest/v1/projects.locations.jobTemplates)
   * * How-to Guides
   *     * [Transcoder](https://cloud.google.com/transcoder/docs/)
   */
  def JobTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.transcoder.JobTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.transcoder.JobTemplateArgs.builder
    com.pulumi.gcp.transcoder.JobTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
