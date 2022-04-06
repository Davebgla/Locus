package com.codeclan.example.server.controllers;

import com.codeclan.example.server.models.Guest;
import com.codeclan.example.server.models.Property;
import com.codeclan.example.server.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuestController {

    @Autowired
    GuestRepository guestRepository;

    @GetMapping(value = "/guests")
    public ResponseEntity<List <Guest>> getAllGuests(){
        return new ResponseEntity<>(guestRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/guests/{id}")
    public ResponseEntity getGuest(@PathVariable Long id){
        return new ResponseEntity<>(guestRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/guests")
    public ResponseEntity postGuest(@RequestBody Guest guest){
        guestRepository.save(guest);
        return new ResponseEntity<>(guest, HttpStatus.CREATED);
    }



}
