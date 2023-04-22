/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateDocumentResponse - OK
 */
public class UpdateDocumentResponse {
    /**
     * An array of statuses of all the documents received in the request. Order is same as it is received in the request. Each item of this array has an \u201cid\u201d and \u201cerror\u201d key. Id is set as document id and error will be null in case of success, otherwise error is set with an error code and message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public DocStatus[] status;
    public UpdateDocumentResponse withStatus(DocStatus[] status) {
        this.status = status;
        return this;
    }
    

    public UpdateDocumentResponse(){}
}
