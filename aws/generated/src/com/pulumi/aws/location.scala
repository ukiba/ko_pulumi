package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object location:
  type LocationFunctions = com.pulumi.aws.location.LocationFunctions
  object LocationFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.location.LocationFunctions.*
  extension (self: LocationFunctions.type)
    /** Retrieve information about a Location Service Geofence Collection. */
    def getGeofenceCollection(args: Endofunction[com.pulumi.aws.location.inputs.GetGeofenceCollectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetGeofenceCollectionResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetGeofenceCollectionArgs.builder
      com.pulumi.aws.location.LocationFunctions.getGeofenceCollection(args(argsBuilder).build)

    /** Retrieve information about a Location Service Geofence Collection. */
    def getGeofenceCollectionPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetGeofenceCollectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetGeofenceCollectionResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetGeofenceCollectionPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getGeofenceCollectionPlain(args(argsBuilder).build)

    /** Retrieve information about a Location Service Map. */
    def getMap(args: Endofunction[com.pulumi.aws.location.inputs.GetMapArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetMapResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetMapArgs.builder
      com.pulumi.aws.location.LocationFunctions.getMap(args(argsBuilder).build)

    /** Retrieve information about a Location Service Map. */
    def getMapPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetMapPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetMapResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetMapPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getMapPlain(args(argsBuilder).build)

    /** Retrieve information about a Location Service Place Index. */
    def getPlaceIndex(args: Endofunction[com.pulumi.aws.location.inputs.GetPlaceIndexArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetPlaceIndexResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetPlaceIndexArgs.builder
      com.pulumi.aws.location.LocationFunctions.getPlaceIndex(args(argsBuilder).build)

    /** Retrieve information about a Location Service Place Index. */
    def getPlaceIndexPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetPlaceIndexPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetPlaceIndexResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetPlaceIndexPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getPlaceIndexPlain(args(argsBuilder).build)

    /** Retrieve information about a Location Service Route Calculator. */
    def getRouteCalculator(args: Endofunction[com.pulumi.aws.location.inputs.GetRouteCalculatorArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetRouteCalculatorResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetRouteCalculatorArgs.builder
      com.pulumi.aws.location.LocationFunctions.getRouteCalculator(args(argsBuilder).build)

    /** Retrieve information about a Location Service Route Calculator. */
    def getRouteCalculatorPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetRouteCalculatorPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetRouteCalculatorResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetRouteCalculatorPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getRouteCalculatorPlain(args(argsBuilder).build)

    /** Retrieve information about a Location Service Tracker. */
    def getTracker(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetTrackerResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTracker(args(argsBuilder).build)

    /** Retrieve information about a Location Service Tracker. */
    def getTrackerPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetTrackerResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerPlain(args(argsBuilder).build)

    /** Retrieve information about a Location Service Tracker Association. */
    def getTrackerAssociation(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetTrackerAssociationResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociation(args(argsBuilder).build)

    /** Retrieve information about a Location Service Tracker Association. */
    def getTrackerAssociationPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetTrackerAssociationResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociationPlain(args(argsBuilder).build)

    /** Retrieve information about Location Service Tracker Associations. */
    def getTrackerAssociations(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.location.outputs.GetTrackerAssociationsResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationsArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociations(args(argsBuilder).build)

    /** Retrieve information about Location Service Tracker Associations. */
    def getTrackerAssociationsPlain(args: Endofunction[com.pulumi.aws.location.inputs.GetTrackerAssociationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.location.outputs.GetTrackerAssociationsResult] =
      val argsBuilder = com.pulumi.aws.location.inputs.GetTrackerAssociationsPlainArgs.builder
      com.pulumi.aws.location.LocationFunctions.getTrackerAssociationsPlain(args(argsBuilder).build)

  /** Provides a Location Service Map. */
  def Map(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.MapArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.MapArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.location.Map(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Location Geofence Collection. */
  def GeofenceCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.GeofenceCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.GeofenceCollectionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.location.GeofenceCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.location.PlaceIndexArgs.Builder)
    /**
     * @param dataSourceConfiguration Configuration block with the data storage option chosen for requesting Places. Detailed below.
     * @return builder
     */
    def dataSourceConfiguration(args: Endofunction[com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.location.PlaceIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.builder
      builder.dataSourceConfiguration(args(argsBuilder).build)

  /** Resource for managing an AWS Location Tracker Association. */
  def TrackerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.TrackerAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.location.TrackerAssociationArgs.builder
    
    com.pulumi.aws.location.TrackerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Location Service Route Calculator. */
  def RouteCalculation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.RouteCalculationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.RouteCalculationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.location.RouteCalculation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.location.MapArgs.Builder)
    /**
     * @param configuration Configuration block with the map style selected from an available data provider. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.location.inputs.MapConfigurationArgs.Builder]):
        com.pulumi.aws.location.MapArgs.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.MapConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  /** Provides a Location Service Tracker. */
  def Tracker(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.TrackerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.TrackerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.location.Tracker(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Location Service Place Index. */
  def PlaceIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.location.PlaceIndexArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.location.PlaceIndexArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.location.PlaceIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.location.inputs.PlaceIndexState.Builder)
    /**
     * @param dataSourceConfiguration Configuration block with the data storage option chosen for requesting Places. Detailed below.
     * @return builder
     */
    def dataSourceConfiguration(args: Endofunction[com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.location.inputs.PlaceIndexState.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.PlaceIndexDataSourceConfigurationArgs.builder
      builder.dataSourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.location.inputs.MapState.Builder)
    /**
     * @param configuration Configuration block with the map style selected from an available data provider. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.location.inputs.MapConfigurationArgs.Builder]):
        com.pulumi.aws.location.inputs.MapState.Builder =
      val argsBuilder = com.pulumi.aws.location.inputs.MapConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)
