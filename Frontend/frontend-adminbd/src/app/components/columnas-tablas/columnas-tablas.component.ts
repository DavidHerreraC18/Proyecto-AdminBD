import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Columna } from 'src/app/common/columna';
import { ComentarioColumna } from 'src/app/common/comentario-columna';
import { Indice } from 'src/app/common/indice';
import { ColumnaService } from 'src/app/services/tabla_propietario/columna.service';

@Component({
  selector: 'app-columnas-tablas',
  templateUrl: './columnas-tablas.component.html',
  styleUrls: ['./columnas-tablas.component.css']
})
export class ColumnasTablasComponent implements OnInit {
  
  columnas : Columna[] = [];
  comentarios: ComentarioColumna[] = [];
  indices : Indice[][] = [];
  

  constructor(private activeRoute: ActivatedRoute, private columnasService : ColumnaService) { }

  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe(()=>{
      this.handlerColumnasTabla();
    })
  }

  handlerColumnasTabla(): void{
    const nombreTabla = this.activeRoute.snapshot.paramMap.get('nombre-tabla') as string;
    this.columnasService.getColumnasTabla(nombreTabla).subscribe(
      response => {
        this.columnas = response
      }
    );
    
    //this.handlerComentariosColumnas(nombreTabla);
  }
  /*
  handlerComentariosColumnas(nombreTabla: string): void {
    this.columnasService.getComentariosColumna(nombreTabla).subscribe(
      response => {
        this.comentarios = response
      }
    );

    this.handlerIndicesColumnas(nombreTabla);
  }
  
  handlerIndicesColumnas(nombreTabla: string): void {  
    this.columnas.forEach(columna => {
      this.columnasService.getIndicesColumna(nombreTabla, columna.id.nombreColumna).subscribe(
        response => {
          this.indices.push(response)
        }
      );
    });

  }*/


}
