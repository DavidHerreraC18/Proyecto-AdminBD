package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.tabla.RepositorioTabla;
import com.admindb.proyecto.modelo.tabla.Tabla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tablas")
public class ServicioTabla {

    @Autowired
    private RepositorioTabla repositorioTabla;

    @GetMapping(produces = "application/json")
    public List<Tabla> findAll() {
        return repositorioTabla.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Tabla findById( @PathVariable("id") String id) {
        return repositorioTabla.findById(id).get();
    }

    @GetMapping(value = "propietario/{id}", produces = "application/json")
    public List<Tabla> findByPropietario( @PathVariable("id") String id) {
        return repositorioTabla.findByPropietario(id);
    }
}
