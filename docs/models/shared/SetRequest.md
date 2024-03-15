# SetRequest


## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `ex`                                               | *Optional<? extends Long>*                         | :heavy_minus_sign:                                 | optional - ttl specific to this key in second      |
| `nx`                                               | *Optional<? extends Boolean>*                      | :heavy_minus_sign:                                 | set only if the key doesn't exist                  |
| `px`                                               | *Optional<? extends Long>*                         | :heavy_minus_sign:                                 | optional - ttl specific to this key in millisecond |
| `value`                                            | *Optional<? extends String>*                       | :heavy_minus_sign:                                 | free form byte[] value                             |
| `xx`                                               | *Optional<? extends Boolean>*                      | :heavy_minus_sign:                                 | set only if the key exist                          |