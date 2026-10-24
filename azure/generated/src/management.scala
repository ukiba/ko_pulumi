package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object management:
  /**
   * Manages a Management Group.
   * 
   * &gt; **Note:** Configuring `subscriptionIds` is not supported when using the `azure.management.GroupSubscriptionAssociation` resource, results will be unpredictable.
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Policy Assignment to a Management Group. */
  def GroupPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicyAssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Management Group Policy Exemption. */
  def GroupPolicyExemption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicyExemptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicyExemptionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicyExemption(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Management Group Policy Remediation. */
  def GroupPolicyRemediation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicyRemediationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicyRemediationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicyRemediation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Policy Set Definition for a Management Group. */
  def GroupPolicySetDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicySetDefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicySetDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Management Group Subscription Association.
   * 
   * &gt; **Note:** When using this resource, configuring `subscriptionIds` on the `azure.management.Group` resource is not supported.
   */
  def GroupSubscriptionAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupSubscriptionAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.management.GroupSubscriptionAssociationArgs.builder
    com.pulumi.azure.management.GroupSubscriptionAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Template Deployment at a Management Group Scope.
   * 
   * &gt; **Note:** Deleting a Deployment at the Management Group Scope will not delete any resources created by the deployment.
   * 
   * &gt; **Note:** Deployments to a Management Group are always Incrementally applied. Existing resources that are not part of the template will not be removed.
   */
  def GroupTemplateDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupTemplateDeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupTemplateDeploymentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.management.GroupTemplateDeployment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Management Lock which is scoped to a Subscription, Resource Group or Resource. */
  def Lock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.LockArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.LockArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.Lock(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ManagementFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Management Group. */
    inline def getGroup(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.management.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Management Group. */
    inline def getGroupPlain(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.management.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupPlainArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Management Group Template Deployment. */
    inline def getGroupTemplateDeployment(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.management.outputs.GetGroupTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroupTemplateDeployment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Management Group Template Deployment. */
    inline def getGroupTemplateDeploymentPlain(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.management.outputs.GetGroupTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentPlainArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroupTemplateDeploymentPlain(args(argsBuilder).build)

  /** Manages a Resource Management Private Link to restrict access for managing resources in the tenant. */
  def PrivateLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.PrivateLinkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.PrivateLinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.PrivateLink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Resource Management Private Link Association. */
  def PrivateLinkAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.PrivateLinkAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.PrivateLinkAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.PrivateLinkAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
