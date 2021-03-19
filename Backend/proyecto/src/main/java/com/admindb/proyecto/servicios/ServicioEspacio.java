package com.admindb.proyecto.servicios;

import java.util.ArrayList;
import java.util.List;

import com.admindb.proyecto.modelo.almacenamiento.EspacioTablespace;
import com.admindb.proyecto.modelo.almacenamiento.EspacioTotal;
import com.admindb.proyecto.modelo.almacenamiento.EspacioUsadoTablespace;
import com.admindb.proyecto.modelo.almacenamiento.EspacioUsuario;
import com.admindb.proyecto.modelo.almacenamiento.RepositorioEspacioTotal;
import com.admindb.proyecto.modelo.almacenamiento.RepositorioEspacioUsadoTablespace;
import com.admindb.proyecto.modelo.almacenamiento.RepositorioEspacioUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("espacio")
public class ServicioEspacio {

    @Autowired
    private RepositorioEspacioTotal repositorioEspacioTotal;
    @Autowired
    private RepositorioEspacioUsuario repositorioEspacioUsuario;
    @Autowired
    private RepositorioEspacioUsadoTablespace repositorioEspacioUsadoTablespace;

    /*

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

    */

    @GetMapping(value = "/usuarios/espacio-usado",produces = "application/json")
    public List<EspacioUsuario> findEspacioUsadoUsuarios() {
        return repositorioEspacioUsuario.sumBytesByOwner();
    }

    @GetMapping(value = "/tablespaces",produces = "application/json")
    public List<EspacioTablespace> findAllTablespaces() {
        List<EspacioTotal> espacioTotal = repositorioEspacioTotal.findAll();
        List<EspacioUsadoTablespace> espacioUsado = repositorioEspacioUsadoTablespace.sumBytesByTablespace();
        List<EspacioTablespace> tablespaces = new ArrayList<>();
        for(EspacioTotal ep: espacioTotal)
        {
            for(EspacioUsadoTablespace eu: espacioUsado)
            {
                if(ep.getNombreTablespace().equals(eu.getTablespace()))
                {
                    tablespaces.add(new EspacioTablespace(ep.getNombreTablespace(),eu.getUsado(),ep.getBytes()));
                }
            }
        }
        return tablespaces;
    }

    

    
    
}
