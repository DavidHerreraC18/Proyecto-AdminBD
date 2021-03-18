import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import {
  HttpClient,
  HttpErrorResponse,
  HttpHeaders,
} from '@angular/common/http';
import { catchError } from 'rxjs/operators';
import { map } from 'rxjs/operators';
import { Tabla } from '../common/tabla';

@Injectable({
  providedIn: 'root'
})
export class TablasService {

  private urlBase = 'http://localhost:8080/tablas';

  constructor(private httpClient: HttpClient) { }

  getTablasPropietario (propietario: string): Observable<Tabla[]> {
    return this.httpClient.get<Tabla[]>(this.urlBase+'/'+propietario);
  }
  
}
