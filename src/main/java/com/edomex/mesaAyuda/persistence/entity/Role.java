package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rcve_role")
    private Integer rcverole;

    private String rdescripcion;





}
