package com.example.routes

import com.example.repository.MySQLTodoRepository
import com.example.repository.TodoRepository
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.getAllTodo() {
    val repository: TodoRepository = MySQLTodoRepository()

    get ("/todo_list") {
        try {
            call.respond(repository.getAllToDOs())
        } catch (e : Exception){
            e.printStackTrace()
        }
    }

}