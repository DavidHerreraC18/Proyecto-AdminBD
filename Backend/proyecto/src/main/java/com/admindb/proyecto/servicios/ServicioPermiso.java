package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.permisos.PermisoColumna;
import com.admindb.proyecto.modelo.permisos.PermisoTabla;
import com.admindb.proyecto.modelo.permisos.RepositorioPermisoColumna;
import com.admindb.proyecto.modelo.permisos.RepositorioPermisoTabla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("permisos")
public class ServicioPermiso {
    
    @Autowired
    private RepositorioPermisoColumna repositorioPermisoColumna;

    @Autowired
    private RepositorioPermisoTabla repositorioPermisoTabla;

    @GetMapping(value = "/columna",produces = "application/json")
    public List<PermisoColumna> findAllPermisosColumna() {
        return repositorioPermisoColumna.findAll();
    }

    @GetMapping(value = "/columna/{otorgado}", produces = "application/json")
    public List<PermisoColumna> findPermisoColumnaByOtorgado( @PathVariable("otorgado") String otorgado) {
        return repositorioPermisoColumna.findByIdOtorgado(otorgado);
    }

    @GetMapping(value = "/tabla",produces = "application/json")
    public List<PermisoTabla> findAllPermisosTabla() {
        return repositorioPermisoTabla.findAll();
    }

    @GetMapping(value = "/{otorgado}/{tabla}", produces = "application/json")
    public List<PermisoColumna> findPermisoColumnaByOtorgado( @PathVariable("otorgado") String otorgado, @PathVariable("tabla") String tabla) {
        return repositorioPermisoColumna.findByIdOtorgadoAndIdNombreTabla(otorgado, tabla);
    }

    @GetMapping(value = "/tabla/{otorgado}", produces = "application/json")
    public List<PermisoTabla> findPermisoTablaByOtorgado( @PathVariable("otorgado") String otorgado) {
        return repositorioPermisoTabla.findByIdOtorgado(otorgado);
    }

    @GetMapping(value = "/{otorgado}/{tabla}/{columna}", produces = "application/json")
    public List<PermisoColumna> findPermisoTablaByNombreTablaAndNombreColumnaAndOtorgado( @PathVariable("tabla") String tabla, @PathVariable("columna") String columna, @PathVariable("otorgado") String otorgado) {
        return repositorioPermisoColumna.findByIdNombreTablaAndIdNombreColumnaAndIdOtorgado(tabla, columna, otorgado);
    }
}
