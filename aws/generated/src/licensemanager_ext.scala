package jp.ukiba.ko_pulumi
package aws

object licensemanager_ext:
  extension (builder: com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsFilterArgs.Builder]*):
        com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsArgs.Builder =
      def argsBuilder = com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsFilter.Builder]*):
        com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesFilterArgs.Builder]*):
        com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesArgs.Builder =
      def argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesFilter.Builder]*):
        com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.licensemanager.inputs.GetReceivedLicensesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)
