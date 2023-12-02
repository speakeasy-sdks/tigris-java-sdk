# Cache
(*cache*)

## Overview

The cache section provide APIs that can be used to perform cache operations.

### Available Operations

* [create](#create) - Creates the cache
* [delete](#delete) - Deletes the cache
* [deleteKeys](#deletekeys) - Deletes an entry from cache
* [getKey](#getkey) - Reads an entry from cache
* [getSetKey](#getsetkey) - Sets an entry in the cache and returns the previous value if exists
* [list](#list) - Lists all the caches for the given project
* [listKeys](#listkeys) - Lists all the key for this cache
* [setKey](#setkey) - Sets an entry in the cache

## create

Creates the cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest;
import com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse;
import com.tigrisdata.tigris_core.models.shared.CreateCacheOptions;
import com.tigrisdata.tigris_core.models.shared.CreateCacheRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest req = new CacheCreateCacheRequest(
                new CreateCacheRequest(
){{
                    options = new CreateCacheOptions(
){{
                        ttlMs = 481196L;

                    }};

                }},
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse res = sdk.cache.create(req);

            if (res.createCacheResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest](../../models/operations/CacheCreateCacheRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse](../../models/operations/CacheCreateCacheResponse.md)**


## delete

Deletes the cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest;
import com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteCacheRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest req = new CacheDeleteCacheRequest(
                new DeleteCacheRequest(
),
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse res = sdk.cache.delete(req);

            if (res.deleteCacheResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest](../../models/operations/CacheDeleteCacheRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse](../../models/operations/CacheDeleteCacheResponse.md)**


## deleteKeys

Deletes an entry from cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheDelRequest;
import com.tigrisdata.tigris_core.models.operations.CacheDelResponse;
import com.tigrisdata.tigris_core.models.shared.DelRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheDelRequest req = new CacheDelRequest(
                new DelRequest(
),
                "string",
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.CacheDelResponse res = sdk.cache.deleteKeys(req);

            if (res.delResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheDelRequest](../../models/operations/CacheDelRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheDelResponse](../../models/operations/CacheDelResponse.md)**


## getKey

Reads an entry from cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheGetRequest;
import com.tigrisdata.tigris_core.models.operations.CacheGetResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheGetRequest req = new CacheGetRequest(
                "string",
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.CacheGetResponse res = sdk.cache.getKey(req);

            if (res.getResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheGetRequest](../../models/operations/CacheGetRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheGetResponse](../../models/operations/CacheGetResponse.md)**


## getSetKey

Sets an entry in the cache and returns the previous value if exists

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheGetSetRequest;
import com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse;
import com.tigrisdata.tigris_core.models.shared.GetSetRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheGetSetRequest req = new CacheGetSetRequest(
                new GetSetRequest(
){{
                    value = "string";

                }},
                "string",
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse res = sdk.cache.getSetKey(req);

            if (res.getSetResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.tigrisdata.tigris_core.models.operations.CacheGetSetRequest](../../models/operations/CacheGetSetRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse](../../models/operations/CacheGetSetResponse.md)**


## list

Lists all the caches for the given project

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheListCachesRequest;
import com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheListCachesRequest req = new CacheListCachesRequest(
                "string");

            com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse res = sdk.cache.list(req);

            if (res.listCachesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.tigrisdata.tigris_core.models.operations.CacheListCachesRequest](../../models/operations/CacheListCachesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse](../../models/operations/CacheListCachesResponse.md)**


## listKeys

Lists all the key for this cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheKeysRequest;
import com.tigrisdata.tigris_core.models.operations.CacheKeysResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheKeysRequest req = new CacheKeysRequest(
                "string",
                "string"){{
                count = 618311L;
                cursor = 739921L;
                pattern = "string";

            }};

            com.tigrisdata.tigris_core.models.operations.CacheKeysResponse res = sdk.cache.listKeys(req);

            if (res.keysResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.tigrisdata.tigris_core.models.operations.CacheKeysRequest](../../models/operations/CacheKeysRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheKeysResponse](../../models/operations/CacheKeysResponse.md)**


## setKey

Sets an entry in the cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheSetRequest;
import com.tigrisdata.tigris_core.models.operations.CacheSetResponse;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.SetRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.CacheSetRequest req = new CacheSetRequest(
                new SetRequest(
){{
                    ex = 170966L;
                    nx = false;
                    px = 17597L;
                    value = "string";
                    xx = false;

                }},
                "string",
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.CacheSetResponse res = sdk.cache.setKey(req);

            if (res.setResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheSetRequest](../../models/operations/CacheSetRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.CacheSetResponse](../../models/operations/CacheSetResponse.md)**

