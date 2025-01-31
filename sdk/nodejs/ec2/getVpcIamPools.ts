// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * `aws.ec2.getVpcIamPools` provides details about IPAM pools.
 *
 * This resource can prove useful when IPAM pools are created in another root
 * module and you need the pool ids as input variables. For example, pools
 * can be shared via RAM and used to create vpcs with CIDRs from that pool.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = pulumi.output(aws.ec2.getVpcIamPools({
 *     filters: [
 *         {
 *             name: "description",
 *             values: ["*test*"],
 *         },
 *         {
 *             name: "address-family",
 *             values: ["ipv4"],
 *         },
 *     ],
 * }));
 * ```
 */
export function getVpcIamPools(args?: GetVpcIamPoolsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcIamPoolsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2/getVpcIamPools:getVpcIamPools", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcIamPools.
 */
export interface GetVpcIamPoolsArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetVpcIamPoolsFilter[];
}

/**
 * A collection of values returned by getVpcIamPools.
 */
export interface GetVpcIamPoolsResult {
    readonly filters?: outputs.ec2.GetVpcIamPoolsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of IPAM pools and their attributes. See below for details
     */
    readonly ipamPools: outputs.ec2.GetVpcIamPoolsIpamPool[];
}

export function getVpcIamPoolsOutput(args?: GetVpcIamPoolsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcIamPoolsResult> {
    return pulumi.output(args).apply(a => getVpcIamPools(a, opts))
}

/**
 * A collection of arguments for invoking getVpcIamPools.
 */
export interface GetVpcIamPoolsOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetVpcIamPoolsFilterArgs>[]>;
}
