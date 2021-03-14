package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.usuario.RepositorioUsuario;
import com.admindb.proyecto.modelo.usuario.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class ServicioUsuario {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @GetMapping(produces = "application/json")
    public List<Usuario> findAll() {
        return repositorioUsuario.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Usuario findById( @PathVariable("id") String id) {
        return repositorioUsuario.findById(id).get();
    }

    
}
