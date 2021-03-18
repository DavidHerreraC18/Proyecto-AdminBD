export class PermisoColumnaId {

    privilegio: string;

    nombreTabla: string;

    nombreColumna: string;

    otorgado: string;

    constructor(privilegio: string, nombreTabla: string, nombreColumna: string, otorgado: string){
        this.privilegio = privilegio;
        this.nombreTabla = nombreTabla;
        this.nombreColumna = nombreColumna;
        this.otorgado = otorgado;
    }
}
