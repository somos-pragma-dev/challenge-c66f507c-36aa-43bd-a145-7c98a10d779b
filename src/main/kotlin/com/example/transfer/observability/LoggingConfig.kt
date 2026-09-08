import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory

object LoggingConfig {
    private val logger: Logger = LoggerFactory.getLogger(LoggingConfig::class.java) as Logger

    fun configureLogging() {
        // Configure logging
        logger.info("Logging configured")
    }
}