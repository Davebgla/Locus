package com.codeclan.example.server.controllers;

import com.codeclan.example.server.models.Guest;
import com.codeclan.example.server.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {

    @Autowired
    GuestRepository guestRepository;

    @GetMapping(value = "/guests")
    public ResponseEntity<List <Guest>> getAllGuests(){
        return new ResponseEntity<>(guestRepository.findAll(), HttpStatus.OK);
    }

}
