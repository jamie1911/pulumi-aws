// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventTargetKinesisTarget {
    /**
     * @return The JSON path to be extracted from the event and used as the partition key.
     * 
     */
    private @Nullable String partitionKeyPath;

    private EventTargetKinesisTarget() {}
    /**
     * @return The JSON path to be extracted from the event and used as the partition key.
     * 
     */
    public Optional<String> partitionKeyPath() {
        return Optional.ofNullable(this.partitionKeyPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetKinesisTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String partitionKeyPath;
        public Builder() {}
        public Builder(EventTargetKinesisTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKeyPath = defaults.partitionKeyPath;
        }

        @CustomType.Setter
        public Builder partitionKeyPath(@Nullable String partitionKeyPath) {
            this.partitionKeyPath = partitionKeyPath;
            return this;
        }
        public EventTargetKinesisTarget build() {
            final var o = new EventTargetKinesisTarget();
            o.partitionKeyPath = partitionKeyPath;
            return o;
        }
    }
}
