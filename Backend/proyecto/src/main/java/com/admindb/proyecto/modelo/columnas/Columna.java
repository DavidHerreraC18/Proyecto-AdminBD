package com.admindb.proyecto.modelo.columnas;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_tab_columns")
public class Columna {
    
    @EmbeddedId
    private ColumnaId id;

    @Column(name = "data_type")
    private String tipoDato;

}


