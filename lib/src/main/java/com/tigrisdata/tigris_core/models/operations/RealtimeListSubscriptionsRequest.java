/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class RealtimeListSubscriptionsRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=channel")
    public String channel;
    public RealtimeListSubscriptionsRequest withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;
    public RealtimeListSubscriptionsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_size")
    public Integer pageSize;
    public RealtimeListSubscriptionsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public RealtimeListSubscriptionsRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
}
