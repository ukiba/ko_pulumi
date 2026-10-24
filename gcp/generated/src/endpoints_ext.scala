package jp.ukiba.ko_pulumi
package gcp

object endpoints_ext:
  extension (builder: com.pulumi.gcp.endpoints.ConsumersIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ConsumersIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.ConsumersIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ConsumersIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.ServiceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.ServiceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.Builder)
    /**
     * @param methods A list of Method objects; structure is documented below.
     * @return builder
     */
    def methods(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceApiMethodArgs.Builder]*):
        com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.Builder =
      def argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceApiMethodArgs.builder
      builder.methods(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceState.Builder)
    /**
     * @param apis A list of API objects; structure is documented below.
     * @return builder
     */
    def apis(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.Builder]*):
        com.pulumi.gcp.endpoints.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.builder
      builder.apis(args.map(_(argsBuilder).build)*)

    /**
     * @param endpoints A list of Endpoint objects; structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceEndpointArgs.Builder]*):
        com.pulumi.gcp.endpoints.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)
