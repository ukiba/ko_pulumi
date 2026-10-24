package jp.ukiba.ko_pulumi
package postgresql

object postgresql_ext:
  extension (builder: com.pulumi.postgresql.FunctionArgs.Builder)
    /**
     * @param args List of arguments for the function.
     * @return builder
     */
    inline def args(args: Endofunction[com.pulumi.postgresql.inputs.FunctionArgArgs.Builder]*):
        com.pulumi.postgresql.FunctionArgs.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.FunctionArgArgs.builder
      builder.args(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.postgresql.ProviderArgs.Builder)
    /**
     * @param clientcert SSL client certificate if required by the database.
     * @return builder
     */
    inline def clientcert(args: Endofunction[com.pulumi.postgresql.inputs.ProviderClientcertArgs.Builder]):
        com.pulumi.postgresql.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.postgresql.inputs.ProviderClientcertArgs.builder
      builder.clientcert(args(argsBuilder).build)

  extension (builder: com.pulumi.postgresql.SchemaArgs.Builder)
    /**
     * @param policies Can be specified multiple times for each policy.  Each
     * policy block supports fields documented below.
     * @return builder
     * @deprecated Use postgresql.Grant resource instead (with object_type=&#34;schema&#34;)
     */
    @deprecated("Use postgresql.Grant resource instead (with object_type=&#34;schema&#34;)") inline def policies(args: Endofunction[com.pulumi.postgresql.inputs.SchemaPolicyArgs.Builder]*):
        com.pulumi.postgresql.SchemaArgs.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.SchemaPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.postgresql.inputs.FunctionState.Builder)
    /**
     * @param args List of arguments for the function.
     * @return builder
     */
    inline def args(args: Endofunction[com.pulumi.postgresql.inputs.FunctionArgArgs.Builder]*):
        com.pulumi.postgresql.inputs.FunctionState.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.FunctionArgArgs.builder
      builder.args(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.postgresql.inputs.SchemaState.Builder)
    /**
     * @param policies Can be specified multiple times for each policy.  Each
     * policy block supports fields documented below.
     * @return builder
     * @deprecated Use postgresql.Grant resource instead (with object_type=&#34;schema&#34;)
     */
    @deprecated("Use postgresql.Grant resource instead (with object_type=&#34;schema&#34;)") inline def policies(args: Endofunction[com.pulumi.postgresql.inputs.SchemaPolicyArgs.Builder]*):
        com.pulumi.postgresql.inputs.SchemaState.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.SchemaPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)
