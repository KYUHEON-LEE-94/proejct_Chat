package project.example.chatwith.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *packageName    : project.example.chatwith
 * fileName       : chatController
 * author         : LEE KYUHEON
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-28        LEE KYUHEON       최초 생성
 */
@RestController
@RequestMapping("/chat")
class ChatHandler {
    @GetMapping()
    fun showChatAll(): String {
        return "Hello, RESTful World!"
    }
    @PostMapping("/input")
    fun sendChat(): String {
        return "Hello, RESTful World!"
    }
}