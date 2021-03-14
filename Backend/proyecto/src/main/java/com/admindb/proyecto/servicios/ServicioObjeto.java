package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.objeto.Objeto;
import com.admindb.proyecto.modelo.objeto.RepositorioObjeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("objetos")
public class ServicioObjeto {

    @Autowired
    private RepositorioObjeto repositorioObjeto;

    @GetMapping(produces = "application/json")
    public List<Objeto> findAll() {
        return repositorioObjeto.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Objeto findById( @PathVariable("id") String id) {
        return repositorioObjeto.findById(id).get();
    }

    @GetMapping(value = "/procedures",produces = "application/json")
    public List<Objeto> findAllProcedures() {
        return repositorioObjeto.findByTipo("PROCEDURE");
    }

    @GetMapping(value = "/procedures/{propietario}",produces = "application/json")
    public List<Objeto> findProceduresByPropietario(@PathVariable("propietario") String propietario) {
        return repositorioObjeto.findByTipoAndPropietario("PROCEDURE",propietario);
    }

    @GetMapping(value = "/functions",produces = "application/json")
    public List<Objeto> findAllFunctions() {
        return repositorioObjeto.findByTipo("FUNCTION");
    }

    @GetMapping(value = "/functions/{propietario}",produces = "application/json")
    public List<Objeto> findFunctionsByPropietario(@PathVariable("propietario") String propietario) {
        return repositorioObjeto.findByTipoAndPropietario("FUNCTION",propietario);
    }


    @GetMapping(value = "/packages",produces = "application/json")
    public List<Objeto> findAllPackages() {
        return repositorioObjeto.findByTipo("PACKAGE");
    }

    @GetMapping(value = "/packages/{propietario}",produces = "application/json")
    public List<Objeto> findPackagesByPropietario(@PathVariable("propietario") String propietario) {
        return repositorioObjeto.findByTipoAndPropietario("PACKAGE",propietario);
    }



    
    
}
