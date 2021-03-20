package com.admindb.proyecto.servicios;

import java.util.ArrayList;
import java.util.List;

import com.admindb.proyecto.modelo.columnas.Columna;
import com.admindb.proyecto.modelo.columnas.ColumnaCompleta;
import com.admindb.proyecto.modelo.columnas.RepositorioColumna;
import com.admindb.proyecto.modelo.comentarios.ComentarioColumna;
import com.admindb.proyecto.modelo.indices.Indice;

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

    @Autowired
    private ServicioIndice servicioIndice;

    @Autowired
    private ServicioComentario servicioComentario;

    @GetMapping(produces = "application/json")
    public List<Columna> findAll() {
        return repositorioColumna.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public List<ColumnaCompleta> findAllByIdNombreTabla( @PathVariable("id") String id) {
        List<Columna> columnas = repositorioColumna.findByIdNombreTabla(id);
        List<ColumnaCompleta> columnasCompletas = new ArrayList<>();
        for(Columna columna: columnas)
        {
            List<ComentarioColumna> comentarios = servicioComentario.findComentarioColumnaByNombreTablaAndIdNombreColumna(id, columna.getId().getNombreColumna());
            List<Indice> indices = servicioIndice.findIndiceByNombreTablaAndColumna(id, columna.getId().getNombreColumna());
            List<String> comentariosS = new ArrayList<>();
            List<String> indicesS = new ArrayList<>();
            for(ComentarioColumna cc: comentarios)
            {
                comentariosS.add(cc.getComentario());
            }
            for(Indice i: indices)
            {
                indicesS.add(i.getId().getNombreIndice());
            }
            columnasCompletas.add(new ColumnaCompleta(columna.getId().getNombreTabla(), columna.getId().getNombreColumna(), columna.getTipoDato(), indicesS, comentariosS));
        }

        return columnasCompletas;
        
    }
}
