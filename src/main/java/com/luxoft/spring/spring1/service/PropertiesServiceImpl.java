package com.luxoft.spring.spring1.service;

import com.luxoft.spring.spring1.model.Property;
import com.luxoft.spring.spring1.repository.PropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PropertiesServiceImpl implements PropertiesService {

    @Autowired
    @Qualifier("memoryPropertiesRepository")
    private PropertiesRepository propertiesRepository;

    @Override
    public void addProperty(Property property) {
        propertiesRepository.addProperty(property);
    }

    @Override
    public Property getProperty(String name) {
        return propertiesRepository.getProperty(name);
    }

    @Override
    public Collection<Property> getAll() {
        return propertiesRepository.getAll();
    }
}
