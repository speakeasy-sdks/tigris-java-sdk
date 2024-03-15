# User
(*user()*)

## Overview

A User on the Tigris Platform.

### Available Operations

* [getMetadata](#getmetadata) - Reads the User Metadata
* [insertMetadata](#insertmetadata) - Inserts User Metadata
* [updateMetadata](#updatemetadata) - Updates User Metadata

## getMetadata

GetUserMetadata inserts the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementGetUserMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementGetUserMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequestValue;
import com.tigrisdata.tigris_core.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            ManagementGetUserMetadataRequest req = ManagementGetUserMetadataRequest.builder()
                .getUserMetadataRequest(GetUserMetadataRequest.builder()
                        .metadataKey("<value>")
                        .value(GetUserMetadataRequestValue.builder()
                            .build())
                        .build())
                .metadataKey("<value>")
                .build();

            ManagementGetUserMetadataResponse res = sdk.user().getMetadata()
                .request(req)
                .call();

            if (res.getUserMetadataResponse().isPresent()) {
                // handle response
            }
        } catch (com.tigrisdata.tigris_core.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.ManagementGetUserMetadataRequest](../../models/operations/ManagementGetUserMetadataRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementGetUserMetadataResponse>](../../models/operations/ManagementGetUserMetadataResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## insertMetadata

insertUserMetadata inserts the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequestValue;
import com.tigrisdata.tigris_core.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            ManagementInsertUserMetadataRequest req = ManagementInsertUserMetadataRequest.builder()
                .insertUserMetadataRequest(InsertUserMetadataRequest.builder()
                        .metadataKey("<value>")
                        .value(InsertUserMetadataRequestValue.builder()
                            .build())
                        .build())
                .metadataKey("<value>")
                .build();

            ManagementInsertUserMetadataResponse res = sdk.user().insertMetadata()
                .request(req)
                .call();

            if (res.insertUserMetadataResponse().isPresent()) {
                // handle response
            }
        } catch (com.tigrisdata.tigris_core.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataRequest](../../models/operations/ManagementInsertUserMetadataRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataResponse>](../../models/operations/ManagementInsertUserMetadataResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateMetadata

updateUserMetadata updates the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateUserMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateUserMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequestValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            ManagementUpdateUserMetadataRequest req = ManagementUpdateUserMetadataRequest.builder()
                .updateUserMetadataRequest(UpdateUserMetadataRequest.builder()
                        .metadataKey("<value>")
                        .value(UpdateUserMetadataRequestValue.builder()
                            .build())
                        .build())
                .metadataKey("<value>")
                .build();

            ManagementUpdateUserMetadataResponse res = sdk.user().updateMetadata()
                .request(req)
                .call();

            if (res.updateUserMetadataResponse().isPresent()) {
                // handle response
            }
        } catch (com.tigrisdata.tigris_core.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.ManagementUpdateUserMetadataRequest](../../models/operations/ManagementUpdateUserMetadataRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementUpdateUserMetadataResponse>](../../models/operations/ManagementUpdateUserMetadataResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
