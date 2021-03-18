import { Timestamp } from "rxjs/internal/operators/timestamp";

export class Job {

    propietario: string;

    nombre: string;

    clase: string;

    comentarios: string;

    habilitado: string;

    nombreCredencial: string;

    destino: string;

    nombrePrograma: string;

    tipo: string;

    accion: string;

    numeroArgumentos: number;

    propietarioCalendario: string;

    nombreCalendario: string;

    tipoCalendario: string;

    fechaInicio: Date;

    intervaloRepeticion: string;

    fechaFin: Date;

    constructor(propietario: string, nombre: string, clase: string, comentarios: string, habilitado: string, nombreCredencial: string, destino: string, nombrePrograma: string, tipo: string, accion: string, numeroArgumentos: number, propietarioCalendario: string, nombreCalendario: string, tipoCalendario: string, fechaInicio: Date, intervaloRepeticion: string, fechaFin: Date){
        this.propietario = propietario;
        this.nombre = nombre;
        this.clase = nombre;
        this.comentarios = comentarios;
        this.habilitado = habilitado;
        this.nombreCredencial = nombreCredencial;
        this.destino = destino;
        this.nombrePrograma = nombrePrograma;
        this.tipo = tipo;
        this.accion = accion;
        this.numeroArgumentos = numeroArgumentos;
        this.propietarioCalendario = propietarioCalendario;
        this.nombreCalendario = nombreCalendario;
        this.tipoCalendario = tipoCalendario;
        this.fechaInicio = fechaInicio;
        this.intervaloRepeticion = intervaloRepeticion;
        this.fechaFin = fechaFin;
    }
}
