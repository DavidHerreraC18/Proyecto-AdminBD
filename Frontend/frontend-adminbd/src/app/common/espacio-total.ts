
export class EspacioTotal {

    nombreTablespace: string;

    bytes: BigInt;

    constructor(nombreTablespace: string, bytes: BigInt){
        this.nombreTablespace = nombreTablespace;
        this.bytes = bytes;
    }
}
