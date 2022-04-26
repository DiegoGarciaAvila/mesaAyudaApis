package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tcve_ticket")
    private Integer tcveticket;

    private String tfolio;

    @Column(name = "tcve_eventofk")
    private Integer tcveeventofk;

    @ManyToOne
    @JoinColumn(name = "tcve_eventofk",updatable = false,insertable = false)
    private Event event;

}
