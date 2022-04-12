package com.codeclan.example.server;

import com.codeclan.example.server.enums.PropertyType;
import com.codeclan.example.server.models.*;
import com.codeclan.example.server.repositories.BookingRepository;
import com.codeclan.example.server.repositories.GuestRepository;
import com.codeclan.example.server.repositories.HostRepository;
import com.codeclan.example.server.repositories.PropertyRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ServerApplicationTests {

	@Autowired
	GuestRepository guestRepository;

	@Autowired
	HostRepository hostRepository;

	@Autowired
	PropertyRepository propertyRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddGuest(){
		Guest guest1 = new Guest("Pat", "MaGroin", "pat@pat.com", "1800-howsmydriving", 5);
		guestRepository.save(guest1);
	}

//	@Test
//	public void canDeleteProperty(){
//		Host host1 = new Host("Boris", "Johnson", "bj@?????.co.uk", "908070605", 3);
//		hostRepository.save(host1);
//		Property property2 = new Property(host1, "No. 11", 420, "The chancellor's digs", PropertyType.THREE_BED);
//		propertyRepository.save(property2);
//		propertyRepository.deleteById(property2.getId());
//		assertEquals(1, propertyRepository.findAll().size());
//	}

}
