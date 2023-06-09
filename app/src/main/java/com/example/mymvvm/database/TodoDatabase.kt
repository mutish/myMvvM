//package com.example.mymvvm.database
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//
//@Database(entities = [TodoItem::class], version = 1, exportSchema = false)
//abstract class TodoDatabase : RoomDatabase() {
//    abstract fun todoDao(): ToDoDatabaseDAO
//
//    companion object {
//
//        private var INSTANCE: TodoDatabase? = null
//
//        fun getInstance(context: Context): TodoDatabase {
//            synchronized(this) {
//                var instance = INSTANCE
//
//                if (instance == null) {
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        TodoDatabase::class.java,
//                        "todo_list_database"
//                    ).fallbackToDestructiveMigration()
//                        .build()
//
//                    INSTANCE = instance
//                }
//
//                return instance
//            }
//        }
//    }
//}