package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object dataform:
  /**
   * Config is a singleton resource used to configure the default Dataform settings for a specified location.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Config, see:
   * 
   * * [API documentation](https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.ConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataform.ConfigArgs.builder
    com.pulumi.gcp.dataform.Config(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DataformFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for repository */
    inline def getRepositoryIamPolicy(args: Endofunction[com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataform.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyArgs.builder
      com.pulumi.gcp.dataform.DataformFunctions.getRepositoryIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for repository */
    inline def getRepositoryIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataform.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataform.DataformFunctions.getRepositoryIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A resource represents a Dataform folder
   * 
   * To get more information about Folder, see:
   * 
   * * [API documentation](https://cloud.google.com/dataform/reference/rest/v1/projects.locations.folders)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def Folder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.FolderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataform.FolderArgs.builder
    com.pulumi.gcp.dataform.Folder(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A resource represents a Dataform Git repository
   * 
   * To get more information about Repository, see:
   * 
   * * [API documentation](https://cloud.google.com/dataform/reference/rest/v1/projects.locations.repositories)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataform.RepositoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataform.Repository(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def RepositoryIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataform.RepositoryIamBindingArgs.builder
    com.pulumi.gcp.dataform.RepositoryIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def RepositoryIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataform.RepositoryIamMemberArgs.builder
    com.pulumi.gcp.dataform.RepositoryIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def RepositoryIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataform.RepositoryIamPolicyArgs.builder
    com.pulumi.gcp.dataform.RepositoryIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A resource represents a Dataform release configuration
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about RepositoryReleaseConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories.releaseConfigs)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataform/docs/release-configurations)
   */
  def RepositoryReleaseConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataform.RepositoryReleaseConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A resource represents a Dataform workflow configuration
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about RepositoryWorkflowConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories.workflowConfigs)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataform/docs/workflow-configurations)
   */
  def RepositoryWorkflowConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataform.RepositoryWorkflowConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A resource represents a Dataform TeamFolder
   * 
   * To get more information about TeamFolder, see:
   * 
   * * [API documentation](https://cloud.google.com/dataform/reference/rest/v1/projects.locations.teamFolders)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def TeamFolder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dataform.TeamFolderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataform.TeamFolderArgs.builder
    com.pulumi.gcp.dataform.TeamFolder(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
