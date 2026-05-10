package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object domainservices:
  extension (builder: com.pulumi.azure.domainservices.ServiceArgs.Builder)
    /**
     * @param initialReplicaSet An `initialReplicaSet` block as defined below. The initial replica set inherits the same location as the Domain Service resource.
     * @return builder
     */
    def initialReplicaSet(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.builder
      builder.initialReplicaSet(args(argsBuilder).build)

    /**
     * @param notifications A `notifications` block as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.builder
      builder.notifications(args(argsBuilder).build)

    /**
     * @param secureLdap A `secureLdap` block as defined below.
     * @return builder
     */
    def secureLdap(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.builder
      builder.secureLdap(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Replica Set for an Active Directory Domain Service. */
  def ReplicaSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.domainservices.ReplicaSetArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.domainservices.ReplicaSetArgs.builder
    com.pulumi.azure.domainservices.ReplicaSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Active Directory Domain Service.
   * 
   *  &gt; **Note:** Before using this resource, there must exist in your tenant a service principal for the Domain Services published application. This service principal cannot be easily managed by Terraform and it&#39;s recommended to create this manually, as it does not exist by default. See [official documentation](https://docs.microsoft.com/azure/active-directory-domain-services/powershell-create-instance#create-required-azure-ad-resources) for details.
   * 
   *  &gt; **Note:** At present this resource only supports **User Forest** mode and _not_ **Resource Forest** mode. [Read more](https://docs.microsoft.com/azure/active-directory-domain-services/concepts-resource-forest) about the different operation modes for this service.
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.domainservices.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.domainservices.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.domainservices.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Active Directory Domain Service Trust. */
  def ServiceTrust(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.domainservices.ServiceTrustArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.domainservices.ServiceTrustArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.domainservices.ServiceTrust(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.domainservices.inputs.ServiceState.Builder)
    /**
     * @param initialReplicaSet An `initialReplicaSet` block as defined below. The initial replica set inherits the same location as the Domain Service resource.
     * @return builder
     */
    def initialReplicaSet(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.builder
      builder.initialReplicaSet(args(argsBuilder).build)

    /**
     * @param notifications A `notifications` block as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.builder
      builder.notifications(args(argsBuilder).build)

    /**
     * @param secureLdap A `secureLdap` block as defined below.
     * @return builder
     */
    def secureLdap(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.builder
      builder.secureLdap(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type DomainservicesFunctions = com.pulumi.azure.domainservices.DomainservicesFunctions
  object DomainservicesFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.domainservices.DomainservicesFunctions.*
  extension (self: DomainservicesFunctions.type)
    /**
     * Gets information about an Active Directory Domain Service.
     * 
     *  &gt; **Note:** At present this data source only supports **User Forest** mode and _not_ **Resource Forest** mode. [Read more](https://docs.microsoft.com/azure/active-directory-domain-services/concepts-resource-forest) about the different operation modes for this service.
     */
    def getService(args: Endofunction[com.pulumi.azure.domainservices.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.domainservices.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.GetServiceArgs.builder
      com.pulumi.azure.domainservices.DomainservicesFunctions.getService(args(argsBuilder).build)

    /**
     * Gets information about an Active Directory Domain Service.
     * 
     *  &gt; **Note:** At present this data source only supports **User Forest** mode and _not_ **Resource Forest** mode. [Read more](https://docs.microsoft.com/azure/active-directory-domain-services/concepts-resource-forest) about the different operation modes for this service.
     */
    def getServicePlain(args: Endofunction[com.pulumi.azure.domainservices.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.domainservices.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.domainservices.DomainservicesFunctions.getServicePlain(args(argsBuilder).build)
