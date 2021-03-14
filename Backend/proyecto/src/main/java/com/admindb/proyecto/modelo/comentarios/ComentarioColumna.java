package com.admindb.proyecto.modelo.comentarios;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_col_comments")
public class ComentarioColumna {
    
    @EmbeddedId
    private ComentarioColumnaId id;

    @Column(name = "comments")
    private String comentario;
}
