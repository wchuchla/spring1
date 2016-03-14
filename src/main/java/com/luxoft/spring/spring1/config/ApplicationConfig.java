package com.luxoft.spring.spring1.config;

import com.luxoft.spring.spring1.utils.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.luxoft.spring.spring1")
@PropertySource("classpath:logger.properties")
public class ApplicationConfig {

    @Bean
    public Logger logger() {
        return Logger.getInstance();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
