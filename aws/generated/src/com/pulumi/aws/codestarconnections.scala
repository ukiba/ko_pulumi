package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object codestarconnections:
  extension (builder: com.pulumi.aws.codestarconnections.HostArgs.Builder)
    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codestarconnections.HostArgs.Builder =
      val argsBuilder = com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  type CodestarconnectionsFunctions = com.pulumi.aws.codestarconnections.CodestarconnectionsFunctions
  object CodestarconnectionsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.codestarconnections.CodestarconnectionsFunctions.*
  extension (self: CodestarconnectionsFunctions.type)
    /** Provides details about CodeStar Connection. */
    def getConnection(args: Endofunction[com.pulumi.aws.codestarconnections.inputs.GetConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codestarconnections.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.codestarconnections.inputs.GetConnectionArgs.builder
      com.pulumi.aws.codestarconnections.CodestarconnectionsFunctions.getConnection(args(argsBuilder).build)

    /** Provides details about CodeStar Connection. */
    def getConnectionPlain(args: Endofunction[com.pulumi.aws.codestarconnections.inputs.GetConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codestarconnections.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.codestarconnections.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.codestarconnections.CodestarconnectionsFunctions.getConnectionPlain(args(argsBuilder).build)

  /**
   * Provides a CodeStar Connection.
   *  
   *  &gt; **NOTE:** The `aws.codestarconnections.Connection` resource is created in the state `PENDING`. Authentication with the connection provider must be completed in the AWS Console. See the [AWS documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-update.html) for details.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codestarconnections.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codestarconnections.ConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codestarconnections.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a CodeStar Host.
   *  
   *  &gt; **NOTE:** The `aws.codestarconnections.Host` resource is created in the state `PENDING`. Authentication with the host provider must be completed in the AWS Console. For more information visit [Set up a pending host](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-host-setup.html).
   */
  def Host(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codestarconnections.HostArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codestarconnections.HostArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.codestarconnections.Host(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codestarconnections.inputs.HostState.Builder)
    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codestarconnections.inputs.HostState.Builder =
      val argsBuilder = com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)
