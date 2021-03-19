import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tablespace } from 'src/app/common/tablespace';

@Injectable({
  providedIn: 'root'
})
export class TablespacesService {
  
  private urlBase = 'http://localhost:8080/espacio/';
  private pathTablespaces='tablespaces';
 
  constructor(private httpClient: HttpClient) { }
  
  getTablespaces(): Observable<Tablespace[]> {
    const urlEspacioUsado = this.urlBase + this.pathTablespaces;
    return this.httpClient.get<Tablespace[]>(urlEspacioUsado);
  }

}
