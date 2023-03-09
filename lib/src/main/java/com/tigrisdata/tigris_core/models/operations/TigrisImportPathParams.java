package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisImportPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    public String collection;
    public TigrisImportPathParams withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public TigrisImportPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
