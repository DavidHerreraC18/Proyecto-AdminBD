import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../common/usuario';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {
  
  private urlBase = 'http://localhost:8082';

  constructor(private httpClient: HttpClient) { }

  getUsuarios (): Observable<Usuario[]> {
      return this.httpClient.get<GetResponseUsuarios>(this.urlBase).pipe(
              map( response => response._embedded.usuarios  ));
  }

}

interface GetResponseUsuarios{
  _embedded:{
    usuarios: Usuario []
  }
}

