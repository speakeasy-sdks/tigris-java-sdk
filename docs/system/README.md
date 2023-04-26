# system

## Overview

The Observability section has APIs that provides full visibility into the health, metrics, and monitoring of the Server.

### Available Operations

* [getHealth](#gethealth) - Health Check
* [getServerInfo](#getserverinfo) - Information about the server
* [observabilityQuotaUsage](#observabilityquotausage) - Queries current namespace quota usage
* [queryQuotaLimits](#queryquotalimits) - Queries current namespace quota limits
* [queryTimeSeriesMetrics](#querytimeseriesmetrics) - Queries time series metrics

## getHealth

This endpoint can be used to check the liveness of the server.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.HealthAPIHealthResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("voluptate") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            HealthAPIHealthResponse res = sdk.system.getHealth();

            if (res.healthCheckResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getServerInfo

Provides the information about the server. This information includes returning the server version, etc.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ObservabilityGetInfoResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsa") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ObservabilityGetInfoResponse res = sdk.system.getServerInfo();

            if (res.getInfoResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## observabilityQuotaUsage

Returns current namespace quota limits

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("minima") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.tigrisdata.tigris_core.models.. req = new java.util.HashMap<String, Object>() {{
                put("consectetur", "adipisci");
            }}            

            ObservabilityQuotaUsageResponse res = sdk.system.observabilityQuotaUsage(req);

            if (res.quotaUsageResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## queryQuotaLimits

Returns current namespace quota limits

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("iste") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.tigrisdata.tigris_core.models.. req = new java.util.HashMap<String, Object>() {{
                put("accusantium", "rem");
                put("aut", "laudantium");
                put("eum", "mollitia");
                put("ab", "corrupti");
            }}            

            ObservabilityQuotaLimitsResponse res = sdk.system.queryQuotaLimits(req);

            if (res.quotaLimitsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## queryTimeSeriesMetrics

Queries time series metrics

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQueryTimeSeriesMetricsResponse;
import com.tigrisdata.tigris_core.models.shared.AdditionalFunction;
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest;
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequestFunctionEnum;
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequestSpaceAggregationEnum;
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequestTigrisOperationEnum;
import com.tigrisdata.tigris_core.models.shared.RollupFunction;
import com.tigrisdata.tigris_core.models.shared.RollupFunctionAggregatorEnum;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("non") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest req = new QueryTimeSeriesMetricsRequest() {{
                additionalFunctions = new com.tigrisdata.tigris_core.models.shared.AdditionalFunction[]{{
                    add(new AdditionalFunction() {{
                        rollup = new RollupFunction() {{
                            aggregator = RollupFunctionAggregatorEnum.ROLLUP_AGGREGATOR_COUNT;
                            interval = 580152L;
                        }};
                    }}),
                }};
                branch = "numquam";
                collection = "impedit";
                db = "explicabo";
                from = 376226L;
                function = QueryTimeSeriesMetricsRequestFunctionEnum.RATE;
                metricName = "dignissimos";
                quantile = 1154.84;
                spaceAggregatedBy = new String[]{{
                    add("natus"),
                    add("velit"),
                    add("voluptatibus"),
                    add("voluptas"),
                }};
                spaceAggregation = QueryTimeSeriesMetricsRequestSpaceAggregationEnum.SUM;
                tigrisOperation = QueryTimeSeriesMetricsRequestTigrisOperationEnum.ALL;
                to = 409054L;
            }};            

            ObservabilityQueryTimeSeriesMetricsResponse res = sdk.system.queryTimeSeriesMetrics(req);

            if (res.queryTimeSeriesMetricsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
