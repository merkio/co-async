package space.geek.projects.kotlin.coasync

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoAsyncApplication

fun main(args: Array<String>) {
    runApplication<CoAsyncApplication>(*args)
}
