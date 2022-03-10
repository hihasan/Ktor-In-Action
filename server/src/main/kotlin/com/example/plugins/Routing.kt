package com.example.plugins

import com.example.routes.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }

        root()
        getAllHeroes()
        searchHeroes()
        insertToDO()
        getAllTodo()

        static("/images") {
            resources("images")
        }
    }
}
