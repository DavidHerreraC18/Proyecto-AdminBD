import { Component, OnInit } from '@angular/core';
import { ComentarioTabla } from 'src/app/common/comentario-tabla';
import { Tabla } from 'src/app/common/tabla';
import { Usuario } from 'src/app/common/usuario';
import { TablasService } from 'src/app/services/tabla_propietario/tablas.service';
import { UsuariosService } from 'src/app/services/usuarios.service';




@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {

  usuarios : Usuario[] = [];

  tablas: Tabla [] = [];

  comentarios: ComentarioTabla [] = [];
 
  constructor(private usuarioServicio: UsuariosService, private tablasService: TablasService) { }

  ngOnInit(): void {  
    this.handleListaUsuarios();
    
   }

  handleListaUsuarios(){
    this.usuarioServicio.getUsuarios().subscribe(
      response => {
          this.usuarios = response;
      }
    );
  }

  handlerTablasPropietario(propietario: string): void{
    this.tablasService.getTablasPropietario(propietario).subscribe(
      response => {
        this.tablas = response
      }
    );
    
    this.handlerComentariosTabla();
  }

  handlerComentariosTabla(): void {
    this.tablas.forEach(element => {
       this.tablasService.getComentarioTabla(element.nombre).subscribe(
          response => {
            this.comentarios.push(response);
          }
       )
    });
  }

}
