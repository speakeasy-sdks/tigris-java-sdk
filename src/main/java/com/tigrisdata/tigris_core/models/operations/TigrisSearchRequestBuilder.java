/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.models.errors.SDKError;
import com.tigrisdata.tigris_core.utils.LazySingletonValue;
import com.tigrisdata.tigris_core.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class TigrisSearchRequestBuilder {

    private TigrisSearchRequest request;
    private final SDKMethodInterfaces.MethodCallTigrisSearch sdk;

    public TigrisSearchRequestBuilder(SDKMethodInterfaces.MethodCallTigrisSearch sdk) {
        this.sdk = sdk;
    }

    public TigrisSearchRequestBuilder request(TigrisSearchRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public TigrisSearchResponse call() throws Exception {

        return sdk.searchDocuments(
            request);
    }
}
