export class Tablespace {
    tablespace: string;
    usado: number;
    libre: number;
    
    constructor(tablespace: string, 
                usado: number, libre: number){
    
    this.tablespace = tablespace;
    this.usado      = usado;
    this.libre      = libre;
    
    }
}
