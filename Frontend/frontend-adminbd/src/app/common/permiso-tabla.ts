import { PermisoTablaId } from "./permiso-tabla-id";

export class PermisoTabla {

    id: PermisoTablaId;

    propietario: string;

    constructor(id: PermisoTablaId, propietario: string){
        this.id = id;
        this.propietario = propietario;
    }

}
