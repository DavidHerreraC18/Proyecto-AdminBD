package com.admindb.proyecto.modelo.jobs;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "dba_scheduler_jobs")
public class Job {


    @Column(name = "owner")
    private String propietario;

    @Id
    @Column(name = "job_name")
    private String nombre;

    @Column(name = "job_class")
    private String clase;

    @Column(name = "comments")
    private String comentarios;

    @Column(name = "enabled")
    private String habilitado;

    @Column(name = "credential_name")
    private String nombreCredencial;

    @Column(name = "destination")
    private String destino;

    @Column(name = "program_name")
    private String nombrePrograma;

    @Column(name = "job_type")
    private String tipo;

    @Column(name = "job_action")
    private String accion;

    @Column(name = "number_of_arguments")
    private int numeroArgumentos;

    @Column(name = "schedule_owner")
    private String propietarioCalendario;

    @Column(name = "schedule_name")
    private String nombreCalendario;

    @Column(name = "schedule_type")
    private String tipoCalendario;

    @Column(name = "start_date")
    private Timestamp fechaInicio;

    @Column(name = "repeat_interval")
    private String intervaloRepeticion;

    @Column(name = "end_date")
    private Timestamp fechaFin;

}
