package com.example.routes

import com.example.models.ToDoDraft
import com.example.models.ToDoEntity
import com.example.repository.MySQLTodoRepository
import com.example.repository.TodoRepository
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.insertToDO(){

    val todoRepository : TodoRepository by inject()
//    val todoRepository : TodoRepository = MySQLTodoRepository()

    post ("/insert_to_do") {
        try {

            val formParameters = call.receiveParameters()
            val id = formParameters["id"]?.toInt()
            val title = formParameters["title"].toString()
            val body = formParameters["body"].toString()

            val toDoDraft = ToDoEntity(id!!, title, body)

            val toDoValue = todoRepository.addToDO(toDoDraft)

            println(toDoValue)

            call.respond(title)
        } catch (e : java.lang.Exception){
            e.printStackTrace()
        }
    }
}