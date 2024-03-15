# CacheKeysRequest


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `count`                                                           | *Optional<? extends Long>*                                        | :heavy_minus_sign:                                                | optional - count of keys to return a stream response line.        |
| `cursor`                                                          | *Optional<? extends Long>*                                        | :heavy_minus_sign:                                                | optional - cursor - skip this argument if no cursor is associated |
| `name`                                                            | *String*                                                          | :heavy_check_mark:                                                | cache name                                                        |
| `pattern`                                                         | *Optional<? extends String>*                                      | :heavy_minus_sign:                                                | optional key pattern                                              |
| `project`                                                         | *String*                                                          | :heavy_check_mark:                                                | Tigris project name                                               |