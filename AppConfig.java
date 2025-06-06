package com.abc.withoutboot.config;

import com.abc.withoutboot.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abc.withoutboot"})
public class AppConfig {
    //bean for cartService
    @Bean("cartService1")
    public CartService cartService(){
        return new CartService();
    }
}
