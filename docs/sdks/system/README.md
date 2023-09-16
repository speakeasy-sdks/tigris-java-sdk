# System

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
                .setSecurity(new Security("ipsum") {{
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


### Response

**[com.tigrisdata.tigris_core.models.operations.HealthAPIHealthResponse](../../models/operations/HealthAPIHealthResponse.md)**


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
                .setSecurity(new Security("incidunt") {{
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


### Response

**[com.tigrisdata.tigris_core.models.operations.ObservabilityGetInfoResponse](../../models/operations/ObservabilityGetInfoResponse.md)**


## observabilityQuotaUsage

Returns current namespace quota limits

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse;
import com.tigrisdata.tigris_core.models.shared.QuotaUsageRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("qui") {{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.shared.QuotaUsageRequest req = new QuotaUsageRequest();            

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

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [com.tigrisdata.tigris_core.models.shared.QuotaUsageRequest](../../models/shared/QuotaUsageRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse](../../models/operations/ObservabilityQuotaUsageResponse.md)**


## queryQuotaLimits

Returns current namespace quota limits

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse;
import com.tigrisdata.tigris_core.models.shared.QuotaLimitsRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("cupiditate") {{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.shared.QuotaLimitsRequest req = new QuotaLimitsRequest();            

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

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [com.tigrisdata.tigris_core.models.shared.QuotaLimitsRequest](../../models/shared/QuotaLimitsRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse](../../models/operations/ObservabilityQuotaLimitsResponse.md)**


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
                .setSecurity(new Security("maxime") {{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest req = new QueryTimeSeriesMetricsRequest() {{
                additionalFunctions = new com.tigrisdata.tigris_core.models.shared.AdditionalFunction[]{{
                    add(new AdditionalFunction() {{
                        rollup = new RollupFunction() {{
                            aggregator = RollupFunctionAggregator.ROLLUP_AGGREGATOR_AVG;
                            interval = 747080L;
                        }};
                    }}),
                }};
                branch = "dicta";
                collection = "laborum";
                db = "totam";
                from = 276894L;
                function = QueryTimeSeriesMetricsRequestFunction.RATE;
                metricName = "dolores";
                quantile = 7168.6f;
                spaceAggregatedBy = new String[]{{
                    add("facilis"),
                }};
                spaceAggregation = QueryTimeSeriesMetricsRequestSpaceAggregation.MIN;
                tigrisOperation = QueryTimeSeriesMetricsRequestTigrisOperation.READ;
                to = 565421L;
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest](../../models/shared/QueryTimeSeriesMetricsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.tigrisdata.tigris_core.models.operations.ObservabilityQueryTimeSeriesMetricsResponse](../../models/operations/ObservabilityQueryTimeSeriesMetricsResponse.md)**

