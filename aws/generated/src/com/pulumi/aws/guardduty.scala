package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object guardduty:
  /**
   * Provides a resource to manage an Amazon GuardDuty detector.
   *  
   *  &gt; **NOTE:** Deleting this resource is equivalent to &#34;disabling&#34; GuardDuty for an AWS region, which removes all existing findings. You can set the `enable` attribute to `false` to instead &#34;suspend&#34; monitoring and feedback reporting while keeping existing data. See the [Suspending or Disabling Amazon GuardDuty documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_suspend-disable.html) for more information.
   */
  def Detector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.DetectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.DetectorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.guardduty.Detector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.guardduty.OrganizationConfigurationArgs.Builder)
    /**
     * @param datasources Configuration for the collected datasources. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.OrganizationConfigurationFeature` resources.
     *  
     *  &gt; **NOTE:** One of `autoEnable` or `autoEnableOrganizationMembers` must be specified.
     * @return builder
     * @deprecated datasources is deprecated. Use &#34;aws.guardduty.OrganizationConfigurationFeature&#34; resources instead.
     */
    @deprecated def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.OrganizationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)

  /**
   * Provides a resource to manage a single Amazon GuardDuty [organization configuration feature](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-features-activation-model.html#guardduty-features).
   *  
   *  &gt; **NOTE:** Deleting this resource does not disable the organization configuration feature, the resource is simply removed from state instead.
   */
  def OrganizationConfigurationFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.guardduty.OrganizationConfigurationFeature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a GuardDuty Organization Admin Account. The AWS account utilizing this resource must be an Organizations primary account. More information about Organizations support in GuardDuty can be found in the [GuardDuty User Guide](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_organizations.html). */
  def OrganizationAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.OrganizationAdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.guardduty.OrganizationAdminAccountArgs.builder
    
    com.pulumi.aws.guardduty.OrganizationAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.guardduty.MemberDetectorFeatureArgs.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block. See below.
     * @return builder
     */
    def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.MemberDetectorFeatureArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Manages the GuardDuty Organization Configuration in the current AWS Region. The AWS account utilizing this resource must have been assigned as a delegated Organization administrator account, e.g., via the `aws.guardduty.OrganizationAdminAccount` resource. More information about Organizations support in GuardDuty can be found in the [GuardDuty User Guide](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_organizations.html).
   *  
   *  &gt; **NOTE:** This is an advanced resource. The provider will automatically assume management of the GuardDuty Organization Configuration without import and perform no actions on removal from the resource configuration.
   */
  def OrganizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.OrganizationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.guardduty.OrganizationConfigurationArgs.builder
    
    com.pulumi.aws.guardduty.OrganizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a single Amazon GuardDuty [detector feature](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-features-activation-model.html#guardduty-features).
   *  
   *  &gt; **NOTE:** Deleting this resource does not disable the detector feature, the resource in simply removed from state instead.
   */
  def DetectorFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.DetectorFeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.DetectorFeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.guardduty.DetectorFeature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.guardduty.FilterArgs.Builder)
    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * @return builder
     */
    def findingCriteria(args: Endofunction[com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.guardduty.FilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)

  /** Provides a resource to accept a pending GuardDuty invite on creation, ensure the detector has the correct primary account on read, and disassociate with the primary account upon removal. */
  def InviteAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.InviteAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.guardduty.InviteAccepterArgs.builder
    
    com.pulumi.aws.guardduty.InviteAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a GuardDuty ThreatIntelSet.
   *  
   *  &gt; **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage ThreatIntelSets. ThreatIntelSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-threat-intel-set.html)
   */
  def ThreatIntelSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.ThreatIntelSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.ThreatIntelSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.guardduty.ThreatIntelSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type GuarddutyFunctions = com.pulumi.aws.guardduty.GuarddutyFunctions
  object GuarddutyFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.guardduty.GuarddutyFunctions.*
  extension (self: GuarddutyFunctions.type)
    /** Retrieve information about a GuardDuty detector. */
    def getDetector(args: Endofunction[com.pulumi.aws.guardduty.inputs.GetDetectorArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.guardduty.outputs.GetDetectorResult] =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.GetDetectorArgs.builder
      com.pulumi.aws.guardduty.GuarddutyFunctions.getDetector(args(argsBuilder).build)

    /** Retrieve information about a GuardDuty detector. */
    def getDetectorPlain(args: Endofunction[com.pulumi.aws.guardduty.inputs.GetDetectorPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.guardduty.outputs.GetDetectorResult] =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.GetDetectorPlainArgs.builder
      com.pulumi.aws.guardduty.GuarddutyFunctions.getDetectorPlain(args(argsBuilder).build)

    /** Data source for managing an AWS GuardDuty Finding Ids. */
    def getFindingIds(args: Endofunction[com.pulumi.aws.guardduty.inputs.GetFindingIdsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.guardduty.outputs.GetFindingIdsResult] =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.GetFindingIdsArgs.builder
      com.pulumi.aws.guardduty.GuarddutyFunctions.getFindingIds(args(argsBuilder).build)

    /** Data source for managing an AWS GuardDuty Finding Ids. */
    def getFindingIdsPlain(args: Endofunction[com.pulumi.aws.guardduty.inputs.GetFindingIdsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.guardduty.outputs.GetFindingIdsResult] =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.GetFindingIdsPlainArgs.builder
      com.pulumi.aws.guardduty.GuarddutyFunctions.getFindingIdsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.DetectorFeatureArgs.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features`EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.DetectorFeatureArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.Builder)
    /**
     * @param actions Information about whether the tags will be added to the S3 object after scanning. See `actions` below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder]*):
        com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedResource Information about the protected resource that is associated with the created Malware Protection plan. Presently, S3Bucket is the only supported protected resource. See `protectedResource` below.
     * @return builder
     */
    def protectedResource(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder]):
        com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.builder
      builder.protectedResource(args(argsBuilder).build)

  /** Provides a resource to manage a GuardDuty malware protection plan. */
  def MalwareProtectionPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.guardduty.MalwareProtectionPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a single Amazon GuardDuty [detector feature](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-features-activation-model.html#guardduty-features) for a member account.
   *  
   *  &gt; **NOTE:** Deleting this resource does not disable the detector feature in the member account, the resource in simply removed from state instead.
   */
  def MemberDetectorFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.MemberDetectorFeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.MemberDetectorFeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.guardduty.MemberDetectorFeature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.guardduty.DetectorArgs.Builder)
    /**
     * @param datasources Describes which data sources will be enabled for the detector. See Data Sources below for more details. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.DetectorFeature` resources.
     * @return builder
     * @deprecated datasources is deprecated. Use aws.guardduty.DetectorFeature resources instead.
     */
    @deprecated def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.DetectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)

  /** Provides a resource to manage a GuardDuty member. To accept invitations in member accounts, see the `aws.guardduty.InviteAccepter` resource. */
  def Member(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.MemberArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.guardduty.MemberArgs.builder
    
    com.pulumi.aws.guardduty.Member(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage a GuardDuty PublishingDestination. Requires an existing GuardDuty Detector. */
  def PublishingDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.PublishingDestinationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.guardduty.PublishingDestinationArgs.builder
    
    com.pulumi.aws.guardduty.PublishingDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a GuardDuty IPSet.
   *  
   *  &gt; **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage IPSets. IPSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-ip-set.html)
   */
  def IPSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.IPSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.IPSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.guardduty.IPSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage a GuardDuty filter. */
  def Filter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.guardduty.FilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.guardduty.FilterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.guardduty.Filter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder)
    /**
     * @param ebsVolumes Configure whether scanning EBS volumes is enabled as data source for the detector for instances with findings.
     *  See EBS volumes below for more details.
     * @return builder
     */
    def ebsVolumes(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.builder
      builder.ebsVolumes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorFeatureState.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features`EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.DetectorFeatureState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationState.Builder)
    /**
     * @param datasources Configuration for the collected datasources. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.OrganizationConfigurationFeature` resources.
     *  
     *  &gt; **NOTE:** One of `autoEnable` or `autoEnableOrganizationMembers` must be specified.
     * @return builder
     * @deprecated datasources is deprecated. Use &#34;aws.guardduty.OrganizationConfigurationFeature&#34; resources instead.
     */
    @deprecated def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanState.Builder)
    /**
     * @param actions Information about whether the tags will be added to the S3 object after scanning. See `actions` below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedResource Information about the protected resource that is associated with the created Malware Protection plan. Presently, S3Bucket is the only supported protected resource. See `protectedResource` below.
     * @return builder
     */
    def protectedResource(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.builder
      builder.protectedResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorState.Builder)
    /**
     * @param datasources Describes which data sources will be enabled for the detector. See Data Sources below for more details. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.DetectorFeature` resources.
     * @return builder
     * @deprecated datasources is deprecated. Use aws.guardduty.DetectorFeature resources instead.
     */
    @deprecated def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder)
    /**
     * @param kubernetes Enable Kubernetes Audit Logs Monitoring automatically for new member accounts.
     * @return builder
     */
    def kubernetes(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.builder
      builder.kubernetes(args(argsBuilder).build)

    /**
     * @param malwareProtection Enable Malware Protection automatically for new member accounts.
     * @return builder
     */
    def malwareProtection(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.builder
      builder.malwareProtection(args(argsBuilder).build)

    /**
     * @param s3Logs Enable S3 Protection automatically for new member accounts.
     * @return builder
     */
    def s3Logs(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesS3LogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesS3LogsArgs.builder
      builder.s3Logs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder)
    /**
     * @param taggings Indicates whether the scanned S3 object will have tags about the scan result. See `tagging` below.
     * @return builder
     */
    def taggings(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionTaggingArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionTaggingArgs.builder
      builder.taggings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.Builder)
    /**
     * @param scanEc2InstanceWithFindings Configure whether [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html) is enabled as data source for EC2 instances with findings for the detector.
     *  See Scan EC2 instance with findings below for more details.
     * @return builder
     */
    def scanEc2InstanceWithFindings(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.builder
      builder.scanEc2InstanceWithFindings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureState.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features `EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder)
    /**
     * @param s3Bucket Information about the protected S3 bucket resource. See `s3Bucket` below.
     * @return builder
     */
    def s3Bucket(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceS3BucketArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceS3BucketArgs.builder
      builder.s3Bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder)
    def criterions(args: Endofunction[com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaCriterionArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaCriterionArgs.builder
      builder.criterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.Builder)
    /**
     * @param scanEc2InstanceWithFindings Configure whether [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html) for EC2 instances with findings should be auto-enabled for new members joining the organization.
     *  See Scan EC2 instance with findings below for more details.
     * @return builder
     */
    def scanEc2InstanceWithFindings(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.builder
      builder.scanEc2InstanceWithFindings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder)
    /**
     * @param ebsVolumes Configure whether scanning EBS volumes should be auto-enabled for new members joining the organization
     *  See EBS volumes below for more details.
     * @return builder
     */
    def ebsVolumes(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.builder
      builder.ebsVolumes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.Builder)
    /**
     * @param auditLogs Enable Kubernetes Audit Logs Monitoring automatically for new member accounts. [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     *  See Kubernetes Audit Logs below for more details.
     * @return builder
     */
    def auditLogs(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesAuditLogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesAuditLogsArgs.builder
      builder.auditLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureState.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block. See below.
     * @return builder
     */
    def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.Builder)
    /**
     * @param auditLogs Configures Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     *  See Kubernetes Audit Logs below for more details.
     * @return builder
     */
    def auditLogs(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesAuditLogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesAuditLogsArgs.builder
      builder.auditLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder)
    /**
     * @param kubernetes Configures [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     *  See Kubernetes and Kubernetes Audit Logs below for more details.
     * @return builder
     */
    def kubernetes(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.builder
      builder.kubernetes(args(argsBuilder).build)

    /**
     * @param malwareProtection Configures [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html).
     *  See Malware Protection, Scan EC2 instance with findings and EBS volumes below for more details.
     * @return builder
     */
    def malwareProtection(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.builder
      builder.malwareProtection(args(argsBuilder).build)

    /**
     * @param s3Logs Configures [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
     *  See S3 Logs below for more details.
     * @return builder
     */
    def s3Logs(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesS3LogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesS3LogsArgs.builder
      builder.s3Logs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.FilterState.Builder)
    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * @return builder
     */
    def findingCriteria(args: Endofunction[com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.FilterState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features `EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)
