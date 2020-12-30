package com.nononsensecode.oauth.controller

import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://localhost:4200", "http://localhost:8000"])
@RestController
@RequestMapping("/api/heroes")
class HeroController {

    private val someHeroes = mutableListOf(
        Hero(1, "Ken"),
        Hero(2, "Yannick"),
        Hero(3, "Pieter")
    )

    @GetMapping
    fun getHeroes(): List<Hero> = this.someHeroes

    @GetMapping("/{id}")
    fun getHeroById(@PathVariable("id") id: String): Hero? {
        return someHeroes.find { it.id.toString() == id }
    }
}

data class Hero(
    val id: Int,
    val name: String
)