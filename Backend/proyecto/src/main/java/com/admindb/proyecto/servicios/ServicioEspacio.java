package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.almacenamiento.EspacioTotal;
import com.admindb.proyecto.modelo.almacenamiento.EspacioUsado;
import com.admindb.proyecto.modelo.almacenamiento.RepositorioEspacioTotal;
import com.admindb.proyecto.modelo.almacenamiento.RepositorioEspacioUsado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("espacio")
public class ServicioEspacio {

    @Autowired
    private RepositorioEspacioTotal repositorioEspacioTotal;
    @Autowired
    private RepositorioEspacioUsado repositorioEspacioUsado;

    @GetMapping(value = "/total",produces = "application/json")
    public List<EspacioTotal> findAllEspacioTotal() {
        return repositorioEspacioTotal.findAll();
    }

    @GetMapping(value = "/total/{tablespace}", produces = "application/json")
    public EspacioTotal findEspacioTotalById( @PathVariable("tablespace") String tablespace) {
        return repositorioEspacioTotal.findById(tablespace).get();
    }

    @GetMapping(value = "/usado",produces = "application/json")
    public List<EspacioUsado> findAllEspacioUsado() {
        return repositorioEspacioUsado.findAll();
    }

    @GetMapping(value = "/usado/{tablespace}", produces = "application/json")
    public EspacioUsado findEspacioUsadoById( @PathVariable("tablespace") String tablespace) {
        return repositorioEspacioUsado.findById(tablespace).get();
    }

    @GetMapping(value = "/usado/{propietario}", produces = "application/json")
    public EspacioUsado findEspacioUsadoByPropietario( @PathVariable("propietario") String propietario) {
        return repositorioEspacioUsado.findByPropietario(propietario).get(0);
    }

    
    
}
