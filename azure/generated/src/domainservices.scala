package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object domainservices:
  object DomainservicesFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Gets information about an Active Directory Domain Service.
     * 
     * &gt; **Note:** At present this data source only supports **User Forest** mode and _not_ **Resource Forest** mode. [Read more](https://docs.microsoft.com/azure/active-directory-domain-services/concepts-resource-forest) about the different operation modes for this service.
     */
    inline def getService(args: Endofunction[com.pulumi.azure.domainservices.inputs.GetServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.domainservices.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.GetServiceArgs.builder
      com.pulumi.azure.domainservices.DomainservicesFunctions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Gets information about an Active Directory Domain Service.
     * 
     * &gt; **Note:** At present this data source only supports **User Forest** mode and _not_ **Resource Forest** mode. [Read more](https://docs.microsoft.com/azure/active-directory-domain-services/concepts-resource-forest) about the different operation modes for this service.
     */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.domainservices.inputs.GetServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.domainservices.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.domainservices.DomainservicesFunctions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Replica Set for an Active Directory Domain Service. */
  def ReplicaSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.domainservices.ReplicaSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.domainservices.ReplicaSetArgs.builder
    com.pulumi.azure.domainservices.ReplicaSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Active Directory Domain Service.
   * 
   * &gt; **Note:** Before using this resource, there must exist in your tenant a service principal for the Domain Services published application. This service principal cannot be easily managed by Terraform and it&#39;s recommended to create this manually, as it does not exist by default. See [official documentation](https://docs.microsoft.com/azure/active-directory-domain-services/powershell-create-instance#create-required-azure-ad-resources) for details.
   * 
   * &gt; **Note:** At present this resource only supports **User Forest** mode and _not_ **Resource Forest** mode. [Read more](https://docs.microsoft.com/azure/active-directory-domain-services/concepts-resource-forest) about the different operation modes for this service.
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.domainservices.ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.domainservices.ServiceArgs.builder
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
    com.pulumi.azure.domainservices.Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Active Directory Domain Service Trust. */
  def ServiceTrust(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.domainservices.ServiceTrustArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.domainservices.ServiceTrustArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.domainservices.ServiceTrust(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
