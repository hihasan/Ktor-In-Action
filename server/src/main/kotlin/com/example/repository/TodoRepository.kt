package com.example.repository

import com.example.models.ToDoEntity

interface TodoRepository {
    fun getAllToDOs() : List<ToDoEntity>
    fun getToDo(id : Int) : ToDoEntity?
    fun addToDO(draft : ToDoEntity) : ToDoEntity
    fun removeTodo(id : Int) : ToDoEntity
    fun updateToDO(id : Int, draft: ToDoEntity) : Boolean
}