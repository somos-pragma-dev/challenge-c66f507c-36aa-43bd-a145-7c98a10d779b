import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import com.example.transfer.config.ResilienceConfig
import com.example.transfer.handler.TransferHandler
import io.ktor.routing.routing

fun main() {
    embeddedServer(Netty, port = 8080) {
        ResilienceConfig.configureResilience()
        routing {
            TransferHandler.configureRoutes(this)
        }
    }.start(wait = true)
}