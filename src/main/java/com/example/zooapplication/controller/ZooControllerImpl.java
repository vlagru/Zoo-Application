package com.example.zooapplication.controller;

import com.example.zooapplication.domain.Caretaker;
import com.example.zooapplication.domain.Pavilion;
import com.example.zooapplication.domain.Zoo;
import com.example.zooapplication.service.ZooService;
import com.example.zooapplication.service.ZooServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ZooControllerImpl implements ZooController {

    private ZooService zooService;

    @Autowired
    public ZooControllerImpl(ZooService zs){
        this.zooService = zs;
    }
//
//
//    public ZooControllerImpl(ZooService zs){
//        this.zooService = zs;
//    }

    @Override
    public Zoo creatZoo(@RequestBody Zoo zoo) { // volani jinym zpusobem nez @PathVatiable

        return zooService.saveZoo(zoo);
    }

    @Override
    public Optional<Zoo> loadZoo(Long id) { // ziskani id pomoci parametru

        Optional<Zoo> z = zooService.loadZoo(id);

        return z;
    }

    //TODO
    @Override
    public Pavilion createPavilion(Pavilion pavilion) {
        return pavilion;
    }

    @Override
    public Caretaker createCaretaker(Caretaker caretaker) {
        return caretaker;
    }

//    @Override
//    public String hello() {
//        return "Ahoj";
//    }
}
