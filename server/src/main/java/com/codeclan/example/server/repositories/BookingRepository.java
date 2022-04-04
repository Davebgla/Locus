package com.codeclan.example.server.repositories;

import com.codeclan.example.server.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository <Booking, Long> {
//    Taylor's Comment
}
