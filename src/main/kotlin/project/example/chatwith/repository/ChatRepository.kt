package project.example.chatwith.repository

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import project.example.chatwith.dto.ChatMessage

/**
 *packageName    : project.example.chatwith.repository
 * fileName       : ChatRepository
 * author         : LEE KYUHEON
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-28        LEE KYUHEON       최초 생성
 */
@Repository
interface ChatRepository: ReactiveMongoRepository<ChatMessage, String>