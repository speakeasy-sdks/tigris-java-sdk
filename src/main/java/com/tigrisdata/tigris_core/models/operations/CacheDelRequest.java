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


public class CacheDelRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.DelRequest delRequest;

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

    public CacheDelRequest(
            com.tigrisdata.tigris_core.models.shared.DelRequest delRequest,
            String key,
            String name,
            String project) {
        Utils.checkNotNull(delRequest, "delRequest");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(project, "project");
        this.delRequest = delRequest;
        this.key = key;
        this.name = name;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.DelRequest delRequest() {
        return delRequest;
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

    public CacheDelRequest withDelRequest(com.tigrisdata.tigris_core.models.shared.DelRequest delRequest) {
        Utils.checkNotNull(delRequest, "delRequest");
        this.delRequest = delRequest;
        return this;
    }

    /**
     * cache key
     */
    public CacheDelRequest withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * cache name
     */
    public CacheDelRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Tigris project name
     */
    public CacheDelRequest withProject(String project) {
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
        CacheDelRequest other = (CacheDelRequest) o;
        return 
            java.util.Objects.deepEquals(this.delRequest, other.delRequest) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            delRequest,
            key,
            name,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CacheDelRequest.class,
                "delRequest", delRequest,
                "key", key,
                "name", name,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.DelRequest delRequest;
 
        private String key;
 
        private String name;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder delRequest(com.tigrisdata.tigris_core.models.shared.DelRequest delRequest) {
            Utils.checkNotNull(delRequest, "delRequest");
            this.delRequest = delRequest;
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
        
        public CacheDelRequest build() {
            return new CacheDelRequest(
                delRequest,
                key,
                name,
                project);
        }
    }
}

