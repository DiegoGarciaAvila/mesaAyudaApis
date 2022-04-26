package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "typeteams")
public class Typeteams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ttcve_equipo")
    private Integer ttcveequipo;

    private String ttdescripcion;

    private String ttequipo;

}
