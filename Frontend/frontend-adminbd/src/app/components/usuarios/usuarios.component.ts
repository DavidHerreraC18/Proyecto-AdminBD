import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/common/usuario';
import { UsuariosService } from 'src/app/services/usuarios.service';




@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {

  usuarios : Usuario[] = [];

  constructor(private usuarioServicio: UsuariosService) { }

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



}
