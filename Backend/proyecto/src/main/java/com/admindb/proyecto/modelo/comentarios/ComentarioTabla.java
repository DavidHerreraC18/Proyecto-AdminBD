package com.admindb.proyecto.modelo.comentarios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_tab_comments")
public class ComentarioTabla {
    
    @Id
    @Column(name = "table_name")
    private String nombreTabla;

    @Column(name = "comments")
    private String comentario;
}
