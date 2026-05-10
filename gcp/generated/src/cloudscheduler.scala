package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudscheduler:
  /**
   * A scheduled job that can publish a PubSub message or an HTTP request
   *  every X interval of time, using a crontab format string.
   * 
   *  To get more information about Job, see:
   * 
   *  * [API documentation](https://cloud.google.com/scheduler/docs/reference/rest/)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/scheduler/)
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudscheduler.JobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudscheduler.JobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudscheduler.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudscheduler.JobArgs.Builder)
    /**
     * @param appEngineHttpTarget App Engine HTTP target.
     *  If the job providers a App Engine HTTP target the cron will
     *  send a request to the service instance
     *  Structure is documented below.
     * @return builder
     */
    def appEngineHttpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.builder
      builder.appEngineHttpTarget(args(argsBuilder).build)

    /**
     * @param httpTarget HTTP target.
     *  If the job providers a httpTarget the cron will
     *  send a request to the targeted url
     *  Structure is documented below.
     * @return builder
     */
    def httpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param pubsubTarget Pub/Sub target
     *  If the job providers a Pub/Sub target the cron will publish
     *  a message to the provided topic
     *  Structure is documented below.
     * @return builder
     */
    def pubsubTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.builder
      builder.pubsubTarget(args(argsBuilder).build)

    /**
     * @param retryConfig By default, if a job does not complete successfully,
     *  meaning that an acknowledgement is not received from the handler,
     *  then it will be retried with exponential backoff according to the settings
     *  Structure is documented below.
     * @return builder
     */
    def retryConfig(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder)
    /**
     * @param appEngineRouting App Engine Routing setting for the job.
     *  Structure is documented below.
     * @return builder
     */
    def appEngineRouting(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetAppEngineRoutingArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetAppEngineRoutingArgs.builder
      builder.appEngineRouting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder)
    /**
     * @param appEngineHttpTarget App Engine HTTP target.
     *  If the job providers a App Engine HTTP target the cron will
     *  send a request to the service instance
     *  Structure is documented below.
     * @return builder
     */
    def appEngineHttpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.builder
      builder.appEngineHttpTarget(args(argsBuilder).build)

    /**
     * @param httpTarget HTTP target.
     *  If the job providers a httpTarget the cron will
     *  send a request to the targeted url
     *  Structure is documented below.
     * @return builder
     */
    def httpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param pubsubTarget Pub/Sub target
     *  If the job providers a Pub/Sub target the cron will publish
     *  a message to the provided topic
     *  Structure is documented below.
     * @return builder
     */
    def pubsubTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.builder
      builder.pubsubTarget(args(argsBuilder).build)

    /**
     * @param retryConfig By default, if a job does not complete successfully,
     *  meaning that an acknowledgement is not received from the handler,
     *  then it will be retried with exponential backoff according to the settings
     *  Structure is documented below.
     * @return builder
     */
    def retryConfig(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder)
    /**
     * @param oauthToken Contains information needed for generating an OAuth token.
     *  This type of authorization should be used when sending requests to a GCP endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def oauthToken(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOauthTokenArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOauthTokenArgs.builder
      builder.oauthToken(args(argsBuilder).build)

    /**
     * @param oidcToken Contains information needed for generating an OpenID Connect token.
     *  This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
     *  Structure is documented below.
     * @return builder
     */
    def oidcToken(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOidcTokenArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)
