package com.edomex.mesaAyuda.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "userrole")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "urcve_relacion")
    private Integer urcverelacion;

    @Column(name = "urcve_personafk")
    private String urcvepersonafk;

    @Column(name="urcve_rolefk")
    private Integer urcverolefk;

    @ManyToOne
    @JoinColumn(name = "urcve_rolefk",updatable = false,insertable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "urcve_personafk",updatable = false,insertable = false)
    private Person person;

}
