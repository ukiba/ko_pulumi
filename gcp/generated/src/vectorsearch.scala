package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object vectorsearch:
  extension (builder: com.pulumi.gcp.vectorsearch.CollectionArgs.Builder)
    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be
     *  applied to a Vector Search collection.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vectorsearch.CollectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param vectorSchemas Schema for vector fields. Only vector fields in this schema will be
     *  searchable.
     *  Field names must contain only alphanumeric characters,
     *  underscores, and hyphens.
     *  Structure is documented below.
     * @return builder
     */
    def vectorSchemas(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder]*):
        com.pulumi.gcp.vectorsearch.CollectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.builder
      builder.vectorSchemas(args.map(_(argsBuilder).build)*)

  /** Description */
  def Collection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vectorsearch.CollectionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vectorsearch.CollectionArgs.builder
    com.pulumi.gcp.vectorsearch.Collection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder)
    /**
     * @param denseVector Message describing a dense vector field.
     *  Structure is documented below.
     * @return builder
     */
    def denseVector(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorArgs.builder
      builder.denseVector(args(argsBuilder).build)

    /**
     * @param sparseVector Message describing a sparse vector field.
     * @return builder
     */
    def sparseVector(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaSparseVectorArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaSparseVectorArgs.builder
      builder.sparseVector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorArgs.Builder)
    /**
     * @param vertexEmbeddingConfig Message describing the configuration for generating embeddings for a vector
     *  field using Vertex AI embeddings API.
     *  Structure is documented below.
     * @return builder
     */
    def vertexEmbeddingConfig(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorVertexEmbeddingConfigArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorVertexEmbeddingConfigArgs.builder
      builder.vertexEmbeddingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.CollectionState.Builder)
    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be
     *  applied to a Vector Search collection.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.CollectionState.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param vectorSchemas Schema for vector fields. Only vector fields in this schema will be
     *  searchable.
     *  Field names must contain only alphanumeric characters,
     *  underscores, and hyphens.
     *  Structure is documented below.
     * @return builder
     */
    def vectorSchemas(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder]*):
        com.pulumi.gcp.vectorsearch.inputs.CollectionState.Builder =
      def argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.builder
      builder.vectorSchemas(args.map(_(argsBuilder).build)*)
