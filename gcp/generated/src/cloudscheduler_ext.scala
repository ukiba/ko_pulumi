package jp.ukiba.ko_pulumi
package gcp

object cloudscheduler_ext:
  extension (builder: com.pulumi.gcp.cloudscheduler.JobArgs.Builder)
    /**
     * @param appEngineHttpTarget App Engine HTTP target.
     * If the job providers a App Engine HTTP target the cron will
     * send a request to the service instance
     * Structure is documented below.
     * @return builder
     */
    inline def appEngineHttpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.builder
      builder.appEngineHttpTarget(args(argsBuilder).build)

    /**
     * @param httpTarget HTTP target.
     * If the job providers a httpTarget the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * @return builder
     */
    inline def httpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param pubsubTarget Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * @return builder
     */
    inline def pubsubTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.builder
      builder.pubsubTarget(args(argsBuilder).build)

    /**
     * @param retryConfig By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * @return builder
     */
    inline def retryConfig(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder)
    /**
     * @param appEngineRouting App Engine Routing setting for the job.
     * Structure is documented below.
     * @return builder
     */
    inline def appEngineRouting(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetAppEngineRoutingArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetAppEngineRoutingArgs.builder
      builder.appEngineRouting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder)
    /**
     * @param oauthToken Contains information needed for generating an OAuth token.
     * This type of authorization should be used when sending requests to a GCP endpoint.
     * Structure is documented below.
     * @return builder
     */
    inline def oauthToken(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOauthTokenArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOauthTokenArgs.builder
      builder.oauthToken(args(argsBuilder).build)

    /**
     * @param oidcToken Contains information needed for generating an OpenID Connect token.
     * This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    inline def oidcToken(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOidcTokenArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder)
    /**
     * @param appEngineHttpTarget App Engine HTTP target.
     * If the job providers a App Engine HTTP target the cron will
     * send a request to the service instance
     * Structure is documented below.
     * @return builder
     */
    inline def appEngineHttpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs.builder
      builder.appEngineHttpTarget(args(argsBuilder).build)

    /**
     * @param httpTarget HTTP target.
     * If the job providers a httpTarget the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * @return builder
     */
    inline def httpTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param pubsubTarget Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * @return builder
     */
    inline def pubsubTarget(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetArgs.builder
      builder.pubsubTarget(args(argsBuilder).build)

    /**
     * @param retryConfig By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * @return builder
     */
    inline def retryConfig(args: Endofunction[com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudscheduler.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)
