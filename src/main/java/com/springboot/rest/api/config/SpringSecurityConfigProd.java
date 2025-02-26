//package com.springboot.rest.api.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import com.springboot.rest.api.service.UserDetailsServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//@Profile("prod")
//public class SpringSecurityConfigProd {
//
//
//    private final UserDetailsServiceImpl userDetailsService;
//
//    public SpringSecurityConfigProd(UserDetailsServiceImpl userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                  .authorizeHttpRequests(request -> request
//                                        .anyRequest().authenticated())
//                  .httpBasic(Customizer.withDefaults())
//                  .csrf(AbstractHttpConfigurer::disable)
//                  .build();
//    }
//
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//      return new BCryptPasswordEncoder();
//    }
//
//}
