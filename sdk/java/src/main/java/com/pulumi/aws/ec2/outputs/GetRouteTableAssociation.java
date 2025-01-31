// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteTableAssociation {
    /**
     * @return ID of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
     * 
     */
    private String gatewayId;
    /**
     * @return Whether the association is due to the main route table.
     * 
     */
    private Boolean main;
    /**
     * @return Association ID.
     * 
     */
    private String routeTableAssociationId;
    /**
     * @return ID of the specific Route Table to retrieve.
     * 
     */
    private String routeTableId;
    /**
     * @return ID of a Subnet which is connected to the Route Table (not exported if not passed as a parameter).
     * 
     */
    private String subnetId;

    private GetRouteTableAssociation() {}
    /**
     * @return ID of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
     * 
     */
    public String gatewayId() {
        return this.gatewayId;
    }
    /**
     * @return Whether the association is due to the main route table.
     * 
     */
    public Boolean main() {
        return this.main;
    }
    /**
     * @return Association ID.
     * 
     */
    public String routeTableAssociationId() {
        return this.routeTableAssociationId;
    }
    /**
     * @return ID of the specific Route Table to retrieve.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return ID of a Subnet which is connected to the Route Table (not exported if not passed as a parameter).
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableAssociation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gatewayId;
        private Boolean main;
        private String routeTableAssociationId;
        private String routeTableId;
        private String subnetId;
        public Builder() {}
        public Builder(GetRouteTableAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.main = defaults.main;
    	      this.routeTableAssociationId = defaults.routeTableAssociationId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder main(Boolean main) {
            this.main = Objects.requireNonNull(main);
            return this;
        }
        @CustomType.Setter
        public Builder routeTableAssociationId(String routeTableAssociationId) {
            this.routeTableAssociationId = Objects.requireNonNull(routeTableAssociationId);
            return this;
        }
        @CustomType.Setter
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetRouteTableAssociation build() {
            final var o = new GetRouteTableAssociation();
            o.gatewayId = gatewayId;
            o.main = main;
            o.routeTableAssociationId = routeTableAssociationId;
            o.routeTableId = routeTableId;
            o.subnetId = subnetId;
            return o;
        }
    }
}
