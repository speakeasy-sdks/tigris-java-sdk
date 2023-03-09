package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ObservabilityQuotaLimitsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public ObservabilityQuotaLimitsRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
