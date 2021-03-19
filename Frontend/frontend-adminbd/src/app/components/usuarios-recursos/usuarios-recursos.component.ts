import { Component, OnInit } from '@angular/core';
import { Objeto } from 'src/app/common/objeto';
import { UsuariosRecursosService } from 'src/app/services/usuarios_recursos/usuarios-recursos.service';

@Component({
  selector: 'app-usuarios-recursos',
  templateUrl: './usuarios-recursos.component.html',
  styleUrls: ['./usuarios-recursos.component.css']
})
export class UsuariosRecursosComponent implements OnInit {
  
  procedimientos: Objeto[] = [];
  funciones: Objeto[] = [];
  paquetes: Objeto[] = [];
  
  propietario: string = '';

  constructor(private usuariosRecursosService: UsuariosRecursosService) { }

  ngOnInit(): void {
    
  }

  buscarRecursosUsuario(propietario: string): void {
    console.log(propietario);
    this.usuariosRecursosService.getProcedimientos(propietario).subscribe(
      response => {
        this.procedimientos = response
      }
    );
    this.usuariosRecursosService.getFunciones(propietario).subscribe(
      response => {
        this.funciones = response
      }
    );
    this.usuariosRecursosService.getPaquetes(propietario).subscribe(
      response => {
        this.paquetes = response
      }
    );
  }

}
