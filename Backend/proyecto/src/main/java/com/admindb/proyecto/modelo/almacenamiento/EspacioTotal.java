package com.admindb.proyecto.modelo.almacenamiento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dba_data_files")
public class EspacioTotal {
    @Id
    @Column(name = "tablespace_name")
    private String nombreTablespace;

    @Column(name = "bytes")
    private long bytes;
}
