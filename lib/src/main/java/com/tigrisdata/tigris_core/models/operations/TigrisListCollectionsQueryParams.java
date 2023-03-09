package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisListCollectionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=branch")
    public String branch;
    public TigrisListCollectionsQueryParams withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
}
