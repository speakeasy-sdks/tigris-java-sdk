/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QuotaUsageResponse - Contains current quota usage
 */
public class QuotaUsageResponse {
    /**
     * Number of read units used per second
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ReadUnits")
    public Long readUnits;
    public QuotaUsageResponse withReadUnits(Long readUnits) {
        this.readUnits = readUnits;
        return this;
    }
    
    /**
     * Number of read units throttled per second. Units which was rejected with "resource exhausted error".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ReadUnitsThrottled")
    public Long readUnitsThrottled;
    public QuotaUsageResponse withReadUnitsThrottled(Long readUnitsThrottled) {
        this.readUnitsThrottled = readUnitsThrottled;
        return this;
    }
    
    /**
     * Number of bytes stored
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StorageSize")
    public Long storageSize;
    public QuotaUsageResponse withStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    
    /**
     * Number of bytes throttled. Number of bytes which were attempted to write in excess of quota and were rejected.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StorageSizeThrottled")
    public Long storageSizeThrottled;
    public QuotaUsageResponse withStorageSizeThrottled(Long storageSizeThrottled) {
        this.storageSizeThrottled = storageSizeThrottled;
        return this;
    }
    
    /**
     * Number of write units used per second
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("WriteUnits")
    public Long writeUnits;
    public QuotaUsageResponse withWriteUnits(Long writeUnits) {
        this.writeUnits = writeUnits;
        return this;
    }
    
    /**
     * Number of write units throttled per second. Units which was rejected with "resource exhausted error".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("WriteUnitsThrottled")
    public Long writeUnitsThrottled;
    public QuotaUsageResponse withWriteUnitsThrottled(Long writeUnitsThrottled) {
        this.writeUnitsThrottled = writeUnitsThrottled;
        return this;
    }
    
    public QuotaUsageResponse(){}
}
