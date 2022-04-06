package com.codeclan.example.server.components;

import com.codeclan.example.server.enums.PropertyType;
import com.codeclan.example.server.models.*;
import com.codeclan.example.server.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ImageRepository imageRepository;

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

    public void run(ApplicationArguments args) {

        Guest guest1 = new Guest("Steve", "Mieklejohn", "steve@codeclan.com", "(519)-490-1416", 4);
        guestRepository.save(guest1);
        Guest guest2 = new Guest("Craig", "Gough", "craig@codeclan.com", "(673)-179-1238", 3);
        guestRepository.save(guest2);
        Guest guest3 = new Guest("Stan", "Tarnev", "stan@codeclan.com", "(987)-639-2345", 1);
        guestRepository.save(guest3);
        Guest guest4 = new Guest("Jennifer", "Ramsay", "jen@codeclan.com", "(369)-143-0987", 3);
        guestRepository.save(guest4);
        Guest guest5 = new Guest("Ash", "Healy", "ash@codeclan.com", "(876)-333-0912", 5);
        guestRepository.save(guest5);

        Host host1 = new Host("David", "Bell", "davebgla@gmail.com", "(666)-891-0376", 2);
        hostRepository.save(host1);
        Host host2 = new Host("Rory", "Smith", "rory-smith14@hotmail.co.uk", "(901)-322-0910", 4);
        hostRepository.save(host2);
        Host host3 = new Host("Taylor", "Paterson", "taylorpaterson7@hotmail.com", "(111)-671-7543", 5);
        hostRepository.save(host3);
        Host host4 = new Host("David", "Abercrombie", "abercrombiedj2@gmail.com", "(608)-555-4321", 1);
        hostRepository.save(host4);

        Property property1 = new Property(host1, "number 10", 69, "I am, the description", PropertyType.LODGE);
        propertyRepository.save(property1);

        Image image = new Image("../images/image.png", property1);
        imageRepository.save(image);

        Booking booking1 = new Booking(guest1, host1, property1, 2, 1);
        bookingRepository.save(booking1);
    }

}


