import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../common/usuario';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UsuariosService {
  
  private urlBase = 'http://localhost:8080/usuarios';

  constructor(private httpClient: HttpClient) { }

  getUsuarios (): Observable<Usuario[]> {
    return this.httpClient.get<Usuario[]>(this.urlBase);
  }

}

