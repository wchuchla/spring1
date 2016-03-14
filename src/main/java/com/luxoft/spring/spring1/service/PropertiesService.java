package com.luxoft.spring.spring1.service;

import com.luxoft.spring.spring1.model.Property;

import java.util.Collection;

public interface PropertiesService {

    void addProperty(Property property);

    Property getProperty(String name);

    Collection<Property> getAll();
}
