import { ObjetoId } from "./objeto-id";

export class Objeto {

    id: ObjetoId;

    estado: string;

    constructor(id: ObjetoId,estado: string){
        this.id = id;
        this.estado = estado;
    }
}
