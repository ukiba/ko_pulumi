package jp.ukiba.ko_pulumi
package gcp

object vectorsearch_ext:
  extension (builder: com.pulumi.gcp.vectorsearch.CollectionArgs.Builder)
    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be
     * applied to a Vector Search collection.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vectorsearch.CollectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param vectorSchemas Schema for vector fields. Only vector fields in this schema will be
     * searchable.
     * Field names must contain only alphanumeric characters,
     * underscores, and hyphens.
     * Structure is documented below.
     * @return builder
     */
    def vectorSchemas(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder]*):
        com.pulumi.gcp.vectorsearch.CollectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.builder
      builder.vectorSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vectorsearch.DataObjectArgs.Builder)
    /**
     * @param vectors The vectors of the DataObject, keyed by the vector field name as
     * defined in the parent Collection&#39;s `vectorSchema`.
     * If a vector field is configured with a `vertexEmbeddingConfig` on
     * the Collection, the server will populate the vector automatically
     * from the corresponding text in `data` and the field should be
     * omitted here.
     * Structure is documented below.
     * @return builder
     */
    def vectors(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorArgs.Builder]*):
        com.pulumi.gcp.vectorsearch.DataObjectArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorArgs.builder
      builder.vectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vectorsearch.IndexArgs.Builder)
    /**
     * @param dedicatedInfrastructure Dedicated infrastructure for the index. This field belongs to the
     * `infraType` oneof; if omitted, the server populates it with the
     * default `PERFORMANCE_OPTIMIZED` mode and an autoscaling spec of
     * `min_replica_count=2`, `max_replica_count=2`.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedInfrastructure(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureArgs.Builder]):
        com.pulumi.gcp.vectorsearch.IndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureArgs.builder
      builder.dedicatedInfrastructure(args(argsBuilder).build)

    /**
     * @param denseScann Dense ScaNN index configuration. This field belongs to the
     * `indexType` oneof; if omitted, the server populates it with default
     * ScaNN settings.
     * Structure is documented below.
     * @return builder
     */
    def denseScann(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.IndexDenseScannArgs.Builder]):
        com.pulumi.gcp.vectorsearch.IndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.IndexDenseScannArgs.builder
      builder.denseScann(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.CollectionState.Builder)
    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be
     * applied to a Vector Search collection.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.CollectionState.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param vectorSchemas Schema for vector fields. Only vector fields in this schema will be
     * searchable.
     * Field names must contain only alphanumeric characters,
     * underscores, and hyphens.
     * Structure is documented below.
     * @return builder
     */
    def vectorSchemas(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder]*):
        com.pulumi.gcp.vectorsearch.inputs.CollectionState.Builder =
      def argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.builder
      builder.vectorSchemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaArgs.Builder)
    /**
     * @param denseVector Message describing a dense vector field.
     * Structure is documented below.
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
     * field using Vertex AI embeddings API.
     * Structure is documented below.
     * @return builder
     */
    def vertexEmbeddingConfig(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorVertexEmbeddingConfigArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.CollectionVectorSchemaDenseVectorVertexEmbeddingConfigArgs.builder
      builder.vertexEmbeddingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.DataObjectState.Builder)
    /**
     * @param vectors The vectors of the DataObject, keyed by the vector field name as
     * defined in the parent Collection&#39;s `vectorSchema`.
     * If a vector field is configured with a `vertexEmbeddingConfig` on
     * the Collection, the server will populate the vector automatically
     * from the corresponding text in `data` and the field should be
     * omitted here.
     * Structure is documented below.
     * @return builder
     */
    def vectors(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorArgs.Builder]*):
        com.pulumi.gcp.vectorsearch.inputs.DataObjectState.Builder =
      def argsBuilder = com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorArgs.builder
      builder.vectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorArgs.Builder)
    /**
     * @param dense A dense vector.
     * Structure is documented below.
     * @return builder
     */
    def dense(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorDenseArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorDenseArgs.builder
      builder.dense(args(argsBuilder).build)

    /**
     * @param sparse A sparse vector.
     * Structure is documented below.
     * @return builder
     */
    def sparse(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorSparseArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.DataObjectVectorSparseArgs.builder
      builder.sparse(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureArgs.Builder)
    /**
     * @param autoscalingSpec Autoscaling specification.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingSpec(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureAutoscalingSpecArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureAutoscalingSpecArgs.builder
      builder.autoscalingSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vectorsearch.inputs.IndexState.Builder)
    /**
     * @param dedicatedInfrastructure Dedicated infrastructure for the index. This field belongs to the
     * `infraType` oneof; if omitted, the server populates it with the
     * default `PERFORMANCE_OPTIMIZED` mode and an autoscaling spec of
     * `min_replica_count=2`, `max_replica_count=2`.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedInfrastructure(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.IndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.IndexDedicatedInfrastructureArgs.builder
      builder.dedicatedInfrastructure(args(argsBuilder).build)

    /**
     * @param denseScann Dense ScaNN index configuration. This field belongs to the
     * `indexType` oneof; if omitted, the server populates it with default
     * ScaNN settings.
     * Structure is documented below.
     * @return builder
     */
    def denseScann(args: Endofunction[com.pulumi.gcp.vectorsearch.inputs.IndexDenseScannArgs.Builder]):
        com.pulumi.gcp.vectorsearch.inputs.IndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vectorsearch.inputs.IndexDenseScannArgs.builder
      builder.denseScann(args(argsBuilder).build)
