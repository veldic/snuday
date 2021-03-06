package com.wafflestudio.snuday.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.time.LocalDateTime

@JsonClass(generateAdapter = true)
data class Notice(
    @Json(name = "id") val id: Int,
    @Json(name = "title") val title: String,
    @Json(name = "contents") val contents: String,
    @Json(name = "channel") val channelId: Int,
    @Json(name = "channel_name") val channelName: String,
    @Json(name = "created_at") val createdAt: LocalDateTime,
    @Json(name = "images") val images: List<String>?,
    @Json(name = "writer_name") val writerName: String,
    @Json(name = "channel_color") var channelColor: ChannelColor?
)