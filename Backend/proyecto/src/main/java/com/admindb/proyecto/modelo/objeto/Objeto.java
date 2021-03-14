package com.admindb.proyecto.modelo.objeto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dba_objects")
public class Objeto {
    
    @Column(name = "owner")
    private String propietario;

    @Column(name = "status")
    private String estado;

    @Id
    @Column(name = "object_name")
    private String nombre;

    @Column(name = "object_type")
    private String tipo;
}
