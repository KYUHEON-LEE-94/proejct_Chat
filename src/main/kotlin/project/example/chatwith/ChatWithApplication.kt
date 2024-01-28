package project.example.chatwith

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatWithApplication

fun main(args: Array<String>) {
    runApplication<ChatWithApplication>(*args)
}
