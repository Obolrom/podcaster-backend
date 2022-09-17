package io.romix.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello, World")
        }

        get("/test") {
            call.respondText("Test Hello World")
        }

        post("/bitch") {
            call.respondText("fuck you")
        }
    }
}
