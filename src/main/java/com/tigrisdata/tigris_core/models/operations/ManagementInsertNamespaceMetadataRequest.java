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


public class ManagementInsertNamespaceMetadataRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadataKey")
    private String metadataKey;

    public ManagementInsertNamespaceMetadataRequest(
            com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest,
            String metadataKey) {
        Utils.checkNotNull(insertNamespaceMetadataRequest, "insertNamespaceMetadataRequest");
        Utils.checkNotNull(metadataKey, "metadataKey");
        this.insertNamespaceMetadataRequest = insertNamespaceMetadataRequest;
        this.metadataKey = metadataKey;
    }

    public com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest() {
        return insertNamespaceMetadataRequest;
    }

    public String metadataKey() {
        return metadataKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ManagementInsertNamespaceMetadataRequest withInsertNamespaceMetadataRequest(com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest) {
        Utils.checkNotNull(insertNamespaceMetadataRequest, "insertNamespaceMetadataRequest");
        this.insertNamespaceMetadataRequest = insertNamespaceMetadataRequest;
        return this;
    }

    public ManagementInsertNamespaceMetadataRequest withMetadataKey(String metadataKey) {
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
        ManagementInsertNamespaceMetadataRequest other = (ManagementInsertNamespaceMetadataRequest) o;
        return 
            java.util.Objects.deepEquals(this.insertNamespaceMetadataRequest, other.insertNamespaceMetadataRequest) &&
            java.util.Objects.deepEquals(this.metadataKey, other.metadataKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            insertNamespaceMetadataRequest,
            metadataKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ManagementInsertNamespaceMetadataRequest.class,
                "insertNamespaceMetadataRequest", insertNamespaceMetadataRequest,
                "metadataKey", metadataKey);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest;
 
        private String metadataKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder insertNamespaceMetadataRequest(com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest) {
            Utils.checkNotNull(insertNamespaceMetadataRequest, "insertNamespaceMetadataRequest");
            this.insertNamespaceMetadataRequest = insertNamespaceMetadataRequest;
            return this;
        }

        public Builder metadataKey(String metadataKey) {
            Utils.checkNotNull(metadataKey, "metadataKey");
            this.metadataKey = metadataKey;
            return this;
        }
        
        public ManagementInsertNamespaceMetadataRequest build() {
            return new ManagementInsertNamespaceMetadataRequest(
                insertNamespaceMetadataRequest,
                metadataKey);
        }
    }
}

