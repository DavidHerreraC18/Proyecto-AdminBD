import { Component, OnInit } from '@angular/core';
import { PermisoTabla } from 'src/app/common/permiso-tabla';
import { ColumnasPermisosService } from 'src/app/services/permisos_usuario/columnas-permisos.service';
import { TablaPermisosService } from 'src/app/services/permisos_usuario/tabla-permisos.service';

@Component({
  selector: 'app-permisos-usuarios',
  templateUrl: './permisos-usuarios.component.html',
  styleUrls: ['./permisos-usuarios.component.css']
})
export class PermisosUsuariosComponent implements OnInit {
  
  tablas: PermisoTabla[] = [];
  otorgado: string = '';

  constructor(private tablaPermisosService: TablaPermisosService) { }

  ngOnInit(): void {

  }

  buscarTablasPermisosUsuario(otorgado: string): void{
    this.tablaPermisosService.getTablasPermisos(otorgado).subscribe(
      response => {
        this.tablas = response
      }
    );
  }


}
