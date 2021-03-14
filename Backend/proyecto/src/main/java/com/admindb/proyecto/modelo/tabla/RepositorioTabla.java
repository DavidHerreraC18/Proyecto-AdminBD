package com.admindb.proyecto.modelo.tabla;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTabla extends JpaRepository<Tabla,String> {
    List<Tabla> findByPropietario(String propietario);
}
