package com.example.aplikasinote

import androidx.lifecycle.LiveData

class NoteRepository(private val notesDao: NotesDao) {
    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()
    suspend fun inset(note: Note){
        notesDao.insert(note)
    }

    suspend fun delete(note: Note){
        notesDao.delete(note)
    }
    suspend fun update(note: Note){
        notesDao.update(note)
    }
}