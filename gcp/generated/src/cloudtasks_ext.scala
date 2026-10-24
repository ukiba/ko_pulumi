package jp.ukiba.ko_pulumi
package gcp

object cloudtasks_ext:
  extension (builder: com.pulumi.gcp.cloudtasks.QueueArgs.Builder)
    /**
     * @param appEngineRoutingOverride Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * @return builder
     */
    inline def appEngineRoutingOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.builder
      builder.appEngineRoutingOverride(args(argsBuilder).build)

    /**
     * @param httpTarget Modifies HTTP target for HTTP tasks.
     * Structure is documented below.
     * @return builder
     */
    inline def httpTarget(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param rateLimits Rate limits for task dispatches.
     * The queue&#39;s actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * @return builder
     */
    inline def rateLimits(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.builder
      builder.rateLimits(args(argsBuilder).build)

    /**
     * @param retryConfig Settings that determine the retry behavior.
     * Structure is documented below.
     * @return builder
     */
    inline def retryConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

    /**
     * @param stackdriverLoggingConfig Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * @return builder
     */
    inline def stackdriverLoggingConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.builder
      builder.stackdriverLoggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder)
    /**
     * @param headerOverrides HTTP target headers.
     * This map contains the header field names and values.
     * Headers will be set when running the CreateTask and/or BufferTask.
     * These headers represent a subset of the headers that will be configured for the task&#39;s HTTP request.
     * Some HTTP request headers will be ignored or replaced.
     * Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values.
     * The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
     * Structure is documented below.
     * @return builder
     */
    inline def headerOverrides(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.Builder]*):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.builder
      builder.headerOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param oauthToken If specified, an OAuth token is generated and attached as the Authorization header in the HTTP request.
     * This type of authorization should generally be used only when calling Google APIs hosted on *.googleapis.com.
     * Note that both the service account email and the scope MUST be specified when using the queue-level authorization override.
     * Structure is documented below.
     * @return builder
     */
    inline def oauthToken(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOauthTokenArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOauthTokenArgs.builder
      builder.oauthToken(args(argsBuilder).build)

    /**
     * @param oidcToken If specified, an OIDC token is generated and attached as an Authorization header in the HTTP request.
     * This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * Note that both the service account email and the audience MUST be specified when using the queue-level authorization override.
     * Structure is documented below.
     * @return builder
     */
    inline def oidcToken(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOidcTokenArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)

    /**
     * @param uriOverride URI override.
     * When specified, overrides the execution URI for all the tasks in the queue.
     * Structure is documented below.
     * @return builder
     */
    inline def uriOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.builder
      builder.uriOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.Builder)
    /**
     * @param header Header embodying a key and a value.
     * Structure is documented below.
     * @return builder
     */
    inline def header(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideHeaderArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideHeaderArgs.builder
      builder.header(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder)
    /**
     * @param pathOverride URI path.
     * When specified, replaces the existing path of the task URL.
     * Setting the path value to an empty string clears the URI path segment.
     * Structure is documented below.
     * @return builder
     */
    inline def pathOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverridePathOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverridePathOverrideArgs.builder
      builder.pathOverride(args(argsBuilder).build)

    /**
     * @param queryOverride URI query.
     * When specified, replaces the query part of the task URI. Setting the query value to an empty string clears the URI query segment.
     * Structure is documented below.
     * @return builder
     */
    inline def queryOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideQueryOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideQueryOverrideArgs.builder
      builder.queryOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder)
    /**
     * @param appEngineRoutingOverride Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * @return builder
     */
    inline def appEngineRoutingOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.builder
      builder.appEngineRoutingOverride(args(argsBuilder).build)

    /**
     * @param httpTarget Modifies HTTP target for HTTP tasks.
     * Structure is documented below.
     * @return builder
     */
    inline def httpTarget(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param rateLimits Rate limits for task dispatches.
     * The queue&#39;s actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * @return builder
     */
    inline def rateLimits(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.builder
      builder.rateLimits(args(argsBuilder).build)

    /**
     * @param retryConfig Settings that determine the retry behavior.
     * Structure is documented below.
     * @return builder
     */
    inline def retryConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

    /**
     * @param stackdriverLoggingConfig Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * @return builder
     */
    inline def stackdriverLoggingConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.builder
      builder.stackdriverLoggingConfig(args(argsBuilder).build)
