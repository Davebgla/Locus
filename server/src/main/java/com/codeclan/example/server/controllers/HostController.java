package com.codeclan.example.server.controllers;

import com.codeclan.example.server.models.Host;
import com.codeclan.example.server.repositories.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HostController {

    @Autowired
    HostRepository hostRepository;

    @GetMapping(value = "/hosts")
    public ResponseEntity<List<Host>> getAllHosts(){
        return new ResponseEntity<>(hostRepository.findAll(), HttpStatus.OK);
    }

}
