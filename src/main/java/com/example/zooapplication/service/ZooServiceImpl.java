package com.example.zooapplication.service;

import com.example.zooapplication.domain.Zoo;
import com.example.zooapplication.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ZooServiceImpl implements ZooService {

    private ZooRepository zooRepository;

    @Autowired
    public ZooServiceImpl(ZooRepository zooRepository) {
        this.zooRepository = zooRepository;
    }

    @Override
    public Zoo saveZoo(Zoo zoo) {
        return zooRepository.save(zoo);
    }

    @Override
    public Optional<Zoo> loadZoo(Long id) {
//        zooRepository.findById();
        return zooRepository.findById(id);
    }

}
