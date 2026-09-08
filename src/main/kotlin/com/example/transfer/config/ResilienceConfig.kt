import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry
import io.github.resilience4j.retry.Retry
import io.github.resilience4j.retry.RetryConfig
import io.github.resilience4j.bulkhead.Bulkhead
import io.github.resilience4j.bulkhead.BulkheadConfig
import io.github.resilience4j.bulkhead.BulkheadRegistry

object ResilienceConfig {
    private val circuitBreakerRegistry = CircuitBreakerRegistry.ofDefaults()
    private val retryRegistry = RetryRegistry.ofDefaults()
    private val bulkheadRegistry = BulkheadRegistry.ofDefaults()

    fun configureResilience() {
        // Configure CircuitBreaker
        val circuitBreakerConfig = CircuitBreakerConfig.custom()
           .failureRateThreshold(50)
           .waitDurationInOpenState(java.time.Duration.ofSeconds(60))
           .build()
        val circuitBreaker = circuitBreakerRegistry.circuitBreaker("transferCircuitBreaker", circuitBreakerConfig)

        // Configure Retry
        val retryConfig = RetryConfig.custom<Any>()
           .maxAttempts(3)
           .build()
        val retry = retryRegistry.retry("transferRetry", retryConfig)

        // Configure Bulkhead
        val bulkheadConfig = BulkheadConfig.custom()
           .maxConcurrentCalls(10)
           .maxWaitDuration(java.time.Duration.ofSeconds(10))
           .build()
        val bulkhead = bulkheadRegistry.bulkhead("transferBulkhead", bulkheadConfig)
    }
}