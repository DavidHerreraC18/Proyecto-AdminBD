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

  usuarios : Usuario[] = [new Usuario('jola')];

  tablas: Tabla [] = [];

  comentarios: ComentarioTabla [] = [];

  propietario: string = '';
 
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

  handlerTablasPropietario(): void{
    console.log(this.propietario);
    this.tablasService.getTablasPropietario(this.propietario).subscribe(
      response => {
        this.tablas = response
      }
    );
    console.log("wahooo");
    this.handlerComentariosTabla();
  }

  handlerComentariosTabla(): void {
    this.tablas.forEach(element => {
       this.tablasService.getComentarioTabla(element.nombre).subscribe(
          response => {
            console.log(response.comentario);
            this.comentarios.push(response);
          }
       )
    });
  }

}
