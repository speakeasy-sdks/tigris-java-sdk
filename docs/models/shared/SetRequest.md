# SetRequest


## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `ex`                                               | *Long*                                             | :heavy_minus_sign:                                 | optional - ttl specific to this key in second      |
| `nx`                                               | *Boolean*                                          | :heavy_minus_sign:                                 | set only if the key doesn't exist                  |
| `px`                                               | *Long*                                             | :heavy_minus_sign:                                 | optional - ttl specific to this key in millisecond |
| `value`                                            | *String*                                           | :heavy_minus_sign:                                 | free form byte[] value                             |
| `xx`                                               | *Boolean*                                          | :heavy_minus_sign:                                 | set only if the key exist                          |