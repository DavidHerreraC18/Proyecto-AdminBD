import { ColumnaId } from "./columna-id";

export class Columna {

    nombreTabla: string;

    nombreColumna: string;

    tipoDato: string;

    comentarios: string[];

    indices: string[];
    constructor( nombreTabla: string, nombreColumna:string, tipoDato: string, comentarios: string[], indices: string[]){
        this.nombreTabla = nombreTabla;
        this.nombreColumna = nombreColumna;
        this.tipoDato = tipoDato;
        this.comentarios = comentarios;
        this.indices = indices;
    }
}
