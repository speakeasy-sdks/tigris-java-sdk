# namespace

## Overview

The Management section provide APIs that can be used to manage users, and app_keys.

### Available Operations

* [create](#create) - Creates a Namespace
* [get](#get) - Describe the details of all namespaces
* [getMetadata](#getmetadata) - Reads the Namespace Metadata
* [insertMetadata](#insertmetadata) - Inserts Namespace Metadata
* [list](#list) - Lists all Namespaces
* [updateMetadata](#updatemetadata) - Updates Namespace Metadata

## create

Creates a new namespace, if it does not exist

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse;
import com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ea") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest req = new CreateNamespaceRequest() {{
                code = 136900L;
                id = "6d436813-f16d-49f5-bce6-c556146c3e25";
                name = "Mr. Elsa Reinger";
            }};            

            CreateNamespaceResponse res = sdk.namespace.create(req);

            if (res.createNamespaceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## get

Get details for all namespaces

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("impedit") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementDescribeNamespacesResponse res = sdk.namespace.get();

            if (res.describeNamespacesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getMetadata

GetNamespaceMetadata inserts the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("aliquam") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementGetNamespaceMetadataRequest req = new ManagementGetNamespaceMetadataRequest(                new GetNamespaceMetadataRequest() {{
                                metadataKey = "fugit";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("inventore", "non");
                                    put("et", "dolorum");
                                    put("laborum", "placeat");
                                    put("velit", "eum");
                                }};
                            }};, "autem");            

            ManagementGetNamespaceMetadataResponse res = sdk.namespace.getMetadata(req);

            if (res.getNamespaceMetadataResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## insertMetadata

InsertNamespaceMetadata inserts the namespace metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("nobis") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementInsertNamespaceMetadataRequest req = new ManagementInsertNamespaceMetadataRequest(                new InsertNamespaceMetadataRequest() {{
                                metadataKey = "quas";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("nulla", "voluptas");
                                    put("libero", "quasi");
                                    put("tempora", "numquam");
                                    put("explicabo", "provident");
                                }};
                            }};, "ipsa");            

            ManagementInsertNamespaceMetadataResponse res = sdk.namespace.insertMetadata(req);

            if (res.insertNamespaceMetadataResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## list

List all namespace

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("molestiae") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementListNamespacesResponse res = sdk.namespace.list();

            if (res.listNamespacesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## updateMetadata

UpdateNamespaceMetadata updates the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("magnam") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ManagementUpdateNamespaceMetadataRequest req = new ManagementUpdateNamespaceMetadataRequest(                new UpdateNamespaceMetadataRequest() {{
                                metadataKey = "odio";
                                value = new java.util.HashMap<String, Object>() {{
                                    put("esse", "esse");
                                    put("rem", "fuga");
                                }};
                            }};, "reprehenderit");            

            ManagementUpdateNamespaceMetadataResponse res = sdk.namespace.updateMetadata(req);

            if (res.updateNamespaceMetadataResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```