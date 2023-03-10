package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ObservabilityQuotaUsageRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public ObservabilityQuotaUsageRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
