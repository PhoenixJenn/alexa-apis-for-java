/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure for smart home api of the skill.
 */

@JsonDeserialize(builder = SmartHomeApis.Builder.class)
public final class SmartHomeApis {

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion>();

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint = null;

    @JsonProperty("protocolVersion")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeProtocol protocolVersion = null;

    public static Builder builder() {
        return new Builder();
    }

    private SmartHomeApis(Builder builder) {
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.protocolVersion != null) {
            this.protocolVersion = builder.protocolVersion;
        }
    }

    /**
     * Contains an array of the supported &amp;lt;region&amp;gt; Objects.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> getRegions() {
        return regions;
    }

    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Get protocolVersion
     * @return protocolVersion
    **/
    @JsonProperty("protocolVersion")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeProtocol getProtocolVersion() {
        return protocolVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmartHomeApis v1SkillManifestSmartHomeApis = (SmartHomeApis) o;
        return Objects.equals(this.regions, v1SkillManifestSmartHomeApis.regions) &&
            Objects.equals(this.endpoint, v1SkillManifestSmartHomeApis.endpoint) &&
            Objects.equals(this.protocolVersion, v1SkillManifestSmartHomeApis.protocolVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, endpoint, protocolVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartHomeApis {\n");
        
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
    public static class Builder {
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeProtocol protocolVersion;

        private Builder() {}

        @JsonProperty("regions")
        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        @JsonProperty("endpoint")
        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("protocolVersion")
        public Builder withProtocolVersion(com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeProtocol protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }


        public SmartHomeApis build() {
            return new SmartHomeApis(this);
        }
    }
}

