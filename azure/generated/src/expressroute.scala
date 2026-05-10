package jp.ukiba.ko_pulumi
package azure


object expressroute:
  type ExpressrouteFunctions = com.pulumi.azure.expressroute.ExpressrouteFunctions
  object ExpressrouteFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.expressroute.ExpressrouteFunctions.*
  extension (self: ExpressrouteFunctions.type)
    /** Use this data source to access information about an existing ExpressRoute Circuit Peering. */
    def getCircuitPeering(args: Endofunction[com.pulumi.azure.expressroute.inputs.GetCircuitPeeringArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.expressroute.outputs.GetCircuitPeeringResult] =
      val argsBuilder = com.pulumi.azure.expressroute.inputs.GetCircuitPeeringArgs.builder
      com.pulumi.azure.expressroute.ExpressrouteFunctions.getCircuitPeering(args(argsBuilder).build)

    /** Use this data source to access information about an existing ExpressRoute Circuit Peering. */
    def getCircuitPeeringPlain(args: Endofunction[com.pulumi.azure.expressroute.inputs.GetCircuitPeeringPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.expressroute.outputs.GetCircuitPeeringResult] =
      val argsBuilder = com.pulumi.azure.expressroute.inputs.GetCircuitPeeringPlainArgs.builder
      com.pulumi.azure.expressroute.ExpressrouteFunctions.getCircuitPeeringPlain(args(argsBuilder).build)
