package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "catactivities")
public class CatActivities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cacve_cat_act")
    private Integer cacvecatact;

    private String canombre;

    private String cadescripcion;


}
