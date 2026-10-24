package jp.ukiba.ko_pulumi
package azure

object healthcare_ext:
  extension (builder: com.pulumi.azure.healthcare.DicomServiceArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.DicomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.DicomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storage(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.Builder]):
        com.pulumi.azure.healthcare.DicomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.healthcare.FhirServiceArgs.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.Builder]):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ociArtifacts [A list](https://www.terraform.io/docs/configuration/attr-as-blocks.html) of `ociArtifact` objects as defined below to describe [OCI artifacts for export](https://learn.microsoft.com/en-gb/azure/healthcare-apis/fhir/de-identified-export).
     * @return builder
     */
    inline def ociArtifacts(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.Builder]*):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.builder
      builder.ociArtifacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.healthcare.MedtechServiceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.MedtechServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.healthcare.ServiceArgs.Builder)
    /**
     * @param authenticationConfiguration An `authenticationConfiguration` block as defined below.
     * @return builder
     */
    inline def authenticationConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param corsConfiguration A `corsConfiguration` block as defined below.
     * @return builder
     */
    inline def corsConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder)
    /**
     * @param authentications The `authentication` block as defined below.
     * @return builder
     */
    inline def authentications(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceAuthenticationArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceAuthenticationArgs.builder
      builder.authentications(args.map(_(argsBuilder).build)*)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    inline def privateEndpoints(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServicePrivateEndpointArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServicePrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param storage A `storage` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storage(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ociArtifacts [A list](https://www.terraform.io/docs/configuration/attr-as-blocks.html) of `ociArtifact` objects as defined below to describe [OCI artifacts for export](https://learn.microsoft.com/en-gb/azure/healthcare-apis/fhir/de-identified-export).
     * @return builder
     */
    inline def ociArtifacts(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.builder
      builder.ociArtifacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.healthcare.inputs.MedtechServiceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.MedtechServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.healthcare.inputs.ServiceState.Builder)
    /**
     * @param authenticationConfiguration An `authenticationConfiguration` block as defined below.
     * @return builder
     */
    inline def authenticationConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param corsConfiguration A `corsConfiguration` block as defined below.
     * @return builder
     */
    inline def corsConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.healthcare.inputs.WorkspaceState.Builder)
    inline def privateEndpointConnections(args: Endofunction[com.pulumi.azure.healthcare.inputs.WorkspacePrivateEndpointConnectionArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.WorkspaceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.WorkspacePrivateEndpointConnectionArgs.builder
      builder.privateEndpointConnections(args.map(_(argsBuilder).build)*)
