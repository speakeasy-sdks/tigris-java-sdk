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


public class CacheListCachesRequest {

    /**
     * Tigris project name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public CacheListCachesRequest(
            String project) {
        Utils.checkNotNull(project, "project");
        this.project = project;
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

    /**
     * Tigris project name
     */
    public CacheListCachesRequest withProject(String project) {
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
        CacheListCachesRequest other = (CacheListCachesRequest) o;
        return 
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CacheListCachesRequest.class,
                "project", project);
    }
    
    public final static class Builder {
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Tigris project name
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public CacheListCachesRequest build() {
            return new CacheListCachesRequest(
                project);
        }
    }
}

