package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object healthcare:
  /** Manages a Healthcare DICOM Service */
  def DicomService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.healthcare.DicomServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.DicomServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.healthcare.DicomService(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Healthcare FHIR (Fast Healthcare Interoperability Resources) Service */
  def FhirService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.healthcare.FhirServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.FhirServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.healthcare.FhirService(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object HealthcareFunctions:
    /** Use this data source to access information about an existing Healthcare DICOM Service */
    inline def getDicomService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetDicomServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetDicomServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetDicomServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getDicomService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Healthcare DICOM Service */
    inline def getDicomServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetDicomServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetDicomServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetDicomServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getDicomServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Healthcare FHIR Service(Fast Healthcare Interoperability Resources). */
    inline def getFhirService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetFhirServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetFhirServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetFhirServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getFhirService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Healthcare FHIR Service(Fast Healthcare Interoperability Resources). */
    inline def getFhirServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetFhirServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetFhirServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetFhirServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getFhirServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Healthcare Med Tech Service */
    inline def getMedtechService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetMedtechServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetMedtechServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetMedtechServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getMedtechService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Healthcare Med Tech Service */
    inline def getMedtechServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetMedtechServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetMedtechServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetMedtechServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getMedtechServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Healthcare Service */
    inline def getService(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetServiceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Healthcare Service */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Healthcare Workspace */
    inline def getWorkspace(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetWorkspaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.healthcare.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getWorkspace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Healthcare Workspace */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.azure.healthcare.inputs.GetWorkspacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.healthcare.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.healthcare.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.healthcare.HealthcareFunctions.getWorkspacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Healthcare Med Tech Service. */
  def MedtechService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.healthcare.MedtechServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.MedtechServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.healthcare.MedtechService(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Healthcare Med Tech Service Fhir Destination. */
  def MedtechServiceFhirDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.healthcare.MedtechServiceFhirDestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.MedtechServiceFhirDestinationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.healthcare.MedtechServiceFhirDestination(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Healthcare Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.healthcare.ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.ServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.healthcare.Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Healthcare workspace */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.healthcare.WorkspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.healthcare.WorkspaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.healthcare.Workspace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
