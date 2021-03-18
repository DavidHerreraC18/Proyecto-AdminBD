package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.restricciones.RepositorioRestriccion;
import com.admindb.proyecto.modelo.restricciones.Restriccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restricciones")
public class ServicioRestriccion {
    @Autowired
    private RepositorioRestriccion repositorioRestriccion;

    @GetMapping(produces = "application/json")
    public List<Restriccion> findAll() {
        return repositorioRestriccion.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Restriccion findById( @PathVariable("id") String id) {
        return repositorioRestriccion.findById(id).get();
    }

    @GetMapping(value = "propietario/{id}", produces = "application/json")
    public List<Restriccion> findByNombreTabla( @PathVariable("id") String id) {
        return repositorioRestriccion.findByIdNombreTabla(id);
    }
}
