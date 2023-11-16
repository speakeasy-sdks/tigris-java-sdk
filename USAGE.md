<!-- Start SDK Example Usage -->
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
                .setSecurity(new Security("string"){{
                    bearerAuth = "";
                }})
                .build();

            CacheCreateCacheRequest req = new CacheCreateCacheRequest(new CreateCacheRequest(){{
options = new CreateCacheOptions(){{
    ttlMs = 481196L;
}};
}}, "string", "string");            

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
<!-- End SDK Example Usage -->