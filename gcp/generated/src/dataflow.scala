package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataflow:
  /**
   * The main pipeline entity and all the necessary metadata for launching and managing linked jobs.
   * 
   *  To get more information about Pipeline, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataflow)
   */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataflow.PipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataflow.PipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataflow.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a job on Dataflow, which is an implementation of Apache Beam running on Google Compute Engine. For more information see
   *  the official documentation for
   *  [Beam](https://beam.apache.org) and [Dataflow](https://cloud.google.com/dataflow/).
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataflow.JobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataflow.JobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataflow.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a [Flex Template](https://cloud.google.com/dataflow/docs/guides/templates/using-flex-templates)
   *  job on Dataflow, which is an implementation of Apache Beam running on Google
   *  Compute Engine. For more information see the official documentation for [Beam](https://beam.apache.org)
   *  and [Dataflow](https://cloud.google.com/dataflow/).
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def FlexTemplateJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataflow.FlexTemplateJobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataflow.FlexTemplateJobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataflow.FlexTemplateJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataflow.PipelineArgs.Builder)
    /**
     * @param scheduleInfo Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#schedulespec
     *  Structure is documented below.
     * @return builder
     */
    def scheduleInfo(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineScheduleInfoArgs.Builder]):
        com.pulumi.gcp.dataflow.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineScheduleInfoArgs.builder
      builder.scheduleInfo(args(argsBuilder).build)

    /**
     * @param workload Workload information for creating new jobs.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#workload
     *  Structure is documented below.
     * @return builder
     */
    def workload(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadArgs.Builder]):
        com.pulumi.gcp.dataflow.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadArgs.builder
      builder.workload(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestArgs.Builder)
    /**
     * @param launchParameters The parameters of the template to launch. This should be part of the body of the POST request.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchtemplateparameters
     *  Structure is documented below.
     * @return builder
     */
    def launchParameters(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestLaunchParametersArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestLaunchParametersArgs.builder
      builder.launchParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataflow.inputs.PipelineState.Builder)
    /**
     * @param scheduleInfo Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#schedulespec
     *  Structure is documented below.
     * @return builder
     */
    def scheduleInfo(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineScheduleInfoArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineScheduleInfoArgs.builder
      builder.scheduleInfo(args(argsBuilder).build)

    /**
     * @param workload Workload information for creating new jobs.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#workload
     *  Structure is documented below.
     * @return builder
     */
    def workload(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadArgs.builder
      builder.workload(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestLaunchParametersArgs.Builder)
    /**
     * @param environment The runtime environment for the job.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#RuntimeEnvironment
     *  Structure is documented below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestLaunchParametersEnvironmentArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestLaunchParametersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestLaunchParametersEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestArgs.Builder)
    /**
     * @param launchParameter Parameter to launch a job from a Flex Template.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplateparameter
     *  Structure is documented below.
     * @return builder
     */
    def launchParameter(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs.builder
      builder.launchParameter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataflow.inputs.PipelineWorkloadArgs.Builder)
    /**
     * @param dataflowFlexTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplaterequest
     *  Structure is documented below.
     * @return builder
     */
    def dataflowFlexTemplateRequest(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestArgs.builder
      builder.dataflowFlexTemplateRequest(args(argsBuilder).build)

    /**
     * @param dataflowLaunchTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchtemplaterequest
     *  Structure is documented below.
     * @return builder
     */
    def dataflowLaunchTemplateRequest(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestArgs.builder
      builder.dataflowLaunchTemplateRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs.Builder)
    /**
     * @param environment The runtime environment for the Flex Template job.
     *  https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#FlexTemplateRuntimeEnvironment
     *  Structure is documented below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironmentArgs.Builder]):
        com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)
