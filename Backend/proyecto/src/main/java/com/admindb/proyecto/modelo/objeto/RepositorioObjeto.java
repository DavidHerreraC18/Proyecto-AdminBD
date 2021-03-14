package com.admindb.proyecto.modelo.objeto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioObjeto extends JpaRepository<Objeto,String> {
    List<Objeto> findByTipo(String tipo);
    List<Objeto> findByPropietario(String propietario);
    List<Objeto> findByTipoAndPropietario(String tipo,String propietario);
}
