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
                .setSecurity(new Security("quae") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementGetUserMetadataRequest req = new ManagementGetUserMetadataRequest(                new GetUserMetadataRequest() {{
                                metadataKey = "earum";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("in", "eius");
                                    put("libero", "illum");
                                }};
                            }};, "soluta");            

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
                .setSecurity(new Security("accusantium") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementInsertUserMetadataRequest req = new ManagementInsertUserMetadataRequest(                new InsertUserMetadataRequest() {{
                                metadataKey = "aliquam";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("dicta", "ullam");
                                    put("reprehenderit", "ullam");
                                    put("nisi", "aut");
                                    put("voluptatum", "qui");
                                }};
                            }};, "quibusdam");            

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
                .setSecurity(new Security("ex") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementUpdateUserMetadataRequest req = new ManagementUpdateUserMetadataRequest(                new UpdateUserMetadataRequest() {{
                                metadataKey = "deleniti";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("dolorum", "architecto");
                                    put("omnis", "tenetur");
                                    put("quasi", "at");
                                    put("et", "voluptate");
                                }};
                            }};, "ipsa");            

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
