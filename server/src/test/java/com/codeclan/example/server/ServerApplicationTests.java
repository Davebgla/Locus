package com.codeclan.example.server;

import com.codeclan.example.server.models.Guest;
import com.codeclan.example.server.models.User;
import com.codeclan.example.server.repositories.GuestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerApplicationTests {

	@Autowired
	GuestRepository guestRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddGuest(){
		Guest guest1 = new Guest("Pat", "MaGroin", "pat@pat.com", "1800-howsmydriving", 5);
		guestRepository.save(guest1);
	}

}
