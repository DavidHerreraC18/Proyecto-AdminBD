package com.admindb.proyecto.modelo.objeto;

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
public class ObjetoId implements Serializable {
    @Column(name = "owner")
    private String propietario;

    @Column(name = "object_name")
    private String nombre;

    @Column(name = "object_type")
    private String tipo;
}
