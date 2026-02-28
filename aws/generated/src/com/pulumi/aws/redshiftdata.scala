package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object redshiftdata:
  /** Executes a Redshift Data Statement. */
  def Statement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshiftdata.StatementArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshiftdata.StatementArgs.builder
    
    com.pulumi.aws.redshiftdata.Statement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.redshiftdata.StatementArgs.Builder)
    def parameters(args: Endofunction[com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.Builder]*):
        com.pulumi.aws.redshiftdata.StatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshiftdata.inputs.StatementState.Builder)
    def parameters(args: Endofunction[com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.Builder]*):
        com.pulumi.aws.redshiftdata.inputs.StatementState.Builder =
      def argsBuilder = com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)
