package com.example.todoexample.di

import android.app.Application
import androidx.room.Room
import com.example.todoexample.TodoApp
import com.example.todoexample.data.TodoDatabase
import com.example.todoexample.data.TodoRepository
import com.example.todoexample.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton

    fun provideTodoDatabase(app: Application): TodoDatabase{
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "tofo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository{
        return TodoRepositoryImpl(db.dao)
    }
}