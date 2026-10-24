package jp.ukiba.ko_pulumi
package gcp

object cloudrunv2_ext:
  extension (builder: com.pulumi.gcp.cloudrunv2.JobArgs.Builder)
    /**
     * @param binaryAuthorization Settings for the Binary Authorization feature.
     * Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param template The template used to create executions for this Job.
     * Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateArgs.builder
      builder.template(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.JobIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.JobIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.JobIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.JobIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder)
    /**
     * @param binaryAuthorization Settings for the Binary Authorization feature.
     * Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param buildConfig Configuration for building a Cloud Run function.
     * Structure is documented below.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceBuildConfigArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param multiRegionSettings Settings for creating a Multi-Region Service. Make sure to use region = &#39;global&#39; when using them. For more information, visit https://cloud.google.com/run/docs/multiple-regions#deploy
     * Structure is documented below.
     * @return builder
     */
    def multiRegionSettings(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceMultiRegionSettingsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceMultiRegionSettingsArgs.builder
      builder.multiRegionSettings(args(argsBuilder).build)

    /**
     * @param scaling Scaling settings that apply to the whole service
     * Structure is documented below.
     * @return builder
     */
    def scaling(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceScalingArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceScalingArgs.builder
      builder.scaling(args(argsBuilder).build)

    /**
     * @param template The template used to create revisions for this Service.
     * Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    /**
     * @param traffics Specifies how to distribute traffic over a collection of Revisions belonging to the Service. If traffic is empty or not provided, defaults to 100% traffic to the latest Ready Revision.
     * Structure is documented below.
     * @return builder
     */
    def traffics(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTrafficArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTrafficArgs.builder
      builder.traffics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.WorkerPoolArgs.Builder)
    /**
     * @param binaryAuthorization Settings for the Binary Authorization feature.
     * Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.WorkerPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param instanceSplits Specifies how to distribute instances over a collection of Revisions belonging to the WorkerPool. If instance split is empty or not provided, defaults to 100% instances assigned to the latest Ready Revision.
     * Structure is documented below.
     * @return builder
     */
    def instanceSplits(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolInstanceSplitArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.WorkerPoolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolInstanceSplitArgs.builder
      builder.instanceSplits(args.map(_(argsBuilder).build)*)

    /**
     * @param scaling Scaling settings that apply to the worker pool.
     * Structure is documented below.
     * @return builder
     */
    def scaling(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolScalingArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.WorkerPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolScalingArgs.builder
      builder.scaling(args(argsBuilder).build)

    /**
     * @param template The template used to create revisions for this WorkerPool.
     * Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.WorkerPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.builder
      builder.template(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobState.Builder)
    /**
     * @param binaryAuthorization Settings for the Binary Authorization feature.
     * Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param conditions The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job does not reach its desired state. See comments in reconciling for additional information on `reconciliation` process in Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param latestCreatedExecutions Name of the last created execution.
     * Structure is documented below.
     * @return builder
     */
    def latestCreatedExecutions(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobLatestCreatedExecutionArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobLatestCreatedExecutionArgs.builder
      builder.latestCreatedExecutions(args.map(_(argsBuilder).build)*)

    /**
     * @param template The template used to create executions for this Job.
     * Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    /**
     * @param terminalConditions The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the desired state
     * Structure is documented below.
     * @return builder
     */
    def terminalConditions(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTerminalConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTerminalConditionArgs.builder
      builder.terminalConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateArgs.Builder)
    /**
     * @param template Describes the task(s) that will be created when executing an execution
     * Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.builder
      builder.template(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.Builder)
    /**
     * @param containers Holds the single container that defines the unit of execution for this task.
     * Structure is documented below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeSelector Node Selector describes the hardware requirements of the resources.
     * Structure is documented below.
     * @return builder
     */
    def nodeSelector(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateNodeSelectorArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateNodeSelectorArgs.builder
      builder.nodeSelector(args(argsBuilder).build)

    /**
     * @param volumes A list of Volumes to make available to containers.
     * Structure is documented below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccess VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * Structure is documented below.
     * @return builder
     */
    def vpcAccess(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVpcAccessArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVpcAccessArgs.builder
      builder.vpcAccess(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig (Optional, Beta)
     * The Task&#39;s workload identity settings. Used to assign an
     * [Agent Platform](https://cloud.google.com/run/docs/ai/agent-platform-features) identity to the workload.
     * Structure is documented below.
     * @return builder
     */
    def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.Builder)
    /**
     * @param envs List of environment variables to set in the container.
     * Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param ports List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible.
     * If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on
     * Structure is documented below.
     * @return builder
     */
    def ports(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerPortArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerPortArgs.builder
      builder.ports(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerResourcesArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param startupProbe Startup probe of application within the container.
     * All other probes are disabled if a startup probe is provided, until it
     * succeeds. Container will not be added to service endpoints if the probe fails.
     * Structure is documented below.
     * @return builder
     */
    def startupProbe(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeArgs.builder
      builder.startupProbe(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume to mount into the container&#39;s filesystem.
     * Structure is documented below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerVolumeMountArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvArgs.Builder)
    /**
     * @param valueSource Source for the environment variable&#39;s value.
     * Structure is documented below.
     * @return builder
     */
    def valueSource(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvValueSourceArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvValueSourceArgs.builder
      builder.valueSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvValueSourceArgs.Builder)
    /**
     * @param secretKeyRef Selects a secret and a specific version from Cloud Secret Manager.
     * Structure is documented below.
     * @return builder
     */
    def secretKeyRef(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvValueSourceSecretKeyRefArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvValueSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvValueSourceSecretKeyRefArgs.builder
      builder.secretKeyRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeArgs.Builder)
    /**
     * @param grpc GRPC specifies an action involving a GRPC port.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGet specifies the http request to perform.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocket specifies an action involving a TCP port.
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerStartupProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.Builder)
    /**
     * @param cloudSqlInstance For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def cloudSqlInstance(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeCloudSqlInstanceArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeCloudSqlInstanceArgs.builder
      builder.cloudSqlInstance(args(argsBuilder).build)

    /**
     * @param emptyDir Ephemeral storage used as a shared volume.
     * Structure is documented below.
     * @return builder
     */
    def emptyDir(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeEmptyDirArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeEmptyDirArgs.builder
      builder.emptyDir(args(argsBuilder).build)

    /**
     * @param gcs Cloud Storage bucket mounted as a volume using GCSFuse.
     * Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeGcsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param nfs NFS share mounted as a volume.
     * Structure is documented below.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeNfsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeNfsArgs.builder
      builder.nfs(args(argsBuilder).build)

    /**
     * @param secret Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * Structure is documented below.
     * @return builder
     */
    def secret(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeSecretArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeSecretArgs.Builder)
    /**
     * @param items If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * Structure is documented below.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeSecretItemArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeSecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVolumeSecretItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVpcAccessArgs.Builder)
    /**
     * @param networkInterfaces Direct VPC egress settings. Currently only single network interface is supported.
     * Structure is documented below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVpcAccessNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVpcAccessArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateVpcAccessNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder)
    /**
     * @param binaryAuthorization Settings for the Binary Authorization feature.
     * Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param buildConfig Configuration for building a Cloud Run function.
     * Structure is documented below.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceBuildConfigArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param conditions The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Service does not reach its Serving state. See comments in reconciling for additional information on reconciliation process in Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param multiRegionSettings Settings for creating a Multi-Region Service. Make sure to use region = &#39;global&#39; when using them. For more information, visit https://cloud.google.com/run/docs/multiple-regions#deploy
     * Structure is documented below.
     * @return builder
     */
    def multiRegionSettings(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceMultiRegionSettingsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceMultiRegionSettingsArgs.builder
      builder.multiRegionSettings(args(argsBuilder).build)

    /**
     * @param scaling Scaling settings that apply to the whole service
     * Structure is documented below.
     * @return builder
     */
    def scaling(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceScalingArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceScalingArgs.builder
      builder.scaling(args(argsBuilder).build)

    /**
     * @param template The template used to create revisions for this Service.
     * Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    /**
     * @param terminalConditions The Condition of this Service, containing its readiness status, and detailed error information in case it did not reach a serving state. See comments in reconciling for additional information on reconciliation process in Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def terminalConditions(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTerminalConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTerminalConditionArgs.builder
      builder.terminalConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param trafficStatuses Detailed status information for corresponding traffic targets. See comments in reconciling for additional information on reconciliation process in Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def trafficStatuses(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTrafficStatusArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTrafficStatusArgs.builder
      builder.trafficStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param traffics Specifies how to distribute traffic over a collection of Revisions belonging to the Service. If traffic is empty or not provided, defaults to 100% traffic to the latest Ready Revision.
     * Structure is documented below.
     * @return builder
     */
    def traffics(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTrafficArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTrafficArgs.builder
      builder.traffics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder)
    /**
     * @param containers Holds the containers that define the unit of execution for this Service.
     * Structure is documented below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeSelector Node Selector describes the hardware requirements of the resources.
     * Structure is documented below.
     * @return builder
     */
    def nodeSelector(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateNodeSelectorArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateNodeSelectorArgs.builder
      builder.nodeSelector(args(argsBuilder).build)

    /**
     * @param sandboxes Configuration for sandboxes.
     * Structure is documented below.
     * @return builder
     */
    def sandboxes(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesArgs.builder
      builder.sandboxes(args(argsBuilder).build)

    /**
     * @param scaling Scaling settings for this Revision.
     * Structure is documented below.
     * @return builder
     */
    def scaling(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateScalingArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateScalingArgs.builder
      builder.scaling(args(argsBuilder).build)

    /**
     * @param serviceMesh (Optional, Beta)
     * Enables Cloud Service Mesh for this Revision.
     * Structure is documented below.
     * @return builder
     */
    def serviceMesh(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateServiceMeshArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateServiceMeshArgs.builder
      builder.serviceMesh(args(argsBuilder).build)

    /**
     * @param volumes A list of Volumes to make available to containers.
     * Structure is documented below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccess VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * Structure is documented below.
     * @return builder
     */
    def vpcAccess(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVpcAccessArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVpcAccessArgs.builder
      builder.vpcAccess(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig The Revision&#39;s workload identity settings. Used to assign an
     * [Agent Platform](https://cloud.google.com/run/docs/ai/agent-platform-features) identity to the workload.
     * Structure is documented below.
     * @return builder
     */
    def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder)
    /**
     * @param buildInfos (Output)
     * The build info of the container image.
     * Structure is documented below.
     * @return builder
     */
    def buildInfos(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerBuildInfoArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerBuildInfoArgs.builder
      builder.buildInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param envs List of environment variables to set in the container.
     * Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param livenessProbe Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * Structure is documented below.
     * @return builder
     */
    def livenessProbe(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeArgs.builder
      builder.livenessProbe(args(argsBuilder).build)

    /**
     * @param ports List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible.
     * If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on
     * Structure is documented below.
     * @return builder
     */
    def ports(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerPortsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerPortsArgs.builder
      builder.ports(args(argsBuilder).build)

    /**
     * @param readinessProbe Periodic probe of container readiness.
     * Structure is documented below.
     * @return builder
     */
    def readinessProbe(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeArgs.builder
      builder.readinessProbe(args(argsBuilder).build)

    /**
     * @param resources Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerResourcesArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param sourceCode (Optional, Beta)
     * Location of the source.
     * Structure is documented below.
     * @return builder
     */
    def sourceCode(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerSourceCodeArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerSourceCodeArgs.builder
      builder.sourceCode(args(argsBuilder).build)

    /**
     * @param startupProbe Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * Structure is documented below.
     * @return builder
     */
    def startupProbe(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeArgs.builder
      builder.startupProbe(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume to mount into the container&#39;s filesystem.
     * Structure is documented below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerVolumeMountArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvArgs.Builder)
    /**
     * @param valueSource Source for the environment variable&#39;s value.
     * Structure is documented below.
     * @return builder
     */
    def valueSource(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvValueSourceArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvValueSourceArgs.builder
      builder.valueSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvValueSourceArgs.Builder)
    /**
     * @param secretKeyRef Selects a secret and a specific version from Cloud Secret Manager.
     * Structure is documented below.
     * @return builder
     */
    def secretKeyRef(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvValueSourceSecretKeyRefArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvValueSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerEnvValueSourceSecretKeyRefArgs.builder
      builder.secretKeyRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeArgs.Builder)
    /**
     * @param grpc GRPC specifies an action involving a GRPC port.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HTTPGet specifies the http request to perform.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TCPSocketAction describes an action based on opening a socket
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeArgs.Builder)
    /**
     * @param grpc GRPC specifies an action involving a GRPC port.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGet specifies the http request to perform.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerReadinessProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerSourceCodeArgs.Builder)
    /**
     * @param cloudStorageSource Cloud Storage source.
     * Structure is documented below.
     * @return builder
     */
    def cloudStorageSource(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerSourceCodeCloudStorageSourceArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerSourceCodeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerSourceCodeCloudStorageSourceArgs.builder
      builder.cloudStorageSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeArgs.Builder)
    /**
     * @param grpc GRPC specifies an action involving a GRPC port.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HTTPGet specifies the http request to perform. Exactly one of HTTPGet or TCPSocket must be specified.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TCPSocket specifies an action involving a TCP port. Exactly one of HTTPGet or TCPSocket must be specified.
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerStartupProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesArgs.Builder)
    /**
     * @param templates Sandbox templates that can be launched through the `sandbox` CLI.
     * Structure is documented below.
     * @return builder
     */
    def templates(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateArgs.builder
      builder.templates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateArgs.Builder)
    /**
     * @param envs List of environment variables to set in the sandbox.
     * Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateEnvArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param volumeMounts Volume to mount into the container&#39;s filesystem.
     * Structure is documented below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateVolumeMountArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateSandboxesTemplateVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.Builder)
    /**
     * @param cloudSqlInstance For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def cloudSqlInstance(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeCloudSqlInstanceArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeCloudSqlInstanceArgs.builder
      builder.cloudSqlInstance(args(argsBuilder).build)

    /**
     * @param emptyDir Ephemeral storage used as a shared volume.
     * Structure is documented below.
     * @return builder
     */
    def emptyDir(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeEmptyDirArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeEmptyDirArgs.builder
      builder.emptyDir(args(argsBuilder).build)

    /**
     * @param gcs Cloud Storage bucket mounted as a volume using GCSFuse. This feature is only supported in the gen2 execution environment.
     * Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeGcsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param nfs Represents an NFS mount.
     * Structure is documented below.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeNfsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeNfsArgs.builder
      builder.nfs(args(argsBuilder).build)

    /**
     * @param secret Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * Structure is documented below.
     * @return builder
     */
    def secret(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeSecretArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeSecretArgs.Builder)
    /**
     * @param items If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * Structure is documented below.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeSecretItemArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeSecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVolumeSecretItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVpcAccessArgs.Builder)
    /**
     * @param networkInterfaces Direct VPC egress settings. Currently only single network interface is supported.
     * Structure is documented below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVpcAccessNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVpcAccessArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateVpcAccessNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder)
    /**
     * @param binaryAuthorization Settings for the Binary Authorization feature.
     * Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param conditions The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the WorkerPool does not reach its Serving state. See comments in reconciling for additional information on reconciliation process in Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSplitStatuses Detailed status information for corresponding instance splits. See comments in reconciling for additional information on reconciliation process in Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def instanceSplitStatuses(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolInstanceSplitStatusArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolInstanceSplitStatusArgs.builder
      builder.instanceSplitStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceSplits Specifies how to distribute instances over a collection of Revisions belonging to the WorkerPool. If instance split is empty or not provided, defaults to 100% instances assigned to the latest Ready Revision.
     * Structure is documented below.
     * @return builder
     */
    def instanceSplits(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolInstanceSplitArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolInstanceSplitArgs.builder
      builder.instanceSplits(args.map(_(argsBuilder).build)*)

    /**
     * @param scaling Scaling settings that apply to the worker pool.
     * Structure is documented below.
     * @return builder
     */
    def scaling(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolScalingArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolScalingArgs.builder
      builder.scaling(args(argsBuilder).build)

    /**
     * @param template The template used to create revisions for this WorkerPool.
     * Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    /**
     * @param terminalConditions The Condition of this WorkerPool, containing its readiness status, and detailed error information in case it did not reach a serving state. See comments in reconciling for additional information on reconciliation process in Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def terminalConditions(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTerminalConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTerminalConditionArgs.builder
      builder.terminalConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.Builder)
    /**
     * @param containers Holds the containers that define the unit of execution for this WorkerPool.
     * Structure is documented below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeSelector Node Selector describes the hardware requirements of the resources.
     * Structure is documented below.
     * @return builder
     */
    def nodeSelector(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateNodeSelectorArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateNodeSelectorArgs.builder
      builder.nodeSelector(args(argsBuilder).build)

    /**
     * @param volumes A list of Volumes to make available to containers.
     * Structure is documented below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccess VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * Structure is documented below.
     * @return builder
     */
    def vpcAccess(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVpcAccessArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVpcAccessArgs.builder
      builder.vpcAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.Builder)
    /**
     * @param envs List of environment variables to set in the container.
     * Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param livenessProbe Periodic probe of container liveness. Container will be restarted if the probe fails.
     * Structure is documented below.
     * @return builder
     */
    def livenessProbe(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeArgs.builder
      builder.livenessProbe(args(argsBuilder).build)

    /**
     * @param resources Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerResourcesArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param startupProbe Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails.
     * Structure is documented below.
     * @return builder
     */
    def startupProbe(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeArgs.builder
      builder.startupProbe(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume to mount into the container&#39;s filesystem.
     * Structure is documented below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerVolumeMountArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvArgs.Builder)
    /**
     * @param valueSource Source for the environment variable&#39;s value.
     * Structure is documented below.
     * @return builder
     */
    def valueSource(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvValueSourceArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvValueSourceArgs.builder
      builder.valueSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvValueSourceArgs.Builder)
    /**
     * @param secretKeyRef Selects a secret and a specific version from Cloud Secret Manager.
     * Structure is documented below.
     * @return builder
     */
    def secretKeyRef(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvValueSourceSecretKeyRefArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvValueSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerEnvValueSourceSecretKeyRefArgs.builder
      builder.secretKeyRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeArgs.Builder)
    /**
     * @param grpc Optional. GRPC specifies an action involving a gRPC port. Exactly one of httpGet, tcpSocket, or grpc must be specified.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet Optional. HTTPGet specifies the http request to perform. Exactly one of httpGet, tcpSocket, or grpc must be specified.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket Optional. TCPSocket specifies an action involving a TCP port. Exactly one of httpGet, tcpSocket, or grpc must be specified.
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Optional. Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerLivenessProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeArgs.Builder)
    /**
     * @param grpc Optional. GRPC specifies an action involving a gRPC port. Exactly one of httpGet, tcpSocket, or grpc must be specified.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet Optional. HTTPGet specifies the http request to perform. Exactly one of httpGet, tcpSocket, or grpc must be specified.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket Optional. TCPSocket specifies an action involving a TCP port. Exactly one of httpGet, tcpSocket, or grpc must be specified.
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Optional. Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateContainerStartupProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.Builder)
    /**
     * @param cloudSqlInstance For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * Structure is documented below.
     * @return builder
     */
    def cloudSqlInstance(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeCloudSqlInstanceArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeCloudSqlInstanceArgs.builder
      builder.cloudSqlInstance(args(argsBuilder).build)

    /**
     * @param emptyDir Ephemeral storage used as a shared volume.
     * Structure is documented below.
     * @return builder
     */
    def emptyDir(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeEmptyDirArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeEmptyDirArgs.builder
      builder.emptyDir(args(argsBuilder).build)

    /**
     * @param gcs Cloud Storage bucket mounted as a volume using GCSFuse. This feature is only supported in the gen2 execution environment.
     * Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeGcsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param nfs Represents an NFS mount.
     * Structure is documented below.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeNfsArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeNfsArgs.builder
      builder.nfs(args(argsBuilder).build)

    /**
     * @param secret Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * Structure is documented below.
     * @return builder
     */
    def secret(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeSecretArgs.Builder]):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeSecretArgs.Builder)
    /**
     * @param items If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * Structure is documented below.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeSecretItemArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeSecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVolumeSecretItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVpcAccessArgs.Builder)
    /**
     * @param networkInterfaces Direct VPC egress settings. Currently only single network interface is supported.
     * Structure is documented below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVpcAccessNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVpcAccessArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.WorkerPoolTemplateVpcAccessNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)
