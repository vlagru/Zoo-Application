package com.example.zooapplication.repository;

import com.example.zooapplication.domain.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//spring data jpa rozsiruje toto, pracuji se Zoo a typ PK
@Repository
public interface ZooRepository extends JpaRepository<Zoo, Long> {
}
