package com.example.repository

import com.example.db.DatabaseManager
import com.example.models.ToDoEntity

class MySQLTodoRepository : TodoRepository {
    private val database = DatabaseManager()
    override fun getAllToDOs(): List<ToDoEntity> {
        return database.getAllTodos()
            .map { ToDoEntity(it.id, it.title, it.body) }
    }

    override fun getToDo(id: Int): ToDoEntity? {
        return database.getTodo(id)?.let { ToDoEntity(it.id, it.title, it.body) }
    }

    override fun addToDO(draft: ToDoEntity): ToDoEntity {
        return database.addTodo(draft)
    }

    override fun removeTodo(id: Int): ToDoEntity {
        TODO("Not yet implemented")
    }

    override fun updateToDO(id: Int, draft: ToDoEntity): Boolean {
        TODO("Not yet implemented")
    }

}