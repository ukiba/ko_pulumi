package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object licensemanager:
  /**
   * Provides a License Manager association.
   * 
   * &gt; **Note:** License configurations can also be associated with launch templates by specifying the `licenseSpecifications` block for an `aws.ec2.LaunchTemplate`.
   */
  def Association(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.AssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.licensemanager.AssociationArgs.builder
    com.pulumi.aws.licensemanager.Association(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a License Manager license configuration resource.
   * 
   * &gt; **Note:** Removing the `licenseCount` attribute is not supported by the License Manager API.
   */
  def LicenseConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.LicenseConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.licensemanager.LicenseConfigurationArgs.builder
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
    com.pulumi.aws.licensemanager.LicenseConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a License Manager grant. This allows for sharing licenses with other AWS accounts. */
  def LicenseGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.LicenseGrantArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.licensemanager.LicenseGrantArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.licensemanager.LicenseGrant(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Accepts a License Manager grant. This allows for sharing licenses with other aws accounts. */
  def LicenseGrantAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.LicenseGrantAccepterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.licensemanager.LicenseGrantAccepterArgs.builder
    com.pulumi.aws.licensemanager.LicenseGrantAccepter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LicensemanagerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** This resource can be used to get a set of license grant ARNs matching a filter. */
    inline def getLicenseGrants(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.licensemanager.outputs.GetLicenseGrantsResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getLicenseGrants(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** This resource can be used to get a set of license grant ARNs matching a filter. */
    inline def getLicenseGrantsPlain(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.licensemanager.outputs.GetLicenseGrantsResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsPlainArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getLicenseGrantsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** This resource can be used to get data on a received license using an ARN. This can be helpful for pulling in data on a license from the AWS marketplace and sharing that license with another account. */
    inline def getReceivedLicense(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicenseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.licensemanager.outputs.GetReceivedLicenseResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicenseArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicense(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** This resource can be used to get data on a received license using an ARN. This can be helpful for pulling in data on a license from the AWS marketplace and sharing that license with another account. */
    inline def getReceivedLicensePlain(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.licensemanager.outputs.GetReceivedLicenseResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensePlainArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicensePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** This resource can be used to get a set of license ARNs matching a filter. */
    inline def getReceivedLicenses(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.licensemanager.outputs.GetReceivedLicensesResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicenses(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** This resource can be used to get a set of license ARNs matching a filter. */
    inline def getReceivedLicensesPlain(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.licensemanager.outputs.GetReceivedLicensesResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesPlainArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicensesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
