import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PermisoTabla } from 'src/app/common/permiso-tabla';
import { PermisoTablaId } from 'src/app/common/permiso-tabla-id';
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
  
  constructor(private tablaPermisosService: TablaPermisosService, private router: Router) { }

  ngOnInit(): void {
    
  }

  buscarTablasPermisosUsuario(): void{
    this.tablaPermisosService.getTablasPermisos(this.otorgado).subscribe(
      response => {
        this.tablas = response
      }
    );
  }

  mostrarColumnas(nombreTabla: string){
    console.log(nombreTabla+this.otorgado);
     this.router.navigate(['/columnas-permisos/'+this.otorgado+'/'+nombreTabla]);
  }


}
