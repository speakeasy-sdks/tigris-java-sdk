package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessagesRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;
    public MessagesRequest withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messages")
    public Message[] messages;
    public MessagesRequest withMessages(Message[] messages) {
        this.messages = messages;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public MessagesRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
}
