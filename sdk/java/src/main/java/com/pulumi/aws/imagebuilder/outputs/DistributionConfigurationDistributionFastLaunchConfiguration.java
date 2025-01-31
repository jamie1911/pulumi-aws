// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate;
import com.pulumi.aws.imagebuilder.outputs.DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionConfigurationDistributionFastLaunchConfiguration {
    /**
     * @return The account ID that this configuration applies to.
     * 
     */
    private String accountId;
    /**
     * @return A Boolean that represents the current state of faster launching for the Windows AMI. Set to `true` to start using Windows faster launching, or `false` to stop using it.
     * 
     */
    private Boolean enabled;
    /**
     * @return Configuration block for the launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create pre-provisioned snapshots. Detailed below.
     * 
     */
    private @Nullable DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate launchTemplate;
    /**
     * @return The maximum number of parallel instances that are launched for creating resources.
     * 
     */
    private @Nullable Integer maxParallelLaunches;
    /**
     * @return Configuration block for managing the number of snapshots that are created from pre-provisioned instances for the Windows AMI when faster launching is enabled. Detailed below.
     * 
     */
    private @Nullable DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfiguration snapshotConfiguration;

    private DistributionConfigurationDistributionFastLaunchConfiguration() {}
    /**
     * @return The account ID that this configuration applies to.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return A Boolean that represents the current state of faster launching for the Windows AMI. Set to `true` to start using Windows faster launching, or `false` to stop using it.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Configuration block for the launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create pre-provisioned snapshots. Detailed below.
     * 
     */
    public Optional<DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate> launchTemplate() {
        return Optional.ofNullable(this.launchTemplate);
    }
    /**
     * @return The maximum number of parallel instances that are launched for creating resources.
     * 
     */
    public Optional<Integer> maxParallelLaunches() {
        return Optional.ofNullable(this.maxParallelLaunches);
    }
    /**
     * @return Configuration block for managing the number of snapshots that are created from pre-provisioned instances for the Windows AMI when faster launching is enabled. Detailed below.
     * 
     */
    public Optional<DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfiguration> snapshotConfiguration() {
        return Optional.ofNullable(this.snapshotConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionFastLaunchConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private Boolean enabled;
        private @Nullable DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate launchTemplate;
        private @Nullable Integer maxParallelLaunches;
        private @Nullable DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfiguration snapshotConfiguration;
        public Builder() {}
        public Builder(DistributionConfigurationDistributionFastLaunchConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.enabled = defaults.enabled;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.maxParallelLaunches = defaults.maxParallelLaunches;
    	      this.snapshotConfiguration = defaults.snapshotConfiguration;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplate(@Nullable DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder maxParallelLaunches(@Nullable Integer maxParallelLaunches) {
            this.maxParallelLaunches = maxParallelLaunches;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotConfiguration(@Nullable DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfiguration snapshotConfiguration) {
            this.snapshotConfiguration = snapshotConfiguration;
            return this;
        }
        public DistributionConfigurationDistributionFastLaunchConfiguration build() {
            final var o = new DistributionConfigurationDistributionFastLaunchConfiguration();
            o.accountId = accountId;
            o.enabled = enabled;
            o.launchTemplate = launchTemplate;
            o.maxParallelLaunches = maxParallelLaunches;
            o.snapshotConfiguration = snapshotConfiguration;
            return o;
        }
    }
}
