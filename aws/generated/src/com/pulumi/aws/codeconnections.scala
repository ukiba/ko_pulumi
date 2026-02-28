package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codeconnections:
  extension (builder: com.pulumi.aws.codeconnections.HostArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.HostArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codeconnections.HostArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codeconnections.ConnectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.ConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Resource for managing an AWS CodeConnections Connection.
   *  
   *  &gt; **NOTE:** The `aws.codeconnections.Connection` resource is created in the state `PENDING`. Authentication with the connection provider must be completed in the AWS Console. See the [AWS documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-update.html) for details.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeconnections.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeconnections.ConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codeconnections.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS CodeConnections Host.
   *  
   *  &gt; **NOTE:** The `aws.codeconnections.Host` resource is created in the state `PENDING`. Authentication with the host provider must be completed in the AWS Console. For more information visit [Set up a pending host](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-host-setup.html).
   */
  def Host(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeconnections.HostArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeconnections.HostArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codeconnections.Host(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codeconnections.inputs.HostState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.inputs.HostState.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.Builder]):
        com.pulumi.aws.codeconnections.inputs.HostState.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.HostVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codeconnections.inputs.ConnectionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.codeconnections.inputs.ConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.codeconnections.inputs.ConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
