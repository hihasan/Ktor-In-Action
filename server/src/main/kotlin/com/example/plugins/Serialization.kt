package com.example.plugins

import io.ktor.serialization.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.gson.*
import kotlinx.serialization.json.JsonNull.content
import kotlinx.serialization.serializerOrNull

fun Application.configureSerialization() {
    install(ContentNegotiation) {
//        json()
        gson {
            setPrettyPrinting()
//            disableHtmlEscaping()
        }
    }
}
