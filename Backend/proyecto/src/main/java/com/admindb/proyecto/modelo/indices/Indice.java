package com.admindb.proyecto.modelo.indices;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_ind_columns")
public class Indice {
    
    @EmbeddedId
    private IndiceId id;

}
