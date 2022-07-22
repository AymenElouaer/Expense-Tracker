package com.example.demo.configuration

import org.keycloak.adapters.springsecurity.KeycloakConfiguration
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper
import org.springframework.security.web.authentication.session.NullAuthenticatedSessionStrategy
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy

@KeycloakConfiguration
@EnableGlobalMethodSecurity(prePostEnabled = true)
class SecurityConfig : KeycloakWebSecurityConfigurerAdapter(){
    @Autowired
    lateinit var keyCloackConfig:KeyCloackConfig
    @Autowired
    fun configureGlobal(auth: AuthenticationManagerBuilder) {
        val keycloakAuthenticationProvider = keycloakAuthenticationProvider()
        keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(SimpleAuthorityMapper())
        auth.authenticationProvider(keycloakAuthenticationProvider)
    }
    @Bean
    override fun sessionAuthenticationStrategy(): SessionAuthenticationStrategy {
        return NullAuthenticatedSessionStrategy()
    }


    fun keycloakConfigResolver(): KeyCloackConfig {
        return keyCloackConfig
    }
    override fun configure(http: HttpSecurity) {
        super.configure(http)
        http
            .authorizeRequests()
            //.antMatchers("/api/public/**").permitAll()
            .antMatchers("/user/*").hasRole("user")
            .anyRequest().fullyAuthenticated()
    }
}