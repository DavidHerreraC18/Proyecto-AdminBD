import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PermisoColumna } from 'src/app/common/permiso-columna';

@Injectable({
  providedIn: 'root'
})
export class ColumnasPermisosService {
  
  private urlBase = 'http://localhost:8080/permisos/';
  private pathColumna='columna';

  constructor(private httpClient: HttpClient) { }

  getColumnasTablasPermisos(otorgado: string, nombreTabla: string): Observable<PermisoColumna[]>{
    return this.httpClient.get<PermisoColumna[]>(this.urlBase+this.pathColumna+'/'+otorgado+'/'+nombreTabla);
  }

  getPermisosColumnasTablasPermisos(otorgado: string, nombreTabla: string, nombreColumna: string){
    const urlPermisosColumna = this.urlBase+this.pathColumna+'/'+otorgado+'/'+nombreTabla+'/'+nombreColumna;
    return this.httpClient.get<PermisoColumna[]>(urlPermisosColumna);
  }
  
}
