package com.admindb.proyecto.modelo.permisos;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_tab_privs")
public class PermisoTabla {
    
    @EmbeddedId
    private PermisoTablaId id;
    
    @Column(name = "owner")
    private String propietario;

    @Column(name = "grantee")
    private String otorgado;
}
