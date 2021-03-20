package com.admindb.proyecto.modelo.tabla;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TablaCompleta {
    private String propietario;

    private String nombre;

    private List<String> comentarios;

    private List<String> restricciones;
    
}