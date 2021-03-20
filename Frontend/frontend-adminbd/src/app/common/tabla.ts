import { Restriccion } from "./restriccion";

export class Tabla {

    propietario: string;

    nombre: string;

    comentarios: string[];

    restricciones: string[];

    constructor(propietario: string, nombre: string,comentarios:string[], restricciones: string[]) {
        this.propietario = propietario;
        this.nombre = nombre;
        this.comentarios = comentarios;
        this.restricciones = restricciones;
     }
}

