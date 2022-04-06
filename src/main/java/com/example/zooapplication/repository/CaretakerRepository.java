package com.example.zooapplication.repository;

import com.example.zooapplication.domain.Caretaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaretakerRepository extends JpaRepository<Caretaker, Long> {
}
