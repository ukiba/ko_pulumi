package jp.ukiba.ko_pulumi
package gcp


object accessapproval:
  object AccessapprovalFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get the email address of a folder&#39;s Access Approval service account.
     * 
     *  Each Google Cloud folder has a unique service account used by Access Approval.
     *  When using Access Approval with a
     *  [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
     *  this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
     *  Cloud KMS key used to sign approvals.
     */
    inline def getFolderServiceAccount(args: Endofunction[com.pulumi.gcp.accessapproval.inputs.GetFolderServiceAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accessapproval.outputs.GetFolderServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.accessapproval.inputs.GetFolderServiceAccountArgs.builder
      com.pulumi.gcp.accessapproval.AccessapprovalFunctions.getFolderServiceAccount(args(argsBuilder).build)

    /**
     * Get the email address of a folder&#39;s Access Approval service account.
     * 
     *  Each Google Cloud folder has a unique service account used by Access Approval.
     *  When using Access Approval with a
     *  [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
     *  this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
     *  Cloud KMS key used to sign approvals.
     */
    inline def getFolderServiceAccountPlain(args: Endofunction[com.pulumi.gcp.accessapproval.inputs.GetFolderServiceAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accessapproval.outputs.GetFolderServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.accessapproval.inputs.GetFolderServiceAccountPlainArgs.builder
      com.pulumi.gcp.accessapproval.AccessapprovalFunctions.getFolderServiceAccountPlain(args(argsBuilder).build)

    /**
     * Get the email address of an organization&#39;s Access Approval service account.
     * 
     *  Each Google Cloud organization has a unique service account used by Access Approval.
     *  When using Access Approval with a
     *  [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
     *  this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
     *  Cloud KMS key used to sign approvals.
     */
    inline def getOrganizationServiceAccount(args: Endofunction[com.pulumi.gcp.accessapproval.inputs.GetOrganizationServiceAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accessapproval.outputs.GetOrganizationServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.accessapproval.inputs.GetOrganizationServiceAccountArgs.builder
      com.pulumi.gcp.accessapproval.AccessapprovalFunctions.getOrganizationServiceAccount(args(argsBuilder).build)

    /**
     * Get the email address of an organization&#39;s Access Approval service account.
     * 
     *  Each Google Cloud organization has a unique service account used by Access Approval.
     *  When using Access Approval with a
     *  [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
     *  this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
     *  Cloud KMS key used to sign approvals.
     */
    inline def getOrganizationServiceAccountPlain(args: Endofunction[com.pulumi.gcp.accessapproval.inputs.GetOrganizationServiceAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accessapproval.outputs.GetOrganizationServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.accessapproval.inputs.GetOrganizationServiceAccountPlainArgs.builder
      com.pulumi.gcp.accessapproval.AccessapprovalFunctions.getOrganizationServiceAccountPlain(args(argsBuilder).build)

    /**
     * Get the email address of a project&#39;s Access Approval service account.
     * 
     *  Each Google Cloud project has a unique service account used by Access Approval.
     *  When using Access Approval with a
     *  [custom signing key](https://docs.cloud.google.com/assured-workloads/access-approval/docs/review-approve-access-requests-custom-keys),
     *  this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
     *  Cloud KMS key used to sign approvals.
     */
    inline def getProjectServiceAccount(args: Endofunction[com.pulumi.gcp.accessapproval.inputs.GetProjectServiceAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accessapproval.outputs.GetProjectServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.accessapproval.inputs.GetProjectServiceAccountArgs.builder
      com.pulumi.gcp.accessapproval.AccessapprovalFunctions.getProjectServiceAccount(args(argsBuilder).build)

    /**
     * Get the email address of a project&#39;s Access Approval service account.
     * 
     *  Each Google Cloud project has a unique service account used by Access Approval.
     *  When using Access Approval with a
     *  [custom signing key](https://docs.cloud.google.com/assured-workloads/access-approval/docs/review-approve-access-requests-custom-keys),
     *  this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
     *  Cloud KMS key used to sign approvals.
     */
    inline def getProjectServiceAccountPlain(args: Endofunction[com.pulumi.gcp.accessapproval.inputs.GetProjectServiceAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accessapproval.outputs.GetProjectServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.accessapproval.inputs.GetProjectServiceAccountPlainArgs.builder
      com.pulumi.gcp.accessapproval.AccessapprovalFunctions.getProjectServiceAccountPlain(args(argsBuilder).build)
