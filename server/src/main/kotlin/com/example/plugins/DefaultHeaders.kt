package com.example.plugins

import io.ktor.server.application.*
import io.netty.handler.codec.DefaultHeaders

fun Application.configDefaultHeader(){
    install(DefaultHeaders()){

    }
}