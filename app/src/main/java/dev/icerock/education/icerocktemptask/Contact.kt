package dev.icerock.education.icerocktemptask

import kotlinx.serialization.Serializable

@Serializable
data class Contact(
    val firstName: String,
    val lastName: String,
    val avatarResourceId: Int
)

