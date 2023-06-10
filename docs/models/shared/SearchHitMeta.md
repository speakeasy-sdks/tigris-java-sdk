# SearchHitMeta

Contains metadata related to the search hit, has information about document created_at/updated_at as well.


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `createdAt`                                                                                      | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)        | :heavy_minus_sign:                                                                               | Time at which the document was inserted/replaced. Measured in nano-seconds since the Unix epoch. |
| `updatedAt`                                                                                      | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)        | :heavy_minus_sign:                                                                               | Time at which the document was updated. Measured in nano-seconds since the Unix epoch.           |