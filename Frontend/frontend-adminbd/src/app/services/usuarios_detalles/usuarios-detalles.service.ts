import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EspacioUsuario } from 'src/app/common/espacio-usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuariosDetallesService {

  private urlBase = 'http://localhost:8080/espacio/';
  private pathEspacioUsuario='usuarios/espacio-usado';
 
  constructor(private httpClient: HttpClient) { }
  
  getEspacioUsuario(): Observable<EspacioUsuario[]> {
    const urlEspacioUsado = this.urlBase + this.pathEspacioUsuario;
    return this.httpClient.get<EspacioUsuario[]>(urlEspacioUsado);
  }
}
