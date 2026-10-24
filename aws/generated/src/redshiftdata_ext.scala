package jp.ukiba.ko_pulumi
package aws

object redshiftdata_ext:
  extension (builder: com.pulumi.aws.redshiftdata.StatementArgs.Builder)
    inline def parameters(args: Endofunction[com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.Builder]*):
        com.pulumi.aws.redshiftdata.StatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshiftdata.inputs.StatementState.Builder)
    inline def parameters(args: Endofunction[com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.Builder]*):
        com.pulumi.aws.redshiftdata.inputs.StatementState.Builder =
      def argsBuilder = com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)
