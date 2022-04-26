package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "attenment")
public class Attenment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acve_encargado")
    private Integer acveencargado;

    private String anombre;

    private String acorreo;

    private String aextencion;


}
