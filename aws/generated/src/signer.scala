package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object signer:
  /** Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile. */
  def SigningProfilePermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningProfilePermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.signer.SigningProfilePermissionArgs.builder
    
    com.pulumi.aws.signer.SigningProfilePermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a Signer Signing Job. */
  def SigningJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningJobArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.signer.SigningJobArgs.builder
    
    com.pulumi.aws.signer.SigningJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SignerFunctions = com.pulumi.aws.signer.SignerFunctions
  object SignerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.signer.SignerFunctions.*
  extension (self: SignerFunctions.type)
    /** Provides information about a Signer Signing Job. */
    def getSigningJob(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningJobArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.signer.outputs.GetSigningJobResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningJobArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningJob(args(argsBuilder).build)

    /** Provides information about a Signer Signing Job. */
    def getSigningJobPlain(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningJobPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.signer.outputs.GetSigningJobResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningJobPlainArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningJobPlain(args(argsBuilder).build)

    /** Provides information about a Signer Signing Profile. */
    def getSigningProfile(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningProfileArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.signer.outputs.GetSigningProfileResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningProfileArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningProfile(args(argsBuilder).build)

    /** Provides information about a Signer Signing Profile. */
    def getSigningProfilePlain(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningProfilePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.signer.outputs.GetSigningProfileResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningProfilePlainArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningProfilePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.signer.SigningJobArgs.Builder)
    /**
     * @param destination The S3 bucket in which to save your signed object. See Destination below for details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobDestinationArgs.Builder]):
        com.pulumi.aws.signer.SigningJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningJobDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source The S3 bucket that contains the object to sign. See Source below for details.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobSourceArgs.Builder]):
        com.pulumi.aws.signer.SigningJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningJobSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.signer.SigningProfileArgs.Builder)
    /**
     * @param signatureValidityPeriod The validity period for a signing job. See `signatureValidityPeriod` Block below for details.
     * @return builder
     */
    def signatureValidityPeriod(args: Endofunction[com.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs.Builder]):
        com.pulumi.aws.signer.SigningProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs.builder
      builder.signatureValidityPeriod(args(argsBuilder).build)

    /**
     * @param signingMaterial The AWS Certificate Manager certificate that will be used to sign code with the new signing profile. See `signingMaterial` Block below for details.
     * @return builder
     */
    def signingMaterial(args: Endofunction[com.pulumi.aws.signer.inputs.SigningProfileSigningMaterialArgs.Builder]):
        com.pulumi.aws.signer.SigningProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningProfileSigningMaterialArgs.builder
      builder.signingMaterial(args(argsBuilder).build)

  /** Creates a Signer Signing Profile. A signing profile contains information about the code signing configuration parameters that can be used by a given code signing user. */
  def SigningProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.signer.SigningProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.signer.SigningProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.signer.inputs.SigningProfileState.Builder)
    /**
     * @param revocationRecords Revocation information for a signing profile. See `revocationRecord` Block below for details.
     * @return builder
     */
    def revocationRecords(args: Endofunction[com.pulumi.aws.signer.inputs.SigningProfileRevocationRecordArgs.Builder]*):
        com.pulumi.aws.signer.inputs.SigningProfileState.Builder =
      def argsBuilder = com.pulumi.aws.signer.inputs.SigningProfileRevocationRecordArgs.builder
      builder.revocationRecords(args.map(_(argsBuilder).build)*)

    /**
     * @param signatureValidityPeriod The validity period for a signing job. See `signatureValidityPeriod` Block below for details.
     * @return builder
     */
    def signatureValidityPeriod(args: Endofunction[com.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs.Builder]):
        com.pulumi.aws.signer.inputs.SigningProfileState.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs.builder
      builder.signatureValidityPeriod(args(argsBuilder).build)

    /**
     * @param signingMaterial The AWS Certificate Manager certificate that will be used to sign code with the new signing profile. See `signingMaterial` Block below for details.
     * @return builder
     */
    def signingMaterial(args: Endofunction[com.pulumi.aws.signer.inputs.SigningProfileSigningMaterialArgs.Builder]):
        com.pulumi.aws.signer.inputs.SigningProfileState.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningProfileSigningMaterialArgs.builder
      builder.signingMaterial(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.signer.inputs.SigningJobSignedObjectArgs.Builder)
    def s3s(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobSignedObjectS3Args.Builder]*):
        com.pulumi.aws.signer.inputs.SigningJobSignedObjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.signer.inputs.SigningJobSignedObjectS3Args.builder
      builder.s3s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.signer.inputs.SigningJobDestinationArgs.Builder)
    /**
     * @param s3 A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobDestinationS3Args.Builder]):
        com.pulumi.aws.signer.inputs.SigningJobDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningJobDestinationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.signer.inputs.SigningJobSourceArgs.Builder)
    /**
     * @param s3 A configuration block describing the S3 Source object: See S3 Source below for details.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobSourceS3Args.Builder]):
        com.pulumi.aws.signer.inputs.SigningJobSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningJobSourceS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.signer.inputs.SigningJobState.Builder)
    /**
     * @param destination The S3 bucket in which to save your signed object. See Destination below for details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobDestinationArgs.Builder]):
        com.pulumi.aws.signer.inputs.SigningJobState.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningJobDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param revocationRecords A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
     * @return builder
     */
    def revocationRecords(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobRevocationRecordArgs.Builder]*):
        com.pulumi.aws.signer.inputs.SigningJobState.Builder =
      def argsBuilder = com.pulumi.aws.signer.inputs.SigningJobRevocationRecordArgs.builder
      builder.revocationRecords(args.map(_(argsBuilder).build)*)

    /**
     * @param signedObjects Name of the S3 bucket where the signed code image is saved by code signing.
     * @return builder
     */
    def signedObjects(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobSignedObjectArgs.Builder]*):
        com.pulumi.aws.signer.inputs.SigningJobState.Builder =
      def argsBuilder = com.pulumi.aws.signer.inputs.SigningJobSignedObjectArgs.builder
      builder.signedObjects(args.map(_(argsBuilder).build)*)

    /**
     * @param source The S3 bucket that contains the object to sign. See Source below for details.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.signer.inputs.SigningJobSourceArgs.Builder]):
        com.pulumi.aws.signer.inputs.SigningJobState.Builder =
      val argsBuilder = com.pulumi.aws.signer.inputs.SigningJobSourceArgs.builder
      builder.source(args(argsBuilder).build)
