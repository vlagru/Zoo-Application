package com.example.zooapplication.repository;

import com.example.zooapplication.domain.Pavilion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PavilionRepository extends JpaRepository<Pavilion, Long> {
}
