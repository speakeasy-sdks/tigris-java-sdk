package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDescribeDatabaseRequest {
    public TigrisDescribeDatabasePathParams pathParams;
    public TigrisDescribeDatabaseRequest withPathParams(TigrisDescribeDatabasePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DescribeDatabaseRequest request;
    public TigrisDescribeDatabaseRequest withRequest(com.tigrisdata.tigris_core.models.shared.DescribeDatabaseRequest request) {
        this.request = request;
        return this;
    }
    
}
