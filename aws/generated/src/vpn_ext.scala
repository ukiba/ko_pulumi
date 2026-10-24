package jp.ukiba.ko_pulumi
package aws

object vpn_ext:
  extension (builder: com.pulumi.aws.vpn.inputs.GetConnectionArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionFilterArgs.Builder]*):
        com.pulumi.aws.vpn.inputs.GetConnectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpn.inputs.GetConnectionPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionFilter.Builder]*):
        com.pulumi.aws.vpn.inputs.GetConnectionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)
