package com.develop.multiplatformcrud.data.di

import com.develop.multiplatformcrud.data.local.DatabaseDriverFactory
import com.develop.multiplatformcrud.data.note.SqlDelightNoteDataSource
import com.develop.multiplatformcrud.database.NoteDatabase
import com.develop.multiplatformcrud.domain.note.NoteDataSource

class DatabaseModule {
    private val factory by lazy {DatabaseDriverFactory()}
    val noteDataSource:NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}