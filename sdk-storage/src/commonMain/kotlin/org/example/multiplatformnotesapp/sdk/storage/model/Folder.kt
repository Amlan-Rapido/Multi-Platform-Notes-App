package org.example.multiplatformnotesapp.sdk.storage.model

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

/**
 * Data class representing a folder that contains notes.
 */
data class Folder(
    val id: String,
    val name: String,
    val createdAt: Instant,
    val updatedAt: Instant,
    val syncStatus: SyncStatus = SyncStatus.NOT_SYNCED
) {
    companion object {
        /**
         * Creates a new folder with the current timestamp.
         */
        fun create(id: String, name: String): Folder {
            val now = Clock.System.now()
            return Folder(
                id = id,
                name = name,
                createdAt = now,
                updatedAt = now
            )
        }
    }
} 