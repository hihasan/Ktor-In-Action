package com.example.plugins


import com.example.di.koinModule
import io.ktor.application.*
import io.ktor.features.*
import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin(){
    install(Koin){
        slf4jLogger(level = org.koin.core.logger.Level.ERROR)
//        koinModule
        modules(koinModule)
    }
}