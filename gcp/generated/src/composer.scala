package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object composer:
  object ComposerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Provides access to Managed Airflow environment configuration in a region for a
     * given project.
     * 
     * To get more information about Managed Airflow Environment, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/composer/docs/latest/composer-overview)
     */
    inline def getEnvironment(args: Endofunction[com.pulumi.gcp.composer.inputs.GetEnvironmentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetEnvironmentArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getEnvironment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to Managed Airflow environment configuration in a region for a
     * given project.
     * 
     * To get more information about Managed Airflow Environment, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/composer/docs/latest/composer-overview)
     */
    inline def getEnvironmentPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetEnvironmentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetEnvironmentPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getEnvironmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides access to available Managed Airflow versions in a region for a given project.
     * 
     * To get more information about Managed Airflow image versions, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.imageVersions)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/composer/docs/composer-versions)
     */
    inline def getImageVersions(args: Endofunction[com.pulumi.gcp.composer.inputs.GetImageVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetImageVersionsResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetImageVersionsArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getImageVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to available Managed Airflow versions in a region for a given project.
     * 
     * To get more information about Managed Airflow image versions, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.imageVersions)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/composer/docs/composer-versions)
     */
    inline def getImageVersionsPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetImageVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetImageVersionsResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetImageVersionsPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getImageVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides access to Kubernetes ConfigMap configuration for a given project, region and Managed Airflow Environment.
     * 
     * To get more information about Managed Airflow User Workloads Config Map, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsConfigMaps)
     * * How-to Guides
     *     * [Official Documentation](https://clouddocs.devsite.corp.google.com/composer/docs/composer-3/use-kubernetes-pod-operator#secret-config)
     */
    inline def getUserWorkloadsConfigMap(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetUserWorkloadsConfigMapResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsConfigMap(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to Kubernetes ConfigMap configuration for a given project, region and Managed Airflow Environment.
     * 
     * To get more information about Managed Airflow User Workloads Config Map, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsConfigMaps)
     * * How-to Guides
     *     * [Official Documentation](https://clouddocs.devsite.corp.google.com/composer/docs/composer-3/use-kubernetes-pod-operator#secret-config)
     */
    inline def getUserWorkloadsConfigMapPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetUserWorkloadsConfigMapResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsConfigMapPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsConfigMapPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides access to Kubernetes Secret configuration for a given project, region
     * and Managed Airflow Environment.
     * 
     * To get more information about Managed Airflow User Workloads Secrets, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsSecrets)
     * * How-to Guides
     *     * [Official Documentation](https://clouddocs.devsite.corp.google.com/composer/docs/composer-3/use-kubernetes-pod-operator#secret-config)
     */
    inline def getUserWorkloadsSecret(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.composer.outputs.GetUserWorkloadsSecretResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsSecret(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to Kubernetes Secret configuration for a given project, region
     * and Managed Airflow Environment.
     * 
     * To get more information about Managed Airflow User Workloads Secrets, see:
     * 
     * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsSecrets)
     * * How-to Guides
     *     * [Official Documentation](https://clouddocs.devsite.corp.google.com/composer/docs/composer-3/use-kubernetes-pod-operator#secret-config)
     */
    inline def getUserWorkloadsSecretPlain(args: Endofunction[com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.composer.outputs.GetUserWorkloadsSecretResult] =
      val argsBuilder = com.pulumi.gcp.composer.inputs.GetUserWorkloadsSecretPlainArgs.builder
      com.pulumi.gcp.composer.ComposerFunctions.getUserWorkloadsSecretPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * An environment for running orchestration tasks.
   * 
   * Environments run Apache Airflow software on Google infrastructure.
   * 
   * To get more information about Environments, see:
   * 
   * * [Managed Service for Apache Airflow documentation](https://docs.cloud.google.com/composer/docs)
   * * [Managed Airflow API documentation](https://docs.cloud.google.com/composer/docs/reference/rest/v1beta1/projects.locations.environments)
   * * How-to Guides for Managed Airflow (Gen 3)
   *   * [Creating environments](https://docs.cloud.google.com/composer/docs/composer-3/create-environments)
   *   * [Scaling environments](https://docs.cloud.google.com/composer/docs/composer-3/scale-environments)
   *   * [Change environment networking type (Private or Public IP)](https://docs.cloud.google.com/composer/docs/composer-3/change-networking-type)
   *   * [Connect an environment to a VPC network](https://docs.cloud.google.com/composer/docs/composer-3/connect-vpc-network)
   * * How-to Guides for Managed Airflow (Gen 2)
   *   * [Creating environments](https://docs.cloud.google.com/composer/docs/composer-2/create-environments)
   *   * [Scaling environments](https://docs.cloud.google.com/composer/docs/composer-2/scale-environments)
   *   * [Configuring Shared VPC](https://docs.cloud.google.com/composer/docs/composer-2/configure-shared-vpc)
   * * [Apache Airflow Documentation](http://airflow.apache.org/)
   * 
   * &gt; **Note**
   *   Managed Airflow (Legacy Gen 1) is in the post-maintenance mode. Google
   *   doesn&#39;t release any further updates to Managed Service for
   *   Managed Airflow (Legacy Gen 1), including new versions of Airflow, bugfixes,
   *   and security updates. We recommend using Managed Airflow (Gen 3) or
   *   Managed Airflow (Gen 2) instead.
   * 
   * Several special considerations apply to using Terraform with
   * Managed Service for Apache Airflow:
   * 
   * * The Environment resource is based on several layers of Google Cloud
   *     infrastructure. Terraform doesn&#39;t manage these underlying resources. For
   *     example, in Managed Airflow (Gen 2), this includes a Google Kubernetes
   *     Engine cluster, Cloud Storage, and Compute networking resources.
   * * Creating or updating an environment usually takes around 25 minutes.
   * * In some cases, errors in the configuration are detected and reported only
   *     during the process of environment creation. If you encounter such
   *     errors, please verify that your configuration is valid for the Managed
   *     Airflow environment you are creating before filing bugs for the Terraform
   *     provider.
   * * **Environments have Google Cloud Storage buckets that are not automatically
   *     deleted** with the environment.
   *     See [Delete environments](https://docs.cloud.google.com/composer/docs/composer-3/delete-environments)
   *     for more information.
   * * See
   *     [Troubleshooting pages](https://docs.cloud.google.com/composer/docs/composer-3/troubleshooting-environment-creation)
   *     if you encounter problems.
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.composer.EnvironmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.composer.EnvironmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.composer.Environment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * User workloads ConfigMap used by Airflow tasks that run with Kubernetes Executor or KubernetesPodOperator.
   * Intended for Composer 3 Environments.
   * 
   * To get more information about UserWorkloadsConfigMap, see:
   * 
   * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments.userWorkloadsConfigMaps)
   */
  def UserWorkloadsConfigMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.composer.UserWorkloadsConfigMapArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.composer.UserWorkloadsConfigMapArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.composer.UserWorkloadsConfigMap(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * User workloads Secret used by Airflow tasks that run with Kubernetes Executor
   * or KubernetesPodOperator. Intended for Managed Airflow (Gen 3) Environments.
   */
  def UserWorkloadsSecret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.composer.UserWorkloadsSecretArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.composer.UserWorkloadsSecretArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.composer.UserWorkloadsSecret(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
