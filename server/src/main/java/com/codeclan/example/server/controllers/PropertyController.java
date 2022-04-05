package com.codeclan.example.server.controllers;

import com.codeclan.example.server.models.Guest;
import com.codeclan.example.server.models.Property;
import com.codeclan.example.server.repositories.GuestRepository;
import com.codeclan.example.server.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    PropertyRepository propertyRepository;

    @GetMapping(value = "/properties")
    public ResponseEntity<List<Property>> getAllProperties(){
        return new ResponseEntity<>(propertyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/properties/{id}")
    public ResponseEntity getProperty(@PathVariable Long id){
        return new ResponseEntity<>(propertyRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/properties")
    public ResponseEntity postProperty(@RequestBody Property property){
        propertyRepository.save(property);
        return new ResponseEntity<>(property, HttpStatus.CREATED);
    }

    @PatchMapping(value="properties/{id}")
    public ResponseEntity updateProperty(@RequestBody Property property){
        propertyRepository.save(property);
        return new ResponseEntity<>(property, HttpStatus.OK);
    }

    @DeleteMapping(value="/properties/{id}")
    public ResponseEntity deleteProperty(@PathVariable Long id){
        propertyRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
