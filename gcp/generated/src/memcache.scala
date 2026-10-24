package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object memcache:
  /**
   * A Google Cloud Memcache instance.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/memcache/docs/creating-instances)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.memcache.InstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.memcache.InstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.memcache.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object MemcacheFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances). */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.memcache.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.memcache.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.memcache.MemcacheFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances). */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.memcache.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.memcache.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memcache.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.memcache.MemcacheFunctions.getInstancePlain(args(argsBuilder).build)
