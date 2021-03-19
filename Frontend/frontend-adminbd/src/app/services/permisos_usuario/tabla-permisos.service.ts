import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PermisoTabla } from 'src/app/common/permiso-tabla';

@Injectable({
  providedIn: 'root'
})
export class TablaPermisosService {
  
  private urlBase = 'http://localhost:8080/permisos/';
  private pathTabla='tabla';

  constructor(private httpClient: HttpClient) { }

  getTablasPermisos(otorgado: string): Observable<PermisoTabla[]>{
    return this.httpClient.get<PermisoTabla[]>(this.urlBase+this.pathTabla+'/'+otorgado);
  }
  
}
