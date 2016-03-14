package com.luxoft.spring.spring1.repository;

import com.luxoft.spring.spring1.model.Property;

import java.util.Collection;

public interface PropertiesRepository {

    void addProperty(Property property);

    Property getProperty(String name);

    Collection<Property> getAll();

}
