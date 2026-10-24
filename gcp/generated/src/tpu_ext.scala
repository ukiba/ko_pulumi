package jp.ukiba.ko_pulumi
package gcp

object tpu_ext:
  extension (builder: com.pulumi.gcp.tpu.V2QueuedResourceArgs.Builder)
    /**
     * @param tpu Defines a TPU resource.
     * Structure is documented below.
     * @return builder
     */
    inline def tpu(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuArgs.Builder]):
        com.pulumi.gcp.tpu.V2QueuedResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuArgs.builder
      builder.tpu(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tpu.V2VmArgs.Builder)
    /**
     * @param acceleratorConfig The AccleratorConfig for the TPU Node. `acceleratorConfig` cannot be used at the same time
     * as `acceleratorType`. If neither is specified, `acceleratorType` defaults to &#39;v2-8&#39;.
     * Structure is documented below.
     * @return builder
     */
    inline def acceleratorConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmAcceleratorConfigArgs.Builder]):
        com.pulumi.gcp.tpu.V2VmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmAcceleratorConfigArgs.builder
      builder.acceleratorConfig(args(argsBuilder).build)

    /**
     * @param dataDisks The additional data disks for the Node.
     * Structure is documented below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmDataDiskArgs.Builder]*):
        com.pulumi.gcp.tpu.V2VmArgs.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfig Network configurations for the TPU node.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.Builder]):
        com.pulumi.gcp.tpu.V2VmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param networkConfigs Repeated network configurations for the TPU node. This field is used to specify multiple
     * network configs for the TPU node.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfigs(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.tpu.V2VmArgs.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.builder
      builder.networkConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param schedulingConfig The scheduling options for this node.
     * Structure is documented below.
     * @return builder
     */
    inline def schedulingConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmSchedulingConfigArgs.Builder]):
        com.pulumi.gcp.tpu.V2VmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmSchedulingConfigArgs.builder
      builder.schedulingConfig(args(argsBuilder).build)

    /**
     * @param serviceAccount The Google Cloud Platform Service Account to be used by the TPU node VMs. If None is
     * specified, the default compute service account will be used.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmServiceAccountArgs.Builder]):
        com.pulumi.gcp.tpu.V2VmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Shielded Instance options.
     * Structure is documented below.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.tpu.V2VmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tpu.inputs.V2QueuedResourceState.Builder)
    /**
     * @param tpu Defines a TPU resource.
     * Structure is documented below.
     * @return builder
     */
    inline def tpu(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2QueuedResourceState.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuArgs.builder
      builder.tpu(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuArgs.Builder)
    /**
     * @param nodeSpecs The TPU node(s) being requested.
     * Structure is documented below.
     * @return builder
     */
    inline def nodeSpecs(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecArgs.Builder]*):
        com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuArgs.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecArgs.builder
      builder.nodeSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecArgs.Builder)
    /**
     * @param node The node.
     * Structure is documented below.
     * @return builder
     */
    inline def node(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecNodeArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecNodeArgs.builder
      builder.node(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecNodeArgs.Builder)
    /**
     * @param networkConfig Network configurations for the TPU node.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecNodeNetworkConfigArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecNodeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2QueuedResourceTpuNodeSpecNodeNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.tpu.inputs.V2VmNetworkEndpointArgs.Builder)
    /**
     * @param accessConfigs (Output)
     * The access config for the TPU worker.
     * Structure is documented below.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmNetworkEndpointAccessConfigArgs.Builder]*):
        com.pulumi.gcp.tpu.inputs.V2VmNetworkEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmNetworkEndpointAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.tpu.inputs.V2VmState.Builder)
    /**
     * @param acceleratorConfig The AccleratorConfig for the TPU Node. `acceleratorConfig` cannot be used at the same time
     * as `acceleratorType`. If neither is specified, `acceleratorType` defaults to &#39;v2-8&#39;.
     * Structure is documented below.
     * @return builder
     */
    inline def acceleratorConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmAcceleratorConfigArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmAcceleratorConfigArgs.builder
      builder.acceleratorConfig(args(argsBuilder).build)

    /**
     * @param dataDisks The additional data disks for the Node.
     * Structure is documented below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmDataDiskArgs.Builder]*):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfig Network configurations for the TPU node.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param networkConfigs Repeated network configurations for the TPU node. This field is used to specify multiple
     * network configs for the TPU node.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfigs(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmNetworkConfigArgs.builder
      builder.networkConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param networkEndpoints The network endpoints where TPU workers can be accessed and sent work. It is recommended that
     * runtime clients of the node reach out to the 0th entry in this map first.
     * Structure is documented below.
     * @return builder
     */
    inline def networkEndpoints(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmNetworkEndpointArgs.Builder]*):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmNetworkEndpointArgs.builder
      builder.networkEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param schedulingConfig The scheduling options for this node.
     * Structure is documented below.
     * @return builder
     */
    inline def schedulingConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmSchedulingConfigArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmSchedulingConfigArgs.builder
      builder.schedulingConfig(args(argsBuilder).build)

    /**
     * @param serviceAccount The Google Cloud Platform Service Account to be used by the TPU node VMs. If None is
     * specified, the default compute service account will be used.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceAccount(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmServiceAccountArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Shielded Instance options.
     * Structure is documented below.
     * @return builder
     */
    inline def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param symptoms The Symptoms that have occurred to the TPU Node.
     * Structure is documented below.
     * @return builder
     */
    inline def symptoms(args: Endofunction[com.pulumi.gcp.tpu.inputs.V2VmSymptomArgs.Builder]*):
        com.pulumi.gcp.tpu.inputs.V2VmState.Builder =
      def argsBuilder = com.pulumi.gcp.tpu.inputs.V2VmSymptomArgs.builder
      builder.symptoms(args.map(_(argsBuilder).build)*)
