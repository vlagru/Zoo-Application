package com.example.zooapplication.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Pavilion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pavilion_id;

    @Column
    private String name;

    @ManyToOne // vazba s PK vuci ZOO
    @JsonBackReference
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

    @OneToMany(mappedBy = "pavilion")
    @JsonManagedReference
    private Set<Caretaker> caretakerSet;

//    @OneToMany("pavilion")
//    private Set<Caretakers> caretakers;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
