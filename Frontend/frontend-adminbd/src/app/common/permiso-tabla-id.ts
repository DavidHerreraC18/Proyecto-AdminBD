export class PermisoTablaId {

    nombreTabla: string;

    privilegio: string;

    otorgado: string;

    constructor(nombreTabla: string, privilegio: string, otorgado: string){
        this.nombreTabla = nombreTabla;
        this.privilegio = privilegio;
        this.otorgado = otorgado;
    }

}
