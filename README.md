## `summitdb-client`

A minimal Java client for [summitdb](https://github.com/tidwall/summitdb).

## Implemented `summitdb` commands:

### Keys and values

- [x] APPEND
- [ ] BITCOUNT
- [ ] BITOP
- [ ] BITPOS
- [x] DBSIZE
- [ ] DECR
- [ ] DECRBY
- [x] DEL
- [x] EXISTS
- [x] EXPIRE
- [x] EXPIREAT
- [ ] FENCE
- [ ] FENCEGET
- [x] FLUSHDB
- [x] GET
- [ ] GETBIT
- [ ] GETRANGE
- [ ] GETSET
- [ ] INCR
- [ ] INCRBY
- [ ] INCRBYFLOAT
- [x] KEYS
- [ ] MGET
- [x] MSET
- [ ] MSETNX
- [ ] PDEL
- [ ] PERSIST
- [x] PEXPIRE
- [x] PEXPIREAT
- [x] PTTL
- [ ] RENAME
- [ ] RENAMENX
- [x] SET
- [ ] SETBIT
- [ ] SETRANGE
- [x] STRLEN
- [x] TTL

### JSON

- [x] JSET
- [x] JGET
- [x] JDEL

### Indexes and iteration

- [x] DELINDEX
- [x] INDEXES
- [x] ITER
- [x] RECT
- [x] SETINDEX

### Transactions

- [ ] MULTI
- [ ] EXEC
- [ ] DISCARD

### Scripts

- [ ] EVAL
- [ ] EVALRO
- [ ] EVALSHA
- [ ] EVALSHARO
- [ ] SCRIPT LOAD
- [ ] SCRIPT FLUSH

### Raft management

- [x] RAFTADDPEER
- [x] RAFTREMOVEPEER
- [x] RAFTLEADER
- [x] RAFTSNAPSHOT
- [x] RAFTSTATE
- [x] RAFTSTATS

### Server

- [ ] BACKUP
