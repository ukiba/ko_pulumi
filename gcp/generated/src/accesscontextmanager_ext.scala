package jp.ukiba.ko_pulumi
package gcp

object accesscontextmanager_ext:
  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder)
    /**
     * @param basic A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * @return builder
     */
    inline def basic(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * @return builder
     */
    inline def custom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.builder
      builder.custom(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * @return builder
     */
    inline def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.Builder)
    /**
     * @param accessLevels The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * @return builder
     */
    inline def accessLevels(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.builder
      builder.accessLevels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder)
    /**
     * @param principal Optional. Immutable. The principal that is subject to the access policies in this policy binding.
     * Structure is documented below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingPrincipalArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

    /**
     * @param scopedAccessSettings Optional. A list of scoped access settings that set this binding&#39;s restrictions on a subset of applications.
     * Structure is documented below.
     * @return builder
     */
    inline def scopedAccessSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.builder
      builder.scopedAccessSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param sessionSettings Optional. The Google Cloud session length (GCSL) policy for the group key.
     * Structure is documented below.
     * @return builder
     */
    inline def sessionSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.builder
      builder.sessionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder)
    /**
     * @param spec Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * @return builder
     */
    inline def spec(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param status ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * @return builder
     */
    inline def status(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.Builder)
    /**
     * @param servicePerimeters The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
     * Structure is documented below.
     * @return builder
     */
    inline def servicePerimeters(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.builder
      builder.servicePerimeters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder)
    /**
     * @param conditions A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * @return builder
     */
    inline def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.Builder)
    /**
     * @param osConstraints A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * @return builder
     */
    inline def osConstraints(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyOsConstraintArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyOsConstraintArgs.builder
      builder.osConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.Builder)
    /**
     * @param vpcSubnetwork Sub networks within a VPC network.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcSubnetwork(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.builder
      builder.vpcSubnetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder)
    /**
     * @param osConstraints A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * @return builder
     */
    inline def osConstraints(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyOsConstraintArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyOsConstraintArgs.builder
      builder.osConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * @return builder
     */
    inline def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder)
    /**
     * @param vpcSubnetwork Sub networks within a VPC network.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcSubnetwork(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceVpcSubnetworkArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceVpcSubnetworkArgs.builder
      builder.vpcSubnetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder)
    /**
     * @param expr Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * @return builder
     */
    inline def expr(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomExprArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomExprArgs.builder
      builder.expr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState.Builder)
    /**
     * @param basic A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * @return builder
     */
    inline def basic(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * @return builder
     */
    inline def custom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.builder
      builder.custom(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder)
    /**
     * @param basic A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * @return builder
     */
    inline def basic(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * @return builder
     */
    inline def custom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.builder
      builder.custom(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.Builder)
    /**
     * @param conditions A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * @return builder
     */
    inline def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.Builder)
    /**
     * @param osConstraints A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * @return builder
     */
    inline def osConstraints(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs.builder
      builder.osConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.Builder)
    /**
     * @param vpcSubnetwork Sub networks within a VPC network.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcSubnetwork(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.builder
      builder.vpcSubnetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.Builder)
    /**
     * @param expr Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * @return builder
     */
    inline def expr(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomExprArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomExprArgs.builder
      builder.expr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsState.Builder)
    /**
     * @param accessLevels The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * @return builder
     */
    inline def accessLevels(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.builder
      builder.accessLevels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.Builder)
    /**
     * @param sessionSettings Optional. Session settings applied to user access on a given AccessScope.
     * Structure is documented below.
     * @return builder
     */
    inline def sessionSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettingsArgs.builder
      builder.sessionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder)
    /**
     * @param activeSettings Optional. Access settings for this scoped access settings. This field may be empty if `dryRunSettings` is set.
     * Structure is documented below.
     * @return builder
     */
    inline def activeSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.builder
      builder.activeSettings(args(argsBuilder).build)

    /**
     * @param dryRunSettings Optional. Dry-run access settings for this scoped access settings. This field may be empty if `activeSettings` is set. Cannot contain session settings.
     * Structure is documented below.
     * @return builder
     */
    inline def dryRunSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs.builder
      builder.dryRunSettings(args(argsBuilder).build)

    /**
     * @param scope Optional. Application, etc. to which the access settings will be applied to. Implicitly, this is the scoped access settings key; as such, it must be unique and non-empty.
     * Structure is documented below.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.Builder)
    /**
     * @param clientScope Optional. Client scope for this access scope.
     * Structure is documented below.
     * @return builder
     */
    inline def clientScope(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.builder
      builder.clientScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.Builder)
    /**
     * @param restrictedClientApplication Optional. The application that is subject to this binding&#39;s scope. Only one of clientId or name should be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def restrictedClientApplication(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationArgs.builder
      builder.restrictedClientApplication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState.Builder)
    /**
     * @param principal Optional. Immutable. The principal that is subject to the access policies in this policy binding.
     * Structure is documented below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingPrincipalArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

    /**
     * @param scopedAccessSettings Optional. A list of scoped access settings that set this binding&#39;s restrictions on a subset of applications.
     * Structure is documented below.
     * @return builder
     */
    inline def scopedAccessSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.builder
      builder.scopedAccessSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param sessionSettings Optional. The Google Cloud session length (GCSL) policy for the group key.
     * Structure is documented below.
     * @return builder
     */
    inline def sessionSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.builder
      builder.sessionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyState.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong to
     * the service specified by serviceName field. A single `MethodSelector` entry
     * with `*` specified for the method field will allow all methods AND
     * permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyState.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyState.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong to
     * the service specified by serviceName field. A single `MethodSelector` entry
     * with `*` specified for the method field will allow all methods AND
     * permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyState.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.Builder)
    /**
     * @param modifiers Modifiers to apply to the requests that match the URL pattern.
     * Structure is documented below.
     * @return builder
     */
    inline def modifiers(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.builder
      builder.modifiers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder)
    /**
     * @param addRequestHeader Adds additional HTTP request headers.
     * Structure is documented below.
     * @return builder
     */
    inline def addRequestHeader(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.builder
      builder.addRequestHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesArgs.Builder)
    /**
     * @param allowedServicePatterns Specifies which Google services are allowed to be accessed from
     * VPC networks in the service perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedServicePatterns(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.builder
      builder.allowedServicePatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterState.Builder)
    /**
     * @param spec Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * @return builder
     */
    inline def spec(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param status ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * @return builder
     */
    inline def status(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.Builder)
    /**
     * @param modifiers Modifiers to apply to the requests that match the URL pattern.
     * Structure is documented below.
     * @return builder
     */
    inline def modifiers(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.builder
      builder.modifiers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder)
    /**
     * @param addRequestHeader Adds additional HTTP request headers.
     * Structure is documented below.
     * @return builder
     */
    inline def addRequestHeader(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.builder
      builder.addRequestHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesArgs.Builder)
    /**
     * @param allowedServicePatterns Specifies which Google services are allowed to be accessed from
     * VPC networks in the service perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedServicePatterns(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.builder
      builder.allowedServicePatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder)
    /**
     * @param spec Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * @return builder
     */
    inline def spec(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param status ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * @return builder
     */
    inline def status(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.Builder)
    /**
     * @param modifiers Modifiers to apply to the requests that match the URL pattern.
     * Structure is documented below.
     * @return builder
     */
    inline def modifiers(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.builder
      builder.modifiers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder)
    /**
     * @param addRequestHeader Adds additional HTTP request headers.
     * Structure is documented below.
     * @return builder
     */
    inline def addRequestHeader(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.builder
      builder.addRequestHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs.Builder)
    /**
     * @param allowedServicePatterns Specifies which Google services are allowed to be accessed from
     * VPC networks in the service perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedServicePatterns(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesAllowedServicePatternArgs.builder
      builder.allowedServicePatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder)
    /**
     * @param pscEndpoint A Private Service Connect endpoint that is allowed to access data outside the perimeter.
     * The Private Service Connect endpoint may be in any organization, not just the organization that the perimeter is defined in.
     * Structure is documented below.
     * @return builder
     */
    inline def pscEndpoint(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourcePscEndpointArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourcePscEndpointArgs.builder
      builder.pscEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * @return builder
     */
    inline def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.Builder)
    /**
     * @param modifiers Modifiers to apply to the requests that match the URL pattern.
     * Structure is documented below.
     * @return builder
     */
    inline def modifiers(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.builder
      builder.modifiers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder)
    /**
     * @param addRequestHeader Adds additional HTTP request headers.
     * Structure is documented below.
     * @return builder
     */
    inline def addRequestHeader(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternModifierAddRequestHeaderArgs.builder
      builder.addRequestHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs.Builder)
    /**
     * @param allowedServicePatterns Specifies which Google services are allowed to be accessed from
     * VPC networks in the service perimeter.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedServicePatterns(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesAllowedServicePatternArgs.builder
      builder.allowedServicePatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersState.Builder)
    /**
     * @param servicePerimeters The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
     * Structure is documented below.
     * @return builder
     */
    inline def servicePerimeters(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.builder
      builder.servicePerimeters(args.map(_(argsBuilder).build)*)
