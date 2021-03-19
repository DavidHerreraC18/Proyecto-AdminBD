package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.indices.Indice;
import com.admindb.proyecto.modelo.indices.RepositorioIndice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("indices")
public class ServicioIndice {

    @Autowired
    private RepositorioIndice repositorioIndice;

    @GetMapping(produces = "application/json")
    public List<Indice> findAll() {
        return repositorioIndice.findAll();
    }

    @GetMapping(value = "/{id}/{idcol}", produces = "application/json")
    public List<Indice> findIndiceByNombreTablaAndColumna( @PathVariable("id") String id, @PathVariable("idcol") String idcol) {
        return repositorioIndice.findByIdNombreTablaAndIdNombreColumna(id,idcol);
    }
    
}
