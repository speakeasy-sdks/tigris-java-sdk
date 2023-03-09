package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchCreateOrUpdateIndexPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;
    public SearchCreateOrUpdateIndexPathParams withName(String name) {
        this.name = name;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public SearchCreateOrUpdateIndexPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
