package com.example.zooapplication.service;

import com.example.zooapplication.domain.Zoo;

import java.util.Optional;

public interface ZooService {


    //pro ukladani zoo z controlleru
    Zoo saveZoo(Zoo zoo);

    Optional<Zoo> loadZoo(Long id);

}
