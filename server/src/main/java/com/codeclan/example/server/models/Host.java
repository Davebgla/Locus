package com.codeclan.example.server.models;


import com.fasterxml.jackson.databind.annotation.JsonAppend;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hosts")
public class Host extends User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column
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
