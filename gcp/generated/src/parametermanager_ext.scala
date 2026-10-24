package jp.ukiba.ko_pulumi
package gcp

object parametermanager_ext:
  extension (builder: com.pulumi.gcp.parametermanager.inputs.ParameterState.Builder)
    /**
     * @param policyMembers Policy member strings of a Google Cloud resource.
     * Structure is documented below.
     * @return builder
     */
    inline def policyMembers(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.ParameterPolicyMemberArgs.Builder]*):
        com.pulumi.gcp.parametermanager.inputs.ParameterState.Builder =
      def argsBuilder = com.pulumi.gcp.parametermanager.inputs.ParameterPolicyMemberArgs.builder
      builder.policyMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.parametermanager.inputs.RegionalParameterState.Builder)
    /**
     * @param policyMembers An object containing a unique resource identity tied to the regional parameter.
     * Structure is documented below.
     * @return builder
     */
    inline def policyMembers(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.RegionalParameterPolicyMemberArgs.Builder]*):
        com.pulumi.gcp.parametermanager.inputs.RegionalParameterState.Builder =
      def argsBuilder = com.pulumi.gcp.parametermanager.inputs.RegionalParameterPolicyMemberArgs.builder
      builder.policyMembers(args.map(_(argsBuilder).build)*)
