package com.admindb.proyecto.modelo.indices;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.EqualsAndHashCode;



@Getter
@Setter
@Embeddable
@EqualsAndHashCode
@RequiredArgsConstructor
public class IndiceId implements Serializable {
    @Column(name = "table_name")
    private String nombreTabla;

    @Column(name = "column_name")
    private String nombreColumna;
    
    @Column(name = "index_name")
    private String nombreIndice;
}
