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


public class SearchCreateRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest;

    /**
     * index name where to create documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    private String index;

    /**
     * Tigris project name.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public SearchCreateRequest(
            com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest,
            String index,
            String project) {
        Utils.checkNotNull(createDocumentRequest, "createDocumentRequest");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(project, "project");
        this.createDocumentRequest = createDocumentRequest;
        this.index = index;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest() {
        return createDocumentRequest;
    }

    /**
     * index name where to create documents.
     */
    public String index() {
        return index;
    }

    /**
     * Tigris project name.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SearchCreateRequest withCreateDocumentRequest(com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest) {
        Utils.checkNotNull(createDocumentRequest, "createDocumentRequest");
        this.createDocumentRequest = createDocumentRequest;
        return this;
    }

    /**
     * index name where to create documents.
     */
    public SearchCreateRequest withIndex(String index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    /**
     * Tigris project name.
     */
    public SearchCreateRequest withProject(String project) {
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
        SearchCreateRequest other = (SearchCreateRequest) o;
        return 
            java.util.Objects.deepEquals(this.createDocumentRequest, other.createDocumentRequest) &&
            java.util.Objects.deepEquals(this.index, other.index) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createDocumentRequest,
            index,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchCreateRequest.class,
                "createDocumentRequest", createDocumentRequest,
                "index", index,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest;
 
        private String index;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createDocumentRequest(com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest) {
            Utils.checkNotNull(createDocumentRequest, "createDocumentRequest");
            this.createDocumentRequest = createDocumentRequest;
            return this;
        }

        /**
         * index name where to create documents.
         */
        public Builder index(String index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        /**
         * Tigris project name.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public SearchCreateRequest build() {
            return new SearchCreateRequest(
                createDocumentRequest,
                index,
                project);
        }
    }
}

