package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tree")
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tcve_arbol")
    private Integer tcvearbol;

    @Column(name = "tcve_serfk")
    private Integer tcveserfk;

    @Column(name = "tcve_cat_serfk")
    private Integer tcvecatserfk;

    @Column(name = "tcve_actfk")
    private Integer tcveactfk;

    @Column(name = "tcve_cat_actfk")
    private Integer tcvecatactfk;

    @ManyToOne
    @JoinColumn(name = "tcve_serfk",updatable = false,insertable = false)
    private Services services;

    @ManyToOne
    @JoinColumn(name = "tcve_cat_serfk",insertable = false,updatable = false)
    private CatService catService;

    @ManyToOne
    @JoinColumn(name = "tcve_actfk",updatable = false, insertable = false)
    private Activities activities;

    @ManyToOne
    @JoinColumn(name = "tcve_cat_actfk",insertable = false,updatable = false)
    private CatActivities catActivities;




}

