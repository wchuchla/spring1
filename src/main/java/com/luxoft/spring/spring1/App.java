package com.luxoft.spring.spring1;

import com.luxoft.spring.spring1.config.ApplicationConfig;
import com.luxoft.spring.spring1.service.PropertiesServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        PropertiesServiceImpl propertiesService = context.getBean("propertiesService", PropertiesServiceImpl.class);

        propertiesService.sayHello();

    }

}
