package com.example.mymvvm.database

//import androidx.lifecycle.LiveData
//
//class ToDoRepository(private val toDoDatabaseDAO: ToDoDatabaseDAO) {
//    val readAllData:LiveData<List<TodoItem>> =toDoDatabaseDAO.getAll()
//
//    suspend fun addTodo(todoItem: TodoItem){
//        toDoDatabaseDAO.insert(todoItem)
//    }
//    suspend fun updateTodo(todoItem: TodoItem){
//        toDoDatabaseDAO.update(todoItem)
//    }
//    suspend fun deleteTodo(todoItem: TodoItem){
//        toDoDatabaseDAO.delete(todoItem)
//    }
//    suspend fun deleteAllTodo(todoItem: TodoItem){
//        toDoDatabaseDAO.deleteAllTodos()
//    }
//
//}