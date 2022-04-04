package com.codeclan.example.server.repositories;

import com.codeclan.example.server.models.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
