package com.admindb.proyecto.modelo.comentarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioComentarioColumna extends JpaRepository<ComentarioColumna,ComentarioColumnaId> {
    List<ComentarioColumna> findByIdNombreTabla(String nombreTabla);
    List<ComentarioColumna> findByIdNombreColumna(String nombreColumna);
    List<ComentarioColumna> findByIdPropietario(String propietario);
    List<ComentarioColumna> findByIdNombreTablaAndIdNombreColumna(String nombreTabla, String nombreColumna);
}
