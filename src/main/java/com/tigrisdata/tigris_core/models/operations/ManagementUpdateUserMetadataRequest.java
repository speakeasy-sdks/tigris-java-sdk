/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ManagementUpdateUserMetadataRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest updateUserMetadataRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadataKey")
    private String metadataKey;

    public ManagementUpdateUserMetadataRequest(
            com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest updateUserMetadataRequest,
            String metadataKey) {
        Utils.checkNotNull(updateUserMetadataRequest, "updateUserMetadataRequest");
        Utils.checkNotNull(metadataKey, "metadataKey");
        this.updateUserMetadataRequest = updateUserMetadataRequest;
        this.metadataKey = metadataKey;
    }

    public com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest updateUserMetadataRequest() {
        return updateUserMetadataRequest;
    }

    public String metadataKey() {
        return metadataKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ManagementUpdateUserMetadataRequest withUpdateUserMetadataRequest(com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest updateUserMetadataRequest) {
        Utils.checkNotNull(updateUserMetadataRequest, "updateUserMetadataRequest");
        this.updateUserMetadataRequest = updateUserMetadataRequest;
        return this;
    }

    public ManagementUpdateUserMetadataRequest withMetadataKey(String metadataKey) {
        Utils.checkNotNull(metadataKey, "metadataKey");
        this.metadataKey = metadataKey;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManagementUpdateUserMetadataRequest other = (ManagementUpdateUserMetadataRequest) o;
        return 
            java.util.Objects.deepEquals(this.updateUserMetadataRequest, other.updateUserMetadataRequest) &&
            java.util.Objects.deepEquals(this.metadataKey, other.metadataKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            updateUserMetadataRequest,
            metadataKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ManagementUpdateUserMetadataRequest.class,
                "updateUserMetadataRequest", updateUserMetadataRequest,
                "metadataKey", metadataKey);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest updateUserMetadataRequest;
 
        private String metadataKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateUserMetadataRequest(com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest updateUserMetadataRequest) {
            Utils.checkNotNull(updateUserMetadataRequest, "updateUserMetadataRequest");
            this.updateUserMetadataRequest = updateUserMetadataRequest;
            return this;
        }

        public Builder metadataKey(String metadataKey) {
            Utils.checkNotNull(metadataKey, "metadataKey");
            this.metadataKey = metadataKey;
            return this;
        }
        
        public ManagementUpdateUserMetadataRequest build() {
            return new ManagementUpdateUserMetadataRequest(
                updateUserMetadataRequest,
                metadataKey);
        }
    }
}

