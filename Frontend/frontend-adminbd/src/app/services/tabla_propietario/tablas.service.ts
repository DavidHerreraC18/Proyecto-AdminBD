import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

import { Tabla } from 'src/app/common/tabla';
import { ComentarioTabla } from 'src/app/common/comentario-tabla';

@Injectable({
  providedIn: 'root'
})
export class TablasService {
  
  private urlBase = 'http://localhost:8080/';
  private pathTabla='tablas';
  private pathPropietario='propietario';
  private pathComentarios = 'comentarios/tabla';
 
  constructor(private httpClient: HttpClient) { }

  getTablasPropietario (propietario: string): Observable<Tabla[]> {
    return this.httpClient.get<Tabla[]>(this.urlBase+this.pathTabla+'/'+this.pathPropietario+'/'+propietario);
  }

  getComentarioTabla(nombreTabla: string): Observable<ComentarioTabla>{
    return this.httpClient.get<ComentarioTabla>(this.urlBase+this.pathComentarios+'/'+nombreTabla);
  }
  
}
