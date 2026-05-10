package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object looker:
  extension (builder: com.pulumi.gcp.looker.InstanceArgs.Builder)
    /**
     * @param adminSettings Looker instance Admin settings.
     *  Structure is documented below.
     * @return builder
     */
    def adminSettings(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceAdminSettingsArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceAdminSettingsArgs.builder
      builder.adminSettings(args(argsBuilder).build)

    /**
     * @param controlledEgressConfig Controlled egress configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlledEgressConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceControlledEgressConfigArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceControlledEgressConfigArgs.builder
      builder.controlledEgressConfig(args(argsBuilder).build)

    /**
     * @param customDomain Custom domain settings for a Looker instance.
     *  Structure is documented below.
     * @return builder
     */
    def customDomain(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceCustomDomainArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceCustomDomainArgs.builder
      builder.customDomain(args(argsBuilder).build)

    /**
     * @param denyMaintenancePeriod Maintenance denial period for this instance.
     *  You must allow at least 14 days of maintenance availability
     *  between any two deny maintenance periods.
     *  Structure is documented below.
     * @return builder
     */
    def denyMaintenancePeriod(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.builder
      builder.denyMaintenancePeriod(args(argsBuilder).build)

    /**
     * @param encryptionConfig Looker instance encryption settings.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param maintenanceWindow Maintenance window for an instance.
     *  Maintenance of your instance takes place once a month, and will require
     *  your instance to be restarted during updates, which will temporarily
     *  disrupt service.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param oauthConfig Looker Instance OAuth login settings.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceOauthConfigArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param periodicExportConfig Configuration for periodic export.
     *  Structure is documented below.
     * @return builder
     */
    def periodicExportConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigArgs.builder
      builder.periodicExportConfig(args(argsBuilder).build)

    /**
     * @param pscConfig Information for Private Service Connect (PSC) setup for a Looker instance.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstancePscConfigArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstancePscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

    /**
     * @param userMetadata Metadata about users for a Looker instance.
     *  These settings are only available when platform edition LOOKER_CORE_STANDARD is set.
     *  There are ten Standard and two Developer users included in the cost of the product.
     *  You can allocate additional Standard, Viewer, and Developer users for this instance.
     *  It is an optional step and can be modified later.
     *  With the Standard edition of Looker (Google Cloud core), you can provision up to 50
     *  total users, distributed across Viewer, Standard, and Developer.
     *  Structure is documented below.
     * @return builder
     */
    def userMetadata(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceUserMetadataArgs.Builder]):
        com.pulumi.gcp.looker.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceUserMetadataArgs.builder
      builder.userMetadata(args(argsBuilder).build)

  /**
   * A Google Cloud Looker instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/looker/docs/reference/rest/v1/projects.locations.instances)
   *  * How-to Guides
   *      * [Configure a Looker (Google Cloud core) instance](https://cloud.google.com/looker/docs/looker-core-instance-setup)
   *      * [Create a Looker (Google Cloud core) instance](https://cloud.google.com/looker/docs/looker-core-instance-create)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.looker.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.looker.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.looker.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigArgs.Builder)
    /**
     * @param startTime Time in UTC to start the periodic export job.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigStartTimeArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.looker.inputs.InstancePscConfigArgs.Builder)
    /**
     * @param serviceAttachments List of egress service attachment configurations.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAttachments(args: Endofunction[com.pulumi.gcp.looker.inputs.InstancePscConfigServiceAttachmentArgs.Builder]*):
        com.pulumi.gcp.looker.inputs.InstancePscConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.looker.inputs.InstancePscConfigServiceAttachmentArgs.builder
      builder.serviceAttachments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowArgs.Builder)
    /**
     * @param startTime Required. Start time of the window in UTC time.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.Builder)
    /**
     * @param endDate Required. Start date of the deny maintenance period
     *  Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodEndDateArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate Required. Start date of the deny maintenance period
     *  Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodStartDateArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

    /**
     * @param time Required. Start time of the window in UTC time.
     *  Structure is documented below.
     * @return builder
     */
    def time(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodTimeArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodTimeArgs.builder
      builder.time(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.looker.inputs.InstanceState.Builder)
    /**
     * @param adminSettings Looker instance Admin settings.
     *  Structure is documented below.
     * @return builder
     */
    def adminSettings(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceAdminSettingsArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceAdminSettingsArgs.builder
      builder.adminSettings(args(argsBuilder).build)

    /**
     * @param controlledEgressConfig Controlled egress configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlledEgressConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceControlledEgressConfigArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceControlledEgressConfigArgs.builder
      builder.controlledEgressConfig(args(argsBuilder).build)

    /**
     * @param customDomain Custom domain settings for a Looker instance.
     *  Structure is documented below.
     * @return builder
     */
    def customDomain(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceCustomDomainArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceCustomDomainArgs.builder
      builder.customDomain(args(argsBuilder).build)

    /**
     * @param denyMaintenancePeriod Maintenance denial period for this instance.
     *  You must allow at least 14 days of maintenance availability
     *  between any two deny maintenance periods.
     *  Structure is documented below.
     * @return builder
     */
    def denyMaintenancePeriod(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceDenyMaintenancePeriodArgs.builder
      builder.denyMaintenancePeriod(args(argsBuilder).build)

    /**
     * @param encryptionConfig Looker instance encryption settings.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param maintenanceWindow Maintenance window for an instance.
     *  Maintenance of your instance takes place once a month, and will require
     *  your instance to be restarted during updates, which will temporarily
     *  disrupt service.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param oauthConfig Looker Instance OAuth login settings.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceOauthConfigArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param periodicExportConfig Configuration for periodic export.
     *  Structure is documented below.
     * @return builder
     */
    def periodicExportConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstancePeriodicExportConfigArgs.builder
      builder.periodicExportConfig(args(argsBuilder).build)

    /**
     * @param pscConfig Information for Private Service Connect (PSC) setup for a Looker instance.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.looker.inputs.InstancePscConfigArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstancePscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

    /**
     * @param userMetadata Metadata about users for a Looker instance.
     *  These settings are only available when platform edition LOOKER_CORE_STANDARD is set.
     *  There are ten Standard and two Developer users included in the cost of the product.
     *  You can allocate additional Standard, Viewer, and Developer users for this instance.
     *  It is an optional step and can be modified later.
     *  With the Standard edition of Looker (Google Cloud core), you can provision up to 50
     *  total users, distributed across Viewer, Standard, and Developer.
     *  Structure is documented below.
     * @return builder
     */
    def userMetadata(args: Endofunction[com.pulumi.gcp.looker.inputs.InstanceUserMetadataArgs.Builder]):
        com.pulumi.gcp.looker.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.looker.inputs.InstanceUserMetadataArgs.builder
      builder.userMetadata(args(argsBuilder).build)
