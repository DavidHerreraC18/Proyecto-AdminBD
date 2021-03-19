import { Component, OnInit } from '@angular/core';
import { EspacioUsuario } from 'src/app/common/espacio-usuario';
import { UsuariosDetallesService } from 'src/app/services/usuarios_detalles/usuarios-detalles.service';

@Component({
  selector: 'app-usuarios-detalles',
  templateUrl: './usuarios-detalles.component.html',
  styleUrls: ['./usuarios-detalles.component.css']
})
export class UsuariosDetallesComponent implements OnInit {

  usuariosDetalle : EspacioUsuario [] = []

  constructor(private tablespacesService: UsuariosDetallesService) { }

  ngOnInit(): void {
    this.handlerUsuarioDetalle();
  }

  handlerUsuarioDetalle(){
    this.tablespacesService.getEspacioUsuario().subscribe(
      response => {
        this.usuariosDetalle = response
      }
    );
  }
}
