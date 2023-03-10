package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ObservabilityQueryTimeSeriesMetricsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest request;
    public ObservabilityQueryTimeSeriesMetricsRequest withRequest(com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest request) {
        this.request = request;
        return this;
    }
    
}
