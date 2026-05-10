package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object oslogin:
  /**
   * The SSH public key information associated with a Google account.
   * 
   *  To get more information about SSHPublicKey, see:
   * 
   *  * [API documentation](https://cloud.google.com/compute/docs/oslogin/rest/v1/users.sshPublicKeys)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/compute/docs/oslogin)
   */
  def SshPublicKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oslogin.SshPublicKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oslogin.SshPublicKeyArgs.builder
    com.pulumi.gcp.oslogin.SshPublicKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
