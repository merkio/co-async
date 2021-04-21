package space.geek.projects.kotlin.coasync.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {

    @GetMapping
    suspend fun hello(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!")
    }
}