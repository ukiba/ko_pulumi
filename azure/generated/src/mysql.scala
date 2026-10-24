package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object mysql:
  /** Manages a MySQL Database within a MySQL Flexible Server */
  def FlexibleDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mysql.FlexibleDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a MySQL Flexible Server. */
  def FlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleServerArgs.builder
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
    com.pulumi.azure.mysql.FlexibleServer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Active Directory administrator on a MySQL Flexible Server */
  def FlexibleServerActiveDirectoryAdministratory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerActiveDirectoryAdministratoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.mysql.FlexibleServerActiveDirectoryAdministratoryArgs.builder
    com.pulumi.azure.mysql.FlexibleServerActiveDirectoryAdministratory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Sets a MySQL Flexible Server Configuration value on a MySQL Flexible Server.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** Since this resource is provisioned by default, the Azure Provider will not check for the presence of an existing resource prior to attempting to create it.
   */
  def FlexibleServerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleServerConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mysql.FlexibleServerConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Firewall Rule for a MySQL Flexible Server. */
  def FlexibleServerFirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.mysql.FlexibleServerFirewallRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mysql.FlexibleServerFirewallRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mysql.FlexibleServerFirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object MysqlFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing MySQL Flexible Server. */
    inline def getFlexibleServer(args: Endofunction[com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.mysql.outputs.GetFlexibleServerResult] =
      val argsBuilder = com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs.builder
      com.pulumi.azure.mysql.MysqlFunctions.getFlexibleServer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing MySQL Flexible Server. */
    inline def getFlexibleServerPlain(args: Endofunction[com.pulumi.azure.mysql.inputs.GetFlexibleServerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.mysql.outputs.GetFlexibleServerResult] =
      val argsBuilder = com.pulumi.azure.mysql.inputs.GetFlexibleServerPlainArgs.builder
      com.pulumi.azure.mysql.MysqlFunctions.getFlexibleServerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
