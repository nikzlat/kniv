package ru.kniv

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KnivApplication

fun main(args: Array<String>) {
	runApplication<KnivApplication>(*args)
}
