package com.admindb.proyecto.servicios;


import java.util.List;

import com.admindb.proyecto.modelo.comentarios.ComentarioColumna;
import com.admindb.proyecto.modelo.comentarios.ComentarioTabla;
import com.admindb.proyecto.modelo.comentarios.RepositorioComentarioColumna;
import com.admindb.proyecto.modelo.comentarios.RepositorioComentarioTabla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comentarios")
public class ServicioComentario {

    @Autowired
    private RepositorioComentarioColumna repositorioComentarioColumna;

    @Autowired
    private RepositorioComentarioTabla repositorioComentarioTabla;

    @GetMapping(value = "/columna",produces = "application/json")
    public List<ComentarioColumna> findAllComentarioColumna() {
        return repositorioComentarioColumna.findAll();
    }

    @GetMapping(value = "/tabla",produces = "application/json")
    public List<ComentarioTabla> findAllComentarioTabla() {
        return repositorioComentarioTabla.findAll();
    }


    @GetMapping(value = "/columna/{id}", produces = "application/json")
    public List<ComentarioColumna> findComentarioColumnaByNombreTabla( @PathVariable("id") String id) {
        return repositorioComentarioColumna.findByIdNombreTabla(id);
    }

    @GetMapping(value = "/tabla/{id}", produces = "application/json")
    public ComentarioTabla findComentarioTablaByNombreTabla( @PathVariable("id") String id) {
        return repositorioComentarioTabla.findById(id).get();
    }
    
}
