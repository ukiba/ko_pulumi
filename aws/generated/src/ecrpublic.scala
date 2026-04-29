package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ecrpublic:
  extension (builder: com.pulumi.aws.ecrpublic.RepositoryArgs.Builder)
    /**
     * @param catalogData Catalog data configuration for the repository. See below for schema.
     * @return builder
     */
    def catalogData(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.Builder]):
        com.pulumi.aws.ecrpublic.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.builder
      builder.catalogData(args(argsBuilder).build)

  /**
   * Provides a Public Elastic Container Registry Repository.
   *  
   *  &gt; **NOTE:** This resource can only be used in the `us-east-1` region.
   */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecrpublic.RepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecrpublic.RepositoryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ecrpublic.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Container Registry Public Repository Policy.
   *  
   *  Note that currently only one policy may be applied to a repository.
   *  
   *  &gt; **NOTE:** This resource can only be used in the `us-east-1` region.
   */
  def RepositoryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecrpublic.RepositoryPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecrpublic.RepositoryPolicyArgs.builder
    
    com.pulumi.aws.ecrpublic.RepositoryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type EcrpublicFunctions = com.pulumi.aws.ecrpublic.EcrpublicFunctions
  object EcrpublicFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ecrpublic.EcrpublicFunctions.*
  extension (self: EcrpublicFunctions.type)
    /**
     * The Public ECR Authorization Token data source allows the authorization token, token expiration date, user name, and password to be retrieved for a Public ECR repository.
     *  
     *  &gt; **NOTE:** This data source can only be used in the `us-east-1` region.
     */
    def getAuthorizationToken(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.GetAuthorizationTokenArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecrpublic.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.GetAuthorizationTokenArgs.builder
      com.pulumi.aws.ecrpublic.EcrpublicFunctions.getAuthorizationToken(args(argsBuilder).build)

    /**
     * The Public ECR Authorization Token data source allows the authorization token, token expiration date, user name, and password to be retrieved for a Public ECR repository.
     *  
     *  &gt; **NOTE:** This data source can only be used in the `us-east-1` region.
     */
    def getAuthorizationTokenPlain(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.GetAuthorizationTokenPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecrpublic.outputs.GetAuthorizationTokenResult] =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.GetAuthorizationTokenPlainArgs.builder
      com.pulumi.aws.ecrpublic.EcrpublicFunctions.getAuthorizationTokenPlain(args(argsBuilder).build)

    /** The ECR Public Images data source allows the list of images in a specified public repository to be retrieved. */
    def getImages(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.GetImagesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecrpublic.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.GetImagesArgs.builder
      com.pulumi.aws.ecrpublic.EcrpublicFunctions.getImages(args(argsBuilder).build)

    /** The ECR Public Images data source allows the list of images in a specified public repository to be retrieved. */
    def getImagesPlain(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.GetImagesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecrpublic.outputs.GetImagesResult] =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.GetImagesPlainArgs.builder
      com.pulumi.aws.ecrpublic.EcrpublicFunctions.getImagesPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecrpublic.inputs.RepositoryState.Builder)
    /**
     * @param catalogData Catalog data configuration for the repository. See below for schema.
     * @return builder
     */
    def catalogData(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.Builder]):
        com.pulumi.aws.ecrpublic.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.builder
      builder.catalogData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecrpublic.inputs.GetImagesArgs.Builder)
    /**
     * @param imageIds One or more image ID filters. Each image ID can use either a tag or digest (or both). Each object has the following attributes:
     * @return builder
     */
    def imageIds(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.GetImagesImageIdArgs.Builder]*):
        com.pulumi.aws.ecrpublic.inputs.GetImagesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecrpublic.inputs.GetImagesImageIdArgs.builder
      builder.imageIds(args.map(_(argsBuilder).build)*)
