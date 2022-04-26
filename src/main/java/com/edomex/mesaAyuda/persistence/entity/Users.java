package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ucve_usuario")
    private Integer ucveusuario;

    @Column(name = "ucve_areatfk")
    private Integer ucveareatfk;

    @Column(name = "ucve_equipofk")
    private Integer ucveequipofk;

    @Column(name = "ucve_relacionfk")
    private Integer ucverelacionfk;

    @ManyToOne
    @JoinColumn(name = "ucve_areatfk",updatable = false,insertable = false)
    private Workst workst;

    @ManyToOne
    @JoinColumn(name = "ucve_equipofk",updatable = false,insertable = false)
    private Teams teams;

    @ManyToOne
    @JoinColumn(name = "ucve_relacionfk",updatable = false,insertable = false)
    private UserRole userRole;

    


}
