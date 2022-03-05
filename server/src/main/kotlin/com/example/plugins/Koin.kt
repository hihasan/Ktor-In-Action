package com.example.plugins

import io.ktor.server.application.*
import org.koin.ktor.ext.Koin

fun Application.configureKoin(){
    install(Koin){
    }
}

fun install(plugin: Koin.Feature, configure: Any) {
    TODO("Not yet implemented")
}
