package com.edomex.mesaAyuda.persistence.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ecve_evento")
    private Integer ecveevento;

    @Column(name = "efecha_inicio")
    private Date efechainicio;

    @Column(name = "efecha_fin")
    private Date efechafin;

    @Column(name = "ecve_usuariofk")
    private Integer ecveusuariofk;

    @Column(name = "ecve_estatusfk")
    private Integer ecveestatusfk;

    @Column(name = "ecve_arbolfk")
    private Integer ecve_arbolfk;

    @Column(name = "ecve_attenmentfk")
    private Integer ecveattenmentfk;

    @ManyToOne()
    @JoinColumn(name = "ecve_usuariofk",updatable = false,insertable = false)
    private Users users;

    @ManyToOne
    @JoinColumn(name = "ecve_estatusfk",insertable = false,updatable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "ecve_arbolfk", updatable = false,insertable = false)
    private Tree tree;

    @ManyToOne
    @JoinColumn(name = "ecve_attenmentfk",insertable = false,updatable = false)
    private Attenment attenment;


}


