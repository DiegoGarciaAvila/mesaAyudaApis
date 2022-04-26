package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "catservice")
public class CatService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cscve_cat_ser")
    private Integer cscvecatser;

    private String csnombre;

    private String csdescripcion;

}