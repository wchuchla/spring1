package com.luxoft.spring.spring1.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PropertiesRepositoryImpl implements PropertiesRepository {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

}
