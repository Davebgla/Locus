package com.codeclan.example.server.components;

import com.codeclan.example.server.enums.PropertyType;
import com.codeclan.example.server.models.Booking;
import com.codeclan.example.server.models.Guest;
import com.codeclan.example.server.models.Host;
import com.codeclan.example.server.models.Property;
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

        Guest guest1 = new Guest("Taylor", "Paterson", "tp@greatemail.co.uk", "12missafew5", 7);
        guestRepository.save(guest1);

        Host host1 = new Host("Boris", "Johnson", "bj@?????.co.uk", "908070605", 3);
        hostRepository.save(host1);

        Property property1 = new Property(host1, "number 10", 69, "I am, the description", PropertyType.LODGE );
        propertyRepository.save(property1);

        Booking booking1 = new Booking(guest1, host1, property1, 2, 1);
        bookingRepository.save(booking1);
    }

}


