package com.nononsensecode.oauth.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
class ResourceServerConfig: WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http
            ?.cors()
            ?.and()
            ?.authorizeRequests()
            ?.antMatchers("/api/heroes/**")
                ?.hasAuthority("SCOPE_heroes")
            ?.and()
            ?.oauth2ResourceServer()
                ?.jwt()

    }
}