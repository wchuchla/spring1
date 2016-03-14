package com.luxoft.spring.spring1.repository;

import com.luxoft.spring.spring1.model.Property;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class MemoryPropertiesRepository implements PropertiesRepository {

    private Collection<Property> properties = new ArrayList<>();

    @Override
    public void addProperty(Property property) {
        properties.add(property);
    }

    @Override
    public Property getProperty(String name) {
        return null;
    }

    @Override
    public Collection<Property> getAll() {
        return properties;
    }
}
