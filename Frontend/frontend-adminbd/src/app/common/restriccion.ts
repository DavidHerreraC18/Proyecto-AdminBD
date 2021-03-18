import { RestriccionId } from "./restriccion-id";

export class Restriccion {

    id: RestriccionId;

    restriccion: string;

    constructor(id: RestriccionId, restriccion: string){
        this.id = id;
        this.restriccion = restriccion;
    }
}
