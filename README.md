# SimpleDynamo
Prototype of Amazon DynamoDB


Simplified version of Dynamo (Key-Value storage), covers :

ID space partitioning/re-partitioning.
Ring based routing
Node joins
Quorum based replication
Recovery from replicated storage after failure
SHA-1 hash function is used to lexically arrange nodes in a ring and find the location for a particular key to be stored.

Each node maintains a successor and predecessor pointer for nodes in the ring.
Content Provider is NoSQL storage that:

The first column should be named as “key”. This column is used to store all keys.
The first column should be named as “value”. This column is used to store all values.
Finger tables are not implemented.

Failure Handling: All focus on correctness rather than performance
