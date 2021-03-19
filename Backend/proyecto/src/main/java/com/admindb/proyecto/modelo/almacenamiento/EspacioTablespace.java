package com.admindb.proyecto.modelo.almacenamiento;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EspacioTablespace {
    
    private String tablespace;

    private long usado;

    private long libre;
}
