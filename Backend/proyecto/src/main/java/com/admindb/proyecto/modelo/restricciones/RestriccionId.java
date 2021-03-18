package com.admindb.proyecto.modelo.restricciones;
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
public class RestriccionId implements Serializable {


    @Column(name = "table_name")
    private String nombreTabla;

    @Column(name = "constraint_name")
    private String nombreRestriccion;

    @Column(name = "owner")
    private String propietario;
}
