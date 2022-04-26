package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "activities")
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acve_act")
    private Integer acveact;

    private String anombre;

    private String adescripcion;



}
