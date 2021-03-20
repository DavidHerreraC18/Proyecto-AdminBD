package com.admindb.proyecto.servicios;

import java.util.ArrayList;
import java.util.List;

import com.admindb.proyecto.modelo.comentarios.ComentarioTabla;
import com.admindb.proyecto.modelo.restricciones.Restriccion;
import com.admindb.proyecto.modelo.tabla.RepositorioTabla;
import com.admindb.proyecto.modelo.tabla.Tabla;
import com.admindb.proyecto.modelo.tabla.TablaCompleta;

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

    @Autowired
    private ServicioComentario servicioComentario;

    @Autowired
    private ServicioRestriccion servicioRestriccion;

    @GetMapping(produces = "application/json")
    public List<Tabla> findAll() {
        return repositorioTabla.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Tabla findById( @PathVariable("id") String id) {
        return repositorioTabla.findById(id).get();
    }

    @GetMapping(value = "propietario/{id}", produces = "application/json")
    public List<TablaCompleta> findByPropietario( @PathVariable("id") String id) {
        List<Tabla> tablas = repositorioTabla.findByPropietario(id);
        List<TablaCompleta> tablaCompletas = new ArrayList<>();
        for(Tabla tabla: tablas)
        {
            List<ComentarioTabla> comentarios = servicioComentario.findComentarioTablaByNombreTabla(tabla.getNombre(),id);
            List<Restriccion> restricciones = servicioRestriccion.findByNombreTablaAndPropietario(tabla.getNombre(),id);
            List<String> restriccionesString = new ArrayList<>();
            List<String> comentariosString = new ArrayList<>();
            for(Restriccion r: restricciones)
            {
                restriccionesString.add(r.getId().getNombreRestriccion());
            }
            for(ComentarioTabla ct: comentarios)
            {
                comentariosString.add(ct.getComentario());
            }
            
            tablaCompletas.add(new TablaCompleta(id,tabla.getNombre(),comentariosString,restriccionesString));
        }
        return tablaCompletas;

    }
}
