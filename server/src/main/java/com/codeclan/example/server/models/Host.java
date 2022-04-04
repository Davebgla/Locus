package com.codeclan.example.server.models;


import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.util.ArrayList;
import java.util.List;

public class Host extends User {

    private List<Property> properties;

    public Host(String firstName, String lastName, String email, String contactNumber, int rating) {
        super(firstName, lastName, email, contactNumber, rating);
        this.properties = new ArrayList<>();
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
