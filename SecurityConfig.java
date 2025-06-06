package com.abc.withoutboot.config;

import com.abc.withoutboot.web.AuthController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"another.world"})
public class SecurityConfig {
    @Bean
    public AuthController authController(){
        return new AuthController();
    }
}
