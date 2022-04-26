package com.edomex.mesaAyuda.persistence.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "teams")
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tcve_equipo")
    private Integer tcveequipo;

    @Column(name = "tnum_inventario")
    private String tnuminventario;

    private String tserie;

    private String tmarca;

    @Column(name = "tcve_equipofk")
    private Integer tcveequipofk;

    @ManyToOne
    @JoinColumn(name = "tcve_equipofk",updatable = false,insertable = false)
    private Typeteams typeteams;

}
