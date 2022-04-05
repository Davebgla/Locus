package com.codeclan.example.server.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Host extends User {



    @OneToMany(mappedBy = "host", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Property> properties;

    public Host(String firstName, String lastName, String email, String contactNumber, int rating) {
        super(firstName, lastName, email, contactNumber, rating);
        this.properties = new ArrayList<>();
    }

    public Host(){

    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
