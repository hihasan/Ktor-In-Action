package com.example.repository

import com.example.models.ToDoEntity

class InMemoryToDoRepository : TodoRepository {

    private val todos = mutableListOf<ToDoEntity>()

    override fun getAllToDOs(): List<ToDoEntity> {
        return todos
    }

    override fun getToDo(id: Int): ToDoEntity? {
        return todos.firstOrNull(){it.id == id }
    }

    override fun addToDO(draft: ToDoEntity): ToDoEntity {
        val todoEntity = ToDoEntity(
            id = todos.size +1,
            title = draft.title,
            body = draft.body
        )
        
        todos.add(todoEntity)
        return todoEntity
    }

    override fun removeTodo(id: Int): ToDoEntity {
        TODO("Not yet implemented")
    }

    override fun updateToDO(id: Int, draft: ToDoEntity): Boolean {
        TODO("Not yet implemented")
    }
}