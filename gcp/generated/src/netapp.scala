package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object netapp:
  /**
   * ActiveDirectory is the public representation of the active directory config.
   * 
   * To get more information about ActiveDirectory, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.activeDirectories)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/active-directory/about-ad)
   */
  inline def ActiveDirectory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.ActiveDirectoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.ActiveDirectoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.ActiveDirectory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * NetApp Volumes supports volume backups, which are copies of your volumes
   * stored independently from the volume. Backups are stored in backup vaults,
   * which are containers for backups. If a volume is lost or deleted, you can
   * use backups to restore your data to a new volume.
   * 
   * When you create the first backup of a volume, all of the volume&#39;s used
   * data is sent to the backup vault. Subsequent backups of the same volume
   * only include data that has changed from the previous backup. This allows
   * for fast incremental-forever backups and reduces the required capacity
   * inside the backup vault.
   * 
   * You can create manual and scheduled backups. Manual backups can be taken
   * from a volume or from an existing volume snapshot. Scheduled backups
   * require a backup policy.
   * 
   * To get more information about Backup, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.backupVaults.backups)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/protect-data/about-volume-backups)
   */
  inline def Backup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.BackupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.BackupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.Backup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A backup policy is used to schedule backups at regular daily, weekly, or monthly intervals.
   * Backup policies allow you to attach a backup schedule to a volume.
   * The policy defines how many backups to retain at daily, weekly, or monthly intervals.
   * 
   * To get more information about BackupPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.backupPolicies)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/protect-data/about-volume-backups#about_backup_policies)
   */
  inline def BackupPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.BackupPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.BackupPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.BackupPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A backup vault is the location where backups are stored. You can only create one backup vault per region.
   * A vault can hold multiple backups for multiple volumes in that region.
   * 
   * To get more information about BackupVault, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.backupVaults)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/protect-data/about-volume-backups)
   */
  inline def BackupVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.BackupVaultArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.BackupVaultArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.BackupVault(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Hostgroups define the hosts (aka initiators) that can access the specific Google Cloud Netapp Volumes.
   * Hostgroup is a regional resource and independent of the volumes or any other resource
   * 
   * To get more information about HostGroup, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.hostGroups)
   * * How-to Guides
   *     * [Documentation](https://docs.cloud.google.com/netapp/volumes/docs/configure-and-use/host-groups/overview)
   */
  inline def HostGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.HostGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.HostGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.HostGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * NetApp Volumes always encrypts your data at rest using volume-specific keys.
   * 
   * A CMEK policy (customer-managed encryption key) warps such volume-specific keys in a key stored in Cloud Key Management Service (KMS).
   * 
   * To get more information about kmsconfig, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.kmsConfigs)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/cmek/cmek-overview)
   */
  inline def Kmsconfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.KmsconfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.KmsconfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.Kmsconfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Storage pools act as containers for volumes. All volumes in a storage pool share the following information:
   * * Location
   * * Service level
   * * Virtual Private Cloud (VPC) network
   * * Active Directory policy
   * * LDAP use for NFS volumes, if applicable
   * * Customer-managed encryption key (CMEK) policy
   * 
   * The capacity of the pool can be split up and assigned to volumes within the pool. Storage pools are a billable
   * component of NetApp Volumes. Billing is based on the location, service level, and capacity allocated to a pool
   * independent of consumption at the volume level.
   * 
   * Storage pools of service level Flex are available as zonal (single zone) or regional (two zones in same region) pools.
   * Zonal and regional pools are high-available within the zone. On top of that, regional pools have `replicaZone` as
   * hot standby zone. All volume access is served from the `zone`. If `zone` fails, `replicaZone`
   * automatically becomes the active zone. This will cause state drift in your configuration.
   * If a zone switch (manual or automatic) is triggered outside of Terraform, you need to adjust the `zone`
   * and `replicaZone` values to reflect the current state, or Terraform will initiate a zone switch when running
   * the next apply. You can trigger a manual
   * [zone switch](https://cloud.google.com/netapp/volumes/docs/configure-and-use/storage-pools/edit-or-delete-storage-pool#switch_active_and_replica_zones)
   * via Terraform by swapping the value of the `zone` and `replicaZone` parameters in your HCL code.
   * 
   * To get more information about StoragePool, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.storagePools)
   * * How-to Guides
   *     * [Quickstart documentation](https://cloud.google.com/netapp/volumes/docs/get-started/quickstarts/create-storage-pool)
   *     * [Regional Flex zone switch](https://cloud.google.com/netapp/volumes/docs/configure-and-use/storage-pools/edit-or-delete-storage-pool#switch_active_and_replica_zones)
   */
  inline def StoragePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.StoragePoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.StoragePoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.StoragePool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A volume is a file system container in a storage pool that stores application, database, and user data.
   * 
   * You can create a volume&#39;s capacity using the available capacity in the storage pool and you can define and resize the capacity without disruption to any processes.
   * 
   * Storage pool settings apply to the volumes contained within them automatically.
   * 
   * To get more information about Volume, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.volumes)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/volumes/overview)
   *     * [Quickstart](https://cloud.google.com/netapp/volumes/docs/get-started/quickstarts/create-volume)
   */
  inline def Volume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.VolumeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.VolumeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.Volume(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * QuotaRule specifies the maximum capacity a user or group can use within a volume. They can be used for creating default and individual quota rules.
   * 
   * To get more information about VolumeQuotaRule, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.volumes.quotaRules)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/volumes/overview#volume_user_and_group_quotas)
   */
  inline def VolumeQuotaRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.VolumeQuotaRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.VolumeQuotaRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.VolumeQuotaRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Volume replication creates an asynchronous mirror of a volume in a different location. This capability
   * lets you use the replicated volume for critical application activity in case of a location-wide outage
   * or disaster.
   * 
   * A new destination volume is created as part of the replication resource. It&#39;s content is updated on a
   * schedule with content of the source volume. It can be used as a read-only copy while the mirror is
   * enabled, or as an independent read-write volume while the mirror is stopped. A destination volume will
   * also contain the snapshots of the source volume. Resuming a mirror will overwrite all changes on the
   * destination volume with the content of the source volume. While is mirror is enabled, all configuration
   * changes done to source or destination volumes are automatically done to both. Please note that the
   * destination volume is not a resource managed by Terraform.
   * 
   * Reversing the replication direction is not supported through the provider.
   * 
   * To get more information about VolumeReplication, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.volumes.replications)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/protect-data/about-volume-replication)
   */
  inline def VolumeReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.VolumeReplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.VolumeReplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.VolumeReplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * NetApp Volumes helps you manage your data usage with snapshots that can quickly restore lost data.
   * Snapshots are point-in-time versions of your volume&#39;s content. They are resources of volumes and are
   * instant captures of your data that consume space only for modified data. Because data changes over
   * time, snapshots usually consume more space as they get older.
   * NetApp Volumes volumes use just-in-time copy-on-write so that unmodified files in snapshots don&#39;t
   * consume any of the volume&#39;s capacity.
   * 
   * To get more information about VolumeSnapshot, see:
   * 
   * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.volumes.snapshots)
   * * How-to Guides
   *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/volume-snapshots/overview)
   */
  inline def VolumeSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.netapp.VolumeSnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.netapp.VolumeSnapshotArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.netapp.VolumeSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
