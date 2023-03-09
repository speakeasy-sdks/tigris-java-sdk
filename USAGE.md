<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyPathParams;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.CreateAppKeyRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK.Builder builder = SDK.builder();

            builder.setSecurity(
                new Security() {{
                    bearerAuth = new SchemeBearerAuth() {{
                        authorization = "Bearer YOUR_BEARER_TOKEN_HERE";
                    }};
                }}
            );

            SDK sdk = builder.build();

            TigrisCreateAppKeyRequest req = new TigrisCreateAppKeyRequest() {{
                pathParams = new TigrisCreateAppKeyPathParams() {{
                    project = "unde";
                }};
                request = new CreateAppKeyRequest() {{
                    description = "deserunt";
                    name = "porro";
                }};
            }};

            TigrisCreateAppKeyResponse res = sdk.applicationKeys.tigrisCreateAppKey(req);

            if (res.createAppKeyResponse.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->