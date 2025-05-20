package org.example.multiplatformnotesapp.sdk.storage.model

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

/**
 * Data class representing a note in the system.
 */
data class Note(
    val id: String,
    val title: String,
    val content: String,
    val folderId: String,
    val createdAt: Instant,
    val updatedAt: Instant,
    val syncStatus: SyncStatus = SyncStatus.NOT_SYNCED
) {
    companion object {
        /**
         * Creates a new note with the current timestamp.
         */
        fun create(id: String, title: String, content: String, folderId: String): Note {
            val now = Clock.System.now()
            return Note(
                id = id,
                title = title,
                content = content,
                folderId = folderId,
                createdAt = now,
                updatedAt = now
            )
        }
    }
}

/**
 * Enum representing the possible synchronization statuses of a note.
 */
enum class SyncStatus {
    SYNCED,
    SYNCING,
    NOT_SYNCED,
    ERROR
} 