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


public class TigrisInsertRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.InsertRequest insertRequest;

    /**
     * Collection name where to insert documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    private String collection;

    /**
     * Project name whose db is under target to insert documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public TigrisInsertRequest(
            com.tigrisdata.tigris_core.models.shared.InsertRequest insertRequest,
            String collection,
            String project) {
        Utils.checkNotNull(insertRequest, "insertRequest");
        Utils.checkNotNull(collection, "collection");
        Utils.checkNotNull(project, "project");
        this.insertRequest = insertRequest;
        this.collection = collection;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.InsertRequest insertRequest() {
        return insertRequest;
    }

    /**
     * Collection name where to insert documents.
     */
    public String collection() {
        return collection;
    }

    /**
     * Project name whose db is under target to insert documents.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TigrisInsertRequest withInsertRequest(com.tigrisdata.tigris_core.models.shared.InsertRequest insertRequest) {
        Utils.checkNotNull(insertRequest, "insertRequest");
        this.insertRequest = insertRequest;
        return this;
    }

    /**
     * Collection name where to insert documents.
     */
    public TigrisInsertRequest withCollection(String collection) {
        Utils.checkNotNull(collection, "collection");
        this.collection = collection;
        return this;
    }

    /**
     * Project name whose db is under target to insert documents.
     */
    public TigrisInsertRequest withProject(String project) {
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
        TigrisInsertRequest other = (TigrisInsertRequest) o;
        return 
            java.util.Objects.deepEquals(this.insertRequest, other.insertRequest) &&
            java.util.Objects.deepEquals(this.collection, other.collection) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            insertRequest,
            collection,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TigrisInsertRequest.class,
                "insertRequest", insertRequest,
                "collection", collection,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.InsertRequest insertRequest;
 
        private String collection;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder insertRequest(com.tigrisdata.tigris_core.models.shared.InsertRequest insertRequest) {
            Utils.checkNotNull(insertRequest, "insertRequest");
            this.insertRequest = insertRequest;
            return this;
        }

        /**
         * Collection name where to insert documents.
         */
        public Builder collection(String collection) {
            Utils.checkNotNull(collection, "collection");
            this.collection = collection;
            return this;
        }

        /**
         * Project name whose db is under target to insert documents.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public TigrisInsertRequest build() {
            return new TigrisInsertRequest(
                insertRequest,
                collection,
                project);
        }
    }
}

