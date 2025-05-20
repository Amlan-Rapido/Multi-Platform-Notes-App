package org.example.multiplatformnotesapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform