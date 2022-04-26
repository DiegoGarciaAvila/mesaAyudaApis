package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "pcve_persona")
    private String pcvepersona;

    private String pnombre;

    private String pcorreo;

    private String ppassword;


}
