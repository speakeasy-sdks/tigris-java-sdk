# ReplaceRequest


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `branch`                                                                        | *String*                                                                        | :heavy_minus_sign:                                                              | Optionally specify a database branch name to perform operation on               |
| `documents`                                                                     | List<[ReplaceRequestDocuments](../../models/shared/ReplaceRequestDocuments.md)> | :heavy_minus_sign:                                                              | Array of documents to be replaced. Each document is a JSON object.              |
| `options`                                                                       | [ReplaceRequestOptions](../../models/shared/ReplaceRequestOptions.md)           | :heavy_minus_sign:                                                              | Additional options for replace requests.                                        |