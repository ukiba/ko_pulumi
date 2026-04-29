package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codegurureviewer:
  extension (builder: com.pulumi.aws.codegurureviewer.RepositoryAssociationArgs.Builder)
    /**
     * @param kmsKeyDetails An object describing the KMS key to asssociate. Block is documented below.
     * @return builder
     */
    def kmsKeyDetails(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationKmsKeyDetailsArgs.Builder]):
        com.pulumi.aws.codegurureviewer.RepositoryAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationKmsKeyDetailsArgs.builder
      builder.kmsKeyDetails(args(argsBuilder).build)

    /**
     * @param repository An object describing the repository to associate. Valid values: `bitbucket`, `codecommit`, `githubEnterpriseServer`, or `s3Bucket`. Block is documented below. Note: for repositories that leverage CodeStar connections (ex. `bitbucket`, `githubEnterpriseServer`) the connection must be in `Available` status prior to creating this resource.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def repository(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.Builder]):
        com.pulumi.aws.codegurureviewer.RepositoryAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.builder
      builder.repository(args(argsBuilder).build)

  /** Resource for managing an AWS CodeGuru Reviewer Repository Association. */
  def RepositoryAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codegurureviewer.RepositoryAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codegurureviewer.RepositoryAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codegurureviewer.RepositoryAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.Builder)
    def bitbucket(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryBitbucketArgs.Builder]):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryBitbucketArgs.builder
      builder.bitbucket(args(argsBuilder).build)

    def codecommit(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryCodecommitArgs.Builder]):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryCodecommitArgs.builder
      builder.codecommit(args(argsBuilder).build)

    def githubEnterpriseServer(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryGithubEnterpriseServerArgs.Builder]):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryGithubEnterpriseServerArgs.builder
      builder.githubEnterpriseServer(args(argsBuilder).build)

    def s3Bucket(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryS3BucketArgs.Builder]):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryS3BucketArgs.builder
      builder.s3Bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationS3RepositoryDetailArgs.Builder)
    def codeArtifacts(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactArgs.Builder]*):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationS3RepositoryDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactArgs.builder
      builder.codeArtifacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationState.Builder)
    /**
     * @param kmsKeyDetails An object describing the KMS key to asssociate. Block is documented below.
     * @return builder
     */
    def kmsKeyDetails(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationKmsKeyDetailsArgs.Builder]):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationKmsKeyDetailsArgs.builder
      builder.kmsKeyDetails(args(argsBuilder).build)

    /**
     * @param repository An object describing the repository to associate. Valid values: `bitbucket`, `codecommit`, `githubEnterpriseServer`, or `s3Bucket`. Block is documented below. Note: for repositories that leverage CodeStar connections (ex. `bitbucket`, `githubEnterpriseServer`) the connection must be in `Available` status prior to creating this resource.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def repository(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.Builder]):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs.builder
      builder.repository(args(argsBuilder).build)

    def s3RepositoryDetails(args: Endofunction[com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationS3RepositoryDetailArgs.Builder]*):
        com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationS3RepositoryDetailArgs.builder
      builder.s3RepositoryDetails(args.map(_(argsBuilder).build)*)
