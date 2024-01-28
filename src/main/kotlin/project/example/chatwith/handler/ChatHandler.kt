package project.example.chatwith.handler

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketMessage
import org.springframework.web.reactive.socket.WebSocketSession
import project.example.chatwith.repository.ChatRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

/**
 *packageName    : project.example.chatwith.handler
 * fileName       : ChatHandler
 * author         : LEE KYUHEON
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-28        LEE KYUHEON       최초 생성
 */
@Component
class ChatHandler(
    @Autowired
    val chatRepository: ChatRepository

):WebSocketHandler {

    private val message : Flux<String> = Flux.create<String?> {

    }.share()

    override fun handle(session: WebSocketSession): Mono<Void> {
        val input = session.receive()
            .map (WebSocketMessage::getPayloadAsText)
            .collectList()

        val output = session.send(message.map(session::textMessage) )

        return Mono.zip(input, output).then()
    }
}