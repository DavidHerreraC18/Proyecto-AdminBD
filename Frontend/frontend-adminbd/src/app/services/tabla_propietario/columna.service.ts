import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Columna } from 'src/app/common/columna';
import { ComentarioColumna } from 'src/app/common/comentario-columna';
import { Indice } from 'src/app/common/indice';

@Injectable({
  providedIn: 'root'
})
export class ColumnaService {
  
  private urlBase = 'http://localhost:8080/';
  private pathColumnas = 'columnas';
  private pathComentarios = 'comentarios/columna';
  private pathIndices = 'indices';

  constructor(private httpClient: HttpClient) { }

  getColumnasTabla(nombreTabla: string): Observable<Columna[]>{
    return this.httpClient.get<Columna[]>(this.urlBase+this.pathColumnas+'/'+nombreTabla);

  }

  getComentariosColumna(nombreTabla: string): Observable<ComentarioColumna[]>{
    return this.httpClient.get<ComentarioColumna[]>(this.urlBase+this.pathComentarios+'/'+nombreTabla);
  }

  getIndicesColumna(nombreTabla: string, nombreColumnas: string): Observable<Indice[]>{
    return this.httpClient.get<Indice[]>(this.urlBase+this.pathColumnas+this.pathIndices+
                                         '/'+nombreTabla+'/'+nombreColumnas);

  }

}
