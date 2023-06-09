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
                .setSecurity(new Security("minima") {{
                    bearerAuth = "";
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
                .setSecurity(new Security("distinctio") {{
                    bearerAuth = "";
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
                .setSecurity(new Security("eligendi") {{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.. req = new java.util.HashMap<String, Object>() {{
                put("culpa", "tempore");
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
                .setSecurity(new Security("adipisci") {{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.. req = new java.util.HashMap<String, Object>() {{
                put("consequuntur", "consequatur");
                put("minus", "quaerat");
                put("sapiente", "consectetur");
                put("esse", "blanditiis");
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
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequestFunction;
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequestSpaceAggregation;
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequestTigrisOperation;
import com.tigrisdata.tigris_core.models.shared.RollupFunction;
import com.tigrisdata.tigris_core.models.shared.RollupFunctionAggregator;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("provident") {{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest req = new QueryTimeSeriesMetricsRequest() {{
                additionalFunctions = new com.tigrisdata.tigris_core.models.shared.AdditionalFunction[]{{
                    add(new AdditionalFunction() {{
                        rollup = new RollupFunction() {{
                            aggregator = RollupFunctionAggregator.ROLLUP_AGGREGATOR_AVG;
                            interval = 557811L;
                        }};
                    }}),
                    add(new AdditionalFunction() {{
                        rollup = new RollupFunction() {{
                            aggregator = RollupFunctionAggregator.ROLLUP_AGGREGATOR_MIN;
                            interval = 97468L;
                        }};
                    }}),
                    add(new AdditionalFunction() {{
                        rollup = new RollupFunction() {{
                            aggregator = RollupFunctionAggregator.ROLLUP_AGGREGATOR_AVG;
                            interval = 621679L;
                        }};
                    }}),
                    add(new AdditionalFunction() {{
                        rollup = new RollupFunction() {{
                            aggregator = RollupFunctionAggregator.ROLLUP_AGGREGATOR_MIN;
                            interval = 863023L;
                        }};
                    }}),
                }};
                branch = "possimus";
                collection = "quia";
                db = "eveniet";
                from = 992430L;
                function = QueryTimeSeriesMetricsRequestFunction.NONE;
                metricName = "veritatis";
                quantile = 1594.14f;
                spaceAggregatedBy = new String[]{{
                    add("similique"),
                }};
                spaceAggregation = QueryTimeSeriesMetricsRequestSpaceAggregation.MAX;
                tigrisOperation = QueryTimeSeriesMetricsRequestTigrisOperation.READ;
                to = 949298L;
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
