//package com.example.mymvvm.database
//import androidx.lifecycle.LiveData
//import androidx.room.*
//
//@Dao
//interface ToDoDatabaseDAO {
//    @Query("SELECT * from my_to_do_list")
//    fun getAll(): LiveData<List<TodoItem>>
//
//    @Query("SELECT * from my_to_do_list where itemId = :id")
//    fun getById(id : Int) : LiveData<TodoItem?>
//
//    @Insert
//    suspend fun insert(item: TodoItem)
//
//    @Update
//    suspend fun update(item: TodoItem)
//
//    @Delete
//    suspend fun delete(item: TodoItem) : Integer
//
//    @Query("DELETE FROM my_to_do_list")
//    suspend fun deleteAllTodos() : Integer
//}
