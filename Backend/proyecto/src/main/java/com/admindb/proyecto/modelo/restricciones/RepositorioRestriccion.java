package com.admindb.proyecto.modelo.restricciones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRestriccion extends JpaRepository<Restriccion,String> {
    
}
