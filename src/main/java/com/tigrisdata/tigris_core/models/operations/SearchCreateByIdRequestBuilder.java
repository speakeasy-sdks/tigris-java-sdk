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


public class SearchCreateByIdRequestBuilder {

    private SearchCreateByIdRequest request;
    private final SDKMethodInterfaces.MethodCallSearchCreateById sdk;

    public SearchCreateByIdRequestBuilder(SDKMethodInterfaces.MethodCallSearchCreateById sdk) {
        this.sdk = sdk;
    }

    public SearchCreateByIdRequestBuilder request(SearchCreateByIdRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SearchCreateByIdResponse call() throws Exception {

        return sdk.createDocument(
            request);
    }
}
