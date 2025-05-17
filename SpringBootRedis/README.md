# Spring Boot Caching with Redis

* REDIS = REmote DIctionary Server
* Open Source
* Written in ANSI C
* In memory data structure Store
  * Strings, Hashes, List, Set, Sorted Set etc.,
* What is REDIS?
  * Built-in replication
  * LRU Eviction
  * Transactions
  * Disk-level persistence
  * Usage
    * Database
    * Cache
    * Message Broker
  * Can be used with different Languages.


# How to Run?
* Start the docker with Redis image on port 6379.
* Check the compose.yaml and application.properties with the appropriate values related to docker image.
* open CMD and run sudo docker exec -it container_id redis-cli
* This opens the redis-cli to interact with the REDIS DB.
* KEYS * (gets all the keys in Redis DB)