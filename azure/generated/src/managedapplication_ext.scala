package jp.ukiba.ko_pulumi
package azure

object managedapplication_ext:
  extension (builder: com.pulumi.azure.managedapplication.ApplicationArgs.Builder)
    /**
     * @param plan One `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.Builder]):
        com.pulumi.azure.managedapplication.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.managedapplication.DefinitionArgs.Builder)
    /**
     * @param authorizations One or more `authorization` block defined below.
     * @return builder
     */
    def authorizations(args: Endofunction[com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.Builder]*):
        com.pulumi.azure.managedapplication.DefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.builder
      builder.authorizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.managedapplication.inputs.ApplicationState.Builder)
    /**
     * @param plan One `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.Builder]):
        com.pulumi.azure.managedapplication.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.managedapplication.inputs.DefinitionState.Builder)
    /**
     * @param authorizations One or more `authorization` block defined below.
     * @return builder
     */
    def authorizations(args: Endofunction[com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.Builder]*):
        com.pulumi.azure.managedapplication.inputs.DefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.builder
      builder.authorizations(args.map(_(argsBuilder).build)*)
