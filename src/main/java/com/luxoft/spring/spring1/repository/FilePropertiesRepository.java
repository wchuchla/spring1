package com.luxoft.spring.spring1.repository;

import com.luxoft.spring.spring1.model.Property;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class FilePropertiesRepository implements PropertiesRepository {

    @Override
    public void addProperty(Property property) {

    }

    @Override
    public Property getProperty(String name) {
        return null;
    }

    @Override
    public Collection<Property> getAll() {
        return null;
    }
}
