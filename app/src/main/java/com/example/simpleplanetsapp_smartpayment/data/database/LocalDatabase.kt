package com.example.simpleplanetsapp_smartpayment.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.simpleplanetsapp_smartpayment.domain.entity.User

@Database(entities = [User::class], version = 1)
abstract class LocalDatabase: RoomDatabase() {

    abstract fun usersDao(): UsersDao

    companion object {
        private const val DATABASE_NAME = "local_database"
        @Volatile
        private var INSTANCE: LocalDatabase? = null

        fun getInstance(context: Context): LocalDatabase? {
            INSTANCE ?: synchronized(this) {
                INSTANCE =
                    Room.databaseBuilder(
                        context.applicationContext, LocalDatabase::class.java, DATABASE_NAME)
                        .fallbackToDestructiveMigration()
                        .build()
            }
            return INSTANCE
        }
    }

}