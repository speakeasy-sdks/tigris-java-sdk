# Cache
(*cache()*)

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
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest;
import com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateCacheOptions;
import com.tigrisdata.tigris_core.models.shared.CreateCacheRequest;
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

            CacheCreateCacheRequest req = CacheCreateCacheRequest.builder()
                .createCacheRequest(CreateCacheRequest.builder()
                        .options(CreateCacheOptions.builder()
                            .ttlMs(481196L)
                            .build())
                        .build())
                .name("<value>")
                .project("<value>")
                .build();

            CacheCreateCacheResponse res = sdk.cache().create()
                .request(req)
                .call();

            if (res.createCacheResponse().isPresent()) {
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest](../../models/operations/CacheCreateCacheRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse>](../../models/operations/CacheCreateCacheResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Deletes the cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest;
import com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DeleteCacheRequest;
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

            CacheDeleteCacheRequest req = CacheDeleteCacheRequest.builder()
                .deleteCacheRequest(DeleteCacheRequest.builder()
                        .build())
                .name("<value>")
                .project("<value>")
                .build();

            CacheDeleteCacheResponse res = sdk.cache().delete()
                .request(req)
                .call();

            if (res.deleteCacheResponse().isPresent()) {
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest](../../models/operations/CacheDeleteCacheRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse>](../../models/operations/CacheDeleteCacheResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteKeys

Deletes an entry from cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheDelRequest;
import com.tigrisdata.tigris_core.models.operations.CacheDelResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DelRequest;
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

            CacheDelRequest req = CacheDelRequest.builder()
                .delRequest(DelRequest.builder()
                        .build())
                .key("<value>")
                .name("<value>")
                .project("<value>")
                .build();

            CacheDelResponse res = sdk.cache().deleteKeys()
                .request(req)
                .call();

            if (res.delResponse().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheDelRequest](../../models/operations/CacheDelRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheDelResponse>](../../models/operations/CacheDelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getKey

Reads an entry from cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheGetRequest;
import com.tigrisdata.tigris_core.models.operations.CacheGetResponse;
import com.tigrisdata.tigris_core.models.shared.*;
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

            CacheGetRequest req = CacheGetRequest.builder()
                .key("<value>")
                .name("<value>")
                .project("<value>")
                .build();

            CacheGetResponse res = sdk.cache().getKey()
                .request(req)
                .call();

            if (res.getResponse().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheGetRequest](../../models/operations/CacheGetRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheGetResponse>](../../models/operations/CacheGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSetKey

Sets an entry in the cache and returns the previous value if exists

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheGetSetRequest;
import com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.GetSetRequest;
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

            CacheGetSetRequest req = CacheGetSetRequest.builder()
                .getSetRequest(GetSetRequest.builder()
                        .value("<value>")
                        .build())
                .key("<value>")
                .name("<value>")
                .project("<value>")
                .build();

            CacheGetSetResponse res = sdk.cache().getSetKey()
                .request(req)
                .call();

            if (res.getSetResponse().isPresent()) {
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.tigrisdata.tigris_core.models.operations.CacheGetSetRequest](../../models/operations/CacheGetSetRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse>](../../models/operations/CacheGetSetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

Lists all the caches for the given project

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheListCachesRequest;
import com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse;
import com.tigrisdata.tigris_core.models.shared.*;
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

            CacheListCachesRequest req = CacheListCachesRequest.builder()
                .project("<value>")
                .build();

            CacheListCachesResponse res = sdk.cache().list()
                .request(req)
                .call();

            if (res.listCachesResponse().isPresent()) {
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.tigrisdata.tigris_core.models.operations.CacheListCachesRequest](../../models/operations/CacheListCachesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse>](../../models/operations/CacheListCachesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listKeys

Lists all the key for this cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheKeysRequest;
import com.tigrisdata.tigris_core.models.operations.CacheKeysResponse;
import com.tigrisdata.tigris_core.models.shared.*;
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

            CacheKeysRequest req = CacheKeysRequest.builder()
                .name("<value>")
                .project("<value>")
                .count(618311L)
                .cursor(739921L)
                .pattern("<value>")
                .build();

            CacheKeysResponse res = sdk.cache().listKeys()
                .request(req)
                .call();

            if (res.keysResponse().isPresent()) {
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.tigrisdata.tigris_core.models.operations.CacheKeysRequest](../../models/operations/CacheKeysRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheKeysResponse>](../../models/operations/CacheKeysResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## setKey

Sets an entry in the cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheSetRequest;
import com.tigrisdata.tigris_core.models.operations.CacheSetResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.SetRequest;
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

            CacheSetRequest req = CacheSetRequest.builder()
                .setRequest(SetRequest.builder()
                        .ex(170966L)
                        .nx(false)
                        .px(17597L)
                        .value("<value>")
                        .xx(false)
                        .build())
                .key("<value>")
                .name("<value>")
                .project("<value>")
                .build();

            CacheSetResponse res = sdk.cache().setKey()
                .request(req)
                .call();

            if (res.setResponse().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.tigrisdata.tigris_core.models.operations.CacheSetRequest](../../models/operations/CacheSetRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CacheSetResponse>](../../models/operations/CacheSetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
