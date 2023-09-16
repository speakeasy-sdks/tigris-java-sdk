# User

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
import com.tigrisdata.tigris_core.models.operations.ManagementGetUserMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementGetUserMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequestValue;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("temporibus") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementGetUserMetadataRequest req = new ManagementGetUserMetadataRequest(                new GetUserMetadataRequest() {{
                                metadataKey = "qui";
                                value = new GetUserMetadataRequestValue();;
                            }};, "neque");            

            ManagementGetUserMetadataResponse res = sdk.user.getMetadata(req);

            if (res.getUserMetadataResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.ManagementGetUserMetadataResponse](../../models/operations/ManagementGetUserMetadataResponse.md)**


## insertMetadata

insertUserMetadata inserts the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequestValue;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("fugit") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementInsertUserMetadataRequest req = new ManagementInsertUserMetadataRequest(                new InsertUserMetadataRequest() {{
                                metadataKey = "magni";
                                value = new InsertUserMetadataRequestValue();;
                            }};, "odio");            

            ManagementInsertUserMetadataResponse res = sdk.user.insertMetadata(req);

            if (res.insertUserMetadataResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataResponse](../../models/operations/ManagementInsertUserMetadataResponse.md)**


## updateMetadata

updateUserMetadata updates the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateUserMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateUserMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequestValue;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("sunt") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementUpdateUserMetadataRequest req = new ManagementUpdateUserMetadataRequest(                new UpdateUserMetadataRequest() {{
                                metadataKey = "ullam";
                                value = new UpdateUserMetadataRequestValue();;
                            }};, "nam");            

            ManagementUpdateUserMetadataResponse res = sdk.user.updateMetadata(req);

            if (res.updateUserMetadataResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.ManagementUpdateUserMetadataResponse](../../models/operations/ManagementUpdateUserMetadataResponse.md)**

