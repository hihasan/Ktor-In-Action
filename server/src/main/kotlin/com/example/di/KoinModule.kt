package com.example.di

import com.example.repository.*
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }

    single<TodoRepository> {
        MySQLTodoRepository()
    }
}