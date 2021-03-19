package com.admindb.proyecto.modelo.almacenamiento;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEspacioUsadoTablespace extends JpaRepository <EspacioUsadoTablespace,String> {

    @Query(value = "SELECT ROUND(SUM(bytes))AS usado, tablespace_name AS tablespace " + " FROM dba_segments " + " GROUP BY tablespace_name " , nativeQuery = true)
    List<EspacioUsadoTablespace> sumBytesByTablespace();

}
