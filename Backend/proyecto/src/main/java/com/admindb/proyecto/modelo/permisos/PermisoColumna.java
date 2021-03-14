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
@Table(name = "dba_col_privs")
public class PermisoColumna {
    
    @EmbeddedId
    private PermisoColumnaId id;

    @Column(name = "owner")
    private String propietario;

    @Column(name = "grantee")
    private String otorgado;
    
}
