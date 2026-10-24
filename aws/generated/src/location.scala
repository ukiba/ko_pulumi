package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object location:
  /** Resource for managing an AWS Location Geofence Collection. */
  def GeofenceCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.GeofenceCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.GeofenceCollectionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.location.GeofenceCollection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LocationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieve information about a Location Service Geofence Collection. */
    inline def getGeofenceCollection(args: Endofunction[com.pulumi.aws.location.inputs.GetGeofenceCollectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetGeofenceCollectionResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetGeofenceCollectionArgs.builder
      com.pulumi.aws.location.LocationFunctions.getGeofenceCollection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Location Service Geofence Collection. */
    inline def getGeofenceCollectionPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetGeofenceCollectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetGeofenceCollectionResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetGeofenceCollectionPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getGeofenceCollectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about a Location Service Map. */
    inline def getMap(args: Endofunction[com.pulumi.aws.location.inputs.GetMapArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetMapResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetMapArgs.builder
      com.pulumi.aws.location.LocationFunctions.getMap(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Location Service Map. */
    inline def getMapPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetMapPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetMapResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetMapPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getMapPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about a Location Service Place Index. */
    inline def getPlaceIndex(args: Endofunction[com.pulumi.aws.location.inputs.GetPlaceIndexArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetPlaceIndexResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetPlaceIndexArgs.builder
      com.pulumi.aws.location.LocationFunctions.getPlaceIndex(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Location Service Place Index. */
    inline def getPlaceIndexPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetPlaceIndexPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetPlaceIndexResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetPlaceIndexPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getPlaceIndexPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about a Location Service Route Calculator. */
    inline def getRouteCalculator(args: Endofunction[com.pulumi.aws.location.inputs.GetRouteCalculatorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetRouteCalculatorResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetRouteCalculatorArgs.builder
      com.pulumi.aws.location.LocationFunctions.getRouteCalculator(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Location Service Route Calculator. */
    inline def getRouteCalculatorPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetRouteCalculatorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetRouteCalculatorResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetRouteCalculatorPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getRouteCalculatorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about a Location Service Tracker. */
    inline def getTracker(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetTrackerResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTracker(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Location Service Tracker. */
    inline def getTrackerPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetTrackerResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about a Location Service Tracker Association. */
    inline def getTrackerAssociation(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetTrackerAssociationResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Location Service Tracker Association. */
    inline def getTrackerAssociationPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetTrackerAssociationResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about Location Service Tracker Associations. */
    inline def getTrackerAssociations(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetTrackerAssociationsResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationsArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about Location Service Tracker Associations. */
    inline def getTrackerAssociationsPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetTrackerAssociationsResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationsPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a Location Service Map. */
  def Map(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.MapArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.MapArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.location.Map(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Location Service Place Index. */
  def PlaceIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.PlaceIndexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.PlaceIndexArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.location.PlaceIndex(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Location Service Route Calculator. */
  def RouteCalculation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.RouteCalculationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.RouteCalculationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.location.RouteCalculation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Location Service Tracker. */
  def Tracker(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.TrackerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.TrackerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.location.Tracker(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Location Tracker Association. */
  def TrackerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.TrackerAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.location.TrackerAssociationArgs.builder
    com.pulumi.aws.location.TrackerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
