package edu.muniz.askalien.admin.config

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain


@EnableWebFluxSecurity
class OAuth2SecurityConfig {

    @Bean
    fun security(http: ServerHttpSecurity): SecurityWebFilterChain? {
        http
                .csrf().disable()
                .authorizeExchange()
                .pathMatchers("/admin/**").permitAll()
                .and().httpBasic()
        return http.build()
    }


}