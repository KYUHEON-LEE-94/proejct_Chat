package project.example.chatwith.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.HandlerMapping
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter
import project.example.chatwith.handler.ChatHandler

/**
 *packageName    : project.example.chatwith.config
 * fileName       : WebSocketConfig
 * author         : LEE KYUHEON
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-28        LEE KYUHEON       최초 생성
 */
@Configuration
class WebSocketConfig {

    @Bean
    fun webSocketMapping(chatHandler: ChatHandler): HandlerMapping {
        val map = mapOf("/ws" to chatHandler)

        val mapping = SimpleUrlHandlerMapping()
        mapping.urlMap = map
        mapping.order = 1
        return mapping
    }

    @Bean
    fun handlerAdapter(): WebSocketHandlerAdapter {
        return WebSocketHandlerAdapter()
    }
}