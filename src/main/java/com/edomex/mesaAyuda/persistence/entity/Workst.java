package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "workst")
public class Workst {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wcve_areat")
    private Integer wcveareat;

    private String wdescripcion;

    private String wabreviatura;

}
