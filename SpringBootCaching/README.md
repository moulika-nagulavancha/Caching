# Spring Boot Caching
* What is Caching?
  * Keeping frequently accessed data, objects, images and data closer when you need them.
  * Positioned between Client and Server.
  * Integrated between Application and Database Layer.
* When to use Caching?
  * Repetitive data return for same input.
  * Save Monetary Costs.
  * Improve Latency between Software Layers.
* How to do Caching?
  * Enable Caching                      @EnableCaching
  * Store the data in Cache             @Cacheable(cacheNames="test", key="#id")
    * Used on methods that are cacheable
    * CacheManager
    * CacheResolver
    * Synchronized Caching
  * Update the data in Cache            @CachePut(cacheNames="test", key="#id")
  * Evict or Clear the data in Cache    @CacheEvict(cacheNames="test", allEntries=true)
* Other types
  * To provide multiple annotations     @Caching
  * Class level                         @CacheConfig
* Types of Cache Providers
  * JDK Concurrent Map based Cache
  * EhCache based Cache
  * Caffeine Cache
  * Redis Cache
* Eviction Policy, TTI, TTL