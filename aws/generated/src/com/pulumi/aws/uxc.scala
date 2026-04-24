package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object uxc:
  /**
   * Manages UXC Account Customizations for an AWS Account. This resource controls the console experience for the account, including the account color and which AWS regions and services are visible in the AWS Management Console.
   *  
   *  &gt; **Note:** There is only a single set of account customizations per AWS account.
   *  
   *  &gt; **Note:** This resource operates globally and always targets the `us-east-1` region regardless of the provider region configuration.
   *  
   *  &gt; **Note:** The UXC API does not provide a delete operation. Destroying this resource resets all customizations to their defaults: `accountColor` is set to `none`, and both `visibleRegions` and `visibleServices` are cleared to allow all regions and services.
   */
  def AccountCustomizations(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.uxc.AccountCustomizationsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.uxc.AccountCustomizationsArgs.builder
    
    com.pulumi.aws.uxc.AccountCustomizations(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
