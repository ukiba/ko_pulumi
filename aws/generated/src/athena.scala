package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object athena:
  object AthenaFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides an Athena Named Query data source. */
    inline def getNamedQuery(args: Endofunction[com.pulumi.aws.athena.inputs.GetNamedQueryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.athena.outputs.GetNamedQueryResult] =
      val argsBuilder = com.pulumi.aws.athena.inputs.GetNamedQueryArgs.builder
      com.pulumi.aws.athena.AthenaFunctions.getNamedQuery(args(argsBuilder).build)

    /** Provides an Athena Named Query data source. */
    inline def getNamedQueryPlain(args: Endofunction[com.pulumi.aws.athena.inputs.GetNamedQueryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.athena.outputs.GetNamedQueryResult] =
      val argsBuilder = com.pulumi.aws.athena.inputs.GetNamedQueryPlainArgs.builder
      com.pulumi.aws.athena.AthenaFunctions.getNamedQueryPlain(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Athena Capacity Reservation.
   * 
   * &gt; Destruction of this resource will both [cancel](https://docs.aws.amazon.com/athena/latest/ug/capacity-management-cancelling-a-capacity-reservation.html) and [delete](https://docs.aws.amazon.com/athena/latest/ug/capacity-management-deleting-a-capacity-reservation.html) the capacity reservation.
   */
  def CapacityReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.athena.CapacityReservationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.CapacityReservationArgs.builder
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
    com.pulumi.aws.athena.CapacityReservation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Athena data catalog.
   * 
   * More information about Athena and Athena data catalogs can be found in the [Athena User Guide](https://docs.aws.amazon.com/athena/latest/ug/what-is.html).
   * 
   * &gt; **Tip:** for a more detailed explanation on the usage of `parameters`, see the [DataCatalog API documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html)
   */
  def DataCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.athena.DataCatalogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.DataCatalogArgs.builder
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
    com.pulumi.aws.athena.DataCatalog(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Athena database. */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.athena.DatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.DatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.athena.Database(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Athena Named Query resource. */
  def NamedQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.athena.NamedQueryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.NamedQueryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.athena.NamedQuery(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an Athena Prepared Statement. */
  def PreparedStatement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.athena.PreparedStatementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.PreparedStatementArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.athena.PreparedStatement(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Athena Workgroup. */
  def Workgroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.athena.WorkgroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.athena.WorkgroupArgs.builder
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
    com.pulumi.aws.athena.Workgroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
