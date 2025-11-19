package com.example.deltaforceemulator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Disable CSRF for simplicity for now
            .csrf(AbstractHttpConfigurer::disable)

            .authorizeHttpRequests(authorize -> authorize
                // Add /js/** to the list of permitted URLs
                .requestMatchers("/", "/register", "/login", "/terms", "/css/**", "/images/**", "/js/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(formLogin -> formLogin
                .loginPage("/") // Use our custom login page
                .loginProcessingUrl("/login") // The URL to submit the username and password to
                .defaultSuccessUrl("/welcome", true) // On successful login, redirect to a welcome page
                .failureUrl("/?error") // Redirect back to login page with an error parameter
                .permitAll()
            )
            .logout(logout -> logout.permitAll());
        return http.build();
    }
}
