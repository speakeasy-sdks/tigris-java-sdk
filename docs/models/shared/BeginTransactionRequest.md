# BeginTransactionRequest

Start new transaction in project specified by "project".


## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `branch`                                                                                                 | *String*                                                                                                 | :heavy_minus_sign:                                                                                       | Optionally specify a project branch name to perform operation on                                         |
| `options`                                                                                                | [com.tigrisdata.tigris_core.models.shared.TransactionOptions](../../models/shared/TransactionOptions.md) | :heavy_minus_sign:                                                                                       | Options that can be used to modify the transaction semantics.                                            |