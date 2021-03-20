package com.admindb.proyecto.modelo.columnas;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColumnaCompleta {

    private String nombreTabla;

    private String nombreColumna;

    private String tipoDato;

    private List<String> indices;

    private List<String> comentarios;
}
