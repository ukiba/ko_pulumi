package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ssmcontacts:
  /**
   * Resource for managing an AWS SSM Contact.
   * 
   * &gt; **NOTE:** A contact implicitly depends on a replication set. If you configured your replication set in Pulumi, we recommend you add it to the `dependsOn` argument for the Contact Resource.
   */
  def Contact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssmcontacts.ContactArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmcontacts.ContactArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ssmcontacts.Contact(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS SSM Contacts Contact Channel.
   * 
   * &gt; **NOTE:** The contact channel needs to be activated in the AWS Systems Manager console, otherwise it can&#39;t be used to engage the contact. See the [Contacts section of the Incident Manager User Guide](https://docs.aws.amazon.com/incident-manager/latest/userguide/contacts.html) for more information.
   */
  def ContactChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssmcontacts.ContactChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmcontacts.ContactChannelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.ssmcontacts.ContactChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS SSM Contact Plan. */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssmcontacts.PlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssmcontacts.PlanArgs.builder
    com.pulumi.aws.ssmcontacts.Plan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object SsmcontactsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS SSM Contact. */
    inline def getContact(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmcontacts.outputs.GetContactResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContact(args(argsBuilder).build)

    /** Data source for managing an AWS SSM Contact. */
    inline def getContactPlain(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmcontacts.outputs.GetContactResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactPlainArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContactPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SSM Contacts Contact Channel. */
    inline def getContactChannel(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactChannelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmcontacts.outputs.GetContactChannelResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactChannelArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContactChannel(args(argsBuilder).build)

    /** Data source for managing an AWS SSM Contacts Contact Channel. */
    inline def getContactChannelPlain(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetContactChannelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmcontacts.outputs.GetContactChannelResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetContactChannelPlainArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getContactChannelPlain(args(argsBuilder).build)

    /** Data source for managing a Plan of an AWS SSM Contact. */
    inline def getPlan(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmcontacts.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetPlanArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getPlan(args(argsBuilder).build)

    /** Data source for managing a Plan of an AWS SSM Contact. */
    inline def getPlanPlain(args: Endofunction[com.pulumi.aws.ssmcontacts.inputs.GetPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmcontacts.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.ssmcontacts.inputs.GetPlanPlainArgs.builder
      com.pulumi.aws.ssmcontacts.SsmcontactsFunctions.getPlanPlain(args(argsBuilder).build)
