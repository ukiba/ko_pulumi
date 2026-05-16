package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object healthcare:
  extension (builder: com.pulumi.azure.healthcare.ServiceArgs.Builder)
    /**
     * @param authenticationConfiguration An `authenticationConfiguration` block as defined below.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param corsConfiguration A `corsConfiguration` block as defined below.
     * @return builder
     */
    def corsConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.ServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.healthcare.DicomServiceArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.DicomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.DicomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.Builder]):
        com.pulumi.azure.healthcare.DicomServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.DicomServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.healthcare.MedtechServiceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.MedtechServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.MedtechServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Healthcare Med Tech Service. */
  def MedtechService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.healthcare.MedtechServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.MedtechServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.healthcare.MedtechService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Healthcare Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.healthcare.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.healthcare.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object HealthcareFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Healthcare DICOM Service */
    inline def getDicomService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetDicomServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetDicomServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetDicomServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getDicomService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare DICOM Service */
    inline def getDicomServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetDicomServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetDicomServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetDicomServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getDicomServicePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare FHIR Service(Fast Healthcare Interoperability Resources). */
    inline def getFhirService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetFhirServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetFhirServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetFhirServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getFhirService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare FHIR Service(Fast Healthcare Interoperability Resources). */
    inline def getFhirServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetFhirServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetFhirServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetFhirServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getFhirServicePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare Med Tech Service */
    inline def getMedtechService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetMedtechServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetMedtechServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetMedtechServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getMedtechService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare Med Tech Service */
    inline def getMedtechServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetMedtechServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetMedtechServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetMedtechServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getMedtechServicePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare Service */
    inline def getService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare Service */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getServicePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare Workspace */
    inline def getWorkspace(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Healthcare Workspace */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getWorkspacePlain(args(argsBuilder).build)

  /** Manages a Healthcare Med Tech Service Fhir Destination. */
  def MedtechServiceFhirDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.healthcare.MedtechServiceFhirDestinationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.MedtechServiceFhirDestinationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.healthcare.MedtechServiceFhirDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Healthcare DICOM Service */
  def DicomService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.healthcare.DicomServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.DicomServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.healthcare.DicomService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.healthcare.FhirServiceArgs.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.Builder]):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ociArtifacts [A list](https://www.terraform.io/docs/configuration/attr-as-blocks.html) of `ociArtifact` objects as defined below to describe [OCI artifacts for export](https://learn.microsoft.com/en-gb/azure/healthcare-apis/fhir/de-identified-export).
     * @return builder
     */
    def ociArtifacts(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.Builder]*):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.builder
      builder.ociArtifacts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.FhirServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Healthcare workspace */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.healthcare.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.healthcare.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Healthcare FHIR (Fast Healthcare Interoperability Resources) Service */
  def FhirService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.healthcare.FhirServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.FhirServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.healthcare.FhirService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.healthcare.inputs.MedtechServiceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.MedtechServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.MedtechServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.inputs.MedtechServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.healthcare.inputs.WorkspaceState.Builder)
    def privateEndpointConnections(args: Endofunction[com.pulumi.azure.healthcare.inputs.WorkspacePrivateEndpointConnectionArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.WorkspaceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.WorkspacePrivateEndpointConnectionArgs.builder
      builder.privateEndpointConnections(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.inputs.WorkspaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.healthcare.inputs.ServiceState.Builder)
    /**
     * @param authenticationConfiguration An `authenticationConfiguration` block as defined below.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param corsConfiguration A `corsConfiguration` block as defined below.
     * @return builder
     */
    def corsConfiguration(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceCorsConfigurationArgs.builder
      builder.corsConfiguration(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.inputs.ServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder)
    /**
     * @param authentications The `authentication` block as defined below.
     * @return builder
     */
    def authentications(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceAuthenticationArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceAuthenticationArgs.builder
      builder.authentications(args.map(_(argsBuilder).build)*)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def privateEndpoints(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServicePrivateEndpointArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServicePrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param storage A `storage` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.DicomServiceStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.inputs.DicomServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.Builder]):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ociArtifacts [A list](https://www.terraform.io/docs/configuration/attr-as-blocks.html) of `ociArtifact` objects as defined below to describe [OCI artifacts for export](https://learn.microsoft.com/en-gb/azure/healthcare-apis/fhir/de-identified-export).
     * @return builder
     */
    def ociArtifacts(args: Endofunction[com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.Builder]*):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      def argsBuilder = com.pulumi.azure.healthcare.inputs.FhirServiceOciArtifactArgs.builder
      builder.ociArtifacts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.healthcare.inputs.FhirServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
