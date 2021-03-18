import { PermisoColumnaId } from "./permiso-columna-id";

export class PermisoColumna {
    id: PermisoColumnaId;
    propietario: string;

    constructor(id: PermisoColumnaId, propietario: string){
        this.id=id ;
        this.propietario = propietario;
    }
}
