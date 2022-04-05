package com.example.zooapplication.controller;

import com.example.zooapplication.domain.Zoo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

public interface ZooController {

    //vraceni objektu
    //vytvori zoo, v postmanu se naplni JSON a pak poslat
    @PostMapping("/zoo/create")
    Zoo creatZoo(Zoo zoo);

    //Zoo vrati podle neceho, loadovani podle id, long kvuli rozsahu namisto int
    @GetMapping("/zoo/{id}") // zadam jen !, provolavam / a cislo id
    Optional<Zoo> loadZoo(@PathVariable Long id); // optional kvuli nullu, tyto, kvuli odkazu na id tato anotace

//    @GetMapping("/")
//    String hello();

}
