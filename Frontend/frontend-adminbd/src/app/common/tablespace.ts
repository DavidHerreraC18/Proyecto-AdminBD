import { EspacioTotal } from "./espacio-total";
import { EspacioUsado } from "./espacio-usado";

export class Tablespace {
    nombre:       string;
    espacioTotal: EspacioTotal;
    espacioUsado: EspacioUsado;
    espacioLibre: BigInt;
    
    constructor(nombre: string, espacioTotal: EspacioTotal, 
                espacioUsado: EspacioUsado, espacioLibre: BigInt){
    
    this.nombre       = nombre;
    this.espacioTotal = espacioTotal;
    this.espacioUsado = espacioUsado;
    this.espacioLibre = espacioLibre;
    
    }
}
