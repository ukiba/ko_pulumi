package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object communication:
  object CommunicationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Communication Service. */
    inline def getService(args: Endofunction[com.pulumi.azure.communication.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.communication.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.communication.inputs.GetServiceArgs.builder
      com.pulumi.azure.communication.CommunicationFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Communication Service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.communication.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.communication.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.communication.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.communication.CommunicationFunctions.getServicePlain(args(argsBuilder).build)

  /** Manages an Email Communication Service. */
  def EmailService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.communication.EmailServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.communication.EmailServiceArgs.builder
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
    com.pulumi.azure.communication.EmailService(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Email Communication Service Domain. */
  def EmailServiceDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.communication.EmailServiceDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.communication.EmailServiceDomainArgs.builder
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
    com.pulumi.azure.communication.EmailServiceDomain(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Email Communication Service Domain Sender Username. */
  def EmailServiceDomainSenderUsername(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.communication.EmailServiceDomainSenderUsernameArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.communication.EmailServiceDomainSenderUsernameArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.communication.EmailServiceDomainSenderUsername(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Communication Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.communication.ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.communication.ServiceArgs.builder
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
    com.pulumi.azure.communication.Service(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a communication service email domain association. */
  def ServiceEmailDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.communication.ServiceEmailDomainAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.communication.ServiceEmailDomainAssociationArgs.builder
    com.pulumi.azure.communication.ServiceEmailDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.communication.inputs.EmailServiceDomainState.Builder)
    /**
     * @param verificationRecords (Optional) An `verificationRecords` block as defined below.
     * @return builder
     */
    def verificationRecords(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainState.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.builder
      builder.verificationRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder)
    /**
     * @param dkim2s (Optional) An `dkim2` block as defined below.
     * @return builder
     */
    def dkim2s(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkim2Args.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkim2Args.builder
      builder.dkim2s(args.map(_(argsBuilder).build)*)

    /**
     * @param dkims (Optional) An `dkim` block as defined below.
     * @return builder
     */
    def dkims(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkimArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkimArgs.builder
      builder.dkims(args.map(_(argsBuilder).build)*)

    /**
     * @param dmarcs (Optional) An `dmarc` block as defined below.
     * @return builder
     */
    def dmarcs(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDmarcArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDmarcArgs.builder
      builder.dmarcs(args.map(_(argsBuilder).build)*)

    /**
     * @param domains (Optional) An `domain` block as defined below.
     * @return builder
     */
    def domains(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDomainArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

    /**
     * @param spfs (Optional) An `spf` block as defined below.
     * @return builder
     */
    def spfs(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordSpfArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordSpfArgs.builder
      builder.spfs(args.map(_(argsBuilder).build)*)
