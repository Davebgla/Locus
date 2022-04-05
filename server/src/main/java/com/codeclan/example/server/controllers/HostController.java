package com.codeclan.example.server.controllers;

import com.codeclan.example.server.models.Guest;
import com.codeclan.example.server.models.Host;
import com.codeclan.example.server.repositories.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HostController {

    @Autowired
    HostRepository hostRepository;

    @GetMapping(value = "/hosts")
    public ResponseEntity<List<Host>> getAllHosts(){
        return new ResponseEntity<>(hostRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/hosts/{id}")
    public ResponseEntity getHost(@PathVariable Long id){
        return new ResponseEntity<>(hostRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/hosts")
    public ResponseEntity postHost(@RequestBody Host host){
        hostRepository.save(host);
        return new ResponseEntity<>(host, HttpStatus.CREATED);
    }

}
