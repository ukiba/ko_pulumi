package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object licensemanager:
  /** Provides a License Manager grant. This allows for sharing licenses with other AWS accounts. */
  def LicenseGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.LicenseGrantArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.licensemanager.LicenseGrantArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.licensemanager.LicenseGrant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type LicensemanagerFunctions = com.pulumi.aws.licensemanager.LicensemanagerFunctions
  object LicensemanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.licensemanager.LicensemanagerFunctions.*
  extension (self: LicensemanagerFunctions.type)
    /** This resource can be used to get a set of license grant ARNs matching a filter. */
    def getLicenseGrants(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.licensemanager.outputs.GetLicenseGrantsResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getLicenseGrants(args(argsBuilder).build)

    /** This resource can be used to get a set of license grant ARNs matching a filter. */
    def getLicenseGrantsPlain(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.licensemanager.outputs.GetLicenseGrantsResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsPlainArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getLicenseGrantsPlain(args(argsBuilder).build)

    /** This resource can be used to get data on a received license using an ARN. This can be helpful for pulling in data on a license from the AWS marketplace and sharing that license with another account. */
    def getReceivedLicense(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicenseArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.licensemanager.outputs.GetReceivedLicenseResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicenseArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicense(args(argsBuilder).build)

    /** This resource can be used to get data on a received license using an ARN. This can be helpful for pulling in data on a license from the AWS marketplace and sharing that license with another account. */
    def getReceivedLicensePlain(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.licensemanager.outputs.GetReceivedLicenseResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensePlainArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicensePlain(args(argsBuilder).build)

    /** This resource can be used to get a set of license ARNs matching a filter. */
    def getReceivedLicenses(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.licensemanager.outputs.GetReceivedLicensesResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicenses(args(argsBuilder).build)

    /** This resource can be used to get a set of license ARNs matching a filter. */
    def getReceivedLicensesPlain(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.licensemanager.outputs.GetReceivedLicensesResult] =
      val argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesPlainArgs.builder
      com.pulumi.aws.licensemanager.LicensemanagerFunctions.getReceivedLicensesPlain(args(argsBuilder).build)

  /** Accepts a License Manager grant. This allows for sharing licenses with other aws accounts. */
  def LicenseGrantAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.LicenseGrantAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.licensemanager.LicenseGrantAccepterArgs.builder
    
    com.pulumi.aws.licensemanager.LicenseGrantAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a License Manager license configuration resource.
   *  
   *  &gt; **Note:** Removing the `licenseCount` attribute is not supported by the License Manager API.
   */
  def LicenseConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.LicenseConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.licensemanager.LicenseConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.licensemanager.LicenseConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a License Manager association.
   *  
   *  &gt; **Note:** License configurations can also be associated with launch templates by specifying the `licenseSpecifications` block for an `aws.ec2.LaunchTemplate`.
   */
  def Association(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.licensemanager.AssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.licensemanager.AssociationArgs.builder
    
    com.pulumi.aws.licensemanager.Association(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesFilterArgs.Builder]*):
        com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.Builder =
      def argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsFilterArgs.Builder]*):
        com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.Builder =
      def argsBuilder = com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)
