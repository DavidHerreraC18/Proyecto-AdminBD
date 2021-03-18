export class RestriccionId {
    nombreTabla: string;

    nombreRestriccion: string;

    propietario: string;

    constructor(nombreTabla: string, nombreRestriccion: string, propietario: string)
    {
        this.nombreTabla = nombreTabla;
        this.nombreRestriccion = nombreRestriccion;
        this.propietario = propietario;
    }
}
