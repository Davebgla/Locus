package com.codeclan.example.server.repositories;

import com.codeclan.example.server.models.Host;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostRepository extends JpaRepository <Host, Long> {


}
