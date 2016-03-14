package com.luxoft.spring.spring1.config;

import com.luxoft.spring.spring1.utils.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luxoft.spring.spring1")
public class ApplicationConfig {

    @Bean
    public Logger logger() {
        return Logger.getInstance();
    }

}
