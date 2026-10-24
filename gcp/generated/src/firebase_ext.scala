package jp.ukiba.ko_pulumi
package gcp

object firebase_ext:
  extension (builder: com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder)
    /**
     * @param generativeLanguageConfig (Optional, Deprecated)
     * Configuration for using the Gemini Developer API via Firebase AI Logic.
     * Firebase AI Logic now uses a Google-managed service account to authenticate
     * requests to the Gemini Developer API and no longer requires an API key.
     * Values provided here may be silently ignored on input, and may be omitted in
     * responses.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `generativeLanguageConfig` is deprecated and will be removed in a future major release. Firebase AI Logic now uses a Google-managed service account to authenticate requests to the Gemini Developer API and no longer requires an API key.
     * @return builder
     * @deprecated `generativeLanguageConfig` is deprecated and will be removed in a future major release. Firebase AI Logic now uses a Google-managed service account to authenticate requests to the Gemini Developer API and no longer requires an API key.
     */
    @deprecated("`generativeLanguageConfig` is deprecated and will be removed in a future major release. Firebase AI Logic now uses a Google-managed service account to authenticate requests to the Gemini Developer API and no longer requires an API key.") inline def generativeLanguageConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.Builder]):
        com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.builder
      builder.generativeLanguageConfig(args(argsBuilder).build)

    /**
     * @param telemetryConfig Configuration for telemetry.
     * Telemetry is the collection of metrics, logs, and traces recorded by the
     * Firebase AI Logic backend.
     * Structure is documented below.
     * @return builder
     */
    inline def telemetryConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.Builder]):
        com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.builder
      builder.telemetryConfig(args(argsBuilder).build)

    /**
     * @param trafficFilter Configuration for traffic filtering.
     * Structure is documented below.
     * @return builder
     */
    inline def trafficFilter(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.Builder]):
        com.pulumi.gcp.firebase.AiLogicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.builder
      builder.trafficFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingBackendArgs.Builder)
    /**
     * @param codebase The connection to an external source repository to watch for event-driven
     * updates to the backend.
     * Structure is documented below.
     * @return builder
     */
    inline def codebase(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingBackendArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.builder
      builder.codebase(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingBuildArgs.Builder)
    /**
     * @param source The source for the build.
     * Structure is documented below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingBuildArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingDomainArgs.Builder)
    /**
     * @param serve The serving behavior of the domain. If specified, the domain will
     * serve content other than its Backend&#39;s live content.
     * Structure is documented below.
     * @return builder
     */
    inline def serve(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingDomainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.builder
      builder.serve(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder)
    /**
     * @param rolloutPolicy The policy for how builds and rollouts are triggered and rolled out.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutPolicy(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.builder
      builder.rolloutPolicy(args(argsBuilder).build)

    /**
     * @param target Set to manually control the desired traffic for the backend. This will
     * cause current to eventually match this value. The percentages must add
     * up to 100.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder]):
        com.pulumi.gcp.firebase.AppHostingTrafficArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.ExtensionsInstanceArgs.Builder)
    /**
     * @param config The current Config of the Extension Instance.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.Builder]):
        com.pulumi.gcp.firebase.ExtensionsInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.HostingVersionArgs.Builder)
    /**
     * @param config The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder]):
        com.pulumi.gcp.firebase.HostingVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder)
    /**
     * @param conditions A list of conditions in descending order by priority.
     * The values of the condition names must be unique.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.Builder]*):
        com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterGroups Map of parameter group names to their descriptions and grouped parameters.
     * A group&#39;s name is mutable but must be unique among groups in the config.
     * The name is limited to 256 characters and intended to be human-readable.
     * Any Unicode characters are allowed.
     * Groups have a list of parameters which allows users of the API to group
     * parameters that are associated with the same feature or theme together for
     * easy organizational access.
     * For example, a parameter group with the name &#34;Search V2&#34; may have the
     * `description` &#34;New mobile search view&#34; and contain parameters for the new
     * search&#39;s layout and font.
     * Structure is documented below.
     * @return builder
     */
    inline def parameterGroups(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder]*):
        com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.builder
      builder.parameterGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Map of parameter keys to their optional default values and optional
     * conditional values.
     * Structure is documented below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder]*):
        com.pulumi.gcp.firebase.RemoteConfigRemoteConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder)
    /**
     * @param generativeLanguageConfig (Optional, Deprecated)
     * Configuration for using the Gemini Developer API via Firebase AI Logic.
     * Firebase AI Logic now uses a Google-managed service account to authenticate
     * requests to the Gemini Developer API and no longer requires an API key.
     * Values provided here may be silently ignored on input, and may be omitted in
     * responses.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `generativeLanguageConfig` is deprecated and will be removed in a future major release. Firebase AI Logic now uses a Google-managed service account to authenticate requests to the Gemini Developer API and no longer requires an API key.
     * @return builder
     * @deprecated `generativeLanguageConfig` is deprecated and will be removed in a future major release. Firebase AI Logic now uses a Google-managed service account to authenticate requests to the Gemini Developer API and no longer requires an API key.
     */
    @deprecated("`generativeLanguageConfig` is deprecated and will be removed in a future major release. Firebase AI Logic now uses a Google-managed service account to authenticate requests to the Gemini Developer API and no longer requires an API key.") inline def generativeLanguageConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigGenerativeLanguageConfigArgs.builder
      builder.generativeLanguageConfig(args(argsBuilder).build)

    /**
     * @param telemetryConfig Configuration for telemetry.
     * Telemetry is the collection of metrics, logs, and traces recorded by the
     * Firebase AI Logic backend.
     * Structure is documented below.
     * @return builder
     */
    inline def telemetryConfig(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTelemetryConfigArgs.builder
      builder.telemetryConfig(args(argsBuilder).build)

    /**
     * @param trafficFilter Configuration for traffic filtering.
     * Structure is documented below.
     * @return builder
     */
    inline def trafficFilter(args: Endofunction[com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AiLogicConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AiLogicConfigTrafficFilterArgs.builder
      builder.trafficFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.Builder)
    /**
     * @param runServices (Output)
     * A managed Cloud Run
     * [`service`](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services#resource:-service).
     * Structure is documented below.
     * @return builder
     */
    inline def runServices(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceRunServiceArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceRunServiceArgs.builder
      builder.runServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBackendState.Builder)
    /**
     * @param codebase The connection to an external source repository to watch for event-driven
     * updates to the backend.
     * Structure is documented below.
     * @return builder
     */
    inline def codebase(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBackendState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs.builder
      builder.codebase(args(argsBuilder).build)

    /**
     * @param managedResources A list of the resources managed by this backend.
     * Structure is documented below.
     * @return builder
     */
    inline def managedResources(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBackendState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBackendManagedResourceArgs.builder
      builder.managedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder)
    /**
     * @param codebase A codebase source, representing the state of the codebase
     * that the build will be created at.
     * Structure is documented below.
     * @return builder
     */
    inline def codebase(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.builder
      builder.codebase(args(argsBuilder).build)

    /**
     * @param container The URI of an Artifact Registry
     * [container
     * image](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages)
     * to use as the build source.
     * Structure is documented below.
     * @return builder
     */
    inline def container(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceContainerArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.Builder)
    /**
     * @param authors (Output)
     * Version control metadata for a user associated with a resolved codebase.
     * Currently assumes a Git user.
     * Structure is documented below.
     * @return builder
     */
    inline def authors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseAuthorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceCodebaseAuthorArgs.builder
      builder.authors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingBuildState.Builder)
    /**
     * @param errors The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * @return builder
     */
    inline def errors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildErrorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param source The source for the build.
     * Structure is documented below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingBuildState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder)
    /**
     * @param issues (Output)
     * A list of issues with domain configuration. Allows users to self-correct
     * problems with DNS records.
     * Structure is documented below.
     * @return builder
     */
    inline def issues(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusIssueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusIssueArgs.builder
      builder.issues(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDnsUpdates (Output)
     * Lists the records that must added or removed to a custom domain&#39;s DNS
     * in order to finish setup and start serving content.
     * Field is present during onboarding. Also present after onboarding if one
     * or more of the above states is not *_ACTIVE, indicating the domain&#39;s DNS
     * records are in a bad state.
     * Structure is documented below.
     * @return builder
     */
    inline def requiredDnsUpdates(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.builder
      builder.requiredDnsUpdates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder)
    /**
     * @param desireds (Output)
     * The set of DNS records App Hosting needs in order to be able to serve
     * secure content on the domain.
     * Structure is documented below.
     * @return builder
     */
    inline def desireds(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.builder
      builder.desireds(args.map(_(argsBuilder).build)*)

    /**
     * @param discovereds (Output)
     * The set of DNS records App Hosting discovered when inspecting a domain.
     * Structure is documented below.
     * @return builder
     */
    inline def discovereds(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.builder
      builder.discovereds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder)
    /**
     * @param checkErrors (Output)
     * The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * @return builder
     */
    inline def checkErrors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredCheckErrorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredCheckErrorArgs.builder
      builder.checkErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param records (Output)
     * Records on the domain.
     * Structure is documented below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder)
    /**
     * @param checkErrors (Output)
     * The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * @return builder
     */
    inline def checkErrors(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredCheckErrorArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredCheckErrorArgs.builder
      builder.checkErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param records (Output)
     * Records on the domain.
     * Structure is documented below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder)
    /**
     * @param redirect Specifies redirect behavior for a domain.
     * Structure is documented below.
     * @return builder
     */
    inline def redirect(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainServeRedirectArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainServeRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingDomainState.Builder)
    /**
     * @param customDomainStatuses The status of a custom domain&#39;s linkage to the Backend.
     * Structure is documented below.
     * @return builder
     */
    inline def customDomainStatuses(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainCustomDomainStatusArgs.builder
      builder.customDomainStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param serve The serving behavior of the domain. If specified, the domain will
     * serve content other than its Backend&#39;s live content.
     * Structure is documented below.
     * @return builder
     */
    inline def serve(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingDomainState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingDomainServeArgs.builder
      builder.serve(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.Builder)
    /**
     * @param splits (Output)
     * A list of traffic splits that together represent where traffic is being routed.
     * Structure is documented below.
     * @return builder
     */
    inline def splits(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentSplitArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentSplitArgs.builder
      builder.splits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder)
    /**
     * @param currents Current state of traffic allocation for the backend.
     * When setting `target`, this field may differ for some time until the desired state is reached.
     * Structure is documented below.
     * @return builder
     */
    inline def currents(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficCurrentArgs.builder
      builder.currents(args.map(_(argsBuilder).build)*)

    /**
     * @param rolloutPolicy The policy for how builds and rollouts are triggered and rolled out.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutPolicy(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficRolloutPolicyArgs.builder
      builder.rolloutPolicy(args(argsBuilder).build)

    /**
     * @param target Set to manually control the desired traffic for the backend. This will
     * cause current to eventually match this value. The percentages must add
     * up to 100.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder)
    /**
     * @param splits A list of traffic splits that together represent where traffic is being routed.
     * Structure is documented below.
     * @return builder
     */
    inline def splits(args: Endofunction[com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetSplitArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.AppHostingTrafficTargetSplitArgs.builder
      builder.splits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder)
    /**
     * @param fatalError The fatal error state for the extension instance
     * Structure is documented below.
     * @return builder
     */
    inline def fatalError(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataFatalErrorArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataFatalErrorArgs.builder
      builder.fatalError(args(argsBuilder).build)

    /**
     * @param processingState The processing state for the extension instance
     * Structure is documented below.
     * @return builder
     */
    inline def processingState(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataProcessingStateArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataProcessingStateArgs.builder
      builder.processingState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder)
    /**
     * @param config The current Config of the Extension Instance.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param errorStatuses If this Instance has `state: ERRORED`, the error messages
     * will be found here.
     * Structure is documented below.
     * @return builder
     */
    inline def errorStatuses(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceErrorStatusArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceErrorStatusArgs.builder
      builder.errorStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param runtimeDatas Data set by the extension instance at runtime.
     * Structure is documented below.
     * @return builder
     */
    inline def runtimeDatas(args: Endofunction[com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.ExtensionsInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.ExtensionsInstanceRuntimeDataArgs.builder
      builder.runtimeDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.Builder)
    /**
     * @param verification A set of ACME challenges you can add to your DNS records or existing,
     * non-Hosting hosting provider to allow Hosting to create an SSL certificate
     * for your domain name before you point traffic toward hosting. You can use
     * thse challenges as part of a zero downtime transition from your old
     * provider to Hosting.
     * Structure is documented below.
     * @return builder
     */
    inline def verification(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.builder
      builder.verification(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder)
    /**
     * @param dns A `TXT` record to add to your DNS records that confirms your intent to
     * let Hosting create an SSL cert for your domain name.
     * Structure is documented below.
     * @return builder
     */
    inline def dns(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param http A file to add to your existing, non-Hosting hosting service that confirms
     * your intent to let Hosting create an SSL cert for your domain name.
     * Structure is documented below.
     * @return builder
     */
    inline def http(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationHttpArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationHttpArgs.builder
      builder.http(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder)
    /**
     * @param desireds A text string to serve at the path.
     * @return builder
     */
    inline def desireds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.builder
      builder.desireds(args.map(_(argsBuilder).build)*)

    /**
     * @param discovereds Whether Hosting was able to find the required file contents on the
     * specified path during its last check.
     * @return builder
     */
    inline def discovereds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.builder
      builder.discovereds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.Builder)
    /**
     * @param records Records on the domain
     * Structure is documented below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDesiredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.Builder)
    /**
     * @param records Records on the domain
     * Structure is documented below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder)
    /**
     * @param desireds A text string to serve at the path.
     * @return builder
     */
    inline def desireds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.builder
      builder.desireds(args.map(_(argsBuilder).build)*)

    /**
     * @param discovereds Whether Hosting was able to find the required file contents on the
     * specified path during its last check.
     * @return builder
     */
    inline def discovereds(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.builder
      builder.discovereds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.Builder)
    /**
     * @param records Records on the domain
     * Structure is documented below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDesiredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.Builder)
    /**
     * @param records Records on the domain
     * Structure is documented below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredRecordArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder)
    /**
     * @param certs The SSL certificate Hosting has for this `CustomDomain`&#39;s domain name.
     * For new `CustomDomain`s, this often represents Hosting&#39;s intent to create
     * a certificate, rather than an actual cert. Check the `state` field for
     * more.
     * Structure is documented below.
     * @return builder
     */
    inline def certs(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertArgs.builder
      builder.certs(args.map(_(argsBuilder).build)*)

    /**
     * @param issues A set of errors Hosting systems encountered when trying to establish
     * Hosting&#39;s ability to serve secure content for your domain name. Resolve
     * these issues to ensure your `CustomDomain` behaves properly.
     * Structure is documented below.
     * @return builder
     */
    inline def issues(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainIssueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainIssueArgs.builder
      builder.issues(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDnsUpdates A set of updates you should make to the domain name&#39;s DNS records to
     * let Hosting serve secure content on its behalf.
     * Structure is documented below.
     * @return builder
     */
    inline def requiredDnsUpdates(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingCustomDomainState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingCustomDomainRequiredDnsUpdateArgs.builder
      builder.requiredDnsUpdates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder)
    /**
     * @param headers An array of objects, where each object specifies a URL pattern that, if matched to the request URL path,
     * triggers Hosting to apply the specified custom response headers.
     * Structure is documented below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigHeaderArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param redirects An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path,
     * triggers Hosting to respond with a redirect to the specified destination path.
     * Structure is documented below.
     * @return builder
     */
    inline def redirects(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigRedirectArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigRedirectArgs.builder
      builder.redirects(args.map(_(argsBuilder).build)*)

    /**
     * @param rewrites An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the
     * request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
     * Structure is documented below.
     * @return builder
     */
    inline def rewrites(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.Builder)
    /**
     * @param run The request will be forwarded to Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    inline def run(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteRunArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteRunArgs.builder
      builder.run(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.HostingVersionState.Builder)
    /**
     * @param config The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.HostingVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder)
    /**
     * @param conditionalValues The conditionName of the highest priority
     * (the one listed first in the RemoteConfig&#39;s conditions list) determines
     * the value of this parameter.
     * Only one of useInAppDefault or value may be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def conditionalValues(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterConditionalValueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterConditionalValueArgs.builder
      builder.conditionalValues(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultValue Value to set the parameter to, when none of the named conditions evaluate to true.
     * Only one of useInAppDefault or value may be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultValue(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterDefaultValueArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterDefaultValueArgs.builder
      builder.defaultValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder)
    /**
     * @param parameters Map of parameter keys to their optional default values and optional
     * conditional values for parameters that belong to this group.
     * A parameter only appears once per RemoteConfig: an ungrouped parameter
     * appears at the top level; a parameter organized within a group appears
     * within its group&#39;s map of parameters.
     * Structure is documented below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder)
    /**
     * @param conditionalValues The conditionName of the highest priority
     * (the one listed first in the RemoteConfig&#39;s conditions list) determines
     * the value of this parameter.
     * Only one of useInAppDefault or value may be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def conditionalValues(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterConditionalValueArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterConditionalValueArgs.builder
      builder.conditionalValues(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultValue Value to set the parameter to, when none of the named conditions evaluate to true.
     * Only one of useInAppDefault or value may be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultValue(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterDefaultValueArgs.Builder]):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupParameterDefaultValueArgs.builder
      builder.defaultValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder)
    /**
     * @param conditions A list of conditions in descending order by priority.
     * The values of the condition names must be unique.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterGroups Map of parameter group names to their descriptions and grouped parameters.
     * A group&#39;s name is mutable but must be unique among groups in the config.
     * The name is limited to 256 characters and intended to be human-readable.
     * Any Unicode characters are allowed.
     * Groups have a list of parameters which allows users of the API to group
     * parameters that are associated with the same feature or theme together for
     * easy organizational access.
     * For example, a parameter group with the name &#34;Search V2&#34; may have the
     * `description` &#34;New mobile search view&#34; and contain parameters for the new
     * search&#39;s layout and font.
     * Structure is documented below.
     * @return builder
     */
    inline def parameterGroups(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterGroupArgs.builder
      builder.parameterGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters Map of parameter keys to their optional default values and optional
     * conditional values.
     * Structure is documented below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param versions Contains all metadata about a particular version of the Remote Config
     * template.
     * All fields are set at the time the specified Remote Config template was
     * written.
     * Structure is documented below.
     * @return builder
     */
    inline def versions(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.Builder)
    /**
     * @param updateUsers (Output)
     * All the fields associated with the person/service account that wrote a
     * Remote Config template.
     * Structure is documented below.
     * @return builder
     */
    inline def updateUsers(args: Endofunction[com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionUpdateUserArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.RemoteConfigRemoteConfigVersionUpdateUserArgs.builder
      builder.updateUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.firebase.inputs.StorageDefaultBucketState.Builder)
    /**
     * @param buckets The resource name of the underlying Google Cloud Storage bucket.
     * Structure is documented below.
     * @return builder
     */
    inline def buckets(args: Endofunction[com.pulumi.gcp.firebase.inputs.StorageDefaultBucketBucketArgs.Builder]*):
        com.pulumi.gcp.firebase.inputs.StorageDefaultBucketState.Builder =
      def argsBuilder = com.pulumi.gcp.firebase.inputs.StorageDefaultBucketBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)
