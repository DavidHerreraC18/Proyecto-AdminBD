package com.admindb.proyecto.modelo.restricciones;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRestriccion extends JpaRepository<Restriccion,String> {
    public List<Restriccion> findByIdNombreTabla(String nombreTabla);
}
