package com.codeclan.example.server.repositories;

import com.codeclan.example.server.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository <Guest, Long> {
}
