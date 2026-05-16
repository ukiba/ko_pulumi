package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object apphub:
  extension (builder: com.pulumi.gcp.apphub.ServiceArgs.Builder)
    /**
     * @param attributes Consumer provided attributes.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder]):
        com.pulumi.gcp.apphub.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

  /**
   * Application management boundary.
   * 
   *  To get more information about Boundary, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/app-hub/docs/reference/rest/v1/Boundary)
   *  * How-to Guides
   *      * [AppHub](https://docs.cloud.google.com/app-hub/docs/)
   */
  def Boundary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.BoundaryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apphub.BoundaryArgs.builder
    com.pulumi.gcp.apphub.Boundary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Application is a functional grouping of Services and Workloads that helps achieve a desired end-to-end business functionality. Services and Workloads are owned by the Application. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.ApplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apphub.ApplicationArgs.builder
    com.pulumi.gcp.apphub.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Represents a Service project attachment to the Host Project. */
  def ServiceProjectAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.ServiceProjectAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apphub.ServiceProjectAttachmentArgs.builder
    com.pulumi.gcp.apphub.ServiceProjectAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ApphubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Application is a functional grouping of Services and Workloads that helps achieve a desired end-to-end business functionality. Services and Workloads are owned by the Application. */
    inline def getApplication(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apphub.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetApplicationArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getApplication(args(argsBuilder).build)

    /** Application is a functional grouping of Services and Workloads that helps achieve a desired end-to-end business functionality. Services and Workloads are owned by the Application. */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apphub.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetApplicationPlainArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getApplicationPlain(args(argsBuilder).build)

    /** Get information about a discovered service from its uri. */
    inline def getDiscoveredService(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apphub.outputs.GetDiscoveredServiceResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredServiceArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredService(args(argsBuilder).build)

    /** Get information about a discovered service from its uri. */
    inline def getDiscoveredServicePlain(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apphub.outputs.GetDiscoveredServiceResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredServicePlainArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredServicePlain(args(argsBuilder).build)

    /** Get information about a discovered workload from its uri. */
    inline def getDiscoveredWorkload(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apphub.outputs.GetDiscoveredWorkloadResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredWorkload(args(argsBuilder).build)

    /** Get information about a discovered workload from its uri. */
    inline def getDiscoveredWorkloadPlain(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apphub.outputs.GetDiscoveredWorkloadResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadPlainArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredWorkloadPlain(args(argsBuilder).build)

  /** Service is a network/api interface that exposes some functionality to clients for consumption over the network. Service typically has one or more Workloads behind it. It registers identified service to the Application. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.ServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apphub.ServiceArgs.builder
    com.pulumi.gcp.apphub.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Workload represents a binary deployment (such as Managed Instance Groups (MIGs), GKE deployments, etc.) that performs the smallest logical subset of business functionality. It registers identified workload to the Application. */
  def Workload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.WorkloadArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apphub.WorkloadArgs.builder
    com.pulumi.gcp.apphub.Workload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apphub.ApplicationArgs.Builder)
    /**
     * @param attributes Consumer provided attributes.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder]):
        com.pulumi.gcp.apphub.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param scope Scope of an application.
     *  Structure is documented below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationScopeArgs.Builder]):
        com.pulumi.gcp.apphub.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apphub.WorkloadArgs.Builder)
    /**
     * @param attributes Consumer provided attributes.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder]):
        com.pulumi.gcp.apphub.WorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apphub.inputs.ServiceServicePropertyArgs.Builder)
    /**
     * @param extendedMetadatas (Output)
     *  Output only. Additional metadata specific to the resource type.
     *  Structure is documented below.
     * @return builder
     */
    def extendedMetadatas(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceServicePropertyExtendedMetadataArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceServicePropertyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceServicePropertyExtendedMetadataArgs.builder
      builder.extendedMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param functionalTypes (Output)
     *  Output only. The type of the service.
     *  Structure is documented below.
     * @return builder
     */
    def functionalTypes(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceServicePropertyFunctionalTypeArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceServicePropertyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceServicePropertyFunctionalTypeArgs.builder
      builder.functionalTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param identities (Output)
     *  The identity associated with the service.
     *  Structure is documented below.
     * @return builder
     */
    def identities(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceServicePropertyIdentityArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceServicePropertyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceServicePropertyIdentityArgs.builder
      builder.identities(args.map(_(argsBuilder).build)*)

    /**
     * @param registrationTypes (Output)
     *  Output only. The registration type of the service.
     *  Structure is documented below.
     * @return builder
     */
    def registrationTypes(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceServicePropertyRegistrationTypeArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceServicePropertyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceServicePropertyRegistrationTypeArgs.builder
      builder.registrationTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder)
    /**
     * @param businessOwners Business team that ensures user needs are met and value is delivered
     *  Structure is documented below.
     * @return builder
     */
    def businessOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceAttributesBusinessOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceAttributesBusinessOwnerArgs.builder
      builder.businessOwners(args.map(_(argsBuilder).build)*)

    /**
     * @param criticality Criticality of the Application, Service, or Workload
     *  Structure is documented below.
     * @return builder
     */
    def criticality(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceAttributesCriticalityArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceAttributesCriticalityArgs.builder
      builder.criticality(args(argsBuilder).build)

    /**
     * @param developerOwners Developer team that owns development and coding.
     *  Structure is documented below.
     * @return builder
     */
    def developerOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceAttributesDeveloperOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceAttributesDeveloperOwnerArgs.builder
      builder.developerOwners(args.map(_(argsBuilder).build)*)

    /**
     * @param environment Environment of the Application, Service, or Workload
     *  Structure is documented below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceAttributesEnvironmentArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceAttributesEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param operatorOwners Operator team that ensures runtime and operations.
     *  Structure is documented below.
     * @return builder
     */
    def operatorOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceAttributesOperatorOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceAttributesOperatorOwnerArgs.builder
      builder.operatorOwners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.WorkloadState.Builder)
    /**
     * @param attributes Consumer provided attributes.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.WorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param workloadProperties Properties of an underlying compute resource represented by the Workload.
     *  Structure is documented below.
     * @return builder
     */
    def workloadProperties(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyArgs.builder
      builder.workloadProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param workloadReferences Reference of an underlying compute resource represented by the Workload.
     *  Structure is documented below.
     * @return builder
     */
    def workloadReferences(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadWorkloadReferenceArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadWorkloadReferenceArgs.builder
      builder.workloadReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder)
    /**
     * @param businessOwners Optional. Business team that ensures user needs are met and value is delivered
     *  Structure is documented below.
     * @return builder
     */
    def businessOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationAttributesBusinessOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationAttributesBusinessOwnerArgs.builder
      builder.businessOwners(args.map(_(argsBuilder).build)*)

    /**
     * @param criticality Criticality of the Application, Service, or Workload
     *  Structure is documented below.
     * @return builder
     */
    def criticality(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationAttributesCriticalityArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationAttributesCriticalityArgs.builder
      builder.criticality(args(argsBuilder).build)

    /**
     * @param developerOwners Optional. Developer team that owns development and coding.
     *  Structure is documented below.
     * @return builder
     */
    def developerOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationAttributesDeveloperOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationAttributesDeveloperOwnerArgs.builder
      builder.developerOwners(args.map(_(argsBuilder).build)*)

    /**
     * @param environment Environment of the Application, Service, or Workload
     *  Structure is documented below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationAttributesEnvironmentArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationAttributesEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param operatorOwners Optional. Operator team that ensures runtime and operations.
     *  Structure is documented below.
     * @return builder
     */
    def operatorOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationAttributesOperatorOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationAttributesOperatorOwnerArgs.builder
      builder.operatorOwners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.ServiceServicePropertyExtendedMetadataArgs.Builder)
    /**
     * @param values (Output)
     *  The value of the extended metadata.
     *  Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceServicePropertyExtendedMetadataValueArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceServicePropertyExtendedMetadataArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceServicePropertyExtendedMetadataValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.ApplicationState.Builder)
    /**
     * @param attributes Consumer provided attributes.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param scope Scope of an application.
     *  Structure is documented below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.gcp.apphub.inputs.ApplicationScopeArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ApplicationScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apphub.inputs.ServiceState.Builder)
    /**
     * @param attributes Consumer provided attributes.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceAttributesArgs.builder
      builder.attributes(args(argsBuilder).build)

    /**
     * @param serviceProperties Properties of an underlying cloud resource that can comprise a Service.
     *  Structure is documented below.
     * @return builder
     */
    def serviceProperties(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceServicePropertyArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceServicePropertyArgs.builder
      builder.serviceProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceReferences Reference to an underlying networking resource that can comprise a Service.
     *  Structure is documented below.
     * @return builder
     */
    def serviceReferences(args: Endofunction[com.pulumi.gcp.apphub.inputs.ServiceServiceReferenceArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.ServiceServiceReferenceArgs.builder
      builder.serviceReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyArgs.Builder)
    /**
     * @param extendedMetadatas (Output)
     *  Output only. Additional metadata specific to the resource type.
     *  Structure is documented below.
     * @return builder
     */
    def extendedMetadatas(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyExtendedMetadataArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyExtendedMetadataArgs.builder
      builder.extendedMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param functionalTypes (Output)
     *  Output only. The functional type of a service or workload.
     *  Structure is documented below.
     * @return builder
     */
    def functionalTypes(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyFunctionalTypeArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyFunctionalTypeArgs.builder
      builder.functionalTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param identities (Output)
     *  The identity associated with the workload.
     *  Structure is documented below.
     * @return builder
     */
    def identities(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyIdentityArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyIdentityArgs.builder
      builder.identities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder)
    /**
     * @param businessOwners Business team that ensures user needs are met and value is delivered
     *  Structure is documented below.
     * @return builder
     */
    def businessOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadAttributesBusinessOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadAttributesBusinessOwnerArgs.builder
      builder.businessOwners(args.map(_(argsBuilder).build)*)

    /**
     * @param criticality Criticality of the Application, Service, or Workload
     *  Structure is documented below.
     * @return builder
     */
    def criticality(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadAttributesCriticalityArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadAttributesCriticalityArgs.builder
      builder.criticality(args(argsBuilder).build)

    /**
     * @param developerOwners Developer team that owns development and coding.
     *  Structure is documented below.
     * @return builder
     */
    def developerOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadAttributesDeveloperOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadAttributesDeveloperOwnerArgs.builder
      builder.developerOwners(args.map(_(argsBuilder).build)*)

    /**
     * @param environment Environment of the Application, Service, or Workload
     *  Structure is documented below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadAttributesEnvironmentArgs.Builder]):
        com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadAttributesEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param operatorOwners Operator team that ensures runtime and operations.
     *  Structure is documented below.
     * @return builder
     */
    def operatorOwners(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadAttributesOperatorOwnerArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadAttributesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadAttributesOperatorOwnerArgs.builder
      builder.operatorOwners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyExtendedMetadataArgs.Builder)
    /**
     * @param values (Output)
     *  The value of the extended metadata.
     *  Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyExtendedMetadataValueArgs.Builder]*):
        com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyExtendedMetadataArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apphub.inputs.WorkloadWorkloadPropertyExtendedMetadataValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)
