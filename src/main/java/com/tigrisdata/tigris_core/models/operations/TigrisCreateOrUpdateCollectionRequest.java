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


public class TigrisCreateOrUpdateCollectionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest;

    /**
     * Collection name to create.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    private String collection;

    /**
     * Project name whose db is under target to create or update collection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public TigrisCreateOrUpdateCollectionRequest(
            com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest,
            String collection,
            String project) {
        Utils.checkNotNull(createOrUpdateCollectionRequest, "createOrUpdateCollectionRequest");
        Utils.checkNotNull(collection, "collection");
        Utils.checkNotNull(project, "project");
        this.createOrUpdateCollectionRequest = createOrUpdateCollectionRequest;
        this.collection = collection;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest() {
        return createOrUpdateCollectionRequest;
    }

    /**
     * Collection name to create.
     */
    public String collection() {
        return collection;
    }

    /**
     * Project name whose db is under target to create or update collection.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TigrisCreateOrUpdateCollectionRequest withCreateOrUpdateCollectionRequest(com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest) {
        Utils.checkNotNull(createOrUpdateCollectionRequest, "createOrUpdateCollectionRequest");
        this.createOrUpdateCollectionRequest = createOrUpdateCollectionRequest;
        return this;
    }

    /**
     * Collection name to create.
     */
    public TigrisCreateOrUpdateCollectionRequest withCollection(String collection) {
        Utils.checkNotNull(collection, "collection");
        this.collection = collection;
        return this;
    }

    /**
     * Project name whose db is under target to create or update collection.
     */
    public TigrisCreateOrUpdateCollectionRequest withProject(String project) {
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
        TigrisCreateOrUpdateCollectionRequest other = (TigrisCreateOrUpdateCollectionRequest) o;
        return 
            java.util.Objects.deepEquals(this.createOrUpdateCollectionRequest, other.createOrUpdateCollectionRequest) &&
            java.util.Objects.deepEquals(this.collection, other.collection) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createOrUpdateCollectionRequest,
            collection,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TigrisCreateOrUpdateCollectionRequest.class,
                "createOrUpdateCollectionRequest", createOrUpdateCollectionRequest,
                "collection", collection,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest;
 
        private String collection;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createOrUpdateCollectionRequest(com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest) {
            Utils.checkNotNull(createOrUpdateCollectionRequest, "createOrUpdateCollectionRequest");
            this.createOrUpdateCollectionRequest = createOrUpdateCollectionRequest;
            return this;
        }

        /**
         * Collection name to create.
         */
        public Builder collection(String collection) {
            Utils.checkNotNull(collection, "collection");
            this.collection = collection;
            return this;
        }

        /**
         * Project name whose db is under target to create or update collection.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public TigrisCreateOrUpdateCollectionRequest build() {
            return new TigrisCreateOrUpdateCollectionRequest(
                createOrUpdateCollectionRequest,
                collection,
                project);
        }
    }
}
