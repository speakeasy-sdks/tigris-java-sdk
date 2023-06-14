/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;


public class TigrisRollbackTransactionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.RollbackTransactionRequest rollbackTransactionRequest;

    public TigrisRollbackTransactionRequest withRollbackTransactionRequest(com.tigrisdata.tigris_core.models.shared.RollbackTransactionRequest rollbackTransactionRequest) {
        this.rollbackTransactionRequest = rollbackTransactionRequest;
        return this;
    }
    
    /**
     * Project name whose DB this transaction belongs to.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public TigrisRollbackTransactionRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public TigrisRollbackTransactionRequest(@JsonProperty("RollbackTransactionRequest") com.tigrisdata.tigris_core.models.shared.RollbackTransactionRequest rollbackTransactionRequest, @JsonProperty("project") String project) {
        this.rollbackTransactionRequest = rollbackTransactionRequest;
        this.project = project;
  }
}
