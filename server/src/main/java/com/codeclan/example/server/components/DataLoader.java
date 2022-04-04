package com.codeclan.example.server.components;

import com.codeclan.example.server.repositories.BookingRepository;
import com.codeclan.example.server.repositories.GuestRepository;
import com.codeclan.example.server.repositories.HostRepository;
import com.codeclan.example.server.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    GuestRepository guestRepository;

    @Autowired
    HostRepository hostRepository;

    @Autowired
    PropertyRepository propertyRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args){

    }

}


