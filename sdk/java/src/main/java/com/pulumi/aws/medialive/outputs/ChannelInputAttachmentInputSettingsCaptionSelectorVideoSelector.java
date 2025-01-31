// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector {
    private @Nullable String colorSpace;
    private @Nullable String colorSpaceUsage;

    private ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector() {}
    public Optional<String> colorSpace() {
        return Optional.ofNullable(this.colorSpace);
    }
    public Optional<String> colorSpaceUsage() {
        return Optional.ofNullable(this.colorSpaceUsage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String colorSpace;
        private @Nullable String colorSpaceUsage;
        public Builder() {}
        public Builder(ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorSpace = defaults.colorSpace;
    	      this.colorSpaceUsage = defaults.colorSpaceUsage;
        }

        @CustomType.Setter
        public Builder colorSpace(@Nullable String colorSpace) {
            this.colorSpace = colorSpace;
            return this;
        }
        @CustomType.Setter
        public Builder colorSpaceUsage(@Nullable String colorSpaceUsage) {
            this.colorSpaceUsage = colorSpaceUsage;
            return this;
        }
        public ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector build() {
            final var o = new ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector();
            o.colorSpace = colorSpace;
            o.colorSpaceUsage = colorSpaceUsage;
            return o;
        }
    }
}
