package com.admindb.proyecto.modelo.almacenamiento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEspacioUsado extends JpaRepository<EspacioUsado,String> {
    List<EspacioUsado> findByPropietario(String propietario);
}
