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
public class EspacioUsuario {

    @Id
    private String owner;

    private Long bytes;
    
}
