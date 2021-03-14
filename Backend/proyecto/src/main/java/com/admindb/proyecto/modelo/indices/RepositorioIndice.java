package com.admindb.proyecto.modelo.indices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioIndice extends JpaRepository<Indice,IndiceId>{
    List<Indice> findByIdNombreTabla(String nombreTabla);
    List<Indice> findByIdNombreColumna(String nombreColumna);
    
}
