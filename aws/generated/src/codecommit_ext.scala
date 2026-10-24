package jp.ukiba.ko_pulumi
package aws

object codecommit_ext:
  extension (builder: com.pulumi.aws.codecommit.TriggerArgs.Builder)
    /**
     * @param triggers The name of the trigger.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.Builder]*):
        com.pulumi.aws.codecommit.TriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codecommit.inputs.TriggerState.Builder)
    /**
     * @param triggers The name of the trigger.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.Builder]*):
        com.pulumi.aws.codecommit.inputs.TriggerState.Builder =
      def argsBuilder = com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)
