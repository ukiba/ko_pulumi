package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object macie2:
  /** Provides a resource to manage an [Amazon Macie Organization Admin Account](https://docs.aws.amazon.com/macie/latest/APIReference/admin.html). */
  def OrganizationAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.macie2.OrganizationAdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.macie2.OrganizationAdminAccountArgs.builder
    
    com.pulumi.aws.macie2.OrganizationAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.macie2.ClassificationExportConfigurationArgs.Builder)
    /**
     * @param s3Destination Configuration block for a S3 Destination. Defined below
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationExportConfigurationS3DestinationArgs.Builder]):
        com.pulumi.aws.macie2.ClassificationExportConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationExportConfigurationS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  /** Provides a resource to manage Amazon Macie configuration settings for an organization in AWS Organizations. */
  def OrganizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.macie2.OrganizationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.macie2.OrganizationConfigurationArgs.builder
    
    com.pulumi.aws.macie2.OrganizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [Amazon Macie Classification Export Configuration](https://docs.aws.amazon.com/macie/latest/APIReference/classification-export-configuration.html). */
  def ClassificationExportConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.macie2.ClassificationExportConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.macie2.ClassificationExportConfigurationArgs.builder
    
    com.pulumi.aws.macie2.ClassificationExportConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [AWS Macie Classification Job](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html). */
  def ClassificationJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.macie2.ClassificationJobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.macie2.ClassificationJobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.macie2.ClassificationJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [AWS Macie Account](https://docs.aws.amazon.com/macie/latest/APIReference/macie.html). */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.macie2.AccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.macie2.AccountArgs.builder
    
    com.pulumi.aws.macie2.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.macie2.ClassificationJobArgs.Builder)
    /**
     * @param s3JobDefinition The S3 buckets that contain the objects to analyze, and the scope of that analysis. (documented below)
     * @return builder
     */
    def s3JobDefinition(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.Builder]):
        com.pulumi.aws.macie2.ClassificationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.builder
      builder.s3JobDefinition(args(argsBuilder).build)

    /**
     * @param scheduleFrequency The recurrence pattern for running the job. To run the job only once, don&#39;t specify a value for this property and set the value for the `jobType` property to `ONE_TIME`. (documented below)
     * @return builder
     */
    def scheduleFrequency(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobScheduleFrequencyArgs.Builder]):
        com.pulumi.aws.macie2.ClassificationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobScheduleFrequencyArgs.builder
      builder.scheduleFrequency(args(argsBuilder).build)

  /** Provides a resource to manage an [Amazon Macie Member](https://docs.aws.amazon.com/macie/latest/APIReference/members-id.html). */
  def Member(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.macie2.MemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.macie2.MemberArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.macie2.Member(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [Amazon Macie Invitation Accepter](https://docs.aws.amazon.com/macie/latest/APIReference/invitations-accept.html). */
  def InvitationAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.macie2.InvitationAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.macie2.InvitationAccepterArgs.builder
    
    com.pulumi.aws.macie2.InvitationAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesArgs.Builder)
    /**
     * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobState.Builder)
    /**
     * @param s3JobDefinition The S3 buckets that contain the objects to analyze, and the scope of that analysis. (documented below)
     * @return builder
     */
    def s3JobDefinition(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobState.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.builder
      builder.s3JobDefinition(args(argsBuilder).build)

    /**
     * @param scheduleFrequency The recurrence pattern for running the job. To run the job only once, don&#39;t specify a value for this property and set the value for the `jobType` property to `ONE_TIME`. (documented below)
     * @return builder
     */
    def scheduleFrequency(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobScheduleFrequencyArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobState.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobScheduleFrequencyArgs.builder
      builder.scheduleFrequency(args(argsBuilder).build)

    /**
     * @param userPausedDetails If the current status of the job is `USER_PAUSED`, specifies when the job was paused and when the job or job run will expire and be canceled if it isn&#39;t resumed. This value is present only if the value for `job-status` is `USER_PAUSED`.
     * @return builder
     */
    def userPausedDetails(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobUserPausedDetailArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobState.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobUserPausedDetailArgs.builder
      builder.userPausedDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesArgs.Builder)
    /**
     * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndArgs.Builder)
    /**
     * @param simpleScopeTerm A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job. (documented below)
     * @return builder
     */
    def simpleScopeTerm(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs.builder
      builder.simpleScopeTerm(args(argsBuilder).build)

    /**
     * @param tagScopeTerm A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job. (documented below)
     * @return builder
     */
    def tagScopeTerm(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermArgs.builder
      builder.tagScopeTerm(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermArgs.Builder)
    /**
     * @param tagValues The tag keys or tag key and value pairs to use in the condition.
     * @return builder
     */
    def tagValues(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs.builder
      builder.tagValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs.Builder)
    /**
     * @param tagValues The  tag key and value pairs to use in the condition. One or more blocks are allowed. (documented below)
     * @return builder
     */
    def tagValues(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValueArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValueArgs.builder
      builder.tagValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.Builder)
    /**
     * @param bucketCriteria The property- and tag-based conditions that determine which S3 buckets to include or exclude from the analysis. Conflicts with `bucketDefinitions`. (documented below)
     * @return builder
     */
    def bucketCriteria(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaArgs.builder
      builder.bucketCriteria(args(argsBuilder).build)

    /**
     * @param bucketDefinitions An array of objects, one for each AWS account that owns buckets to analyze. Each object specifies the account ID for an account and one or more buckets to analyze for the account. Conflicts with `bucketCriteria`. (documented below)
     * @return builder
     */
    def bucketDefinitions(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketDefinitionArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketDefinitionArgs.builder
      builder.bucketDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param scoping The property- and tag-based conditions that determine which objects to include or exclude from the analysis. (documented below)
     * @return builder
     */
    def scoping(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingArgs.builder
      builder.scoping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndArgs.Builder)
    /**
     * @param simpleScopeTerm A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job. (documented below)
     * @return builder
     */
    def simpleScopeTerm(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs.builder
      builder.simpleScopeTerm(args(argsBuilder).build)

    /**
     * @param tagScopeTerm A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job. (documented below)
     * @return builder
     */
    def tagScopeTerm(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs.builder
      builder.tagScopeTerm(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingArgs.Builder)
    /**
     * @param excludes The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesArgs.builder
      builder.excludes(args(argsBuilder).build)

    /**
     * @param includes The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesArgs.builder
      builder.includes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs.Builder)
    /**
     * @param simpleCriterion A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
     * @return builder
     */
    def simpleCriterion(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterionArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterionArgs.builder
      builder.simpleCriterion(args(argsBuilder).build)

    /**
     * @param tagCriterion A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
     * @return builder
     */
    def tagCriterion(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterionArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterionArgs.builder
      builder.tagCriterion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs.Builder)
    /**
     * @param simpleCriterion A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
     * @return builder
     */
    def simpleCriterion(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionArgs.builder
      builder.simpleCriterion(args(argsBuilder).build)

    /**
     * @param tagCriterion A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
     * @return builder
     */
    def tagCriterion(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs.builder
      builder.tagCriterion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaArgs.Builder)
    /**
     * @param excludes The property- or tag-based conditions that determine which S3 buckets to exclude from the analysis. (documented below)
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs.builder
      builder.excludes(args(argsBuilder).build)

    /**
     * @param includes The property- or tag-based conditions that determine which S3 buckets to include in the analysis. (documented below)
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesArgs.builder
      builder.includes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterionArgs.Builder)
    /**
     * @param tagValues The  tag key and value pairs to use in the condition. One or more blocks are allowed. (documented below)
     * @return builder
     */
    def tagValues(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterionTagValueArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterionArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterionTagValueArgs.builder
      builder.tagValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs.Builder)
    /**
     * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs.Builder)
    /**
     * @param tagValues The tag keys or tag key and value pairs to use in the condition.
     * @return builder
     */
    def tagValues(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs.builder
      builder.tagValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationExportConfigurationState.Builder)
    /**
     * @param s3Destination Configuration block for a S3 Destination. Defined below
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationExportConfigurationS3DestinationArgs.Builder]):
        com.pulumi.aws.macie2.inputs.ClassificationExportConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationExportConfigurationS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesArgs.Builder)
    /**
     * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs.Builder]*):
        com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)
