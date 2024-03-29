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


public class TigrisImportRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest;

    /**
     * Collection name where to import documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    private String collection;

    /**
     * Project name whose db is under target to import documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public TigrisImportRequest(
            com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest,
            String collection,
            String project) {
        Utils.checkNotNull(importRequest, "importRequest");
        Utils.checkNotNull(collection, "collection");
        Utils.checkNotNull(project, "project");
        this.importRequest = importRequest;
        this.collection = collection;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest() {
        return importRequest;
    }

    /**
     * Collection name where to import documents.
     */
    public String collection() {
        return collection;
    }

    /**
     * Project name whose db is under target to import documents.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TigrisImportRequest withImportRequest(com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest) {
        Utils.checkNotNull(importRequest, "importRequest");
        this.importRequest = importRequest;
        return this;
    }

    /**
     * Collection name where to import documents.
     */
    public TigrisImportRequest withCollection(String collection) {
        Utils.checkNotNull(collection, "collection");
        this.collection = collection;
        return this;
    }

    /**
     * Project name whose db is under target to import documents.
     */
    public TigrisImportRequest withProject(String project) {
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
        TigrisImportRequest other = (TigrisImportRequest) o;
        return 
            java.util.Objects.deepEquals(this.importRequest, other.importRequest) &&
            java.util.Objects.deepEquals(this.collection, other.collection) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            importRequest,
            collection,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TigrisImportRequest.class,
                "importRequest", importRequest,
                "collection", collection,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest;
 
        private String collection;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder importRequest(com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest) {
            Utils.checkNotNull(importRequest, "importRequest");
            this.importRequest = importRequest;
            return this;
        }

        /**
         * Collection name where to import documents.
         */
        public Builder collection(String collection) {
            Utils.checkNotNull(collection, "collection");
            this.collection = collection;
            return this;
        }

        /**
         * Project name whose db is under target to import documents.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public TigrisImportRequest build() {
            return new TigrisImportRequest(
                importRequest,
                collection,
                project);
        }
    }
}

