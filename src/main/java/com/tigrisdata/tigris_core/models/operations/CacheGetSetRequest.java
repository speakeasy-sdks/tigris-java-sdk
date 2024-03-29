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


public class CacheGetSetRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest;

    /**
     * cache key
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    private String key;

    /**
     * cache name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    private String name;

    /**
     * Tigris project name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public CacheGetSetRequest(
            com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest,
            String key,
            String name,
            String project) {
        Utils.checkNotNull(getSetRequest, "getSetRequest");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(project, "project");
        this.getSetRequest = getSetRequest;
        this.key = key;
        this.name = name;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest() {
        return getSetRequest;
    }

    /**
     * cache key
     */
    public String key() {
        return key;
    }

    /**
     * cache name
     */
    public String name() {
        return name;
    }

    /**
     * Tigris project name
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CacheGetSetRequest withGetSetRequest(com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest) {
        Utils.checkNotNull(getSetRequest, "getSetRequest");
        this.getSetRequest = getSetRequest;
        return this;
    }

    /**
     * cache key
     */
    public CacheGetSetRequest withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * cache name
     */
    public CacheGetSetRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Tigris project name
     */
    public CacheGetSetRequest withProject(String project) {
        Utils.checkNotNull(project, "project");
        this.project = project;
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
        CacheGetSetRequest other = (CacheGetSetRequest) o;
        return 
            java.util.Objects.deepEquals(this.getSetRequest, other.getSetRequest) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            getSetRequest,
            key,
            name,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CacheGetSetRequest.class,
                "getSetRequest", getSetRequest,
                "key", key,
                "name", name,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest;
 
        private String key;
 
        private String name;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder getSetRequest(com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest) {
            Utils.checkNotNull(getSetRequest, "getSetRequest");
            this.getSetRequest = getSetRequest;
            return this;
        }

        /**
         * cache key
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * cache name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Tigris project name
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public CacheGetSetRequest build() {
            return new CacheGetSetRequest(
                getSetRequest,
                key,
                name,
                project);
        }
    }
}

