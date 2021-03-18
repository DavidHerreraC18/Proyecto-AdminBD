package com.admindb.proyecto.modelo.permisos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPermisoTabla extends JpaRepository<PermisoTabla,PermisoTablaId> {
    List<PermisoTabla> findByIdNombreTabla(String nombreTabla);
    List<PermisoTabla> findByIdPrivilegio(String privilegio);
    List<PermisoTabla> findByPropietario(String propietario);
    List<PermisoTabla> findByIdOtorgado(String otorgado);
}
