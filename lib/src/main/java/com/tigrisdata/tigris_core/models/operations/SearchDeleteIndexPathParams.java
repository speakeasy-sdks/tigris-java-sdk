package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchDeleteIndexPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;
    public SearchDeleteIndexPathParams withName(String name) {
        this.name = name;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public SearchDeleteIndexPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
