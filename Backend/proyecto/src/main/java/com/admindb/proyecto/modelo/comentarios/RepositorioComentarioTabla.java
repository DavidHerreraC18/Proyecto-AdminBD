package com.admindb.proyecto.modelo.comentarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioComentarioTabla extends JpaRepository<ComentarioTabla,String> {
    
}
