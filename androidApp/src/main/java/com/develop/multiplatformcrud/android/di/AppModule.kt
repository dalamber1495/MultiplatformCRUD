package com.develop.multiplatformcrud.android.di

import android.app.Application
import com.develop.multiplatformcrud.data.local.DatabaseDriverFactory
import com.develop.multiplatformcrud.data.note.SqlDelightNoteDataSource
import com.develop.multiplatformcrud.database.NoteDatabase
import com.develop.multiplatformcrud.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
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
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}