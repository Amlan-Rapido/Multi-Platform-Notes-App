package org.example.multiplatformnotesapp.sdk.storage.repository

import kotlinx.coroutines.flow.Flow
import org.example.multiplatformnotesapp.sdk.storage.model.Folder

/**
 * Repository interface for accessing and managing folders.
 */
interface iFoldersRepository {
    /**
     * Gets all folders as a flow.
     */
    fun getAllFolders(): Flow<List<Folder>>
    
    /**
     * Gets a single folder by ID as a flow.
     */
    fun getFolderById(id: String): Flow<Folder?>
    
    /**
     * Saves a folder, either inserting a new one or updating an existing one.
     */
    suspend fun saveFolder(folder: Folder)
    
    /**
     * Deletes a folder by ID.
     */
    suspend fun deleteFolder(id: String)
} 