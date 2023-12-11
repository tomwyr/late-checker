package com.tomwyr

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.serialization.Serializable

@Serializable
enum class StreamStatus {
    Live,
    Late,
    Offline,
}

@Serializable
data class StreamerInfo(
        val name: String,
        val imageUrl: String,
        val streamUrl: String,
        val timeZone: TimeZone,
)

@Serializable
data class LateInfo(
        val streamerInfo: StreamerInfo,
        val streamStatus: StreamStatus,
        val streamStart: Instant,
)