package com.example.aplikasinote

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert (note: Note)

    @Update
    suspend fun update (note: Note)

    @Delete
    suspend fun delete (note: Note)

    @Query("Select * from notestable order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>
}