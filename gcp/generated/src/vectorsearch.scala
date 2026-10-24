package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object vectorsearch:
  /** Description */
  def Collection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vectorsearch.CollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vectorsearch.CollectionArgs.builder
    com.pulumi.gcp.vectorsearch.Collection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A DataObject is a single item of data (with optional vectors) stored in a
   * Vector Search Collection. Each DataObject conforms to the parent
   * Collection&#39;s `dataSchema` and `vectorSchema`.
   * 
   * This resource always issues one `CreateDataObject` request per Terraform
   * resource block. It does NOT use the `batchCreate` REST endpoint --
   * Terraform&#39;s resource lifecycle is inherently per-object, so batching
   * across resources is not modeled. When you use `forEach` or `count`,
   * Terraform will still issue individual requests, up to `-parallelism`
   * in parallel.
   * 
   * For ingesting more than a few hundred items, prefer one of the
   * following out-of-band paths instead of Terraform:
   * 
   *   * `importDataObjects` (bulk ingest from Cloud Storage) -- highest
   *     throughput, but only available *before* any Index is created on
   *     the Collection.
   *   * `batchCreate` (up to ~1000 items per call) -- available at any
   *     time, but must be driven from your own client code, not Terraform.
   * 
   * Once an Index exists on the Collection, `importDataObjects` is no
   * longer available and DataObjects must be created via `CreateDataObject`
   * (as this resource does) or via `batchCreate`.
   */
  def DataObject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vectorsearch.DataObjectArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vectorsearch.DataObjectArgs.builder
    com.pulumi.gcp.vectorsearch.DataObject(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An Index defines an approximate nearest-neighbor search structure over a
   * field of a Vector Search Collection.
   */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vectorsearch.IndexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vectorsearch.IndexArgs.builder
    com.pulumi.gcp.vectorsearch.Index(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
