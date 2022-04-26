package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scve_estatus")
    private Integer scveestatus;

    private String sdescripcion;


}
