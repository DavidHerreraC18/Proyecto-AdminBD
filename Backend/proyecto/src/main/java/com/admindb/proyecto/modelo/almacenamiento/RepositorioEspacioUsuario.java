package com.admindb.proyecto.modelo.almacenamiento;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEspacioUsuario extends JpaRepository <EspacioUsuario,String> {

    @Query(value = "select owner, sum(bytes) AS bytes " + " from dba_segments " + " GROUP BY owner " , nativeQuery = true)
    List<EspacioUsuario> sumBytesByOwner();

}
