export class EspacioUsado {

    nombreTablespace: string;

    propietario: string;

    bytes: BigInt;

    constructor(nombreTablespace: string ,propietario: string, bytes: BigInt){
        this.nombreTablespace = nombreTablespace;
        this.propietario = propietario;
        this.bytes = bytes;
    }
}
