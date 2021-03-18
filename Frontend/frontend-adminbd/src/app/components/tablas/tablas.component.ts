import { Component, OnInit } from '@angular/core';
<<<<<<< Updated upstream
import { ActivatedRoute } from '@angular/router';
import { Tabla } from 'src/app/common/tabla';
import { TablasService } from 'src/app/services/tablas.service';
=======
>>>>>>> Stashed changes

@Component({
  selector: 'app-tablas',
  templateUrl: './tablas.component.html',
  styleUrls: ['./tablas.component.css']
})
export class TablasComponent implements OnInit {

<<<<<<< Updated upstream
  tablas: Tabla [] = [];

  constructor(private activeRoute: ActivatedRoute, private tablasService: TablasService) { }

  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe(()=>{
      this.handlerTablasPropietario();
    })
  }

  handlerTablasPropietario(): void{
    const param = this.activeRoute.snapshot.paramMap.get('propietario') as string;
    this.tablasService.getTablasPropietario(param);
=======
  constructor() { }

  ngOnInit(): void {
>>>>>>> Stashed changes
  }

}
