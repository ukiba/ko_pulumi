package jp.ukiba.ko_pulumi
package aws

object workmail_ext:
  extension (builder: com.pulumi.aws.workmail.OrganizationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.workmail.OrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workmail.inputs.DomainState.Builder)
    /**
     * @param records List of DNS records required for domain verification. See `records` Block below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.aws.workmail.inputs.DomainRecordArgs.Builder]*):
        com.pulumi.aws.workmail.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.workmail.inputs.DomainRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workmail.inputs.OrganizationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.workmail.inputs.OrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
