package com.nononsensecode.oauth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OAuthApplication

fun main(args: Array<String>) {
    runApplication<OAuthApplication>(*args)
}