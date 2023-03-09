package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisImportRequest {
    public TigrisImportPathParams pathParams;
    public TigrisImportRequest withPathParams(TigrisImportPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.ImportRequest request;
    public TigrisImportRequest withRequest(com.tigrisdata.tigris_core.models.shared.ImportRequest request) {
        this.request = request;
        return this;
    }
    
}
