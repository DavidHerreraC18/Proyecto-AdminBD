package com.admindb.proyecto.modelo.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dba_users")
public class Usuario {
    
    @Id
    @Column(name = "username")
    private String nombre;

}
