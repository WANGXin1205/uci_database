package com.growlithe.uci

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ComputerApplication

fun main(args: Array<String>) {
    runApplication<ComputerApplication>(*args)
}
