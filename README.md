# Implementación de un microservicio en Kotlin

El sistema distribuido gestiona transacciones financieras en tiempo real. El microservicio que debes implementar se encarga de procesar solicitudes de transferencia de fondos. Deberás asegurar la idempotencia del registro de solicitudes por número de operación y canal, manejar correctamente los timeouts del buró de riesgos y asegurar la trazabilidad de cada operación durante 5 años.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Microservicios con Kotlin |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Gradle 8+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `gradle build` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del entorno

**Objetivo:** Tener un entorno de desarrollo operativo con las dependencias necesarias.

**Tiempo estimado:** 30 minutos

**Instrucciones:**

- Configura un entorno de desarrollo con Kotlin y Ktor.
- Asegura que el proyecto esté correctamente estructurado para soportar la implementación de microservicios.

**Entregable:** Entorno de desarrollo listo con Kotlin y Ktor configurados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el entorno debe soportar la implementación de microservicios.

</details>

### Fase 2: Implementación del microservicio

**Objetivo:** Implementar el microservicio que procesa solicitudes de transferencia de fondos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Implementa el microservicio que recibe y procesa solicitudes de transferencia de fondos.
- Asegura la idempotencia del registro de solicitudes por número de operación y canal.
- Maneja correctamente los timeouts del buró de riesgos.

**Entregable:** Microservicio que procesa solicitudes de transferencia de fondos con idempotencia y manejo de timeouts.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que debes asegurar la idempotencia del registro de solicitudes.
- Piensa en cómo manejar los timeouts del buró de riesgos de manera efectiva.

</details>

### Fase 3: Adición de observabilidad

**Objetivo:** Agregar mecanismos de observabilidad al microservicio.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Agrega mecanismos de logging y monitoreo al microservicio.
- Asegura que cada operación sea trazable durante 5 años.

**Entregable:** Microservicio con mecanismos de observabilidad y trazabilidad de operaciones durante 5 años.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que debes asegurar la trazabilidad de cada operación durante 5 años.
- Piensa en los mejores mecanismos de logging y monitoreo para tu microservicio.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio y por qué se usa en sistemas distribuidos?
- **paraQueSirve**: ¿Para qué sirve la idempotencia en el registro de solicitudes?
- **comoSeUsa**: ¿Cómo se manejan los timeouts del buró de riesgos en tu microservicio?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar microservicios y cómo los evitas?
- **queDecisionesImplica**: ¿Qué decisiones implica agregar observabilidad a un microservicio?

## Criterios de Evaluacion

- Configuración correcta del entorno de desarrollo con Kotlin y Ktor.
- Implementación del microservicio que procesa solicitudes de transferencia de fondos con idempotencia y manejo de timeouts.
- Adición de mecanismos de observabilidad y trazabilidad de operaciones durante 5 años.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
