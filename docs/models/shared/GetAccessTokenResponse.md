# GetAccessTokenResponse

The response of GetAccessToken which contains access_token and optionally refresh_token.


## Fields

| Field                                       | Type                                        | Required                                    | Description                                 |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `accessToken`                               | *Optional<? extends String>*                | :heavy_minus_sign:                          | An Access Token.                            |
| `expiresIn`                                 | *Optional<? extends Integer>*               | :heavy_minus_sign:                          | Access token expiration timeout in seconds. |
| `refreshToken`                              | *Optional<? extends String>*                | :heavy_minus_sign:                          | The Refresh Token.                          |