import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PermisoColumna } from 'src/app/common/permiso-columna';
import { ColumnasPermisosService } from 'src/app/services/permisos_usuario/columnas-permisos.service';

@Component({
  selector: 'app-columnas-permisos',
  templateUrl: './columnas-permisos.component.html',
  styleUrls: ['./columnas-permisos.component.css']
})
export class ColumnasPermisosComponent implements OnInit {
  
  columnas: PermisoColumna[] = []

  constructor(private activateRoute: ActivatedRoute, private columnasPermisosService: ColumnasPermisosService ) { }

  ngOnInit(): void {
    this.handlerColumnasPermisos();
  }

  handlerColumnasPermisos(): void{
    const otorgado = this.activateRoute.snapshot.paramMap.get('otorgado') as string;
    const nombreTabla = this.activateRoute.snapshot.paramMap.get('nombre-tabla') as string;
    this.columnasPermisosService.getColumnasTablasPermisos(otorgado, nombreTabla).subscribe(
      response => {
        this.columnas = response
      }
    );
  }

}
