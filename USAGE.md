<!-- Start SDK Example Usage [usage] -->
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
<!-- End SDK Example Usage [usage] -->