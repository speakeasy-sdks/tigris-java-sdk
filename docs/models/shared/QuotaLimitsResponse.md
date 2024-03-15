# QuotaLimitsResponse

Contains current quota limits


## Fields

| Field                                    | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `readUnits`                              | *Optional<? extends Long>*               | :heavy_minus_sign:                       | Number of allowed read units per second  |
| `storageSize`                            | *Optional<? extends Long>*               | :heavy_minus_sign:                       | Maximum number of bytes allowed to store |
| `writeUnits`                             | *Optional<? extends Long>*               | :heavy_minus_sign:                       | Number of allowed write units per second |