import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EspacioTotal } from 'src/app/common/espacio-total';
import { EspacioUsado } from 'src/app/common/espacio-usado';
import { Tablespace } from 'src/app/common/tablespace';

@Injectable({
  providedIn: 'root'
})
export class TablespacesService {
  
  private urlBase = 'http://localhost:8080/espacio/';
  private pathUsado='usado';
  private pathTotal='total';

  constructor(private httpClient: HttpClient) { }
  
  getEspacioTotal(): Observable<EspacioTotal[]>{
     const urlEspacioTotal = this.urlBase + this.pathTotal;
     return this.httpClient.get<EspacioTotal[]>(urlEspacioTotal);
  }
  
  getEspacioUsado(): Observable<EspacioUsado[]>{
    const urlEspacioUsado = this.urlBase + this.pathUsado;
    return this.httpClient.get<EspacioUsado[]>(urlEspacioUsado);
  }

  getEspacioLibre(): void {
   
  }

}
