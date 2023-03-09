package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchCreatePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    public String index;
    public SearchCreatePathParams withIndex(String index) {
        this.index = index;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public SearchCreatePathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
