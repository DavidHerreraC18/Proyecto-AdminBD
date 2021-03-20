package com.admindb.proyecto.modelo.comentarios;

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
public class ComentarioTablaId implements Serializable {

    @Column(name = "table_name")
    private String nombreTabla;

    @Column(name = "owner")
    private String propietario;
}
