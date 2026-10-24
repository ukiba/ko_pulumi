package jp.ukiba.ko_pulumi
package azure

object appservice_ext:
  extension (builder: com.pulumi.azure.appservice.AppConnectionArgs.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * 
     * &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.appservice.inputs.AppConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appservice.AppConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    inline def secretStore(args: Endofunction[com.pulumi.azure.appservice.inputs.AppConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appservice.AppConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder)
    /**
     * @param alwaysReadies One or more `alwaysReady` blocks as defined below.
     * @return builder
     */
    inline def alwaysReadies(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAlwaysReadyArgs.Builder]*):
        com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAlwaysReadyArgs.builder
      builder.alwaysReadies(args.map(_(argsBuilder).build)*)

    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionIdentityArgs.Builder]):
        com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.AppServiceArgs.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceBackupArgs.Builder]):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceIdentityArgs.Builder]):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceLogsArgs.Builder]):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param sourceControl A `sourceControl` block as defined below.
     * @return builder
     */
    inline def sourceControl(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSourceControlArgs.Builder]):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSourceControlArgs.builder
      builder.sourceControl(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.AppServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.ConnectionArgs.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * 
     * &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.appservice.inputs.ConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appservice.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.ConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    inline def secretStore(args: Endofunction[com.pulumi.azure.appservice.inputs.ConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appservice.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.ConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.EnvironmentV3Args.Builder)
    /**
     * @param clusterSettings Zero or more `clusterSetting` blocks as defined below.
     * @return builder
     */
    inline def clusterSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.EnvironmentV3ClusterSettingArgs.Builder]*):
        com.pulumi.azure.appservice.EnvironmentV3Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.EnvironmentV3ClusterSettingArgs.builder
      builder.clusterSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.FunctionAppArgs.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.FunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param connectionStrings An `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.FunctionAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.FunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.FunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param sourceControl A `sourceControl` block, as defined below.
     * @return builder
     */
    inline def sourceControl(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSourceControlArgs.Builder]):
        com.pulumi.azure.appservice.FunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSourceControlArgs.builder
      builder.sourceControl(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.FunctionAppFunctionArgs.Builder)
    /**
     * @param files A `file` block as detailed below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def files(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppFunctionFileArgs.Builder]*):
        com.pulumi.azure.appservice.FunctionAppFunctionArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppFunctionFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.FunctionAppSlotArgs.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.FunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param connectionStrings A `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.FunctionAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.FunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.FunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder)
    /**
     * @param authSettings an `authSettings` block as detailed below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 an `authSettingsV2` block as detailed below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup a `backup` block as detailed below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings a `connectionString` block as detailed below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as detailed below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig a `siteConfig` block as detailed below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.LinuxWebAppArgs.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppLogsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxWebAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.PlanArgs.Builder)
    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.appservice.inputs.PlanSkuArgs.Builder]):
        com.pulumi.azure.appservice.PlanArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.PlanSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.SlotArgs.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.SlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param connectionStrings An `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.SlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.SlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.SlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotLogsArgs.Builder]):
        com.pulumi.azure.appservice.SlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.SlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.SlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.SlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.SourceControlArgs.Builder)
    /**
     * @param githubActionConfiguration A `githubActionConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def githubActionConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.SourceControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs.builder
      builder.githubActionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.SourceControlSlotArgs.Builder)
    /**
     * @param githubActionConfiguration A `githubActionConfiguration` block as detailed below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def githubActionConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.SourceControlSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationArgs.builder
      builder.githubActionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.StaticSiteArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.StaticSiteIdentityArgs.Builder]):
        com.pulumi.azure.appservice.StaticSiteArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.StaticSiteIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.StaticWebAppArgs.Builder)
    /**
     * @param basicAuth A `basicAuth` block as defined below.
     * @return builder
     */
    inline def basicAuth(args: Endofunction[com.pulumi.azure.appservice.inputs.StaticWebAppBasicAuthArgs.Builder]):
        com.pulumi.azure.appservice.StaticWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.StaticWebAppBasicAuthArgs.builder
      builder.basicAuth(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.StaticWebAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.StaticWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.StaticWebAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 A `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder)
    /**
     * @param authSettings an `authSettings` block as detailed below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 an `authSettingsV2` block as detailed below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup a `backup` block as detailed below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings a `connectionString` block as detailed below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity an `identity` block as detailed below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig a `siteConfig` block as detailed below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.WindowsWebAppArgs.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppLogsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * 
     * &gt; **Note:** Using this value requires `WEBSITE_RUN_FROM_PACKAGE=1` to be set on the App in `appSettings`. Refer to the [Azure docs](https://docs.microsoft.com/en-us/azure/app-service/deploy-run-package) for further details.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsWebAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * 
     * &gt; **Note:** Using this value requires `WEBSITE_RUN_FROM_PACKAGE=1` to be set on the App in `appSettings`. Refer to the [Azure docs](https://docs.microsoft.com/en-us/azure/app-service/deploy-run-package) for further details.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.AppConnectionState.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * 
     * &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.appservice.inputs.AppConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    inline def secretStore(args: Endofunction[com.pulumi.azure.appservice.inputs.AppConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined above.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github A `github` block as defined below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.Builder)
    /**
     * @param appServiceLogs An `appServiceLogs` block as defined above.
     * @return builder
     */
    inline def appServiceLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigAppServiceLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigAppServiceLogsArgs.builder
      builder.appServiceLogs(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined above.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions One or more `ipRestriction` blocks as defined above.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions One or more `scmIpRestriction` blocks as defined above.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder)
    /**
     * @param alwaysReadies One or more `alwaysReady` blocks as defined below.
     * @return builder
     */
    inline def alwaysReadies(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAlwaysReadyArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAlwaysReadyArgs.builder
      builder.alwaysReadies(args.map(_(argsBuilder).build)*)

    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppFlexConsumptionStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppFlexConsumptionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppFlexConsumptionStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceBackupArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceLogsApplicationLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceLogsApplicationLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceLogsApplicationLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceLogsApplicationLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceLogsArgs.Builder)
    /**
     * @param applicationLogs An `applicationLogs` block as defined below.
     * @return builder
     */
    inline def applicationLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceLogsApplicationLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceLogsApplicationLogsArgs.builder
      builder.applicationLogs(args(argsBuilder).build)

    /**
     * @param httpLogs An `httpLogs` block as defined below.
     * @return builder
     */
    inline def httpLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsArgs.builder
      builder.httpLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

    /**
     * @param fileSystem A `fileSystem` block as defined below.
     * @return builder
     */
    inline def fileSystem(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsFileSystemArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceLogsHttpLogsFileSystemArgs.builder
      builder.fileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions A list of objects representing ip restrictions as defined below.
     * 
     * &gt; **NOTE** User has to explicitly set `ipRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions A list of `scmIpRestriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **NOTE** User has to explicitly set `scmIpRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `ipRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `scmIpRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.AppServiceState.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this App Service.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceControl A `sourceControl` block as defined below.
     * @return builder
     */
    inline def sourceControl(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceSourceControlArgs.Builder]):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceSourceControlArgs.builder
      builder.sourceControl(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.AppServiceStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.AppServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.AppServiceStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.CertificateOrderState.Builder)
    /**
     * @param certificates State of the Key Vault secret. A `certificates` block as defined below.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.azure.appservice.inputs.CertificateOrderCertificateArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.CertificateOrderState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.CertificateOrderCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.ConnectionState.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * 
     * &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.appservice.inputs.ConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.ConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    inline def secretStore(args: Endofunction[com.pulumi.azure.appservice.inputs.ConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appservice.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.ConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.EnvironmentV3State.Builder)
    /**
     * @param clusterSettings Zero or more `clusterSetting` blocks as defined below.
     * @return builder
     */
    inline def clusterSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.EnvironmentV3ClusterSettingArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.EnvironmentV3State.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.EnvironmentV3ClusterSettingArgs.builder
      builder.clusterSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param inboundNetworkDependencies An `inboundNetworkDependencies` block as defined below.
     * @return builder
     */
    inline def inboundNetworkDependencies(args: Endofunction[com.pulumi.azure.appservice.inputs.EnvironmentV3InboundNetworkDependencyArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.EnvironmentV3State.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.EnvironmentV3InboundNetworkDependencyArgs.builder
      builder.inboundNetworkDependencies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppFunctionState.Builder)
    /**
     * @param files A `file` block as detailed below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def files(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppFunctionFileArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppFunctionState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppFunctionFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions A list of `ipRestriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **NOTE** User has to explicitly set `ipRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions A list of `scmIpRestriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **NOTE** User has to explicitly set `scmIpRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `ipRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `scmIpRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions A list of `ipRestriction` objects representing IP restrictions as defined below.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions A list of `scmIpRestriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **NOTE** User has to explicitly set `scmIpRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `ipRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `scmIpRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppSlotState.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param connectionStrings A `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this Function App Slot.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.FunctionAppState.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param connectionStrings An `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this App Service.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.FunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceControl A `sourceControl` block, as defined below.
     * @return builder
     */
    inline def sourceControl(args: Endofunction[com.pulumi.azure.appservice.inputs.FunctionAppSourceControlArgs.Builder]):
        com.pulumi.azure.appservice.inputs.FunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.FunctionAppSourceControlArgs.builder
      builder.sourceControl(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined above.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github A `github` block as defined below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigApplicationStackArgs.Builder)
    /**
     * @param dockers One or more `docker` blocks as defined below.
     * @return builder
     */
    inline def dockers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigApplicationStackDockerArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigApplicationStackArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigApplicationStackDockerArgs.builder
      builder.dockers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder)
    /**
     * @param appServiceLogs An `appServiceLogs` block as defined above.
     * @return builder
     */
    inline def appServiceLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigAppServiceLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigAppServiceLogsArgs.builder
      builder.appServiceLogs(args(argsBuilder).build)

    /**
     * @param applicationStack An `applicationStack` block as defined above.
     * 
     * &gt; **Note:** If this is set, there must not be an application setting `FUNCTIONS_WORKER_RUNTIME`.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined above.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions One or more `ipRestriction` blocks as defined above.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions One or more `scmIpRestriction` blocks as defined above.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory an `activeDirectory` block as detailed below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook a `facebook` block as detailed below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github a `github` block as detailed below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google a `google` block as detailed below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft a `microsoft` block as detailed below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter a `twitter` block as detailed below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupArgs.Builder)
    /**
     * @param schedule a `schedule` block as detailed below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigApplicationStackArgs.Builder)
    /**
     * @param dockers a `docker` block as detailed below.
     * @return builder
     */
    inline def dockers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigApplicationStackArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigApplicationStackDockerArgs.builder
      builder.dockers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder)
    /**
     * @param appServiceLogs an `appServiceLogs` block as detailed below.
     * @return builder
     */
    inline def appServiceLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigAppServiceLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigAppServiceLogsArgs.builder
      builder.appServiceLogs(args(argsBuilder).build)

    /**
     * @param applicationStack an `applicationStack` block as detailed below.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param cors a `cors` block as detailed below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions an `ipRestriction` block as detailed below.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions a `scmIpRestriction` block as detailed below.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers a `headers` block as detailed below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers a `headers` block as detailed below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder)
    /**
     * @param authSettings an `authSettings` block as detailed below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 an `authSettingsV2` block as detailed below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup a `backup` block as detailed below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings a `connectionString` block as detailed below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as detailed below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig a `siteConfig` block as detailed below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxFunctionAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxFunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxFunctionAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined above.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github A `github` block as defined below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppBackupArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppLogsApplicationLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppLogsApplicationLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppLogsApplicationLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppLogsApplicationLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppLogsArgs.Builder)
    /**
     * @param applicationLogs A `applicationLogs` block as defined above.
     * @return builder
     */
    inline def applicationLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppLogsApplicationLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppLogsApplicationLogsArgs.builder
      builder.applicationLogs(args(argsBuilder).build)

    /**
     * @param httpLogs An `httpLogs` block as defined above.
     * @return builder
     */
    inline def httpLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsArgs.builder
      builder.httpLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsArgs.Builder)
    /**
     * @param azureBlobStorage A `azureBlobStorageHttp` block as defined above.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

    /**
     * @param fileSystem A `fileSystem` block as defined above.
     * @return builder
     */
    inline def fileSystem(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsFileSystemArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppLogsHttpLogsFileSystemArgs.builder
      builder.fileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder)
    /**
     * @param applicationStack A `applicationStack` block as defined above.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param autoHealSetting A `autoHealSetting` block as defined above. Required with `autoHeal`.
     * @return builder
     */
    inline def autoHealSetting(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingArgs.builder
      builder.autoHealSetting(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined above.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions One or more `ipRestriction` blocks as defined above.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions One or more `scmIpRestriction` blocks as defined above.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingArgs.Builder)
    /**
     * @param action A `action` block as defined above.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingActionArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerArgs.Builder)
    /**
     * @param requests A `requests` block as defined above.
     * @return builder
     */
    inline def requests(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerRequestsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

    /**
     * @param slowRequest A `slowRequest` blocks as defined above.
     * @return builder
     */
    inline def slowRequest(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequestArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequestArgs.builder
      builder.slowRequest(args(argsBuilder).build)

    /**
     * @param slowRequestWithPaths One or more `slowRequestWithPath` blocks as defined above.
     * @return builder
     */
    inline def slowRequestWithPaths(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.builder
      builder.slowRequestWithPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param statusCodes One or more `statusCode` blocks as defined above.
     * @return builder
     */
    inline def statusCodes(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs.builder
      builder.statusCodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined above.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github A `github` block as defined below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupArgs.Builder)
    /**
     * @param schedule An `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsApplicationLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsApplicationLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs.Builder)
    /**
     * @param applicationLogs A `applicationLogs` block as defined above.
     * @return builder
     */
    inline def applicationLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsApplicationLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsApplicationLogsArgs.builder
      builder.applicationLogs(args(argsBuilder).build)

    /**
     * @param httpLogs An `httpLogs` block as defined above.
     * @return builder
     */
    inline def httpLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsArgs.builder
      builder.httpLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsArgs.Builder)
    /**
     * @param azureBlobStorage A `azureBlobStorageHttp` block as defined above.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

    /**
     * @param fileSystem A `fileSystem` block as defined above.
     * @return builder
     */
    inline def fileSystem(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsFileSystemArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsHttpLogsFileSystemArgs.builder
      builder.fileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder)
    /**
     * @param applicationStack A `applicationStack` block as defined above.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param autoHealSetting A `autoHealSetting` block as defined above. Required with `autoHeal`.
     * @return builder
     */
    inline def autoHealSetting(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingArgs.builder
      builder.autoHealSetting(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined above.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions One or more `ipRestriction` blocks as defined above.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions One or more `scmIpRestriction` blocks as defined above.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingArgs.Builder)
    /**
     * @param action A `action` block as defined above.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingActionArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder)
    /**
     * @param requests A `requests` block as defined above.
     * @return builder
     */
    inline def requests(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequestsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

    /**
     * @param slowRequest A `slowRequest` block as defined above.
     * @return builder
     */
    inline def slowRequest(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestArgs.builder
      builder.slowRequest(args(argsBuilder).build)

    /**
     * @param slowRequestWithPaths One or more `slowRequestWithPath` blocks as defined above.
     * @return builder
     */
    inline def slowRequestWithPaths(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.builder
      builder.slowRequestWithPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param statusCodes One or more `statusCode` blocks as defined above.
     * @return builder
     */
    inline def statusCodes(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCodeArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCodeArgs.builder
      builder.statusCodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.LinuxWebAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.LinuxWebAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.LinuxWebAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.PlanState.Builder)
    /**
     * @param sku A `sku` block as documented below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.appservice.inputs.PlanSkuArgs.Builder]):
        com.pulumi.azure.appservice.inputs.PlanState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.PlanSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotLogsApplicationLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotLogsApplicationLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotLogsApplicationLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotLogsApplicationLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotLogsArgs.Builder)
    /**
     * @param applicationLogs An `applicationLogs` block as defined below.
     * @return builder
     */
    inline def applicationLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotLogsApplicationLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotLogsApplicationLogsArgs.builder
      builder.applicationLogs(args(argsBuilder).build)

    /**
     * @param httpLogs An `httpLogs` block as defined below.
     * @return builder
     */
    inline def httpLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsArgs.builder
      builder.httpLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

    /**
     * @param fileSystem A `fileSystem` block as defined below.
     * @return builder
     */
    inline def fileSystem(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsFileSystemArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsFileSystemArgs.builder
      builder.fileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions A list of objects representing ip restrictions as defined below.
     * 
     * &gt; **NOTE** User has to explicitly set `ipRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions A list of `scmIpRestriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **NOTE** User has to explicitly set `scmIpRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `ipRestriction` as defined below. The HTTP header filters are evaluated after the rule itself and both conditions must be true for the rule to apply.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `scmIpRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SlotState.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param connectionStrings An `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.SlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.SlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this App Service slot.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.SlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.SlotSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.SlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.SlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.SlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs.Builder)
    /**
     * @param codeConfiguration A `codeConfiguration` block as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def codeConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationCodeConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationCodeConfigurationArgs.builder
      builder.codeConfiguration(args(argsBuilder).build)

    /**
     * @param containerConfiguration A `containerConfiguration` block as defined above.
     * @return builder
     */
    inline def containerConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationContainerConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationContainerConfigurationArgs.builder
      builder.containerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationArgs.Builder)
    /**
     * @param codeConfiguration A `codeConfiguration` block as detailed below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def codeConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationCodeConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationCodeConfigurationArgs.builder
      builder.codeConfiguration(args(argsBuilder).build)

    /**
     * @param containerConfiguration A `containerConfiguration` block as detailed below.
     * @return builder
     */
    inline def containerConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationContainerConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationContainerConfigurationArgs.builder
      builder.containerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SourceControlSlotState.Builder)
    /**
     * @param githubActionConfiguration A `githubActionConfiguration` block as detailed below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def githubActionConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SourceControlSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlSlotGithubActionConfigurationArgs.builder
      builder.githubActionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.SourceControlState.Builder)
    /**
     * @param githubActionConfiguration A `githubActionConfiguration` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def githubActionConfiguration(args: Endofunction[com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs.Builder]):
        com.pulumi.azure.appservice.inputs.SourceControlState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs.builder
      builder.githubActionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.StaticSiteState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.StaticSiteIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.StaticSiteState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.StaticSiteIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.StaticWebAppState.Builder)
    /**
     * @param basicAuth A `basicAuth` block as defined below.
     * @return builder
     */
    inline def basicAuth(args: Endofunction[com.pulumi.azure.appservice.inputs.StaticWebAppBasicAuthArgs.Builder]):
        com.pulumi.azure.appservice.inputs.StaticWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.StaticWebAppBasicAuthArgs.builder
      builder.basicAuth(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.StaticWebAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.StaticWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.StaticWebAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined above.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github A `github` block as defined below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder)
    /**
     * @param appServiceLogs An `appServiceLogs` block as defined above.
     * @return builder
     */
    inline def appServiceLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigAppServiceLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigAppServiceLogsArgs.builder
      builder.appServiceLogs(args(argsBuilder).build)

    /**
     * @param applicationStack An `applicationStack` block as defined above.
     * 
     * &gt; **Note:** If this is set, there must not be an application setting `FUNCTIONS_WORKER_RUNTIME`.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined above.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions One or more `ipRestriction` blocks as defined above.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions One or more `scmIpRestriction` blocks as defined above.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory an `activeDirectory` block as detailed below.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook a `facebook` block as detailed below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github a `github` block as detailed below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google a `google` block as detailed below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft a `microsoft` block as detailed below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter a `twitter` block as detailed below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupArgs.Builder)
    /**
     * @param schedule a `schedule` block as detailed below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder)
    /**
     * @param appServiceLogs an `appServiceLogs` block as detailed below.
     * @return builder
     */
    inline def appServiceLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigAppServiceLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigAppServiceLogsArgs.builder
      builder.appServiceLogs(args(argsBuilder).build)

    /**
     * @param applicationStack an `applicationStack` block as detailed below.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param cors a `cors` block as detailed below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions an `ipRestriction` block as detailed below.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions a `scmIpRestriction` block as detailed below.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers a `headers` block as detailed below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers a `headers` block as detailed below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder)
    /**
     * @param authSettings an `authSettings` block as detailed below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 an `authSettingsV2` block as detailed below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup a `backup` block as detailed below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings a `connectionString` block as detailed below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity an `identity` block as detailed below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig a `siteConfig` block as detailed below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder)
    /**
     * @param authSettings A `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 A `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsFunctionAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsFunctionAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsFunctionAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined above.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github A `github` block as defined below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppBackupArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppLogsApplicationLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppLogsApplicationLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppLogsApplicationLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppLogsApplicationLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppLogsArgs.Builder)
    /**
     * @param applicationLogs A `applicationLogs` block as defined above.
     * @return builder
     */
    inline def applicationLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppLogsApplicationLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppLogsApplicationLogsArgs.builder
      builder.applicationLogs(args(argsBuilder).build)

    /**
     * @param httpLogs A `httpLogs` block as defined above.
     * @return builder
     */
    inline def httpLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsArgs.builder
      builder.httpLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsArgs.Builder)
    /**
     * @param azureBlobStorage A `azureBlobStorageHttp` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

    /**
     * @param fileSystem A `fileSystem` block as defined above.
     * @return builder
     */
    inline def fileSystem(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsFileSystemArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppLogsHttpLogsFileSystemArgs.builder
      builder.fileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder)
    /**
     * @param applicationStack A `applicationStack` block as defined above.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param autoHealSetting A `autoHealSetting` block as defined above. Required with `autoHeal`.
     * @return builder
     */
    inline def autoHealSetting(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingArgs.builder
      builder.autoHealSetting(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined above.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param handlerMappings One or more `handlerMapping` blocks as defined below.
     * @return builder
     */
    inline def handlerMappings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigHandlerMappingArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigHandlerMappingArgs.builder
      builder.handlerMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param ipRestrictions One or more `ipRestriction` blocks as defined above.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions One or more `scmIpRestriction` blocks as defined above.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualApplications One or more `virtualApplication` blocks as defined below.
     * @return builder
     */
    inline def virtualApplications(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigVirtualApplicationArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigVirtualApplicationArgs.builder
      builder.virtualApplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingActionArgs.Builder)
    /**
     * @param customAction A `customAction` block as defined below.
     * @return builder
     */
    inline def customAction(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs.builder
      builder.customAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingArgs.Builder)
    /**
     * @param action An `action` block as defined above.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingActionArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs.Builder)
    /**
     * @param requests A `requests` block as defined above.
     * @return builder
     */
    inline def requests(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerRequestsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

    /**
     * @param slowRequest A `slowRequest` block as defined above.
     * @return builder
     */
    inline def slowRequest(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequestArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequestArgs.builder
      builder.slowRequest(args(argsBuilder).build)

    /**
     * @param slowRequestWithPaths One or more `slowRequestWithPath` blocks as defined above.
     * @return builder
     */
    inline def slowRequestWithPaths(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.builder
      builder.slowRequestWithPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param statusCodes One or more `statusCode` blocks as defined above.
     * @return builder
     */
    inline def statusCodes(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs.builder
      builder.statusCodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigVirtualApplicationArgs.Builder)
    /**
     * @param virtualDirectories One or more `virtualDirectory` blocks as defined below.
     * @return builder
     */
    inline def virtualDirectories(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigVirtualApplicationVirtualDirectoryArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigVirtualApplicationArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigVirtualApplicationVirtualDirectoryArgs.builder
      builder.virtualDirectories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder)
    /**
     * @param activeDirectory An `activeDirectory` block as defined above.
     * @return builder
     */
    inline def activeDirectory(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsActiveDirectoryArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param facebook A `facebook` block as defined below.
     * @return builder
     */
    inline def facebook(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsFacebookArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsFacebookArgs.builder
      builder.facebook(args(argsBuilder).build)

    /**
     * @param github A `github` block as defined below.
     * @return builder
     */
    inline def github(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsGithubArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsGithubArgs.builder
      builder.github(args(argsBuilder).build)

    /**
     * @param google A `google` block as defined below.
     * @return builder
     */
    inline def google(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsGoogleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsGoogleArgs.builder
      builder.google(args(argsBuilder).build)

    /**
     * @param microsoft A `microsoft` block as defined below.
     * @return builder
     */
    inline def microsoft(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsMicrosoftArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsMicrosoftArgs.builder
      builder.microsoft(args(argsBuilder).build)

    /**
     * @param twitter A `twitter` block as defined below.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsTwitterArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder)
    /**
     * @param activeDirectoryV2 An `activeDirectoryV2` block as defined below.
     * @return builder
     */
    inline def activeDirectoryV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2ActiveDirectoryV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2ActiveDirectoryV2Args.builder
      builder.activeDirectoryV2(args(argsBuilder).build)

    /**
     * @param appleV2 An `appleV2` block as defined below.
     * @return builder
     */
    inline def appleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2AppleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2AppleV2Args.builder
      builder.appleV2(args(argsBuilder).build)

    /**
     * @param azureStaticWebAppV2 An `azureStaticWebAppV2` block as defined below.
     * @return builder
     */
    inline def azureStaticWebAppV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2AzureStaticWebAppV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2AzureStaticWebAppV2Args.builder
      builder.azureStaticWebAppV2(args(argsBuilder).build)

    /**
     * @param customOidcV2s Zero or more `customOidcV2` blocks as defined below.
     * @return builder
     */
    inline def customOidcV2s(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2CustomOidcV2Args.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2CustomOidcV2Args.builder
      builder.customOidcV2s(args.map(_(argsBuilder).build)*)

    /**
     * @param facebookV2 A `facebookV2` block as defined below.
     * @return builder
     */
    inline def facebookV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2FacebookV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2FacebookV2Args.builder
      builder.facebookV2(args(argsBuilder).build)

    /**
     * @param githubV2 A `githubV2` block as defined below.
     * @return builder
     */
    inline def githubV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2GithubV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2GithubV2Args.builder
      builder.githubV2(args(argsBuilder).build)

    /**
     * @param googleV2 A `googleV2` block as defined below.
     * @return builder
     */
    inline def googleV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2GoogleV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2GoogleV2Args.builder
      builder.googleV2(args(argsBuilder).build)

    /**
     * @param login A `login` block as defined below.
     * @return builder
     */
    inline def login(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2LoginArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2LoginArgs.builder
      builder.login(args(argsBuilder).build)

    /**
     * @param microsoftV2 A `microsoftV2` block as defined below.
     * @return builder
     */
    inline def microsoftV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2MicrosoftV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2MicrosoftV2Args.builder
      builder.microsoftV2(args(argsBuilder).build)

    /**
     * @param twitterV2 A `twitterV2` block as defined below.
     * @return builder
     */
    inline def twitterV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2TwitterV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2TwitterV2Args.builder
      builder.twitterV2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupScheduleArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsApplicationLogsArgs.Builder)
    /**
     * @param azureBlobStorage An `azureBlobStorage` block as defined below.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsApplicationLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsApplicationLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsApplicationLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsArgs.Builder)
    /**
     * @param applicationLogs A `applicationLogs` block as defined above.
     * @return builder
     */
    inline def applicationLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsApplicationLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsApplicationLogsArgs.builder
      builder.applicationLogs(args(argsBuilder).build)

    /**
     * @param httpLogs An `httpLogs` block as defined above.
     * @return builder
     */
    inline def httpLogs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsArgs.builder
      builder.httpLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsArgs.Builder)
    /**
     * @param azureBlobStorage A `azureBlobStorageHttp` block as defined above.
     * @return builder
     */
    inline def azureBlobStorage(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs.builder
      builder.azureBlobStorage(args(argsBuilder).build)

    /**
     * @param fileSystem A `fileSystem` block as defined above.
     * @return builder
     */
    inline def fileSystem(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsFileSystemArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsHttpLogsFileSystemArgs.builder
      builder.fileSystem(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder)
    /**
     * @param applicationStack A `applicationStack` block as defined above.
     * @return builder
     */
    inline def applicationStack(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigApplicationStackArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigApplicationStackArgs.builder
      builder.applicationStack(args(argsBuilder).build)

    /**
     * @param autoHealSetting A `autoHealSetting` block as defined above. Required with `autoHeal`.
     * @return builder
     */
    inline def autoHealSetting(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingArgs.builder
      builder.autoHealSetting(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined above.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param handlerMappings One or more `handlerMapping` blocks as defined below.
     * @return builder
     */
    inline def handlerMappings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigHandlerMappingArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigHandlerMappingArgs.builder
      builder.handlerMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param ipRestrictions One or more `ipRestriction` blocks as defined above.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions One or more `scmIpRestriction` blocks as defined above.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param virtualApplications One or more `virtualApplication` blocks as defined below.
     * @return builder
     */
    inline def virtualApplications(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigVirtualApplicationArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigVirtualApplicationArgs.builder
      builder.virtualApplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs.Builder)
    /**
     * @param customAction A `customAction` block as defined below.
     * @return builder
     */
    inline def customAction(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomActionArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomActionArgs.builder
      builder.customAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingArgs.Builder)
    /**
     * @param action A `action` block as defined above.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder)
    /**
     * @param requests A `requests` block as defined above.
     * @return builder
     */
    inline def requests(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequestsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

    /**
     * @param slowRequest A `slowRequest` block as defined above.
     * @return builder
     */
    inline def slowRequest(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestArgs.builder
      builder.slowRequest(args(argsBuilder).build)

    /**
     * @param slowRequestWithPaths One or more `slowRequestWithPath` blocks as defined above.
     * @return builder
     */
    inline def slowRequestWithPaths(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPathArgs.builder
      builder.slowRequestWithPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param statusCodes One or more `statusCode` blocks as defined above.
     * @return builder
     */
    inline def statusCodes(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCodeArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCodeArgs.builder
      builder.statusCodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers A `headers` block as defined above.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigVirtualApplicationArgs.Builder)
    /**
     * @param virtualDirectories One or more `virtualDirectory` blocks as defined below.
     * @return builder
     */
    inline def virtualDirectories(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectoryArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigVirtualApplicationArgs.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectoryArgs.builder
      builder.virtualDirectories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * 
     * &gt; **Note:** Using this value requires `WEBSITE_RUN_FROM_PACKAGE=1` to be set on the App in `appSettings`. Refer to the [Azure docs](https://docs.microsoft.com/en-us/azure/app-service/deploy-run-package) for further details.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSlotStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppSlotState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSlotStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder)
    /**
     * @param authSettings An `authSettings` block as defined below.
     * @return builder
     */
    inline def authSettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsArgs.builder
      builder.authSettings(args(argsBuilder).build)

    /**
     * @param authSettingsV2 An `authSettingsV2` block as defined below.
     * @return builder
     */
    inline def authSettingsV2(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppAuthSettingsV2Args.builder
      builder.authSettingsV2(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppBackupArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param connectionStrings One or more `connectionString` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppConnectionStringArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppIdentityArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppLogsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` block as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppSiteCredentialArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param stickySettings A `stickySettings` block as defined below.
     * @return builder
     */
    inline def stickySettings(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppStickySettingsArgs.Builder]):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      val argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppStickySettingsArgs.builder
      builder.stickySettings(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` blocks as defined below.
     * 
     * &gt; **Note:** Using this value requires `WEBSITE_RUN_FROM_PACKAGE=1` to be set on the App in `appSettings`. Refer to the [Azure docs](https://docs.microsoft.com/en-us/azure/app-service/deploy-run-package) for further details.
     * @return builder
     */
    inline def storageAccounts(args: Endofunction[com.pulumi.azure.appservice.inputs.WindowsWebAppStorageAccountArgs.Builder]*):
        com.pulumi.azure.appservice.inputs.WindowsWebAppState.Builder =
      def argsBuilder = com.pulumi.azure.appservice.inputs.WindowsWebAppStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)
