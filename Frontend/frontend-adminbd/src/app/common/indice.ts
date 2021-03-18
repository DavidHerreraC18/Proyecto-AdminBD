import { IndiceId } from "./indice-id";

export class Indice {

    id: IndiceId;

    nombreIndice: string;

    constructor(id: IndiceId, nombreIndice: string){
        this.id = id;
        this.nombreIndice = nombreIndice;
    }

}
