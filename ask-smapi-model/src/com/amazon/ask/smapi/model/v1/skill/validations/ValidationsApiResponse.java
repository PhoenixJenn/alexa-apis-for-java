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


package com.amazon.ask.smapi.model.v1.skill.validations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ValidationsApiResponse
 */

@JsonDeserialize(builder = ValidationsApiResponse.Builder.class)
public final class ValidationsApiResponse {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseStatus status = null;

    @JsonProperty("result")
    private com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseResult result = null;

    public static Builder builder() {
        return new Builder();
    }

    private ValidationsApiResponse(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.result != null) {
            this.result = builder.result;
        }
    }

    /**
     * Id of the validation resource.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseStatus getStatus() {
        return status;
    }

    /**
     * Get result
     * @return result
    **/
    @JsonProperty("result")
    public com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseResult getResult() {
        return result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationsApiResponse v1SkillValidationsValidationsApiResponse = (ValidationsApiResponse) o;
        return Objects.equals(this.id, v1SkillValidationsValidationsApiResponse.id) &&
            Objects.equals(this.status, v1SkillValidationsValidationsApiResponse.status) &&
            Objects.equals(this.result, v1SkillValidationsValidationsApiResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationsApiResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
        private String id;
        private com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseStatus status;
        private com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseResult result;

        private Builder() {}

        @JsonProperty("id")
        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseStatus status) {
            this.status = status;
            return this;
        }


        @JsonProperty("result")
        public Builder withResult(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponseResult result) {
            this.result = result;
            return this;
        }


        public ValidationsApiResponse build() {
            return new ValidationsApiResponse(this);
        }
    }
}
