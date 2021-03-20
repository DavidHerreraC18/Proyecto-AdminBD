package com.admindb.proyecto.modelo.comentarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioComentarioTabla extends JpaRepository<ComentarioTabla,String> {
    List<ComentarioTabla> findByIdNombreTabla(String nombreTabla);
    List<ComentarioTabla> findByIdPropietario(String propietario);
    List<ComentarioTabla> findByIdNombreTablaAndIdPropietario(String nombreTabla, String propietario);
}
