// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3Settings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2Settings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsAudioDescriptionCodecSettings {
    private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettings aacSettings;
    private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3Settings ac3Settings;
    private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings eac3Settings;
    private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2Settings mp2Settings;
    private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettings wavSettings;

    private ChannelEncoderSettingsAudioDescriptionCodecSettings() {}
    public Optional<ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettings> aacSettings() {
        return Optional.ofNullable(this.aacSettings);
    }
    public Optional<ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3Settings> ac3Settings() {
        return Optional.ofNullable(this.ac3Settings);
    }
    public Optional<ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings> eac3Settings() {
        return Optional.ofNullable(this.eac3Settings);
    }
    public Optional<ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2Settings> mp2Settings() {
        return Optional.ofNullable(this.mp2Settings);
    }
    public Optional<ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettings> wavSettings() {
        return Optional.ofNullable(this.wavSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsAudioDescriptionCodecSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettings aacSettings;
        private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3Settings ac3Settings;
        private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings eac3Settings;
        private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2Settings mp2Settings;
        private @Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettings wavSettings;
        public Builder() {}
        public Builder(ChannelEncoderSettingsAudioDescriptionCodecSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aacSettings = defaults.aacSettings;
    	      this.ac3Settings = defaults.ac3Settings;
    	      this.eac3Settings = defaults.eac3Settings;
    	      this.mp2Settings = defaults.mp2Settings;
    	      this.wavSettings = defaults.wavSettings;
        }

        @CustomType.Setter
        public Builder aacSettings(@Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettings aacSettings) {
            this.aacSettings = aacSettings;
            return this;
        }
        @CustomType.Setter
        public Builder ac3Settings(@Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3Settings ac3Settings) {
            this.ac3Settings = ac3Settings;
            return this;
        }
        @CustomType.Setter
        public Builder eac3Settings(@Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3Settings eac3Settings) {
            this.eac3Settings = eac3Settings;
            return this;
        }
        @CustomType.Setter
        public Builder mp2Settings(@Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2Settings mp2Settings) {
            this.mp2Settings = mp2Settings;
            return this;
        }
        @CustomType.Setter
        public Builder wavSettings(@Nullable ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettings wavSettings) {
            this.wavSettings = wavSettings;
            return this;
        }
        public ChannelEncoderSettingsAudioDescriptionCodecSettings build() {
            final var o = new ChannelEncoderSettingsAudioDescriptionCodecSettings();
            o.aacSettings = aacSettings;
            o.ac3Settings = ac3Settings;
            o.eac3Settings = eac3Settings;
            o.mp2Settings = mp2Settings;
            o.wavSettings = wavSettings;
            return o;
        }
    }
}
