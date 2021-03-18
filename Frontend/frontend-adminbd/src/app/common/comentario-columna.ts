import { ComentarioColumnaId } from "./comentario-columna-id";

export class ComentarioColumna {
    id: ComentarioColumnaId;

    comentario: string;

    constructor(id: ComentarioColumnaId, comentario: string){
        this.id = id;
        this.comentario = comentario;
    }
}
