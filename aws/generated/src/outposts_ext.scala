package jp.ukiba.ko_pulumi
package aws

object outposts_ext:
  extension (builder: com.pulumi.aws.outposts.CapacityTaskArgs.Builder)
    /**
     * @param instancePools One or more `instancePool` blocks defining the desired instance-type layout for the Outpost. See below. At least one block is required. Changing any value forces a new resource.
     * @return builder
     */
    inline def instancePools(args: Endofunction[com.pulumi.aws.outposts.inputs.CapacityTaskInstancePoolArgs.Builder]*):
        com.pulumi.aws.outposts.CapacityTaskArgs.Builder =
      def argsBuilder = com.pulumi.aws.outposts.inputs.CapacityTaskInstancePoolArgs.builder
      builder.instancePools(args.map(_(argsBuilder).build)*)

    /**
     * @param instancesToExclude Single `instancesToExclude` block specifying user-owned running instances that must not be stopped to free up capacity. See below. Note: AWS does not return this value via the Get/Describe API; after import, you must add the block back to your configuration manually \u2014 see Import.
     * @return builder
     */
    inline def instancesToExclude(args: Endofunction[com.pulumi.aws.outposts.inputs.CapacityTaskInstancesToExcludeArgs.Builder]):
        com.pulumi.aws.outposts.CapacityTaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.outposts.inputs.CapacityTaskInstancesToExcludeArgs.builder
      builder.instancesToExclude(args(argsBuilder).build)

    /**
     * @param timeouts Configuration block with timeouts. See below.
     * @return builder
     */
    inline def timeouts(args: Endofunction[com.pulumi.aws.outposts.inputs.CapacityTaskTimeoutsArgs.Builder]):
        com.pulumi.aws.outposts.CapacityTaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.outposts.inputs.CapacityTaskTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.outposts.inputs.CapacityTaskState.Builder)
    /**
     * @param instancePools One or more `instancePool` blocks defining the desired instance-type layout for the Outpost. See below. At least one block is required. Changing any value forces a new resource.
     * @return builder
     */
    inline def instancePools(args: Endofunction[com.pulumi.aws.outposts.inputs.CapacityTaskInstancePoolArgs.Builder]*):
        com.pulumi.aws.outposts.inputs.CapacityTaskState.Builder =
      def argsBuilder = com.pulumi.aws.outposts.inputs.CapacityTaskInstancePoolArgs.builder
      builder.instancePools(args.map(_(argsBuilder).build)*)

    /**
     * @param instancesToExclude Single `instancesToExclude` block specifying user-owned running instances that must not be stopped to free up capacity. See below. Note: AWS does not return this value via the Get/Describe API; after import, you must add the block back to your configuration manually \u2014 see Import.
     * @return builder
     */
    inline def instancesToExclude(args: Endofunction[com.pulumi.aws.outposts.inputs.CapacityTaskInstancesToExcludeArgs.Builder]):
        com.pulumi.aws.outposts.inputs.CapacityTaskState.Builder =
      val argsBuilder = com.pulumi.aws.outposts.inputs.CapacityTaskInstancesToExcludeArgs.builder
      builder.instancesToExclude(args(argsBuilder).build)

    /**
     * @param timeouts Configuration block with timeouts. See below.
     * @return builder
     */
    inline def timeouts(args: Endofunction[com.pulumi.aws.outposts.inputs.CapacityTaskTimeoutsArgs.Builder]):
        com.pulumi.aws.outposts.inputs.CapacityTaskState.Builder =
      val argsBuilder = com.pulumi.aws.outposts.inputs.CapacityTaskTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
