# cache

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
                .setSecurity(new Security("quis") {{
                    bearerAuth = "";
                }})
                .build();

            CacheCreateCacheRequest req = new CacheCreateCacheRequest(                new CreateCacheRequest() {{
                                options = new CreateCacheOptions() {{
                                    ttlMs = 110375L;
                                }};;
                            }};, "laborum", "animi");            

            CacheCreateCacheResponse res = sdk.cache.create(req);

            if (res.createCacheResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## delete

Deletes the cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest;
import com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("enim") {{
                    bearerAuth = "";
                }})
                .build();

            CacheDeleteCacheRequest req = new CacheDeleteCacheRequest(                new java.util.HashMap<String, Object>() {{
                                put("quo", "sequi");
                            }}, "tenetur", "ipsam");            

            CacheDeleteCacheResponse res = sdk.cache.delete(req);

            if (res.deleteCacheResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteKeys

Deletes an entry from cache

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.CacheDelRequest;
import com.tigrisdata.tigris_core.models.operations.CacheDelResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("id") {{
                    bearerAuth = "";
                }})
                .build();

            CacheDelRequest req = new CacheDelRequest(                new java.util.HashMap<String, Object>() {{
                                put("aut", "quasi");
                                put("error", "temporibus");
                                put("laborum", "quasi");
                                put("reiciendis", "voluptatibus");
                            }}, "vero", "nihil", "praesentium");            

            CacheDelResponse res = sdk.cache.deleteKeys(req);

            if (res.delResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("voluptatibus") {{
                    bearerAuth = "";
                }})
                .build();

            CacheGetRequest req = new CacheGetRequest("ipsa", "omnis", "voluptate");            

            CacheGetResponse res = sdk.cache.getKey(req);

            if (res.getResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("cum") {{
                    bearerAuth = "";
                }})
                .build();

            CacheGetSetRequest req = new CacheGetSetRequest(                new GetSetRequest() {{
                                value = "perferendis";
                            }};, "doloremque", "reprehenderit", "ut");            

            CacheGetSetResponse res = sdk.cache.getSetKey(req);

            if (res.getSetResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("maiores") {{
                    bearerAuth = "";
                }})
                .build();

            CacheListCachesRequest req = new CacheListCachesRequest("dicta");            

            CacheListCachesResponse res = sdk.cache.list(req);

            if (res.listCachesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("corporis") {{
                    bearerAuth = "";
                }})
                .build();

            CacheKeysRequest req = new CacheKeysRequest("dolore", "iusto") {{
                count = 118727L;
                cursor = 688661L;
                pattern = "enim";
            }};            

            CacheKeysResponse res = sdk.cache.listKeys(req);

            if (res.keysResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("accusamus") {{
                    bearerAuth = "";
                }})
                .build();

            CacheSetRequest req = new CacheSetRequest(                new SetRequest() {{
                                ex = 414263L;
                                nx = false;
                                px = 918236L;
                                value = "quae";
                                xx = false;
                            }};, "ipsum", "quidem", "molestias");            

            CacheSetResponse res = sdk.cache.setKey(req);

            if (res.setResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
