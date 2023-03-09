package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchGetQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ids")
    public String[] ids;
    public SearchGetQueryParams withIds(String[] ids) {
        this.ids = ids;
        return this;
    }
    
}
