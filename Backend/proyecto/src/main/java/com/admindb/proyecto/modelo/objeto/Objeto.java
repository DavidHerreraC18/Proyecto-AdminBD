package com.admindb.proyecto.modelo.objeto;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
    
    @EmbeddedId
    private ObjetoId id;

    @Column(name = "status")
    private String estado;

    
}
