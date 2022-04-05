package com.example.zooapplication.domain;

//domain je vlastne to, co chceme uchovat v DB

import lombok.Data;

import javax.persistence.*;

//toto je nas objekt,ktery chce persistovat:}
@Data
@Entity/*(name = "tab001")*/ // tabulka v DB je pojmenovana, tabulka mize mit jiny nazev
public class Zoo {

    @Id // id se samo generuje
    @GeneratedValue(strategy = GenerationType.IDENTITY) // vezmi nejblizsi volne id a nasettuj, strategie
    private Long id;
    //... dalsi parametry

    @Column // sloupec v tabulce
    private String name;

    @Column //mame to nejak pojmenovane, ale v tabulce ulozene jinak, tady se zrusilo to (name = "")
    private String city;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
