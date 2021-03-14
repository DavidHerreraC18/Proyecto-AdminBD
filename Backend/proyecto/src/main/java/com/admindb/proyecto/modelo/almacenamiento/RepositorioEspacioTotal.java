package com.admindb.proyecto.modelo.almacenamiento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEspacioTotal extends JpaRepository <EspacioTotal,String> {
    
}
