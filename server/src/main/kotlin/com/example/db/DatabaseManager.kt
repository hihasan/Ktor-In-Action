package com.example.db

import com.example.models.ToDoEntity
import org.ktorm.database.Database
import org.ktorm.dsl.eq
import org.ktorm.dsl.insertAndGenerateKey
import org.ktorm.entity.firstOrNull
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList

class DatabaseManager {
    // config
    private val hostname = "vm-core.fritz.box"
    private val databaseName = "ktor_todo"
    private val username = "root"
    private val password = "Appnap@2021"

    // database
    private val kTormDatabase: Database

    init {
        val jdbcUrl = "jdbc:mysql://$hostname:3306/$databaseName?user=$username&password=$password&useSSL=false"
        kTormDatabase = Database.connect(jdbcUrl)
    }

    fun getAllTodos() : List<DBTodoEntity>{
        return kTormDatabase.sequenceOf(DBTodoTable).toList()
    }

    fun getTodo(id: Int): DBTodoEntity? {
        return kTormDatabase.sequenceOf(DBTodoTable)
            .firstOrNull { it.id eq id }
    }

    fun addTodo(draft: ToDoEntity): ToDoEntity {
        val insertedId = kTormDatabase.insertAndGenerateKey(DBTodoTable) {
            set(DBTodoTable.title, draft.title)
            set(DBTodoTable.body, draft.body)
        } as Int

        return ToDoEntity(insertedId, draft.title, draft.body)
    }
//
//    fun updateTodo(id: Int, draft: ToDoEntity): Boolean {
//        val updatedRows = kTormDatabase.update(DBTodoTable) {
//            set(DBTodoTable.title, draft.title)
//            set(DBTodoTable.done, draft.done)
//            where {
//                it.id eq id
//            }
//        }
//
//        return updatedRows > 0
//    }
//
//    fun removeTodo(id: Int): Boolean {
//        val deletedRows = kTormDatabase.delete(DBTodoTable) {
//            it.id eq id
//        }
//        return deletedRows > 0
//    }
}