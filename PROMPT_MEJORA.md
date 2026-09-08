# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Sistema distribuido con Kotlin, Ktor, circuit breakers y observabilidad

### Reto
- Tema: Microservicios con Kotlin
- Seniority: junior-l2
- Tipo: practical
- Título: Implementación de un microservicio en Kotlin
- Tiempo estimado: 4 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Configuración del entorno — objetivo: Tener un entorno de desarrollo operativo con las dependencias necesarias. — entregable (NO resolver): Entorno de desarrollo listo con Kotlin y Ktor configurados.
- Fase 2: Implementación del microservicio — objetivo: Implementar el microservicio que procesa solicitudes de transferencia de fondos. — entregable (NO resolver): Microservicio que procesa solicitudes de transferencia de fondos con idempotencia y manejo de timeouts.
- Fase 3: Adición de observabilidad — objetivo: Agregar mecanismos de observabilidad al microservicio. — entregable (NO resolver): Microservicio con mecanismos de observabilidad y trazabilidad de operaciones durante 5 años.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: build.gradle.kts ===
plugins {
    kotlin("jvm") version "1.8.0"
    id("io.ktor.plugin") version "2.3.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.0")
    implementation("io.ktor:ktor-server-netty:2.3.0")
    implementation("io.github.resilience4j:resilience4j-kotlin:1.7.0")
    runtimeOnly("ch.qos.logback:logback-classic:1.2.3")
}


// === ARCHIVO: src/main/kotlin/com/example/transfer/Application.kt ===
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


// === ARCHIVO: src/main/resources/application.conf ===
ktor {
    deployment {
        port = 8080
    }
}


// === ARCHIVO: src/main/kotlin/com/example/transfer/config/ResilienceConfig.kt ===
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


// === ARCHIVO: src/main/kotlin/com/example/transfer/handler/TransferHandler.kt ===
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


// === ARCHIVO: src/main/kotlin/com/example/transfer/service/TransferService.kt ===
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


// === ARCHIVO: src/main/kotlin/com/example/transfer/model/TransferRequest.kt ===
data class TransferRequest(
    val amount: Double,
    val fromAccount: String,
    val toAccount: String
)


// === ARCHIVO: src/main/kotlin/com/example/transfer/observability/LoggingConfig.kt ===
import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory

object LoggingConfig {
    private val logger: Logger = LoggerFactory.getLogger(LoggingConfig::class.java) as Logger

    fun configureLogging() {
        // Configure logging
        logger.info("Logging configured")
    }
}

```
