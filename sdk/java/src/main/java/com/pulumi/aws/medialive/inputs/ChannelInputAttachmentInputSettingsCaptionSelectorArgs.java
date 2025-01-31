// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentInputSettingsCaptionSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentInputSettingsCaptionSelectorArgs Empty = new ChannelInputAttachmentInputSettingsCaptionSelectorArgs();

    @Import(name="deblockFilter")
    private @Nullable Output<String> deblockFilter;

    public Optional<Output<String>> deblockFilter() {
        return Optional.ofNullable(this.deblockFilter);
    }

    @Import(name="denoiseFilter")
    private @Nullable Output<String> denoiseFilter;

    public Optional<Output<String>> denoiseFilter() {
        return Optional.ofNullable(this.denoiseFilter);
    }

    @Import(name="filterStrength")
    private @Nullable Output<Integer> filterStrength;

    public Optional<Output<Integer>> filterStrength() {
        return Optional.ofNullable(this.filterStrength);
    }

    @Import(name="inputFilter")
    private @Nullable Output<String> inputFilter;

    public Optional<Output<String>> inputFilter() {
        return Optional.ofNullable(this.inputFilter);
    }

    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * Custom output group name defined by the user.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Custom output group name defined by the user.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="networkInputSettings")
    private @Nullable Output<ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettingsArgs> networkInputSettings;

    public Optional<Output<ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettingsArgs>> networkInputSettings() {
        return Optional.ofNullable(this.networkInputSettings);
    }

    @Import(name="scte35Pid")
    private @Nullable Output<Integer> scte35Pid;

    public Optional<Output<Integer>> scte35Pid() {
        return Optional.ofNullable(this.scte35Pid);
    }

    @Import(name="selectorSettings")
    private @Nullable Output<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs> selectorSettings;

    public Optional<Output<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs>> selectorSettings() {
        return Optional.ofNullable(this.selectorSettings);
    }

    @Import(name="smpte2038DataPreference")
    private @Nullable Output<String> smpte2038DataPreference;

    public Optional<Output<String>> smpte2038DataPreference() {
        return Optional.ofNullable(this.smpte2038DataPreference);
    }

    @Import(name="sourceEndBehavior")
    private @Nullable Output<String> sourceEndBehavior;

    public Optional<Output<String>> sourceEndBehavior() {
        return Optional.ofNullable(this.sourceEndBehavior);
    }

    @Import(name="videoSelector")
    private @Nullable Output<ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelectorArgs> videoSelector;

    public Optional<Output<ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelectorArgs>> videoSelector() {
        return Optional.ofNullable(this.videoSelector);
    }

    private ChannelInputAttachmentInputSettingsCaptionSelectorArgs() {}

    private ChannelInputAttachmentInputSettingsCaptionSelectorArgs(ChannelInputAttachmentInputSettingsCaptionSelectorArgs $) {
        this.deblockFilter = $.deblockFilter;
        this.denoiseFilter = $.denoiseFilter;
        this.filterStrength = $.filterStrength;
        this.inputFilter = $.inputFilter;
        this.languageCode = $.languageCode;
        this.name = $.name;
        this.networkInputSettings = $.networkInputSettings;
        this.scte35Pid = $.scte35Pid;
        this.selectorSettings = $.selectorSettings;
        this.smpte2038DataPreference = $.smpte2038DataPreference;
        this.sourceEndBehavior = $.sourceEndBehavior;
        this.videoSelector = $.videoSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentInputSettingsCaptionSelectorArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorArgs();
        }

        public Builder(ChannelInputAttachmentInputSettingsCaptionSelectorArgs defaults) {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder deblockFilter(@Nullable Output<String> deblockFilter) {
            $.deblockFilter = deblockFilter;
            return this;
        }

        public Builder deblockFilter(String deblockFilter) {
            return deblockFilter(Output.of(deblockFilter));
        }

        public Builder denoiseFilter(@Nullable Output<String> denoiseFilter) {
            $.denoiseFilter = denoiseFilter;
            return this;
        }

        public Builder denoiseFilter(String denoiseFilter) {
            return denoiseFilter(Output.of(denoiseFilter));
        }

        public Builder filterStrength(@Nullable Output<Integer> filterStrength) {
            $.filterStrength = filterStrength;
            return this;
        }

        public Builder filterStrength(Integer filterStrength) {
            return filterStrength(Output.of(filterStrength));
        }

        public Builder inputFilter(@Nullable Output<String> inputFilter) {
            $.inputFilter = inputFilter;
            return this;
        }

        public Builder inputFilter(String inputFilter) {
            return inputFilter(Output.of(inputFilter));
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param name Custom output group name defined by the user.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Custom output group name defined by the user.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkInputSettings(@Nullable Output<ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettingsArgs> networkInputSettings) {
            $.networkInputSettings = networkInputSettings;
            return this;
        }

        public Builder networkInputSettings(ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettingsArgs networkInputSettings) {
            return networkInputSettings(Output.of(networkInputSettings));
        }

        public Builder scte35Pid(@Nullable Output<Integer> scte35Pid) {
            $.scte35Pid = scte35Pid;
            return this;
        }

        public Builder scte35Pid(Integer scte35Pid) {
            return scte35Pid(Output.of(scte35Pid));
        }

        public Builder selectorSettings(@Nullable Output<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs> selectorSettings) {
            $.selectorSettings = selectorSettings;
            return this;
        }

        public Builder selectorSettings(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs selectorSettings) {
            return selectorSettings(Output.of(selectorSettings));
        }

        public Builder smpte2038DataPreference(@Nullable Output<String> smpte2038DataPreference) {
            $.smpte2038DataPreference = smpte2038DataPreference;
            return this;
        }

        public Builder smpte2038DataPreference(String smpte2038DataPreference) {
            return smpte2038DataPreference(Output.of(smpte2038DataPreference));
        }

        public Builder sourceEndBehavior(@Nullable Output<String> sourceEndBehavior) {
            $.sourceEndBehavior = sourceEndBehavior;
            return this;
        }

        public Builder sourceEndBehavior(String sourceEndBehavior) {
            return sourceEndBehavior(Output.of(sourceEndBehavior));
        }

        public Builder videoSelector(@Nullable Output<ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelectorArgs> videoSelector) {
            $.videoSelector = videoSelector;
            return this;
        }

        public Builder videoSelector(ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelectorArgs videoSelector) {
            return videoSelector(Output.of(videoSelector));
        }

        public ChannelInputAttachmentInputSettingsCaptionSelectorArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
