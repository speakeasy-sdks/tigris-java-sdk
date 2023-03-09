package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheKeysQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Long count;
    public CacheKeysQueryParams withCount(Long count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public Long cursor;
    public CacheKeysQueryParams withCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pattern")
    public String pattern;
    public CacheKeysQueryParams withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    
}
