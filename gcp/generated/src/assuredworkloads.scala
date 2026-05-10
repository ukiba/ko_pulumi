package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object assuredworkloads:
  /** The AssuredWorkloads Workload resource */
  def Workload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.assuredworkloads.WorkloadArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.assuredworkloads.WorkloadArgs.builder
    com.pulumi.gcp.assuredworkloads.Workload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.assuredworkloads.WorkloadArgs.Builder)
    /**
     * @param kmsSettings **DEPRECATED** Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * @return builder
     */
    def kmsSettings(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsArgs.Builder]):
        com.pulumi.gcp.assuredworkloads.WorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsArgs.builder
      builder.kmsSettings(args(argsBuilder).build)

    /**
     * @param partnerPermissions Optional. Permissions granted to the AW Partner SA account for the customer workload
     * @return builder
     */
    def partnerPermissions(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadPartnerPermissionsArgs.Builder]):
        com.pulumi.gcp.assuredworkloads.WorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadPartnerPermissionsArgs.builder
      builder.partnerPermissions(args(argsBuilder).build)

    /**
     * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * @return builder
     */
    def resourceSettings(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingArgs.Builder]*):
        com.pulumi.gcp.assuredworkloads.WorkloadArgs.Builder =
      def argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingArgs.builder
      builder.resourceSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param workloadOptions Optional. Used to specify certain options for a workload during workload creation - currently only supporting KAT Optionality for Regional Controls workloads.
     * @return builder
     */
    def workloadOptions(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadWorkloadOptionsArgs.Builder]):
        com.pulumi.gcp.assuredworkloads.WorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadWorkloadOptionsArgs.builder
      builder.workloadOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder)
    /**
     * @param complianceStatuses Output only. Count of active Violations in the Workload.
     * @return builder
     */
    def complianceStatuses(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadComplianceStatusArgs.Builder]*):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadComplianceStatusArgs.builder
      builder.complianceStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param ekmProvisioningResponses Optional. Represents the Ekm Provisioning State of the given workload.
     * @return builder
     */
    def ekmProvisioningResponses(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadEkmProvisioningResponseArgs.Builder]*):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadEkmProvisioningResponseArgs.builder
      builder.ekmProvisioningResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param kmsSettings **DEPRECATED** Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * @return builder
     */
    def kmsSettings(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsArgs.Builder]):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsArgs.builder
      builder.kmsSettings(args(argsBuilder).build)

    /**
     * @param partnerPermissions Optional. Permissions granted to the AW Partner SA account for the customer workload
     * @return builder
     */
    def partnerPermissions(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadPartnerPermissionsArgs.Builder]):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadPartnerPermissionsArgs.builder
      builder.partnerPermissions(args(argsBuilder).build)

    /**
     * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * @return builder
     */
    def resourceSettings(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingArgs.Builder]*):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingArgs.builder
      builder.resourceSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Output only. The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation will fail. Always read only.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceArgs.Builder]*):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

    /**
     * @param saaEnrollmentResponses Output only. Represents the SAA enrollment response of the given workload. SAA enrollment response is queried during workloads.get call. In failure cases, user friendly error message is shown in SAA details page.
     * @return builder
     */
    def saaEnrollmentResponses(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadSaaEnrollmentResponseArgs.Builder]*):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadSaaEnrollmentResponseArgs.builder
      builder.saaEnrollmentResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param workloadOptions Optional. Used to specify certain options for a workload during workload creation - currently only supporting KAT Optionality for Regional Controls workloads.
     * @return builder
     */
    def workloadOptions(args: Endofunction[com.pulumi.gcp.assuredworkloads.inputs.WorkloadWorkloadOptionsArgs.Builder]):
        com.pulumi.gcp.assuredworkloads.inputs.WorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.assuredworkloads.inputs.WorkloadWorkloadOptionsArgs.builder
      builder.workloadOptions(args(argsBuilder).build)
