// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput {
    /**
     * @return The ARN of the destination delivery stream to write to.
     * 
     */
    private String resourceArn;

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput() {}
    /**
     * @return The ARN of the destination delivery stream to write to.
     * 
     */
    public String resourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceArn;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        @CustomType.Setter
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput build() {
            final var o = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput();
            o.resourceArn = resourceArn;
            return o;
        }
    }
}
