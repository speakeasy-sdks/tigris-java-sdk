<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteAppKeyRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDeleteAppKeyRequest req = new TigrisDeleteAppKeyRequest() {{
                deleteAppKeyRequest = new DeleteAppKeyRequest() {{
                    id = "89bd9d8d-69a6-474e-8f46-7cc8796ed151";
                }};
                project = "deserunt";
            }}            

            TigrisDeleteAppKeyResponse res = sdk.appKey.delete(req);

            if (res.deleteAppKeyResponse.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->