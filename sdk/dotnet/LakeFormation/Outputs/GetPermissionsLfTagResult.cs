// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LakeFormation.Outputs
{

    [OutputType]
    public sealed class GetPermissionsLfTagResult
    {
        /// <summary>
        /// Identifier for the Data Catalog. By default, it is the account ID of the caller.
        /// </summary>
        public readonly string CatalogId;
        /// <summary>
        /// Key-name of an LF-Tag.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// List of possible values of an LF-Tag.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetPermissionsLfTagResult(
            string catalogId,

            string key,

            ImmutableArray<string> values)
        {
            CatalogId = catalogId;
            Key = key;
            Values = values;
        }
    }
}
