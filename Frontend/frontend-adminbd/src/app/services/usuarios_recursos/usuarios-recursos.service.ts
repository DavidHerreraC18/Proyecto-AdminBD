import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Objeto } from 'src/app/common/objeto';

@Injectable({
  providedIn: 'root'
})
export class UsuariosRecursosService {
  
  private urlBase = 'http://localhost:8080/objetos/';
  private pathProcedimientos ='procedures';
  private pathFunciones ='functions';
  private pathPaquetes ='packages';
 
  constructor(private httpClient: HttpClient) { }
  
  getProcedimientos(propietario: string): Observable<Objeto[]>{
    const urlProcedimientos = this.urlBase+this.pathProcedimientos+'/'+propietario;
    return this.httpClient.get<Objeto[]>(urlProcedimientos);
  }

  getFunciones(propietario: string): Observable<Objeto[]>{
    const urlFunciones = this.urlBase+this.pathFunciones+'/'+propietario;
    return this.httpClient.get<Objeto[]>(urlFunciones);
  }

  getPaquetes(propietario: string): Observable<Objeto[]>{
    const urlPaquetes = this.urlBase+this.pathPaquetes+'/'+propietario;
    return this.httpClient.get<Objeto[]>(urlPaquetes);
  }

}
