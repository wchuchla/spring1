package com.luxoft.spring.spring1;

import com.luxoft.spring.spring1.service.PropertiesServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring1/spring.xml");

        PropertiesServiceImpl propertiesService = context.getBean("propertiesService", PropertiesServiceImpl.class);

        propertiesService.sayHello();

    }

}
