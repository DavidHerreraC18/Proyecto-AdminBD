import { ColumnaId } from "./columna-id";

export class Columna {

    id: ColumnaId;

    tipoDato: string;
    constructor( id: ColumnaId, tipoDato: string ){
        this.id = id;
        this.tipoDato = tipoDato;
    }
}
