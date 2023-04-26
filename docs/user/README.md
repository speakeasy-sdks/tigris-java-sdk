# user

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
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quaerat") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementGetUserMetadataRequest req = new ManagementGetUserMetadataRequest(                new GetUserMetadataRequest() {{
                                metadataKey = "consequuntur";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("officia", "maxime");
                                    put("dignissimos", "officia");
                                    put("asperiores", "nemo");
                                    put("quae", "quaerat");
                                }};
                            }};, "porro");            

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

## insertMetadata

insertUserMetadata inserts the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertUserMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quod") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementInsertUserMetadataRequest req = new ManagementInsertUserMetadataRequest(                new InsertUserMetadataRequest() {{
                                metadataKey = "labore";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("adipisci", "fuga");
                                }};
                            }};, "id");            

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

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("suscipit") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementUpdateUserMetadataRequest req = new ManagementUpdateUserMetadataRequest(                new UpdateUserMetadataRequest() {{
                                metadataKey = "velit";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("est", "recusandae");
                                    put("totam", "fugiat");
                                    put("vel", "ducimus");
                                }};
                            }};, "quos");            

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
