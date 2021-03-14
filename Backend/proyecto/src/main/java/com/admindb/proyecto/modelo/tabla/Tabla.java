package com.admindb.proyecto.modelo.tabla;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_tables")
public class Tabla {
    
    @Column(name = "owner")
    private String propietario;

    @Id
    @Column(name = "table_name")
    private String nombre;
}
