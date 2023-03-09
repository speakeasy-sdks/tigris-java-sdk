package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QuotaUsageResponse
 * Contains current quota usage
**/
public class QuotaUsageResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ReadUnits")
    public Long readUnits;
    public QuotaUsageResponse withReadUnits(Long readUnits) {
        this.readUnits = readUnits;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ReadUnitsThrottled")
    public Long readUnitsThrottled;
    public QuotaUsageResponse withReadUnitsThrottled(Long readUnitsThrottled) {
        this.readUnitsThrottled = readUnitsThrottled;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StorageSize")
    public Long storageSize;
    public QuotaUsageResponse withStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StorageSizeThrottled")
    public Long storageSizeThrottled;
    public QuotaUsageResponse withStorageSizeThrottled(Long storageSizeThrottled) {
        this.storageSizeThrottled = storageSizeThrottled;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("WriteUnits")
    public Long writeUnits;
    public QuotaUsageResponse withWriteUnits(Long writeUnits) {
        this.writeUnits = writeUnits;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("WriteUnitsThrottled")
    public Long writeUnitsThrottled;
    public QuotaUsageResponse withWriteUnitsThrottled(Long writeUnitsThrottled) {
        this.writeUnitsThrottled = writeUnitsThrottled;
        return this;
    }
    
}
