package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object redshiftserverless:
  /** Resource for managing an AWS Redshift Serverless Custom Domain Association. */
  def CustomDomainAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.CustomDomainAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.CustomDomainAssociationArgs.builder
    com.pulumi.aws.redshiftserverless.CustomDomainAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift Serverless Endpoint Access. */
  def EndpointAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.EndpointAccessArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.EndpointAccessArgs.builder
    com.pulumi.aws.redshiftserverless.EndpointAccess(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a new Amazon Redshift Serverless Namespace.
   * 
   * &gt; **Note:** Write-Only argument `adminPasswordWo` is available to use in place of `adminPassword`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.NamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshiftserverless.NamespaceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshiftserverless.Namespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object RedshiftserverlessFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides redshift serverless temporary credentials for a workgroup. */
    inline def getCredentials(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetCredentialsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.redshiftserverless.outputs.GetCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetCredentialsArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getCredentials(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides redshift serverless temporary credentials for a workgroup. */
    inline def getCredentialsPlain(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetCredentialsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshiftserverless.outputs.GetCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetCredentialsPlainArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getCredentialsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Redshift Serverless Namespace. */
    inline def getNamespace(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetNamespaceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.redshiftserverless.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetNamespaceArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Redshift Serverless Namespace. */
    inline def getNamespacePlain(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetNamespacePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshiftserverless.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetNamespacePlainArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Redshift Serverless Workgroup. */
    inline def getWorkgroup(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.redshiftserverless.outputs.GetWorkgroupResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getWorkgroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Redshift Serverless Workgroup. */
    inline def getWorkgroupPlain(args: Endofunction[com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshiftserverless.outputs.GetWorkgroupResult] =
      val argsBuilder = com.pulumi.aws.redshiftserverless.inputs.GetWorkgroupPlainArgs.builder
      com.pulumi.aws.redshiftserverless.RedshiftserverlessFunctions.getWorkgroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Creates a new Amazon Redshift Serverless Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.ResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.ResourcePolicyArgs.builder
    com.pulumi.aws.redshiftserverless.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift Serverless Snapshot. */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.SnapshotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.SnapshotArgs.builder
    com.pulumi.aws.redshiftserverless.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift Serverless Usage Limit. */
  def UsageLimit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.UsageLimitArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshiftserverless.UsageLimitArgs.builder
    com.pulumi.aws.redshiftserverless.UsageLimit(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift Serverless Workgroup. */
  def Workgroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.redshiftserverless.WorkgroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshiftserverless.WorkgroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshiftserverless.Workgroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
