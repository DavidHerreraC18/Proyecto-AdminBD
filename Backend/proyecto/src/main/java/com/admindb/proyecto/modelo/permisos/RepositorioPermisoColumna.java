package com.admindb.proyecto.modelo.permisos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPermisoColumna extends JpaRepository<PermisoColumna,PermisoColumnaId> {
    List<PermisoColumna> findByIdNombreTabla(String nombreTabla);
    List<PermisoColumna> findByIdNombreColumna(String nombreColumna);
    List<PermisoColumna> findByIdPrivilegio(String privilegio);
    List<PermisoColumna> findByPropietario(String propietario);
    List<PermisoColumna> findByIdOtorgado(String otorgado);
    List<PermisoColumna> findByIdOtorgadoAndIdNombreTabla(String otorgado,String nombreTabla);
    List<PermisoColumna> findByIdNombreTablaAndIdNombreColumnaAndIdOtorgado(String nombreTabla, String nombreColumna ,String otorgado);
}
