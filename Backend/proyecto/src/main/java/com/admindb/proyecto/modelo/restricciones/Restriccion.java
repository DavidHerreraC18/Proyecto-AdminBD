package com.admindb.proyecto.modelo.restricciones;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_constraints")
public class Restriccion {

    @Column(name = "constraint_type")
    private String restriccion;

    @Id
    @Column(name = "table_name")
    private String nombreTabla;
    
}
