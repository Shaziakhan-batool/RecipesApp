package com.example.recipesapp

import androidx.room.Dao
import androidx.room.Query
import com.example.recipesapp.Recipe

@Dao
interface MyDao {

    @Query("SELECT * FROM recipe")
    fun getAll(): List<Recipe?>?
}