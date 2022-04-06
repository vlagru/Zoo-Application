package com.example.zooapplication.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Caretaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caretaker_id;

    @Column
    private String name;

    @ManyToOne // vazba s PK vuci ZOO
    @JsonBackReference
    @JoinColumn(name = "pavilion_id")
    private Pavilion pavilion;
}
