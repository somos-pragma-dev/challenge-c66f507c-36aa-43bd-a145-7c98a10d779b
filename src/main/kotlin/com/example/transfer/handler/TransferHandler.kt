import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.post
import io.ktor.routing.Route
import com.example.transfer.service.TransferService
import com.example.transfer.model.TransferRequest

object TransferHandler {
    fun configureRoutes(route: Route) {
        route.post("/transfer") {
            val transferRequest = call.receive<TransferRequest>()
            val response = TransferService.processTransfer(transferRequest)
            call.respond(response)
        }
    }
}