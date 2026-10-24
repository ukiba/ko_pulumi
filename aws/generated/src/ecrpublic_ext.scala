package jp.ukiba.ko_pulumi
package aws

object ecrpublic_ext:
  extension (builder: com.pulumi.aws.ecrpublic.RepositoryArgs.Builder)
    /**
     * @param catalogData Catalog data configuration for the repository. See below for schema.
     * @return builder
     */
    inline def catalogData(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.Builder]):
        com.pulumi.aws.ecrpublic.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.builder
      builder.catalogData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecrpublic.inputs.GetImagesArgs.Builder)
    /**
     * @param imageIds One or more image ID filters. Each image ID can use either a tag or digest (or both). Each object has the following attributes:
     * @return builder
     */
    inline def imageIds(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.GetImagesImageIdArgs.Builder]*):
        com.pulumi.aws.ecrpublic.inputs.GetImagesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecrpublic.inputs.GetImagesImageIdArgs.builder
      builder.imageIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecrpublic.inputs.GetImagesPlainArgs.Builder)
    /**
     * @param imageIds One or more image ID filters. Each image ID can use either a tag or digest (or both). Each object has the following attributes:
     * @return builder
     */
    inline def imageIds(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.GetImagesImageId.Builder]*):
        com.pulumi.aws.ecrpublic.inputs.GetImagesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecrpublic.inputs.GetImagesImageId.builder
      builder.imageIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecrpublic.inputs.RepositoryState.Builder)
    /**
     * @param catalogData Catalog data configuration for the repository. See below for schema.
     * @return builder
     */
    inline def catalogData(args: Endofunction[com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.Builder]):
        com.pulumi.aws.ecrpublic.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs.builder
      builder.catalogData(args(argsBuilder).build)
