package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QuotaLimitsResponse
 * Contains current quota limits
**/
public class QuotaLimitsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ReadUnits")
    public Long readUnits;
    public QuotaLimitsResponse withReadUnits(Long readUnits) {
        this.readUnits = readUnits;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StorageSize")
    public Long storageSize;
    public QuotaLimitsResponse withStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("WriteUnits")
    public Long writeUnits;
    public QuotaLimitsResponse withWriteUnits(Long writeUnits) {
        this.writeUnits = writeUnits;
        return this;
    }
    
}
