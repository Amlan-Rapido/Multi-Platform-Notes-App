package org.example.multiplatformnotesapp.sdk.storage.repository

import kotlinx.coroutines.flow.Flow
import org.example.multiplatformnotesapp.sdk.storage.model.Note

/**
 * Repository interface for accessing and managing notes.
 */
interface NotesRepository {
    /**
     * Gets all notes as a flow.
     */
    fun getAllNotes(): Flow<List<Note>>
    
    /**
     * Gets notes by folder ID as a flow.
     */
    fun getNotesByFolder(folderId: String): Flow<List<Note>>
    
    /**
     * Gets a single note by ID as a flow.
     */
    fun getNoteById(id: String): Flow<Note?>
    
    /**
     * Saves a note, either inserting a new one or updating an existing one.
     */
    suspend fun saveNote(note: Note)
    
    /**
     * Deletes a note by ID.
     */
    suspend fun deleteNote(id: String)
} 