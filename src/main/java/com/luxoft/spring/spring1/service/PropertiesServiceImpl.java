package com.luxoft.spring.spring1.service;

import com.luxoft.spring.spring1.model.Property;
import com.luxoft.spring.spring1.repository.PropertiesRepository;
import com.luxoft.spring.spring1.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class PropertiesServiceImpl implements PropertiesService {

    @Autowired
    private Logger LOGGER;

    @Autowired
    @Qualifier("memoryPropertiesRepository")
    private PropertiesRepository propertiesRepository;

    @Override
    public void addProperty(Property property) {
        LOGGER.log("adding property");
        propertiesRepository.addProperty(property);
    }

    @Override
    public Property getProperty(String name) {
        LOGGER.log("getting property");
        return propertiesRepository.getProperty(name);
    }

    @Override
    public Collection<Property> getAll() {
        LOGGER.log("getting all properties");
        return propertiesRepository.getAll();
    }
}
