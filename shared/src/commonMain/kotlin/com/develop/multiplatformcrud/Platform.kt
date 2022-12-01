package com.develop.multiplatformcrud

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform