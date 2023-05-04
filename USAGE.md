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
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            CacheCreateCacheRequest req = new CacheCreateCacheRequest(                new CreateCacheRequest() {{
                                options = new CreateCacheOptions() {{
                                    ttlMs = 592845L;
                                }};;
                            }};, "distinctio", "quibusdam");            

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