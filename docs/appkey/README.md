# appKey

## Overview

The application keys section provide APIs that can be used to manage application keys for your project. A single project can have one or more application keys.

### Available Operations

* [delete](#delete) - Deletes the app key
* [list](#list) - List all the app keys
* [rotate](#rotate) - Rotates the app key secret
* [tigrisCreateAppKey](#tigriscreateappkey) - Creates the app key
* [update](#update) - Updates the description of the app key

## delete

Delete an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteAppKeyRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsam") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDeleteAppKeyRequest req = new TigrisDeleteAppKeyRequest(                new DeleteAppKeyRequest() {{
                                id = "dfc2ddf7-cc78-4ca1-ba92-8fc816742cb7";
                            }};, "ipsum");            

            TigrisDeleteAppKeyResponse res = sdk.appKey.delete(req);

            if (res.deleteAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## list

Lists all app keys visible to requesting actor.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("excepturi") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisListAppKeysRequest req = new TigrisListAppKeysRequest("aspernatur");            

            TigrisListAppKeysResponse res = sdk.appKey.list(req);

            if (res.listAppKeysResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## rotate

Endpoint is used to rotate the secret for the app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse;
import com.tigrisdata.tigris_core.models.shared.RotateAppKeyRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("perferendis") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisRotateAppKeySecretRequest req = new TigrisRotateAppKeySecretRequest(                new RotateAppKeyRequest() {{
                                id = "5929396f-ea75-496e-b10f-aaa2352c5955";
                                project = "excepturi";
                            }};, "accusantium");            

            TigrisRotateAppKeySecretResponse res = sdk.appKey.rotate(req);

            if (res.rotateAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## tigrisCreateAppKey

Create an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.CreateAppKeyRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("iure") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisCreateAppKeyRequest req = new TigrisCreateAppKeyRequest(                new CreateAppKeyRequest() {{
                                description = "culpa";
                                name = "Darrin Brakus";
                            }};, "culpa");            

            TigrisCreateAppKeyResponse res = sdk.appKey.tigrisCreateAppKey(req);

            if (res.createAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## update

Update the description of an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateAppKeyRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("consequuntur") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisUpdateAppKeyRequest req = new TigrisUpdateAppKeyRequest(                new UpdateAppKeyRequest() {{
                                description = "repellat";
                                id = "a9467739-251a-4a52-83f5-ad019da1ffe7";
                                name = "Jan Bednar";
                            }};, "cum");            

            TigrisUpdateAppKeyResponse res = sdk.appKey.update(req);

            if (res.updateAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
