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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * HealthInterface
 */

@JsonDeserialize(builder = HealthInterface.Builder.class)
public final class HealthInterface {

    @JsonProperty("namespace")
    private String namespace = null;

    @JsonProperty("version")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.Version version = null;

    @JsonProperty("requests")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthRequest> requests = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthRequest>();

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedHealthInfo> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedHealthInfo>();

    public static Builder builder() {
        return new Builder();
    }

    private HealthInterface(Builder builder) {
        if (builder.namespace != null) {
            this.namespace = builder.namespace;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.requests != null) {
            this.requests = builder.requests;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
    }

    /**
     * Name of the interface.
     * @return namespace
    **/
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.Version getVersion() {
        return version;
    }

    /**
     * Defines the details of requests that a health skill is capable of handling.
     * @return requests
    **/
    @JsonProperty("requests")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthRequest> getRequests() {
        return requests;
    }

    /**
     * Defines the list for health skill locale specific publishing information in the skill manifest.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedHealthInfo> getLocales() {
        return locales;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthInterface v1SkillManifestHealthInterface = (HealthInterface) o;
        return Objects.equals(this.namespace, v1SkillManifestHealthInterface.namespace) &&
            Objects.equals(this.version, v1SkillManifestHealthInterface.version) &&
            Objects.equals(this.requests, v1SkillManifestHealthInterface.requests) &&
            Objects.equals(this.locales, v1SkillManifestHealthInterface.locales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, version, requests, locales);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthInterface {\n");
        
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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
        private String namespace;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.Version version;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthRequest> requests;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedHealthInfo> locales;

        private Builder() {}

        @JsonProperty("namespace")
        public Builder withNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }


        @JsonProperty("version")
        public Builder withVersion(com.amazon.ask.smapi.model.v1.skill.Manifest.Version version) {
            this.version = version;
            return this;
        }


        @JsonProperty("requests")
        public Builder withRequests(List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthRequest> requests) {
            this.requests = requests;
            return this;
        }

        public Builder addRequestsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.HealthRequest requestsItem) {
            if (this.requests == null) {
                this.requests = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthRequest>();
            }
            this.requests.add(requestsItem);
            return this;
        }

        @JsonProperty("locales")
        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedHealthInfo> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedHealthInfo localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedHealthInfo>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        public HealthInterface build() {
            return new HealthInterface(this);
        }
    }
}

