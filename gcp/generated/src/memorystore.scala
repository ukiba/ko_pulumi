package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object memorystore:
  /**
   * A Google Cloud Memorystore ACL policy.
   * 
   * ## Import
   * 
   * AclPolicy can be imported using any of these accepted formats:
   * 
   * * `projects/{{project}}/locations/{{location}}/aclPolicies/{{acl_policy_id}}`
   * * `{{project}}/{{location}}/{{acl_policy_id}}`
   * * `{{location}}/{{acl_policy_id}}`
   * 
   * When using the `pulumi import` command, AclPolicy can be imported using one of the formats above. For example:
   * 
   * ```sh
   * \$ pulumi import gcp:memorystore/aclPolicy:AclPolicy default projects/{{project}}/locations/{{location}}/aclPolicies/{{acl_policy_id}}
   * \$ pulumi import gcp:memorystore/aclPolicy:AclPolicy default {{project}}/{{location}}/{{acl_policy_id}}
   * \$ pulumi import gcp:memorystore/aclPolicy:AclPolicy default {{location}}/{{acl_policy_id}}
   * ```
   */
  def AclPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.memorystore.AclPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.memorystore.AclPolicyArgs.builder
    com.pulumi.gcp.memorystore.AclPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Google Cloud Memorystore instance.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/memorystore/docs/valkey/create-instances)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.memorystore.InstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.memorystore.InstanceArgs.builder
    com.pulumi.gcp.memorystore.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages user created connections for Memorystore instance
   * 
   * To get more information about InstanceDesiredUserCreatedEndpoints, see:
   * 
   * * [API documentation](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances)
   * 
   * &gt; **Note:** Please ensure your connections meet the requirements outlined at
   * https://cloud.google.com/memorystore/docs/valkey/about-multiple-vpc-networking#application_connection_requirements.
   * If you remove a connections item from the resource, the corresponding forwarding rule will no longer be functioning.
   * If the corresponding forwarding rule is represented in your terraform configuration it is recommended to delete that
   * `gcp.compute.ForwardingRule` resource at the same time.
   */
  def InstanceDesiredUserCreatedEndpoints(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpointsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpointsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.memorystore.InstanceDesiredUserCreatedEndpoints(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object MemorystoreFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information about a Google Cloud Memorystore ACL policy. For more information see the [official documentation](https://cloud.google.com/memorystore/docs/valkey) or the [API documentation](https://cloud.google.com/memorystore/docs/valkey/reference/rest). */
    inline def getAclPolicy(args: Endofunction[com.pulumi.gcp.memorystore.inputs.GetAclPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.memorystore.outputs.GetAclPolicyResult] =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.GetAclPolicyArgs.builder
      com.pulumi.gcp.memorystore.MemorystoreFunctions.getAclPolicy(args(argsBuilder).build)

    /** Get information about a Google Cloud Memorystore ACL policy. For more information see the [official documentation](https://cloud.google.com/memorystore/docs/valkey) or the [API documentation](https://cloud.google.com/memorystore/docs/valkey/reference/rest). */
    inline def getAclPolicyPlain(args: Endofunction[com.pulumi.gcp.memorystore.inputs.GetAclPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.memorystore.outputs.GetAclPolicyResult] =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.GetAclPolicyPlainArgs.builder
      com.pulumi.gcp.memorystore.MemorystoreFunctions.getAclPolicyPlain(args(argsBuilder).build)

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances). */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.memorystore.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.memorystore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.memorystore.MemorystoreFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/valkey/reference/rest/v1/projects.locations.instances). */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.memorystore.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.memorystore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.memorystore.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.memorystore.MemorystoreFunctions.getInstancePlain(args(argsBuilder).build)
