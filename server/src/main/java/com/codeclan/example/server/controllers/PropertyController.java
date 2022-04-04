package com.codeclan.example.server.controllers;

import com.codeclan.example.server.models.Guest;
import com.codeclan.example.server.models.Property;
import com.codeclan.example.server.repositories.GuestRepository;
import com.codeclan.example.server.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    PropertyRepository propertyRepository;

    @GetMapping(value = "/properties")
    public ResponseEntity<List<Property>> getAllProperties(){
        return new ResponseEntity<>(propertyRepository.findAll(), HttpStatus.OK);
    }

}
