import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { Usuario } from '../common/usuario';
import {
  HttpClient,
  HttpErrorResponse,
  HttpHeaders,
} from '@angular/common/http';
import { catchError } from 'rxjs/operators';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {
  
  private urlBase = 'http://localhost:8080/usuarios';

  private handleError(error: HttpErrorResponse) {
    return throwError('An error has ocurred');
  }


  constructor(private httpClient: HttpClient) { }

  private get<T>(url: string): Observable<T> {
    console.log('get:', url);
    return this.httpClient
      .get<T>(url, {
        headers: new HttpHeaders({
          'Content-Type': 'application/json',
          'Accept:': 'application/json',
        }),
      })
      .pipe(catchError(this.handleError));
  }

  getUsuarios (): Observable<Usuario[]> {
    //return this.httpClient.get<GetResponseUsuarios>(this.urlBase).pipe(
    //          map( response => response._data.usuarios  ));
    return this.httpClient.get<Usuario[]>(this.urlBase);
  }

}

interface GetResponseUsuarios{
  _data:{
    usuarios: Usuario []
  }
}

