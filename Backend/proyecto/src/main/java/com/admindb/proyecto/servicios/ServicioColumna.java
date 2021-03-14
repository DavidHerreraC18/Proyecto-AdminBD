package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.columnas.Columna;
import com.admindb.proyecto.modelo.columnas.RepositorioColumna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("columnas")
public class ServicioColumna {
    
    @Autowired
    private RepositorioColumna repositorioColumna;

    @GetMapping(produces = "application/json")
    public List<Columna> findAll() {
        return repositorioColumna.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public List<Columna> findAllByIdNombreTabla( @PathVariable("id") String id) {
        return repositorioColumna.findByIdNombreTabla(id);
    }
}
