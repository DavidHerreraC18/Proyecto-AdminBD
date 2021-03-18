package com.admindb.proyecto.modelo.restricciones;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_constraints")
public class Restriccion {

    @EmbeddedId
    private RestriccionId id;

    @Column(name = "constraint_type")
    private String restriccion;
    
}
