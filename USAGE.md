<!-- Start SDK Example Usage -->
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
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDeleteAppKeyRequest req = new TigrisDeleteAppKeyRequest(                new DeleteAppKeyRequest() {{
                                id = "9bd9d8d6-9a67-44e0-b467-cc8796ed151a";
                            }};, "perferendis");            

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
<!-- End SDK Example Usage -->