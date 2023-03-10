package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class RealtimeReadMessagesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end")
    public String end;
    public RealtimeReadMessagesQueryParams withEnd(String end) {
        this.end = end;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=event")
    public String event;
    public RealtimeReadMessagesQueryParams withEvent(String event) {
        this.event = event;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public RealtimeReadMessagesQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=session_id")
    public String sessionId;
    public RealtimeReadMessagesQueryParams withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=socket_id")
    public String socketId;
    public RealtimeReadMessagesQueryParams withSocketId(String socketId) {
        this.socketId = socketId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start")
    public String start;
    public RealtimeReadMessagesQueryParams withStart(String start) {
        this.start = start;
        return this;
    }
    
}
