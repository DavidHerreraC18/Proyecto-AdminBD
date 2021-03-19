import { Component, OnInit } from '@angular/core';
import { Objeto } from 'src/app/common/objeto';

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

  constructor() { }

  ngOnInit(): void {
  }

  buscarRecursosUsuario(): void {
   
  }

}
