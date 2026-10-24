package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataflow:
  /**
   * Creates a [Flex Template](https://cloud.google.com/dataflow/docs/guides/templates/using-flex-templates)
   * job on Dataflow, which is an implementation of Apache Beam running on Google
   * Compute Engine. For more information see the official documentation for [Beam](https://beam.apache.org)
   * and [Dataflow](https://cloud.google.com/dataflow/).
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def FlexTemplateJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataflow.FlexTemplateJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataflow.FlexTemplateJobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataflow.FlexTemplateJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a job on Dataflow, which is an implementation of Apache Beam running on Google Compute Engine. For more information see
   * the official documentation for
   * [Beam](https://beam.apache.org) and [Dataflow](https://cloud.google.com/dataflow/).
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataflow.JobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataflow.JobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataflow.Job(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The main pipeline entity and all the necessary metadata for launching and managing linked jobs.
   * 
   * To get more information about Pipeline, see:
   * 
   * * [API documentation](https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataflow)
   */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataflow.PipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataflow.PipelineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataflow.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
