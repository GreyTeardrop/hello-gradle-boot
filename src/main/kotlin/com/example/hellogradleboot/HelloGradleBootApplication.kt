package com.example.hellogradleboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloGradleBootApplication

fun main(args: Array<String>) {
    runApplication<HelloGradleBootApplication>(*args)
}
