package jp.ukiba.ko_pulumi
package gcp

object apigateway_ext:
  extension (builder: com.pulumi.gcp.apigateway.ApiConfigArgs.Builder)
    /**
     * @param gatewayConfig Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * @return builder
     */
    def gatewayConfig(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.builder
      builder.gatewayConfig(args(argsBuilder).build)

    /**
     * @param grpcServices gRPC service definition files. If specified, openapiDocuments must not be included.
     * Structure is documented below.
     * @return builder
     */
    def grpcServices(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder]*):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.builder
      builder.grpcServices(args.map(_(argsBuilder).build)*)

    /**
     * @param managedServiceConfigs Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents.
     * If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * Structure is documented below.
     * @return builder
     */
    def managedServiceConfigs(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.Builder]*):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.builder
      builder.managedServiceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param openapiDocuments OpenAPI specification documents. If specified, grpcServices and managedServiceConfigs must not be included.
     * Structure is documented below.
     * @return builder
     */
    def openapiDocuments(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder]*):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.builder
      builder.openapiDocuments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.ApiIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.ApiIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.GatewayIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.GatewayIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.GatewayIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.GatewayIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder)
    /**
     * @param backendConfig Backend settings that are applied to all backends of the Gateway.
     * Structure is documented below.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigBackendConfigArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder)
    /**
     * @param fileDescriptorSet Input only. File descriptor set, generated by protoc.
     * To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     * \$ protoc --include_imports --include_source_info test.proto -o out.pb
     * Structure is documented below.
     * @return builder
     */
    def fileDescriptorSet(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceFileDescriptorSetArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceFileDescriptorSetArgs.builder
      builder.fileDescriptorSet(args(argsBuilder).build)

    /**
     * @param sources Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate fileDescriptorSet.
     * Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceSourceArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder)
    /**
     * @param document The OpenAPI Specification document file.
     * Structure is documented below.
     * @return builder
     */
    def document(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentDocumentArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentDocumentArgs.builder
      builder.document(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder)
    /**
     * @param gatewayConfig Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * @return builder
     */
    def gatewayConfig(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.builder
      builder.gatewayConfig(args(argsBuilder).build)

    /**
     * @param grpcServices gRPC service definition files. If specified, openapiDocuments must not be included.
     * Structure is documented below.
     * @return builder
     */
    def grpcServices(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.builder
      builder.grpcServices(args.map(_(argsBuilder).build)*)

    /**
     * @param managedServiceConfigs Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents.
     * If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * Structure is documented below.
     * @return builder
     */
    def managedServiceConfigs(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.builder
      builder.managedServiceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param openapiDocuments OpenAPI specification documents. If specified, grpcServices and managedServiceConfigs must not be included.
     * Structure is documented below.
     * @return builder
     */
    def openapiDocuments(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.builder
      builder.openapiDocuments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.GatewayIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.GatewayIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.GatewayIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.GatewayIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
