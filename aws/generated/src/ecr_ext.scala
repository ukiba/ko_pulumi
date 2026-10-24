package jp.ukiba.ko_pulumi
package aws

object ecr_ext:
  extension (builder: com.pulumi.aws.ecr.LifecyclePolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs. Consider using the `aws.ecr.getLifecyclePolicyDocument` dataSource to generate/manage the JSON document used for the `policy` argument.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.LifecyclePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.RegistryPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.RegistryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.Builder)
    /**
     * @param rules One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.ecr.RegistryScanningConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.ReplicationConfigurationArgs.Builder)
    /**
     * @param replicationConfiguration Replication configuration for a registry. See Replication Configuration.
     * @return builder
     */
    inline def replicationConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.ReplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.RepositoryArgs.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the repository. See below for schema.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageScanningConfiguration Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
     * @return builder
     */
    inline def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    inline def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for any created repositories. See below for schema.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    inline def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.RepositoryCreationTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.RepositoryPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.RepositoryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.Builder)
    inline def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentPlainArgs.Builder)
    inline def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRule.Builder]*):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRule.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRule.Builder)
    /**
     * @param action Specifies the action to take.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleAction.Builder]):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRule.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleAction.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param selection Collects parameters describing the selection criteria for the ECR lifecycle policy:
     * @return builder
     */
    inline def selection(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleSelection.Builder]):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRule.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleSelection.builder
      builder.selection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder)
    /**
     * @param action Specifies the action to take.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleActionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param selection Collects parameters describing the selection criteria for the ECR lifecycle policy:
     * @return builder
     */
    inline def selection(args: Endofunction[com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleSelectionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.GetLifecyclePolicyDocumentRuleSelectionArgs.builder
      builder.selection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder)
    /**
     * @param rules The rules that comprise the lifecycle policy.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder)
    /**
     * @param action The action to take when the rule is triggered.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyActionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param selection The selection criteria for the rule.
     * @return builder
     */
    inline def selection(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicySelectionArgs.Builder]):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicySelectionArgs.builder
      builder.selection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.LifecyclePolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs. Consider using the `aws.ecr.getLifecyclePolicyDocument` dataSource to generate/manage the JSON document used for the `policy` argument.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.inputs.LifecyclePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.LifecyclePolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder)
    inline def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.RegistryPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.inputs.RegistryPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder)
    /**
     * @param repositoryFilters One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filterType` (required string, currently only `WILDCARD` is supported).
     * @return builder
     */
    inline def repositoryFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleRepositoryFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleRepositoryFilterArgs.builder
      builder.repositoryFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationState.Builder)
    /**
     * @param rules One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder)
    /**
     * @param rules The replication rules for a replication configuration. A maximum of 10 are allowed per `replicationConfiguration`. See Rule
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder)
    /**
     * @param destinations the details of a replication destination. A maximum of 25 are allowed per `rule`. See Destination.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleDestinationArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param repositoryFilters filters for a replication rule. See Repository Filter.
     * @return builder
     */
    inline def repositoryFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs.builder
      builder.repositoryFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.ReplicationConfigurationState.Builder)
    /**
     * @param replicationConfiguration Replication configuration for a registry. See Replication Configuration.
     * @return builder
     */
    inline def replicationConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.inputs.ReplicationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateState.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for any created repositories. See below for schema.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    inline def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryCreationTemplateImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecr.inputs.RepositoryPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.ecr.inputs.RepositoryPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecr.inputs.RepositoryState.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the repository. See below for schema.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param imageScanningConfiguration Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
     * @return builder
     */
    inline def imageScanningConfiguration(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.Builder]):
        com.pulumi.aws.ecr.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs.builder
      builder.imageScanningConfiguration(args(argsBuilder).build)

    /**
     * @param imageTagMutabilityExclusionFilters Configuration block that defines filters to specify which image tags can override the default tag mutability setting. Only applicable when `imageTagMutability` is set to `IMMUTABLE_WITH_EXCLUSION` or `MUTABLE_WITH_EXCLUSION`. See below for schema.
     * @return builder
     */
    inline def imageTagMutabilityExclusionFilters(args: Endofunction[com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.Builder]*):
        com.pulumi.aws.ecr.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.aws.ecr.inputs.RepositoryImageTagMutabilityExclusionFilterArgs.builder
      builder.imageTagMutabilityExclusionFilters(args.map(_(argsBuilder).build)*)
