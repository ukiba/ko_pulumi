package jp.ukiba.ko_pulumi
package gcp

object vpcaccess_ext:
  extension (builder: com.pulumi.gcp.vpcaccess.ConnectorArgs.Builder)
    /**
     * @param subnet The subnet in which to house the connector
     * Structure is documented below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.Builder]):
        com.pulumi.gcp.vpcaccess.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vpcaccess.inputs.ConnectorState.Builder)
    /**
     * @param subnet The subnet in which to house the connector
     * Structure is documented below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.Builder]):
        com.pulumi.gcp.vpcaccess.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)
