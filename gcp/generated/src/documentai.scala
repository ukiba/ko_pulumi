package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object documentai:
  /**
   * NextSchema is a collection of SchemaVersions.
   * 
   *  To get more information about Schema, see:
   * 
   *  * [API documentation](https://cloud.google.com/document-ai/docs/reference/rest/v1/projects.locations.schemas)
   */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.documentai.SchemaArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.documentai.SchemaArgs.builder
    com.pulumi.gcp.documentai.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
