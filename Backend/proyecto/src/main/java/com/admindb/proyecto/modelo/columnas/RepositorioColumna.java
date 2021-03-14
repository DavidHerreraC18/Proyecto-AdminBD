package com.admindb.proyecto.modelo.columnas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioColumna extends JpaRepository<Columna, ColumnaId> {
    List<Columna> findByIdNombreTabla(String nombreTabla);
    List<Columna> findByIdNombreColumna(String nombreColumna);
}
