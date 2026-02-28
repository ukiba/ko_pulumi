package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object dataexchange:
  extension (builder: com.pulumi.aws.dataexchange.RevisionAssetsArgs.Builder)
    /**
     * @param assets A block to define the asset associated with the revision. See Asset for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.Builder]*):
        com.pulumi.aws.dataexchange.RevisionAssetsArgs.Builder =
      def argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.builder
      builder.assets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsTimeoutsArgs.Builder]):
        com.pulumi.aws.dataexchange.RevisionAssetsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a resource to manage AWS Data Exchange DataSets. */
  def DataSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dataexchange.DataSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dataexchange.DataSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dataexchange.DataSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage AWS Data Exchange Revisions. */
  def Revision(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dataexchange.RevisionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dataexchange.RevisionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dataexchange.Revision(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dataexchange.EventActionArgs.Builder)
    /**
     * @param action Describes the action to take.
     *  Described in `action` Configuration Block below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionActionArgs.Builder]):
        com.pulumi.aws.dataexchange.EventActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param event Describes the event that triggers the `action`.
     *  Described in `event` Configuration Block below.
     * @return builder
     */
    def event(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionEventArgs.Builder]):
        com.pulumi.aws.dataexchange.EventActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionEventArgs.builder
      builder.event(args(argsBuilder).build)

  /**
   * Resource for managing AWS Data Exchange Revision Assets.
   *  
   *  &gt; Note: This resource creates a new revision and adds associated assets. Destroying this resource will delete the revision and all associated assets.
   */
  def RevisionAssets(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dataexchange.RevisionAssetsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dataexchange.RevisionAssetsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dataexchange.RevisionAssets(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Data Exchange Event Action. */
  def EventAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dataexchange.EventActionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.dataexchange.EventActionArgs.builder
    
    com.pulumi.aws.dataexchange.EventAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.EventActionActionArgs.Builder)
    /**
     * @param exportRevisionToS3 Configuration for an Export Revision to S3 action.
     *  Described in `exportRevisionToS3` Configuration Block
     * @return builder
     */
    def exportRevisionToS3(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3Args.Builder]):
        com.pulumi.aws.dataexchange.inputs.EventActionActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3Args.builder
      builder.exportRevisionToS3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketAssetSourceArgs.Builder)
    def kmsKeysToGrants(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketAssetSourceKmsKeysToGrantArgs.Builder]*):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketAssetSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketAssetSourceKmsKeysToGrantArgs.builder
      builder.kmsKeysToGrants(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.dataexchange.inputs.EventActionState.Builder)
    /**
     * @param action Describes the action to take.
     *  Described in `action` Configuration Block below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionActionArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.EventActionState.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param event Describes the event that triggers the `action`.
     *  Described in `event` Configuration Block below.
     * @return builder
     */
    def event(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionEventArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.EventActionState.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionEventArgs.builder
      builder.event(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.Builder)
    /**
     * @param createS3DataAccessFromS3Bucket A block to create S3 data access from an S3 bucket. See Create S3 Data Access from S3 Bucket for more details.
     * @return builder
     */
    def createS3DataAccessFromS3Bucket(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketArgs.builder
      builder.createS3DataAccessFromS3Bucket(args(argsBuilder).build)

    /**
     * @param importAssetsFromS3 A block to import assets from S3. See Import Assets from S3 for more details.
     * @return builder
     */
    def importAssetsFromS3(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromS3Args.Builder]):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromS3Args.builder
      builder.importAssetsFromS3(args(argsBuilder).build)

    /**
     * @param importAssetsFromSignedUrl A block to import assets from a signed URL. See Import Assets from Signed URL for more details.
     * @return builder
     */
    def importAssetsFromSignedUrl(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromSignedUrlArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromSignedUrlArgs.builder
      builder.importAssetsFromSignedUrl(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketArgs.Builder)
    /**
     * @param assetSource A block specifying the source bucket for the asset. This block supports the following:
     * @return builder
     */
    def assetSource(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketAssetSourceArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetCreateS3DataAccessFromS3BucketAssetSourceArgs.builder
      builder.assetSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromS3Args.Builder)
    /**
     * @param assetSource A block specifying the source bucket and key for the asset. This block supports the following:
     * @return builder
     */
    def assetSource(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromS3AssetSourceArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromS3Args.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetImportAssetsFromS3AssetSourceArgs.builder
      builder.assetSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3Args.Builder)
    /**
     * @param encryption Configures server-side encryption of the exported revision.
     *  Described in `encryption` Configuration Block below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3EncryptionArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3Args.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3EncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param revisionDestination Configures the S3 destination of the exported revision.
     *  Described in `revisionDestination` Configuration Block below.
     * @return builder
     */
    def revisionDestination(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3RevisionDestinationArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3Args.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionActionExportRevisionToS3RevisionDestinationArgs.builder
      builder.revisionDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.RevisionAssetsState.Builder)
    /**
     * @param assets A block to define the asset associated with the revision. See Asset for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.Builder]*):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsState.Builder =
      def argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsAssetArgs.builder
      builder.assets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.dataexchange.inputs.RevisionAssetsTimeoutsArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.RevisionAssetsState.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.RevisionAssetsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dataexchange.inputs.EventActionEventArgs.Builder)
    /**
     * @param revisionPublished Configuration for a Revision Published event.
     *  Described in `revisionPublished` Configuration Block below.
     * @return builder
     */
    def revisionPublished(args: Endofunction[com.pulumi.aws.dataexchange.inputs.EventActionEventRevisionPublishedArgs.Builder]):
        com.pulumi.aws.dataexchange.inputs.EventActionEventArgs.Builder =
      val argsBuilder = com.pulumi.aws.dataexchange.inputs.EventActionEventRevisionPublishedArgs.builder
      builder.revisionPublished(args(argsBuilder).build)
