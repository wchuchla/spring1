package com.luxoft.spring.spring1.service;

import com.luxoft.spring.spring1.repository.PropertiesRepository;

public class PropertiesServiceImpl implements PropertiesService {

    private PropertiesRepository propertiesRepository;

    public PropertiesServiceImpl(PropertiesRepository propertiesRepository) {
        this.propertiesRepository = propertiesRepository;
    }

    public void sayHello() {
        propertiesRepository.sayHello();
    }
}
