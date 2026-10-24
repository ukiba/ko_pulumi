package jp.ukiba.ko_pulumi
package aws

object guardduty_ext:
  extension (builder: com.pulumi.aws.guardduty.DetectorArgs.Builder)
    /**
     * @param datasources Data sources to enable for the detector. See `datasources` below for more details. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.DetectorFeature` resources.
     * @return builder
     * @deprecated datasources is deprecated. Use aws.guardduty.DetectorFeature resources instead.
     */
    @deprecated("datasources is deprecated. Use aws.guardduty.DetectorFeature resources instead.") inline def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.DetectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.DetectorFeatureArgs.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features`EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    inline def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.DetectorFeatureArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.FilterArgs.Builder)
    /**
     * @param findingCriteria Criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * @return builder
     */
    inline def findingCriteria(args: Endofunction[com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.guardduty.FilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.Builder)
    /**
     * @param actions Information about whether the tags will be added to the S3 object after scanning. See `actions` below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder]*):
        com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedResource Information about the protected resource that is associated with the created Malware Protection plan. Presently, S3Bucket is the only supported protected resource. See `protectedResource` below.
     * @return builder
     */
    inline def protectedResource(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder]):
        com.pulumi.aws.guardduty.MalwareProtectionPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.builder
      builder.protectedResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.MemberDetectorFeatureArgs.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block. See below.
     * @return builder
     */
    inline def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.MemberDetectorFeatureArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.OrganizationConfigurationArgs.Builder)
    /**
     * @param datasources Configuration for the collected datasources. See `datasources` below. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.OrganizationConfigurationFeature` resources.
     * @return builder
     * @deprecated datasources is deprecated. Use &#34;aws.guardduty.OrganizationConfigurationFeature&#34; resources instead.
     */
    @deprecated("datasources is deprecated. Use &#34;aws.guardduty.OrganizationConfigurationFeature&#34; resources instead.") inline def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.OrganizationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features `EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    inline def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.OrganizationConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder)
    /**
     * @param kubernetes Configures [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html). See `kubernetes` below for more details.
     * @return builder
     */
    inline def kubernetes(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.builder
      builder.kubernetes(args(argsBuilder).build)

    /**
     * @param malwareProtection Configures [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html). See `malwareProtection` below for more details.
     * @return builder
     */
    inline def malwareProtection(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.builder
      builder.malwareProtection(args(argsBuilder).build)

    /**
     * @param s3Logs Configures [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html). See `s3Logs` below for more details.
     * @return builder
     */
    inline def s3Logs(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesS3LogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesS3LogsArgs.builder
      builder.s3Logs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.Builder)
    /**
     * @param auditLogs Configures Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html). See `auditLogs` below for more details.
     * @return builder
     */
    inline def auditLogs(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesAuditLogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesKubernetesAuditLogsArgs.builder
      builder.auditLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.Builder)
    /**
     * @param scanEc2InstanceWithFindings Configure whether [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html) is enabled as data source for EC2 instances with findings for the detector. See `scanEc2InstanceWithFindings` below for more details.
     * @return builder
     */
    inline def scanEc2InstanceWithFindings(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.builder
      builder.scanEc2InstanceWithFindings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder)
    /**
     * @param ebsVolumes Configure whether scanning EBS volumes is enabled as data source for the detector for instances with findings. See `ebsVolumes` below for more details.
     * @return builder
     */
    inline def ebsVolumes(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.builder
      builder.ebsVolumes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorFeatureState.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features`EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    inline def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.DetectorFeatureState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.DetectorState.Builder)
    /**
     * @param datasources Data sources to enable for the detector. See `datasources` below for more details. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.DetectorFeature` resources.
     * @return builder
     * @deprecated datasources is deprecated. Use aws.guardduty.DetectorFeature resources instead.
     */
    @deprecated("datasources is deprecated. Use aws.guardduty.DetectorFeature resources instead.") inline def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.DetectorState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.DetectorDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder)
    inline def criterions(args: Endofunction[com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaCriterionArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaCriterionArgs.builder
      builder.criterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.FilterState.Builder)
    /**
     * @param findingCriteria Criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * @return builder
     */
    inline def findingCriteria(args: Endofunction[com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.FilterState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder)
    /**
     * @param taggings Whether the scanned S3 object will have tags about the scan result. See `tagging` below.
     * @return builder
     */
    inline def taggings(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionTaggingArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionTaggingArgs.builder
      builder.taggings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder)
    /**
     * @param s3Bucket Information about the protected S3 bucket resource. See `s3Bucket` below.
     * @return builder
     */
    inline def s3Bucket(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceS3BucketArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceS3BucketArgs.builder
      builder.s3Bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanState.Builder)
    /**
     * @param actions Information about whether the tags will be added to the S3 object after scanning. See `actions` below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedResource Information about the protected resource that is associated with the created Malware Protection plan. Presently, S3Bucket is the only supported protected resource. See `protectedResource` below.
     * @return builder
     */
    inline def protectedResource(args: Endofunction[com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.MalwareProtectionPlanProtectedResourceArgs.builder
      builder.protectedResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureState.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block. See below.
     * @return builder
     */
    inline def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.MemberDetectorFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder)
    /**
     * @param kubernetes Enable Kubernetes Audit Logs Monitoring automatically for new member accounts.
     * @return builder
     */
    inline def kubernetes(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.builder
      builder.kubernetes(args(argsBuilder).build)

    /**
     * @param malwareProtection Enable Malware Protection automatically for new member accounts.
     * @return builder
     */
    inline def malwareProtection(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.builder
      builder.malwareProtection(args(argsBuilder).build)

    /**
     * @param s3Logs Enable S3 Protection automatically for new member accounts.
     * @return builder
     */
    inline def s3Logs(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesS3LogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesS3LogsArgs.builder
      builder.s3Logs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.Builder)
    /**
     * @param auditLogs Enable Kubernetes Audit Logs Monitoring automatically for new member accounts. [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html). See `auditLogs` below for more details.
     * @return builder
     */
    inline def auditLogs(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesAuditLogsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesAuditLogsArgs.builder
      builder.auditLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.Builder)
    /**
     * @param scanEc2InstanceWithFindings Configure whether [Malware Protection](https://docs.aws.amazon.com/guardduty/latest/ug/malware-protection.html) for EC2 instances with findings should be auto-enabled for new members joining the organization. See `scanEc2InstanceWithFindings` below for more details.
     * @return builder
     */
    inline def scanEc2InstanceWithFindings(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.builder
      builder.scanEc2InstanceWithFindings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder)
    /**
     * @param ebsVolumes Configure whether scanning EBS volumes should be auto-enabled for new members joining the organization. See `ebsVolumes` below for more details.
     * @return builder
     */
    inline def ebsVolumes(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.builder
      builder.ebsVolumes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureState.Builder)
    /**
     * @param additionalConfigurations Additional feature configuration block for features `EKS_RUNTIME_MONITORING` or `RUNTIME_MONITORING`. See below.
     * @return builder
     */
    inline def additionalConfigurations(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.Builder]*):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs.builder
      builder.additionalConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.guardduty.inputs.OrganizationConfigurationState.Builder)
    /**
     * @param datasources Configuration for the collected datasources. See `datasources` below. [Deprecated](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty-feature-object-api-changes-march2023.html) in favor of `aws.guardduty.OrganizationConfigurationFeature` resources.
     * @return builder
     * @deprecated datasources is deprecated. Use &#34;aws.guardduty.OrganizationConfigurationFeature&#34; resources instead.
     */
    @deprecated("datasources is deprecated. Use &#34;aws.guardduty.OrganizationConfigurationFeature&#34; resources instead.") inline def datasources(args: Endofunction[com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.Builder]):
        com.pulumi.aws.guardduty.inputs.OrganizationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs.builder
      builder.datasources(args(argsBuilder).build)
