package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object saasruntime:
  /**
   * A version to be propagated and deployed to Units. It points to a specific version of a Blueprint that can be applied to Units, for example, via a Rollout.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def Release(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.ReleaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.saasruntime.ReleaseArgs.builder
    com.pulumi.gcp.saasruntime.Release(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A RolloutKind is a reusable configuration resource that defines the policies, strategies, and targeting for Rollout operations. It acts as a template for repeatable Rollouts, providing guardrails and ensuring that updates are executed in a consistent manner across a fleet of Units.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def RolloutKind(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.RolloutKindArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.saasruntime.RolloutKindArgs.builder
    com.pulumi.gcp.saasruntime.RolloutKind(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Saas resource is the top-level representation of a SaaS service managed by a producer. It contains a list of locations where the service is available, which is used by the Rollout system to generate a rollout plan.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def SaaS(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.SaaSArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.saasruntime.SaaSArgs.builder
    com.pulumi.gcp.saasruntime.SaaS(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The Tenant resource represents the service producer&#39;s view of a service instance created for a consumer. It enables the association between the service producer&#39;s managed resources and the end consumer.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def Tenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.TenantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.saasruntime.TenantArgs.builder
    com.pulumi.gcp.saasruntime.Tenant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A Unit is the fundamental structural building block of a SaaS offering. Each Unit is an instance of a UnitKind. It is a versioned, manageable component of a service that has its own lifecycle, representing elements like infrastructure, workloads, or an entire application stack that a service producer intends to manage as a single entity. */
  def Unit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.UnitArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.saasruntime.UnitArgs.builder
    com.pulumi.gcp.saasruntime.Unit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A UnitKind serves as a template or type definition for a group of Units. Units that belong to the same UnitKind are managed together, follow the same release model, and are typically updated together through rollouts.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def UnitKind(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.UnitKindArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.saasruntime.UnitKindArgs.builder
    com.pulumi.gcp.saasruntime.UnitKind(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A UnitOperation encapsulates the intent to change or interact with a Unit. Operations such as provisioning, upgrading, or deprovisioning a Unit are triggered by creating a UnitOperation resource. */
  def UnitOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.UnitOperationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.saasruntime.UnitOperationArgs.builder
    com.pulumi.gcp.saasruntime.UnitOperation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
