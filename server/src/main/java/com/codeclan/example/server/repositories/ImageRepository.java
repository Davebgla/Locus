package com.codeclan.example.server.repositories;

import com.codeclan.example.server.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
