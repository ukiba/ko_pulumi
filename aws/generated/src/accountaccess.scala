package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object accountaccess:
  /**
   * Manages an AWS Account Access Application bound to an IAM Identity Center instance.
   * 
   * &gt; **NOTE:** AWS Account Access allows only one Application per Identity Center instance. Attempting to create a second Application for the same instance will fail. Use `pulumi import` to bring an existing Application under management.
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.accountaccess.ApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.accountaccess.ApplicationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.accountaccess.Application(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.accountaccess.ApplicationArgs.Builder)
    /**
     * @param identitySource Identity source for the application. Forces replacement when changed. See `identitySource` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def identitySource(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder]):
        com.pulumi.aws.accountaccess.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.builder
      builder.identitySource(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.accountaccess.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder)
    /**
     * @param identityCenter IAM Identity Center instance to use as the identity source. See `identityCenter` Block below.
     * @return builder
     */
    def identityCenter(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceIdentityCenterArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceIdentityCenterArgs.builder
      builder.identityCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder)
    /**
     * @param identitySource Identity source for the application. Forces replacement when changed. See `identitySource` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def identitySource(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationIdentitySourceArgs.builder
      builder.identitySource(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.accountaccess.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.accountaccess.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
