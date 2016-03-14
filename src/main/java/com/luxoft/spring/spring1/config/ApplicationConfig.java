package com.luxoft.spring.spring1.config;

import com.luxoft.spring.spring1.repository.PropertiesRepository;
import com.luxoft.spring.spring1.repository.PropertiesRepositoryImpl;
import com.luxoft.spring.spring1.service.PropertiesService;
import com.luxoft.spring.spring1.service.PropertiesServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luxoft.spring.spring1")
public class ApplicationConfig {

    @Bean
    public PropertiesRepository propertiesRepository() {
        return new PropertiesRepositoryImpl();
    }

    @Bean
    public PropertiesService propertiesService() {
        return new PropertiesServiceImpl(propertiesRepository());
    }

}
