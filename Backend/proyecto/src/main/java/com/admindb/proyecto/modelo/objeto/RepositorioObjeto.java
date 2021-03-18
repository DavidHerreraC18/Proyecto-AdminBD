package com.admindb.proyecto.modelo.objeto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioObjeto extends JpaRepository<Objeto,String> {
    List<Objeto> findByIdTipo(String tipo);
    List<Objeto> findByIdPropietario(String propietario);
    List<Objeto> findByIdTipoAndIdPropietario(String tipo,String propietario);
}
