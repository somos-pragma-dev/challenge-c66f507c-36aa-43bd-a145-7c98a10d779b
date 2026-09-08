import com.example.transfer.model.TransferRequest
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import io.github.resilience4j.retry.annotation.Retry
import kotlinx.coroutines.runBlocking

object TransferService {
    @CircuitBreaker(name = "transferCircuitBreaker", fallbackMethod = "fallbackProcessTransfer")
    @Retry(name = "transferRetry")
    fun processTransfer(transferRequest: TransferRequest): String {
        runBlocking {
            // Simulate processing
            Thread.sleep(1000)
        }
        return "Transfer processed"
    }

    fun fallbackProcessTransfer(transferRequest: TransferRequest, throwable: Throwable): String {
        return "Fallback: Transfer processing failed"
    }
}