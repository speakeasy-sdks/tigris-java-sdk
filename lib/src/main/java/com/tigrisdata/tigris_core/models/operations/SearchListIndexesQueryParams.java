package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchListIndexesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter.branch")
    public String filterBranch;
    public SearchListIndexesQueryParams withFilterBranch(String filterBranch) {
        this.filterBranch = filterBranch;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter.collection")
    public String filterCollection;
    public SearchListIndexesQueryParams withFilterCollection(String filterCollection) {
        this.filterCollection = filterCollection;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter.type")
    public String filterType;
    public SearchListIndexesQueryParams withFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    
}
