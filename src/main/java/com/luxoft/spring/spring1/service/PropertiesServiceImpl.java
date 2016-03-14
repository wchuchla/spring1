package com.luxoft.spring.spring1.service;

import com.luxoft.spring.spring1.repository.PropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertiesServiceImpl implements PropertiesService {

    private PropertiesRepository propertiesRepository;

    @Autowired
    public PropertiesServiceImpl(PropertiesRepository propertiesRepository) {
        this.propertiesRepository = propertiesRepository;
    }

    public void sayHello() {
        propertiesRepository.sayHello();
    }
}
