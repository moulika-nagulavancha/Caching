# Spring Boot Caching with EhCache
* Java's most widely used Cache.
* Open source
* Commercial Support by Terracota Inc.
* Robust, proven, full-featured, and integrates with other popular libraries and frameworks.
* Can be used with Hiberante as General Purpose and also @nd level cache.
* Integrates with Spring, Google App Engine etc.,
* Factors that affect Caching?
  * Liveliness
  * Proportion of data cached
  * Shape of usage distribution - 80/20
  * Read/Write ratio
* Topology
  * Standalone - in memory
  * Distributed
  * Replicated
* Storage Tiers
  * Memory Store - Subject to Garbage Collector
  * Off Heap Store - available upto RAM
  * Disk Store
* https://www.ehcache.org/documentation/2.10.4/pdf/index.html