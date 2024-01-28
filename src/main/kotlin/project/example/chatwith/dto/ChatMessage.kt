package project.example.chatwith.dto

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 *packageName    : project.example.chatwith.dto
 * fileName       : ChatMessage
 * author         : LEE KYUHEON
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-28        LEE KYUHEON       최초 생성
 */
@Document("chatMessage")
data class ChatMessage(
    @Id
    val id: String?,
    val sender: String?,
    val content: String,
    val time: String
)
