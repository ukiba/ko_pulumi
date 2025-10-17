package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object armmsi:
  /** Manages a Federated Identity Credential. */
  def FederatedIdentityCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.armmsi.FederatedIdentityCredentialArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.armmsi.FederatedIdentityCredentialArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.armmsi.FederatedIdentityCredential(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
