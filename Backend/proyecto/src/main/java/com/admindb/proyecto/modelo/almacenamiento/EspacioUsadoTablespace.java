package com.admindb.proyecto.modelo.almacenamiento;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EspacioUsadoTablespace {
    @Id
    private String tablespace;

    private Long usado;
}
