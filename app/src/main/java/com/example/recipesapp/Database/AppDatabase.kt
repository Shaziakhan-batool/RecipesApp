package com.example.recipesapp

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Recipe::class], exportSchema = false, version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getDao(): MyDao
}